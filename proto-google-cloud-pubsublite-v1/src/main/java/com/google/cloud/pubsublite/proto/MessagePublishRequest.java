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
// source: google/cloud/pubsublite/v1/publisher.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Request to publish messages to the topic.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.MessagePublishRequest}
 */
public final class MessagePublishRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.MessagePublishRequest)
    MessagePublishRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MessagePublishRequest.newBuilder() to construct.
  private MessagePublishRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MessagePublishRequest() {
    messages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MessagePublishRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.PublisherProto
        .internal_static_google_cloud_pubsublite_v1_MessagePublishRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.PublisherProto
        .internal_static_google_cloud_pubsublite_v1_MessagePublishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.MessagePublishRequest.class,
            com.google.cloud.pubsublite.proto.MessagePublishRequest.Builder.class);
  }

  public static final int MESSAGES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.pubsublite.proto.PubSubMessage> messages_;
  /**
   *
   *
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.pubsublite.proto.PubSubMessage> getMessagesList() {
    return messages_;
  }
  /**
   *
   *
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.pubsublite.proto.PubSubMessageOrBuilder>
      getMessagesOrBuilderList() {
    return messages_;
  }
  /**
   *
   *
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
   */
  @java.lang.Override
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   *
   *
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.PubSubMessage getMessages(int index) {
    return messages_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.PubSubMessageOrBuilder getMessagesOrBuilder(int index) {
    return messages_.get(index);
  }

  public static final int FIRST_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
  private long firstSequenceNumber_ = 0L;
  /**
   *
   *
   * <pre>
   * The sequence number corresponding to the first message in `messages`.
   * Messages within a batch are ordered and the sequence numbers of all
   * subsequent messages in the batch are assumed to be incremental.
   *
   * Sequence numbers are assigned at the message level and the first message
   * published in a publisher client session must have a sequence number of 0.
   * All messages must have contiguous sequence numbers, which uniquely identify
   * the messages accepted by the publisher client. Since messages are ordered,
   * the client only needs to specify the sequence number of the first message
   * in a published batch. The server deduplicates messages with the same
   * sequence number from the same publisher `client_id`.
   * </pre>
   *
   * <code>int64 first_sequence_number = 2;</code>
   *
   * @return The firstSequenceNumber.
   */
  @java.lang.Override
  public long getFirstSequenceNumber() {
    return firstSequenceNumber_;
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
    for (int i = 0; i < messages_.size(); i++) {
      output.writeMessage(1, messages_.get(i));
    }
    if (firstSequenceNumber_ != 0L) {
      output.writeInt64(2, firstSequenceNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < messages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, messages_.get(i));
    }
    if (firstSequenceNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, firstSequenceNumber_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.MessagePublishRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.MessagePublishRequest other =
        (com.google.cloud.pubsublite.proto.MessagePublishRequest) obj;

    if (!getMessagesList().equals(other.getMessagesList())) return false;
    if (getFirstSequenceNumber() != other.getFirstSequenceNumber()) return false;
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
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (37 * hash) + FIRST_SEQUENCE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getFirstSequenceNumber());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest parseFrom(
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
      com.google.cloud.pubsublite.proto.MessagePublishRequest prototype) {
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
   * Request to publish messages to the topic.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.MessagePublishRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.MessagePublishRequest)
      com.google.cloud.pubsublite.proto.MessagePublishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.PublisherProto
          .internal_static_google_cloud_pubsublite_v1_MessagePublishRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.PublisherProto
          .internal_static_google_cloud_pubsublite_v1_MessagePublishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.MessagePublishRequest.class,
              com.google.cloud.pubsublite.proto.MessagePublishRequest.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.MessagePublishRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
      } else {
        messages_ = null;
        messagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      firstSequenceNumber_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.PublisherProto
          .internal_static_google_cloud_pubsublite_v1_MessagePublishRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.MessagePublishRequest getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.MessagePublishRequest build() {
      com.google.cloud.pubsublite.proto.MessagePublishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.MessagePublishRequest buildPartial() {
      com.google.cloud.pubsublite.proto.MessagePublishRequest result =
          new com.google.cloud.pubsublite.proto.MessagePublishRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.pubsublite.proto.MessagePublishRequest result) {
      if (messagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.messages_ = messages_;
      } else {
        result.messages_ = messagesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.pubsublite.proto.MessagePublishRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.firstSequenceNumber_ = firstSequenceNumber_;
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
      if (other instanceof com.google.cloud.pubsublite.proto.MessagePublishRequest) {
        return mergeFrom((com.google.cloud.pubsublite.proto.MessagePublishRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.MessagePublishRequest other) {
      if (other == com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance())
        return this;
      if (messagesBuilder_ == null) {
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
      } else {
        if (!other.messages_.isEmpty()) {
          if (messagesBuilder_.isEmpty()) {
            messagesBuilder_.dispose();
            messagesBuilder_ = null;
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            messagesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMessagesFieldBuilder()
                    : null;
          } else {
            messagesBuilder_.addAllMessages(other.messages_);
          }
        }
      }
      if (other.getFirstSequenceNumber() != 0L) {
        setFirstSequenceNumber(other.getFirstSequenceNumber());
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
                com.google.cloud.pubsublite.proto.PubSubMessage m =
                    input.readMessage(
                        com.google.cloud.pubsublite.proto.PubSubMessage.parser(),
                        extensionRegistry);
                if (messagesBuilder_ == null) {
                  ensureMessagesIsMutable();
                  messages_.add(m);
                } else {
                  messagesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 16:
              {
                firstSequenceNumber_ = input.readInt64();
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

    private java.util.List<com.google.cloud.pubsublite.proto.PubSubMessage> messages_ =
        java.util.Collections.emptyList();

    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messages_ =
            new java.util.ArrayList<com.google.cloud.pubsublite.proto.PubSubMessage>(messages_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.pubsublite.proto.PubSubMessage,
            com.google.cloud.pubsublite.proto.PubSubMessage.Builder,
            com.google.cloud.pubsublite.proto.PubSubMessageOrBuilder>
        messagesBuilder_;

    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public java.util.List<com.google.cloud.pubsublite.proto.PubSubMessage> getMessagesList() {
      if (messagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messages_);
      } else {
        return messagesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public int getMessagesCount() {
      if (messagesBuilder_ == null) {
        return messages_.size();
      } else {
        return messagesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PubSubMessage getMessages(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder setMessages(int index, com.google.cloud.pubsublite.proto.PubSubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder setMessages(
        int index, com.google.cloud.pubsublite.proto.PubSubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.set(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder addMessages(com.google.cloud.pubsublite.proto.PubSubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder addMessages(int index, com.google.cloud.pubsublite.proto.PubSubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(index, value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder addMessages(
        com.google.cloud.pubsublite.proto.PubSubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder addMessages(
        int index, com.google.cloud.pubsublite.proto.PubSubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends com.google.cloud.pubsublite.proto.PubSubMessage> values) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, messages_);
        onChanged();
      } else {
        messagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder clearMessages() {
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public Builder removeMessages(int index) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.remove(index);
        onChanged();
      } else {
        messagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PubSubMessage.Builder getMessagesBuilder(int index) {
      return getMessagesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PubSubMessageOrBuilder getMessagesOrBuilder(
        int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.pubsublite.proto.PubSubMessageOrBuilder>
        getMessagesOrBuilderList() {
      if (messagesBuilder_ != null) {
        return messagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messages_);
      }
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PubSubMessage.Builder addMessagesBuilder() {
      return getMessagesFieldBuilder()
          .addBuilder(com.google.cloud.pubsublite.proto.PubSubMessage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PubSubMessage.Builder addMessagesBuilder(int index) {
      return getMessagesFieldBuilder()
          .addBuilder(index, com.google.cloud.pubsublite.proto.PubSubMessage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PubSubMessage messages = 1;</code>
     */
    public java.util.List<com.google.cloud.pubsublite.proto.PubSubMessage.Builder>
        getMessagesBuilderList() {
      return getMessagesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.pubsublite.proto.PubSubMessage,
            com.google.cloud.pubsublite.proto.PubSubMessage.Builder,
            com.google.cloud.pubsublite.proto.PubSubMessageOrBuilder>
        getMessagesFieldBuilder() {
      if (messagesBuilder_ == null) {
        messagesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.pubsublite.proto.PubSubMessage,
                com.google.cloud.pubsublite.proto.PubSubMessage.Builder,
                com.google.cloud.pubsublite.proto.PubSubMessageOrBuilder>(
                messages_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        messages_ = null;
      }
      return messagesBuilder_;
    }

    private long firstSequenceNumber_;
    /**
     *
     *
     * <pre>
     * The sequence number corresponding to the first message in `messages`.
     * Messages within a batch are ordered and the sequence numbers of all
     * subsequent messages in the batch are assumed to be incremental.
     *
     * Sequence numbers are assigned at the message level and the first message
     * published in a publisher client session must have a sequence number of 0.
     * All messages must have contiguous sequence numbers, which uniquely identify
     * the messages accepted by the publisher client. Since messages are ordered,
     * the client only needs to specify the sequence number of the first message
     * in a published batch. The server deduplicates messages with the same
     * sequence number from the same publisher `client_id`.
     * </pre>
     *
     * <code>int64 first_sequence_number = 2;</code>
     *
     * @return The firstSequenceNumber.
     */
    @java.lang.Override
    public long getFirstSequenceNumber() {
      return firstSequenceNumber_;
    }
    /**
     *
     *
     * <pre>
     * The sequence number corresponding to the first message in `messages`.
     * Messages within a batch are ordered and the sequence numbers of all
     * subsequent messages in the batch are assumed to be incremental.
     *
     * Sequence numbers are assigned at the message level and the first message
     * published in a publisher client session must have a sequence number of 0.
     * All messages must have contiguous sequence numbers, which uniquely identify
     * the messages accepted by the publisher client. Since messages are ordered,
     * the client only needs to specify the sequence number of the first message
     * in a published batch. The server deduplicates messages with the same
     * sequence number from the same publisher `client_id`.
     * </pre>
     *
     * <code>int64 first_sequence_number = 2;</code>
     *
     * @param value The firstSequenceNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFirstSequenceNumber(long value) {

      firstSequenceNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The sequence number corresponding to the first message in `messages`.
     * Messages within a batch are ordered and the sequence numbers of all
     * subsequent messages in the batch are assumed to be incremental.
     *
     * Sequence numbers are assigned at the message level and the first message
     * published in a publisher client session must have a sequence number of 0.
     * All messages must have contiguous sequence numbers, which uniquely identify
     * the messages accepted by the publisher client. Since messages are ordered,
     * the client only needs to specify the sequence number of the first message
     * in a published batch. The server deduplicates messages with the same
     * sequence number from the same publisher `client_id`.
     * </pre>
     *
     * <code>int64 first_sequence_number = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFirstSequenceNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      firstSequenceNumber_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.MessagePublishRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.MessagePublishRequest)
  private static final com.google.cloud.pubsublite.proto.MessagePublishRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.MessagePublishRequest();
  }

  public static com.google.cloud.pubsublite.proto.MessagePublishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessagePublishRequest> PARSER =
      new com.google.protobuf.AbstractParser<MessagePublishRequest>() {
        @java.lang.Override
        public MessagePublishRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MessagePublishRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessagePublishRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.MessagePublishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
