// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: step_stats.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.AllocatorMemoryUsed}
 */
public  final class AllocatorMemoryUsed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.AllocatorMemoryUsed)
    AllocatorMemoryUsedOrBuilder {
  // Use AllocatorMemoryUsed.newBuilder() to construct.
  private AllocatorMemoryUsed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllocatorMemoryUsed() {
    allocatorName_ = "";
    totalBytes_ = 0L;
    peakBytes_ = 0L;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AllocatorMemoryUsed(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            allocatorName_ = s;
            break;
          }
          case 16: {

            totalBytes_ = input.readInt64();
            break;
          }
          case 24: {

            peakBytes_ = input.readInt64();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AllocatorMemoryUsed.class, Builder.class);
  }

  public static final int ALLOCATOR_NAME_FIELD_NUMBER = 1;
  private volatile Object allocatorName_;
  /**
   * <code>optional string allocator_name = 1;</code>
   */
  public String getAllocatorName() {
    Object ref = allocatorName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      allocatorName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string allocator_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAllocatorNameBytes() {
    Object ref = allocatorName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      allocatorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_BYTES_FIELD_NUMBER = 2;
  private long totalBytes_;
  /**
   * <code>optional int64 total_bytes = 2;</code>
   */
  public long getTotalBytes() {
    return totalBytes_;
  }

  public static final int PEAK_BYTES_FIELD_NUMBER = 3;
  private long peakBytes_;
  /**
   * <code>optional int64 peak_bytes = 3;</code>
   */
  public long getPeakBytes() {
    return peakBytes_;
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
    if (!getAllocatorNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allocatorName_);
    }
    if (totalBytes_ != 0L) {
      output.writeInt64(2, totalBytes_);
    }
    if (peakBytes_ != 0L) {
      output.writeInt64(3, peakBytes_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAllocatorNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, allocatorName_);
    }
    if (totalBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalBytes_);
    }
    if (peakBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, peakBytes_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof AllocatorMemoryUsed)) {
      return super.equals(obj);
    }
    AllocatorMemoryUsed other = (AllocatorMemoryUsed) obj;

    boolean result = true;
    result = result && getAllocatorName()
        .equals(other.getAllocatorName());
    result = result && (getTotalBytes()
        == other.getTotalBytes());
    result = result && (getPeakBytes()
        == other.getPeakBytes());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ALLOCATOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getAllocatorName().hashCode();
    hash = (37 * hash) + TOTAL_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalBytes());
    hash = (37 * hash) + PEAK_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPeakBytes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AllocatorMemoryUsed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AllocatorMemoryUsed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AllocatorMemoryUsed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AllocatorMemoryUsed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AllocatorMemoryUsed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AllocatorMemoryUsed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AllocatorMemoryUsed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AllocatorMemoryUsed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AllocatorMemoryUsed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AllocatorMemoryUsed parseFrom(
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
  public static Builder newBuilder(AllocatorMemoryUsed prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.AllocatorMemoryUsed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.AllocatorMemoryUsed)
      org.tensorflow.framework.AllocatorMemoryUsedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AllocatorMemoryUsed.class, Builder.class);
    }

    // Construct using org.tensorflow.framework.AllocatorMemoryUsed.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      allocatorName_ = "";

      totalBytes_ = 0L;

      peakBytes_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_descriptor;
    }

    public AllocatorMemoryUsed getDefaultInstanceForType() {
      return AllocatorMemoryUsed.getDefaultInstance();
    }

    public AllocatorMemoryUsed build() {
      AllocatorMemoryUsed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AllocatorMemoryUsed buildPartial() {
      AllocatorMemoryUsed result = new AllocatorMemoryUsed(this);
      result.allocatorName_ = allocatorName_;
      result.totalBytes_ = totalBytes_;
      result.peakBytes_ = peakBytes_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AllocatorMemoryUsed) {
        return mergeFrom((AllocatorMemoryUsed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AllocatorMemoryUsed other) {
      if (other == AllocatorMemoryUsed.getDefaultInstance()) return this;
      if (!other.getAllocatorName().isEmpty()) {
        allocatorName_ = other.allocatorName_;
        onChanged();
      }
      if (other.getTotalBytes() != 0L) {
        setTotalBytes(other.getTotalBytes());
      }
      if (other.getPeakBytes() != 0L) {
        setPeakBytes(other.getPeakBytes());
      }
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
      AllocatorMemoryUsed parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AllocatorMemoryUsed) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object allocatorName_ = "";
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public String getAllocatorName() {
      Object ref = allocatorName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        allocatorName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAllocatorNameBytes() {
      Object ref = allocatorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        allocatorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public Builder setAllocatorName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      allocatorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public Builder clearAllocatorName() {
      
      allocatorName_ = getDefaultInstance().getAllocatorName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public Builder setAllocatorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      allocatorName_ = value;
      onChanged();
      return this;
    }

    private long totalBytes_ ;
    /**
     * <code>optional int64 total_bytes = 2;</code>
     */
    public long getTotalBytes() {
      return totalBytes_;
    }
    /**
     * <code>optional int64 total_bytes = 2;</code>
     */
    public Builder setTotalBytes(long value) {
      
      totalBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_bytes = 2;</code>
     */
    public Builder clearTotalBytes() {
      
      totalBytes_ = 0L;
      onChanged();
      return this;
    }

    private long peakBytes_ ;
    /**
     * <code>optional int64 peak_bytes = 3;</code>
     */
    public long getPeakBytes() {
      return peakBytes_;
    }
    /**
     * <code>optional int64 peak_bytes = 3;</code>
     */
    public Builder setPeakBytes(long value) {
      
      peakBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 peak_bytes = 3;</code>
     */
    public Builder clearPeakBytes() {
      
      peakBytes_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.AllocatorMemoryUsed)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.AllocatorMemoryUsed)
  private static final AllocatorMemoryUsed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AllocatorMemoryUsed();
  }

  public static AllocatorMemoryUsed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocatorMemoryUsed>
      PARSER = new com.google.protobuf.AbstractParser<AllocatorMemoryUsed>() {
    public AllocatorMemoryUsed parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AllocatorMemoryUsed(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllocatorMemoryUsed> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AllocatorMemoryUsed> getParserForType() {
    return PARSER;
  }

  public AllocatorMemoryUsed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

