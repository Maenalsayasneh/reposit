package i0.h.a.b.g.h;

import com.google.android.gms.internal.recaptcha.zzgv;
import com.google.android.gms.internal.recaptcha.zzhr;
import i0.h.a.b.g.h.x;
import i0.h.a.b.g.h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class v<T extends x<T>> {
    public static final v a = new v(true);
    public final n1<T, Object> b = new m1(16);
    public boolean c;
    public boolean d;

    public v(boolean z) {
        int i = n1.c;
        e();
        e();
    }

    public static Object b(Object obj) {
        if (obj instanceof d1) {
            return ((d1) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if ((r3 instanceof i0.h.a.b.g.h.d0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r3 instanceof java.lang.Integer) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(com.google.android.gms.internal.recaptcha.zzhk r2, java.lang.Object r3) {
        /*
            java.nio.charset.Charset r0 = i0.h.a.b.g.h.b0.a
            java.util.Objects.requireNonNull(r3)
            int[] r0 = i0.h.a.b.g.h.y.a
            com.google.android.gms.internal.recaptcha.zzhr r2 = r2.zza()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x003e;
                case 2: goto L_0x003b;
                case 3: goto L_0x0038;
                case 4: goto L_0x0035;
                case 5: goto L_0x0032;
                case 6: goto L_0x002f;
                case 7: goto L_0x0026;
                case 8: goto L_0x0021;
                case 9: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            r0 = r1
            goto L_0x0040
        L_0x0018:
            boolean r2 = r3 instanceof i0.h.a.b.g.h.y0
            if (r2 != 0) goto L_0x0040
            boolean r2 = r3 instanceof i0.h.a.b.g.h.d0
            if (r2 == 0) goto L_0x0016
            goto L_0x0040
        L_0x0021:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0040
            goto L_0x0016
        L_0x0026:
            boolean r2 = r3 instanceof com.google.android.gms.internal.recaptcha.zzct
            if (r2 != 0) goto L_0x0040
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0016
            goto L_0x0040
        L_0x002f:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0040
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0040
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0040
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0040
        L_0x003b:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0040
        L_0x003e:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.g.h.v.c(com.google.android.gms.internal.recaptcha.zzhk, java.lang.Object):void");
    }

    public static <T extends x<T>> boolean d(Map.Entry<T, Object> entry) {
        x xVar = (x) entry.getKey();
        if (xVar.h() == zzhr.MESSAGE) {
            if (xVar.x()) {
                for (y0 d2 : (List) entry.getValue()) {
                    if (!d2.d()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof y0) {
                    if (!((y0) value).d()) {
                        return false;
                    }
                } else if (value instanceof d0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final Object a(T t) {
        Object obj = this.b.get(t);
        if (!(obj instanceof d0)) {
            return obj;
        }
        d0 d0Var = (d0) obj;
        int i = d0.a;
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        v vVar = new v();
        for (int i = 0; i < this.b.f(); i++) {
            Map.Entry<T, Object> d2 = this.b.d(i);
            vVar.f((x) d2.getKey(), d2.getValue());
        }
        for (Map.Entry next : this.b.h()) {
            vVar.f((x) next.getKey(), next.getValue());
        }
        vVar.d = this.d;
        return vVar;
    }

    public final void e() {
        if (!this.c) {
            this.b.c();
            this.c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return this.b.equals(((v) obj).b);
    }

    public final void f(T t, Object obj) {
        if (!t.x()) {
            c(t.d(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                c(t.d(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof d0) {
            this.d = true;
        }
        this.b.put(t, obj);
    }

    public final void g(Map.Entry<T, Object> entry) {
        d1 d1Var;
        x xVar = (x) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof d0) {
            d0 d0Var = (d0) value;
            int i = d0.a;
            throw new NoSuchMethodError();
        } else if (xVar.x()) {
            Object a2 = a(xVar);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object b2 : (List) value) {
                ((List) a2).add(b(b2));
            }
            this.b.put(xVar, a2);
        } else if (xVar.h() == zzhr.MESSAGE) {
            Object a3 = a(xVar);
            if (a3 == null) {
                this.b.put(xVar, b(value));
                return;
            }
            if (a3 instanceof d1) {
                d1Var = xVar.A((d1) a3, (d1) value);
            } else {
                z zVar = (z) ((z.b) xVar.p(((y0) a3).c(), (y0) value)).g();
                boolean d2 = zVar.d();
                d1Var = zVar;
                if (!d2) {
                    throw new zzgv();
                }
            }
            this.b.put(xVar, d1Var);
        } else {
            this.b.put(xVar, b(value));
        }
    }

    public final boolean h() {
        for (int i = 0; i < this.b.f(); i++) {
            if (!d(this.b.d(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> d2 : this.b.h()) {
            if (!d(d2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public v() {
        int i = n1.c;
    }
}
