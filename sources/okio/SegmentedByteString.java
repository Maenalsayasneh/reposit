package okio;

import com.google.android.gms.recaptcha.RecaptchaActionType;
import java.security.MessageDigest;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import r0.f;
import r0.u;

/* compiled from: SegmentedByteString.kt */
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] Y1;
    public final transient int[] Z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.c.y);
        i.e(bArr, "segments");
        i.e(iArr, "directory");
        this.Y1 = bArr;
        this.Z1 = iArr;
    }

    public String a() {
        return z().a();
    }

    public ByteString b(String str) {
        i.e(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.Y1.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.Z1;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(this.Y1[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        i.d(digest, "digest.digest()");
        return new ByteString(digest);
    }

    public int e() {
        return this.Z1[this.Y1.length - 1];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.e() == e() && l(0, byteString, 0, e())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return z().f();
    }

    public byte[] g() {
        return y();
    }

    public int hashCode() {
        int i = this.q;
        if (i != 0) {
            return i;
        }
        int length = this.Y1.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.Z1;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.Y1[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.q = i3;
        return i3;
    }

    public byte i(int i) {
        int i2;
        a.A0((long) this.Z1[this.Y1.length - 1], (long) i, 1);
        int m3 = a.m3(this, i);
        if (m3 == 0) {
            i2 = 0;
        } else {
            i2 = this.Z1[m3 - 1];
        }
        int[] iArr = this.Z1;
        byte[][] bArr = this.Y1;
        return bArr[m3][(i - i2) + iArr[bArr.length + m3]];
    }

    public boolean l(int i, ByteString byteString, int i2, int i3) {
        int i4;
        i.e(byteString, RecaptchaActionType.OTHER);
        if (i < 0 || i > e() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m3 = a.m3(this, i);
        while (i < i5) {
            if (m3 == 0) {
                i4 = 0;
            } else {
                i4 = this.Z1[m3 - 1];
            }
            int[] iArr = this.Z1;
            int i6 = iArr[this.Y1.length + m3];
            int min = Math.min(i5, (iArr[m3] - i4) + i4) - i;
            if (!byteString.n(i2, this.Y1[m3], (i - i4) + i6, min)) {
                return false;
            }
            i2 += min;
            i += min;
            m3++;
        }
        return true;
    }

    public boolean n(int i, byte[] bArr, int i2, int i3) {
        int i4;
        i.e(bArr, RecaptchaActionType.OTHER);
        if (i < 0 || i > e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m3 = a.m3(this, i);
        while (i < i5) {
            if (m3 == 0) {
                i4 = 0;
            } else {
                i4 = this.Z1[m3 - 1];
            }
            int[] iArr = this.Z1;
            int i6 = iArr[this.Y1.length + m3];
            int min = Math.min(i5, (iArr[m3] - i4) + i4) - i;
            if (!a.T(this.Y1[m3], (i - i4) + i6, bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            m3++;
        }
        return true;
    }

    public ByteString q() {
        return z().q();
    }

    public String toString() {
        return z().toString();
    }

    public void w(f fVar, int i, int i2) {
        int i3;
        i.e(fVar, "buffer");
        int i4 = i2 + i;
        int m3 = a.m3(this, i);
        while (i < i4) {
            if (m3 == 0) {
                i3 = 0;
            } else {
                i3 = this.Z1[m3 - 1];
            }
            int[] iArr = this.Z1;
            int i5 = iArr[this.Y1.length + m3];
            int min = Math.min(i4, (iArr[m3] - i3) + i3) - i;
            int i6 = (i - i3) + i5;
            u uVar = new u(this.Y1[m3], i6, i6 + min, true, false);
            u uVar2 = fVar.c;
            if (uVar2 == null) {
                uVar.g = uVar;
                uVar.f = uVar;
                fVar.c = uVar;
            } else {
                i.c(uVar2);
                u uVar3 = uVar2.g;
                i.c(uVar3);
                uVar3.b(uVar);
            }
            i += min;
            m3++;
        }
        fVar.d += (long) e();
    }

    public byte[] y() {
        byte[] bArr = new byte[e()];
        int length = this.Y1.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.Z1;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            g.g(this.Y1[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final ByteString z() {
        return new ByteString(y());
    }
}
