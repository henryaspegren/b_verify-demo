// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

public final class Api {
  private Api() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_ForwardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_ForwardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_ForwardResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_ForwardResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_GetForwardedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_GetForwardedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_GetForwardedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_GetForwardedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_SubmitRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_SubmitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_SubmitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_SubmitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_DataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_DataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_DataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_DataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_PathRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_PathRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_PathResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_PathResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_CommitmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_CommitmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_CommitmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_CommitmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_IssueReceiptRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_IssueReceiptRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_TransferReceiptRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_TransferReceiptRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_Receipt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_Receipt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020protos/api.proto\022\003api\032\020protos/mpt.prot" +
      "o\"\236\001\n\016ForwardRequest\0221\n\rissue_receipt\030\001 " +
      "\001(\0132\030.api.IssueReceiptRequestH\000\0227\n\020trans" +
      "fer_receipt\030\002 \001(\0132\033.api.TransferReceiptR" +
      "equestH\000\022\025\n\rforward_to_id\030\003 \001(\tB\t\n\007reque" +
      "st\" \n\017ForwardResponse\022\r\n\005added\030\001 \001(\010\"!\n\023" +
      "GetForwardedRequest\022\n\n\002id\030\001 \001(\t\"\215\001\n\024GetF" +
      "orwardedResponse\0221\n\rissue_receipt\030\001 \001(\0132" +
      "\030.api.IssueReceiptRequestH\000\0227\n\020transfer_" +
      "receipt\030\002 \001(\0132\033.api.TransferReceiptReque" +
      "stH\000B\t\n\007request\"\206\001\n\rSubmitRequest\0221\n\riss" +
      "ue_receipt\030\001 \001(\0132\030.api.IssueReceiptReque" +
      "stH\000\0227\n\020transfer_receipt\030\002 \001(\0132\033.api.Tra" +
      "nsferReceiptRequestH\000B\t\n\007request\"\"\n\016Subm" +
      "itResponse\022\020\n\010accepted\030\001 \001(\010\"6\n\013DataRequ" +
      "est\022\r\n\005adsId\030\001 \001(\014\022\030\n\020commitmentNumber\030\002" +
      " \001(\005\".\n\014DataResponse\022\036\n\010receipts\030\001 \003(\0132\014" +
      ".api.Receipt\"7\n\013PathRequest\022\016\n\006adsIds\030\001 " +
      "\003(\014\022\030\n\020commitmentNumber\030\002 \001(\005\"G\n\014PathRes" +
      "ponse\0227\n\004path\030\001 \001(\0132).serialization.gene" +
      "rated.MerklePrefixTrie\"\024\n\022CommitmentsReq" +
      "uest\"*\n\023CommitmentsResponse\022\023\n\013commitmen" +
      "ts\030\001 \003(\014\"n\n\023IssueReceiptRequest\022\035\n\007recei" +
      "pt\030\001 \001(\0132\014.api.Receipt\022\033\n\023signature_ware" +
      "house\030\002 \001(\014\022\033\n\023signature_depositor\030\003 \001(\014" +
      "\"\353\001\n\026TransferReceiptRequest\022\035\n\007receipt\030\001" +
      " \001(\0132\014.api.Receipt\022\030\n\020current_owner_id\030\002" +
      " \001(\t\022\024\n\014new_owner_id\030\003 \001(\t\022#\n\033signature_" +
      "warehouse_current\030\004 \001(\014\022\037\n\027signature_cur" +
      "rent_owner\030\005 \001(\014\022\037\n\027signature_warehouse_" +
      "new\030\006 \001(\014\022\033\n\023signature_new_owner\030\007 \001(\014\"\316" +
      "\001\n\007Receipt\022\024\n\014warehouse_id\030\001 \001(\t\022\024\n\014depo" +
      "sitor_id\030\002 \001(\t\022\022\n\naccountant\030\003 \001(\t\022\020\n\010ca" +
      "tegory\030\004 \001(\t\022\014\n\004date\030\005 \001(\t\022\021\n\tinsurance\030" +
      "\006 \001(\t\022\016\n\006weight\030\007 \001(\001\022\016\n\006volume\030\010 \001(\001\022\020\n" +
      "\010humidity\030\t \001(\001\022\r\n\005price\030\n \001(\001\022\017\n\007detail" +
      "s\030\013 \001(\t2\374\002\n\020BVerifyServerAPI\0226\n\007Forward\022" +
      "\023.api.ForwardRequest\032\024.api.ForwardRespon" +
      "se\"\000\022E\n\014GetForwarded\022\030.api.GetForwardedR" +
      "equest\032\031.api.GetForwardedResponse\"\000\0223\n\006S" +
      "ubmit\022\022.api.SubmitRequest\032\023.api.SubmitRe" +
      "sponse\"\000\0227\n\016GetDataRequest\022\020.api.DataReq" +
      "uest\032\021.api.DataResponse\"\000\0224\n\013GetAuthPath" +
      "\022\020.api.PathRequest\032\021.api.PathResponse\"\000\022" +
      "E\n\016GetCommitments\022\027.api.CommitmentsReque" +
      "st\032\030.api.CommitmentsResponse\"\000B\023\n\017io.grp" +
      "c.bverifyP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          serialization.generated.MptSerialization.getDescriptor(),
        }, assigner);
    internal_static_api_ForwardRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_ForwardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_ForwardRequest_descriptor,
        new java.lang.String[] { "IssueReceipt", "TransferReceipt", "ForwardToId", "Request", });
    internal_static_api_ForwardResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_ForwardResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_ForwardResponse_descriptor,
        new java.lang.String[] { "Added", });
    internal_static_api_GetForwardedRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_GetForwardedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_GetForwardedRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_api_GetForwardedResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_GetForwardedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_GetForwardedResponse_descriptor,
        new java.lang.String[] { "IssueReceipt", "TransferReceipt", "Request", });
    internal_static_api_SubmitRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_SubmitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_SubmitRequest_descriptor,
        new java.lang.String[] { "IssueReceipt", "TransferReceipt", "Request", });
    internal_static_api_SubmitResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_SubmitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_SubmitResponse_descriptor,
        new java.lang.String[] { "Accepted", });
    internal_static_api_DataRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_DataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_DataRequest_descriptor,
        new java.lang.String[] { "AdsId", "CommitmentNumber", });
    internal_static_api_DataResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_DataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_DataResponse_descriptor,
        new java.lang.String[] { "Receipts", });
    internal_static_api_PathRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_PathRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_PathRequest_descriptor,
        new java.lang.String[] { "AdsIds", "CommitmentNumber", });
    internal_static_api_PathResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_PathResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_PathResponse_descriptor,
        new java.lang.String[] { "Path", });
    internal_static_api_CommitmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_CommitmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_CommitmentsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_CommitmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_CommitmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_CommitmentsResponse_descriptor,
        new java.lang.String[] { "Commitments", });
    internal_static_api_IssueReceiptRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_IssueReceiptRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_IssueReceiptRequest_descriptor,
        new java.lang.String[] { "Receipt", "SignatureWarehouse", "SignatureDepositor", });
    internal_static_api_TransferReceiptRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_TransferReceiptRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_TransferReceiptRequest_descriptor,
        new java.lang.String[] { "Receipt", "CurrentOwnerId", "NewOwnerId", "SignatureWarehouseCurrent", "SignatureCurrentOwner", "SignatureWarehouseNew", "SignatureNewOwner", });
    internal_static_api_Receipt_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_Receipt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_Receipt_descriptor,
        new java.lang.String[] { "WarehouseId", "DepositorId", "Accountant", "Category", "Date", "Insurance", "Weight", "Volume", "Humidity", "Price", "Details", });
    serialization.generated.MptSerialization.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
