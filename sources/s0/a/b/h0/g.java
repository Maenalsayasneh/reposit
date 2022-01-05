package s0.a.b.h0;

import i0.d.a.a.a;
import java.util.Hashtable;
import s0.a.b.i;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.b.o;
import s0.a.b.s;
import s0.a.g.f;

public class g implements s {
    public static Hashtable a;
    public n b;
    public int c;
    public int d;
    public f e;
    public f f;
    public byte[] g;
    public byte[] h;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put("GOST3411", 32);
        a.put("MD2", 16);
        a.put("MD4", 64);
        a.put("MD5", 64);
        a.put("RIPEMD128", 64);
        a.put("RIPEMD160", 64);
        a.put("SHA-1", 64);
        a.put("SHA-224", 64);
        a.put("SHA-256", 64);
        a.put("SHA-384", 128);
        a.put("SHA-512", 128);
        a.put("Tiger", 64);
        a.put("Whirlpool", 64);
    }

    public g(n nVar) {
        int i;
        if (nVar instanceof o) {
            i = ((o) nVar).getByteLength();
        } else {
            Integer num = (Integer) a.get(nVar.getAlgorithmName());
            if (num != null) {
                i = num.intValue();
            } else {
                StringBuilder P0 = a.P0("unknown digest passed: ");
                P0.append(nVar.getAlgorithmName());
                throw new IllegalArgumentException(P0.toString());
            }
        }
        this.b = nVar;
        int digestSize = nVar.getDigestSize();
        this.c = digestSize;
        this.d = i;
        this.g = new byte[i];
        this.h = new byte[(i + digestSize)];
    }

    public int doFinal(byte[] bArr, int i) {
        this.b.doFinal(this.h, this.d);
        f fVar = this.f;
        if (fVar != null) {
            ((f) this.b).c(fVar);
            n nVar = this.b;
            nVar.update(this.h, this.d, nVar.getDigestSize());
        } else {
            n nVar2 = this.b;
            byte[] bArr2 = this.h;
            nVar2.update(bArr2, 0, bArr2.length);
        }
        int doFinal = this.b.doFinal(bArr, i);
        int i2 = this.d;
        while (true) {
            byte[] bArr3 = this.h;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        f fVar2 = this.e;
        if (fVar2 != null) {
            ((f) this.b).c(fVar2);
        } else {
            n nVar3 = this.b;
            byte[] bArr4 = this.g;
            nVar3.update(bArr4, 0, bArr4.length);
        }
        return doFinal;
    }

    public String getAlgorithmName() {
        return this.b.getAlgorithmName() + "/HMAC";
    }

    public int getMacSize() {
        return this.c;
    }

    public void init(i iVar) {
        byte[] bArr;
        this.b.reset();
        byte[] bArr2 = ((y0) iVar).c;
        int length = bArr2.length;
        if (length > this.d) {
            this.b.update(bArr2, 0, length);
            this.b.doFinal(this.g, 0);
            length = this.c;
        } else {
            System.arraycopy(bArr2, 0, this.g, 0, length);
        }
        while (true) {
            bArr = this.g;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.h, 0, this.d);
        byte[] bArr3 = this.g;
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ 54);
        }
        byte[] bArr4 = this.h;
        int i3 = this.d;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr4[i4] = (byte) (bArr4[i4] ^ 92);
        }
        n nVar = this.b;
        if (nVar instanceof f) {
            f a2 = ((f) nVar).a();
            this.f = a2;
            ((n) a2).update(this.h, 0, this.d);
        }
        n nVar2 = this.b;
        byte[] bArr5 = this.g;
        nVar2.update(bArr5, 0, bArr5.length);
        n nVar3 = this.b;
        if (nVar3 instanceof f) {
            this.e = ((f) nVar3).a();
        }
    }

    public void reset() {
        this.b.reset();
        n nVar = this.b;
        byte[] bArr = this.g;
        nVar.update(bArr, 0, bArr.length);
    }

    public void update(byte b2) {
        this.b.update(b2);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.b.update(bArr, i, i2);
    }
}
