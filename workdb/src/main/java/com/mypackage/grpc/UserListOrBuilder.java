// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserServiceGrpc.proto

// Protobuf Java Version: 3.25.0-rc2
package com.mypackage.grpc;

public interface UserListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.mypackage.grpc.UserList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.mypackage.grpc.User users = 1;</code>
   */
  java.util.List<com.mypackage.grpc.User> 
      getUsersList();
  /**
   * <code>repeated .com.mypackage.grpc.User users = 1;</code>
   */
  com.mypackage.grpc.User getUsers(int index);
  /**
   * <code>repeated .com.mypackage.grpc.User users = 1;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .com.mypackage.grpc.User users = 1;</code>
   */
  java.util.List<? extends com.mypackage.grpc.UserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .com.mypackage.grpc.User users = 1;</code>
   */
  com.mypackage.grpc.UserOrBuilder getUsersOrBuilder(
      int index);
}
