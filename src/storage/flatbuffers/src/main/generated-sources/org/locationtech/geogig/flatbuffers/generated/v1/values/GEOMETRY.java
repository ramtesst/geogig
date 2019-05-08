// automatically generated by the FlatBuffers compiler, do not modify

package org.locationtech.geogig.flatbuffers.generated.v1.values;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class GEOMETRY extends Table {
  public static GEOMETRY getRootAsGEOMETRY(ByteBuffer _bb) { return getRootAsGEOMETRY(_bb, new GEOMETRY()); }
  public static GEOMETRY getRootAsGEOMETRY(ByteBuffer _bb, GEOMETRY obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public GEOMETRY __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte valueType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table value(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o) : null; }

  public static int createGEOMETRY(FlatBufferBuilder builder,
      byte value_type,
      int valueOffset) {
    builder.startObject(2);
    GEOMETRY.addValue(builder, valueOffset);
    GEOMETRY.addValueType(builder, value_type);
    return GEOMETRY.endGEOMETRY(builder);
  }

  public static void startGEOMETRY(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addValueType(FlatBufferBuilder builder, byte valueType) { builder.addByte(0, valueType, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(1, valueOffset, 0); }
  public static int endGEOMETRY(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

