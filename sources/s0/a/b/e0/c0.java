package s0.a.b.e0;

import i0.d.a.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.b;
import s0.a.b.d;
import s0.a.b.f;
import s0.a.b.f0.o;
import s0.a.b.h0.g;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.u0;
import s0.a.b.k0.v0;
import s0.a.b.k0.x0;
import s0.a.b.k0.y0;
import s0.a.b.l;
import s0.a.b.p;
import s0.a.b.r;
import s0.a.b.s;
import s0.a.e.b.b0.c.h3;

public class c0 {
    public d a;
    public l b;
    public s c;
    public f d;
    public boolean e;
    public i f;
    public i g;
    public u0 h;
    public byte[] i;
    public o j;
    public r k;
    public byte[] l;

    public c0(d dVar, l lVar, s sVar) {
        this.a = dVar;
        this.b = lVar;
        this.c = sVar;
        byte[] bArr = new byte[((g) sVar).c];
        this.d = null;
    }

    public final byte[] a(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        if (i3 >= this.c.getMacSize() + this.i.length) {
            if (this.d == null) {
                int length = (i3 - this.i.length) - this.c.getMacSize();
                byte[] bArr4 = new byte[length];
                int i5 = this.h.q / 8;
                bArr2 = new byte[i5];
                int i6 = length + i5;
                byte[] bArr5 = new byte[i6];
                this.b.generateBytes(bArr5, 0, i6);
                if (this.i.length != 0) {
                    System.arraycopy(bArr5, 0, bArr2, 0, i5);
                    System.arraycopy(bArr5, i5, bArr4, 0, length);
                } else {
                    System.arraycopy(bArr5, 0, bArr4, 0, length);
                    System.arraycopy(bArr5, length, bArr2, 0, i5);
                }
                bArr3 = new byte[length];
                for (int i7 = 0; i7 != length; i7++) {
                    bArr3[i7] = (byte) (bArr[(this.i.length + i2) + i7] ^ bArr4[i7]);
                }
                i4 = 0;
            } else {
                u0 u0Var = this.h;
                int i8 = ((v0) u0Var).x / 8;
                byte[] bArr6 = new byte[i8];
                int i9 = u0Var.q / 8;
                bArr2 = new byte[i9];
                int i10 = i8 + i9;
                byte[] bArr7 = new byte[i10];
                this.b.generateBytes(bArr7, 0, i10);
                System.arraycopy(bArr7, 0, bArr6, 0, i8);
                System.arraycopy(bArr7, i8, bArr2, 0, i9);
                i y0Var = new y0(bArr6);
                byte[] bArr8 = this.l;
                if (bArr8 != null) {
                    y0Var = new c1(y0Var, bArr8);
                }
                this.d.e(false, y0Var);
                bArr3 = new byte[this.d.c((i3 - this.i.length) - this.c.getMacSize())];
                f fVar = this.d;
                byte[] bArr9 = this.i;
                i4 = fVar.g(bArr, i2 + bArr9.length, (i3 - bArr9.length) - this.c.getMacSize(), bArr3, 0);
            }
            byte[] I = h3.I(this.h.d);
            byte[] bArr10 = null;
            if (this.i.length != 0) {
                bArr10 = new byte[8];
                if (I != null) {
                    h3.l2(((long) I.length) * 8, bArr10, 0);
                }
            }
            int i11 = i2 + i3;
            byte[] q02 = h3.q0(bArr, i11 - this.c.getMacSize(), i11);
            int length2 = q02.length;
            byte[] bArr11 = new byte[length2];
            this.c.init(new y0(bArr2));
            s sVar = this.c;
            byte[] bArr12 = this.i;
            sVar.update(bArr, i2 + bArr12.length, (i3 - bArr12.length) - length2);
            if (I != null) {
                this.c.update(I, 0, I.length);
            }
            if (this.i.length != 0) {
                this.c.update(bArr10, 0, bArr10.length);
            }
            this.c.doFinal(bArr11, 0);
            if (h3.U(q02, bArr11)) {
                f fVar2 = this.d;
                return fVar2 == null ? bArr3 : h3.q0(bArr3, 0, fVar2.a(bArr3, i4) + i4);
            }
            throw new InvalidCipherTextException("invalid MAC");
        }
        throw new InvalidCipherTextException("Length of input must be greater than the MAC and V combined");
    }

    public final byte[] b(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        i iVar;
        f fVar;
        if (this.d == null) {
            byte[] bArr4 = new byte[i3];
            int i4 = this.h.q / 8;
            bArr2 = new byte[i4];
            int i5 = i3 + i4;
            byte[] bArr5 = new byte[i5];
            this.b.generateBytes(bArr5, 0, i5);
            if (this.i.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, i4);
                System.arraycopy(bArr5, i4, bArr4, 0, i3);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i3);
                System.arraycopy(bArr5, i3, bArr2, 0, i4);
            }
            bArr3 = new byte[i3];
            for (int i6 = 0; i6 != i3; i6++) {
                bArr3[i6] = (byte) (bArr[i2 + i6] ^ bArr4[i6]);
            }
        } else {
            u0 u0Var = this.h;
            int i7 = ((v0) u0Var).x / 8;
            byte[] bArr6 = new byte[i7];
            int i8 = u0Var.q / 8;
            byte[] bArr7 = new byte[i8];
            int i9 = i7 + i8;
            byte[] bArr8 = new byte[i9];
            this.b.generateBytes(bArr8, 0, i9);
            System.arraycopy(bArr8, 0, bArr6, 0, i7);
            System.arraycopy(bArr8, i7, bArr7, 0, i8);
            if (this.l != null) {
                fVar = this.d;
                iVar = new c1(new y0(bArr6), this.l);
            } else {
                fVar = this.d;
                iVar = new y0(bArr6);
            }
            fVar.e(true, iVar);
            bArr3 = new byte[this.d.c(i3)];
            int g2 = this.d.g(bArr, i2, i3, bArr3, 0);
            i3 = this.d.a(bArr3, g2) + g2;
            bArr2 = bArr7;
        }
        byte[] I = h3.I(this.h.d);
        byte[] bArr9 = null;
        if (this.i.length != 0) {
            bArr9 = new byte[8];
            if (I != null) {
                h3.l2(((long) I.length) * 8, bArr9, 0);
            }
        }
        int macSize = this.c.getMacSize();
        byte[] bArr10 = new byte[macSize];
        this.c.init(new y0(bArr2));
        this.c.update(bArr3, 0, bArr3.length);
        if (I != null) {
            this.c.update(I, 0, I.length);
        }
        if (this.i.length != 0) {
            this.c.update(bArr9, 0, bArr9.length);
        }
        this.c.doFinal(bArr10, 0);
        byte[] bArr11 = this.i;
        byte[] bArr12 = new byte[(bArr11.length + i3 + macSize)];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr3, 0, bArr12, this.i.length, i3);
        System.arraycopy(bArr10, 0, bArr12, this.i.length + i3, macSize);
        return bArr12;
    }

    public final void c(i iVar) {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            this.l = c1Var.c;
            iVar = c1Var.d;
        } else {
            this.l = null;
        }
        this.h = (u0) iVar;
    }

    public void d(boolean z, i iVar, i iVar2, i iVar3) {
        this.e = z;
        this.f = iVar;
        this.g = iVar2;
        this.i = new byte[0];
        c(iVar3);
    }

    public byte[] e(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        if (this.e) {
            o oVar = this.j;
            if (oVar != null) {
                b b2 = oVar.a.b();
                p pVar = oVar.b;
                this.f = b2.b;
                this.i = pVar.getEncoded(b2.a);
            }
        } else if (this.k != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i2, i3);
            try {
                this.g = this.k.a(byteArrayInputStream);
                this.i = h3.q0(bArr, i2, (i3 - byteArrayInputStream.available()) + i2);
            } catch (IOException e2) {
                throw new InvalidCipherTextException(a.V(e2, a.P0("unable to recover ephemeral public key: ")), e2);
            } catch (IllegalArgumentException e3) {
                StringBuilder P0 = a.P0("unable to recover ephemeral public key: ");
                P0.append(e3.getMessage());
                throw new InvalidCipherTextException(P0.toString(), e3);
            }
        }
        this.a.init(this.f);
        byte[] b3 = s0.a.g.b.b(this.a.a(), this.a.b(this.g));
        byte[] bArr2 = this.i;
        if (bArr2.length != 0) {
            byte[] R = h3.R(bArr2, b3);
            Arrays.fill(b3, (byte) 0);
            b3 = R;
        }
        try {
            this.b.init(new x0(b3, h3.I(this.h.c)));
            return this.e ? b(bArr, i2, i3) : a(bArr, i2, i3);
        } finally {
            Arrays.fill(b3, (byte) 0);
        }
    }

    public c0(d dVar, l lVar, s sVar, f fVar) {
        this.a = dVar;
        this.b = lVar;
        this.c = sVar;
        byte[] bArr = new byte[((g) sVar).c];
        this.d = fVar;
    }
}
