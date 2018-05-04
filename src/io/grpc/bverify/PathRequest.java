// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

/**
 * Protobuf type {@code api.PathRequest}
 */
public  final class PathRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.PathRequest)
    PathRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PathRequest.newBuilder() to construct.
  private PathRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PathRequest() {
    adsIds_ = java.util.Collections.emptyList();
    commitmentNumber_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PathRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              adsIds_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            adsIds_.add(input.readBytes());
            break;
          }
          case 16: {

            commitmentNumber_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        adsIds_ = java.util.Collections.unmodifiableList(adsIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.bverify.BVerifyAPI.internal_static_api_PathRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.bverify.BVerifyAPI.internal_static_api_PathRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.bverify.PathRequest.class, io.grpc.bverify.PathRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ADSIDS_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> adsIds_;
  /**
   * <code>repeated bytes adsIds = 1;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getAdsIdsList() {
    return adsIds_;
  }
  /**
   * <code>repeated bytes adsIds = 1;</code>
   */
  public int getAdsIdsCount() {
    return adsIds_.size();
  }
  /**
   * <code>repeated bytes adsIds = 1;</code>
   */
  public com.google.protobuf.ByteString getAdsIds(int index) {
    return adsIds_.get(index);
  }

  public static final int COMMITMENTNUMBER_FIELD_NUMBER = 2;
  private int commitmentNumber_;
  /**
   * <code>int32 commitmentNumber = 2;</code>
   */
  public int getCommitmentNumber() {
    return commitmentNumber_;
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
    for (int i = 0; i < adsIds_.size(); i++) {
      output.writeBytes(1, adsIds_.get(i));
    }
    if (commitmentNumber_ != 0) {
      output.writeInt32(2, commitmentNumber_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < adsIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(adsIds_.get(i));
      }
      size += dataSize;
      size += 1 * getAdsIdsList().size();
    }
    if (commitmentNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, commitmentNumber_);
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
    if (!(obj instanceof io.grpc.bverify.PathRequest)) {
      return super.equals(obj);
    }
    io.grpc.bverify.PathRequest other = (io.grpc.bverify.PathRequest) obj;

    boolean result = true;
    result = result && getAdsIdsList()
        .equals(other.getAdsIdsList());
    result = result && (getCommitmentNumber()
        == other.getCommitmentNumber());
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
    if (getAdsIdsCount() > 0) {
      hash = (37 * hash) + ADSIDS_FIELD_NUMBER;
      hash = (53 * hash) + getAdsIdsList().hashCode();
    }
    hash = (37 * hash) + COMMITMENTNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getCommitmentNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.bverify.PathRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.PathRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.PathRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.PathRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.PathRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.PathRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.PathRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.PathRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.bverify.PathRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.PathRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.bverify.PathRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.PathRequest parseFrom(
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
  public static Builder newBuilder(io.grpc.bverify.PathRequest prototype) {
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
   * Protobuf type {@code api.PathRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.PathRequest)
      io.grpc.bverify.PathRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_PathRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_PathRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.bverify.PathRequest.class, io.grpc.bverify.PathRequest.Builder.class);
    }

    // Construct using io.grpc.bverify.PathRequest.newBuilder()
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
      adsIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      commitmentNumber_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_PathRequest_descriptor;
    }

    public io.grpc.bverify.PathRequest getDefaultInstanceForType() {
      return io.grpc.bverify.PathRequest.getDefaultInstance();
    }

    public io.grpc.bverify.PathRequest build() {
      io.grpc.bverify.PathRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.bverify.PathRequest buildPartial() {
      io.grpc.bverify.PathRequest result = new io.grpc.bverify.PathRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        adsIds_ = java.util.Collections.unmodifiableList(adsIds_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.adsIds_ = adsIds_;
      result.commitmentNumber_ = commitmentNumber_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.grpc.bverify.PathRequest) {
        return mergeFrom((io.grpc.bverify.PathRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.bverify.PathRequest other) {
      if (other == io.grpc.bverify.PathRequest.getDefaultInstance()) return this;
      if (!other.adsIds_.isEmpty()) {
        if (adsIds_.isEmpty()) {
          adsIds_ = other.adsIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAdsIdsIsMutable();
          adsIds_.addAll(other.adsIds_);
        }
        onChanged();
      }
      if (other.getCommitmentNumber() != 0) {
        setCommitmentNumber(other.getCommitmentNumber());
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
      io.grpc.bverify.PathRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.bverify.PathRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> adsIds_ = java.util.Collections.emptyList();
    private void ensureAdsIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        adsIds_ = new java.util.ArrayList<com.google.protobuf.ByteString>(adsIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated bytes adsIds = 1;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getAdsIdsList() {
      return java.util.Collections.unmodifiableList(adsIds_);
    }
    /**
     * <code>repeated bytes adsIds = 1;</code>
     */
    public int getAdsIdsCount() {
      return adsIds_.size();
    }
    /**
     * <code>repeated bytes adsIds = 1;</code>
     */
    public com.google.protobuf.ByteString getAdsIds(int index) {
      return adsIds_.get(index);
    }
    /**
     * <code>repeated bytes adsIds = 1;</code>
     */
    public Builder setAdsIds(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAdsIdsIsMutable();
      adsIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes adsIds = 1;</code>
     */
    public Builder addAdsIds(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAdsIdsIsMutable();
      adsIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes adsIds = 1;</code>
     */
    public Builder addAllAdsIds(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureAdsIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, adsIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes adsIds = 1;</code>
     */
    public Builder clearAdsIds() {
      adsIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int commitmentNumber_ ;
    /**
     * <code>int32 commitmentNumber = 2;</code>
     */
    public int getCommitmentNumber() {
      return commitmentNumber_;
    }
    /**
     * <code>int32 commitmentNumber = 2;</code>
     */
    public Builder setCommitmentNumber(int value) {
      
      commitmentNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 commitmentNumber = 2;</code>
     */
    public Builder clearCommitmentNumber() {
      
      commitmentNumber_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.PathRequest)
  }

  // @@protoc_insertion_point(class_scope:api.PathRequest)
  private static final io.grpc.bverify.PathRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.bverify.PathRequest();
  }

  public static io.grpc.bverify.PathRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PathRequest>
      PARSER = new com.google.protobuf.AbstractParser<PathRequest>() {
    public PathRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PathRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PathRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PathRequest> getParserForType() {
    return PARSER;
  }

  public io.grpc.bverify.PathRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
