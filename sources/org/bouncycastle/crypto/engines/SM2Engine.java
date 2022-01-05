package org.bouncycastle.crypto.engines;

import i0.d.a.a.a;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.i;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.d1;
import s0.a.b.k0.w;
import s0.a.b.k0.z;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.b;
import s0.a.g.f;

public class SM2Engine {
    public final n a;
    public final Mode b;
    public boolean c;
    public z d;
    public w e;
    public int f;
    public SecureRandom g;

    public enum Mode {
        C1C2C3,
        C1C3C2
    }

    public SM2Engine(n nVar) {
        Mode mode = Mode.C1C2C3;
        if (mode != null) {
            this.a = nVar;
            this.b = mode;
            return;
        }
        throw new IllegalArgumentException("mode cannot be NULL");
    }

    public final void a(n nVar, g gVar) {
        byte[] b2 = b.b(this.f, gVar.t());
        nVar.update(b2, 0, b2.length);
    }

    public void b(boolean z, i iVar) {
        this.c = z;
        if (z) {
            d1 d1Var = (d1) iVar;
            z zVar = (z) d1Var.d;
            this.d = zVar;
            w wVar = zVar.d;
            this.e = wVar;
            if (!((c0) zVar).q.o(wVar.k).m()) {
                this.g = d1Var.c;
            } else {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
        } else {
            z zVar2 = (z) iVar;
            this.d = zVar2;
            this.e = zVar2.d;
        }
        this.f = (this.e.g.l() + 7) / 8;
    }

    public final void c(n nVar, h hVar, byte[] bArr) {
        f fVar;
        n nVar2 = nVar;
        byte[] bArr2 = bArr;
        int digestSize = nVar.getDigestSize();
        byte[] bArr3 = new byte[Math.max(4, digestSize)];
        f fVar2 = null;
        if (nVar2 instanceof f) {
            a(nVar2, hVar.d());
            a(nVar2, hVar.e());
            f fVar3 = (f) nVar2;
            f fVar4 = fVar3;
            fVar2 = fVar3.a();
            fVar = fVar4;
        } else {
            fVar = null;
        }
        int i = 0;
        int i2 = 0;
        while (i < bArr2.length) {
            if (fVar != null) {
                fVar.c(fVar2);
            } else {
                a(nVar2, hVar.d());
                a(nVar2, hVar.e());
            }
            i2++;
            h3.B1(i2, bArr3, 0);
            nVar2.update(bArr3, 0, 4);
            nVar2.doFinal(bArr3, 0);
            int min = Math.min(digestSize, bArr2.length - i);
            for (int i3 = 0; i3 != min; i3++) {
                int i4 = i + i3;
                bArr2[i4] = (byte) (bArr2[i4] ^ bArr3[i3]);
            }
            i += min;
        }
    }

    public byte[] d(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte b2;
        BigInteger e2;
        byte[] i3;
        h q;
        boolean z;
        if (this.c) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            s0.a.e.b.i iVar = new s0.a.e.b.i();
            do {
                int bitLength = this.e.j.bitLength();
                while (true) {
                    e2 = b.e(bitLength, this.g);
                    if (!e2.equals(b.a) && e2.compareTo(this.e.j) < 0) {
                        break;
                    }
                }
                i3 = iVar.a(this.e.i, e2).q().i(false);
                q = ((c0) this.d).q.o(e2).q();
                c(this.a, q, bArr2);
                int i4 = 0;
                while (true) {
                    if (i4 == i2) {
                        z = true;
                        continue;
                        break;
                    } else if (bArr2[i4] != bArr[i + i4]) {
                        z = false;
                        continue;
                        break;
                    } else {
                        i4++;
                    }
                }
            } while (z);
            byte[] bArr3 = new byte[this.a.getDigestSize()];
            a(this.a, q.d());
            this.a.update(bArr, i, i2);
            a(this.a, q.e());
            this.a.doFinal(bArr3, 0);
            return this.b.ordinal() != 1 ? h3.S(i3, bArr2, bArr3) : h3.S(i3, bArr3, bArr2);
        }
        int i5 = (this.f * 2) + 1;
        byte[] bArr4 = new byte[i5];
        System.arraycopy(bArr, i, bArr4, 0, i5);
        h h = this.e.g.h(bArr4);
        if (!h.o(this.e.k).m()) {
            h q2 = h.o(((b0) this.d).q).q();
            int digestSize = this.a.getDigestSize();
            int i6 = (i2 - i5) - digestSize;
            byte[] bArr5 = new byte[i6];
            Mode mode = this.b;
            Mode mode2 = Mode.C1C3C2;
            if (mode == mode2) {
                System.arraycopy(bArr, i + i5 + digestSize, bArr5, 0, i6);
            } else {
                System.arraycopy(bArr, i + i5, bArr5, 0, i6);
            }
            c(this.a, q2, bArr5);
            int digestSize2 = this.a.getDigestSize();
            byte[] bArr6 = new byte[digestSize2];
            a(this.a, q2.d());
            this.a.update(bArr5, 0, i6);
            a(this.a, q2.e());
            this.a.doFinal(bArr6, 0);
            if (this.b == mode2) {
                b2 = 0;
                for (int i7 = 0; i7 != digestSize2; i7++) {
                    b2 |= bArr6[i7] ^ bArr[(i + i5) + i7];
                }
            } else {
                byte b3 = 0;
                for (int i8 = 0; i8 != digestSize2; i8++) {
                    b3 = b2 | (bArr6[i8] ^ bArr[a.X(i, i5, i6, i8)]);
                }
            }
            Arrays.fill(bArr4, (byte) 0);
            Arrays.fill(bArr6, (byte) 0);
            if (b2 == 0) {
                return bArr5;
            }
            Arrays.fill(bArr5, (byte) 0);
            throw new InvalidCipherTextException("invalid cipher text");
        }
        throw new InvalidCipherTextException("[h]C1 at infinity");
    }
}
