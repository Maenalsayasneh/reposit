package m0.r.t.a.r.h;

import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.j.f.p.h;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType;
import m0.r.t.a.r.h.f.a;
import m0.r.t.a.r.h.l;

/* compiled from: FieldSet */
public final class f<FieldDescriptorType extends a<FieldDescriptorType>> {
    public static final f a = new f(true);
    public final q<FieldDescriptorType, Object> b;
    public boolean c;
    public boolean d = false;

    /* compiled from: FieldSet */
    public interface a<T extends a<T>> extends Comparable<T> {
        WireFormat$JavaType J();

        boolean R();

        l.a c(l.a aVar, l lVar);

        int getNumber();

        boolean k();

        WireFormat$FieldType m();
    }

    public f() {
        int i = q.c;
        this.b = new p(16);
    }

    public static int d(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return CodedOutputStream.h(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.h(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes(FileEncryptionUtil.ENCODING_UTF_8);
                    return CodedOutputStream.g(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((l) obj).e();
            case 10:
                if (!(obj instanceof g)) {
                    return CodedOutputStream.f((l) obj);
                }
                g gVar = (g) obj;
                if (gVar.a) {
                    int e2 = gVar.b.e();
                    return CodedOutputStream.g(e2) + e2;
                }
                throw null;
            case 11:
                if (obj instanceof c) {
                    return CodedOutputStream.a((c) obj);
                }
                byte[] bArr = (byte[]) obj;
                return CodedOutputStream.g(bArr.length) + bArr.length;
            case 12:
                return CodedOutputStream.g(((Integer) obj).intValue());
            case 13:
                if (obj instanceof Internal.a) {
                    return CodedOutputStream.d(((Internal.a) obj).getNumber());
                }
                return CodedOutputStream.d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.g((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.h((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(a<?> aVar, Object obj) {
        int i;
        int d2;
        WireFormat$FieldType m = aVar.m();
        int number = aVar.getNumber();
        if (aVar.k()) {
            int i2 = 0;
            if (aVar.R()) {
                for (Object d3 : (List) obj) {
                    i2 += d(m, d3);
                }
                i = CodedOutputStream.i(number) + i2;
                d2 = CodedOutputStream.g(i2);
            } else {
                for (Object next : (List) obj) {
                    int i3 = CodedOutputStream.i(number);
                    if (m == WireFormat$FieldType.GROUP) {
                        i3 *= 2;
                    }
                    i2 += d(m, next) + i3;
                }
                return i2;
            }
        } else {
            i = CodedOutputStream.i(number);
            if (m == WireFormat$FieldType.GROUP) {
                i *= 2;
            }
            d2 = d(m, obj);
        }
        return d2 + i;
    }

    public static int g(WireFormat$FieldType wireFormat$FieldType, boolean z) {
        if (z) {
            return 2;
        }
        return wireFormat$FieldType.getWireType();
    }

    public static Object k(d dVar, WireFormat$FieldType wireFormat$FieldType, boolean z) throws IOException {
        byte[] bArr;
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(dVar.k()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(dVar.j()));
            case 2:
                return Long.valueOf(dVar.m());
            case 3:
                return Long.valueOf(dVar.m());
            case 4:
                return Integer.valueOf(dVar.l());
            case 5:
                return Long.valueOf(dVar.k());
            case 6:
                return Integer.valueOf(dVar.j());
            case 7:
                return Boolean.valueOf(dVar.e());
            case 8:
                if (z) {
                    int l = dVar.l();
                    int i = dVar.e;
                    if (l <= dVar.c - i && l > 0) {
                        bArr = dVar.a;
                        dVar.e = i + l;
                    } else if (l == 0) {
                        return "";
                    } else {
                        bArr = dVar.i(l);
                        i = 0;
                    }
                    if (h.A2(bArr, i, i + l)) {
                        return new String(bArr, i, l, FileEncryptionUtil.ENCODING_UTF_8);
                    }
                    throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
                }
                int l2 = dVar.l();
                if (l2 <= dVar.c - dVar.e && l2 > 0) {
                    String str = new String(dVar.a, dVar.e, l2, FileEncryptionUtil.ENCODING_UTF_8);
                    dVar.e += l2;
                    return str;
                } else if (l2 == 0) {
                    return "";
                } else {
                    return new String(dVar.i(l2), FileEncryptionUtil.ENCODING_UTF_8);
                }
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return dVar.f();
            case 12:
                return Integer.valueOf(dVar.l());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(dVar.j());
            case 15:
                return Long.valueOf(dVar.k());
            case 16:
                int l3 = dVar.l();
                return Integer.valueOf((-(l3 & 1)) ^ (l3 >>> 1));
            case 17:
                long m = dVar.m();
                return Long.valueOf((-(m & 1)) ^ (m >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if ((r3 instanceof m0.r.t.a.r.h.g) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.a) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2, java.lang.Object r3) {
        /*
            java.util.Objects.requireNonNull(r3)
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L_0x003e;
                case 1: goto L_0x003b;
                case 2: goto L_0x0038;
                case 3: goto L_0x0035;
                case 4: goto L_0x0032;
                case 5: goto L_0x002f;
                case 6: goto L_0x0023;
                case 7: goto L_0x001a;
                case 8: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0040
        L_0x0011:
            boolean r2 = r3 instanceof m0.r.t.a.r.h.l
            if (r2 != 0) goto L_0x002d
            boolean r2 = r3 instanceof m0.r.t.a.r.h.g
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x001a:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x002d
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.a
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x0023:
            boolean r2 = r3 instanceof m0.r.t.a.r.h.c
            if (r2 != 0) goto L_0x002d
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            r1 = r0
            goto L_0x0040
        L_0x002f:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0040
        L_0x0032:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0040
        L_0x0035:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0040
        L_0x0038:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0040
        L_0x003b:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0040
        L_0x003e:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.h.f.m(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public static void n(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            int i2 = i << 3;
            codedOutputStream.y(i2 | 3);
            ((l) obj).d(codedOutputStream);
            codedOutputStream.y(i2 | 4);
            return;
        }
        codedOutputStream.y((i << 3) | g(wireFormat$FieldType, false));
        o(codedOutputStream, wireFormat$FieldType, obj);
    }

    public static void o(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, Object obj) throws IOException {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                codedOutputStream.x(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                codedOutputStream.w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                codedOutputStream.z(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.z(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.q(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.x(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.w(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.t(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                byte[] bytes = ((String) obj).getBytes(FileEncryptionUtil.ENCODING_UTF_8);
                codedOutputStream.y(bytes.length);
                codedOutputStream.v(bytes);
                return;
            case 9:
                ((l) obj).d(codedOutputStream);
                return;
            case 10:
                codedOutputStream.s((l) obj);
                return;
            case 11:
                if (obj instanceof c) {
                    codedOutputStream.m((c) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.y(bArr.length);
                codedOutputStream.v(bArr);
                return;
            case 12:
                codedOutputStream.y(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof Internal.a) {
                    codedOutputStream.o(((Internal.a) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.o(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.w(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.x(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.y((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.z((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (((GeneratedMessageLite.d) fielddescriptortype).x) {
            m(((GeneratedMessageLite.d) fielddescriptortype).q, obj);
            Object f = f(fielddescriptortype);
            if (f == null) {
                list = new ArrayList();
                this.b.h(fielddescriptortype, list);
            } else {
                list = (List) f;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public f<FieldDescriptorType> clone() {
        f<FieldDescriptorType> fVar = new f<>();
        for (int i = 0; i < this.b.d(); i++) {
            Map.Entry<FieldDescriptorType, Object> c2 = this.b.c(i);
            fVar.l((a) c2.getKey(), c2.getValue());
        }
        for (Map.Entry next : this.b.f()) {
            fVar.l((a) next.getKey(), next.getValue());
        }
        fVar.d = this.d;
        return fVar;
    }

    public final Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public Object f(FieldDescriptorType fielddescriptortype) {
        Object obj = this.b.get(fielddescriptortype);
        return obj instanceof g ? ((g) obj).a() : obj;
    }

    public final boolean h(Map.Entry<FieldDescriptorType, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.J() == WireFormat$JavaType.MESSAGE) {
            if (aVar.k()) {
                for (l g : (List) entry.getValue()) {
                    if (!g.g()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof l) {
                    if (!((l) value).g()) {
                        return false;
                    }
                } else if (value instanceof g) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public void i() {
        if (!this.c) {
            p pVar = (p) this.b;
            if (!pVar.y) {
                for (int i = 0; i < pVar.d(); i++) {
                    Map.Entry c2 = pVar.c(i);
                    if (((a) c2.getKey()).k()) {
                        c2.setValue(Collections.unmodifiableList((List) c2.getValue()));
                    }
                }
                for (Map.Entry entry : pVar.f()) {
                    if (((a) entry.getKey()).k()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            if (!pVar.y) {
                pVar.x = pVar.x.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(pVar.x);
                pVar.y = true;
            }
            this.c = true;
        }
    }

    public final void j(Map.Entry<FieldDescriptorType, Object> entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof g) {
            value = ((g) value).a();
        }
        if (aVar.k()) {
            Object f = f(aVar);
            if (f == null) {
                f = new ArrayList();
            }
            for (Object c2 : (List) value) {
                ((List) f).add(c(c2));
            }
            this.b.h(aVar, f);
        } else if (aVar.J() == WireFormat$JavaType.MESSAGE) {
            Object f2 = f(aVar);
            if (f2 == null) {
                this.b.h(aVar, c(value));
                return;
            }
            this.b.h(aVar, aVar.c(((l) f2).c(), (l) value).build());
        } else {
            this.b.h(aVar, c(value));
        }
    }

    public void l(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.k()) {
            m(fielddescriptortype.m(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m(fielddescriptortype.m(), it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof g) {
            this.d = true;
        }
        this.b.h(fielddescriptortype, obj);
    }

    public f(boolean z) {
        int i = q.c;
        this.b = new p(0);
        i();
    }
}
