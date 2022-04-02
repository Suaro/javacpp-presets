// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSliderConstraint extends btTypedConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSliderConstraint(Pointer p) { super(p); }


	// constructors
	public btSliderConstraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA) { super((Pointer)null); allocate(rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA);
	public btSliderConstraint(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA) { super((Pointer)null); allocate(rbB, frameInB, useLinearReferenceFrameA); }
	private native void allocate(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA);

	// overrides

	public native void getInfo1(btConstraintInfo1 info);

	public native void getInfo1NonVirtual(btConstraintInfo1 info);

	public native void getInfo2(btConstraintInfo2 info);

	public native void getInfo2NonVirtual(btConstraintInfo2 info, @Const @ByRef btTransform transA, @Const @ByRef btTransform transB, @Const @ByRef btVector3 linVelA, @Const @ByRef btVector3 linVelB, @Cast("btScalar") float rbAinvMass, @Cast("btScalar") float rbBinvMass);

	// access
	public native @Const @ByRef btRigidBody getRigidBodyA();
	public native @Const @ByRef btRigidBody getRigidBodyB();
	public native @Const @ByRef btTransform getCalculatedTransformA();
	public native @Const @ByRef btTransform getCalculatedTransformB();
	public native @ByRef btTransform getFrameOffsetA();
	public native @ByRef btTransform getFrameOffsetB();
	public native @Cast("btScalar") float getLowerLinLimit();
	public native void setLowerLinLimit(@Cast("btScalar") float lowerLimit);
	public native @Cast("btScalar") float getUpperLinLimit();
	public native void setUpperLinLimit(@Cast("btScalar") float upperLimit);
	public native @Cast("btScalar") float getLowerAngLimit();
	public native void setLowerAngLimit(@Cast("btScalar") float lowerLimit);
	public native @Cast("btScalar") float getUpperAngLimit();
	public native void setUpperAngLimit(@Cast("btScalar") float upperLimit);
	public native @Cast("bool") boolean getUseLinearReferenceFrameA();
	public native @Cast("btScalar") float getSoftnessDirLin();
	public native @Cast("btScalar") float getRestitutionDirLin();
	public native @Cast("btScalar") float getDampingDirLin();
	public native @Cast("btScalar") float getSoftnessDirAng();
	public native @Cast("btScalar") float getRestitutionDirAng();
	public native @Cast("btScalar") float getDampingDirAng();
	public native @Cast("btScalar") float getSoftnessLimLin();
	public native @Cast("btScalar") float getRestitutionLimLin();
	public native @Cast("btScalar") float getDampingLimLin();
	public native @Cast("btScalar") float getSoftnessLimAng();
	public native @Cast("btScalar") float getRestitutionLimAng();
	public native @Cast("btScalar") float getDampingLimAng();
	public native @Cast("btScalar") float getSoftnessOrthoLin();
	public native @Cast("btScalar") float getRestitutionOrthoLin();
	public native @Cast("btScalar") float getDampingOrthoLin();
	public native @Cast("btScalar") float getSoftnessOrthoAng();
	public native @Cast("btScalar") float getRestitutionOrthoAng();
	public native @Cast("btScalar") float getDampingOrthoAng();
	public native void setSoftnessDirLin(@Cast("btScalar") float softnessDirLin);
	public native void setRestitutionDirLin(@Cast("btScalar") float restitutionDirLin);
	public native void setDampingDirLin(@Cast("btScalar") float dampingDirLin);
	public native void setSoftnessDirAng(@Cast("btScalar") float softnessDirAng);
	public native void setRestitutionDirAng(@Cast("btScalar") float restitutionDirAng);
	public native void setDampingDirAng(@Cast("btScalar") float dampingDirAng);
	public native void setSoftnessLimLin(@Cast("btScalar") float softnessLimLin);
	public native void setRestitutionLimLin(@Cast("btScalar") float restitutionLimLin);
	public native void setDampingLimLin(@Cast("btScalar") float dampingLimLin);
	public native void setSoftnessLimAng(@Cast("btScalar") float softnessLimAng);
	public native void setRestitutionLimAng(@Cast("btScalar") float restitutionLimAng);
	public native void setDampingLimAng(@Cast("btScalar") float dampingLimAng);
	public native void setSoftnessOrthoLin(@Cast("btScalar") float softnessOrthoLin);
	public native void setRestitutionOrthoLin(@Cast("btScalar") float restitutionOrthoLin);
	public native void setDampingOrthoLin(@Cast("btScalar") float dampingOrthoLin);
	public native void setSoftnessOrthoAng(@Cast("btScalar") float softnessOrthoAng);
	public native void setRestitutionOrthoAng(@Cast("btScalar") float restitutionOrthoAng);
	public native void setDampingOrthoAng(@Cast("btScalar") float dampingOrthoAng);
	public native void setPoweredLinMotor(@Cast("bool") boolean onOff);
	public native @Cast("bool") boolean getPoweredLinMotor();
	public native void setTargetLinMotorVelocity(@Cast("btScalar") float targetLinMotorVelocity);
	public native @Cast("btScalar") float getTargetLinMotorVelocity();
	public native void setMaxLinMotorForce(@Cast("btScalar") float maxLinMotorForce);
	public native @Cast("btScalar") float getMaxLinMotorForce();
	public native void setPoweredAngMotor(@Cast("bool") boolean onOff);
	public native @Cast("bool") boolean getPoweredAngMotor();
	public native void setTargetAngMotorVelocity(@Cast("btScalar") float targetAngMotorVelocity);
	public native @Cast("btScalar") float getTargetAngMotorVelocity();
	public native void setMaxAngMotorForce(@Cast("btScalar") float maxAngMotorForce);
	public native @Cast("btScalar") float getMaxAngMotorForce();

	public native @Cast("btScalar") float getLinearPos();
	public native @Cast("btScalar") float getAngularPos();

	// access for ODE solver
	public native @Cast("bool") boolean getSolveLinLimit();
	public native @Cast("btScalar") float getLinDepth();
	public native @Cast("bool") boolean getSolveAngLimit();
	public native @Cast("btScalar") float getAngDepth();
	// shared code used by ODE solver
	public native void calculateTransforms(@Const @ByRef btTransform transA, @Const @ByRef btTransform transB);
	public native void testLinLimits();
	public native void testAngLimits();
	// access for PE Solver
	public native @ByVal btVector3 getAncorInA();
	public native @ByVal btVector3 getAncorInB();
	// access for UseFrameOffset
	public native @Cast("bool") boolean getUseFrameOffset();
	public native void setUseFrameOffset(@Cast("bool") boolean frameOffsetOnOff);

	public native void setFrames(@Const @ByRef btTransform frameA, @Const @ByRef btTransform frameB);

	/**override the default global value of a parameter (such as ERP or CFM), optionally provide the axis (0..5).
	 * If no axis is provided, it uses the default axis for this constraint. */
	public native void setParam(int num, @Cast("btScalar") float value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("btScalar") float value);
	/**return the local value of parameter */
	public native @Cast("btScalar") float getParam(int num, int axis/*=-1*/);
	public native @Cast("btScalar") float getParam(int num);

	public native int getFlags();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}