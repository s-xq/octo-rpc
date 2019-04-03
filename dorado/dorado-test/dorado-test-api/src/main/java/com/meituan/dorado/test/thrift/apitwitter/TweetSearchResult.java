/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.meituan.dorado.test.thrift.apitwitter;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2019-03-29")
public class TweetSearchResult implements org.apache.thrift.TBase<TweetSearchResult, TweetSearchResult._Fields>, java.io.Serializable, Cloneable, Comparable<TweetSearchResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TweetSearchResult");

  private static final org.apache.thrift.protocol.TField TWEETS_FIELD_DESC = new org.apache.thrift.protocol.TField("tweets", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TweetSearchResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TweetSearchResultTupleSchemeFactory());
  }

  public List<Tweet> tweets; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TWEETS((short)1, "tweets");

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
        case 1: // TWEETS
          return TWEETS;
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

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TWEETS, new org.apache.thrift.meta_data.FieldMetaData("tweets", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.LIST        , "TweetList")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TweetSearchResult.class, metaDataMap);
  }

  public TweetSearchResult() {
  }

  public TweetSearchResult(
    List<Tweet> tweets)
  {
    this();
    this.tweets = tweets;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TweetSearchResult(TweetSearchResult other) {
    if (other.isSetTweets()) {
      this.tweets = other.tweets;
    }
  }

  public TweetSearchResult deepCopy() {
    return new TweetSearchResult(this);
  }

  @Override
  public void clear() {
    this.tweets = null;
  }

  public int getTweetsSize() {
    return (this.tweets == null) ? 0 : this.tweets.size();
  }

  public java.util.Iterator<Tweet> getTweetsIterator() {
    return (this.tweets == null) ? null : this.tweets.iterator();
  }

  public void addToTweets(Tweet elem) {
    if (this.tweets == null) {
      this.tweets = new ArrayList<Tweet>();
    }
    this.tweets.add(elem);
  }

  public List<Tweet> getTweets() {
    return this.tweets;
  }

  public TweetSearchResult setTweets(List<Tweet> tweets) {
    this.tweets = tweets;
    return this;
  }

  public void unsetTweets() {
    this.tweets = null;
  }

  /** Returns true if field tweets is set (has been assigned a value) and false otherwise */
  public boolean isSetTweets() {
    return this.tweets != null;
  }

  public void setTweetsIsSet(boolean value) {
    if (!value) {
      this.tweets = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TWEETS:
      if (value == null) {
        unsetTweets();
      } else {
        setTweets((List<Tweet>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TWEETS:
      return getTweets();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TWEETS:
      return isSetTweets();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TweetSearchResult)
      return this.equals((TweetSearchResult)that);
    return false;
  }

  public boolean equals(TweetSearchResult that) {
    if (that == null)
      return false;

    boolean this_present_tweets = true && this.isSetTweets();
    boolean that_present_tweets = true && that.isSetTweets();
    if (this_present_tweets || that_present_tweets) {
      if (!(this_present_tweets && that_present_tweets))
        return false;
      if (!this.tweets.equals(that.tweets))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tweets = true && (isSetTweets());
    list.add(present_tweets);
    if (present_tweets)
      list.add(tweets);

    return list.hashCode();
  }

  @Override
  public int compareTo(TweetSearchResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTweets()).compareTo(other.isSetTweets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTweets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tweets, other.tweets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TweetSearchResult(");
    boolean first = true;

    sb.append("tweets:");
    if (this.tweets == null) {
      sb.append("null");
    } else {
      sb.append(this.tweets);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TweetSearchResultStandardSchemeFactory implements SchemeFactory {
    public TweetSearchResultStandardScheme getScheme() {
      return new TweetSearchResultStandardScheme();
    }
  }

  private static class TweetSearchResultStandardScheme extends StandardScheme<TweetSearchResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TweetSearchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TWEETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.tweets = new ArrayList<Tweet>(_list0.size);
                Tweet _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Tweet();
                  _elem1.read(iprot);
                  struct.tweets.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setTweetsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TweetSearchResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tweets != null) {
        oprot.writeFieldBegin(TWEETS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tweets.size()));
          for (Tweet _iter3 : struct.tweets)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TweetSearchResultTupleSchemeFactory implements SchemeFactory {
    public TweetSearchResultTupleScheme getScheme() {
      return new TweetSearchResultTupleScheme();
    }
  }

  private static class TweetSearchResultTupleScheme extends TupleScheme<TweetSearchResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TweetSearchResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTweets()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTweets()) {
        {
          oprot.writeI32(struct.tweets.size());
          for (Tweet _iter4 : struct.tweets)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TweetSearchResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.tweets = new ArrayList<Tweet>(_list5.size);
          Tweet _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new Tweet();
            _elem6.read(iprot);
            struct.tweets.add(_elem6);
          }
        }
        struct.setTweetsIsSet(true);
      }
    }
  }

}

