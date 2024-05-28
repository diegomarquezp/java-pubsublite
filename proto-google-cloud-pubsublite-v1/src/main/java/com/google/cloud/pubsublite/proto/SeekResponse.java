/*
 * Copyright 2024 Google LLC
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

// Protobuf Java Version: 3.25.2
package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Response to a SeekRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.SeekResponse}
 */
public final class SeekResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.SeekResponse)
    SeekResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SeekResponse.newBuilder() to construct.
  private SeekResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SeekResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SeekResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.SubscriberProto
        .internal_static_google_cloud_pubsublite_v1_SeekResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.SubscriberProto
        .internal_static_google_cloud_pubsublite_v1_SeekResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.SeekResponse.class,
            com.google.cloud.pubsublite.proto.SeekResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CURSOR_FIELD_NUMBER = 1;
  private com.google.cloud.pubsublite.proto.Cursor cursor_;
  /**
   *
   *
   * <pre>
   * The new delivery cursor for the current stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   *
   * @return Whether the cursor field is set.
   */
  @java.lang.Override
  public boolean hasCursor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The new delivery cursor for the current stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   *
   * @return The cursor.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.Cursor getCursor() {
    return cursor_ == null
        ? com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()
        : cursor_;
  }
  /**
   *
   *
   * <pre>
   * The new delivery cursor for the current stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder() {
    return cursor_ == null
        ? com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()
        : cursor_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCursor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCursor());
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.SeekResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.SeekResponse other =
        (com.google.cloud.pubsublite.proto.SeekResponse) obj;

    if (hasCursor() != other.hasCursor()) return false;
    if (hasCursor()) {
      if (!getCursor().equals(other.getCursor())) return false;
    }
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
    if (hasCursor()) {
      hash = (37 * hash) + CURSOR_FIELD_NUMBER;
      hash = (53 * hash) + getCursor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.pubsublite.proto.SeekResponse prototype) {
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
   * Response to a SeekRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.SeekResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.SeekResponse)
      com.google.cloud.pubsublite.proto.SeekResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_SeekResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_SeekResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.SeekResponse.class,
              com.google.cloud.pubsublite.proto.SeekResponse.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.SeekResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCursorFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cursor_ = null;
      if (cursorBuilder_ != null) {
        cursorBuilder_.dispose();
        cursorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_SeekResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SeekResponse getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.SeekResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SeekResponse build() {
      com.google.cloud.pubsublite.proto.SeekResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SeekResponse buildPartial() {
      com.google.cloud.pubsublite.proto.SeekResponse result =
          new com.google.cloud.pubsublite.proto.SeekResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.pubsublite.proto.SeekResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cursor_ = cursorBuilder_ == null ? cursor_ : cursorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.pubsublite.proto.SeekResponse) {
        return mergeFrom((com.google.cloud.pubsublite.proto.SeekResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.SeekResponse other) {
      if (other == com.google.cloud.pubsublite.proto.SeekResponse.getDefaultInstance()) return this;
      if (other.hasCursor()) {
        mergeCursor(other.getCursor());
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
            case 10:
              {
                input.readMessage(getCursorFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.pubsublite.proto.Cursor cursor_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Cursor,
            com.google.cloud.pubsublite.proto.Cursor.Builder,
            com.google.cloud.pubsublite.proto.CursorOrBuilder>
        cursorBuilder_;
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     *
     * @return Whether the cursor field is set.
     */
    public boolean hasCursor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     *
     * @return The cursor.
     */
    public com.google.cloud.pubsublite.proto.Cursor getCursor() {
      if (cursorBuilder_ == null) {
        return cursor_ == null
            ? com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()
            : cursor_;
      } else {
        return cursorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public Builder setCursor(com.google.cloud.pubsublite.proto.Cursor value) {
      if (cursorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cursor_ = value;
      } else {
        cursorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public Builder setCursor(com.google.cloud.pubsublite.proto.Cursor.Builder builderForValue) {
      if (cursorBuilder_ == null) {
        cursor_ = builderForValue.build();
      } else {
        cursorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public Builder mergeCursor(com.google.cloud.pubsublite.proto.Cursor value) {
      if (cursorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && cursor_ != null
            && cursor_ != com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()) {
          getCursorBuilder().mergeFrom(value);
        } else {
          cursor_ = value;
        }
      } else {
        cursorBuilder_.mergeFrom(value);
      }
      if (cursor_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public Builder clearCursor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cursor_ = null;
      if (cursorBuilder_ != null) {
        cursorBuilder_.dispose();
        cursorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Cursor.Builder getCursorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCursorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder() {
      if (cursorBuilder_ != null) {
        return cursorBuilder_.getMessageOrBuilder();
      } else {
        return cursor_ == null
            ? com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()
            : cursor_;
      }
    }
    /**
     *
     *
     * <pre>
     * The new delivery cursor for the current stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Cursor,
            com.google.cloud.pubsublite.proto.Cursor.Builder,
            com.google.cloud.pubsublite.proto.CursorOrBuilder>
        getCursorFieldBuilder() {
      if (cursorBuilder_ == null) {
        cursorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.Cursor,
                com.google.cloud.pubsublite.proto.Cursor.Builder,
                com.google.cloud.pubsublite.proto.CursorOrBuilder>(
                getCursor(), getParentForChildren(), isClean());
        cursor_ = null;
      }
      return cursorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.SeekResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.SeekResponse)
  private static final com.google.cloud.pubsublite.proto.SeekResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.SeekResponse();
  }

  public static com.google.cloud.pubsublite.proto.SeekResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeekResponse> PARSER =
      new com.google.protobuf.AbstractParser<SeekResponse>() {
        @java.lang.Override
        public SeekResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SeekResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeekResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.SeekResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
