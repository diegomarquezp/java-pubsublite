/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/subscriber.proto

package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Request to grant tokens to the server, requesting delivery of messages when
 * they become available.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.FlowControlRequest}
 */
public final class FlowControlRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.FlowControlRequest)
    FlowControlRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FlowControlRequest.newBuilder() to construct.
  private FlowControlRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FlowControlRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FlowControlRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.SubscriberProto
        .internal_static_google_cloud_pubsublite_v1_FlowControlRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.SubscriberProto
        .internal_static_google_cloud_pubsublite_v1_FlowControlRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.FlowControlRequest.class,
            com.google.cloud.pubsublite.proto.FlowControlRequest.Builder.class);
  }

  public static final int ALLOWED_MESSAGES_FIELD_NUMBER = 1;
  private long allowedMessages_ = 0L;
  /**
   *
   *
   * <pre>
   * The number of message tokens to grant. Must be greater than or equal to 0.
   * </pre>
   *
   * <code>int64 allowed_messages = 1;</code>
   *
   * @return The allowedMessages.
   */
  @java.lang.Override
  public long getAllowedMessages() {
    return allowedMessages_;
  }

  public static final int ALLOWED_BYTES_FIELD_NUMBER = 2;
  private long allowedBytes_ = 0L;
  /**
   *
   *
   * <pre>
   * The number of byte tokens to grant. Must be greater than or equal to 0.
   * </pre>
   *
   * <code>int64 allowed_bytes = 2;</code>
   *
   * @return The allowedBytes.
   */
  @java.lang.Override
  public long getAllowedBytes() {
    return allowedBytes_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (allowedMessages_ != 0L) {
      output.writeInt64(1, allowedMessages_);
    }
    if (allowedBytes_ != 0L) {
      output.writeInt64(2, allowedBytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allowedMessages_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, allowedMessages_);
    }
    if (allowedBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, allowedBytes_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.pubsublite.proto.FlowControlRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.FlowControlRequest other =
        (com.google.cloud.pubsublite.proto.FlowControlRequest) obj;

    if (getAllowedMessages() != other.getAllowedMessages()) return false;
    if (getAllowedBytes() != other.getAllowedBytes()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALLOWED_MESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAllowedMessages());
    hash = (37 * hash) + ALLOWED_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAllowedBytes());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.pubsublite.proto.FlowControlRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to grant tokens to the server, requesting delivery of messages when
   * they become available.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.FlowControlRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.FlowControlRequest)
      com.google.cloud.pubsublite.proto.FlowControlRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_FlowControlRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_FlowControlRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.FlowControlRequest.class,
              com.google.cloud.pubsublite.proto.FlowControlRequest.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.FlowControlRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      allowedMessages_ = 0L;
      allowedBytes_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_FlowControlRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.FlowControlRequest getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.FlowControlRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.FlowControlRequest build() {
      com.google.cloud.pubsublite.proto.FlowControlRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.FlowControlRequest buildPartial() {
      com.google.cloud.pubsublite.proto.FlowControlRequest result =
          new com.google.cloud.pubsublite.proto.FlowControlRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.pubsublite.proto.FlowControlRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.allowedMessages_ = allowedMessages_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.allowedBytes_ = allowedBytes_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.pubsublite.proto.FlowControlRequest) {
        return mergeFrom((com.google.cloud.pubsublite.proto.FlowControlRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.FlowControlRequest other) {
      if (other == com.google.cloud.pubsublite.proto.FlowControlRequest.getDefaultInstance())
        return this;
      if (other.getAllowedMessages() != 0L) {
        setAllowedMessages(other.getAllowedMessages());
      }
      if (other.getAllowedBytes() != 0L) {
        setAllowedBytes(other.getAllowedBytes());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                allowedMessages_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                allowedBytes_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private long allowedMessages_;
    /**
     *
     *
     * <pre>
     * The number of message tokens to grant. Must be greater than or equal to 0.
     * </pre>
     *
     * <code>int64 allowed_messages = 1;</code>
     *
     * @return The allowedMessages.
     */
    @java.lang.Override
    public long getAllowedMessages() {
      return allowedMessages_;
    }
    /**
     *
     *
     * <pre>
     * The number of message tokens to grant. Must be greater than or equal to 0.
     * </pre>
     *
     * <code>int64 allowed_messages = 1;</code>
     *
     * @param value The allowedMessages to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedMessages(long value) {

      allowedMessages_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of message tokens to grant. Must be greater than or equal to 0.
     * </pre>
     *
     * <code>int64 allowed_messages = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowedMessages() {
      bitField0_ = (bitField0_ & ~0x00000001);
      allowedMessages_ = 0L;
      onChanged();
      return this;
    }

    private long allowedBytes_;
    /**
     *
     *
     * <pre>
     * The number of byte tokens to grant. Must be greater than or equal to 0.
     * </pre>
     *
     * <code>int64 allowed_bytes = 2;</code>
     *
     * @return The allowedBytes.
     */
    @java.lang.Override
    public long getAllowedBytes() {
      return allowedBytes_;
    }
    /**
     *
     *
     * <pre>
     * The number of byte tokens to grant. Must be greater than or equal to 0.
     * </pre>
     *
     * <code>int64 allowed_bytes = 2;</code>
     *
     * @param value The allowedBytes to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedBytes(long value) {

      allowedBytes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of byte tokens to grant. Must be greater than or equal to 0.
     * </pre>
     *
     * <code>int64 allowed_bytes = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowedBytes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      allowedBytes_ = 0L;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.FlowControlRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.FlowControlRequest)
  private static final com.google.cloud.pubsublite.proto.FlowControlRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.FlowControlRequest();
  }

  public static com.google.cloud.pubsublite.proto.FlowControlRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlowControlRequest> PARSER =
      new com.google.protobuf.AbstractParser<FlowControlRequest>() {
        @java.lang.Override
        public FlowControlRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<FlowControlRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlowControlRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.FlowControlRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
