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
// source: google/cloud/pubsublite/v1/admin.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Response for ListReservationTopics.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.ListReservationTopicsResponse}
 */
public final class ListReservationTopicsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.ListReservationTopicsResponse)
    ListReservationTopicsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListReservationTopicsResponse.newBuilder() to construct.
  private ListReservationTopicsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListReservationTopicsResponse() {
    topics_ = com.google.protobuf.LazyStringArrayList.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListReservationTopicsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.AdminProto
        .internal_static_google_cloud_pubsublite_v1_ListReservationTopicsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.AdminProto
        .internal_static_google_cloud_pubsublite_v1_ListReservationTopicsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.ListReservationTopicsResponse.class,
            com.google.cloud.pubsublite.proto.ListReservationTopicsResponse.Builder.class);
  }

  public static final int TOPICS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList topics_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The names of topics attached to the reservation. The order of the
   * topics is unspecified.
   * </pre>
   *
   * <code>repeated string topics = 1;</code>
   *
   * @return A list containing the topics.
   */
  public com.google.protobuf.ProtocolStringList getTopicsList() {
    return topics_;
  }
  /**
   *
   *
   * <pre>
   * The names of topics attached to the reservation. The order of the
   * topics is unspecified.
   * </pre>
   *
   * <code>repeated string topics = 1;</code>
   *
   * @return The count of topics.
   */
  public int getTopicsCount() {
    return topics_.size();
  }
  /**
   *
   *
   * <pre>
   * The names of topics attached to the reservation. The order of the
   * topics is unspecified.
   * </pre>
   *
   * <code>repeated string topics = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The topics at the given index.
   */
  public java.lang.String getTopics(int index) {
    return topics_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The names of topics attached to the reservation. The order of the
   * topics is unspecified.
   * </pre>
   *
   * <code>repeated string topics = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the topics at the given index.
   */
  public com.google.protobuf.ByteString getTopicsBytes(int index) {
    return topics_.getByteString(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < topics_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topics_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < topics_.size(); i++) {
        dataSize += computeStringSizeNoTag(topics_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTopicsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.ListReservationTopicsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.ListReservationTopicsResponse other =
        (com.google.cloud.pubsublite.proto.ListReservationTopicsResponse) obj;

    if (!getTopicsList().equals(other.getTopicsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getTopicsCount() > 0) {
      hash = (37 * hash) + TOPICS_FIELD_NUMBER;
      hash = (53 * hash) + getTopicsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.pubsublite.proto.ListReservationTopicsResponse prototype) {
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
   * Response for ListReservationTopics.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.ListReservationTopicsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.ListReservationTopicsResponse)
      com.google.cloud.pubsublite.proto.ListReservationTopicsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_ListReservationTopicsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_ListReservationTopicsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.ListReservationTopicsResponse.class,
              com.google.cloud.pubsublite.proto.ListReservationTopicsResponse.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.ListReservationTopicsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      topics_ = com.google.protobuf.LazyStringArrayList.emptyList();
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_ListReservationTopicsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListReservationTopicsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.ListReservationTopicsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListReservationTopicsResponse build() {
      com.google.cloud.pubsublite.proto.ListReservationTopicsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListReservationTopicsResponse buildPartial() {
      com.google.cloud.pubsublite.proto.ListReservationTopicsResponse result =
          new com.google.cloud.pubsublite.proto.ListReservationTopicsResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.pubsublite.proto.ListReservationTopicsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        topics_.makeImmutable();
        result.topics_ = topics_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.pubsublite.proto.ListReservationTopicsResponse) {
        return mergeFrom((com.google.cloud.pubsublite.proto.ListReservationTopicsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.pubsublite.proto.ListReservationTopicsResponse other) {
      if (other
          == com.google.cloud.pubsublite.proto.ListReservationTopicsResponse.getDefaultInstance())
        return this;
      if (!other.topics_.isEmpty()) {
        if (topics_.isEmpty()) {
          topics_ = other.topics_;
          bitField0_ |= 0x00000001;
        } else {
          ensureTopicsIsMutable();
          topics_.addAll(other.topics_);
        }
        onChanged();
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureTopicsIsMutable();
                topics_.add(s);
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.LazyStringArrayList topics_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureTopicsIsMutable() {
      if (!topics_.isModifiable()) {
        topics_ = new com.google.protobuf.LazyStringArrayList(topics_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @return A list containing the topics.
     */
    public com.google.protobuf.ProtocolStringList getTopicsList() {
      topics_.makeImmutable();
      return topics_;
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @return The count of topics.
     */
    public int getTopicsCount() {
      return topics_.size();
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The topics at the given index.
     */
    public java.lang.String getTopics(int index) {
      return topics_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the topics at the given index.
     */
    public com.google.protobuf.ByteString getTopicsBytes(int index) {
      return topics_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The topics to set.
     * @return This builder for chaining.
     */
    public Builder setTopics(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTopicsIsMutable();
      topics_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @param value The topics to add.
     * @return This builder for chaining.
     */
    public Builder addTopics(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTopicsIsMutable();
      topics_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @param values The topics to add.
     * @return This builder for chaining.
     */
    public Builder addAllTopics(java.lang.Iterable<java.lang.String> values) {
      ensureTopicsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, topics_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTopics() {
      topics_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of topics attached to the reservation. The order of the
     * topics is unspecified.
     * </pre>
     *
     * <code>repeated string topics = 1;</code>
     *
     * @param value The bytes of the topics to add.
     * @return This builder for chaining.
     */
    public Builder addTopicsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureTopicsIsMutable();
      topics_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.ListReservationTopicsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ListReservationTopicsResponse)
  private static final com.google.cloud.pubsublite.proto.ListReservationTopicsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.ListReservationTopicsResponse();
  }

  public static com.google.cloud.pubsublite.proto.ListReservationTopicsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListReservationTopicsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListReservationTopicsResponse>() {
        @java.lang.Override
        public ListReservationTopicsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListReservationTopicsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListReservationTopicsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.ListReservationTopicsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
