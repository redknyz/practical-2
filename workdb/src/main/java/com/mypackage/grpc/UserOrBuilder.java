// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserServiceGrpc.proto

// Protobuf Java Version: 3.25.0-rc2
package com.mypackage.grpc;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.mypackage.grpc.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 members = 3;</code>
   * @return The members.
   */
  int getMembers();

  /**
   * <code>int32 age = 4;</code>
   * @return The age.
   */
  int getAge();
}
