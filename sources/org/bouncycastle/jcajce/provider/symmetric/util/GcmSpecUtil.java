package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import s0.a.a.e2.b;
import s0.a.a.r;
import s0.a.b.k0.a;
import s0.a.b.k0.y0;

public class GcmSpecUtil {
    public static final Class gcmSpecClass;
    public static final Method iv;
    public static final Method tLen;

    static {
        Method method;
        Class loadClass = ClassUtil.loadClass(GcmSpecUtil.class, "javax.crypto.spec.GCMParameterSpec");
        gcmSpecClass = loadClass;
        if (loadClass != null) {
            tLen = extractMethod("getTLen");
            method = extractMethod("getIV");
        } else {
            method = null;
            tLen = null;
        }
        iv = method;
    }

    public static a extractAeadParameters(final y0 y0Var, final AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        try {
            return (a) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                public Object run() throws Exception {
                    return new a(y0Var, ((Integer) GcmSpecUtil.tLen.invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) GcmSpecUtil.iv.invoke(algorithmParameterSpec, new Object[0]), (byte[]) null);
                }
            });
        } catch (Exception unused) {
            throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
        }
    }

    public static b extractGcmParameters(final AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        try {
            return (b) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                public Object run() throws Exception {
                    return new b((byte[]) GcmSpecUtil.iv.invoke(algorithmParameterSpec, new Object[0]), ((Integer) GcmSpecUtil.tLen.invoke(algorithmParameterSpec, new Object[0])).intValue() / 8);
                }
            });
        } catch (Exception unused) {
            throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
        }
    }

    public static AlgorithmParameterSpec extractGcmSpec(r rVar) throws InvalidParameterSpecException {
        try {
            b s = b.s(rVar);
            return (AlgorithmParameterSpec) gcmSpecClass.getConstructor(new Class[]{Integer.TYPE, byte[].class}).newInstance(new Object[]{Integer.valueOf(s.d * 8), s.t()});
        } catch (NoSuchMethodException unused) {
            throw new InvalidParameterSpecException("No constructor found!");
        } catch (Exception e) {
            throw new InvalidParameterSpecException(i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("Construction failed: ")));
        }
    }

    private static Method extractMethod(final String str) {
        try {
            return (Method) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                public Object run() throws Exception {
                    return GcmSpecUtil.gcmSpecClass.getDeclaredMethod(str, new Class[0]);
                }
            });
        } catch (PrivilegedActionException unused) {
            return null;
        }
    }

    public static boolean gcmSpecExists() {
        return gcmSpecClass != null;
    }

    public static boolean isGcmSpec(Class cls) {
        return gcmSpecClass == cls;
    }

    public static boolean isGcmSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        Class cls = gcmSpecClass;
        return cls != null && cls.isInstance(algorithmParameterSpec);
    }
}
