package r0;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import m0.j.g;
import m0.n.b.i;

/* compiled from: Segment.kt */
public final class u {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public u f;
    public u g;

    public u() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final u a() {
        u uVar = this.f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.g;
        i.c(uVar2);
        uVar2.f = this.f;
        u uVar3 = this.f;
        i.c(uVar3);
        uVar3.g = this.g;
        this.f = null;
        this.g = null;
        return uVar;
    }

    public final u b(u uVar) {
        i.e(uVar, "segment");
        uVar.g = this;
        uVar.f = this.f;
        u uVar2 = this.f;
        i.c(uVar2);
        uVar2.g = uVar;
        this.f = uVar;
        return uVar;
    }

    public final u c() {
        this.d = true;
        return new u(this.a, this.b, this.c, true, false);
    }

    public final void d(u uVar, int i) {
        i.e(uVar, "sink");
        if (uVar.e) {
            int i2 = uVar.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!uVar.d) {
                    int i4 = uVar.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = uVar.a;
                        g.i(bArr, bArr, 0, i4, i2, 2);
                        uVar.c -= uVar.b;
                        uVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = uVar.a;
            int i5 = uVar.c;
            int i6 = this.b;
            g.g(bArr2, bArr3, i5, i6, i6 + i);
            uVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public u(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        i.e(bArr, MessageExtension.FIELD_DATA);
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
