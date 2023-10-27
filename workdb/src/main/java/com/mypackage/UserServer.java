
package com.mypackage;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Arrays;

public class UserServer {
    private Server server;

    public static void main(String[] args) throws IOException, InterruptedException {
        final UserServer userServer = new UserServer();
        userServer.start();
        userServer.blockUntilShutdown();
    }

    private void start() throws IOException {
        // Здесь укажите порт сервера
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new UserServiceImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    static class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
        @Override
        public void getAllUsers(Empty req, StreamObserver<UserList> responseObserver) {
            User user1 = User.newBuilder().setId(1).setName("User 1").setMembers(4).setAge(26).build();
            User user2 = User.newBuilder().setId(2).setName("User 2").setMembers(4).setAge(30).build();
            UserList response = UserList.newBuilder()
                    .addAllUsers(Arrays.asList(user1, user2))
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        // Имплементируйте остальные методы (Создание, удаление, обновление) здесь!

    }
}
