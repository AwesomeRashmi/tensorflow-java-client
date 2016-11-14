// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: log_memory.proto

package org.tensorflow.framework;

public interface MemoryLogStepOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MemoryLogStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Process-unique step id.
   * </pre>
   *
   * <code>optional int64 step_id = 1;</code>
   */
  long getStepId();

  /**
   * <pre>
   * Handle describing the feeds and fetches of the step.
   * </pre>
   *
   * <code>optional string handle = 2;</code>
   */
  String getHandle();
  /**
   * <pre>
   * Handle describing the feeds and fetches of the step.
   * </pre>
   *
   * <code>optional string handle = 2;</code>
   */
  com.google.protobuf.ByteString
      getHandleBytes();
}
