package h0.g.a.g.a;

import java.lang.reflect.Array;

/* compiled from: MonotonicCurveFit */
public class g extends b {
    public double[] a;
    public double[][] b;
    public double[][] c;
    public double[] d;

    public g(double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        double[][] dArr4 = dArr2;
        Class<double> cls = double.class;
        int length = dArr3.length;
        int length2 = dArr4[0].length;
        this.d = new double[length2];
        int i = length - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i;
        double[][] dArr5 = (double[][]) Array.newInstance(cls, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        double[][] dArr6 = (double[][]) Array.newInstance(cls, iArr2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                dArr5[i3][i2] = (dArr4[i4][i2] - dArr4[i3][i2]) / (dArr3[i4] - dArr3[i3]);
                if (i3 == 0) {
                    dArr6[i3][i2] = dArr5[i3][i2];
                } else {
                    dArr6[i3][i2] = (dArr5[i3 - 1][i2] + dArr5[i3][i2]) * 0.5d;
                }
                i3 = i4;
            }
            dArr6[i][i2] = dArr5[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                if (dArr5[i5][i6] == 0.0d) {
                    dArr6[i5][i6] = 0.0d;
                    dArr6[i5 + 1][i6] = 0.0d;
                } else {
                    double d2 = dArr6[i5][i6] / dArr5[i5][i6];
                    int i7 = i5 + 1;
                    double d3 = dArr6[i7][i6] / dArr5[i5][i6];
                    double hypot = Math.hypot(d2, d3);
                    if (hypot > 9.0d) {
                        double d4 = 3.0d / hypot;
                        dArr6[i5][i6] = d2 * d4 * dArr5[i5][i6];
                        dArr6[i7][i6] = d4 * d3 * dArr5[i5][i6];
                    }
                }
            }
        }
        this.a = dArr3;
        this.b = dArr4;
        this.c = dArr6;
    }

    public static double g(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d3 * d3;
        double d9 = d3 * 6.0d;
        double d10 = 6.0d * d8 * d4;
        double d11 = 3.0d * d2;
        double d12 = d11 * d6 * d8;
        return (d2 * d6) + (((d12 + (((d11 * d7) * d8) + ((d10 + ((d9 * d5) + ((-6.0d * d8) * d5))) - (d9 * d4)))) - (((2.0d * d2) * d7) * d3)) - (((4.0d * d2) * d6) * d3));
    }

    public static double i(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d3 * d3;
        double d9 = d8 * d3;
        double d10 = 3.0d * d8;
        double d11 = d10 * d5;
        double d12 = d2 * d7;
        double d13 = d12 * d9;
        double d14 = d2 * d6;
        return (d14 * d3) + ((((d9 * d14) + (d13 + (((((d9 * 2.0d) * d4) + (d11 + ((-2.0d * d9) * d5))) - (d10 * d4)) + d4))) - (d12 * d8)) - (((2.0d * d2) * d6) * d8));
    }

    public double b(double d2, int i) {
        int i2 = i;
        double[] dArr = this.a;
        int length = dArr.length;
        int i3 = 0;
        if (d2 <= dArr[0]) {
            return (h(dArr[0], i2) * (d2 - dArr[0])) + this.b[0][i2];
        }
        int i4 = length - 1;
        if (d2 >= dArr[i4]) {
            return (h(dArr[i4], i2) * (d2 - dArr[i4])) + this.b[i4][i2];
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.a;
            if (d2 == dArr2[i3]) {
                return this.b[i3][i2];
            }
            int i5 = i3 + 1;
            if (d2 < dArr2[i5]) {
                double d3 = dArr2[i5] - dArr2[i3];
                double d4 = (d2 - dArr2[i3]) / d3;
                double[][] dArr3 = this.b;
                double d5 = dArr3[i3][i2];
                double d6 = dArr3[i5][i2];
                double[][] dArr4 = this.c;
                return i(d3, d4, d5, d6, dArr4[i3][i2], dArr4[i5][i2]);
            }
            i3 = i5;
        }
        return 0.0d;
    }

    public void c(double d2, double[] dArr) {
        double[] dArr2 = this.a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.b[0].length;
        if (d2 <= dArr2[0]) {
            e(dArr2[0], this.d);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d2 - this.a[0]) * this.d[i2]) + this.b[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d2 >= dArr2[i3]) {
            e(dArr2[i3], this.d);
            while (i < length2) {
                dArr[i] = ((d2 - this.a[i3]) * this.d[i]) + this.b[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d2 == this.a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.b[i4][i5];
                }
            }
            double[] dArr3 = this.a;
            int i6 = i4 + 1;
            if (d2 < dArr3[i6]) {
                double d3 = dArr3[i6] - dArr3[i4];
                double d4 = (d2 - dArr3[i4]) / d3;
                while (i < length2) {
                    double[][] dArr4 = this.b;
                    double d5 = dArr4[i4][i];
                    double d6 = dArr4[i6][i];
                    double[][] dArr5 = this.c;
                    dArr[i] = i(d3, d4, d5, d6, dArr5[i4][i], dArr5[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    public void d(double d2, float[] fArr) {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.b[0].length;
        if (d2 <= dArr[0]) {
            e(dArr[0], this.d);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d2 - this.a[0]) * this.d[i2]) + this.b[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        if (d2 >= dArr[i3]) {
            e(dArr[i3], this.d);
            while (i < length2) {
                fArr[i] = (float) (((d2 - this.a[i3]) * this.d[i]) + this.b[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d2 == this.a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.b[i4][i5];
                }
            }
            double[] dArr2 = this.a;
            int i6 = i4 + 1;
            if (d2 < dArr2[i6]) {
                double d3 = dArr2[i6] - dArr2[i4];
                double d4 = (d2 - dArr2[i4]) / d3;
                while (i < length2) {
                    double[][] dArr3 = this.b;
                    double d5 = dArr3[i4][i];
                    double d6 = dArr3[i6][i];
                    double[][] dArr4 = this.c;
                    fArr[i] = (float) i(d3, d4, d5, d6, dArr4[i4][i], dArr4[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    public void e(double d2, double[] dArr) {
        double d3;
        double[] dArr2 = this.a;
        int length = dArr2.length;
        int length2 = this.b[0].length;
        if (d2 <= dArr2[0]) {
            d3 = dArr2[0];
        } else {
            int i = length - 1;
            d3 = d2 >= dArr2[i] ? dArr2[i] : d2;
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.a;
            int i3 = i2 + 1;
            if (d3 <= dArr3[i3]) {
                double d4 = dArr3[i3] - dArr3[i2];
                double d5 = (d3 - dArr3[i2]) / d4;
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.b;
                    double d6 = dArr4[i2][i4];
                    double d7 = dArr4[i3][i4];
                    double[][] dArr5 = this.c;
                    dArr[i4] = g(d4, d5, d6, d7, dArr5[i2][i4], dArr5[i3][i4]) / d4;
                }
                return;
            }
            i2 = i3;
        }
    }

    public double[] f() {
        return this.a;
    }

    public double h(double d2, int i) {
        double d3;
        double[] dArr = this.a;
        int length = dArr.length;
        int i2 = 0;
        if (d2 < dArr[0]) {
            d3 = dArr[0];
        } else {
            int i3 = length - 1;
            d3 = d2 >= dArr[i3] ? dArr[i3] : d2;
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.a;
            int i4 = i2 + 1;
            if (d3 <= dArr2[i4]) {
                double d4 = dArr2[i4] - dArr2[i2];
                double[][] dArr3 = this.b;
                double d5 = dArr3[i2][i];
                double d6 = dArr3[i4][i];
                double[][] dArr4 = this.c;
                return g(d4, (d3 - dArr2[i2]) / d4, d5, d6, dArr4[i2][i], dArr4[i4][i]) / d4;
            }
            i2 = i4;
        }
        return 0.0d;
    }
}
