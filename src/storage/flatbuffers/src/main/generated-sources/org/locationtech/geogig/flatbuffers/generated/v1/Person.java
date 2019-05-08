// automatically generated by the FlatBuffers compiler, do not modify

package org.locationtech.geogig.flatbuffers.generated.v1;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Person extends Table {
  public static Person getRootAsPerson(ByteBuffer _bb) { return getRootAsPerson(_bb, new Person()); }
  public static Person getRootAsPerson(ByteBuffer _bb, Person obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Person __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String email() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer emailAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer emailInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public long timestamp() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public int timezoneOffset() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createPerson(FlatBufferBuilder builder,
      int nameOffset,
      int emailOffset,
      long timestamp,
      int timezoneOffset) {
    builder.startObject(4);
    Person.addTimestamp(builder, timestamp);
    Person.addTimezoneOffset(builder, timezoneOffset);
    Person.addEmail(builder, emailOffset);
    Person.addName(builder, nameOffset);
    return Person.endPerson(builder);
  }

  public static void startPerson(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addEmail(FlatBufferBuilder builder, int emailOffset) { builder.addOffset(1, emailOffset, 0); }
  public static void addTimestamp(FlatBufferBuilder builder, long timestamp) { builder.addLong(2, timestamp, 0L); }
  public static void addTimezoneOffset(FlatBufferBuilder builder, int timezoneOffset) { builder.addInt(3, timezoneOffset, 0); }
  public static int endPerson(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

