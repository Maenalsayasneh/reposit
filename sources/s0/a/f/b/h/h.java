package s0.a.f.b.h;

import i0.d.a.a.a;
import java.util.Objects;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.h.g;

public final class h {
    public final j a;
    public final e b;
    public byte[] c;
    public byte[] d;

    public h(j jVar) {
        Objects.requireNonNull(jVar, "params == null");
        this.a = jVar;
        int i = jVar.b;
        this.b = new e(jVar.g, i);
        this.c = new byte[i];
        this.d = new byte[i];
    }

    public final byte[] a(byte[] bArr, int i, int i2, g gVar) {
        int i3 = this.a.b;
        if (bArr.length == i3) {
            gVar.a();
            int i4 = i + i2;
            if (i4 > this.a.c - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i2 == 0) {
                return bArr;
            } else {
                byte[] a2 = a(bArr, i, i2 - 1, gVar);
                g.b bVar = (g.b) ((g.b) new g.b().c(gVar.a)).d(gVar.b);
                bVar.e = gVar.e;
                bVar.f = gVar.f;
                bVar.g = i4 - 1;
                g gVar2 = (g) ((g.b) bVar.b(0)).e();
                byte[] a3 = this.b.a(this.d, gVar2.a());
                g.b bVar2 = (g.b) ((g.b) new g.b().c(gVar2.a)).d(gVar2.b);
                bVar2.e = gVar2.e;
                bVar2.f = gVar2.f;
                bVar2.g = gVar2.g;
                byte[] a4 = this.b.a(this.d, ((g) ((g.b) bVar2.b(1)).e()).a());
                byte[] bArr2 = new byte[i3];
                for (int i5 = 0; i5 < i3; i5++) {
                    bArr2[i5] = (byte) (a2[i5] ^ a4[i5]);
                }
                e eVar = this.b;
                Objects.requireNonNull(eVar);
                int length = a3.length;
                int i6 = eVar.b;
                if (length != i6) {
                    throw new IllegalArgumentException("wrong key length");
                } else if (i3 == i6) {
                    return eVar.b(0, a3, bArr2);
                } else {
                    throw new IllegalArgumentException("wrong in length");
                }
            }
        } else {
            throw new IllegalArgumentException(a.g0("startHash needs to be ", i3, "bytes"));
        }
    }

    public k b(g gVar) {
        byte[][] bArr = new byte[this.a.d][];
        int i = 0;
        while (true) {
            j jVar = this.a;
            if (i >= jVar.d) {
                return new k(jVar, bArr);
            }
            g.b bVar = (g.b) ((g.b) new g.b().c(gVar.a)).d(gVar.b);
            bVar.e = gVar.e;
            bVar.f = i;
            bVar.g = gVar.g;
            gVar = (g) ((g.b) bVar.b(gVar.d)).e();
            if (i >= 0 && i < this.a.d) {
                bArr[i] = a(this.b.a(this.c, h3.s3((long) i, 32)), 0, this.a.c - 1, gVar);
                i++;
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public byte[] c(byte[] bArr, g gVar) {
        g.b bVar = (g.b) ((g.b) new g.b().c(gVar.a)).d(gVar.b);
        bVar.e = gVar.e;
        return this.b.a(bArr, ((g) bVar.e()).a());
    }

    public void d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.a.b;
        if (length == i) {
            Objects.requireNonNull(bArr2, "publicSeed == null");
            if (bArr2.length == i) {
                this.c = bArr;
                this.d = bArr2;
                return;
            }
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
    }
}
