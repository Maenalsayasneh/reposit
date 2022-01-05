package s0.a.b.h0;

import androidx.recyclerview.widget.RecyclerView;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.d.a.a.a;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.y0;
import s0.a.b.s;
import s0.a.e.b.b0.c.h3;

public class c implements s {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public int e;
    public e f;
    public int g;
    public byte[] h;
    public byte[] i;

    public c(e eVar) {
        int b2 = eVar.b() * 8;
        if (b2 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else if (b2 <= eVar.b() * 8) {
            this.f = new s0.a.b.i0.c(eVar);
            this.g = b2 / 8;
            int b3 = eVar.b() * 8;
            int i2 = PubNubErrorBuilder.PNERR_CRYPTO_ERROR;
            switch (b3) {
                case 64:
                case 320:
                    i2 = 27;
                    break;
                case 128:
                case 192:
                    break;
                case 160:
                    i2 = 45;
                    break;
                case 224:
                    i2 = 777;
                    break;
                case 256:
                    i2 = 1061;
                    break;
                case 384:
                    i2 = 4109;
                    break;
                case 448:
                    i2 = 2129;
                    break;
                case 512:
                    i2 = 293;
                    break;
                case 768:
                    i2 = 655377;
                    break;
                case RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE:
                    i2 = 524355;
                    break;
                case 2048:
                    i2 = 548865;
                    break;
                default:
                    throw new IllegalArgumentException(a.e0("Unknown block size for CMAC: ", b3));
            }
            this.a = h3.C1(i2);
            this.c = new byte[eVar.b()];
            this.d = new byte[eVar.b()];
            this.b = new byte[eVar.b()];
            this.e = 0;
        } else {
            StringBuilder P0 = a.P0("MAC size must be less or equal to ");
            P0.append(eVar.b() * 8);
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        int i2 = 0;
        while (true) {
            length--;
            if (length >= 0) {
                byte b2 = bArr[length] & 255;
                bArr2[length] = (byte) (i2 | (b2 << 1));
                i2 = (b2 >>> 7) & 1;
            } else {
                byte b3 = (-i2) & 255;
                int length2 = bArr.length - 3;
                byte b4 = bArr2[length2];
                byte[] bArr3 = this.a;
                bArr2[length2] = (byte) (b4 ^ (bArr3[1] & b3));
                int length3 = bArr.length - 2;
                bArr2[length3] = (byte) ((bArr3[2] & b3) ^ bArr2[length3]);
                int length4 = bArr.length - 1;
                bArr2[length4] = (byte) ((b3 & bArr3[3]) ^ bArr2[length4]);
                return bArr2;
            }
        }
    }

    public int doFinal(byte[] bArr, int i2) {
        byte[] bArr2;
        int b2 = this.f.b();
        int i3 = this.e;
        if (i3 == b2) {
            bArr2 = this.h;
        } else {
            byte[] bArr3 = this.d;
            int length = bArr3.length;
            bArr3[i3] = Byte.MIN_VALUE;
            while (true) {
                i3++;
                if (i3 >= bArr3.length) {
                    break;
                }
                bArr3[i3] = 0;
            }
            bArr2 = this.i;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.c;
            if (i4 < bArr4.length) {
                byte[] bArr5 = this.d;
                bArr5[i4] = (byte) (bArr5[i4] ^ bArr2[i4]);
                i4++;
            } else {
                this.f.a(this.d, 0, bArr4, 0);
                System.arraycopy(this.c, 0, bArr, i2, this.g);
                reset();
                return this.g;
            }
        }
    }

    public String getAlgorithmName() {
        return this.f.getAlgorithmName();
    }

    public int getMacSize() {
        return this.g;
    }

    public void init(i iVar) {
        if (iVar == null || (iVar instanceof y0)) {
            this.f.init(true, iVar);
            byte[] bArr = this.b;
            byte[] bArr2 = new byte[bArr.length];
            this.f.a(bArr, 0, bArr2, 0);
            byte[] a2 = a(bArr2);
            this.h = a2;
            this.i = a(a2);
            reset();
            return;
        }
        throw new IllegalArgumentException("CMac mode only permits key to be set.");
    }

    public void reset() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.d;
            if (i2 < bArr.length) {
                bArr[i2] = 0;
                i2++;
            } else {
                this.e = 0;
                this.f.reset();
                return;
            }
        }
    }

    public void update(byte b2) {
        int i2 = this.e;
        byte[] bArr = this.d;
        if (i2 == bArr.length) {
            this.f.a(bArr, 0, this.c, 0);
            this.e = 0;
        }
        byte[] bArr2 = this.d;
        int i3 = this.e;
        this.e = i3 + 1;
        bArr2[i3] = b2;
    }

    public void update(byte[] bArr, int i2, int i3) {
        if (i3 >= 0) {
            int b2 = this.f.b();
            int i4 = this.e;
            int i5 = b2 - i4;
            if (i3 > i5) {
                System.arraycopy(bArr, i2, this.d, i4, i5);
                this.f.a(this.d, 0, this.c, 0);
                this.e = 0;
                i3 -= i5;
                i2 += i5;
                while (i3 > b2) {
                    this.f.a(bArr, i2, this.c, 0);
                    i3 -= b2;
                    i2 += b2;
                }
            }
            System.arraycopy(bArr, i2, this.d, this.e, i3);
            this.e += i3;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
