// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/pdsl/reports/proto/StrategicReportData.proto

package com.pdsl.reports.proto;

/**
 * <pre>
 * System Under Test
 * Applications
 * Test Resources
 * Contexts
 * Test Cases
 * </pre>
 *
 * Protobuf type {@code com.pdsl.reports.proto.StrategicReportData}
 */
public  final class StrategicReportData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.pdsl.reports.proto.StrategicReportData)
    StrategicReportDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StrategicReportData.newBuilder() to construct.
  private StrategicReportData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StrategicReportData() {
    operationalReportData_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StrategicReportData(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              operationalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.OperationalReportData>();
              mutable_bitField0_ |= 0x00000001;
            }
            operationalReportData_.add(
                input.readMessage(com.pdsl.reports.proto.OperationalReportData.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        operationalReportData_ = java.util.Collections.unmodifiableList(operationalReportData_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.StrategicReportData.class, com.pdsl.reports.proto.StrategicReportData.Builder.class);
  }

  public static final int OPERATIONAL_REPORT_DATA_FIELD_NUMBER = 1;
  private java.util.List<com.pdsl.reports.proto.OperationalReportData> operationalReportData_;
  /**
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public java.util.List<com.pdsl.reports.proto.OperationalReportData> getOperationalReportDataList() {
    return operationalReportData_;
  }
  /**
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public java.util.List<? extends com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
      getOperationalReportDataOrBuilderList() {
    return operationalReportData_;
  }
  /**
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public int getOperationalReportDataCount() {
    return operationalReportData_.size();
  }
  /**
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public com.pdsl.reports.proto.OperationalReportData getOperationalReportData(int index) {
    return operationalReportData_.get(index);
  }
  /**
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public com.pdsl.reports.proto.OperationalReportDataOrBuilder getOperationalReportDataOrBuilder(
      int index) {
    return operationalReportData_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < operationalReportData_.size(); i++) {
      output.writeMessage(1, operationalReportData_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < operationalReportData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, operationalReportData_.get(i));
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
    if (!(obj instanceof com.pdsl.reports.proto.StrategicReportData)) {
      return super.equals(obj);
    }
    com.pdsl.reports.proto.StrategicReportData other = (com.pdsl.reports.proto.StrategicReportData) obj;

    boolean result = true;
    result = result && getOperationalReportDataList()
        .equals(other.getOperationalReportDataList());
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
    if (getOperationalReportDataCount() > 0) {
      hash = (37 * hash) + OPERATIONAL_REPORT_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getOperationalReportDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.pdsl.reports.proto.StrategicReportData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * System Under Test
   * Applications
   * Test Resources
   * Contexts
   * Test Cases
   * </pre>
   *
   * Protobuf type {@code com.pdsl.reports.proto.StrategicReportData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.StrategicReportData)
      com.pdsl.reports.proto.StrategicReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.StrategicReportData.class, com.pdsl.reports.proto.StrategicReportData.Builder.class);
    }

    // Construct using com.pdsl.reports.proto.StrategicReportData.newBuilder()
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
        getOperationalReportDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (operationalReportDataBuilder_ == null) {
        operationalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        operationalReportDataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
    }

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.StrategicReportData.getDefaultInstance();
    }

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData build() {
      com.pdsl.reports.proto.StrategicReportData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData buildPartial() {
      com.pdsl.reports.proto.StrategicReportData result = new com.pdsl.reports.proto.StrategicReportData(this);
      int from_bitField0_ = bitField0_;
      if (operationalReportDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          operationalReportData_ = java.util.Collections.unmodifiableList(operationalReportData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operationalReportData_ = operationalReportData_;
      } else {
        result.operationalReportData_ = operationalReportDataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.StrategicReportData) {
        return mergeFrom((com.pdsl.reports.proto.StrategicReportData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pdsl.reports.proto.StrategicReportData other) {
      if (other == com.pdsl.reports.proto.StrategicReportData.getDefaultInstance()) return this;
      if (operationalReportDataBuilder_ == null) {
        if (!other.operationalReportData_.isEmpty()) {
          if (operationalReportData_.isEmpty()) {
            operationalReportData_ = other.operationalReportData_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationalReportDataIsMutable();
            operationalReportData_.addAll(other.operationalReportData_);
          }
          onChanged();
        }
      } else {
        if (!other.operationalReportData_.isEmpty()) {
          if (operationalReportDataBuilder_.isEmpty()) {
            operationalReportDataBuilder_.dispose();
            operationalReportDataBuilder_ = null;
            operationalReportData_ = other.operationalReportData_;
            bitField0_ = (bitField0_ & ~0x00000001);
            operationalReportDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOperationalReportDataFieldBuilder() : null;
          } else {
            operationalReportDataBuilder_.addAllMessages(other.operationalReportData_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.pdsl.reports.proto.StrategicReportData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.StrategicReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.pdsl.reports.proto.OperationalReportData> operationalReportData_ =
      java.util.Collections.emptyList();
    private void ensureOperationalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        operationalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.OperationalReportData>(operationalReportData_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> operationalReportDataBuilder_;

    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.OperationalReportData> getOperationalReportDataList() {
      if (operationalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operationalReportData_);
      } else {
        return operationalReportDataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public int getOperationalReportDataCount() {
      if (operationalReportDataBuilder_ == null) {
        return operationalReportData_.size();
      } else {
        return operationalReportDataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportData getOperationalReportData(int index) {
      if (operationalReportDataBuilder_ == null) {
        return operationalReportData_.get(index);
      } else {
        return operationalReportDataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder setOperationalReportData(
        int index, com.pdsl.reports.proto.OperationalReportData value) {
      if (operationalReportDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationalReportDataIsMutable();
        operationalReportData_.set(index, value);
        onChanged();
      } else {
        operationalReportDataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder setOperationalReportData(
        int index, com.pdsl.reports.proto.OperationalReportData.Builder builderForValue) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
        operationalReportData_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationalReportDataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder addOperationalReportData(com.pdsl.reports.proto.OperationalReportData value) {
      if (operationalReportDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationalReportDataIsMutable();
        operationalReportData_.add(value);
        onChanged();
      } else {
        operationalReportDataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder addOperationalReportData(
        int index, com.pdsl.reports.proto.OperationalReportData value) {
      if (operationalReportDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationalReportDataIsMutable();
        operationalReportData_.add(index, value);
        onChanged();
      } else {
        operationalReportDataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder addOperationalReportData(
        com.pdsl.reports.proto.OperationalReportData.Builder builderForValue) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
        operationalReportData_.add(builderForValue.build());
        onChanged();
      } else {
        operationalReportDataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder addOperationalReportData(
        int index, com.pdsl.reports.proto.OperationalReportData.Builder builderForValue) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
        operationalReportData_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationalReportDataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder addAllOperationalReportData(
        java.lang.Iterable<? extends com.pdsl.reports.proto.OperationalReportData> values) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operationalReportData_);
        onChanged();
      } else {
        operationalReportDataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder clearOperationalReportData() {
      if (operationalReportDataBuilder_ == null) {
        operationalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        operationalReportDataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder removeOperationalReportData(int index) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
        operationalReportData_.remove(index);
        onChanged();
      } else {
        operationalReportDataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportData.Builder getOperationalReportDataBuilder(
        int index) {
      return getOperationalReportDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportDataOrBuilder getOperationalReportDataOrBuilder(
        int index) {
      if (operationalReportDataBuilder_ == null) {
        return operationalReportData_.get(index);  } else {
        return operationalReportDataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<? extends com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
         getOperationalReportDataOrBuilderList() {
      if (operationalReportDataBuilder_ != null) {
        return operationalReportDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operationalReportData_);
      }
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportData.Builder addOperationalReportDataBuilder() {
      return getOperationalReportDataFieldBuilder().addBuilder(
          com.pdsl.reports.proto.OperationalReportData.getDefaultInstance());
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportData.Builder addOperationalReportDataBuilder(
        int index) {
      return getOperationalReportDataFieldBuilder().addBuilder(
          index, com.pdsl.reports.proto.OperationalReportData.getDefaultInstance());
    }
    /**
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.OperationalReportData.Builder> 
         getOperationalReportDataBuilderList() {
      return getOperationalReportDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
        getOperationalReportDataFieldBuilder() {
      if (operationalReportDataBuilder_ == null) {
        operationalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder>(
                operationalReportData_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        operationalReportData_ = null;
      }
      return operationalReportDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.pdsl.reports.proto.StrategicReportData)
  }

  // @@protoc_insertion_point(class_scope:com.pdsl.reports.proto.StrategicReportData)
  private static final com.pdsl.reports.proto.StrategicReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.StrategicReportData();
  }

  public static com.pdsl.reports.proto.StrategicReportData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StrategicReportData>
      PARSER = new com.google.protobuf.AbstractParser<StrategicReportData>() {
    @java.lang.Override
    public StrategicReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StrategicReportData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StrategicReportData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StrategicReportData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pdsl.reports.proto.StrategicReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

