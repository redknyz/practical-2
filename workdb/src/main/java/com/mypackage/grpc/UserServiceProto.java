// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserServiceGrpc.proto

// Protobuf Java Version: 3.25.0-rc2
package com.mypackage.grpc;

public final class UserServiceProto {
  private UserServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mypackage_grpc_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mypackage_grpc_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mypackage_grpc_UserList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mypackage_grpc_UserList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025UserServiceGrpc.proto\022\022com.mypackage.g" +
      "rpc\032\033google/protobuf/empty.proto\">\n\004User" +
      "\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\017\n\007members\030\003 " +
      "\001(\005\022\013\n\003age\030\004 \001(\005\"3\n\010UserList\022\'\n\005users\030\001 " +
      "\003(\0132\030.com.mypackage.grpc.User2R\n\013UserSer" +
      "vice\022C\n\013getAllUsers\022\026.google.protobuf.Em" +
      "pty\032\034.com.mypackage.grpc.UserListB(\n\022com" +
      ".mypackage.grpcB\020UserServiceProtoP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_com_mypackage_grpc_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_mypackage_grpc_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mypackage_grpc_User_descriptor,
        new java.lang.String[] { "Id", "Name", "Members", "Age", });
    internal_static_com_mypackage_grpc_UserList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_mypackage_grpc_UserList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mypackage_grpc_UserList_descriptor,
        new java.lang.String[] { "Users", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}