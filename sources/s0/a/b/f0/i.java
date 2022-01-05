package s0.a.b.f0;

import androidx.recyclerview.widget.RecyclerView;
import i0.d.a.a.a;
import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.b0.v;
import s0.a.b.k0.o;
import s0.a.b.k0.p;
import s0.a.b.k0.s;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;
import s0.a.g.b;
import s0.a.g.k.d;

public class i {
    public static final BigInteger a = BigInteger.valueOf(1);
    public static final BigInteger b = BigInteger.valueOf(2);
    public n c;
    public int d;
    public int e;
    public int f;
    public SecureRandom g;
    public boolean h;
    public int i;

    static {
        BigInteger.valueOf(0);
    }

    public i() {
        this.c = new v();
    }

    public i(n nVar) {
        this.c = nVar;
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger divide = bigInteger.subtract(a).divide(bigInteger2);
        BigInteger subtract = bigInteger.subtract(b);
        do {
            modPow = b.f(b, subtract, secureRandom).modPow(divide, bigInteger);
        } while (modPow.bitLength() <= 1);
        return modPow;
    }

    public static void c(byte[] bArr) {
        int length = bArr.length - 1;
        while (length >= 0) {
            byte b2 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b2;
            if (b2 == 0) {
                length--;
            } else {
                return;
            }
        }
    }

    public p b() {
        BigInteger bigInteger;
        int i2;
        BigInteger subtract;
        p pVar;
        BigInteger bit;
        BigInteger bigInteger2;
        BigInteger subtract2;
        BigInteger bigInteger3;
        int i3 = 0;
        int i4 = 1;
        if (this.h) {
            n nVar = this.c;
            int digestSize = nVar.getDigestSize() * 8;
            int i5 = this.e / 8;
            byte[] bArr = new byte[i5];
            int i6 = this.d;
            int i7 = i6 - 1;
            int i8 = i7 / digestSize;
            int i9 = i7 % digestSize;
            int i10 = i6 / 8;
            byte[] bArr2 = new byte[i10];
            int digestSize2 = nVar.getDigestSize();
            byte[] bArr3 = new byte[digestSize2];
            loop0:
            while (true) {
                this.g.nextBytes(bArr);
                nVar.update(bArr, i3, i5);
                nVar.doFinal(bArr3, i3);
                bit = new BigInteger(i4, bArr3).mod(a.shiftLeft(this.e - i4)).setBit(i3).setBit(this.e - i4);
                if (f(bit)) {
                    byte[] I = h3.I(bArr);
                    int i11 = this.d * 4;
                    int i12 = i4;
                    int i13 = i3;
                    while (i3 < i11) {
                        while (i12 <= i8) {
                            c(I);
                            nVar.update(I, i13, I.length);
                            nVar.doFinal(bArr2, i10 - (i12 * digestSize2));
                            i12++;
                            i11 = i11;
                        }
                        int i14 = i11;
                        int i15 = i10 - (i8 * digestSize2);
                        c(I);
                        nVar.update(I, i13, I.length);
                        nVar.doFinal(bArr3, i13);
                        System.arraycopy(bArr3, digestSize2 - i15, bArr2, i13, i15);
                        bArr2[i13] = (byte) (bArr2[i13] | Byte.MIN_VALUE);
                        BigInteger bigInteger4 = new BigInteger(1, bArr2);
                        BigInteger mod = bigInteger4.mod(bit.shiftLeft(1));
                        bigInteger2 = a;
                        subtract2 = bigInteger4.subtract(mod.subtract(bigInteger2));
                        if (subtract2.bitLength() == this.d && subtract2.isProbablePrime(this.f)) {
                            break loop0;
                        }
                        i3++;
                        i13 = 0;
                        i12 = 1;
                        i11 = i14;
                    }
                    i3 = i13;
                    i4 = i12;
                }
            }
            int i16 = this.i;
            if (i16 >= 0) {
                BigInteger divide = subtract2.subtract(bigInteger2).divide(bit);
                byte[] b2 = d.b("6767656E");
                int X = a.X(b2.length, i5, 1, 2);
                byte[] bArr4 = new byte[X];
                int i17 = 0;
                System.arraycopy(bArr, 0, bArr4, 0, i5);
                System.arraycopy(b2, 0, bArr4, i5, b2.length);
                bArr4[X - 3] = (byte) i16;
                byte[] bArr5 = new byte[nVar.getDigestSize()];
                int i18 = 1;
                while (true) {
                    if (i18 >= 65536) {
                        bigInteger3 = null;
                        break;
                    }
                    c(bArr4);
                    nVar.update(bArr4, i17, X);
                    nVar.doFinal(bArr5, i17);
                    bigInteger3 = new BigInteger(1, bArr5).modPow(divide, subtract2);
                    if (bigInteger3.compareTo(b) >= 0) {
                        break;
                    }
                    i18++;
                    i17 = 0;
                }
                if (bigInteger3 != null) {
                    return new p(subtract2, bit, bigInteger3, new s(bArr, i3, this.i));
                }
            }
            pVar = new p(subtract2, bit, a(subtract2, bit, this.g), new s(bArr, i3));
        } else {
            int i19 = 20;
            byte[] bArr6 = new byte[20];
            byte[] bArr7 = new byte[20];
            byte[] bArr8 = new byte[20];
            byte[] bArr9 = new byte[20];
            int i20 = this.d;
            int i21 = (i20 - 1) / 160;
            int i22 = i20 / 8;
            byte[] bArr10 = new byte[i22];
            if (this.c instanceof v) {
                loop4:
                while (true) {
                    this.g.nextBytes(bArr6);
                    n nVar2 = this.c;
                    nVar2.update(bArr6, 0, i19);
                    nVar2.doFinal(bArr7, 0);
                    System.arraycopy(bArr6, 0, bArr8, 0, i19);
                    c(bArr8);
                    n nVar3 = this.c;
                    nVar3.update(bArr8, 0, i19);
                    nVar3.doFinal(bArr8, 0);
                    for (int i23 = 0; i23 != i19; i23++) {
                        bArr9[i23] = (byte) (bArr7[i23] ^ bArr8[i23]);
                    }
                    bArr9[0] = (byte) (bArr9[0] | Byte.MIN_VALUE);
                    bArr9[19] = (byte) (bArr9[19] | 1);
                    bigInteger = new BigInteger(1, bArr9);
                    if (bigInteger.isProbablePrime(this.f)) {
                        byte[] I2 = h3.I(bArr6);
                        c(I2);
                        i2 = 0;
                        while (i2 < 4096) {
                            for (int i24 = 1; i24 <= i21; i24++) {
                                c(I2);
                                n nVar4 = this.c;
                                nVar4.update(I2, 0, I2.length);
                                nVar4.doFinal(bArr10, i22 - (i24 * 20));
                            }
                            int i25 = i22 - (i21 * 20);
                            c(I2);
                            n nVar5 = this.c;
                            nVar5.update(I2, 0, I2.length);
                            nVar5.doFinal(bArr7, 0);
                            System.arraycopy(bArr7, 20 - i25, bArr10, 0, i25);
                            bArr10[0] = (byte) (bArr10[0] | Byte.MIN_VALUE);
                            BigInteger bigInteger5 = new BigInteger(1, bArr10);
                            subtract = bigInteger5.subtract(bigInteger5.mod(bigInteger.shiftLeft(1)).subtract(a));
                            if (subtract.bitLength() == this.d && subtract.isProbablePrime(this.f)) {
                                break loop4;
                            }
                            i2++;
                            i19 = 20;
                        }
                        continue;
                    }
                }
                pVar = new p(subtract, bigInteger, a(subtract, bigInteger, this.g), new s(bArr6, i2));
            } else {
                throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
            }
        }
        return pVar;
    }

    public void d(int i2, int i3, SecureRandom secureRandom) {
        this.d = i2;
        this.e = i2 > 1024 ? 256 : 160;
        this.f = i3;
        Math.max(i2 <= 1024 ? 40 : (((i2 - 1) / RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) * 8) + 48, (i3 + 1) / 2);
        this.g = secureRandom;
        this.h = false;
        this.i = -1;
    }

    public void e(o oVar) {
        int i2;
        int i3 = oVar.a;
        int i4 = oVar.b;
        if (i3 < 1024 || i3 > 3072 || i3 % RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        } else if (i3 == 1024 && i4 != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        } else if (i3 == 2048 && i4 != 224 && i4 != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        } else if (i3 == 3072 && i4 != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        } else if (this.c.getDigestSize() * 8 >= i4) {
            this.d = i3;
            this.e = i4;
            int i5 = oVar.c;
            this.f = i5;
            if (i3 <= 1024) {
                i2 = 40;
            } else {
                i2 = (((i3 - 1) / RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) * 8) + 48;
            }
            Math.max(i2, (i5 + 1) / 2);
            this.g = oVar.d;
            this.h = true;
            this.i = -1;
        } else {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
    }

    public final boolean f(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.f);
    }
}
