// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

public interface GetForwardedResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.GetForwardedResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.IssueReceiptRequest issue_receipt = 1;</code>
   */
  boolean hasIssueReceipt();
  /**
   * <code>.api.IssueReceiptRequest issue_receipt = 1;</code>
   */
  io.grpc.bverify.IssueReceiptRequest getIssueReceipt();
  /**
   * <code>.api.IssueReceiptRequest issue_receipt = 1;</code>
   */
  io.grpc.bverify.IssueReceiptRequestOrBuilder getIssueReceiptOrBuilder();

  /**
   * <code>.api.TransferReceiptRequest transfer_receipt = 2;</code>
   */
  boolean hasTransferReceipt();
  /**
   * <code>.api.TransferReceiptRequest transfer_receipt = 2;</code>
   */
  io.grpc.bverify.TransferReceiptRequest getTransferReceipt();
  /**
   * <code>.api.TransferReceiptRequest transfer_receipt = 2;</code>
   */
  io.grpc.bverify.TransferReceiptRequestOrBuilder getTransferReceiptOrBuilder();

  public io.grpc.bverify.GetForwardedResponse.RequestCase getRequestCase();
}
