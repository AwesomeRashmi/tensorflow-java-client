// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: op_def.proto

package org.tensorflow.framework;

public interface OpListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.OpList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  java.util.List<OpDef>
      getOpList();
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  OpDef getOp(int index);
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  int getOpCount();
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  java.util.List<? extends OpDefOrBuilder>
      getOpOrBuilderList();
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  OpDefOrBuilder getOpOrBuilder(
          int index);
}
