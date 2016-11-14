// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: op_def.proto

package org.tensorflow.framework;

public final class OpDefProtos {
  private OpDefProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpDef_ArgDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpDef_ArgDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpDef_AttrDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpDef_AttrDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpDeprecation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpDeprecation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014op_def.proto\022\ntensorflow\032\020attr_value.p" +
      "roto\032\013types.proto\"\270\005\n\005OpDef\022\014\n\004name\030\001 \001(" +
      "\t\022+\n\tinput_arg\030\002 \003(\0132\030.tensorflow.OpDef." +
      "ArgDef\022,\n\noutput_arg\030\003 \003(\0132\030.tensorflow." +
      "OpDef.ArgDef\022\'\n\004attr\030\004 \003(\0132\031.tensorflow." +
      "OpDef.AttrDef\022.\n\013deprecation\030\010 \001(\0132\031.ten" +
      "sorflow.OpDeprecation\022\017\n\007summary\030\005 \001(\t\022\023" +
      "\n\013description\030\006 \001(\t\022\026\n\016is_commutative\030\022 " +
      "\001(\010\022\024\n\014is_aggregate\030\020 \001(\010\022\023\n\013is_stateful" +
      "\030\021 \001(\010\022\"\n\032allows_uninitialized_input\030\023 \001",
      "(\010\032\237\001\n\006ArgDef\022\014\n\004name\030\001 \001(\t\022\023\n\013descripti" +
      "on\030\002 \001(\t\022\"\n\004type\030\003 \001(\0162\024.tensorflow.Data" +
      "Type\022\021\n\ttype_attr\030\004 \001(\t\022\023\n\013number_attr\030\005" +
      " \001(\t\022\026\n\016type_list_attr\030\006 \001(\t\022\016\n\006is_ref\030\020" +
      " \001(\010\032\275\001\n\007AttrDef\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002" +
      " \001(\t\022,\n\rdefault_value\030\003 \001(\0132\025.tensorflow" +
      ".AttrValue\022\023\n\013description\030\004 \001(\t\022\023\n\013has_m" +
      "inimum\030\005 \001(\010\022\017\n\007minimum\030\006 \001(\003\022-\n\016allowed" +
      "_values\030\007 \001(\0132\025.tensorflow.AttrValue\"5\n\r" +
      "OpDeprecation\022\017\n\007version\030\001 \001(\005\022\023\n\013explan",
      "ation\030\002 \001(\t\"\'\n\006OpList\022\035\n\002op\030\001 \003(\0132\021.tens" +
      "orflow.OpDefB,\n\030org.tensorflow.framework" +
      "B\013OpDefProtosP\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AttrValueProtos.getDescriptor(),
          org.tensorflow.framework.TypesProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_OpDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_OpDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpDef_descriptor,
        new String[] { "Name", "InputArg", "OutputArg", "Attr", "Deprecation", "Summary", "Description", "IsCommutative", "IsAggregate", "IsStateful", "AllowsUninitializedInput", });
    internal_static_tensorflow_OpDef_ArgDef_descriptor =
      internal_static_tensorflow_OpDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_OpDef_ArgDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpDef_ArgDef_descriptor,
        new String[] { "Name", "Description", "Type", "TypeAttr", "NumberAttr", "TypeListAttr", "IsRef", });
    internal_static_tensorflow_OpDef_AttrDef_descriptor =
      internal_static_tensorflow_OpDef_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_OpDef_AttrDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpDef_AttrDef_descriptor,
        new String[] { "Name", "Type", "DefaultValue", "Description", "HasMinimum", "Minimum", "AllowedValues", });
    internal_static_tensorflow_OpDeprecation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_OpDeprecation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpDeprecation_descriptor,
        new String[] { "Version", "Explanation", });
    internal_static_tensorflow_OpList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_OpList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpList_descriptor,
        new String[] { "Op", });
    AttrValueProtos.getDescriptor();
    org.tensorflow.framework.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
