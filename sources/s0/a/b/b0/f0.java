package s0.a.b.b0;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Vector;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e0.z0;
import s0.a.b.k0.m1;
import s0.a.e.b.b0.c.h3;
import s0.a.g.f;

public class f0 implements f {
    public static final Hashtable a = new Hashtable();
    public final z0 b;
    public final int c;
    public long[] d;
    public long[] e;
    public byte[] f;
    public b[] g;
    public b[] h;
    public final c i;
    public final byte[] j = new byte[1];

    public static class a {
        public byte[] a;

        public a(long j) {
            byte[] bArr = new byte[32];
            this.a = bArr;
            bArr[0] = 83;
            bArr[1] = 72;
            bArr[2] = 65;
            bArr[3] = 51;
            bArr[4] = 1;
            bArr[5] = 0;
            z0.g(j, bArr, 8);
        }
    }

    public static class b {
        public int a;
        public byte[] b;

        public b(int i, byte[] bArr) {
            this.a = i;
            this.b = bArr;
        }
    }

    public class c {
        public final d a = new d();
        public byte[] b;
        public int c;
        public long[] d;

        public c(int i) {
            this.b = new byte[i];
            this.d = new long[(i / 8)];
        }

        public void a(long[] jArr) {
            int i = this.c;
            while (true) {
                byte[] bArr = this.b;
                if (i < bArr.length) {
                    bArr[i] = 0;
                    i++;
                } else {
                    long[] jArr2 = this.a.a;
                    jArr2[1] = jArr2[1] | Long.MIN_VALUE;
                    b(jArr);
                    return;
                }
            }
        }

        public final void b(long[] jArr) {
            long[] jArr2;
            f0 f0Var = f0.this;
            f0Var.b.d(true, f0Var.d, this.a.a);
            int i = 0;
            while (true) {
                jArr2 = this.d;
                if (i >= jArr2.length) {
                    break;
                }
                jArr2[i] = z0.c(this.b, i * 8);
                i++;
            }
            f0.this.b.e(jArr2, jArr);
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = jArr[i2] ^ this.d[i2];
            }
        }

        public void c(byte[] bArr, int i, int i2, long[] jArr) {
            int i3 = i2;
            int i4 = 0;
            while (i3 > i4) {
                if (this.c == this.b.length) {
                    b(jArr);
                    this.a.a(false);
                    this.c = 0;
                } else {
                    long[] jArr2 = jArr;
                }
                int min = Math.min(i3 - i4, this.b.length - this.c);
                System.arraycopy(bArr, i + i4, this.b, this.c, min);
                i4 += min;
                this.c += min;
                d dVar = this.a;
                if (dVar.b) {
                    long[] jArr3 = dVar.a;
                    long[] jArr4 = {jArr3[0] & 4294967295L, (jArr3[0] >>> 32) & 4294967295L, jArr3[1] & 4294967295L};
                    long j = (long) min;
                    for (int i5 = 0; i5 < 3; i5++) {
                        long j2 = j + jArr4[i5];
                        jArr4[i5] = j2;
                        j = j2 >>> 32;
                    }
                    long[] jArr5 = dVar.a;
                    jArr5[0] = ((jArr4[1] & 4294967295L) << 32) | (jArr4[0] & 4294967295L);
                    jArr5[1] = (jArr5[1] & -4294967296L) | (jArr4[2] & 4294967295L);
                } else {
                    long[] jArr6 = dVar.a;
                    long j3 = jArr6[0] + ((long) min);
                    jArr6[0] = j3;
                    if (j3 > 9223372034707292160L) {
                        dVar.b = true;
                    }
                }
            }
        }
    }

    public static class d {
        public long[] a;
        public boolean b = false;

        public d() {
            long[] jArr = new long[2];
            this.a = jArr;
            jArr[0] = 0;
            jArr[1] = 0;
            a(true);
        }

        public void a(boolean z) {
            if (z) {
                long[] jArr = this.a;
                jArr[1] = jArr[1] | 4611686018427387904L;
                return;
            }
            long[] jArr2 = this.a;
            jArr2[1] = jArr2[1] & -4611686018427387905L;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            sb.append((int) ((this.a[1] >>> 56) & 63));
            sb.append(" first: ");
            sb.append((this.a[1] & 4611686018427387904L) != 0);
            sb.append(", final: ");
            if ((this.a[1] & Long.MIN_VALUE) == 0) {
                z = false;
            }
            sb.append(z);
            return sb.toString();
        }
    }

    static {
        g(256, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        g(256, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        g(256, 224, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        g(256, 256, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        g(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        g(512, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        g(512, 224, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        g(512, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        g(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public f0(int i2, int i3) {
        if (i3 % 8 == 0) {
            this.c = i3 / 8;
            z0 z0Var = new z0(i2);
            this.b = z0Var;
            this.i = new c(z0Var.e);
            return;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.e0("Output size must be a multiple of 8 bits. :", i3));
    }

    public static b[] b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null) {
            return null;
        }
        if (bVarArr2 == null || bVarArr2.length != bVarArr.length) {
            bVarArr2 = new b[bVarArr.length];
        }
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr2.length);
        return bVarArr2;
    }

    public static void g(int i2, int i3, long[] jArr) {
        a.put(Integer.valueOf((i2 / 8) | ((i3 / 8) << 16)), jArr);
    }

    public static void i(b[] bVarArr) {
        if (bVarArr != null) {
            for (int i2 = 1; i2 < bVarArr.length; i2++) {
                b bVar = bVarArr[i2];
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (bVar.a >= bVarArr[i4].a) {
                        break;
                    }
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                bVarArr[i3] = bVar;
            }
        }
    }

    public f a() {
        f0 f0Var = new f0(this.b.e * 8, this.c * 8);
        f0Var.d(this);
        return f0Var;
    }

    public void c(f fVar) {
        f0 f0Var = (f0) fVar;
        if (this.b.e == f0Var.b.e && this.c == f0Var.c) {
            d(f0Var);
            return;
        }
        throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
    }

    public final void d(f0 f0Var) {
        c cVar = this.i;
        c cVar2 = f0Var.i;
        Objects.requireNonNull(cVar);
        cVar.b = h3.J(cVar2.b, cVar.b);
        cVar.c = cVar2.c;
        cVar.d = h3.M(cVar2.d, cVar.d);
        d dVar = cVar.a;
        d dVar2 = cVar2.a;
        Objects.requireNonNull(dVar);
        dVar.a = h3.M(dVar2.a, dVar.a);
        dVar.b = dVar2.b;
        this.d = h3.M(f0Var.d, this.d);
        this.e = h3.M(f0Var.e, this.e);
        this.f = h3.J(f0Var.f, this.f);
        this.g = b(f0Var.g, this.g);
        this.h = b(f0Var.h, this.h);
    }

    public int e(byte[] bArr, int i2) {
        int i3;
        byte[] bArr2 = bArr;
        c cVar = this.i;
        if (cVar == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        } else if (bArr2.length >= i2 + this.c) {
            cVar.a(this.d);
            if (this.h != null) {
                int i4 = 0;
                while (true) {
                    b[] bVarArr = this.h;
                    if (i4 >= bVarArr.length) {
                        break;
                    }
                    b bVar = bVarArr[i4];
                    j(bVar.a, bVar.b);
                    i4++;
                }
            }
            int i5 = this.b.e;
            int i6 = ((this.c + i5) - 1) / i5;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = i7 * i5;
                int min = Math.min(i5, this.c - i8);
                int i9 = i2 + i8;
                int i10 = 8;
                byte[] bArr3 = new byte[8];
                z0.g((long) i7, bArr3, 0);
                long[] jArr = new long[this.d.length];
                k(63);
                this.i.c(bArr3, 0, 8, jArr);
                this.i.a(jArr);
                int i11 = ((min + 8) - 1) / 8;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i12 * 8;
                    int min2 = Math.min(i10, min - i13);
                    if (min2 == i10) {
                        z0.g(jArr[i12], bArr2, i13 + i9);
                        i3 = i11;
                    } else {
                        i3 = i11;
                        z0.g(jArr[i12], bArr3, 0);
                        System.arraycopy(bArr3, 0, bArr2, i13 + i9, min2);
                    }
                    i12++;
                    i11 = i3;
                    i10 = 8;
                }
            }
            h();
            return this.c;
        } else {
            throw new OutputLengthException("Output buffer is too short to hold output");
        }
    }

    public void f(m1 m1Var) {
        this.d = null;
        this.f = null;
        this.g = null;
        this.h = null;
        int i2 = 0;
        if (m1Var != null) {
            if (((byte[]) m1Var.c.get(0)).length >= 16) {
                Hashtable hashtable = m1Var.c;
                Enumeration keys = hashtable.keys();
                Vector vector = new Vector();
                Vector vector2 = new Vector();
                while (keys.hasMoreElements()) {
                    Integer num = (Integer) keys.nextElement();
                    byte[] bArr = (byte[]) hashtable.get(num);
                    if (num.intValue() == 0) {
                        this.f = bArr;
                    } else if (num.intValue() < 48) {
                        vector.addElement(new b(num.intValue(), bArr));
                    } else {
                        vector2.addElement(new b(num.intValue(), bArr));
                    }
                }
                b[] bVarArr = new b[vector.size()];
                this.g = bVarArr;
                vector.copyInto(bVarArr);
                i(this.g);
                b[] bVarArr2 = new b[vector2.size()];
                this.h = bVarArr2;
                vector2.copyInto(bVarArr2);
                i(this.h);
            } else {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
        }
        long[] jArr = (long[]) a.get(Integer.valueOf((this.c << 16) | this.b.e));
        byte[] bArr2 = this.f;
        if (bArr2 != null || jArr == null) {
            this.d = new long[(this.b.e / 8)];
            if (bArr2 != null) {
                j(0, bArr2);
            }
            j(4, new a((long) (this.c * 8)).a);
        } else {
            this.d = h3.L(jArr);
        }
        if (this.g != null) {
            while (true) {
                b[] bVarArr3 = this.g;
                if (i2 >= bVarArr3.length) {
                    break;
                }
                b bVar = bVarArr3[i2];
                j(bVar.a, bVar.b);
                i2++;
            }
        }
        this.e = h3.L(this.d);
        k(48);
    }

    public void h() {
        long[] jArr = this.e;
        long[] jArr2 = this.d;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        k(48);
    }

    public final void j(int i2, byte[] bArr) {
        k(i2);
        this.i.c(bArr, 0, bArr.length, this.d);
        this.i.a(this.d);
    }

    public final void k(int i2) {
        c cVar = this.i;
        d dVar = cVar.a;
        long[] jArr = dVar.a;
        jArr[0] = 0;
        jArr[1] = 0;
        dVar.b = false;
        dVar.a(true);
        long[] jArr2 = cVar.a.a;
        jArr2[1] = (jArr2[1] & -274877906944L) | ((((long) i2) & 63) << 56);
        cVar.c = 0;
    }

    public void l(byte[] bArr, int i2, int i3) {
        c cVar = this.i;
        if (cVar != null) {
            cVar.c(bArr, i2, i3, this.d);
            return;
        }
        throw new IllegalArgumentException("Skein engine is not initialised.");
    }
}
