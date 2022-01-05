package s0.a.b.m0.f;

import java.util.Arrays;
import java.util.Hashtable;
import s0.a.b.k0.y0;
import s0.a.b.m0.c;
import s0.a.b.s;
import s0.a.e.b.b0.c.h3;

public class a implements c {
    public byte[] a;
    public byte[] b;
    public long c;
    public c d;
    public s e;
    public int f;

    public a(s sVar, int i, c cVar, byte[] bArr, byte[] bArr2) {
        Hashtable hashtable = d.a;
        String algorithmName = sVar.getAlgorithmName();
        if (i > ((Integer) d.a.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue()) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        } else if (cVar.entropySize() >= i) {
            this.f = i;
            this.d = cVar;
            this.e = sVar;
            byte[] S = h3.S(c(), bArr2, bArr);
            byte[] bArr3 = new byte[sVar.getMacSize()];
            this.a = bArr3;
            byte[] bArr4 = new byte[bArr3.length];
            this.b = bArr4;
            Arrays.fill(bArr4, (byte) 1);
            d(S);
            this.c = 1;
        } else {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
    }

    public void a(byte[] bArr) {
        d(h3.R(c(), bArr));
        this.c = 1;
    }

    public int b(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        } else if (this.c > 140737488355328L) {
            return -1;
        } else {
            if (z) {
                a((byte[]) null);
            }
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            int length3 = bArr.length / this.b.length;
            this.e.init(new y0(this.a));
            for (int i = 0; i < length3; i++) {
                s sVar = this.e;
                byte[] bArr4 = this.b;
                sVar.update(bArr4, 0, bArr4.length);
                this.e.doFinal(this.b, 0);
                byte[] bArr5 = this.b;
                System.arraycopy(bArr5, 0, bArr3, bArr5.length * i, bArr5.length);
            }
            byte[] bArr6 = this.b;
            if (bArr6.length * length3 < length2) {
                this.e.update(bArr6, 0, bArr6.length);
                this.e.doFinal(this.b, 0);
                byte[] bArr7 = this.b;
                System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
            }
            d((byte[]) null);
            this.c++;
            System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
            return length;
        }
    }

    public final byte[] c() {
        byte[] entropy = this.d.getEntropy();
        if (entropy.length >= (this.f + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    public final void d(byte[] bArr) {
        e(bArr, (byte) 0);
        if (bArr != null) {
            e(bArr, (byte) 1);
        }
    }

    public final void e(byte[] bArr, byte b2) {
        this.e.init(new y0(this.a));
        s sVar = this.e;
        byte[] bArr2 = this.b;
        sVar.update(bArr2, 0, bArr2.length);
        this.e.update(b2);
        if (bArr != null) {
            this.e.update(bArr, 0, bArr.length);
        }
        this.e.doFinal(this.a, 0);
        this.e.init(new y0(this.a));
        s sVar2 = this.e;
        byte[] bArr3 = this.b;
        sVar2.update(bArr3, 0, bArr3.length);
        this.e.doFinal(this.b, 0);
    }
}
