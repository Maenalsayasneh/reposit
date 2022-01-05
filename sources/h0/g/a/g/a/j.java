package h0.g.a.g.a;

import i0.d.a.a.a;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: SplineSet */
public abstract class j {
    public b a;
    public int[] b = new int[10];
    public float[] c = new float[10];
    public int d;
    public String e;

    public float a(float f) {
        return (float) this.a.b((double) f, 0);
    }

    public void b(int i, float f) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.d;
        iArr2[i2] = i;
        this.c[i2] = f;
        this.d = i2 + 1;
    }

    public void c(int i) {
        int i2 = this.d;
        if (i2 != 0) {
            int[] iArr = this.b;
            float[] fArr = this.c;
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2 - 1;
            iArr2[1] = 0;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int i7 = iArr[i6];
                    int i8 = i5;
                    int i9 = i8;
                    while (i8 < i6) {
                        if (iArr[i8] <= i7) {
                            int i10 = iArr[i9];
                            iArr[i9] = iArr[i8];
                            iArr[i8] = i10;
                            float f = fArr[i9];
                            fArr[i9] = fArr[i8];
                            fArr[i8] = f;
                            i9++;
                        }
                        i8++;
                    }
                    int i11 = iArr[i9];
                    iArr[i9] = iArr[i6];
                    iArr[i6] = i11;
                    float f2 = fArr[i9];
                    fArr[i9] = fArr[i6];
                    fArr[i6] = f2;
                    int i12 = i3 + 1;
                    iArr2[i3] = i9 - 1;
                    int i13 = i12 + 1;
                    iArr2[i12] = i5;
                    int i14 = i13 + 1;
                    iArr2[i13] = i6;
                    i3 = i14 + 1;
                    iArr2[i14] = i9 + 1;
                }
            }
            int i15 = 1;
            for (int i16 = 1; i16 < this.d; i16++) {
                int[] iArr3 = this.b;
                if (iArr3[i16 - 1] != iArr3[i16]) {
                    i15++;
                }
            }
            double[] dArr = new double[i15];
            int[] iArr4 = new int[2];
            iArr4[1] = 1;
            iArr4[0] = i15;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr4);
            int i17 = 0;
            for (int i18 = 0; i18 < this.d; i18++) {
                if (i18 > 0) {
                    int[] iArr5 = this.b;
                    if (iArr5[i18] == iArr5[i18 - 1]) {
                    }
                }
                dArr[i17] = ((double) this.b[i18]) * 0.01d;
                dArr2[i17][0] = (double) this.c[i18];
                i17++;
            }
            this.a = b.a(i, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.d; i++) {
            StringBuilder S0 = a.S0(str, "[");
            S0.append(this.b[i]);
            S0.append(" , ");
            S0.append(decimalFormat.format((double) this.c[i]));
            S0.append("] ");
            str = S0.toString();
        }
        return str;
    }
}
