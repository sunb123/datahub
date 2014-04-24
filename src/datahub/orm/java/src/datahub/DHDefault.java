/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package datahub;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DHDefault extends org.apache.thrift.TUnion<DHDefault, DHDefault._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DHDefault");
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SET_NULL_FIELD_DESC = new org.apache.thrift.protocol.TField("set_null", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField SET_CURRENT_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("set_current_timestamp", org.apache.thrift.protocol.TType.BOOL, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUE((short)1, "value"),
    SET_NULL((short)2, "set_null"),
    SET_CURRENT_TIMESTAMP((short)3, "set_current_timestamp");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VALUE
          return VALUE;
        case 2: // SET_NULL
          return SET_NULL;
        case 3: // SET_CURRENT_TIMESTAMP
          return SET_CURRENT_TIMESTAMP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SET_NULL, new org.apache.thrift.meta_data.FieldMetaData("set_null", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SET_CURRENT_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("set_current_timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DHDefault.class, metaDataMap);
  }

  public DHDefault() {
    super();
  }

  public DHDefault(_Fields setField, Object value) {
    super(setField, value);
  }

  public DHDefault(DHDefault other) {
    super(other);
  }
  public DHDefault deepCopy() {
    return new DHDefault(this);
  }

  public static DHDefault value(ByteBuffer value) {
    DHDefault x = new DHDefault();
    x.setValue(value);
    return x;
  }

  public static DHDefault value(byte[] value) {
    DHDefault x = new DHDefault();
    x.setValue(ByteBuffer.wrap(value));
    return x;
  }

  public static DHDefault set_null(boolean value) {
    DHDefault x = new DHDefault();
    x.setSet_null(value);
    return x;
  }

  public static DHDefault set_current_timestamp(boolean value) {
    DHDefault x = new DHDefault();
    x.setSet_current_timestamp(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case VALUE:
        if (value instanceof ByteBuffer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ByteBuffer for field 'value', but got " + value.getClass().getSimpleName());
      case SET_NULL:
        if (value instanceof Boolean) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Boolean for field 'set_null', but got " + value.getClass().getSimpleName());
      case SET_CURRENT_TIMESTAMP:
        if (value instanceof Boolean) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Boolean for field 'set_current_timestamp', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case VALUE:
          if (field.type == VALUE_FIELD_DESC.type) {
            ByteBuffer value;
            value = iprot.readBinary();
            return value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SET_NULL:
          if (field.type == SET_NULL_FIELD_DESC.type) {
            Boolean set_null;
            set_null = iprot.readBool();
            return set_null;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SET_CURRENT_TIMESTAMP:
          if (field.type == SET_CURRENT_TIMESTAMP_FIELD_DESC.type) {
            Boolean set_current_timestamp;
            set_current_timestamp = iprot.readBool();
            return set_current_timestamp;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case VALUE:
        ByteBuffer value = (ByteBuffer)value_;
        oprot.writeBinary(value);
        return;
      case SET_NULL:
        Boolean set_null = (Boolean)value_;
        oprot.writeBool(set_null);
        return;
      case SET_CURRENT_TIMESTAMP:
        Boolean set_current_timestamp = (Boolean)value_;
        oprot.writeBool(set_current_timestamp);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case VALUE:
          ByteBuffer value;
          value = iprot.readBinary();
          return value;
        case SET_NULL:
          Boolean set_null;
          set_null = iprot.readBool();
          return set_null;
        case SET_CURRENT_TIMESTAMP:
          Boolean set_current_timestamp;
          set_current_timestamp = iprot.readBool();
          return set_current_timestamp;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case VALUE:
        ByteBuffer value = (ByteBuffer)value_;
        oprot.writeBinary(value);
        return;
      case SET_NULL:
        Boolean set_null = (Boolean)value_;
        oprot.writeBool(set_null);
        return;
      case SET_CURRENT_TIMESTAMP:
        Boolean set_current_timestamp = (Boolean)value_;
        oprot.writeBool(set_current_timestamp);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case VALUE:
        return VALUE_FIELD_DESC;
      case SET_NULL:
        return SET_NULL_FIELD_DESC;
      case SET_CURRENT_TIMESTAMP:
        return SET_CURRENT_TIMESTAMP_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public byte[] getValue() {
    setValue(org.apache.thrift.TBaseHelper.rightSize(bufferForValue()));
    ByteBuffer b = bufferForValue();
    return b == null ? null : b.array();
  }

  public ByteBuffer bufferForValue() {
    if (getSetField() == _Fields.VALUE) {
      return (ByteBuffer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setValue(byte[] value) {
    setValue(ByteBuffer.wrap(value));
  }

  public void setValue(ByteBuffer value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.VALUE;
    value_ = value;
  }

  public boolean getSet_null() {
    if (getSetField() == _Fields.SET_NULL) {
      return (Boolean)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'set_null' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSet_null(boolean value) {
    setField_ = _Fields.SET_NULL;
    value_ = value;
  }

  public boolean getSet_current_timestamp() {
    if (getSetField() == _Fields.SET_CURRENT_TIMESTAMP) {
      return (Boolean)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'set_current_timestamp' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSet_current_timestamp(boolean value) {
    setField_ = _Fields.SET_CURRENT_TIMESTAMP;
    value_ = value;
  }

  public boolean isSetValue() {
    return setField_ == _Fields.VALUE;
  }


  public boolean isSetSet_null() {
    return setField_ == _Fields.SET_NULL;
  }


  public boolean isSetSet_current_timestamp() {
    return setField_ == _Fields.SET_CURRENT_TIMESTAMP;
  }


  public boolean equals(Object other) {
    if (other instanceof DHDefault) {
      return equals((DHDefault)other);
    } else {
      return false;
    }
  }

  public boolean equals(DHDefault other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(DHDefault other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  /**
   * If you'd like this to perform more respectably, use the hashcode generator option.
   */
  @Override
  public int hashCode() {
    return 0;
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}