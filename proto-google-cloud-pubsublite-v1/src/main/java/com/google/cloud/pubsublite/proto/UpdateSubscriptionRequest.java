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
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Request for UpdateSubscription.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.UpdateSubscriptionRequest}
 */
public final class UpdateSubscriptionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.UpdateSubscriptionRequest)
    UpdateSubscriptionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateSubscriptionRequest.newBuilder() to construct.
  private UpdateSubscriptionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateSubscriptionRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateSubscriptionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.AdminProto
        .internal_static_google_cloud_pubsublite_v1_UpdateSubscriptionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.AdminProto
        .internal_static_google_cloud_pubsublite_v1_UpdateSubscriptionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest.class,
            com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private com.google.cloud.pubsublite.proto.Subscription subscription_;
  /**
   *
   *
   * <pre>
   * Required. The subscription to update. Its `name` field must be populated.
   * Topic field must not be populated.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the subscription field is set.
   */
  @java.lang.Override
  public boolean hasSubscription() {
    return subscription_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The subscription to update. Its `name` field must be populated.
   * Topic field must not be populated.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The subscription.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.Subscription getSubscription() {
    return subscription_ == null
        ? com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance()
        : subscription_;
  }
  /**
   *
   *
   * <pre>
   * Required. The subscription to update. Its `name` field must be populated.
   * Topic field must not be populated.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.SubscriptionOrBuilder getSubscriptionOrBuilder() {
    return subscription_ == null
        ? com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance()
        : subscription_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. A mask specifying the subscription fields to change.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A mask specifying the subscription fields to change.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. A mask specifying the subscription fields to change.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (subscription_ != null) {
      output.writeMessage(1, getSubscription());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subscription_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSubscription());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest other =
        (com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest) obj;

    if (hasSubscription() != other.hasSubscription()) return false;
    if (hasSubscription()) {
      if (!getSubscription().equals(other.getSubscription())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasSubscription()) {
      hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getSubscription().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest parseFrom(
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
      com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest prototype) {
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
   * Request for UpdateSubscription.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.UpdateSubscriptionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.UpdateSubscriptionRequest)
      com.google.cloud.pubsublite.proto.UpdateSubscriptionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_UpdateSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_UpdateSubscriptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest.class,
              com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subscription_ = null;
      if (subscriptionBuilder_ != null) {
        subscriptionBuilder_.dispose();
        subscriptionBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_UpdateSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest build() {
      com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest buildPartial() {
      com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest result =
          new com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ =
            subscriptionBuilder_ == null ? subscription_ : subscriptionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest) {
        return mergeFrom((com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest other) {
      if (other == com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest.getDefaultInstance())
        return this;
      if (other.hasSubscription()) {
        mergeSubscription(other.getSubscription());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getSubscriptionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.pubsublite.proto.Subscription subscription_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Subscription,
            com.google.cloud.pubsublite.proto.Subscription.Builder,
            com.google.cloud.pubsublite.proto.SubscriptionOrBuilder>
        subscriptionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the subscription field is set.
     */
    public boolean hasSubscription() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The subscription.
     */
    public com.google.cloud.pubsublite.proto.Subscription getSubscription() {
      if (subscriptionBuilder_ == null) {
        return subscription_ == null
            ? com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance()
            : subscription_;
      } else {
        return subscriptionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSubscription(com.google.cloud.pubsublite.proto.Subscription value) {
      if (subscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subscription_ = value;
      } else {
        subscriptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSubscription(
        com.google.cloud.pubsublite.proto.Subscription.Builder builderForValue) {
      if (subscriptionBuilder_ == null) {
        subscription_ = builderForValue.build();
      } else {
        subscriptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSubscription(com.google.cloud.pubsublite.proto.Subscription value) {
      if (subscriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && subscription_ != null
            && subscription_
                != com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance()) {
          getSubscriptionBuilder().mergeFrom(value);
        } else {
          subscription_ = value;
        }
      } else {
        subscriptionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSubscription() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subscription_ = null;
      if (subscriptionBuilder_ != null) {
        subscriptionBuilder_.dispose();
        subscriptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.pubsublite.proto.Subscription.Builder getSubscriptionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSubscriptionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.pubsublite.proto.SubscriptionOrBuilder getSubscriptionOrBuilder() {
      if (subscriptionBuilder_ != null) {
        return subscriptionBuilder_.getMessageOrBuilder();
      } else {
        return subscription_ == null
            ? com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance()
            : subscription_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription to update. Its `name` field must be populated.
     * Topic field must not be populated.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Subscription,
            com.google.cloud.pubsublite.proto.Subscription.Builder,
            com.google.cloud.pubsublite.proto.SubscriptionOrBuilder>
        getSubscriptionFieldBuilder() {
      if (subscriptionBuilder_ == null) {
        subscriptionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.Subscription,
                com.google.cloud.pubsublite.proto.Subscription.Builder,
                com.google.cloud.pubsublite.proto.SubscriptionOrBuilder>(
                getSubscription(), getParentForChildren(), isClean());
        subscription_ = null;
      }
      return subscriptionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A mask specifying the subscription fields to change.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.UpdateSubscriptionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.UpdateSubscriptionRequest)
  private static final com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest();
  }

  public static com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSubscriptionRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateSubscriptionRequest>() {
        @java.lang.Override
        public UpdateSubscriptionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSubscriptionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSubscriptionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
