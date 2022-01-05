package com.google.android.gms.internal.recaptcha;

import i0.h.a.b.g.h.b0;
import i0.h.a.b.g.h.e2;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public class zzdd extends zzde {
    public final byte[] q;

    public zzdd(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.q = bArr;
    }

    public byte b(int i) {
        return this.q[i];
    }

    public int c() {
        return this.q.length;
    }

    public final int e(int i, int i2, int i3) {
        byte[] bArr = this.q;
        int z = z();
        Charset charset = b0.a;
        for (int i4 = z; i4 < z + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzct) || c() != ((zzct) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof zzdd)) {
            return obj.equals(this);
        }
        zzdd zzdd = (zzdd) obj;
        int i = this.d;
        int i2 = zzdd.d;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int c = c();
        if (c > zzdd.c()) {
            int c2 = c();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(c);
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        } else if (c <= zzdd.c()) {
            byte[] bArr = this.q;
            byte[] bArr2 = zzdd.q;
            int z = z() + c;
            int z2 = z();
            int z3 = zzdd.z();
            while (z2 < z) {
                if (bArr[z2] != bArr2[z3]) {
                    return false;
                }
                z2++;
                z3++;
            }
            return true;
        } else {
            int c3 = zzdd.c();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(c);
            sb2.append(", ");
            sb2.append(c3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final zzct k(int i, int i2) {
        int x = zzct.x(0, i2, c());
        if (x == 0) {
            return zzct.c;
        }
        return new zzda(this.q, z(), x);
    }

    public final String v(Charset charset) {
        return new String(this.q, z(), c(), charset);
    }

    public byte w(int i) {
        return this.q[i];
    }

    public final boolean y() {
        int z = z();
        if (e2.a.a(0, this.q, z, c() + z) == 0) {
            return true;
        }
        return false;
    }

    public int z() {
        return 0;
    }
}
