package s0.a.b.e0;

import androidx.core.app.FrameMetricsAggregator;
import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.x;

public class z implements x {
    public int[] a = new int[512];
    public int[] b = new int[512];
    public int c = 0;
    public byte[] d;
    public byte[] e;
    public boolean f;
    public byte[] g = new byte[4];
    public int h = 0;

    public static int b(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static int c(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public final void a() {
        if (this.d.length == 16) {
            this.h = 0;
            this.c = 0;
            int[] iArr = new int[1280];
            for (int i = 0; i < 16; i++) {
                int i2 = i >> 2;
                iArr[i2] = ((this.d[i] & 255) << ((i & 3) * 8)) | iArr[i2];
            }
            System.arraycopy(iArr, 0, iArr, 4, 4);
            int i3 = 0;
            while (true) {
                byte[] bArr = this.e;
                if (i3 >= bArr.length || i3 >= 16) {
                    System.arraycopy(iArr, 8, iArr, 12, 4);
                } else {
                    int i4 = (i3 >> 2) + 8;
                    iArr[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr[i4];
                    i3++;
                }
            }
            System.arraycopy(iArr, 8, iArr, 12, 4);
            for (int i5 = 16; i5 < 1280; i5++) {
                int i6 = iArr[i5 - 2];
                int c2 = ((i6 >>> 10) ^ (c(i6, 17) ^ c(i6, 19))) + iArr[i5 - 7];
                int i7 = iArr[i5 - 15];
                iArr[i5] = c2 + ((i7 >>> 3) ^ (c(i7, 7) ^ c(i7, 18))) + iArr[i5 - 16] + i5;
            }
            System.arraycopy(iArr, 256, this.a, 0, 512);
            System.arraycopy(iArr, 768, this.b, 0, 512);
            for (int i8 = 0; i8 < 512; i8++) {
                this.a[i8] = d();
            }
            for (int i9 = 0; i9 < 512; i9++) {
                this.b[i9] = d();
            }
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException("The key must be 128 bits long");
    }

    public final int d() {
        int i;
        int i2;
        int i3 = this.c;
        int i4 = i3 & FrameMetricsAggregator.EVERY_DURATION;
        if (i3 < 512) {
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int i6 = iArr[(i4 - 3) & FrameMetricsAggregator.EVERY_DURATION];
            int i7 = iArr[(i4 - 10) & FrameMetricsAggregator.EVERY_DURATION];
            int i8 = iArr[(i4 - 511) & FrameMetricsAggregator.EVERY_DURATION];
            int c2 = c(i6, 10);
            iArr[i4] = i5 + c(i7, 8) + (c(i8, 23) ^ c2);
            int[] iArr2 = this.a;
            int i9 = iArr2[(i4 - 12) & FrameMetricsAggregator.EVERY_DURATION];
            int[] iArr3 = this.b;
            i = iArr3[i9 & 255] + iArr3[((i9 >> 16) & 255) + 256];
            i2 = iArr2[i4];
        } else {
            int[] iArr4 = this.b;
            int i10 = iArr4[i4];
            int i11 = iArr4[(i4 - 3) & FrameMetricsAggregator.EVERY_DURATION];
            int i12 = iArr4[(i4 - 10) & FrameMetricsAggregator.EVERY_DURATION];
            int i13 = iArr4[(i4 - 511) & FrameMetricsAggregator.EVERY_DURATION];
            int b2 = b(i11, 10);
            iArr4[i4] = i10 + b(i12, 8) + (b(i13, 23) ^ b2);
            int[] iArr5 = this.b;
            int i14 = iArr5[(i4 - 12) & FrameMetricsAggregator.EVERY_DURATION];
            int[] iArr6 = this.a;
            i = iArr6[i14 & 255] + iArr6[((i14 >> 16) & 255) + 256];
            i2 = iArr5[i4];
        }
        int i15 = i2 ^ i;
        this.c = (this.c + 1) & 1023;
        return i15;
    }

    public String getAlgorithmName() {
        return "HC-128";
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
        throw new IllegalArgumentException(a.L0(iVar, a.P0("Invalid parameter passed to HC128 init - ")));
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.f) {
            throw new IllegalStateException("HC-128 not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i3 + i4;
                byte b2 = bArr[i + i4];
                if (this.h == 0) {
                    int d2 = d();
                    byte[] bArr3 = this.g;
                    bArr3[0] = (byte) (d2 & 255);
                    int i6 = d2 >> 8;
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
