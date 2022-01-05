package h0.g.a.g.a;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator */
public abstract class e {
    public b a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public ArrayList<c> f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator */
    public class a implements Comparator<c> {
        public a(e eVar) {
        }

        public int compare(Object obj, Object obj2) {
            return Integer.compare(((c) obj).a, ((c) obj2).a);
        }
    }

    /* compiled from: KeyCycleOscillator */
    public static class b {
        public h a;
        public float[] b;
        public double[] c;
        public float[] d;
        public float[] e;
        public float[] f;
        public b g;
        public double[] h;

        public b(int i, String str, int i2, int i3) {
            char c2;
            long j;
            String str2 = str;
            int i4 = i3;
            h hVar = new h();
            this.a = hVar;
            hVar.f = i;
            hVar.d = str2;
            if (str2 != null) {
                double[] dArr = new double[(str.length() / 2)];
                int indexOf = str2.indexOf(40) + 1;
                int indexOf2 = str2.indexOf(44, indexOf);
                char c3 = 0;
                int i5 = 0;
                while (indexOf2 != -1) {
                    dArr[i5] = Double.parseDouble(str2.substring(indexOf, indexOf2).trim());
                    indexOf = indexOf2 + 1;
                    indexOf2 = str2.indexOf(44, indexOf);
                    i5++;
                }
                dArr[i5] = Double.parseDouble(str2.substring(indexOf, str2.indexOf(41, indexOf)).trim());
                double[] copyOf = Arrays.copyOf(dArr, i5 + 1);
                int length = (copyOf.length * 3) - 2;
                int length2 = copyOf.length - 1;
                double d2 = 1.0d / ((double) length2);
                int[] iArr = new int[2];
                iArr[1] = 1;
                iArr[0] = length;
                double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
                double[] dArr3 = new double[length];
                int i6 = 0;
                while (i6 < copyOf.length) {
                    double d3 = copyOf[i6];
                    int i7 = i6 + length2;
                    dArr2[i7][c3] = d3;
                    double d4 = ((double) i6) * d2;
                    dArr3[i7] = d4;
                    if (i6 > 0) {
                        int i8 = (length2 * 2) + i6;
                        j = 4607182418800017408L;
                        c2 = 0;
                        dArr2[i8][0] = d3 + 1.0d;
                        dArr3[i8] = d4 + 1.0d;
                        int i9 = i6 - 1;
                        dArr2[i9][0] = (d3 - 1.0d) - d2;
                        dArr3[i9] = (d4 - 4.0d) - d2;
                    } else {
                        j = 4607182418800017408L;
                        c2 = 0;
                    }
                    i6++;
                    long j2 = j;
                    c3 = c2;
                }
                hVar.e = new g(dArr3, dArr2);
            }
            this.b = new float[i4];
            this.c = new double[i4];
            this.d = new float[i4];
            this.e = new float[i4];
            this.f = new float[i4];
            float[] fArr = new float[i4];
        }
    }

    /* compiled from: KeyCycleOscillator */
    public static class c {
        public int a;
        public float b;
        public float c;
        public float d;
        public float e;

        public c(int i, float f, float f2, float f3, float f4) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public float a(float f2) {
        double d2;
        double d3;
        double d4;
        float f3 = f2;
        b bVar = this.a;
        b bVar2 = bVar.g;
        if (bVar2 != null) {
            bVar2.c((double) f3, bVar.h);
        } else {
            double[] dArr = bVar.h;
            dArr[0] = (double) bVar.e[0];
            dArr[1] = (double) bVar.f[0];
            dArr[2] = (double) bVar.b[0];
        }
        double[] dArr2 = bVar.h;
        double d5 = dArr2[0];
        double d6 = dArr2[1];
        h hVar = bVar.a;
        double d7 = (double) f3;
        double d8 = 0.0d;
        if (d7 < 0.0d) {
            d7 = 0.0d;
        } else if (d7 > 1.0d) {
            d7 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(hVar.b, d7);
        if (binarySearch > 0) {
            d2 = d5;
            d8 = 1.0d;
        } else if (binarySearch != 0) {
            int i = (-binarySearch) - 1;
            float[] fArr = hVar.a;
            int i2 = i - 1;
            d2 = d5;
            double[] dArr3 = hVar.b;
            double d9 = ((double) (fArr[i] - fArr[i2])) / (dArr3[i] - dArr3[i2]);
            d8 = ((((d7 * d7) - (dArr3[i2] * dArr3[i2])) * d9) / 2.0d) + ((d7 - dArr3[i2]) * (((double) fArr[i2]) - (dArr3[i2] * d9))) + hVar.c[i2];
        } else {
            d2 = d5;
        }
        double d10 = d8 + d6;
        switch (hVar.f) {
            case 1:
                d3 = Math.signum(0.5d - (d10 % 1.0d));
                break;
            case 2:
                d4 = Math.abs((((d10 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                d3 = (((d10 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                d4 = ((d10 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                d3 = Math.cos((d6 + d10) * 6.283185307179586d);
                break;
            case 6:
                double abs = 1.0d - Math.abs(((d10 * 4.0d) % 4.0d) - 2.0d);
                d4 = abs * abs;
                break;
            case 7:
                d3 = hVar.e.b(d10 % 1.0d, 0);
                break;
            default:
                d3 = Math.sin(d10 * 6.283185307179586d);
                break;
        }
        d3 = 1.0d - d4;
        return (float) ((d3 * bVar.h[2]) + d2);
    }

    public void b(Object obj) {
    }

    public void c(float f2) {
        int i;
        Class<double> cls = double.class;
        int size = this.f.size();
        if (size != 0) {
            Collections.sort(this.f, new a(this));
            double[] dArr = new double[size];
            char c2 = 2;
            int[] iArr = new int[2];
            iArr[1] = 3;
            char c3 = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(cls, iArr);
            this.a = new b(this.c, this.d, this.e, size);
            Iterator<c> it = this.f.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                c next = it.next();
                float f3 = next.d;
                dArr[i2] = ((double) f3) * 0.01d;
                double[] dArr3 = dArr2[i2];
                float f4 = next.b;
                dArr3[c3] = (double) f4;
                double[] dArr4 = dArr2[i2];
                float f5 = next.c;
                dArr4[1] = (double) f5;
                double[] dArr5 = dArr2[i2];
                float f6 = next.e;
                Iterator<c> it2 = it;
                dArr5[c2] = (double) f6;
                b bVar = this.a;
                bVar.c[i2] = ((double) next.a) / 100.0d;
                bVar.d[i2] = f3;
                bVar.e[i2] = f5;
                bVar.f[i2] = f6;
                bVar.b[i2] = f4;
                i2++;
                dArr = dArr;
                it = it2;
                dArr2 = dArr2;
                c2 = 2;
                c3 = 0;
            }
            double[] dArr6 = dArr;
            double[][] dArr7 = dArr2;
            b bVar2 = this.a;
            int length = bVar2.c.length;
            int[] iArr2 = new int[2];
            iArr2[1] = 3;
            iArr2[0] = length;
            double[][] dArr8 = (double[][]) Array.newInstance(cls, iArr2);
            float[] fArr = bVar2.b;
            bVar2.h = new double[(fArr.length + 2)];
            double[] dArr9 = new double[(fArr.length + 2)];
            if (bVar2.c[0] > 0.0d) {
                bVar2.a.a(0.0d, bVar2.d[0]);
            }
            double[] dArr10 = bVar2.c;
            int length2 = dArr10.length - 1;
            if (dArr10[length2] < 1.0d) {
                bVar2.a.a(1.0d, bVar2.d[length2]);
            }
            for (int i3 = 0; i3 < dArr8.length; i3++) {
                dArr8[i3][0] = (double) bVar2.e[i3];
                dArr8[i3][1] = (double) bVar2.f[i3];
                dArr8[i3][2] = (double) bVar2.b[i3];
                bVar2.a.a(bVar2.c[i3], bVar2.d[i3]);
            }
            h hVar = bVar2.a;
            double d2 = 0.0d;
            int i4 = 0;
            while (true) {
                float[] fArr2 = hVar.a;
                if (i4 >= fArr2.length) {
                    break;
                }
                d2 += (double) fArr2[i4];
                i4++;
            }
            int i5 = 1;
            double d3 = 0.0d;
            while (true) {
                float[] fArr3 = hVar.a;
                if (i5 >= fArr3.length) {
                    break;
                }
                int i6 = i5 - 1;
                float f7 = (fArr3[i6] + fArr3[i5]) / 2.0f;
                double[] dArr11 = hVar.b;
                d3 = ((dArr11[i5] - dArr11[i6]) * ((double) f7)) + d3;
                i5++;
            }
            int i7 = 0;
            while (true) {
                float[] fArr4 = hVar.a;
                if (i7 >= fArr4.length) {
                    break;
                }
                fArr4[i7] = (float) (((double) fArr4[i7]) * (d2 / d3));
                i7++;
            }
            hVar.c[0] = 0.0d;
            int i8 = 1;
            while (true) {
                float[] fArr5 = hVar.a;
                if (i8 >= fArr5.length) {
                    break;
                }
                int i9 = i8 - 1;
                double[] dArr12 = hVar.b;
                double d4 = dArr12[i8] - dArr12[i9];
                double[] dArr13 = hVar.c;
                dArr13[i8] = (d4 * ((double) ((fArr5[i9] + fArr5[i8]) / 2.0f))) + dArr13[i9];
                i8++;
            }
            double[] dArr14 = bVar2.c;
            if (dArr14.length > 1) {
                i = 0;
                bVar2.g = b.a(0, dArr14, dArr8);
            } else {
                i = 0;
                bVar2.g = null;
            }
            b.a(i, dArr6, dArr7);
        }
    }

    public String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<c> it = this.f.iterator();
        while (it.hasNext()) {
            c next = it.next();
            StringBuilder S0 = i0.d.a.a.a.S0(str, "[");
            S0.append(next.a);
            S0.append(" , ");
            S0.append(decimalFormat.format((double) next.b));
            S0.append("] ");
            str = S0.toString();
        }
        return str;
    }
}
