package i0.h.a.b.g.h;

import com.stripe.android.model.PaymentMethod;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class d2 {
    public static final Logger a = Logger.getLogger(d2.class.getName());
    public static final Unsafe b;
    public static final Class<?> c = p.a;
    public static final boolean d;
    public static final boolean e;
    public static final c f;
    public static final boolean g;
    public static final boolean h;
    public static final long i = ((long) f(byte[].class));
    public static final boolean j;

    /* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
    public static final class a extends c {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            if (d2.j) {
                return d2.r(obj, j);
            }
            return d2.s(obj, j);
        }

        public final void b(Object obj, long j, double d) {
            e(obj, j, Double.doubleToLongBits(d));
        }

        public final void c(Object obj, long j, float f) {
            d(obj, j, Float.floatToIntBits(f));
        }

        public final void f(Object obj, long j, boolean z) {
            if (d2.j) {
                d2.h(obj, j, z);
            } else {
                d2.k(obj, j, z);
            }
        }

        public final boolean g(Object obj, long j) {
            if (d2.j) {
                if (d2.r(obj, j) != 0) {
                    return true;
                }
                return false;
            } else if (d2.s(obj, j) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float h(Object obj, long j) {
            return Float.intBitsToFloat(j(obj, j));
        }

        public final double i(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }
    }

    /* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
    public static final class b extends c {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            if (d2.j) {
                return d2.r(obj, j);
            }
            return d2.s(obj, j);
        }

        public final void b(Object obj, long j, double d) {
            e(obj, j, Double.doubleToLongBits(d));
        }

        public final void c(Object obj, long j, float f) {
            d(obj, j, Float.floatToIntBits(f));
        }

        public final void f(Object obj, long j, boolean z) {
            if (d2.j) {
                d2.h(obj, j, z);
            } else {
                d2.k(obj, j, z);
            }
        }

        public final boolean g(Object obj, long j) {
            if (d2.j) {
                if (d2.r(obj, j) != 0) {
                    return true;
                }
                return false;
            } else if (d2.s(obj, j) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float h(Object obj, long j) {
            return Float.intBitsToFloat(j(obj, j));
        }

        public final double i(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }
    }

    /* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
    public static abstract class c {
        public Unsafe a;

        public c(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void b(Object obj, long j, double d);

        public abstract void c(Object obj, long j, float f);

        public final void d(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void e(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void f(Object obj, long j, boolean z);

        public abstract boolean g(Object obj, long j);

        public abstract float h(Object obj, long j);

        public abstract double i(Object obj, long j);

        public final int j(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long k(Object obj, long j) {
            return this.a.getLong(obj, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
    public static final class d extends c {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        public final void b(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        public final void c(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        public final void f(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        public final boolean g(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        public final float h(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        public final double i(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0141 A[SYNTHETIC, Splitter:B:38:0x0141] */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<i0.h.a.b.g.h.d2> r0 = i0.h.a.b.g.h.d2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            a = r0
            sun.misc.Unsafe r0 = j()
            b = r0
            java.lang.Class<?> r8 = i0.h.a.b.g.h.p.a
            c = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = n(r8)
            d = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r11 = n(r10)
            e = r11
            r12 = 0
            if (r0 != 0) goto L_0x0038
            goto L_0x0053
        L_0x0038:
            boolean r13 = i0.h.a.b.g.h.p.a()
            if (r13 == 0) goto L_0x004e
            if (r9 == 0) goto L_0x0046
            i0.h.a.b.g.h.d2$a r12 = new i0.h.a.b.g.h.d2$a
            r12.<init>(r0)
            goto L_0x0053
        L_0x0046:
            if (r11 == 0) goto L_0x0053
            i0.h.a.b.g.h.d2$b r12 = new i0.h.a.b.g.h.d2$b
            r12.<init>(r0)
            goto L_0x0053
        L_0x004e:
            i0.h.a.b.g.h.d2$d r12 = new i0.h.a.b.g.h.d2$d
            r12.<init>(r0)
        L_0x0053:
            f = r12
            java.lang.String r9 = "copyMemory"
            java.lang.String r12 = "putLong"
            java.lang.String r13 = "putInt"
            java.lang.String r14 = "getInt"
            java.lang.String r15 = "putByte"
            java.lang.String r11 = "getByte"
            r16 = r1
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            r17 = r2
            java.lang.String r2 = "platform method missing - proto runtime falling back to safer methods: "
            r18 = r3
            java.lang.String r3 = "objectFieldOffset"
            r19 = r4
            java.lang.String r4 = "getLong"
            r20 = r5
            r5 = 1
            r21 = 0
            if (r0 != 0) goto L_0x0080
            r22 = r6
        L_0x007a:
            r24 = r11
        L_0x007c:
            r0 = r21
            goto L_0x0136
        L_0x0080:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x010d }
            r22 = r6
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x010b }
            java.lang.Class<java.lang.reflect.Field> r23 = java.lang.reflect.Field.class
            r6[r21] = r23     // Catch:{ all -> 0x010b }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x010b }
            r6 = 2
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x010b }
            r5[r21] = r7     // Catch:{ all -> 0x010b }
            r6 = 1
            r5[r6] = r8     // Catch:{ all -> 0x010b }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x010b }
            java.lang.reflect.Field r5 = q()     // Catch:{ all -> 0x010b }
            if (r5 != 0) goto L_0x00a1
            goto L_0x007a
        L_0x00a1:
            boolean r5 = i0.h.a.b.g.h.p.a()     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x00ac
            r24 = r11
        L_0x00a9:
            r0 = 1
            goto L_0x0136
        L_0x00ac:
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x010b }
            r6[r21] = r8     // Catch:{ all -> 0x010b }
            r0.getMethod(r11, r6)     // Catch:{ all -> 0x010b }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x010b }
            r6[r21] = r8     // Catch:{ all -> 0x010b }
            java.lang.Class r5 = java.lang.Byte.TYPE     // Catch:{ all -> 0x010b }
            r24 = r11
            r11 = 1
            r6[r11] = r5     // Catch:{ all -> 0x0109 }
            r0.getMethod(r15, r6)     // Catch:{ all -> 0x0109 }
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ all -> 0x0109 }
            r5[r21] = r8     // Catch:{ all -> 0x0109 }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x0109 }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0109 }
            r6[r21] = r8     // Catch:{ all -> 0x0109 }
            r5 = 1
            r6[r5] = r10     // Catch:{ all -> 0x0109 }
            r0.getMethod(r13, r6)     // Catch:{ all -> 0x0109 }
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0109 }
            r6[r21] = r8     // Catch:{ all -> 0x0109 }
            r0.getMethod(r4, r6)     // Catch:{ all -> 0x0109 }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0109 }
            r6[r21] = r8     // Catch:{ all -> 0x0109 }
            r5 = 1
            r6[r5] = r8     // Catch:{ all -> 0x0109 }
            r0.getMethod(r12, r6)     // Catch:{ all -> 0x0109 }
            r6 = 3
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x0109 }
            r10[r21] = r8     // Catch:{ all -> 0x0109 }
            r10[r5] = r8     // Catch:{ all -> 0x0109 }
            r5 = 2
            r10[r5] = r8     // Catch:{ all -> 0x0109 }
            r0.getMethod(r9, r10)     // Catch:{ all -> 0x0109 }
            r5 = 5
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x0109 }
            r5[r21] = r7     // Catch:{ all -> 0x0109 }
            r6 = 1
            r5[r6] = r8     // Catch:{ all -> 0x0109 }
            r6 = 2
            r5[r6] = r7     // Catch:{ all -> 0x0109 }
            r6 = 3
            r5[r6] = r8     // Catch:{ all -> 0x0109 }
            r6 = 4
            r5[r6] = r8     // Catch:{ all -> 0x0109 }
            r0.getMethod(r9, r5)     // Catch:{ all -> 0x0109 }
            goto L_0x00a9
        L_0x0109:
            r0 = move-exception
            goto L_0x0112
        L_0x010b:
            r0 = move-exception
            goto L_0x0110
        L_0x010d:
            r0 = move-exception
            r22 = r6
        L_0x0110:
            r24 = r11
        L_0x0112:
            java.util.logging.Logger r5 = a
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r8 = r0.length()
            int r8 = r8 + 71
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r9.append(r2)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r8 = "supportsUnsafeByteBufferOperations"
            r5.logp(r6, r1, r8, r0)
            goto L_0x007c
        L_0x0136:
            g = r0
            sun.misc.Unsafe r0 = b
            if (r0 != 0) goto L_0x0141
            r23 = r21
            r6 = 1
            goto L_0x0261
        L_0x0141:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x023b }
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0238 }
            java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
            r6[r21] = r8     // Catch:{ all -> 0x0238 }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x0238 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0238 }
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r6[r21] = r8     // Catch:{ all -> 0x0238 }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x0238 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0238 }
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r6[r21] = r5     // Catch:{ all -> 0x023b }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x023b }
            r3 = 2
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x023b }
            r5[r21] = r7     // Catch:{ all -> 0x023b }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x023b }
            r6 = 1
            r5[r6] = r3     // Catch:{ all -> 0x0236 }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x0236 }
            r5 = 3
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x0236 }
            r8[r21] = r7     // Catch:{ all -> 0x0236 }
            r8[r6] = r3     // Catch:{ all -> 0x0236 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x023b }
            r6 = 2
            r8[r6] = r5     // Catch:{ all -> 0x023b }
            r0.getMethod(r13, r8)     // Catch:{ all -> 0x023b }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x023b }
            r5[r21] = r7     // Catch:{ all -> 0x023b }
            r6 = 1
            r5[r6] = r3     // Catch:{ all -> 0x0236 }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x0236 }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0236 }
            r5[r21] = r7     // Catch:{ all -> 0x0236 }
            r5[r6] = r3     // Catch:{ all -> 0x0236 }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x023b }
            r0.getMethod(r12, r5)     // Catch:{ all -> 0x023b }
            java.lang.String r5 = "getObject"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x023b }
            r6[r21] = r7     // Catch:{ all -> 0x023b }
            r4 = 1
            r6[r4] = r3     // Catch:{ all -> 0x0233 }
            r0.getMethod(r5, r6)     // Catch:{ all -> 0x0233 }
            java.lang.String r5 = "putObject"
            r6 = 3
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x0233 }
            r8[r21] = r7     // Catch:{ all -> 0x0233 }
            r8[r4] = r3     // Catch:{ all -> 0x0233 }
            r4 = 2
            r8[r4] = r7     // Catch:{ all -> 0x023b }
            r0.getMethod(r5, r8)     // Catch:{ all -> 0x023b }
            boolean r5 = i0.h.a.b.g.h.p.a()     // Catch:{ all -> 0x023b }
            if (r5 == 0) goto L_0x01be
            r6 = 1
            r23 = 1
            goto L_0x0261
        L_0x01be:
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x023b }
            r5[r21] = r7     // Catch:{ all -> 0x023b }
            r4 = 1
            r5[r4] = r3     // Catch:{ all -> 0x0233 }
            r6 = r24
            r0.getMethod(r6, r5)     // Catch:{ all -> 0x0233 }
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0233 }
            r6[r21] = r7     // Catch:{ all -> 0x0233 }
            r6[r4] = r3     // Catch:{ all -> 0x0233 }
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch:{ all -> 0x023b }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x023b }
            r0.getMethod(r15, r6)     // Catch:{ all -> 0x023b }
            java.lang.String r4 = "getBoolean"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x023b }
            r6[r21] = r7     // Catch:{ all -> 0x023b }
            r5 = 1
            r6[r5] = r3     // Catch:{ all -> 0x0238 }
            r0.getMethod(r4, r6)     // Catch:{ all -> 0x0238 }
            java.lang.String r4 = "putBoolean"
            r6 = 3
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x0238 }
            r8[r21] = r7     // Catch:{ all -> 0x0238 }
            r8[r5] = r3     // Catch:{ all -> 0x0238 }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x023b }
            r6 = 2
            r8[r6] = r5     // Catch:{ all -> 0x023b }
            r0.getMethod(r4, r8)     // Catch:{ all -> 0x023b }
            java.lang.String r4 = "getFloat"
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x023b }
            r5[r21] = r7     // Catch:{ all -> 0x023b }
            r6 = 1
            r5[r6] = r3     // Catch:{ all -> 0x0236 }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x0236 }
            java.lang.String r4 = "putFloat"
            r5 = 3
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x0236 }
            r8[r21] = r7     // Catch:{ all -> 0x0236 }
            r8[r6] = r3     // Catch:{ all -> 0x0236 }
            java.lang.Class r5 = java.lang.Float.TYPE     // Catch:{ all -> 0x023b }
            r6 = 2
            r8[r6] = r5     // Catch:{ all -> 0x023b }
            r0.getMethod(r4, r8)     // Catch:{ all -> 0x023b }
            java.lang.String r4 = "getDouble"
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x023b }
            r5[r21] = r7     // Catch:{ all -> 0x023b }
            r6 = 1
            r5[r6] = r3     // Catch:{ all -> 0x0236 }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x0236 }
            java.lang.String r4 = "putDouble"
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x0236 }
            r5[r21] = r7     // Catch:{ all -> 0x0236 }
            r5[r6] = r3     // Catch:{ all -> 0x0236 }
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ all -> 0x0236 }
            r7 = 2
            r5[r7] = r3     // Catch:{ all -> 0x0236 }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x0236 }
            r23 = r6
            goto L_0x0261
        L_0x0233:
            r0 = move-exception
            r6 = r4
            goto L_0x023d
        L_0x0236:
            r0 = move-exception
            goto L_0x023d
        L_0x0238:
            r0 = move-exception
            r6 = r5
            goto L_0x023d
        L_0x023b:
            r0 = move-exception
            r6 = 1
        L_0x023d:
            java.util.logging.Logger r3 = a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r0.length()
            int r5 = r5 + 71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r7.append(r2)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r2 = "supportsUnsafeArrayOperations"
            r3.logp(r4, r1, r2, r0)
            r23 = r21
        L_0x0261:
            h = r23
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = f(r0)
            long r0 = (long) r0
            i = r0
            f(r22)
            i(r22)
            f(r20)
            i(r20)
            f(r19)
            i(r19)
            f(r18)
            i(r18)
            f(r17)
            i(r17)
            f(r16)
            i(r16)
            java.lang.reflect.Field r0 = q()
            if (r0 == 0) goto L_0x02a0
            i0.h.a.b.g.h.d2$c r1 = f
            if (r1 != 0) goto L_0x029b
            goto L_0x02a0
        L_0x029b:
            sun.misc.Unsafe r1 = r1.a
            r1.objectFieldOffset(r0)
        L_0x02a0:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x02aa
            r5 = r6
            goto L_0x02ac
        L_0x02aa:
            r5 = r21
        L_0x02ac:
            j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.g.h.d2.<clinit>():void");
    }

    public static byte a(byte[] bArr, long j2) {
        return f.a(bArr, i + j2);
    }

    public static int b(Object obj, long j2) {
        return f.j(obj, j2);
    }

    public static <T> T c(Class<T> cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void d(Object obj, long j2, long j3) {
        f.e(obj, j2, j3);
    }

    public static void e(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    public static int f(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static long g(Object obj, long j2) {
        return f.k(obj, j2);
    }

    public static void h(Object obj, long j2, boolean z) {
        byte b2 = z ? (byte) 1 : 0;
        long j3 = -4 & j2;
        int b3 = b(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        c cVar = f;
        cVar.d(obj, j3, ((255 & b2) << i2) | (b3 & (~(255 << i2))));
    }

    public static int i(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new c2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j2, boolean z) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        c cVar = f;
        cVar.d(obj, j3, ((255 & (z ? (byte) 1 : 0)) << i2) | (b(obj, j3) & (~(255 << i2))));
    }

    public static boolean l(Object obj, long j2) {
        return f.g(obj, j2);
    }

    public static float m(Object obj, long j2) {
        return f.h(obj, j2);
    }

    public static boolean n(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!p.a()) {
            return false;
        }
        try {
            Class<?> cls3 = c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static double o(Object obj, long j2) {
        return f.i(obj, j2);
    }

    public static Object p(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    public static Field q() {
        Field field;
        Field field2;
        if (p.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(PaymentMethod.BillingDetails.PARAM_ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static byte r(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    public static byte s(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }
}
