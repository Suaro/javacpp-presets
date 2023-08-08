// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::tuple<std::vector<torch::Tensor>,torch::Tensor>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class T_TensorVectorTensor_T extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public T_TensorVectorTensor_T(Pointer p) { super(p); }
    public T_TensorVectorTensor_T(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector value0, @ByRef Tensor value1) { allocate(value0, value1); }
    private native void allocate(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector value0, @ByRef Tensor value1);
    public T_TensorVectorTensor_T()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef T_TensorVectorTensor_T put(@ByRef T_TensorVectorTensor_T x);

    public @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector get0(@ByRef T_TensorVectorTensor_T container);
    public @ByRef Tensor get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef Tensor get1(@ByRef T_TensorVectorTensor_T container);
}
