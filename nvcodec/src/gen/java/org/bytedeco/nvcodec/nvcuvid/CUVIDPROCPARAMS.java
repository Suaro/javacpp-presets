// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;



/******************************************************/
/** \struct CUVIDPROCPARAMS
/** Picture parameters for postprocessing
/** This structure is used in cuvidMapVideoFrame API
/******************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDPROCPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDPROCPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDPROCPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDPROCPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDPROCPARAMS position(long position) {
        return (CUVIDPROCPARAMS)super.position(position);
    }
    @Override public CUVIDPROCPARAMS getPointer(long i) {
        return new CUVIDPROCPARAMS((Pointer)this).position(position + i);
    }

    /** IN: Input is progressive (deinterlace_mode will be ignored)                */
    public native int progressive_frame(); public native CUVIDPROCPARAMS progressive_frame(int setter);
    /** IN: Output the second field (ignored if deinterlace mode is Weave)         */
    public native int second_field(); public native CUVIDPROCPARAMS second_field(int setter);
    /** IN: Input frame is top field first (1st field is top, 2nd field is bottom) */
    public native int top_field_first(); public native CUVIDPROCPARAMS top_field_first(int setter);
    /** IN: Input only contains one field (2nd field is invalid)                   */
    public native int unpaired_field(); public native CUVIDPROCPARAMS unpaired_field(int setter);
    // The fields below are used for raw YUV input
    /** Reserved for future use (set to zero)                                      */
    public native @Cast("unsigned int") int reserved_flags(); public native CUVIDPROCPARAMS reserved_flags(int setter);
    /** Reserved (set to zero)                                                     */
    public native @Cast("unsigned int") int reserved_zero(); public native CUVIDPROCPARAMS reserved_zero(int setter);
    /** IN: Input CUdeviceptr for raw YUV extensions                               */
    public native @Cast("unsigned long long") long raw_input_dptr(); public native CUVIDPROCPARAMS raw_input_dptr(long setter);
    /** IN: pitch in bytes of raw YUV input (should be aligned appropriately)      */
    public native @Cast("unsigned int") int raw_input_pitch(); public native CUVIDPROCPARAMS raw_input_pitch(int setter);
    /** IN: Input YUV format (cudaVideoCodec_enum)                                 */
    public native @Cast("unsigned int") int raw_input_format(); public native CUVIDPROCPARAMS raw_input_format(int setter);
    /** IN: Output CUdeviceptr for raw YUV extensions                              */
    public native @Cast("unsigned long long") long raw_output_dptr(); public native CUVIDPROCPARAMS raw_output_dptr(long setter);
    /** IN: pitch in bytes of raw YUV output (should be aligned appropriately)     */
    public native @Cast("unsigned int") int raw_output_pitch(); public native CUVIDPROCPARAMS raw_output_pitch(int setter);
    /** Reserved for future use (set to zero)                                      */
    public native @Cast("unsigned int") int Reserved1(); public native CUVIDPROCPARAMS Reserved1(int setter);
    /** IN: stream object used by cuvidMapVideoFrame                               */
    public native CUstream_st output_stream(); public native CUVIDPROCPARAMS output_stream(CUstream_st setter);
    /** Reserved for future use (set to zero)                                      */
    public native @Cast("unsigned int") int Reserved(int i); public native CUVIDPROCPARAMS Reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer Reserved();
    /** OUT: Output CUdeviceptr for histogram extensions                           */
    public native @Cast("unsigned long long*") LongPointer histogram_dptr(); public native CUVIDPROCPARAMS histogram_dptr(LongPointer setter);
    /** Reserved for future use (set to zero)                                      */
    public native Pointer Reserved2(int i); public native CUVIDPROCPARAMS Reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer Reserved2();
}