package h0.g.a.g.a;

import i0.d.a.a.a;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet */
public abstract class o {
    public b a;
    public int b = 0;
    public int[] c = new int[10];
    public float[][] d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));
    public int e;
    public String f;
    public float[] g = new float[3];
    public boolean h = false;
    public long i;
    public float j = Float.NaN;

    public float a(float f2) {
        float f3;
        switch (this.b) {
            case 1:
                return Math.signum(f2 * 6.2831855f);
            case 2:
                f3 = Math.abs(f2);
                break;
            case 3:
                return (((f2 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                f3 = ((f2 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f2 * 6.2831855f));
            case 6:
                float abs = 1.0f - Math.abs(((f2 * 4.0f) % 4.0f) - 2.0f);
                f3 = abs * abs;
                break;
            default:
                return (float) Math.sin((double) (f2 * 6.2831855f));
        }
        return 1.0f - f3;
    }

    public void b(int i2, float f2, float f3, int i3, float f4) {
        int[] iArr = this.c;
        int i4 = this.e;
        iArr[i4] = i2;
        float[][] fArr = this.d;
        fArr[i4][0] = f2;
        fArr[i4][1] = f3;
        fArr[i4][2] = f4;
        this.b = Math.max(this.b, i3);
        this.e++;
    }

    public void c(int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            PrintStream printStream = System.err;
            StringBuilder P0 = a.P0("Error no points added to ");
            P0.append(this.f);
            printStream.println(P0.toString());
            return;
        }
        int[] iArr = this.c;
        float[][] fArr = this.d;
        int[] iArr2 = new int[(iArr.length + 10)];
        iArr2[0] = i3 - 1;
        iArr2[1] = 0;
        int i4 = 2;
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = iArr2[i5];
            i4 = i5 - 1;
            int i7 = iArr2[i4];
            if (i6 < i7) {
                int i8 = iArr[i7];
                int i9 = i6;
                int i10 = i9;
                while (i9 < i7) {
                    if (iArr[i9] <= i8) {
                        int i11 = iArr[i10];
                        iArr[i10] = iArr[i9];
                        iArr[i9] = i11;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i12 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i12;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                int i13 = i4 + 1;
                iArr2[i4] = i10 - 1;
                int i14 = i13 + 1;
                iArr2[i13] = i6;
                int i15 = i14 + 1;
                iArr2[i14] = i7;
                i4 = i15 + 1;
                iArr2[i15] = i10 + 1;
            }
        }
        int i16 = 1;
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.c;
            if (i16 >= iArr3.length) {
                break;
            }
            if (iArr3[i16] != iArr3[i16 - 1]) {
                i17++;
            }
            i16++;
        }
        if (i17 == 0) {
            i17 = 1;
        }
        double[] dArr = new double[i17];
        int[] iArr4 = new int[2];
        iArr4[1] = 3;
        iArr4[0] = i17;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr4);
        int i18 = 0;
        for (int i19 = 0; i19 < this.e; i19++) {
            if (i19 > 0) {
                int[] iArr5 = this.c;
                if (iArr5[i19] == iArr5[i19 - 1]) {
                }
            }
            dArr[i18] = ((double) this.c[i19]) * 0.01d;
            double[] dArr3 = dArr2[i18];
            float[][] fArr4 = this.d;
            dArr3[0] = (double) fArr4[i19][0];
            dArr2[i18][1] = (double) fArr4[i19][1];
            dArr2[i18][2] = (double) fArr4[i19][2];
            i18++;
        }
        this.a = b.a(i2, dArr, dArr2);
    }

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.e; i2++) {
            StringBuilder S0 = a.S0(str, "[");
            S0.append(this.c[i2]);
            S0.append(" , ");
            S0.append(decimalFormat.format(this.d[i2]));
            S0.append("] ");
            str = S0.toString();
        }
        return str;
    }
}
