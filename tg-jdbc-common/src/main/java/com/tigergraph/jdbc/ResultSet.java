package com.tigergraph.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

public abstract class ResultSet implements java.sql.ResultSet {

  protected int currentRowNumber = 0;

  /**
   * Move the index to next ResultSet.
   */
  @Override public final boolean next() throws SQLException {
    boolean result = innerNext();
    if (result == true) {
      currentRowNumber++;
    }
    return result;
  }

  @Override public final int getRow() throws SQLException {
    return currentRowNumber;
  }

  /**
   * Abstract Methods.
   */

  @Override public abstract int getType() throws SQLException;

  @Override public abstract int getConcurrency() throws SQLException;

  @Override public abstract int getHoldability() throws SQLException;

  @Override public abstract ResultSetMetaData getMetaData() throws SQLException;

  @Override public abstract int findColumn(String columnLabel) throws SQLException;

  protected abstract boolean innerNext() throws SQLException;

  @Override public abstract void close() throws SQLException;

  @Override public abstract boolean wasNull() throws SQLException;

  @Override public abstract String getString(int columnIndex) throws SQLException;

  @Override public abstract String getString(String columnLabel) throws SQLException;

  @Override public abstract boolean getBoolean(int columnIndex) throws SQLException;

  @Override public abstract boolean getBoolean(String columnLabel) throws SQLException;

  @Override public abstract Array getArray(int columnIndex) throws SQLException;

  @Override public abstract Array getArray(String columnLabel) throws SQLException;

  @Override public abstract short getShort(int columnIndex) throws SQLException;

  @Override public abstract short getShort(String columnLabel) throws SQLException;

  @Override public abstract int getInt(int columnIndex) throws SQLException;

  @Override public abstract int getInt(String columnLabel) throws SQLException;

  @Override public abstract long getLong(int columnIndex) throws SQLException;

  @Override public abstract long getLong(String columnLabel) throws SQLException;

  @Override public abstract float getFloat(int columnIndex) throws SQLException;

  @Override public abstract float getFloat(String columnLabel) throws SQLException;

  @Override public abstract double getDouble(int columnIndex) throws SQLException;

  @Override public abstract double getDouble(String columnLabel) throws SQLException;

  @Override public abstract Object getObject(int columnIndex) throws SQLException;

  @Override public abstract Object getObject(String columnLabel) throws SQLException;

  /**
   * Methods not implemented yet.
   */

  @Override public byte getByte(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public byte[] getBytes(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Date getDate(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Time getTime(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Timestamp getTimestamp(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public InputStream getAsciiStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public InputStream getBinaryStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public byte getByte(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public byte[] getBytes(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Date getDate(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Time getTime(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Timestamp getTimestamp(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public InputStream getAsciiStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public InputStream getBinaryStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public String getCursorName() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Reader getCharacterStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Reader getCharacterStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean isBeforeFirst() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean isAfterLast() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean isFirst() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean isLast() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void beforeFirst() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void afterLast() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean first() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean last() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean absolute(int row) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean relative(int rows) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean previous() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void setFetchDirection(int direction) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public int getFetchDirection() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean rowUpdated() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean rowInserted() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean rowDeleted() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNull(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBoolean(int columnIndex, boolean x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateByte(int columnIndex, byte x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateShort(int columnIndex, short x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateInt(int columnIndex, int x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateLong(int columnIndex, long x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateFloat(int columnIndex, float x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateDouble(int columnIndex, double x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateString(int columnIndex, String x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBytes(int columnIndex, byte[] x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateDate(int columnIndex, Date x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateTime(int columnIndex, Time x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateObject(int columnIndex, Object x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNull(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBoolean(String columnLabel, boolean x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateByte(String columnLabel, byte x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateShort(String columnLabel, short x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateInt(String columnLabel, int x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateLong(String columnLabel, long x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateFloat(String columnLabel, float x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateDouble(String columnLabel, double x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateString(String columnLabel, String x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBytes(String columnLabel, byte[] x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateDate(String columnLabel, Date x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateTime(String columnLabel, Time x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateObject(String columnLabel, Object x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void insertRow() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateRow() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void deleteRow() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void refreshRow() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void cancelRowUpdates() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void moveToInsertRow() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void moveToCurrentRow() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public java.sql.Statement getStatement() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Ref getRef(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Blob getBlob(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Clob getClob(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Ref getRef(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Blob getBlob(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Clob getClob(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Date getDate(int columnIndex, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Date getDate(String columnLabel, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Time getTime(int columnIndex, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Time getTime(String columnLabel, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public URL getURL(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public URL getURL(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateRef(int columnIndex, Ref x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateRef(String columnLabel, Ref x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBlob(int columnIndex, Blob x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBlob(String columnLabel, Blob x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateClob(int columnIndex, Clob x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateClob(String columnLabel, Clob x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateArray(int columnIndex, java.sql.Array x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateArray(String columnLabel, java.sql.Array x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public RowId getRowId(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public RowId getRowId(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateRowId(int columnIndex, RowId x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateRowId(String columnLabel, RowId x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNString(int columnIndex, String nString) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNString(String columnLabel, String nString) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public NClob getNClob(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public NClob getNClob(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public SQLXML getSQLXML(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public SQLXML getSQLXML(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public String getNString(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public String getNString(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Reader getNCharacterStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public Reader getNCharacterStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateClob(int columnIndex, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateClob(String columnLabel, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNClob(int columnIndex, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void updateNClob(String columnLabel, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public <T> T unwrap(Class<T> iface) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean isWrapperFor(Class<?> iface) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void setFetchSize(int rows) throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public int getFetchSize() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public SQLWarning getWarnings() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public void clearWarnings() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  @Override public boolean isClosed() throws SQLException {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

}

