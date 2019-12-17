// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class RecordBatch
 *  \brief Collection of equal-length arrays matching a particular Schema
 * 
 *  A record batch is table-like data structure that is semantically a sequence
 *  of fields, each a contiguous Arrow array */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class RecordBatch extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordBatch(Pointer p) { super(p); }


  /** @param schema [in] The record batch schema
   *  @param num_rows [in] length of fields in the record batch. Each array
   *  should have the same length as num_rows
   *  @param columns [in] the record batch fields as vector of arrays */
  public static native @SharedPtr @ByVal RecordBatch Make(
        @SharedPtr Schema schema, @Cast("int64_t") long num_rows,
        @Const @ByRef ArrayVector columns);

  /** \brief Move-based constructor for a vector of Array instances */

  /** \brief Construct record batch from vector of internal data structures
   *  @since 0.5.0
   * 
   *  This class is only provided with an rvalue-reference for the input data,
   *  and is intended for internal use, or advanced users.
   * 
   *  @param schema the record batch schema
   *  @param num_rows the number of semantic rows in the record batch. This
   *  should be equal to the length of each field
   *  @param columns the data for the batch's columns */
  public static native @SharedPtr @ByVal RecordBatch Make(
        @SharedPtr Schema schema, @Cast("int64_t") long num_rows,
        @ByVal ArrayDataVector columns);

  /** \brief Construct record batch by copying vector of array data
   *  @since 0.5.0 */

  public static native @ByVal Status FromStructArray(@Const @SharedPtr @ByRef Array array,
                                  @SharedPtr RecordBatch out);

  /** \brief Determine if two record batches are exactly equal
   *  @return true if batches are equal */
  public native @Cast("bool") boolean Equals(@Const @ByRef RecordBatch other);

  /** \brief Determine if two record batches are approximately equal */
  public native @Cast("bool") boolean ApproxEquals(@Const @ByRef RecordBatch other);

  // \return the table's schema
  /** @return true if batches are equal */
  public native @SharedPtr Schema schema();

  /** \brief Retrieve an array from the record batch
   *  @param i [in] field index, does not boundscheck
   *  @return an Array object */
  public native @SharedPtr @ByVal Array column(int i);

  /** \brief Retrieve an array from the record batch
   *  @param name [in] field name
   *  @return an Array or null if no field was found */
  public native @SharedPtr @ByVal Array GetColumnByName(@StdString String name);
  public native @SharedPtr @ByVal Array GetColumnByName(@StdString BytePointer name);

  /** \brief Retrieve an array's internaldata from the record batch
   *  @param i [in] field index, does not boundscheck
   *  @return an internal ArrayData object */
  
  ///
  public native @SharedPtr @ByVal ArrayData column_data(int i);

  /** \brief Add column to the record batch, producing a new RecordBatch
   * 
   *  @param i [in] field index, which will be boundschecked
   *  @param field [in] field to be added
   *  @param column [in] column to be added
   *  @param out [out] record batch with column added */
  
  ///
  ///
  public native @ByVal Status AddColumn(int i, @Const @SharedPtr @ByRef Field field,
                             @Const @SharedPtr @ByRef Array column,
                             @SharedPtr RecordBatch out);

  /** \brief Add new nullable column to the record batch, producing a new
   *  RecordBatch.
   * 
   *  For non-nullable columns, use the Field-based version of this method.
   * 
   *  @param i [in] field index, which will be boundschecked
   *  @param field_name [in] name of field to be added
   *  @param column [in] column to be added
   *  @param out [out] record batch with column added */
  
  ///
  public native @ByVal Status AddColumn(int i, @StdString String field_name,
                             @Const @SharedPtr @ByRef Array column,
                             @SharedPtr RecordBatch out);
  public native @ByVal Status AddColumn(int i, @StdString BytePointer field_name,
                             @Const @SharedPtr @ByRef Array column,
                             @SharedPtr RecordBatch out);

  /** \brief Remove column from the record batch, producing a new RecordBatch
   * 
   *  @param i [in] field index, does boundscheck
   *  @param out [out] record batch with column removed */
  public native @ByVal Status RemoveColumn(int i, @SharedPtr RecordBatch out);

  public native @SharedPtr @ByVal RecordBatch ReplaceSchemaMetadata(
        @Const @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef KeyValueMetadata metadata);

  /** \brief Name in i-th column */
  public native @StdString String column_name(int i);

  /** @return the number of columns in the table */
  public native int num_columns();

  /** @return the number of rows (the corresponding length of each column) */
  public native @Cast("int64_t") long num_rows();

  /** \brief Slice each of the arrays in the record batch
   *  @param offset [in] the starting offset to slice, through end of batch
   *  @return new record batch */
  public native @SharedPtr @ByVal RecordBatch Slice(@Cast("int64_t") long offset);

  /** \brief Slice each of the arrays in the record batch
   *  @param offset [in] the starting offset to slice
   *  @param length [in] the number of elements to slice from offset
   *  @return new record batch */
  public native @SharedPtr @ByVal RecordBatch Slice(@Cast("int64_t") long offset, @Cast("int64_t") long length);

  /** \brief Check for schema or length inconsistencies
   *  @return Status */
  public native @ByVal Status Validate();
}