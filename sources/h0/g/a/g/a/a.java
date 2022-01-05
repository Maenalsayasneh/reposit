package h0.g.a.g.a;

import java.util.Arrays;

/* compiled from: ArcCurveFit */
public class a extends b {
    public final double[] a;
    public C0029a[] b;

    /* renamed from: h0.g.a.g.a.a$a  reason: collision with other inner class name */
    /* compiled from: ArcCurveFit */
    public static class C0029a {
        public static double[] a = new double[91];
        public double[] b;
        public double c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;
        public double i;
        public double j;
        public double k;
        public double l;
        public double m;
        public double n;
        public double o;
        public double p;
        public double q;
        public boolean r;
        public boolean s = false;

        public C0029a(int i2, double d2, double d3, double d4, double d5, double d6, double d7) {
            int i3 = i2;
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            double d11 = d5;
            double d12 = d6;
            double d13 = d7;
            boolean z = false;
            int i4 = 1;
            this.r = i3 == 1 ? true : z;
            this.d = d8;
            this.e = d9;
            this.j = 1.0d / (d9 - d8);
            if (3 == i3) {
                this.s = true;
            }
            double d14 = d12 - d10;
            double d15 = d13 - d11;
            if (this.s || Math.abs(d14) < 0.001d || Math.abs(d15) < 0.001d) {
                this.s = true;
                this.f = d10;
                this.g = d12;
                this.h = d11;
                this.i = d13;
                double hypot = Math.hypot(d15, d14);
                this.c = hypot;
                this.o = hypot * this.j;
                double d16 = this.e;
                double d17 = this.d;
                this.m = d14 / (d16 - d17);
                this.n = d15 / (d16 - d17);
                return;
            }
            this.b = new double[101];
            boolean z2 = this.r;
            this.k = ((double) (z2 ? -1 : i4)) * d14;
            this.l = d15 * ((double) (z2 ? 1 : -1));
            this.m = z2 ? d12 : d10;
            this.n = z2 ? d11 : d13;
            double d18 = d11 - d13;
            int i5 = 0;
            double d19 = 0.0d;
            double d20 = 0.0d;
            double d21 = 0.0d;
            while (true) {
                double[] dArr = a;
                if (i5 >= dArr.length) {
                    break;
                }
                double radians = Math.toRadians((((double) i5) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d14;
                double cos = Math.cos(radians) * d18;
                if (i5 > 0) {
                    d19 += Math.hypot(sin - d20, cos - d21);
                    a[i5] = d19;
                }
                i5++;
                d21 = cos;
                d20 = sin;
            }
            this.c = d19;
            int i6 = 0;
            while (true) {
                double[] dArr2 = a;
                if (i6 >= dArr2.length) {
                    break;
                }
                dArr2[i6] = dArr2[i6] / d19;
                i6++;
            }
            int i7 = 0;
            while (true) {
                double[] dArr3 = this.b;
                if (i7 < dArr3.length) {
                    double length = ((double) i7) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(a, length);
                    if (binarySearch >= 0) {
                        this.b[i7] = ((double) binarySearch) / ((double) (a.length - 1));
                    } else if (binarySearch == -1) {
                        this.b[i7] = 0.0d;
                    } else {
                        int i8 = -binarySearch;
                        int i9 = i8 - 2;
                        double[] dArr4 = a;
                        this.b[i7] = (((length - dArr4[i9]) / (dArr4[i8 - 1] - dArr4[i9])) + ((double) i9)) / ((double) (dArr4.length - 1));
                    }
                    i7++;
                } else {
                    this.o = this.c * this.j;
                    return;
                }
            }
        }

        public double a() {
            double d2 = this.k * this.q;
            double hypot = this.o / Math.hypot(d2, (-this.l) * this.p);
            if (this.r) {
                d2 = -d2;
            }
            return d2 * hypot;
        }

        public double b() {
            double d2 = this.k * this.q;
            double d3 = (-this.l) * this.p;
            double hypot = this.o / Math.hypot(d2, d3);
            return this.r ? (-d3) * hypot : d3 * hypot;
        }

        public double c(double d2) {
            double d3 = (d2 - this.d) * this.j;
            double d4 = this.f;
            return ((this.g - d4) * d3) + d4;
        }

        public double d(double d2) {
            double d3 = (d2 - this.d) * this.j;
            double d4 = this.h;
            return ((this.i - d4) * d3) + d4;
        }

        public double e() {
            return (this.k * this.p) + this.m;
        }

        public double f() {
            return (this.l * this.q) + this.n;
        }

        public void g(double d2) {
            double d3 = (this.r ? this.e - d2 : d2 - this.d) * this.j;
            double d4 = 0.0d;
            if (d3 > 0.0d) {
                d4 = 1.0d;
                if (d3 < 1.0d) {
                    double[] dArr = this.b;
                    double length = d3 * ((double) (dArr.length - 1));
                    int i2 = (int) length;
                    d4 = ((dArr[i2 + 1] - dArr[i2]) * (length - ((double) i2))) + dArr[i2];
                }
            }
            double d5 = d4 * 1.5707963267948966d;
            this.p = Math.sin(d5);
            this.q = Math.cos(d5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r5 == 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.a = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            h0.g.a.g.a.a$a[] r2 = new h0.g.a.g.a.a.C0029a[r2]
            r0.b = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L_0x0014:
            h0.g.a.g.a.a$a[] r7 = r0.b
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0051
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L_0x002d
            if (r8 == r3) goto L_0x002a
            if (r8 == r10) goto L_0x0028
            if (r8 == r9) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            if (r5 != r3) goto L_0x002a
        L_0x0028:
            r5 = r10
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            r6 = r5
            goto L_0x002e
        L_0x002d:
            r6 = r9
        L_0x002e:
            h0.g.a.g.a.a$a r22 = new h0.g.a.g.a.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r8 = r27[r4]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r8 = r27[r23]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0014
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.g.a.a.<init>(int[], double[], double[][]):void");
    }

    public double b(double d, int i) {
        double f;
        double b2;
        C0029a[] aVarArr = this.b;
        int i2 = 0;
        if (d < aVarArr[0].d) {
            double d2 = aVarArr[0].d;
            double d3 = d - aVarArr[0].d;
            if (!aVarArr[0].s) {
                aVarArr[0].g(d2);
                if (i == 0) {
                    f = this.b[0].e();
                    b2 = this.b[0].a();
                } else {
                    f = this.b[0].f();
                    b2 = this.b[0].b();
                }
                return (b2 * d3) + f;
            } else if (i == 0) {
                return (d3 * this.b[0].m) + aVarArr[0].c(d2);
            } else {
                return (d3 * this.b[0].n) + aVarArr[0].d(d2);
            }
        } else if (d > aVarArr[aVarArr.length - 1].e) {
            double d4 = aVarArr[aVarArr.length - 1].e;
            double d5 = d - d4;
            int length = aVarArr.length - 1;
            if (i == 0) {
                return (d5 * this.b[length].m) + aVarArr[length].c(d4);
            }
            return (d5 * this.b[length].n) + aVarArr[length].d(d4);
        } else {
            while (true) {
                C0029a[] aVarArr2 = this.b;
                if (i2 >= aVarArr2.length) {
                    return Double.NaN;
                }
                if (d > aVarArr2[i2].e) {
                    i2++;
                } else if (!aVarArr2[i2].s) {
                    aVarArr2[i2].g(d);
                    if (i == 0) {
                        return this.b[i2].e();
                    }
                    return this.b[i2].f();
                } else if (i == 0) {
                    return aVarArr2[i2].c(d);
                } else {
                    return aVarArr2[i2].d(d);
                }
            }
        }
    }

    public void c(double d, double[] dArr) {
        C0029a[] aVarArr = this.b;
        if (d < aVarArr[0].d) {
            double d2 = aVarArr[0].d;
            double d3 = d - aVarArr[0].d;
            if (aVarArr[0].s) {
                double c = aVarArr[0].c(d2);
                C0029a[] aVarArr2 = this.b;
                dArr[0] = (aVarArr2[0].m * d3) + c;
                dArr[1] = (d3 * this.b[0].n) + aVarArr2[0].d(d2);
                return;
            }
            aVarArr[0].g(d2);
            dArr[0] = (this.b[0].a() * d3) + this.b[0].e();
            dArr[1] = (this.b[0].b() * d3) + this.b[0].f();
        } else if (d > aVarArr[aVarArr.length - 1].e) {
            double d4 = aVarArr[aVarArr.length - 1].e;
            double d5 = d - d4;
            int length = aVarArr.length - 1;
            if (aVarArr[length].s) {
                double c2 = aVarArr[length].c(d4);
                C0029a[] aVarArr3 = this.b;
                dArr[0] = (aVarArr3[length].m * d5) + c2;
                dArr[1] = (d5 * this.b[length].n) + aVarArr3[length].d(d4);
                return;
            }
            aVarArr[length].g(d);
            dArr[0] = (this.b[length].a() * d5) + this.b[length].e();
            dArr[1] = (this.b[length].b() * d5) + this.b[length].f();
        } else {
            int i = 0;
            while (true) {
                C0029a[] aVarArr4 = this.b;
                if (i >= aVarArr4.length) {
                    return;
                }
                if (d > aVarArr4[i].e) {
                    i++;
                } else if (aVarArr4[i].s) {
                    dArr[0] = aVarArr4[i].c(d);
                    dArr[1] = this.b[i].d(d);
                    return;
                } else {
                    aVarArr4[i].g(d);
                    dArr[0] = this.b[i].e();
                    dArr[1] = this.b[i].f();
                    return;
                }
            }
        }
    }

    public void d(double d, float[] fArr) {
        C0029a[] aVarArr = this.b;
        if (d < aVarArr[0].d) {
            double d2 = aVarArr[0].d;
            double d3 = d - aVarArr[0].d;
            if (aVarArr[0].s) {
                double c = aVarArr[0].c(d2);
                C0029a[] aVarArr2 = this.b;
                fArr[0] = (float) ((aVarArr2[0].m * d3) + c);
                fArr[1] = (float) ((d3 * this.b[0].n) + aVarArr2[0].d(d2));
                return;
            }
            aVarArr[0].g(d2);
            fArr[0] = (float) ((this.b[0].a() * d3) + this.b[0].e());
            fArr[1] = (float) ((this.b[0].b() * d3) + this.b[0].f());
        } else if (d > aVarArr[aVarArr.length - 1].e) {
            double d4 = aVarArr[aVarArr.length - 1].e;
            double d5 = d - d4;
            int length = aVarArr.length - 1;
            if (aVarArr[length].s) {
                double c2 = aVarArr[length].c(d4);
                C0029a[] aVarArr3 = this.b;
                fArr[0] = (float) ((aVarArr3[length].m * d5) + c2);
                fArr[1] = (float) ((d5 * this.b[length].n) + aVarArr3[length].d(d4));
                return;
            }
            aVarArr[length].g(d);
            fArr[0] = (float) this.b[length].e();
            fArr[1] = (float) this.b[length].f();
        } else {
            int i = 0;
            while (true) {
                C0029a[] aVarArr4 = this.b;
                if (i >= aVarArr4.length) {
                    return;
                }
                if (d > aVarArr4[i].e) {
                    i++;
                } else if (aVarArr4[i].s) {
                    fArr[0] = (float) aVarArr4[i].c(d);
                    fArr[1] = (float) this.b[i].d(d);
                    return;
                } else {
                    aVarArr4[i].g(d);
                    fArr[0] = (float) this.b[i].e();
                    fArr[1] = (float) this.b[i].f();
                    return;
                }
            }
        }
    }

    public void e(double d, double[] dArr) {
        C0029a[] aVarArr = this.b;
        if (d < aVarArr[0].d) {
            d = aVarArr[0].d;
        } else if (d > aVarArr[aVarArr.length - 1].e) {
            d = aVarArr[aVarArr.length - 1].e;
        }
        int i = 0;
        while (true) {
            C0029a[] aVarArr2 = this.b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].e) {
                i++;
            } else if (aVarArr2[i].s) {
                dArr[0] = aVarArr2[i].m;
                dArr[1] = aVarArr2[i].n;
                return;
            } else {
                aVarArr2[i].g(d);
                dArr[0] = this.b[i].a();
                dArr[1] = this.b[i].b();
                return;
            }
        }
    }

    public double[] f() {
        return this.a;
    }
}
