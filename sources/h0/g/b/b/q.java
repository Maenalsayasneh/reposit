package h0.g.b.b;

import androidx.constraintlayout.widget.ConstraintAttribute;
import h0.g.a.g.a.c;
import h0.g.c.c;
import i0.d.a.a.a;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths */
public class q implements Comparable<q> {
    public static String[] c = {"position", "x", "y", "width", "height", "pathRotate"};
    public float Y1;
    public float Z1;
    public float a2;
    public float b2;
    public float c2 = Float.NaN;
    public c d;
    public int d2 = -1;
    public int e2 = -1;
    public float f2 = Float.NaN;
    public n g2 = null;
    public LinkedHashMap<String, ConstraintAttribute> h2 = new LinkedHashMap<>();
    public int i2 = 0;
    public double[] j2 = new double[18];
    public double[] k2 = new double[18];
    public int q = 0;
    public float x;
    public float y;

    public q() {
    }

    public void a(c.a aVar) {
        this.d = h0.g.a.g.a.c.c(aVar.d.e);
        c.C0036c cVar = aVar.d;
        this.d2 = cVar.f;
        this.e2 = cVar.c;
        this.c2 = cVar.j;
        this.q = cVar.g;
        int i = cVar.d;
        float f = aVar.c.e;
        this.f2 = aVar.e.C;
        for (String next : aVar.g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.g.get(next);
            if (constraintAttribute != null && constraintAttribute.d()) {
                this.h2.put(next, constraintAttribute);
            }
        }
    }

    public final boolean b(float f, float f3) {
        if (Float.isNaN(f) || Float.isNaN(f3)) {
            if (Float.isNaN(f) != Float.isNaN(f3)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f3) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Object obj) {
        return Float.compare(this.y, ((q) obj).y);
    }

    public void e(double d3, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.Y1;
        float f3 = this.Z1;
        float f4 = this.a2;
        float f5 = this.b2;
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            float f6 = (float) dArr[i3];
            int i4 = iArr2[i3];
            if (i4 == 1) {
                f = f6;
            } else if (i4 == 2) {
                f3 = f6;
            } else if (i4 == 3) {
                f4 = f6;
            } else if (i4 == 4) {
                f5 = f6;
            }
        }
        n nVar = this.g2;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.b(d3, fArr2, new float[2]);
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            double d4 = (double) f7;
            double d5 = (double) f;
            double d6 = (double) f3;
            f = (float) (((Math.sin(d6) * d5) + d4) - ((double) (f4 / 2.0f)));
            f3 = (float) ((((double) f8) - (Math.cos(d6) * d5)) - ((double) (f5 / 2.0f)));
        }
        fArr[i] = (f4 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f5 / 2.0f) + f3 + 0.0f;
    }

    public void f(float f, float f3, float f4, float f5) {
        this.Y1 = f;
        this.Z1 = f3;
        this.a2 = f4;
        this.b2 = f5;
    }

    public void g(float f, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f8 = (float) dArr[i];
            double d3 = dArr2[i];
            int i3 = iArr2[i];
            if (i3 == 1) {
                f4 = f8;
            } else if (i3 == 2) {
                f6 = f8;
            } else if (i3 == 3) {
                f5 = f8;
            } else if (i3 == 4) {
                f7 = f8;
            }
        }
        float f9 = f4 - ((0.0f * f5) / 2.0f);
        float f10 = f6 - ((0.0f * f7) / 2.0f);
        fArr[0] = (((f5 * 1.0f) + f9) * f) + ((1.0f - f) * f9) + 0.0f;
        fArr[1] = (((f7 * 1.0f) + f10) * f3) + ((1.0f - f3) * f10) + 0.0f;
    }

    public void i(n nVar, q qVar) {
        double d3 = (double) ((((this.a2 / 2.0f) + this.Y1) - qVar.Y1) - (qVar.a2 / 2.0f));
        double d4 = (double) ((((this.b2 / 2.0f) + this.Z1) - qVar.Z1) - (qVar.b2 / 2.0f));
        this.g2 = nVar;
        this.Y1 = (float) Math.hypot(d4, d3);
        if (Float.isNaN(this.f2)) {
            this.Z1 = (float) (Math.atan2(d4, d3) + 1.5707963267948966d);
        } else {
            this.Z1 = (float) Math.toRadians((double) this.f2);
        }
    }

    public q(int i, int i3, h hVar, q qVar, q qVar2) {
        float f;
        int i4;
        float f3;
        float f4;
        h hVar2 = hVar;
        q qVar3 = qVar;
        q qVar4 = qVar2;
        if (qVar3.e2 != -1) {
            float f5 = ((float) hVar2.a) / 100.0f;
            this.x = f5;
            this.q = hVar2.i;
            this.i2 = hVar2.p;
            float f6 = Float.isNaN(hVar2.j) ? f5 : hVar2.j;
            float f7 = Float.isNaN(hVar2.k) ? f5 : hVar2.k;
            float f8 = qVar4.a2;
            float f9 = qVar3.a2;
            float f10 = qVar4.b2;
            float f11 = qVar3.b2;
            this.y = this.x;
            this.a2 = (float) ((int) (((f8 - f9) * f6) + f9));
            this.b2 = (float) ((int) (((f10 - f11) * f7) + f11));
            int i5 = hVar2.p;
            if (i5 == 1) {
                float f12 = Float.isNaN(hVar2.l) ? f5 : hVar2.l;
                float f13 = qVar4.Y1;
                float f14 = qVar3.Y1;
                this.Y1 = a.a(f13, f14, f12, f14);
                f5 = !Float.isNaN(hVar2.m) ? hVar2.m : f5;
                float f15 = qVar4.Z1;
                float f16 = qVar3.Z1;
                this.Z1 = a.a(f15, f16, f5, f16);
            } else if (i5 != 2) {
                float f17 = Float.isNaN(hVar2.l) ? f5 : hVar2.l;
                float f18 = qVar4.Y1;
                float f19 = qVar3.Y1;
                this.Y1 = a.a(f18, f19, f17, f19);
                f5 = !Float.isNaN(hVar2.m) ? hVar2.m : f5;
                float f20 = qVar4.Z1;
                float f21 = qVar3.Z1;
                this.Z1 = a.a(f20, f21, f5, f21);
            } else {
                if (Float.isNaN(hVar2.l)) {
                    float f22 = qVar4.Y1;
                    float f23 = qVar3.Y1;
                    f3 = a.a(f22, f23, f5, f23);
                } else {
                    f3 = hVar2.l * Math.min(f7, f6);
                }
                this.Y1 = f3;
                if (Float.isNaN(hVar2.m)) {
                    float f24 = qVar4.Z1;
                    float f25 = qVar3.Z1;
                    f4 = a.a(f24, f25, f5, f25);
                } else {
                    f4 = hVar2.m;
                }
                this.Z1 = f4;
            }
            this.e2 = qVar3.e2;
            this.d = h0.g.a.g.a.c.c(hVar2.g);
            this.d2 = hVar2.h;
            return;
        }
        int i6 = hVar2.p;
        if (i6 == 1) {
            q qVar5 = qVar3;
            float f26 = ((float) hVar2.a) / 100.0f;
            this.x = f26;
            this.q = hVar2.i;
            float f27 = Float.isNaN(hVar2.j) ? f26 : hVar2.j;
            float f28 = Float.isNaN(hVar2.k) ? f26 : hVar2.k;
            float f29 = qVar4.a2 - qVar5.a2;
            float f30 = qVar4.b2 - qVar5.b2;
            this.y = this.x;
            f26 = !Float.isNaN(hVar2.l) ? hVar2.l : f26;
            float f31 = qVar5.Y1;
            float f32 = qVar5.a2;
            float f33 = qVar5.Z1;
            float f34 = qVar5.b2;
            float f35 = ((qVar4.a2 / 2.0f) + qVar4.Y1) - ((f32 / 2.0f) + f31);
            float f36 = ((qVar4.b2 / 2.0f) + qVar4.Z1) - ((f34 / 2.0f) + f33);
            float f37 = f35 * f26;
            float f38 = f29 * f27;
            float f39 = f38 / 2.0f;
            this.Y1 = (float) ((int) ((f31 + f37) - f39));
            float f40 = f26 * f36;
            float f41 = f30 * f28;
            float f42 = f41 / 2.0f;
            this.Z1 = (float) ((int) ((f33 + f40) - f42));
            this.a2 = (float) ((int) (f32 + f38));
            this.b2 = (float) ((int) (f34 + f41));
            h hVar3 = hVar;
            float f43 = Float.isNaN(hVar3.m) ? 0.0f : hVar3.m;
            float f44 = (-f36) * f43;
            float f45 = f35 * f43;
            this.i2 = 1;
            q qVar6 = qVar;
            float f46 = (float) ((int) ((qVar6.Y1 + f37) - f39));
            this.Y1 = f46;
            float f47 = (float) ((int) ((qVar6.Z1 + f40) - f42));
            this.Z1 = f47;
            this.Y1 = f46 + f44;
            this.Z1 = f47 + f45;
            this.e2 = this.e2;
            this.d = h0.g.a.g.a.c.c(hVar3.g);
            this.d2 = hVar3.h;
        } else if (i6 != 2) {
            float f48 = ((float) hVar2.a) / 100.0f;
            this.x = f48;
            this.q = hVar2.i;
            float f49 = Float.isNaN(hVar2.j) ? f48 : hVar2.j;
            float f50 = Float.isNaN(hVar2.k) ? f48 : hVar2.k;
            float f51 = qVar4.a2;
            float f52 = qVar3.a2;
            float f53 = f51 - f52;
            float f54 = qVar4.b2;
            float f55 = qVar3.b2;
            float f56 = f54 - f55;
            this.y = this.x;
            float f57 = qVar3.Y1;
            float f58 = qVar3.Z1;
            float f59 = ((f51 / 2.0f) + qVar4.Y1) - ((f52 / 2.0f) + f57);
            float f60 = ((f54 / 2.0f) + qVar4.Z1) - ((f55 / 2.0f) + f58);
            float f61 = f53 * f49;
            float f62 = f61 / 2.0f;
            this.Y1 = (float) ((int) (((f59 * f48) + f57) - f62));
            float f63 = (f60 * f48) + f58;
            float f64 = f56 * f50;
            float f65 = f64 / 2.0f;
            this.Z1 = (float) ((int) (f63 - f65));
            this.a2 = (float) ((int) (f52 + f61));
            this.b2 = (float) ((int) (f55 + f64));
            h hVar4 = hVar;
            float f66 = Float.isNaN(hVar4.l) ? f48 : hVar4.l;
            float f67 = Float.isNaN(hVar4.o) ? 0.0f : hVar4.o;
            f48 = !Float.isNaN(hVar4.m) ? hVar4.m : f48;
            if (Float.isNaN(hVar4.n)) {
                i4 = 0;
                f = 0.0f;
            } else {
                f = hVar4.n;
                i4 = 0;
            }
            this.i2 = i4;
            q qVar7 = qVar;
            this.Y1 = (float) ((int) (((f * f60) + ((f66 * f59) + qVar7.Y1)) - f62));
            this.Z1 = (float) ((int) (((f60 * f48) + ((f59 * f67) + qVar7.Z1)) - f65));
            this.d = h0.g.a.g.a.c.c(hVar4.g);
            this.d2 = hVar4.h;
        } else {
            q qVar8 = qVar3;
            h hVar5 = hVar2;
            float f68 = ((float) hVar5.a) / 100.0f;
            this.x = f68;
            this.q = hVar5.i;
            float f69 = Float.isNaN(hVar5.j) ? f68 : hVar5.j;
            float f70 = Float.isNaN(hVar5.k) ? f68 : hVar5.k;
            float f71 = qVar4.a2;
            float f72 = qVar8.a2;
            float f73 = f71 - f72;
            float f74 = qVar4.b2;
            float f75 = qVar8.b2;
            float f76 = f74 - f75;
            this.y = this.x;
            float f77 = qVar8.Y1;
            float f78 = qVar8.Z1;
            float f79 = (f71 / 2.0f) + qVar4.Y1;
            float f80 = (f74 / 2.0f) + qVar4.Z1;
            float f81 = f73 * f69;
            this.Y1 = (float) ((int) ((((f79 - ((f72 / 2.0f) + f77)) * f68) + f77) - (f81 / 2.0f)));
            float f82 = f76 * f70;
            this.Z1 = (float) ((int) ((((f80 - ((f75 / 2.0f) + f78)) * f68) + f78) - (f82 / 2.0f)));
            this.a2 = (float) ((int) (f72 + f81));
            this.b2 = (float) ((int) (f75 + f82));
            this.i2 = 2;
            h hVar6 = hVar;
            if (!Float.isNaN(hVar6.l)) {
                this.Y1 = (float) ((int) (hVar6.l * ((float) ((int) (((float) i) - this.a2)))));
            }
            if (!Float.isNaN(hVar6.m)) {
                this.Z1 = (float) ((int) (hVar6.m * ((float) ((int) (((float) i3) - this.b2)))));
            }
            this.e2 = this.e2;
            this.d = h0.g.a.g.a.c.c(hVar6.g);
            this.d2 = hVar6.h;
        }
    }
}
