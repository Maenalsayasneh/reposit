package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.j.p.b;
import m0.r.t.a.r.j.p.c;
import m0.r.t.a.r.j.p.d;
import m0.r.t.a.r.j.p.e;
import m0.r.t.a.r.j.p.h;
import m0.r.t.a.r.j.p.k;
import m0.r.t.a.r.j.p.l;
import m0.r.t.a.r.j.p.p;
import m0.r.t.a.r.j.p.q;
import m0.r.t.a.r.j.p.r;
import m0.r.t.a.r.j.p.s;

/* compiled from: ConstantValueFactory.kt */
public final class ConstantValueFactory {
    public static final b a(List<?> list, PrimitiveType primitiveType) {
        List<T> v02 = g.v0(list);
        ArrayList arrayList = new ArrayList();
        for (T b : v02) {
            m0.r.t.a.r.j.p.g<?> b2 = b(b);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return new b(arrayList, new ConstantValueFactory$createArrayValue$3(primitiveType));
    }

    public static final m0.r.t.a.r.j.p.g<?> b(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new r(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new l(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new p(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new k(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new h(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new s((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            i.e(bArr, "$this$toList");
            int length = bArr.length;
            if (length == 0) {
                arrayList8 = EmptyList.c;
            } else if (length != 1) {
                i.e(bArr, "$this$toMutableList");
                ArrayList arrayList9 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    arrayList9.add(Byte.valueOf(bArr[i]));
                    i++;
                }
                arrayList8 = arrayList9;
            } else {
                arrayList8 = i0.j.f.p.h.L2(Byte.valueOf(bArr[0]));
            }
            return a(arrayList8, PrimitiveType.BYTE);
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            i.e(sArr, "$this$toList");
            int length3 = sArr.length;
            if (length3 == 0) {
                arrayList7 = EmptyList.c;
            } else if (length3 != 1) {
                i.e(sArr, "$this$toMutableList");
                ArrayList arrayList10 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    arrayList10.add(Short.valueOf(sArr[i]));
                    i++;
                }
                arrayList7 = arrayList10;
            } else {
                arrayList7 = i0.j.f.p.h.L2(Short.valueOf(sArr[0]));
            }
            return a(arrayList7, PrimitiveType.SHORT);
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            i.e(iArr, "$this$toList");
            int length5 = iArr.length;
            if (length5 == 0) {
                arrayList6 = EmptyList.c;
            } else if (length5 != 1) {
                i.e(iArr, "$this$toMutableList");
                ArrayList arrayList11 = new ArrayList(iArr.length);
                int length6 = iArr.length;
                while (i < length6) {
                    arrayList11.add(Integer.valueOf(iArr[i]));
                    i++;
                }
                arrayList6 = arrayList11;
            } else {
                arrayList6 = i0.j.f.p.h.L2(Integer.valueOf(iArr[0]));
            }
            return a(arrayList6, PrimitiveType.INT);
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            i.e(jArr, "$this$toList");
            int length7 = jArr.length;
            if (length7 == 0) {
                arrayList5 = EmptyList.c;
            } else if (length7 != 1) {
                i.e(jArr, "$this$toMutableList");
                ArrayList arrayList12 = new ArrayList(jArr.length);
                int length8 = jArr.length;
                while (i < length8) {
                    arrayList12.add(Long.valueOf(jArr[i]));
                    i++;
                }
                arrayList5 = arrayList12;
            } else {
                arrayList5 = i0.j.f.p.h.L2(Long.valueOf(jArr[0]));
            }
            return a(arrayList5, PrimitiveType.LONG);
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            i.e(cArr, "$this$toList");
            int length9 = cArr.length;
            if (length9 == 0) {
                arrayList4 = EmptyList.c;
            } else if (length9 != 1) {
                i.e(cArr, "$this$toMutableList");
                ArrayList arrayList13 = new ArrayList(cArr.length);
                int length10 = cArr.length;
                while (i < length10) {
                    arrayList13.add(Character.valueOf(cArr[i]));
                    i++;
                }
                arrayList4 = arrayList13;
            } else {
                arrayList4 = i0.j.f.p.h.L2(Character.valueOf(cArr[0]));
            }
            return a(arrayList4, PrimitiveType.CHAR);
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            i.e(fArr, "$this$toList");
            int length11 = fArr.length;
            if (length11 == 0) {
                arrayList3 = EmptyList.c;
            } else if (length11 != 1) {
                i.e(fArr, "$this$toMutableList");
                ArrayList arrayList14 = new ArrayList(fArr.length);
                int length12 = fArr.length;
                while (i < length12) {
                    arrayList14.add(Float.valueOf(fArr[i]));
                    i++;
                }
                arrayList3 = arrayList14;
            } else {
                arrayList3 = i0.j.f.p.h.L2(Float.valueOf(fArr[0]));
            }
            return a(arrayList3, PrimitiveType.FLOAT);
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            i.e(dArr, "$this$toList");
            int length13 = dArr.length;
            if (length13 == 0) {
                arrayList2 = EmptyList.c;
            } else if (length13 != 1) {
                i.e(dArr, "$this$toMutableList");
                ArrayList arrayList15 = new ArrayList(dArr.length);
                int length14 = dArr.length;
                while (i < length14) {
                    arrayList15.add(Double.valueOf(dArr[i]));
                    i++;
                }
                arrayList2 = arrayList15;
            } else {
                arrayList2 = i0.j.f.p.h.L2(Double.valueOf(dArr[0]));
            }
            return a(arrayList2, PrimitiveType.DOUBLE);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            i.e(zArr, "$this$toList");
            int length15 = zArr.length;
            if (length15 == 0) {
                arrayList = EmptyList.c;
            } else if (length15 != 1) {
                i.e(zArr, "$this$toMutableList");
                ArrayList arrayList16 = new ArrayList(zArr.length);
                int length16 = zArr.length;
                while (i < length16) {
                    arrayList16.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
                arrayList = arrayList16;
            } else {
                arrayList = i0.j.f.p.h.L2(Boolean.valueOf(zArr[0]));
            }
            return a(arrayList, PrimitiveType.BOOLEAN);
        } else if (obj == null) {
            return new q();
        } else {
            return null;
        }
    }
}
