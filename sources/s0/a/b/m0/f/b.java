package s0.a.b.m0.f;

import java.util.Hashtable;
import s0.a.b.m0.c;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;

public class b implements c {
    public static final byte[] a = {1};
    public static final Hashtable b;
    public n c;
    public byte[] d;
    public byte[] e;
    public long f;
    public c g;
    public int h;
    public int i;

    static {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        hashtable.put("SHA-1", 440);
        hashtable.put("SHA-224", 440);
        hashtable.put("SHA-256", 440);
        hashtable.put("SHA-512/256", 440);
        hashtable.put("SHA-512/224", 440);
        hashtable.put("SHA-384", 888);
        hashtable.put("SHA-512", 888);
    }

    public b(n nVar, int i2, c cVar, byte[] bArr, byte[] bArr2) {
        if (i2 > ((Integer) d.a.get(nVar.getAlgorithmName())).intValue()) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        } else if (cVar.entropySize() >= i2) {
            this.c = nVar;
            this.g = cVar;
            this.h = i2;
            this.i = ((Integer) b.get(nVar.getAlgorithmName())).intValue();
            byte[] a2 = d.a(this.c, h3.S(d(), bArr2, bArr), this.i);
            this.d = a2;
            byte[] bArr3 = new byte[(a2.length + 1)];
            System.arraycopy(a2, 0, bArr3, 1, a2.length);
            this.e = d.a(this.c, bArr3, this.i);
            this.f = 1;
        } else {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
    }

    public void a(byte[] bArr) {
        byte[] a2 = d.a(this.c, h3.T(a, this.d, d(), bArr), this.i);
        this.d = a2;
        byte[] bArr2 = new byte[(a2.length + 1)];
        bArr2[0] = 0;
        System.arraycopy(a2, 0, bArr2, 1, a2.length);
        this.e = d.a(this.c, bArr2, this.i);
        this.f = 1;
    }

    public int b(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        } else if (this.f > 140737488355328L) {
            return -1;
        } else {
            if (z) {
                a((byte[]) null);
            }
            byte[] bArr3 = this.d;
            int i2 = length / 8;
            int digestSize = i2 / this.c.getDigestSize();
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            byte[] bArr5 = new byte[i2];
            int digestSize2 = this.c.getDigestSize();
            byte[] bArr6 = new byte[digestSize2];
            for (int i3 = 0; i3 <= digestSize; i3++) {
                this.c.update(bArr4, 0, length2);
                this.c.doFinal(bArr6, 0);
                int i4 = i3 * digestSize2;
                int i5 = i2 - i4;
                if (i5 > digestSize2) {
                    i5 = digestSize2;
                }
                System.arraycopy(bArr6, 0, bArr5, i4, i5);
                c(bArr4, a);
            }
            byte[] bArr7 = this.d;
            byte[] bArr8 = new byte[(bArr7.length + 1)];
            System.arraycopy(bArr7, 0, bArr8, 1, bArr7.length);
            bArr8[0] = 3;
            c(this.d, e(bArr8));
            c(this.d, this.e);
            long j = this.f;
            c(this.d, new byte[]{(byte) ((int) (j >> 24)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 8)), (byte) ((int) j)});
            this.f++;
            System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
            return length;
        }
    }

    public final void c(byte[] bArr, byte[] bArr2) {
        byte b2 = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + (bArr2[bArr2.length - i2] & 255) + b2;
            b2 = i3 > 255 ? (byte) 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i4 = (bArr[bArr.length - length] & 255) + b2;
            b2 = i4 > 255 ? (byte) 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    public final byte[] d() {
        byte[] entropy = this.g.getEntropy();
        if (entropy.length >= (this.h + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    public final byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[this.c.getDigestSize()];
        this.c.update(bArr, 0, bArr.length);
        this.c.doFinal(bArr2, 0);
        return bArr2;
    }
}
