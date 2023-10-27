package com.mypackage;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.mypackage.grpc.*;

public class UserClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(channel);

        // Пример вызова метода getAllUsers
        google.protobuf.Empty empty = google.protobuf.Empty.getDefaultInstance();
        UserList userList = blockingStub.getAllUsers(empty);

        for (User user : userList.getUsersList()) {
            System.out.println("User ID: " + user.getId());
            System.out.println("User Name: " + user.getName());
            System.out.println("User Members: " + user.getMembers());
            System.out.println("User Age: " + user.getAge());
            System.out.println();
        }

        channel.shutdown();
    }
}