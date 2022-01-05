package s0.a.b.e0;

import androidx.recyclerview.widget.RecyclerView;
import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.x;

public class a0 implements x {
    public int[] a = new int[RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE];
    public int[] b = new int[RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE];
    public int c = 0;
    public byte[] d;
    public byte[] e;
    public boolean f;
    public byte[] g = new byte[4];
    public int h = 0;

    public static int b(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public final void a() {
        byte[] bArr = this.d;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        } else if (this.e.length >= 16) {
            if (bArr.length != 32) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                byte[] bArr3 = this.d;
                System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
                this.d = bArr2;
            }
            byte[] bArr4 = this.e;
            if (bArr4.length < 32) {
                byte[] bArr5 = new byte[32];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                byte[] bArr6 = this.e;
                System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
                this.e = bArr5;
            }
            this.h = 0;
            this.c = 0;
            int[] iArr = new int[2560];
            for (int i = 0; i < 32; i++) {
                int i2 = i >> 2;
                iArr[i2] = iArr[i2] | ((this.d[i] & 255) << ((i & 3) * 8));
            }
            for (int i3 = 0; i3 < 32; i3++) {
                int i4 = (i3 >> 2) + 8;
                iArr[i4] = iArr[i4] | ((this.e[i3] & 255) << ((i3 & 3) * 8));
            }
            for (int i5 = 16; i5 < 2560; i5++) {
                int i6 = iArr[i5 - 2];
                int i7 = iArr[i5 - 15];
                iArr[i5] = ((i6 >>> 10) ^ (b(i6, 17) ^ b(i6, 19))) + iArr[i5 - 7] + ((i7 >>> 3) ^ (b(i7, 7) ^ b(i7, 18))) + iArr[i5 - 16] + i5;
            }
            System.arraycopy(iArr, 512, this.a, 0, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE);
            System.arraycopy(iArr, 1536, this.b, 0, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE);
            for (int i8 = 0; i8 < 4096; i8++) {
                c();
            }
            this.c = 0;
        } else {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
    }

    public final int c() {
        int i;
        int i2;
        int i3 = this.c;
        int i4 = i3 & 1023;
        if (i3 < 1024) {
            int[] iArr = this.a;
            int i5 = iArr[(i4 - 3) & 1023];
            int i6 = iArr[(i4 - 1023) & 1023];
            int i7 = iArr[i4];
            int b2 = iArr[(i4 - 10) & 1023] + (b(i6, 23) ^ b(i5, 10));
            int[] iArr2 = this.b;
            iArr[i4] = b2 + iArr2[(i5 ^ i6) & 1023] + i7;
            int[] iArr3 = this.a;
            int i8 = iArr3[(i4 - 12) & 1023];
            i = iArr2[i8 & 255] + iArr2[((i8 >> 8) & 255) + 256] + iArr2[((i8 >> 16) & 255) + 512] + iArr2[((i8 >> 24) & 255) + 768];
            i2 = iArr3[i4];
        } else {
            int[] iArr4 = this.b;
            int i9 = iArr4[(i4 - 3) & 1023];
            int i10 = iArr4[(i4 - 1023) & 1023];
            int i11 = iArr4[i4];
            int b3 = iArr4[(i4 - 10) & 1023] + (b(i10, 23) ^ b(i9, 10));
            int[] iArr5 = this.a;
            iArr4[i4] = b3 + iArr5[(i9 ^ i10) & 1023] + i11;
            int[] iArr6 = this.b;
            int i12 = iArr6[(i4 - 12) & 1023];
            i = iArr5[i12 & 255] + iArr5[((i12 >> 8) & 255) + 256] + iArr5[((i12 >> 16) & 255) + 512] + iArr5[((i12 >> 24) & 255) + 768];
            i2 = iArr6[i4];
        }
        int i13 = i2 ^ i;
        this.c = (this.c + 1) & 2047;
        return i13;
    }

    public String getAlgorithmName() {
        return "HC-256";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        i iVar2;
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            this.e = c1Var.c;
            iVar2 = c1Var.d;
        } else {
            this.e = new byte[0];
            iVar2 = iVar;
        }
        if (iVar2 instanceof y0) {
            this.d = ((y0) iVar2).c;
            a();
            this.f = true;
            return;
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("Invalid parameter passed to HC256 init - ")));
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.f) {
            throw new IllegalStateException("HC-256 not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i3 + i4;
                byte b2 = bArr[i + i4];
                if (this.h == 0) {
                    int c2 = c();
                    byte[] bArr3 = this.g;
                    bArr3[0] = (byte) (c2 & 255);
                    int i6 = c2 >> 8;
                    bArr3[1] = (byte) (i6 & 255);
                    int i7 = i6 >> 8;
                    bArr3[2] = (byte) (i7 & 255);
                    bArr3[3] = (byte) ((i7 >> 8) & 255);
                }
                byte[] bArr4 = this.g;
                int i8 = this.h;
                byte b3 = bArr4[i8];
                this.h = 3 & (i8 + 1);
                bArr2[i5] = (byte) (b2 ^ b3);
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
        a();
    }
}
