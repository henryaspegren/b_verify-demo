// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

/**
 * Protobuf type {@code api.IssueReceiptRequest}
 */
public  final class IssueReceiptRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.IssueReceiptRequest)
    IssueReceiptRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IssueReceiptRequest.newBuilder() to construct.
  private IssueReceiptRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IssueReceiptRequest() {
    issuerId_ = "";
    recepientId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IssueReceiptRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            issuerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            recepientId_ = s;
            break;
          }
          case 26: {
            io.grpc.bverify.Receipt.Builder subBuilder = null;
            if (receipt_ != null) {
              subBuilder = receipt_.toBuilder();
            }
            receipt_ = input.readMessage(io.grpc.bverify.Receipt.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(receipt_);
              receipt_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            io.grpc.bverify.Signature.Builder subBuilder = null;
            if (signature_ != null) {
              subBuilder = signature_.toBuilder();
            }
            signature_ = input.readMessage(io.grpc.bverify.Signature.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(signature_);
              signature_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.bverify.BVerifyAPI.internal_static_api_IssueReceiptRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.bverify.BVerifyAPI.internal_static_api_IssueReceiptRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.bverify.IssueReceiptRequest.class, io.grpc.bverify.IssueReceiptRequest.Builder.class);
  }

  public static final int ISSUER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object issuerId_;
  /**
   * <code>string issuer_id = 1;</code>
   */
  public java.lang.String getIssuerId() {
    java.lang.Object ref = issuerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      issuerId_ = s;
      return s;
    }
  }
  /**
   * <code>string issuer_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIssuerIdBytes() {
    java.lang.Object ref = issuerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      issuerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEPIENT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object recepientId_;
  /**
   * <code>string recepient_id = 2;</code>
   */
  public java.lang.String getRecepientId() {
    java.lang.Object ref = recepientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recepientId_ = s;
      return s;
    }
  }
  /**
   * <code>string recepient_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRecepientIdBytes() {
    java.lang.Object ref = recepientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recepientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIPT_FIELD_NUMBER = 3;
  private io.grpc.bverify.Receipt receipt_;
  /**
   * <code>.api.Receipt receipt = 3;</code>
   */
  public boolean hasReceipt() {
    return receipt_ != null;
  }
  /**
   * <code>.api.Receipt receipt = 3;</code>
   */
  public io.grpc.bverify.Receipt getReceipt() {
    return receipt_ == null ? io.grpc.bverify.Receipt.getDefaultInstance() : receipt_;
  }
  /**
   * <code>.api.Receipt receipt = 3;</code>
   */
  public io.grpc.bverify.ReceiptOrBuilder getReceiptOrBuilder() {
    return getReceipt();
  }

  public static final int SIGNATURE_FIELD_NUMBER = 4;
  private io.grpc.bverify.Signature signature_;
  /**
   * <code>.api.Signature signature = 4;</code>
   */
  public boolean hasSignature() {
    return signature_ != null;
  }
  /**
   * <code>.api.Signature signature = 4;</code>
   */
  public io.grpc.bverify.Signature getSignature() {
    return signature_ == null ? io.grpc.bverify.Signature.getDefaultInstance() : signature_;
  }
  /**
   * <code>.api.Signature signature = 4;</code>
   */
  public io.grpc.bverify.SignatureOrBuilder getSignatureOrBuilder() {
    return getSignature();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIssuerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, issuerId_);
    }
    if (!getRecepientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recepientId_);
    }
    if (receipt_ != null) {
      output.writeMessage(3, getReceipt());
    }
    if (signature_ != null) {
      output.writeMessage(4, getSignature());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIssuerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, issuerId_);
    }
    if (!getRecepientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recepientId_);
    }
    if (receipt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getReceipt());
    }
    if (signature_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSignature());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.bverify.IssueReceiptRequest)) {
      return super.equals(obj);
    }
    io.grpc.bverify.IssueReceiptRequest other = (io.grpc.bverify.IssueReceiptRequest) obj;

    boolean result = true;
    result = result && getIssuerId()
        .equals(other.getIssuerId());
    result = result && getRecepientId()
        .equals(other.getRecepientId());
    result = result && (hasReceipt() == other.hasReceipt());
    if (hasReceipt()) {
      result = result && getReceipt()
          .equals(other.getReceipt());
    }
    result = result && (hasSignature() == other.hasSignature());
    if (hasSignature()) {
      result = result && getSignature()
          .equals(other.getSignature());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ISSUER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIssuerId().hashCode();
    hash = (37 * hash) + RECEPIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRecepientId().hashCode();
    if (hasReceipt()) {
      hash = (37 * hash) + RECEIPT_FIELD_NUMBER;
      hash = (53 * hash) + getReceipt().hashCode();
    }
    if (hasSignature()) {
      hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getSignature().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.bverify.IssueReceiptRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.IssueReceiptRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.bverify.IssueReceiptRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.IssueReceiptRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.IssueReceiptRequest)
      io.grpc.bverify.IssueReceiptRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_IssueReceiptRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_IssueReceiptRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.bverify.IssueReceiptRequest.class, io.grpc.bverify.IssueReceiptRequest.Builder.class);
    }

    // Construct using io.grpc.bverify.IssueReceiptRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      issuerId_ = "";

      recepientId_ = "";

      if (receiptBuilder_ == null) {
        receipt_ = null;
      } else {
        receipt_ = null;
        receiptBuilder_ = null;
      }
      if (signatureBuilder_ == null) {
        signature_ = null;
      } else {
        signature_ = null;
        signatureBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_IssueReceiptRequest_descriptor;
    }

    public io.grpc.bverify.IssueReceiptRequest getDefaultInstanceForType() {
      return io.grpc.bverify.IssueReceiptRequest.getDefaultInstance();
    }

    public io.grpc.bverify.IssueReceiptRequest build() {
      io.grpc.bverify.IssueReceiptRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.bverify.IssueReceiptRequest buildPartial() {
      io.grpc.bverify.IssueReceiptRequest result = new io.grpc.bverify.IssueReceiptRequest(this);
      result.issuerId_ = issuerId_;
      result.recepientId_ = recepientId_;
      if (receiptBuilder_ == null) {
        result.receipt_ = receipt_;
      } else {
        result.receipt_ = receiptBuilder_.build();
      }
      if (signatureBuilder_ == null) {
        result.signature_ = signature_;
      } else {
        result.signature_ = signatureBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.bverify.IssueReceiptRequest) {
        return mergeFrom((io.grpc.bverify.IssueReceiptRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.bverify.IssueReceiptRequest other) {
      if (other == io.grpc.bverify.IssueReceiptRequest.getDefaultInstance()) return this;
      if (!other.getIssuerId().isEmpty()) {
        issuerId_ = other.issuerId_;
        onChanged();
      }
      if (!other.getRecepientId().isEmpty()) {
        recepientId_ = other.recepientId_;
        onChanged();
      }
      if (other.hasReceipt()) {
        mergeReceipt(other.getReceipt());
      }
      if (other.hasSignature()) {
        mergeSignature(other.getSignature());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.bverify.IssueReceiptRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.bverify.IssueReceiptRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object issuerId_ = "";
    /**
     * <code>string issuer_id = 1;</code>
     */
    public java.lang.String getIssuerId() {
      java.lang.Object ref = issuerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        issuerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string issuer_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIssuerIdBytes() {
      java.lang.Object ref = issuerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        issuerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string issuer_id = 1;</code>
     */
    public Builder setIssuerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      issuerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string issuer_id = 1;</code>
     */
    public Builder clearIssuerId() {
      
      issuerId_ = getDefaultInstance().getIssuerId();
      onChanged();
      return this;
    }
    /**
     * <code>string issuer_id = 1;</code>
     */
    public Builder setIssuerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      issuerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object recepientId_ = "";
    /**
     * <code>string recepient_id = 2;</code>
     */
    public java.lang.String getRecepientId() {
      java.lang.Object ref = recepientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recepientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recepient_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRecepientIdBytes() {
      java.lang.Object ref = recepientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recepientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recepient_id = 2;</code>
     */
    public Builder setRecepientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recepientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recepient_id = 2;</code>
     */
    public Builder clearRecepientId() {
      
      recepientId_ = getDefaultInstance().getRecepientId();
      onChanged();
      return this;
    }
    /**
     * <code>string recepient_id = 2;</code>
     */
    public Builder setRecepientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recepientId_ = value;
      onChanged();
      return this;
    }

    private io.grpc.bverify.Receipt receipt_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.Receipt, io.grpc.bverify.Receipt.Builder, io.grpc.bverify.ReceiptOrBuilder> receiptBuilder_;
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    public boolean hasReceipt() {
      return receiptBuilder_ != null || receipt_ != null;
    }
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    public io.grpc.bverify.Receipt getReceipt() {
      if (receiptBuilder_ == null) {
        return receipt_ == null ? io.grpc.bverify.Receipt.getDefaultInstance() : receipt_;
      } else {
        return receiptBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    public Builder setReceipt(io.grpc.bverify.Receipt value) {
      if (receiptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        receipt_ = value;
        onChanged();
      } else {
        receiptBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    public Builder setReceipt(
        io.grpc.bverify.Receipt.Builder builderForValue) {
      if (receiptBuilder_ == null) {
        receipt_ = builderForValue.build();
        onChanged();
      } else {
        receiptBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    public Builder mergeReceipt(io.grpc.bverify.Receipt value) {
      if (receiptBuilder_ == null) {
        if (receipt_ != null) {
          receipt_ =
            io.grpc.bverify.Receipt.newBuilder(receipt_).mergeFrom(value).buildPartial();
        } else {
          receipt_ = value;
        }
        onChanged();
      } else {
        receiptBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    public Builder clearReceipt() {
      if (receiptBuilder_ == null) {
        receipt_ = null;
        onChanged();
      } else {
        receipt_ = null;
        receiptBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    public io.grpc.bverify.Receipt.Builder getReceiptBuilder() {
      
      onChanged();
      return getReceiptFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    public io.grpc.bverify.ReceiptOrBuilder getReceiptOrBuilder() {
      if (receiptBuilder_ != null) {
        return receiptBuilder_.getMessageOrBuilder();
      } else {
        return receipt_ == null ?
            io.grpc.bverify.Receipt.getDefaultInstance() : receipt_;
      }
    }
    /**
     * <code>.api.Receipt receipt = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.Receipt, io.grpc.bverify.Receipt.Builder, io.grpc.bverify.ReceiptOrBuilder> 
        getReceiptFieldBuilder() {
      if (receiptBuilder_ == null) {
        receiptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.bverify.Receipt, io.grpc.bverify.Receipt.Builder, io.grpc.bverify.ReceiptOrBuilder>(
                getReceipt(),
                getParentForChildren(),
                isClean());
        receipt_ = null;
      }
      return receiptBuilder_;
    }

    private io.grpc.bverify.Signature signature_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.Signature, io.grpc.bverify.Signature.Builder, io.grpc.bverify.SignatureOrBuilder> signatureBuilder_;
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    public boolean hasSignature() {
      return signatureBuilder_ != null || signature_ != null;
    }
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    public io.grpc.bverify.Signature getSignature() {
      if (signatureBuilder_ == null) {
        return signature_ == null ? io.grpc.bverify.Signature.getDefaultInstance() : signature_;
      } else {
        return signatureBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    public Builder setSignature(io.grpc.bverify.Signature value) {
      if (signatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        signature_ = value;
        onChanged();
      } else {
        signatureBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    public Builder setSignature(
        io.grpc.bverify.Signature.Builder builderForValue) {
      if (signatureBuilder_ == null) {
        signature_ = builderForValue.build();
        onChanged();
      } else {
        signatureBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    public Builder mergeSignature(io.grpc.bverify.Signature value) {
      if (signatureBuilder_ == null) {
        if (signature_ != null) {
          signature_ =
            io.grpc.bverify.Signature.newBuilder(signature_).mergeFrom(value).buildPartial();
        } else {
          signature_ = value;
        }
        onChanged();
      } else {
        signatureBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    public Builder clearSignature() {
      if (signatureBuilder_ == null) {
        signature_ = null;
        onChanged();
      } else {
        signature_ = null;
        signatureBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    public io.grpc.bverify.Signature.Builder getSignatureBuilder() {
      
      onChanged();
      return getSignatureFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    public io.grpc.bverify.SignatureOrBuilder getSignatureOrBuilder() {
      if (signatureBuilder_ != null) {
        return signatureBuilder_.getMessageOrBuilder();
      } else {
        return signature_ == null ?
            io.grpc.bverify.Signature.getDefaultInstance() : signature_;
      }
    }
    /**
     * <code>.api.Signature signature = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.Signature, io.grpc.bverify.Signature.Builder, io.grpc.bverify.SignatureOrBuilder> 
        getSignatureFieldBuilder() {
      if (signatureBuilder_ == null) {
        signatureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.bverify.Signature, io.grpc.bverify.Signature.Builder, io.grpc.bverify.SignatureOrBuilder>(
                getSignature(),
                getParentForChildren(),
                isClean());
        signature_ = null;
      }
      return signatureBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.IssueReceiptRequest)
  }

  // @@protoc_insertion_point(class_scope:api.IssueReceiptRequest)
  private static final io.grpc.bverify.IssueReceiptRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.bverify.IssueReceiptRequest();
  }

  public static io.grpc.bverify.IssueReceiptRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IssueReceiptRequest>
      PARSER = new com.google.protobuf.AbstractParser<IssueReceiptRequest>() {
    public IssueReceiptRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IssueReceiptRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IssueReceiptRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IssueReceiptRequest> getParserForType() {
    return PARSER;
  }

  public io.grpc.bverify.IssueReceiptRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
