package h0.g.b.b;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.g.a.g.a.b;
import h0.g.a.g.a.j;
import h0.g.b.a.b;
import h0.g.b.a.c;
import h0.g.b.a.d;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: MotionController */
public class n {
    public k[] A;
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;
    public Rect a = new Rect();
    public View b;
    public int c;
    public int d = -1;
    public q e = new q();
    public q f = new q();
    public l g = new l();
    public l h = new l();
    public b[] i;
    public b j;
    public float k = Float.NaN;
    public float l = 0.0f;
    public float m = 1.0f;
    public int[] n;
    public double[] o;
    public double[] p;
    public String[] q;
    public int[] r;
    public int s = 4;
    public float[] t = new float[4];
    public ArrayList<q> u = new ArrayList<>();
    public float[] v = new float[1];
    public ArrayList<d> w = new ArrayList<>();
    public HashMap<String, d> x;
    public HashMap<String, c> y;
    public HashMap<String, h0.g.b.a.b> z;

    public n(View view) {
        this.b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            String str = ((ConstraintLayout.a) layoutParams).X;
        }
    }

    public final float a(float f2, float[] fArr) {
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f5 = this.m;
            if (((double) f5) != 1.0d) {
                float f6 = this.l;
                if (f2 < f6) {
                    f2 = 0.0f;
                }
                if (f2 > f6 && ((double) f2) < 1.0d) {
                    f2 = Math.min((f2 - f6) * f5, 1.0f);
                }
            }
        }
        h0.g.a.g.a.c cVar = this.e.d;
        float f7 = Float.NaN;
        Iterator<q> it = this.u.iterator();
        while (it.hasNext()) {
            q next = it.next();
            h0.g.a.g.a.c cVar2 = next.d;
            if (cVar2 != null) {
                float f8 = next.x;
                if (f8 < f2) {
                    cVar = cVar2;
                    f3 = f8;
                } else if (Float.isNaN(f7)) {
                    f7 = next.x;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f7)) {
                f4 = f7;
            }
            float f9 = f4 - f3;
            double d2 = (double) ((f2 - f3) / f9);
            f2 = (((float) cVar.a(d2)) * f9) + f3;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d2);
            }
        }
        return f2;
    }

    public void b(double d2, float[] fArr, float[] fArr2) {
        double d3 = d2;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.i[0].c(d3, dArr);
        this.i[0].e(d3, dArr2);
        float f2 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        q qVar = this.e;
        int[] iArr = this.n;
        float f3 = qVar.Y1;
        float f4 = qVar.Z1;
        float f5 = qVar.a2;
        float f6 = qVar.b2;
        float f7 = 0.0f;
        float f8 = 0.0f;
        int i2 = 0;
        float f9 = 0.0f;
        while (i2 < iArr.length) {
            float f10 = (float) dArr[i2];
            float f11 = (float) dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f3 = f10;
                f2 = f11;
            } else if (i3 == 2) {
                f4 = f10;
                f9 = f11;
            } else if (i3 == 3) {
                f5 = f10;
                f7 = f11;
            } else if (i3 == 4) {
                f6 = f10;
                f8 = f11;
            }
            i2++;
            double d4 = d2;
            float[] fArr3 = fArr2;
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f2;
        float f14 = (f8 / 2.0f) + f9;
        n nVar = qVar.g2;
        if (nVar != null) {
            float[] fArr4 = new float[2];
            float[] fArr5 = new float[2];
            nVar.b(d2, fArr4, fArr5);
            float f15 = fArr4[0];
            float f16 = fArr4[1];
            float f17 = fArr5[0];
            float f18 = fArr5[1];
            double d5 = (double) f3;
            double d6 = (double) f4;
            float cos = (float) ((((double) f16) - (Math.cos(d6) * d5)) - ((double) (f6 / 2.0f)));
            double d7 = (double) f17;
            double d8 = (double) f2;
            double sin = (Math.sin(d6) * d8) + d7;
            double d9 = (double) f9;
            f14 = (float) ((Math.sin(d6) * d9) + (((double) f18) - (Math.cos(d6) * d8)));
            f4 = cos;
            f13 = (float) ((Math.cos(d6) * d9) + sin);
            f3 = (float) (((Math.sin(d6) * d5) + ((double) f15)) - ((double) (f5 / 2.0f)));
            f12 = 2.0f;
        }
        fArr[0] = (f5 / f12) + f3 + 0.0f;
        fArr[1] = (f6 / f12) + f4 + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    public boolean c(View view, float f2, long j2, h0.g.a.g.a.d dVar) {
        boolean z2;
        d.C0033d dVar2;
        boolean z3;
        float f3;
        boolean z4;
        d.C0033d dVar3;
        double d2;
        float f4;
        double d3;
        float f5;
        float f6;
        d.C0033d dVar4;
        n nVar = this;
        View view2 = view;
        float a2 = nVar.a(f2, (float[]) null);
        int i2 = nVar.E;
        float f7 = 1.0f;
        if (i2 != -1) {
            float f8 = 1.0f / ((float) i2);
            float floor = ((float) Math.floor((double) (a2 / f8))) * f8;
            float f9 = (a2 % f8) / f8;
            if (!Float.isNaN(nVar.F)) {
                f9 = (f9 + nVar.F) % 1.0f;
            }
            Interpolator interpolator = nVar.G;
            if (interpolator != null) {
                f7 = interpolator.getInterpolation(f9);
            } else if (((double) f9) <= 0.5d) {
                f7 = 0.0f;
            }
            a2 = (f7 * f8) + floor;
        }
        float f10 = a2;
        HashMap<String, c> hashMap = nVar.y;
        if (hashMap != null) {
            for (c d4 : hashMap.values()) {
                d4.d(view2, f10);
            }
        }
        HashMap<String, d> hashMap2 = nVar.x;
        if (hashMap2 != null) {
            dVar2 = null;
            z2 = false;
            for (d next : hashMap2.values()) {
                if (next instanceof d.C0033d) {
                    dVar2 = (d.C0033d) next;
                } else {
                    z2 |= next.e(view, f10, j2, dVar);
                }
            }
        } else {
            dVar2 = null;
            z2 = false;
        }
        b[] bVarArr = nVar.i;
        if (bVarArr != null) {
            double d5 = (double) f10;
            bVarArr[0].c(d5, nVar.o);
            nVar.i[0].e(d5, nVar.p);
            b bVar = nVar.j;
            if (bVar != null) {
                double[] dArr = nVar.o;
                if (dArr.length > 0) {
                    bVar.c(d5, dArr);
                    nVar.j.e(d5, nVar.p);
                }
            }
            if (!nVar.H) {
                q qVar = nVar.e;
                int[] iArr = nVar.n;
                double[] dArr2 = nVar.o;
                double[] dArr3 = nVar.p;
                float f11 = qVar.Y1;
                float f12 = qVar.Z1;
                float f13 = qVar.a2;
                float f14 = qVar.b2;
                if (iArr.length != 0) {
                    f5 = f11;
                    if (qVar.j2.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        qVar.j2 = new double[i3];
                        qVar.k2 = new double[i3];
                    }
                } else {
                    f5 = f11;
                }
                float f15 = f13;
                float f16 = f14;
                Arrays.fill(qVar.j2, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    qVar.j2[iArr[i4]] = dArr2[i4];
                    qVar.k2[iArr[i4]] = dArr3[i4];
                }
                float f17 = Float.NaN;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = 0.0f;
                int i5 = 0;
                float f21 = f12;
                float f22 = 0.0f;
                float f23 = f5;
                z4 = z2;
                while (true) {
                    double[] dArr4 = qVar.j2;
                    f4 = f10;
                    if (i5 >= dArr4.length) {
                        break;
                    }
                    if (Double.isNaN(dArr4[i5])) {
                        dVar4 = dVar2;
                    } else {
                        double d6 = 0.0d;
                        if (!Double.isNaN(qVar.j2[i5])) {
                            d6 = qVar.j2[i5] + 0.0d;
                        }
                        dVar4 = dVar2;
                        float f24 = (float) d6;
                        float f25 = (float) qVar.k2[i5];
                        if (i5 == 1) {
                            f18 = f25;
                            f23 = f24;
                        } else if (i5 == 2) {
                            f22 = f25;
                            f21 = f24;
                        } else if (i5 == 3) {
                            f20 = f25;
                            f15 = f24;
                        } else if (i5 == 4) {
                            f19 = f25;
                            f16 = f24;
                        } else if (i5 == 5) {
                            f17 = f24;
                        }
                    }
                    i5++;
                    dVar2 = dVar4;
                    f10 = f4;
                }
                d.C0033d dVar5 = dVar2;
                n nVar2 = qVar.g2;
                if (nVar2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar2.b(d5, fArr, fArr2);
                    float f26 = fArr[0];
                    float f27 = fArr[1];
                    float f28 = fArr2[0];
                    float f29 = fArr2[1];
                    d2 = d5;
                    double d7 = (double) f23;
                    double[] dArr5 = dArr3;
                    double d8 = (double) f21;
                    float sin = (float) (((Math.sin(d8) * d7) + ((double) f26)) - ((double) (f15 / 2.0f)));
                    dVar3 = dVar5;
                    float cos = (float) ((((double) f27) - (Math.cos(d8) * d7)) - ((double) (f16 / 2.0f)));
                    double d9 = (double) f18;
                    f6 = f15;
                    double d10 = (double) f22;
                    float cos2 = (float) ((Math.cos(d8) * d7 * d10) + (Math.sin(d8) * d9) + ((double) f28));
                    float sin2 = (float) ((Math.sin(d8) * d7 * d10) + (((double) f29) - (Math.cos(d8) * d9)));
                    double[] dArr6 = dArr5;
                    if (dArr6.length >= 2) {
                        dArr6[0] = (double) cos2;
                        dArr6[1] = (double) sin2;
                    }
                    if (!Float.isNaN(f17)) {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((double) sin2, (double) cos2)) + ((double) f17)));
                    } else {
                        view2 = view;
                    }
                    f23 = sin;
                    f21 = cos;
                } else {
                    dVar3 = dVar5;
                    d2 = d5;
                    f6 = f15;
                    if (!Float.isNaN(f17)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((double) ((f19 / 2.0f) + f22), (double) ((f20 / 2.0f) + f18))) + ((double) f17) + ((double) 0.0f)));
                    }
                }
                if (view2 instanceof c) {
                    ((c) view2).a(f23, f21, f6 + f23, f21 + f16);
                } else {
                    float f30 = f23 + 0.5f;
                    int i6 = (int) f30;
                    float f31 = f21 + 0.5f;
                    int i7 = (int) f31;
                    int i8 = (int) (f30 + f6);
                    int i9 = (int) (f31 + f16);
                    int i10 = i8 - i6;
                    int i11 = i9 - i7;
                    if ((i10 == view.getMeasuredWidth() && i11 == view.getMeasuredHeight()) ? false : true) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    }
                    view2.layout(i6, i7, i8, i9);
                }
            } else {
                f4 = f10;
                dVar3 = dVar2;
                z4 = z2;
                d2 = d5;
            }
            nVar = this;
            if (nVar.C != -1) {
                if (nVar.D == null) {
                    nVar.D = ((View) view.getParent()).findViewById(nVar.C);
                }
                View view3 = nVar.D;
                if (view3 != null) {
                    float bottom = ((float) (nVar.D.getBottom() + view3.getTop())) / 2.0f;
                    float right = ((float) (nVar.D.getRight() + nVar.D.getLeft())) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view2.setPivotX(right - ((float) view.getLeft()));
                        view2.setPivotY(bottom - ((float) view.getTop()));
                    }
                }
            }
            HashMap<String, c> hashMap3 = nVar.y;
            if (hashMap3 != null) {
                for (j next2 : hashMap3.values()) {
                    if (next2 instanceof c.d) {
                        double[] dArr7 = nVar.p;
                        if (dArr7.length > 1) {
                            d3 = d2;
                            view2.setRotation(((float) ((c.d) next2).a.b(d3, 0)) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                            d2 = d3;
                        }
                    }
                    d3 = d2;
                    d2 = d3;
                }
            }
            double d11 = d2;
            if (dVar3 != null) {
                double[] dArr8 = nVar.p;
                view2.setRotation(dVar3.d(f4, j2, view, dVar) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                z3 = z4 | dVar3.h;
            } else {
                z3 = z4;
            }
            int i12 = 1;
            while (true) {
                b[] bVarArr2 = nVar.i;
                if (i12 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i12].d(d11, nVar.t);
                nVar.e.h2.get(nVar.q[i12 - 1]).h(view2, nVar.t);
                i12++;
            }
            l lVar = nVar.g;
            if (lVar.d == 0) {
                if (f4 <= 0.0f) {
                    view2.setVisibility(lVar.q);
                } else if (f4 >= 1.0f) {
                    view2.setVisibility(nVar.h.q);
                } else if (nVar.h.q != lVar.q) {
                    view2.setVisibility(0);
                }
            }
            if (nVar.A != null) {
                int i13 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i13 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i13].g(f4, view2);
                    i13++;
                }
            }
            f3 = f4;
        } else {
            f3 = f10;
            boolean z5 = z2;
            q qVar2 = nVar.e;
            float f32 = qVar2.Y1;
            q qVar3 = nVar.f;
            float a3 = a.a(qVar3.Y1, f32, f3, f32);
            float f33 = qVar2.Z1;
            float a4 = a.a(qVar3.Z1, f33, f3, f33);
            float f34 = qVar2.a2;
            float f35 = qVar3.a2;
            float a5 = a.a(f35, f34, f3, f34);
            float f36 = qVar2.b2;
            float f37 = qVar3.b2;
            float f38 = a3 + 0.5f;
            int i14 = (int) f38;
            float f39 = a4 + 0.5f;
            int i15 = (int) f39;
            int i16 = (int) (f38 + a5);
            int a6 = (int) (f39 + a.a(f37, f36, f3, f36));
            int i17 = i16 - i14;
            int i18 = a6 - i15;
            if (!(f35 == f34 && f37 == f36)) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
            }
            view2.layout(i14, i15, i16, a6);
            z3 = z5;
        }
        HashMap<String, h0.g.b.a.b> hashMap4 = nVar.z;
        if (hashMap4 != null) {
            for (h0.g.b.a.b next3 : hashMap4.values()) {
                if (next3 instanceof b.d) {
                    double[] dArr9 = nVar.p;
                    view2.setRotation(((b.d) next3).a(f3) + ((float) Math.toDegrees(Math.atan2(dArr9[1], dArr9[0]))));
                } else {
                    next3.d(view2, f3);
                }
            }
        }
        return z3;
    }

    public final void d(q qVar) {
        qVar.f((float) ((int) this.b.getX()), (float) ((int) this.b.getY()), (float) this.b.getWidth(), (float) this.b.getHeight());
    }

    public void e(Rect rect, Rect rect2, int i2, int i3, int i4) {
        if (i2 == 1) {
            int i5 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i4 - ((rect.height() + i5) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i2 == 2) {
            int i6 = rect.left + rect.right;
            rect2.left = i3 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i6 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i2 == 3) {
            int i7 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i7 / 2);
            rect2.top = i4 - ((rect.height() + i7) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i2 == 4) {
            int i8 = rect.left + rect.right;
            rect2.left = i3 - ((rect.width() + (rect.bottom + rect.top)) / 2);
            rect2.top = (i8 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0267, code lost:
        r15 = r18;
        r12 = r19;
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026d, code lost:
        r7 = r27;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0271, code lost:
        r18 = r2;
        r19 = r3;
        r2 = r16;
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02db, code lost:
        r15 = r18;
        r12 = r19;
        r7 = r27;
        r6 = r28;
        r18 = r2;
        r19 = r3;
        r2 = r16;
        r3 = r17;
        r16 = r5;
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x036d, code lost:
        r18 = r2;
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d8, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03da, code lost:
        switch(r16) {
            case 0: goto L_0x043b;
            case 1: goto L_0x0435;
            case 2: goto L_0x042f;
            case 3: goto L_0x0429;
            case 4: goto L_0x0423;
            case 5: goto L_0x041d;
            case 6: goto L_0x0417;
            case 7: goto L_0x0411;
            case 8: goto L_0x040b;
            case 9: goto L_0x0405;
            case 10: goto L_0x03ff;
            case 11: goto L_0x03f9;
            case 12: goto L_0x03f3;
            case 13: goto L_0x03ed;
            case 14: goto L_0x03e7;
            case 15: goto L_0x03e1;
            default: goto L_0x03dd;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03dd, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e1, code lost:
        r16 = new h0.g.b.a.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e7, code lost:
        r16 = new h0.g.b.a.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ed, code lost:
        r16 = new h0.g.b.a.c.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03f3, code lost:
        r16 = new h0.g.b.a.c.C0032c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03f9, code lost:
        r16 = new h0.g.b.a.c.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ff, code lost:
        r16 = new h0.g.b.a.c.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0405, code lost:
        r16 = new h0.g.b.a.c.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x040b, code lost:
        r16 = new h0.g.b.a.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0411, code lost:
        r16 = new h0.g.b.a.c.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0417, code lost:
        r16 = new h0.g.b.a.c.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x041d, code lost:
        r16 = new h0.g.b.a.c.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0423, code lost:
        r16 = new h0.g.b.a.c.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0429, code lost:
        r16 = new h0.g.b.a.c.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x042f, code lost:
        r16 = new h0.g.b.a.c.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0435, code lost:
        r16 = new h0.g.b.a.c.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x043b, code lost:
        r16 = new h0.g.b.a.c.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0440, code lost:
        r17 = r2;
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04e0, code lost:
        r14 = (java.lang.Integer) r4.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05a3, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05a5, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0607, code lost:
        r4 = r1;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0616, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0626, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0627, code lost:
        switch(r4) {
            case 0: goto L_0x0672;
            case 1: goto L_0x066c;
            case 2: goto L_0x0666;
            case 3: goto L_0x0660;
            case 4: goto L_0x065a;
            case 5: goto L_0x0654;
            case 6: goto L_0x064e;
            case 7: goto L_0x0648;
            case 8: goto L_0x0642;
            case 9: goto L_0x063c;
            case 10: goto L_0x0636;
            case 11: goto L_0x0630;
            default: goto L_0x062a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x062a, code lost:
        r16 = r15;
        r14 = r38;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0630, code lost:
        r4 = new h0.g.b.a.d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0636, code lost:
        r4 = new h0.g.b.a.d.C0033d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x063c, code lost:
        r4 = new h0.g.b.a.d.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0642, code lost:
        r4 = new h0.g.b.a.d.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0648, code lost:
        r4 = new h0.g.b.a.d.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x064e, code lost:
        r4 = new h0.g.b.a.d.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0654, code lost:
        r4 = new h0.g.b.a.d.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x065a, code lost:
        r4 = new h0.g.b.a.d.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0660, code lost:
        r4 = new h0.g.b.a.d.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0666, code lost:
        r4 = new h0.g.b.a.d.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x066c, code lost:
        r4 = new h0.g.b.a.d.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0672, code lost:
        r4 = new h0.g.b.a.d.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0677, code lost:
        r16 = r15;
        r4.i = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0757, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x079d, code lost:
        r4 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07bb, code lost:
        r3 = r20;
        r1 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07c2, code lost:
        r3 = r20;
        r1 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07e8, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x07e9, code lost:
        switch(r4) {
            case 0: goto L_0x09be;
            case 1: goto L_0x0998;
            case 2: goto L_0x0972;
            case 3: goto L_0x094b;
            case 4: goto L_0x0924;
            case 5: goto L_0x08fd;
            case 6: goto L_0x08d6;
            case 7: goto L_0x08af;
            case 8: goto L_0x0888;
            case 9: goto L_0x0861;
            case 10: goto L_0x083a;
            case 11: goto L_0x080f;
            default: goto L_0x07ec;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07ec, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
        android.util.Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + r2 + "\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x080f, code lost:
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0817, code lost:
        if (java.lang.Float.isNaN(r4.h) != false) goto L_0x0836;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0819, code lost:
        r16 = r3;
        r28 = r1;
        r22.b(r4.a, r4.h, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0836, code lost:
        r28 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x083a, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0846, code lost:
        if (java.lang.Float.isNaN(r4.m) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0848, code lost:
        r22.b(r4.a, r4.m, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0861, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x086d, code lost:
        if (java.lang.Float.isNaN(r4.i) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x086f, code lost:
        r22.b(r4.a, r4.i, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0888, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0894, code lost:
        if (java.lang.Float.isNaN(r4.j) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0896, code lost:
        r22.b(r4.a, r4.j, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08af, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08bb, code lost:
        if (java.lang.Float.isNaN(r4.o) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08bd, code lost:
        r22.b(r4.a, r4.o, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08d6, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08e2, code lost:
        if (java.lang.Float.isNaN(r4.n) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08e4, code lost:
        r22.b(r4.a, r4.n, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08fd, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0909, code lost:
        if (java.lang.Float.isNaN(r4.s) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x090b, code lost:
        r22.b(r4.a, r4.s, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0924, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0930, code lost:
        if (java.lang.Float.isNaN(r4.r) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0932, code lost:
        r22.b(r4.a, r4.r, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x094b, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0957, code lost:
        if (java.lang.Float.isNaN(r4.q) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0959, code lost:
        r22.b(r4.a, r4.q, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0972, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x097e, code lost:
        if (java.lang.Float.isNaN(r4.p) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0980, code lost:
        r22.b(r4.a, r4.p, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0998, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x09a4, code lost:
        if (java.lang.Float.isNaN(r4.l) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x09a6, code lost:
        r22.b(r4.a, r4.l, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x09be, code lost:
        r28 = r1;
        r16 = r3;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x09ca, code lost:
        if (java.lang.Float.isNaN(r4.k) != false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x09cc, code lost:
        r22.b(r4.a, r4.k, r4.u, r4.t, r4.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0df7, code lost:
        r15 = r16;
        r13 = r17;
        r12 = r18;
        r10 = r20;
        r9 = r21;
        r7 = r22;
        r6 = r23;
        r5 = r24;
        r11 = r27;
        r14 = r28;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0e4b, code lost:
        r15 = r16;
        r13 = r17;
        r12 = r18;
        r10 = r20;
        r9 = r21;
        r7 = r22;
        r6 = r23;
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0e5f, code lost:
        r15 = r16;
        r13 = r17;
        r12 = r18;
        r10 = r20;
        r9 = r21;
        r7 = r22;
        r6 = r23;
        r11 = r27;
        r14 = r28;
        r16 = r5;
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0ec7, code lost:
        r15 = r16;
        r13 = r17;
        r12 = r18;
        r10 = r20;
        r9 = r21;
        r7 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0ed7, code lost:
        r15 = r16;
        r13 = r17;
        r12 = r18;
        r10 = r20;
        r9 = r21;
        r11 = r27;
        r14 = r28;
        r16 = r7;
        r7 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0f1f, code lost:
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0f45, code lost:
        r15 = r16;
        r13 = r17;
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0f4b, code lost:
        r11 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0f99, code lost:
        r15 = r16;
        r14 = r28;
        r16 = r13;
        r13 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0fbd, code lost:
        r14 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x100d, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x100f, code lost:
        switch(r16) {
            case 0: goto L_0x1067;
            case 1: goto L_0x1061;
            case 2: goto L_0x105b;
            case 3: goto L_0x1055;
            case 4: goto L_0x104f;
            case 5: goto L_0x1049;
            case 6: goto L_0x1043;
            case 7: goto L_0x103d;
            case 8: goto L_0x1037;
            case 9: goto L_0x1031;
            case 10: goto L_0x102b;
            case 11: goto L_0x1025;
            case 12: goto L_0x101f;
            case 13: goto L_0x1019;
            default: goto L_0x1012;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x1012, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x1014, code lost:
        r38 = r2;
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x1019, code lost:
        r16 = new h0.g.b.a.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x101f, code lost:
        r16 = new h0.g.b.a.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x1025, code lost:
        r16 = new h0.g.b.a.b.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x102b, code lost:
        r16 = new h0.g.b.a.b.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x1031, code lost:
        r16 = new h0.g.b.a.b.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x1037, code lost:
        r16 = new h0.g.b.a.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x103d, code lost:
        r16 = new h0.g.b.a.b.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x1043, code lost:
        r16 = new h0.g.b.a.b.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x1049, code lost:
        r16 = new h0.g.b.a.b.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x104f, code lost:
        r16 = new h0.g.b.a.b.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x1055, code lost:
        r16 = new h0.g.b.a.b.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x105b, code lost:
        r16 = new h0.g.b.a.b.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x1061, code lost:
        r16 = new h0.g.b.a.b.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x1067, code lost:
        r16 = new h0.g.b.a.b.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x1296, code lost:
        r1 = r39;
        r13 = r16;
        r10 = r17;
        r9 = r29;
        r3 = r30;
        r2 = r31;
        r0 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x12ee, code lost:
        r1 = r39;
        r14 = r0;
        r13 = r16;
        r10 = r17;
        r9 = r29;
        r3 = r30;
        r2 = r31;
        r0 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x134c, code lost:
        r13 = r16;
        r10 = r17;
        r9 = r29;
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x13c8, code lost:
        r14 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x13c9, code lost:
        switch(r14) {
            case 0: goto L_0x142c;
            case 1: goto L_0x1427;
            case 2: goto L_0x1422;
            case 3: goto L_0x141d;
            case 4: goto L_0x1418;
            case 5: goto L_0x1413;
            case 6: goto L_0x140e;
            case 7: goto L_0x1409;
            case 8: goto L_0x1404;
            case 9: goto L_0x13ff;
            case 10: goto L_0x13fa;
            case 11: goto L_0x13f5;
            case 12: goto L_0x13f0;
            case 13: goto L_0x13eb;
            default: goto L_0x13cc;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x13cc, code lost:
        r14 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x13d2, code lost:
        if (r11.startsWith("CUSTOM") != false) goto L_0x1433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x13d4, code lost:
        android.util.Log.v("WARNING! KeyCycle", "  UNKNOWN  " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x13eb, code lost:
        r14 = r27;
        r12 = r14.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x13f0, code lost:
        r14 = r27;
        r12 = r14.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x13f5, code lost:
        r14 = r27;
        r12 = r14.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x13fa, code lost:
        r14 = r27;
        r12 = r14.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x13ff, code lost:
        r14 = r27;
        r12 = r14.p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x1404, code lost:
        r14 = r27;
        r12 = r14.q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x1409, code lost:
        r14 = r27;
        r12 = r14.v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x140e, code lost:
        r14 = r27;
        r12 = r14.u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x1413, code lost:
        r14 = r27;
        r12 = r14.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x1418, code lost:
        r14 = r27;
        r12 = r14.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x141d, code lost:
        r14 = r27;
        r12 = r14.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x1422, code lost:
        r14 = r27;
        r12 = r14.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x1427, code lost:
        r14 = r27;
        r12 = r14.t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x142c, code lost:
        r14 = r27;
        r12 = r14.s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x1430, code lost:
        r20 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x1433, code lost:
        r12 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x143a, code lost:
        if (java.lang.Float.isNaN(r20) == false) goto L_0x143f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x143c, code lost:
        r12 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x143f, code lost:
        r12 = r26;
        r11 = r12.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x1447, code lost:
        if (r11 != null) goto L_0x1463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x1449, code lost:
        r33 = r0;
        r39 = r1;
        r31 = r2;
        r30 = r3;
        r29 = r9;
        r17 = r10;
        r9 = r12;
        r16 = r13;
        r3 = r14;
        r10 = r24;
        r0 = r25;
        r1 = r35;
        r2 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x1463, code lost:
        r15 = r14.a;
        r21 = r0;
        r0 = r14.h;
        r28 = r1;
        r1 = r14.i;
        r27 = r2;
        r2 = r14.n;
        r30 = r3;
        r29 = r4;
        r22 = r5;
        r23 = r6;
        r26 = r7;
        r11.f.add(new h0.g.a.g.a.e.c(r15, r14.j, r14.k, r14.l, r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x1495, code lost:
        if (r2 == -1) goto L_0x1499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x1497, code lost:
        r11.e = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x1499, code lost:
        r11.c = r0;
        r11.d = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(int r36, int r37, long r38) {
        /*
            r35 = this;
            r0 = r35
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r0.B
            r6 = -1
            if (r5 == r6) goto L_0x0024
            h0.g.b.b.q r6 = r0.e
            r6.d2 = r5
        L_0x0024:
            h0.g.b.b.l r5 = r0.g
            h0.g.b.b.l r6 = r0.h
            float r7 = r5.c
            float r8 = r6.c
            boolean r7 = r5.e(r7, r8)
            java.lang.String r8 = "alpha"
            if (r7 == 0) goto L_0x0037
            r2.add(r8)
        L_0x0037:
            float r7 = r5.x
            float r9 = r6.x
            boolean r7 = r5.e(r7, r9)
            java.lang.String r9 = "elevation"
            if (r7 == 0) goto L_0x0046
            r2.add(r9)
        L_0x0046:
            int r7 = r5.q
            int r10 = r6.q
            if (r7 == r10) goto L_0x0057
            int r11 = r5.d
            if (r11 != 0) goto L_0x0057
            if (r7 == 0) goto L_0x0054
            if (r10 != 0) goto L_0x0057
        L_0x0054:
            r2.add(r8)
        L_0x0057:
            float r7 = r5.y
            float r10 = r6.y
            boolean r7 = r5.e(r7, r10)
            java.lang.String r10 = "rotation"
            if (r7 == 0) goto L_0x0066
            r2.add(r10)
        L_0x0066:
            float r7 = r5.h2
            boolean r7 = java.lang.Float.isNaN(r7)
            java.lang.String r11 = "transitionPathRotate"
            if (r7 == 0) goto L_0x0078
            float r7 = r6.h2
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto L_0x007b
        L_0x0078:
            r2.add(r11)
        L_0x007b:
            float r7 = r5.i2
            boolean r7 = java.lang.Float.isNaN(r7)
            java.lang.String r12 = "progress"
            if (r7 == 0) goto L_0x008d
            float r7 = r6.i2
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto L_0x0090
        L_0x008d:
            r2.add(r12)
        L_0x0090:
            float r7 = r5.Y1
            float r13 = r6.Y1
            boolean r7 = r5.e(r7, r13)
            java.lang.String r13 = "rotationX"
            if (r7 == 0) goto L_0x009f
            r2.add(r13)
        L_0x009f:
            float r7 = r5.Z1
            float r14 = r6.Z1
            boolean r7 = r5.e(r7, r14)
            java.lang.String r14 = "rotationY"
            if (r7 == 0) goto L_0x00ae
            r2.add(r14)
        L_0x00ae:
            float r7 = r5.c2
            float r15 = r6.c2
            boolean r7 = r5.e(r7, r15)
            if (r7 == 0) goto L_0x00bd
            java.lang.String r7 = "transformPivotX"
            r2.add(r7)
        L_0x00bd:
            float r7 = r5.d2
            float r15 = r6.d2
            boolean r7 = r5.e(r7, r15)
            if (r7 == 0) goto L_0x00cc
            java.lang.String r7 = "transformPivotY"
            r2.add(r7)
        L_0x00cc:
            float r7 = r5.a2
            float r15 = r6.a2
            boolean r7 = r5.e(r7, r15)
            java.lang.String r15 = "scaleX"
            if (r7 == 0) goto L_0x00db
            r2.add(r15)
        L_0x00db:
            float r7 = r5.b2
            r16 = r13
            float r13 = r6.b2
            boolean r7 = r5.e(r7, r13)
            java.lang.String r13 = "scaleY"
            if (r7 == 0) goto L_0x00ec
            r2.add(r13)
        L_0x00ec:
            float r7 = r5.e2
            r17 = r14
            float r14 = r6.e2
            boolean r7 = r5.e(r7, r14)
            java.lang.String r14 = "translationX"
            if (r7 == 0) goto L_0x00fd
            r2.add(r14)
        L_0x00fd:
            float r7 = r5.f2
            r18 = r14
            float r14 = r6.f2
            boolean r7 = r5.e(r7, r14)
            java.lang.String r14 = "translationY"
            if (r7 == 0) goto L_0x010e
            r2.add(r14)
        L_0x010e:
            float r7 = r5.g2
            float r6 = r6.g2
            boolean r5 = r5.e(r7, r6)
            java.lang.String r6 = "translationZ"
            if (r5 == 0) goto L_0x011d
            r2.add(r6)
        L_0x011d:
            java.util.ArrayList<h0.g.b.b.d> r5 = r0.w
            if (r5 == 0) goto L_0x01ce
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L_0x0126:
            boolean r19 = r5.hasNext()
            if (r19 == 0) goto L_0x01c5
            java.lang.Object r19 = r5.next()
            r20 = r5
            r5 = r19
            h0.g.b.b.d r5 = (h0.g.b.b.d) r5
            r19 = r14
            boolean r14 = r5 instanceof h0.g.b.b.h
            if (r14 == 0) goto L_0x018c
            h0.g.b.b.h r5 = (h0.g.b.b.h) r5
            h0.g.b.b.q r14 = new h0.g.b.b.q
            r27 = r6
            h0.g.b.b.q r6 = r0.e
            r28 = r12
            h0.g.b.b.q r12 = r0.f
            r21 = r14
            r22 = r36
            r23 = r37
            r24 = r5
            r25 = r6
            r26 = r12
            r21.<init>(r22, r23, r24, r25, r26)
            java.util.ArrayList<h0.g.b.b.q> r6 = r0.u
            int r6 = java.util.Collections.binarySearch(r6, r14)
            if (r6 != 0) goto L_0x017b
            java.lang.String r12 = " KeyPath position \""
            java.lang.StringBuilder r12 = i0.d.a.a.a.P0(r12)
            r21 = r15
            float r15 = r14.y
            r12.append(r15)
            java.lang.String r15 = "\" outside of range"
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            java.lang.String r15 = "MotionController"
            android.util.Log.e(r15, r12)
            goto L_0x017d
        L_0x017b:
            r21 = r15
        L_0x017d:
            java.util.ArrayList<h0.g.b.b.q> r12 = r0.u
            int r6 = -r6
            r15 = -1
            int r6 = r6 + r15
            r12.add(r6, r14)
            int r5 = r5.f
            if (r5 == r15) goto L_0x01b9
            r0.d = r5
            goto L_0x01b9
        L_0x018c:
            r27 = r6
            r28 = r12
            r21 = r15
            boolean r6 = r5 instanceof h0.g.b.b.f
            if (r6 == 0) goto L_0x019a
            r5.d(r3)
            goto L_0x01b9
        L_0x019a:
            boolean r6 = r5 instanceof h0.g.b.b.j
            if (r6 == 0) goto L_0x01a2
            r5.d(r1)
            goto L_0x01b9
        L_0x01a2:
            boolean r6 = r5 instanceof h0.g.b.b.k
            if (r6 == 0) goto L_0x01b3
            if (r7 != 0) goto L_0x01ad
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x01ad:
            h0.g.b.b.k r5 = (h0.g.b.b.k) r5
            r7.add(r5)
            goto L_0x01b9
        L_0x01b3:
            r5.f(r4)
            r5.d(r2)
        L_0x01b9:
            r14 = r19
            r5 = r20
            r15 = r21
            r6 = r27
            r12 = r28
            goto L_0x0126
        L_0x01c5:
            r27 = r6
            r28 = r12
            r19 = r14
            r21 = r15
            goto L_0x01d7
        L_0x01ce:
            r27 = r6
            r28 = r12
            r19 = r14
            r21 = r15
            r7 = 0
        L_0x01d7:
            r5 = 0
            if (r7 == 0) goto L_0x01e4
            h0.g.b.b.k[] r5 = new h0.g.b.b.k[r5]
            java.lang.Object[] r5 = r7.toArray(r5)
            h0.g.b.b.k[] r5 = (h0.g.b.b.k[]) r5
            r0.A = r5
        L_0x01e4:
            boolean r5 = r2.isEmpty()
            r12 = 1
            if (r5 != 0) goto L_0x0500
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.y = r5
            java.util.Iterator r5 = r2.iterator()
        L_0x01f6:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0481
            java.lang.Object r14 = r5.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = "CUSTOM,"
            boolean r15 = r14.startsWith(r15)
            if (r15 == 0) goto L_0x025e
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            java.lang.String r6 = ","
            java.lang.String[] r6 = r14.split(r6)
            r6 = r6[r12]
            java.util.ArrayList<h0.g.b.b.d> r12 = r0.w
            java.util.Iterator r12 = r12.iterator()
        L_0x021d:
            boolean r20 = r12.hasNext()
            if (r20 == 0) goto L_0x0242
            java.lang.Object r20 = r12.next()
            r7 = r20
            h0.g.b.b.d r7 = (h0.g.b.b.d) r7
            r20 = r5
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r7.e
            if (r5 != 0) goto L_0x0232
            goto L_0x023f
        L_0x0232:
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r5 = (androidx.constraintlayout.widget.ConstraintAttribute) r5
            if (r5 == 0) goto L_0x023f
            int r7 = r7.a
            r15.append(r7, r5)
        L_0x023f:
            r5 = r20
            goto L_0x021d
        L_0x0242:
            r20 = r5
            h0.g.b.a.c$b r5 = new h0.g.b.a.c$b
            r5.<init>(r14, r15)
            r15 = r18
            r12 = r19
            r7 = r27
            r6 = r28
            r18 = r2
            r19 = r3
            r2 = r5
            r3 = r17
            r5 = r21
            r17 = r16
            goto L_0x0444
        L_0x025e:
            r20 = r5
            int r5 = r14.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x03bc;
                case -1249320805: goto L_0x039e;
                case -1225497657: goto L_0x037d;
                case -1225497656: goto L_0x0359;
                case -1225497655: goto L_0x0339;
                case -1001078227: goto L_0x0314;
                case -908189618: goto L_0x02f1;
                case -908189617: goto L_0x02d3;
                case -797520672: goto L_0x02c7;
                case -760884510: goto L_0x02bb;
                case -760884509: goto L_0x02af;
                case -40300674: goto L_0x02a5;
                case -4379043: goto L_0x029b;
                case 37232917: goto L_0x0291;
                case 92909918: goto L_0x0287;
                case 156108012: goto L_0x027b;
                default: goto L_0x0267;
            }
        L_0x0267:
            r15 = r18
            r12 = r19
            r5 = r21
        L_0x026d:
            r7 = r27
            r6 = r28
        L_0x0271:
            r18 = r2
            r19 = r3
            r2 = r16
            r3 = r17
            goto L_0x03d8
        L_0x027b:
            java.lang.String r5 = "waveOffset"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0284
            goto L_0x0267
        L_0x0284:
            r5 = 15
            goto L_0x02db
        L_0x0287:
            boolean r5 = r14.equals(r8)
            if (r5 != 0) goto L_0x028e
            goto L_0x0267
        L_0x028e:
            r5 = 14
            goto L_0x02db
        L_0x0291:
            boolean r5 = r14.equals(r11)
            if (r5 != 0) goto L_0x0298
            goto L_0x0267
        L_0x0298:
            r5 = 13
            goto L_0x02db
        L_0x029b:
            boolean r5 = r14.equals(r9)
            if (r5 != 0) goto L_0x02a2
            goto L_0x0267
        L_0x02a2:
            r5 = 12
            goto L_0x02db
        L_0x02a5:
            boolean r5 = r14.equals(r10)
            if (r5 != 0) goto L_0x02ac
            goto L_0x0267
        L_0x02ac:
            r5 = 11
            goto L_0x02db
        L_0x02af:
            java.lang.String r5 = "transformPivotY"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x02b8
            goto L_0x0267
        L_0x02b8:
            r5 = 10
            goto L_0x02db
        L_0x02bb:
            java.lang.String r5 = "transformPivotX"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x02c4
            goto L_0x0267
        L_0x02c4:
            r5 = 9
            goto L_0x02db
        L_0x02c7:
            java.lang.String r5 = "waveVariesBy"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x02d0
            goto L_0x0267
        L_0x02d0:
            r5 = 8
            goto L_0x02db
        L_0x02d3:
            boolean r5 = r14.equals(r13)
            if (r5 != 0) goto L_0x02da
            goto L_0x0267
        L_0x02da:
            r5 = 7
        L_0x02db:
            r15 = r18
            r12 = r19
            r7 = r27
            r6 = r28
            r18 = r2
            r19 = r3
            r2 = r16
            r3 = r17
            r16 = r5
            r5 = r21
            goto L_0x03da
        L_0x02f1:
            r5 = r21
            boolean r6 = r14.equals(r5)
            if (r6 != 0) goto L_0x02ff
            r15 = r18
            r12 = r19
            goto L_0x026d
        L_0x02ff:
            r6 = 6
            r15 = r18
            r12 = r19
            r7 = r27
            r18 = r2
            r19 = r3
            r2 = r16
            r3 = r17
            r16 = r6
            r6 = r28
            goto L_0x03da
        L_0x0314:
            r5 = r21
            r6 = r28
            boolean r7 = r14.equals(r6)
            if (r7 != 0) goto L_0x0326
            r15 = r18
            r12 = r19
            r7 = r27
            goto L_0x0271
        L_0x0326:
            r7 = 5
            r15 = r18
            r12 = r19
            r18 = r2
            r19 = r3
            r2 = r16
            r3 = r17
            r16 = r7
            r7 = r27
            goto L_0x03da
        L_0x0339:
            r5 = r21
            r7 = r27
            r6 = r28
            boolean r12 = r14.equals(r7)
            r15 = r18
            if (r12 != 0) goto L_0x034b
            r12 = r19
            goto L_0x0271
        L_0x034b:
            r12 = r19
            r18 = r2
            r19 = r3
            r2 = r16
            r3 = r17
            r16 = 4
            goto L_0x03da
        L_0x0359:
            r12 = r19
            r5 = r21
            r7 = r27
            r6 = r28
            boolean r15 = r14.equals(r12)
            r19 = r3
            r3 = r17
            if (r15 != 0) goto L_0x0373
            r15 = r18
        L_0x036d:
            r18 = r2
            r2 = r16
            goto L_0x03d8
        L_0x0373:
            r15 = r18
            r18 = r2
            r2 = r16
            r16 = 3
            goto L_0x03da
        L_0x037d:
            r15 = r18
            r12 = r19
            r5 = r21
            r7 = r27
            r6 = r28
            boolean r18 = r14.equals(r15)
            if (r18 != 0) goto L_0x038f
            goto L_0x0271
        L_0x038f:
            r18 = 2
            r19 = r3
            r3 = r17
            r34 = r18
            r18 = r2
            r2 = r16
            r16 = r34
            goto L_0x03da
        L_0x039e:
            r15 = r18
            r12 = r19
            r5 = r21
            r7 = r27
            r6 = r28
            r19 = r3
            r3 = r17
            boolean r17 = r14.equals(r3)
            if (r17 != 0) goto L_0x03b3
            goto L_0x036d
        L_0x03b3:
            r17 = 1
            r18 = r2
            r2 = r16
            r16 = r17
            goto L_0x03da
        L_0x03bc:
            r15 = r18
            r12 = r19
            r5 = r21
            r7 = r27
            r6 = r28
            r18 = r2
            r19 = r3
            r2 = r16
            r3 = r17
            boolean r16 = r14.equals(r2)
            if (r16 != 0) goto L_0x03d5
            goto L_0x03d8
        L_0x03d5:
            r16 = 0
            goto L_0x03da
        L_0x03d8:
            r16 = -1
        L_0x03da:
            switch(r16) {
                case 0: goto L_0x043b;
                case 1: goto L_0x0435;
                case 2: goto L_0x042f;
                case 3: goto L_0x0429;
                case 4: goto L_0x0423;
                case 5: goto L_0x041d;
                case 6: goto L_0x0417;
                case 7: goto L_0x0411;
                case 8: goto L_0x040b;
                case 9: goto L_0x0405;
                case 10: goto L_0x03ff;
                case 11: goto L_0x03f9;
                case 12: goto L_0x03f3;
                case 13: goto L_0x03ed;
                case 14: goto L_0x03e7;
                case 15: goto L_0x03e1;
                default: goto L_0x03dd;
            }
        L_0x03dd:
            r16 = 0
            goto L_0x0440
        L_0x03e1:
            h0.g.b.a.c$a r16 = new h0.g.b.a.c$a
            r16.<init>()
            goto L_0x0440
        L_0x03e7:
            h0.g.b.a.c$a r16 = new h0.g.b.a.c$a
            r16.<init>()
            goto L_0x0440
        L_0x03ed:
            h0.g.b.a.c$d r16 = new h0.g.b.a.c$d
            r16.<init>()
            goto L_0x0440
        L_0x03f3:
            h0.g.b.a.c$c r16 = new h0.g.b.a.c$c
            r16.<init>()
            goto L_0x0440
        L_0x03f9:
            h0.g.b.a.c$h r16 = new h0.g.b.a.c$h
            r16.<init>()
            goto L_0x0440
        L_0x03ff:
            h0.g.b.a.c$f r16 = new h0.g.b.a.c$f
            r16.<init>()
            goto L_0x0440
        L_0x0405:
            h0.g.b.a.c$e r16 = new h0.g.b.a.c$e
            r16.<init>()
            goto L_0x0440
        L_0x040b:
            h0.g.b.a.c$a r16 = new h0.g.b.a.c$a
            r16.<init>()
            goto L_0x0440
        L_0x0411:
            h0.g.b.a.c$l r16 = new h0.g.b.a.c$l
            r16.<init>()
            goto L_0x0440
        L_0x0417:
            h0.g.b.a.c$k r16 = new h0.g.b.a.c$k
            r16.<init>()
            goto L_0x0440
        L_0x041d:
            h0.g.b.a.c$g r16 = new h0.g.b.a.c$g
            r16.<init>()
            goto L_0x0440
        L_0x0423:
            h0.g.b.a.c$o r16 = new h0.g.b.a.c$o
            r16.<init>()
            goto L_0x0440
        L_0x0429:
            h0.g.b.a.c$n r16 = new h0.g.b.a.c$n
            r16.<init>()
            goto L_0x0440
        L_0x042f:
            h0.g.b.a.c$m r16 = new h0.g.b.a.c$m
            r16.<init>()
            goto L_0x0440
        L_0x0435:
            h0.g.b.a.c$j r16 = new h0.g.b.a.c$j
            r16.<init>()
            goto L_0x0440
        L_0x043b:
            h0.g.b.a.c$i r16 = new h0.g.b.a.c$i
            r16.<init>()
        L_0x0440:
            r17 = r2
            r2 = r16
        L_0x0444:
            if (r2 != 0) goto L_0x045e
            r2 = 1
            r21 = r5
            r28 = r6
            r27 = r7
            r16 = r17
            r5 = r20
            r17 = r3
            r3 = r19
            r19 = r12
            r12 = r2
            r2 = r18
            r18 = r15
            goto L_0x01f6
        L_0x045e:
            r2.e = r14
            r16 = r3
            java.util.HashMap<java.lang.String, h0.g.b.a.c> r3 = r0.y
            r3.put(r14, r2)
            r2 = 1
            r21 = r5
            r28 = r6
            r27 = r7
            r3 = r19
            r5 = r20
            r19 = r12
            r12 = r2
            r2 = r18
            r18 = r15
            r34 = r17
            r17 = r16
            r16 = r34
            goto L_0x01f6
        L_0x0481:
            r15 = r18
            r12 = r19
            r5 = r21
            r7 = r27
            r6 = r28
            r18 = r2
            r19 = r3
            r34 = r17
            r17 = r16
            r16 = r34
            java.util.ArrayList<h0.g.b.b.d> r2 = r0.w
            if (r2 == 0) goto L_0x04b3
            java.util.Iterator r2 = r2.iterator()
        L_0x049d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b3
            java.lang.Object r3 = r2.next()
            h0.g.b.b.d r3 = (h0.g.b.b.d) r3
            boolean r14 = r3 instanceof h0.g.b.b.e
            if (r14 == 0) goto L_0x049d
            java.util.HashMap<java.lang.String, h0.g.b.a.c> r14 = r0.y
            r3.a(r14)
            goto L_0x049d
        L_0x04b3:
            h0.g.b.b.l r2 = r0.g
            java.util.HashMap<java.lang.String, h0.g.b.a.c> r3 = r0.y
            r14 = 0
            r2.a(r3, r14)
            h0.g.b.b.l r2 = r0.h
            java.util.HashMap<java.lang.String, h0.g.b.a.c> r3 = r0.y
            r14 = 100
            r2.a(r3, r14)
            java.util.HashMap<java.lang.String, h0.g.b.a.c> r2 = r0.y
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x04ce:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0514
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r14 = r4.containsKey(r3)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r14 = r4.get(r3)
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 == 0) goto L_0x04ed
            int r14 = r14.intValue()
            goto L_0x04ee
        L_0x04ed:
            r14 = 0
        L_0x04ee:
            r20 = r2
            java.util.HashMap<java.lang.String, h0.g.b.a.c> r2 = r0.y
            java.lang.Object r2 = r2.get(r3)
            h0.g.a.g.a.j r2 = (h0.g.a.g.a.j) r2
            if (r2 == 0) goto L_0x04fd
            r2.c(r14)
        L_0x04fd:
            r2 = r20
            goto L_0x04ce
        L_0x0500:
            r15 = r18
            r12 = r19
            r5 = r21
            r7 = r27
            r6 = r28
            r18 = r2
            r19 = r3
            r34 = r17
            r17 = r16
            r16 = r34
        L_0x0514:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0a47
            java.util.HashMap<java.lang.String, h0.g.b.a.d> r2 = r0.x
            if (r2 != 0) goto L_0x0525
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.x = r2
        L_0x0525:
            java.util.Iterator r1 = r1.iterator()
        L_0x0529:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0693
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, h0.g.b.a.d> r3 = r0.x
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L_0x053e
            goto L_0x0529
        L_0x053e:
            java.lang.String r3 = "CUSTOM,"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0598
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.lang.String r14 = ","
            java.lang.String[] r14 = r2.split(r14)
            r20 = 1
            r14 = r14[r20]
            r20 = r1
            java.util.ArrayList<h0.g.b.b.d> r1 = r0.w
            java.util.Iterator r1 = r1.iterator()
        L_0x055d:
            boolean r21 = r1.hasNext()
            if (r21 == 0) goto L_0x0586
            java.lang.Object r21 = r1.next()
            r22 = r1
            r1 = r21
            h0.g.b.b.d r1 = (h0.g.b.b.d) r1
            r21 = r4
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r1.e
            if (r4 != 0) goto L_0x0574
            goto L_0x0581
        L_0x0574:
            java.lang.Object r4 = r4.get(r14)
            androidx.constraintlayout.widget.ConstraintAttribute r4 = (androidx.constraintlayout.widget.ConstraintAttribute) r4
            if (r4 == 0) goto L_0x0581
            int r1 = r1.a
            r3.append(r1, r4)
        L_0x0581:
            r4 = r21
            r1 = r22
            goto L_0x055d
        L_0x0586:
            r21 = r4
            h0.g.b.a.d$b r1 = new h0.g.b.a.d$b
            r1.<init>(r2, r3)
            r4 = r1
            r1 = r16
            r3 = r17
            r16 = r15
            r14 = r38
            goto L_0x067d
        L_0x0598:
            r20 = r1
            r21 = r4
            int r1 = r2.hashCode()
            switch(r1) {
                case -1249320806: goto L_0x0619;
                case -1249320805: goto L_0x060b;
                case -1225497657: goto L_0x05ff;
                case -1225497656: goto L_0x05f6;
                case -1225497655: goto L_0x05ed;
                case -1001078227: goto L_0x05e4;
                case -908189618: goto L_0x05db;
                case -908189617: goto L_0x05d2;
                case -40300674: goto L_0x05c8;
                case -4379043: goto L_0x05be;
                case 37232917: goto L_0x05b4;
                case 92909918: goto L_0x05a9;
                default: goto L_0x05a3;
            }
        L_0x05a3:
            r1 = r16
        L_0x05a5:
            r3 = r17
            goto L_0x0626
        L_0x05a9:
            boolean r1 = r2.equals(r8)
            if (r1 != 0) goto L_0x05b0
            goto L_0x05a3
        L_0x05b0:
            r1 = 11
            goto L_0x0607
        L_0x05b4:
            boolean r1 = r2.equals(r11)
            if (r1 != 0) goto L_0x05bb
            goto L_0x05a3
        L_0x05bb:
            r1 = 10
            goto L_0x0607
        L_0x05be:
            boolean r1 = r2.equals(r9)
            if (r1 != 0) goto L_0x05c5
            goto L_0x05a3
        L_0x05c5:
            r1 = 9
            goto L_0x0607
        L_0x05c8:
            boolean r1 = r2.equals(r10)
            if (r1 != 0) goto L_0x05cf
            goto L_0x05a3
        L_0x05cf:
            r1 = 8
            goto L_0x0607
        L_0x05d2:
            boolean r1 = r2.equals(r13)
            if (r1 != 0) goto L_0x05d9
            goto L_0x05a3
        L_0x05d9:
            r1 = 7
            goto L_0x0607
        L_0x05db:
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L_0x05e2
            goto L_0x05a3
        L_0x05e2:
            r1 = 6
            goto L_0x0607
        L_0x05e4:
            boolean r1 = r2.equals(r6)
            if (r1 != 0) goto L_0x05eb
            goto L_0x05a3
        L_0x05eb:
            r1 = 5
            goto L_0x0607
        L_0x05ed:
            boolean r1 = r2.equals(r7)
            if (r1 != 0) goto L_0x05f4
            goto L_0x05a3
        L_0x05f4:
            r1 = 4
            goto L_0x0607
        L_0x05f6:
            boolean r1 = r2.equals(r12)
            if (r1 != 0) goto L_0x05fd
            goto L_0x05a3
        L_0x05fd:
            r1 = 3
            goto L_0x0607
        L_0x05ff:
            boolean r1 = r2.equals(r15)
            if (r1 != 0) goto L_0x0606
            goto L_0x05a3
        L_0x0606:
            r1 = 2
        L_0x0607:
            r4 = r1
            r1 = r16
            goto L_0x0616
        L_0x060b:
            r1 = r16
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L_0x0614
            goto L_0x05a5
        L_0x0614:
            r3 = 1
            r4 = r3
        L_0x0616:
            r3 = r17
            goto L_0x0627
        L_0x0619:
            r1 = r16
            r3 = r17
            boolean r4 = r2.equals(r3)
            if (r4 != 0) goto L_0x0624
            goto L_0x0626
        L_0x0624:
            r4 = 0
            goto L_0x0627
        L_0x0626:
            r4 = -1
        L_0x0627:
            switch(r4) {
                case 0: goto L_0x0672;
                case 1: goto L_0x066c;
                case 2: goto L_0x0666;
                case 3: goto L_0x0660;
                case 4: goto L_0x065a;
                case 5: goto L_0x0654;
                case 6: goto L_0x064e;
                case 7: goto L_0x0648;
                case 8: goto L_0x0642;
                case 9: goto L_0x063c;
                case 10: goto L_0x0636;
                case 11: goto L_0x0630;
                default: goto L_0x062a;
            }
        L_0x062a:
            r16 = r15
            r14 = r38
            r4 = 0
            goto L_0x067d
        L_0x0630:
            h0.g.b.a.d$a r4 = new h0.g.b.a.d$a
            r4.<init>()
            goto L_0x0677
        L_0x0636:
            h0.g.b.a.d$d r4 = new h0.g.b.a.d$d
            r4.<init>()
            goto L_0x0677
        L_0x063c:
            h0.g.b.a.d$c r4 = new h0.g.b.a.d$c
            r4.<init>()
            goto L_0x0677
        L_0x0642:
            h0.g.b.a.d$f r4 = new h0.g.b.a.d$f
            r4.<init>()
            goto L_0x0677
        L_0x0648:
            h0.g.b.a.d$j r4 = new h0.g.b.a.d$j
            r4.<init>()
            goto L_0x0677
        L_0x064e:
            h0.g.b.a.d$i r4 = new h0.g.b.a.d$i
            r4.<init>()
            goto L_0x0677
        L_0x0654:
            h0.g.b.a.d$e r4 = new h0.g.b.a.d$e
            r4.<init>()
            goto L_0x0677
        L_0x065a:
            h0.g.b.a.d$m r4 = new h0.g.b.a.d$m
            r4.<init>()
            goto L_0x0677
        L_0x0660:
            h0.g.b.a.d$l r4 = new h0.g.b.a.d$l
            r4.<init>()
            goto L_0x0677
        L_0x0666:
            h0.g.b.a.d$k r4 = new h0.g.b.a.d$k
            r4.<init>()
            goto L_0x0677
        L_0x066c:
            h0.g.b.a.d$h r4 = new h0.g.b.a.d$h
            r4.<init>()
            goto L_0x0677
        L_0x0672:
            h0.g.b.a.d$g r4 = new h0.g.b.a.d$g
            r4.<init>()
        L_0x0677:
            r16 = r15
            r14 = r38
            r4.i = r14
        L_0x067d:
            if (r4 != 0) goto L_0x0680
            goto L_0x0687
        L_0x0680:
            r4.f = r2
            java.util.HashMap<java.lang.String, h0.g.b.a.d> r14 = r0.x
            r14.put(r2, r4)
        L_0x0687:
            r17 = r3
            r15 = r16
            r4 = r21
            r16 = r1
            r1 = r20
            goto L_0x0529
        L_0x0693:
            r21 = r4
            r1 = r16
            r3 = r17
            r16 = r15
            java.util.ArrayList<h0.g.b.b.d> r2 = r0.w
            if (r2 == 0) goto L_0x0a07
            java.util.Iterator r2 = r2.iterator()
        L_0x06a3:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0a07
            java.lang.Object r4 = r2.next()
            h0.g.b.b.d r4 = (h0.g.b.b.d) r4
            boolean r14 = r4 instanceof h0.g.b.b.j
            if (r14 == 0) goto L_0x09f3
            h0.g.b.b.j r4 = (h0.g.b.b.j) r4
            java.util.HashMap<java.lang.String, h0.g.b.a.d> r14 = r0.x
            java.util.Objects.requireNonNull(r4)
            java.util.Set r15 = r14.keySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x06c2:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x09f3
            java.lang.Object r17 = r15.next()
            r38 = r2
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r17 = r14.get(r2)
            r22 = r17
            h0.g.b.a.d r22 = (h0.g.b.a.d) r22
            if (r22 != 0) goto L_0x06e8
            r28 = r1
            r17 = r14
            r39 = r15
            r0 = r16
        L_0x06e4:
            r16 = r3
            goto L_0x09e3
        L_0x06e8:
            r17 = r14
            java.lang.String r14 = "CUSTOM"
            boolean r14 = r2.startsWith(r14)
            if (r14 == 0) goto L_0x0748
            r14 = 7
            java.lang.String r2 = r2.substring(r14)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r4.e
            java.lang.Object r2 = r14.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            if (r2 == 0) goto L_0x0740
            r14 = r22
            h0.g.b.a.d$b r14 = (h0.g.b.a.d.b) r14
            r39 = r15
            int r15 = r4.a
            float r0 = r4.u
            r20 = r3
            int r3 = r4.t
            r28 = r1
            float r1 = r4.v
            r29 = r4
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r4 = r14.l
            r4.append(r15, r2)
            android.util.SparseArray<float[]> r2 = r14.m
            r4 = 2
            float[] r4 = new float[r4]
            r22 = 0
            r4[r22] = r0
            r0 = 1
            r4[r0] = r1
            r2.append(r15, r4)
            int r0 = r14.b
            int r0 = java.lang.Math.max(r0, r3)
            r14.b = r0
            r0 = r35
            r2 = r38
            r15 = r39
            r14 = r17
            r3 = r20
            r1 = r28
            r4 = r29
            goto L_0x06c2
        L_0x0740:
            r0 = r35
            r2 = r38
            r14 = r17
            goto L_0x06c2
        L_0x0748:
            r28 = r1
            r20 = r3
            r29 = r4
            r39 = r15
            int r0 = r2.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x07d9;
                case -1249320805: goto L_0x07c7;
                case -1225497657: goto L_0x07b3;
                case -1225497656: goto L_0x07aa;
                case -1225497655: goto L_0x07a1;
                case -1001078227: goto L_0x0795;
                case -908189618: goto L_0x078c;
                case -908189617: goto L_0x0783;
                case -40300674: goto L_0x0779;
                case -4379043: goto L_0x076f;
                case 37232917: goto L_0x0765;
                case 92909918: goto L_0x075b;
                default: goto L_0x0757;
            }
        L_0x0757:
            r0 = r16
            goto L_0x07bb
        L_0x075b:
            boolean r0 = r2.equals(r8)
            if (r0 != 0) goto L_0x0762
            goto L_0x0757
        L_0x0762:
            r0 = 11
            goto L_0x079d
        L_0x0765:
            boolean r0 = r2.equals(r11)
            if (r0 != 0) goto L_0x076c
            goto L_0x0757
        L_0x076c:
            r0 = 10
            goto L_0x079d
        L_0x076f:
            boolean r0 = r2.equals(r9)
            if (r0 != 0) goto L_0x0776
            goto L_0x0757
        L_0x0776:
            r0 = 9
            goto L_0x079d
        L_0x0779:
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L_0x0780
            goto L_0x0757
        L_0x0780:
            r0 = 8
            goto L_0x079d
        L_0x0783:
            boolean r0 = r2.equals(r13)
            if (r0 != 0) goto L_0x078a
            goto L_0x0757
        L_0x078a:
            r0 = 7
            goto L_0x079d
        L_0x078c:
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x0793
            goto L_0x0757
        L_0x0793:
            r0 = 6
            goto L_0x079d
        L_0x0795:
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L_0x079c
            goto L_0x0757
        L_0x079c:
            r0 = 5
        L_0x079d:
            r4 = r0
            r0 = r16
            goto L_0x07c2
        L_0x07a1:
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L_0x07a8
            goto L_0x07b0
        L_0x07a8:
            r0 = 4
            goto L_0x079d
        L_0x07aa:
            boolean r0 = r2.equals(r12)
            if (r0 != 0) goto L_0x07b1
        L_0x07b0:
            goto L_0x0757
        L_0x07b1:
            r0 = 3
            goto L_0x079d
        L_0x07b3:
            r0 = r16
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L_0x07c0
        L_0x07bb:
            r3 = r20
            r1 = r28
            goto L_0x07e8
        L_0x07c0:
            r1 = 2
            r4 = r1
        L_0x07c2:
            r3 = r20
            r1 = r28
            goto L_0x07e9
        L_0x07c7:
            r0 = r16
            r1 = r28
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L_0x07d4
            r3 = r20
            goto L_0x07e8
        L_0x07d4:
            r3 = 1
            r4 = r3
            r3 = r20
            goto L_0x07e9
        L_0x07d9:
            r0 = r16
            r3 = r20
            r1 = r28
            boolean r4 = r2.equals(r3)
            if (r4 != 0) goto L_0x07e6
            goto L_0x07e8
        L_0x07e6:
            r4 = 0
            goto L_0x07e9
        L_0x07e8:
            r4 = -1
        L_0x07e9:
            switch(r4) {
                case 0: goto L_0x09be;
                case 1: goto L_0x0998;
                case 2: goto L_0x0972;
                case 3: goto L_0x094b;
                case 4: goto L_0x0924;
                case 5: goto L_0x08fd;
                case 6: goto L_0x08d6;
                case 7: goto L_0x08af;
                case 8: goto L_0x0888;
                case 9: goto L_0x0861;
                case 10: goto L_0x083a;
                case 11: goto L_0x080f;
                default: goto L_0x07ec;
            }
        L_0x07ec:
            r28 = r1
            r16 = r3
            r4 = r29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = "\""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x09e3
        L_0x080f:
            r4 = r29
            float r2 = r4.h
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L_0x0836
            int r2 = r4.a
            float r14 = r4.h
            float r15 = r4.u
            r16 = r3
            int r3 = r4.t
            r28 = r1
            float r1 = r4.v
            r23 = r2
            r24 = r14
            r25 = r15
            r26 = r3
            r27 = r1
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x0836:
            r28 = r1
            goto L_0x06e4
        L_0x083a:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.m
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x0861:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.i
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x0888:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.j
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x08af:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.o
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x08d6:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.n
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x08fd:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.s
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x0924:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.r
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x094b:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.q
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x0972:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.p
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x0998:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.l
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
            goto L_0x09e3
        L_0x09be:
            r28 = r1
            r16 = r3
            r4 = r29
            float r1 = r4.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x09e3
            int r1 = r4.a
            float r2 = r4.k
            float r3 = r4.u
            int r14 = r4.t
            float r15 = r4.v
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r14
            r27 = r15
            r22.b(r23, r24, r25, r26, r27)
        L_0x09e3:
            r2 = r38
            r15 = r39
            r3 = r16
            r14 = r17
            r1 = r28
            r16 = r0
            r0 = r35
            goto L_0x06c2
        L_0x09f3:
            r28 = r1
            r38 = r2
            r0 = r16
            r16 = r3
            r2 = r38
            r3 = r16
            r1 = r28
            r16 = r0
            r0 = r35
            goto L_0x06a3
        L_0x0a07:
            r28 = r1
            r0 = r16
            r16 = r3
            r1 = r35
            java.util.HashMap<java.lang.String, h0.g.b.a.d> r2 = r1.x
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0a19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0a4d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r21
            boolean r14 = r4.containsKey(r3)
            if (r14 == 0) goto L_0x0a38
            java.lang.Object r14 = r4.get(r3)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            goto L_0x0a39
        L_0x0a38:
            r14 = 0
        L_0x0a39:
            java.util.HashMap<java.lang.String, h0.g.b.a.d> r15 = r1.x
            java.lang.Object r3 = r15.get(r3)
            h0.g.b.a.d r3 = (h0.g.b.a.d) r3
            r3.c(r14)
            r21 = r4
            goto L_0x0a19
        L_0x0a47:
            r1 = r0
            r0 = r15
            r28 = r16
            r16 = r17
        L_0x0a4d:
            java.util.ArrayList<h0.g.b.b.q> r2 = r1.u
            int r2 = r2.size()
            int r2 = r2 + 2
            h0.g.b.b.q[] r3 = new h0.g.b.b.q[r2]
            h0.g.b.b.q r4 = r1.e
            r14 = 0
            r3[r14] = r4
            int r4 = r2 + -1
            h0.g.b.b.q r15 = r1.f
            r3[r4] = r15
            java.util.ArrayList<h0.g.b.b.q> r4 = r1.u
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0a71
            int r4 = r1.d
            r15 = -1
            if (r4 != r15) goto L_0x0a71
            r1.d = r14
        L_0x0a71:
            java.util.ArrayList<h0.g.b.b.q> r4 = r1.u
            java.util.Iterator r4 = r4.iterator()
            r14 = 1
        L_0x0a78:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L_0x0a8b
            java.lang.Object r15 = r4.next()
            h0.g.b.b.q r15 = (h0.g.b.b.q) r15
            int r17 = r14 + 1
            r3[r14] = r15
            r14 = r17
            goto L_0x0a78
        L_0x0a8b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            h0.g.b.b.q r14 = r1.f
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.h2
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0a9c:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0ade
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r38 = r14
            h0.g.b.b.q r14 = r1.e
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.h2
            boolean r14 = r14.containsKey(r15)
            if (r14 == 0) goto L_0x0ad3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r17 = r0
            java.lang.String r0 = "CUSTOM,"
            r14.append(r0)
            r14.append(r15)
            java.lang.String r0 = r14.toString()
            r14 = r18
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L_0x0ad7
            r4.add(r15)
            goto L_0x0ad7
        L_0x0ad3:
            r17 = r0
            r14 = r18
        L_0x0ad7:
            r18 = r14
            r0 = r17
            r14 = r38
            goto L_0x0a9c
        L_0x0ade:
            r17 = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.q = r0
            int r0 = r0.length
            int[] r0 = new int[r0]
            r1.r = r0
            r0 = 0
        L_0x0af1:
            java.lang.String[] r4 = r1.q
            int r14 = r4.length
            if (r0 >= r14) goto L_0x0b28
            r4 = r4[r0]
            int[] r14 = r1.r
            r15 = 0
            r14[r0] = r15
            r14 = 0
        L_0x0afe:
            if (r14 >= r2) goto L_0x0b25
            r15 = r3[r14]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r15 = r15.h2
            boolean r15 = r15.containsKey(r4)
            if (r15 == 0) goto L_0x0b22
            r15 = r3[r14]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r15 = r15.h2
            java.lang.Object r15 = r15.get(r4)
            androidx.constraintlayout.widget.ConstraintAttribute r15 = (androidx.constraintlayout.widget.ConstraintAttribute) r15
            if (r15 == 0) goto L_0x0b22
            int[] r4 = r1.r
            r14 = r4[r0]
            int r15 = r15.e()
            int r15 = r15 + r14
            r4[r0] = r15
            goto L_0x0b25
        L_0x0b22:
            int r14 = r14 + 1
            goto L_0x0afe
        L_0x0b25:
            int r0 = r0 + 1
            goto L_0x0af1
        L_0x0b28:
            r0 = 0
            r0 = r3[r0]
            int r0 = r0.d2
            r14 = -1
            if (r0 == r14) goto L_0x0b32
            r0 = 1
            goto L_0x0b33
        L_0x0b32:
            r0 = 0
        L_0x0b33:
            int r4 = r4.length
            int r4 = r4 + 18
            boolean[] r14 = new boolean[r4]
            r15 = 1
        L_0x0b39:
            if (r15 >= r2) goto L_0x0baa
            r18 = r12
            r12 = r3[r15]
            int r20 = r15 + -1
            r27 = r7
            r7 = r3[r20]
            r20 = r6
            float r6 = r12.Y1
            r21 = r5
            float r5 = r7.Y1
            boolean r5 = r12.b(r6, r5)
            float r6 = r12.Z1
            r22 = r13
            float r13 = r7.Z1
            boolean r6 = r12.b(r6, r13)
            r13 = 0
            boolean r13 = r14[r13]
            r23 = r10
            float r10 = r12.y
            r24 = r9
            float r9 = r7.y
            boolean r9 = r12.b(r10, r9)
            r9 = r9 | r13
            r10 = 0
            r14[r10] = r9
            r9 = 1
            boolean r10 = r14[r9]
            r5 = r5 | r6
            r5 = r5 | r0
            r6 = r10 | r5
            r14[r9] = r6
            r6 = 2
            boolean r9 = r14[r6]
            r5 = r5 | r9
            r14[r6] = r5
            r5 = 3
            boolean r6 = r14[r5]
            float r9 = r12.a2
            float r10 = r7.a2
            boolean r9 = r12.b(r9, r10)
            r6 = r6 | r9
            r14[r5] = r6
            r5 = 4
            boolean r6 = r14[r5]
            float r9 = r12.b2
            float r7 = r7.b2
            boolean r7 = r12.b(r9, r7)
            r6 = r6 | r7
            r14[r5] = r6
            int r15 = r15 + 1
            r12 = r18
            r6 = r20
            r5 = r21
            r13 = r22
            r10 = r23
            r9 = r24
            r7 = r27
            goto L_0x0b39
        L_0x0baa:
            r21 = r5
            r20 = r6
            r27 = r7
            r24 = r9
            r23 = r10
            r18 = r12
            r22 = r13
            r0 = 0
            r5 = 1
        L_0x0bba:
            if (r5 >= r4) goto L_0x0bc5
            boolean r6 = r14[r5]
            if (r6 == 0) goto L_0x0bc2
            int r0 = r0 + 1
        L_0x0bc2:
            int r5 = r5 + 1
            goto L_0x0bba
        L_0x0bc5:
            int[] r5 = new int[r0]
            r1.n = r5
            r5 = 2
            int r0 = java.lang.Math.max(r5, r0)
            double[] r5 = new double[r0]
            r1.o = r5
            double[] r0 = new double[r0]
            r1.p = r0
            r0 = 0
            r5 = 1
        L_0x0bd8:
            if (r5 >= r4) goto L_0x0be8
            boolean r6 = r14[r5]
            if (r6 == 0) goto L_0x0be5
            int[] r6 = r1.n
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = r7
        L_0x0be5:
            int r5 = r5 + 1
            goto L_0x0bd8
        L_0x0be8:
            int[] r0 = r1.n
            int r0 = r0.length
            r4 = 2
            int[] r4 = new int[r4]
            r5 = 1
            r4[r5] = r0
            r0 = 0
            r4[r0] = r2
            java.lang.Class<double> r0 = double.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r4)
            double[][] r0 = (double[][]) r0
            double[] r4 = new double[r2]
            r5 = 0
        L_0x0bff:
            if (r5 >= r2) goto L_0x0c4b
            r6 = r3[r5]
            r7 = r0[r5]
            int[] r9 = r1.n
            r10 = 6
            float[] r10 = new float[r10]
            float r12 = r6.y
            r13 = 0
            r10[r13] = r12
            float r12 = r6.Y1
            r13 = 1
            r10[r13] = r12
            float r12 = r6.Z1
            r13 = 2
            r10[r13] = r12
            float r12 = r6.a2
            r13 = 3
            r10[r13] = r12
            float r12 = r6.b2
            r14 = 4
            r10[r14] = r12
            float r6 = r6.c2
            r12 = 5
            r10[r12] = r6
            r6 = 0
            r12 = 0
        L_0x0c2a:
            int r15 = r9.length
            if (r6 >= r15) goto L_0x0c41
            r15 = r9[r6]
            r13 = 6
            if (r15 >= r13) goto L_0x0c3c
            int r13 = r12 + 1
            r15 = r9[r6]
            r15 = r10[r15]
            double r14 = (double) r15
            r7[r12] = r14
            r12 = r13
        L_0x0c3c:
            int r6 = r6 + 1
            r13 = 3
            r14 = 4
            goto L_0x0c2a
        L_0x0c41:
            r6 = r3[r5]
            float r6 = r6.x
            double r6 = (double) r6
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0bff
        L_0x0c4b:
            r5 = 0
        L_0x0c4c:
            int[] r6 = r1.n
            int r7 = r6.length
            if (r5 >= r7) goto L_0x0c83
            r6 = r6[r5]
            java.lang.String[] r7 = h0.g.b.b.q.c
            int r7 = r7.length
            if (r6 >= r7) goto L_0x0c80
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String[] r7 = h0.g.b.b.q.c
            int[] r9 = r1.n
            r9 = r9[r5]
            r7 = r7[r9]
            java.lang.String r9 = " ["
            java.lang.String r6 = i0.d.a.a.a.y0(r6, r7, r9)
            r7 = 0
        L_0x0c6c:
            if (r7 >= r2) goto L_0x0c80
            java.lang.StringBuilder r6 = i0.d.a.a.a.P0(r6)
            r9 = r0[r7]
            r12 = r9[r5]
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            int r7 = r7 + 1
            goto L_0x0c6c
        L_0x0c80:
            int r5 = r5 + 1
            goto L_0x0c4c
        L_0x0c83:
            java.lang.String[] r5 = r1.q
            int r5 = r5.length
            int r5 = r5 + 1
            h0.g.a.g.a.b[] r5 = new h0.g.a.g.a.b[r5]
            r1.i = r5
            r5 = 0
        L_0x0c8d:
            java.lang.String[] r6 = r1.q
            int r7 = r6.length
            if (r5 >= r7) goto L_0x0d55
            r6 = r6[r5]
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
        L_0x0c98:
            if (r7 >= r2) goto L_0x0d3b
            r13 = r3[r7]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.h2
            boolean r13 = r13.containsKey(r6)
            if (r13 == 0) goto L_0x0d2f
            if (r12 != 0) goto L_0x0ccb
            double[] r10 = new double[r2]
            r12 = r3[r7]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r12 = r12.h2
            java.lang.Object r12 = r12.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r12 = (androidx.constraintlayout.widget.ConstraintAttribute) r12
            if (r12 != 0) goto L_0x0cb6
            r12 = 0
            goto L_0x0cba
        L_0x0cb6:
            int r12 = r12.e()
        L_0x0cba:
            r13 = 2
            int[] r13 = new int[r13]
            r14 = 1
            r13[r14] = r12
            r12 = 0
            r13[r12] = r2
            java.lang.Class<double> r12 = double.class
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r12, r13)
            double[][] r12 = (double[][]) r12
        L_0x0ccb:
            r13 = r3[r7]
            float r13 = r13.x
            double r13 = (double) r13
            r10[r9] = r13
            r13 = r3[r7]
            r14 = r12[r9]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.h2
            java.lang.Object r13 = r13.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r13 = (androidx.constraintlayout.widget.ConstraintAttribute) r13
            if (r13 != 0) goto L_0x0ce9
            r38 = r6
            r30 = r10
            r29 = r11
            r39 = r12
            goto L_0x0d28
        L_0x0ce9:
            int r15 = r13.e()
            r38 = r6
            r6 = 1
            if (r15 != r6) goto L_0x0d01
            float r6 = r13.b()
            r39 = r12
            double r12 = (double) r6
            r6 = 0
            r14[r6] = r12
        L_0x0cfc:
            r30 = r10
            r29 = r11
            goto L_0x0d28
        L_0x0d01:
            r39 = r12
            int r6 = r13.e()
            float[] r12 = new float[r6]
            r13.c(r12)
            r13 = 0
            r15 = 0
        L_0x0d0e:
            if (r13 >= r6) goto L_0x0cfc
            int r25 = r15 + 1
            r26 = r6
            r6 = r12[r13]
            r30 = r10
            r29 = r11
            double r10 = (double) r6
            r14[r15] = r10
            int r13 = r13 + 1
            r15 = r25
            r6 = r26
            r11 = r29
            r10 = r30
            goto L_0x0d0e
        L_0x0d28:
            int r9 = r9 + 1
            r12 = r39
            r10 = r30
            goto L_0x0d33
        L_0x0d2f:
            r38 = r6
            r29 = r11
        L_0x0d33:
            int r7 = r7 + 1
            r6 = r38
            r11 = r29
            goto L_0x0c98
        L_0x0d3b:
            r29 = r11
            double[] r6 = java.util.Arrays.copyOf(r10, r9)
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r12, r9)
            double[][] r7 = (double[][]) r7
            h0.g.a.g.a.b[] r9 = r1.i
            int r5 = r5 + 1
            int r10 = r1.d
            h0.g.a.g.a.b r6 = h0.g.a.g.a.b.a(r10, r6, r7)
            r9[r5] = r6
            goto L_0x0c8d
        L_0x0d55:
            r29 = r11
            h0.g.a.g.a.b[] r5 = r1.i
            int r6 = r1.d
            h0.g.a.g.a.b r0 = h0.g.a.g.a.b.a(r6, r4, r0)
            r4 = 0
            r5[r4] = r0
            r0 = r3[r4]
            int r0 = r0.d2
            r5 = -1
            if (r0 == r5) goto L_0x0dab
            int[] r0 = new int[r2]
            double[] r5 = new double[r2]
            r6 = 2
            int[] r7 = new int[r6]
            r9 = 1
            r7[r9] = r6
            r7[r4] = r2
            java.lang.Class<double> r4 = double.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r7)
            double[][] r4 = (double[][]) r4
            r6 = 0
        L_0x0d7e:
            if (r6 >= r2) goto L_0x0da4
            r7 = r3[r6]
            int r7 = r7.d2
            r0[r6] = r7
            r7 = r3[r6]
            float r7 = r7.x
            double r9 = (double) r7
            r5[r6] = r9
            r7 = r4[r6]
            r9 = r3[r6]
            float r9 = r9.Y1
            double r9 = (double) r9
            r11 = 0
            r7[r11] = r9
            r7 = r4[r6]
            r9 = r3[r6]
            float r9 = r9.Z1
            double r9 = (double) r9
            r11 = 1
            r7[r11] = r9
            int r6 = r6 + 1
            goto L_0x0d7e
        L_0x0da4:
            h0.g.a.g.a.a r2 = new h0.g.a.g.a.a
            r2.<init>(r0, r5, r4)
            r1.j = r2
        L_0x0dab:
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.z = r2
            java.util.ArrayList<h0.g.b.b.d> r2 = r1.w
            if (r2 == 0) goto L_0x1510
            java.util.Iterator r2 = r19.iterator()
        L_0x0dbc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x11a2
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "CUSTOM"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x0df0
            h0.g.b.a.b$b r4 = new h0.g.b.a.b$b
            r4.<init>()
            r38 = r2
            r2 = r4
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r11 = r27
            r14 = r28
            r4 = r29
            goto L_0x106d
        L_0x0df0:
            int r4 = r3.hashCode()
            switch(r4) {
                case -1249320806: goto L_0x0fed;
                case -1249320805: goto L_0x0fc8;
                case -1225497657: goto L_0x0fa3;
                case -1225497656: goto L_0x0f7d;
                case -1225497655: goto L_0x0f5e;
                case -1001078227: goto L_0x0f33;
                case -908189618: goto L_0x0f0f;
                case -908189617: goto L_0x0eeb;
                case -797520672: goto L_0x0eb9;
                case -40300674: goto L_0x0ea9;
                case -4379043: goto L_0x0e77;
                case 37232917: goto L_0x0e43;
                case 92909918: goto L_0x0e34;
                case 156108012: goto L_0x0e0f;
                default: goto L_0x0df7;
            }
        L_0x0df7:
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r11 = r27
            r14 = r28
            r4 = r29
            goto L_0x100d
        L_0x0e0f:
            java.lang.String r4 = "waveOffset"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0e18
            goto L_0x0df7
        L_0x0e18:
            r4 = 13
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r11 = r27
            r14 = r28
            r16 = r4
            r4 = r29
            goto L_0x100f
        L_0x0e34:
            boolean r4 = r3.equals(r8)
            if (r4 != 0) goto L_0x0e3d
            r4 = r29
            goto L_0x0e4b
        L_0x0e3d:
            r4 = 12
            r5 = r4
            r4 = r29
            goto L_0x0e5f
        L_0x0e43:
            r4 = r29
            boolean r5 = r3.equals(r4)
            if (r5 != 0) goto L_0x0e5d
        L_0x0e4b:
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            goto L_0x0f4b
        L_0x0e5d:
            r5 = 11
        L_0x0e5f:
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r11 = r27
            r14 = r28
            r16 = r5
            r5 = r24
            goto L_0x100f
        L_0x0e77:
            r5 = r24
            r4 = r29
            boolean r6 = r3.equals(r5)
            if (r6 != 0) goto L_0x0e91
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            goto L_0x0f4b
        L_0x0e91:
            r6 = 10
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r11 = r27
            r14 = r28
            r16 = r6
            r6 = r23
            goto L_0x100f
        L_0x0ea9:
            r6 = r23
            r5 = r24
            r4 = r29
            boolean r7 = r3.equals(r6)
            if (r7 != 0) goto L_0x0eb6
            goto L_0x0ec7
        L_0x0eb6:
            r7 = 9
            goto L_0x0ed7
        L_0x0eb9:
            r6 = r23
            r5 = r24
            r4 = r29
            java.lang.String r7 = "waveVariesBy"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x0ed5
        L_0x0ec7:
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            goto L_0x0f4b
        L_0x0ed5:
            r7 = 8
        L_0x0ed7:
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r11 = r27
            r14 = r28
            r16 = r7
            r7 = r22
            goto L_0x100f
        L_0x0eeb:
            r7 = r22
            r6 = r23
            r5 = r24
            r4 = r29
            boolean r9 = r3.equals(r7)
            if (r9 != 0) goto L_0x0efc
            r9 = r21
            goto L_0x0f1f
        L_0x0efc:
            r9 = 7
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r11 = r27
            r14 = r28
            r16 = r9
            r9 = r21
            goto L_0x100f
        L_0x0f0f:
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r4 = r29
            boolean r10 = r3.equals(r9)
            if (r10 != 0) goto L_0x0f22
        L_0x0f1f:
            r10 = r20
            goto L_0x0f45
        L_0x0f22:
            r10 = 6
            r15 = r16
            r13 = r17
            r12 = r18
            r11 = r27
            r14 = r28
            r16 = r10
            r10 = r20
            goto L_0x100f
        L_0x0f33:
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r4 = r29
            boolean r11 = r3.equals(r10)
            if (r11 != 0) goto L_0x0f4f
        L_0x0f45:
            r15 = r16
            r13 = r17
            r12 = r18
        L_0x0f4b:
            r11 = r27
            goto L_0x0fbd
        L_0x0f4f:
            r11 = 5
            r15 = r16
            r13 = r17
            r12 = r18
            r14 = r28
            r16 = r11
            r11 = r27
            goto L_0x100f
        L_0x0f5e:
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r11 = r27
            r4 = r29
            boolean r12 = r3.equals(r11)
            if (r12 != 0) goto L_0x0f79
            r15 = r16
            r13 = r17
            r12 = r18
            goto L_0x0fbd
        L_0x0f79:
            r12 = r18
            r13 = 4
            goto L_0x0f99
        L_0x0f7d:
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r11 = r27
            r4 = r29
            boolean r13 = r3.equals(r12)
            if (r13 != 0) goto L_0x0f98
            r15 = r16
            r13 = r17
            goto L_0x0fbd
        L_0x0f98:
            r13 = 3
        L_0x0f99:
            r15 = r16
            r14 = r28
            r16 = r13
            r13 = r17
            goto L_0x100f
        L_0x0fa3:
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r11 = r27
            r4 = r29
            boolean r14 = r3.equals(r13)
            if (r14 != 0) goto L_0x0fc0
            r15 = r16
        L_0x0fbd:
            r14 = r28
            goto L_0x100d
        L_0x0fc0:
            r14 = 2
            r15 = r16
            r16 = r14
            r14 = r28
            goto L_0x100f
        L_0x0fc8:
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r11 = r27
            r14 = r28
            r4 = r29
            boolean r15 = r3.equals(r14)
            if (r15 != 0) goto L_0x0fe5
            r15 = r16
            goto L_0x100d
        L_0x0fe5:
            r15 = 1
            r34 = r16
            r16 = r15
            r15 = r34
            goto L_0x100f
        L_0x0fed:
            r15 = r16
            r13 = r17
            r12 = r18
            r10 = r20
            r9 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r11 = r27
            r14 = r28
            r4 = r29
            boolean r16 = r3.equals(r15)
            if (r16 != 0) goto L_0x100a
            goto L_0x100d
        L_0x100a:
            r16 = 0
            goto L_0x100f
        L_0x100d:
            r16 = -1
        L_0x100f:
            switch(r16) {
                case 0: goto L_0x1067;
                case 1: goto L_0x1061;
                case 2: goto L_0x105b;
                case 3: goto L_0x1055;
                case 4: goto L_0x104f;
                case 5: goto L_0x1049;
                case 6: goto L_0x1043;
                case 7: goto L_0x103d;
                case 8: goto L_0x1037;
                case 9: goto L_0x1031;
                case 10: goto L_0x102b;
                case 11: goto L_0x1025;
                case 12: goto L_0x101f;
                case 13: goto L_0x1019;
                default: goto L_0x1012;
            }
        L_0x1012:
            r16 = 0
        L_0x1014:
            r38 = r2
            r2 = r16
            goto L_0x106d
        L_0x1019:
            h0.g.b.a.b$a r16 = new h0.g.b.a.b$a
            r16.<init>()
            goto L_0x1014
        L_0x101f:
            h0.g.b.a.b$a r16 = new h0.g.b.a.b$a
            r16.<init>()
            goto L_0x1014
        L_0x1025:
            h0.g.b.a.b$d r16 = new h0.g.b.a.b$d
            r16.<init>()
            goto L_0x1014
        L_0x102b:
            h0.g.b.a.b$c r16 = new h0.g.b.a.b$c
            r16.<init>()
            goto L_0x1014
        L_0x1031:
            h0.g.b.a.b$f r16 = new h0.g.b.a.b$f
            r16.<init>()
            goto L_0x1014
        L_0x1037:
            h0.g.b.a.b$a r16 = new h0.g.b.a.b$a
            r16.<init>()
            goto L_0x1014
        L_0x103d:
            h0.g.b.a.b$j r16 = new h0.g.b.a.b$j
            r16.<init>()
            goto L_0x1014
        L_0x1043:
            h0.g.b.a.b$i r16 = new h0.g.b.a.b$i
            r16.<init>()
            goto L_0x1014
        L_0x1049:
            h0.g.b.a.b$e r16 = new h0.g.b.a.b$e
            r16.<init>()
            goto L_0x1014
        L_0x104f:
            h0.g.b.a.b$m r16 = new h0.g.b.a.b$m
            r16.<init>()
            goto L_0x1014
        L_0x1055:
            h0.g.b.a.b$l r16 = new h0.g.b.a.b$l
            r16.<init>()
            goto L_0x1014
        L_0x105b:
            h0.g.b.a.b$k r16 = new h0.g.b.a.b$k
            r16.<init>()
            goto L_0x1014
        L_0x1061:
            h0.g.b.a.b$h r16 = new h0.g.b.a.b$h
            r16.<init>()
            goto L_0x1014
        L_0x1067:
            h0.g.b.a.b$g r16 = new h0.g.b.a.b$g
            r16.<init>()
            goto L_0x1014
        L_0x106d:
            if (r2 != 0) goto L_0x1089
            r2 = r38
            r29 = r4
            r24 = r5
            r23 = r6
            r22 = r7
            r21 = r9
            r20 = r10
            r27 = r11
            r18 = r12
            r17 = r13
            r28 = r14
            r16 = r15
            goto L_0x0dbc
        L_0x1089:
            r16 = r15
            int r15 = r2.e
            r17 = r14
            r14 = 1
            if (r15 != r14) goto L_0x1094
            r14 = 1
            goto L_0x1095
        L_0x1094:
            r14 = 0
        L_0x1095:
            if (r14 == 0) goto L_0x1179
            boolean r14 = java.lang.Float.isNaN(r0)
            if (r14 == 0) goto L_0x1179
            r0 = 2
            float[] r0 = new float[r0]
            r14 = 99
            float r14 = (float) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 / r14
            r18 = 0
            r14 = 0
            r20 = 0
            r30 = r12
            r29 = r13
            r25 = r18
            r27 = r25
            r13 = r20
        L_0x10b5:
            r12 = 100
            if (r13 >= r12) goto L_0x1171
            float r12 = (float) r13
            float r12 = r12 * r15
            r39 = r10
            r31 = r11
            double r10 = (double) r12
            r18 = r10
            h0.g.b.b.q r10 = r1.e
            h0.g.a.g.a.c r10 = r10.d
            java.util.ArrayList<h0.g.b.b.q> r11 = r1.u
            java.util.Iterator r11 = r11.iterator()
            r20 = 2143289344(0x7fc00000, float:NaN)
            r21 = 0
        L_0x10d0:
            boolean r22 = r11.hasNext()
            if (r22 == 0) goto L_0x1102
            java.lang.Object r22 = r11.next()
            r23 = r11
            r11 = r22
            h0.g.b.b.q r11 = (h0.g.b.b.q) r11
            r32 = r15
            h0.g.a.g.a.c r15 = r11.d
            if (r15 == 0) goto L_0x10fd
            r22 = r15
            float r15 = r11.x
            int r24 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r24 >= 0) goto L_0x10f3
            r21 = r15
            r10 = r22
            goto L_0x10fd
        L_0x10f3:
            boolean r15 = java.lang.Float.isNaN(r20)
            if (r15 == 0) goto L_0x10fd
            float r11 = r11.x
            r20 = r11
        L_0x10fd:
            r11 = r23
            r15 = r32
            goto L_0x10d0
        L_0x1102:
            r32 = r15
            if (r10 == 0) goto L_0x1120
            boolean r11 = java.lang.Float.isNaN(r20)
            if (r11 == 0) goto L_0x110e
            r20 = 1065353216(0x3f800000, float:1.0)
        L_0x110e:
            float r12 = r12 - r21
            float r20 = r20 - r21
            float r12 = r12 / r20
            double r11 = (double) r12
            double r10 = r10.a(r11)
            float r10 = (float) r10
            float r10 = r10 * r20
            float r10 = r10 + r21
            double r10 = (double) r10
            goto L_0x1122
        L_0x1120:
            r10 = r18
        L_0x1122:
            h0.g.a.g.a.b[] r12 = r1.i
            r15 = 0
            r12 = r12[r15]
            double[] r15 = r1.o
            r12.c(r10, r15)
            h0.g.b.b.q r12 = r1.e
            int[] r15 = r1.n
            r33 = r9
            double[] r9 = r1.o
            r24 = 0
            r18 = r12
            r19 = r10
            r21 = r15
            r22 = r9
            r23 = r0
            r18.e(r19, r21, r22, r23, r24)
            if (r13 <= 0) goto L_0x1159
            double r9 = (double) r14
            r11 = 1
            r11 = r0[r11]
            double r11 = (double) r11
            double r11 = r25 - r11
            r14 = 0
            r14 = r0[r14]
            double r14 = (double) r14
            double r14 = r27 - r14
            double r11 = java.lang.Math.hypot(r11, r14)
            double r11 = r11 + r9
            float r9 = (float) r11
            r14 = r9
        L_0x1159:
            r9 = 0
            r9 = r0[r9]
            double r9 = (double) r9
            r11 = 1
            r11 = r0[r11]
            double r11 = (double) r11
            int r13 = r13 + 1
            r27 = r9
            r25 = r11
            r11 = r31
            r15 = r32
            r9 = r33
            r10 = r39
            goto L_0x10b5
        L_0x1171:
            r33 = r9
            r39 = r10
            r31 = r11
            r0 = r14
            goto L_0x1183
        L_0x1179:
            r33 = r9
            r39 = r10
            r31 = r11
            r30 = r12
            r29 = r13
        L_0x1183:
            r2.b = r3
            java.util.HashMap<java.lang.String, h0.g.b.a.b> r9 = r1.z
            r9.put(r3, r2)
            r2 = r38
            r20 = r39
            r24 = r5
            r23 = r6
            r22 = r7
            r28 = r17
            r17 = r29
            r18 = r30
            r27 = r31
            r21 = r33
            r29 = r4
            goto L_0x0dbc
        L_0x11a2:
            r30 = r18
            r39 = r20
            r33 = r21
            r7 = r22
            r6 = r23
            r5 = r24
            r31 = r27
            r4 = r29
            r29 = r17
            r17 = r28
            java.util.ArrayList<h0.g.b.b.d> r2 = r1.w
            java.util.Iterator r2 = r2.iterator()
        L_0x11bc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x14f1
            java.lang.Object r3 = r2.next()
            h0.g.b.b.d r3 = (h0.g.b.b.d) r3
            boolean r9 = r3 instanceof h0.g.b.b.f
            if (r9 == 0) goto L_0x14bd
            h0.g.b.b.f r3 = (h0.g.b.b.f) r3
            java.util.HashMap<java.lang.String, h0.g.b.a.b> r9 = r1.z
            java.util.Objects.requireNonNull(r3)
            java.util.Set r10 = r9.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x11db:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x14bd
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "CUSTOM"
            boolean r13 = r11.startsWith(r12)
            if (r13 == 0) goto L_0x1285
            r12 = 7
            java.lang.String r12 = r11.substring(r12)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r3.e
            java.lang.Object r12 = r13.get(r12)
            androidx.constraintlayout.widget.ConstraintAttribute r12 = (androidx.constraintlayout.widget.ConstraintAttribute) r12
            if (r12 == 0) goto L_0x1281
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r13 = r12.c
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r14 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            if (r13 == r14) goto L_0x1222
        L_0x1204:
            r28 = r39
            r25 = r0
            r38 = r2
            r14 = r3
            r22 = r5
            r23 = r6
            r26 = r7
            r12 = r9
            r24 = r10
            r13 = r16
            r10 = r17
            r9 = r29
            r27 = r31
            r21 = r33
            r29 = r4
            goto L_0x149d
        L_0x1222:
            java.lang.Object r11 = r9.get(r11)
            h0.g.b.a.b r11 = (h0.g.b.a.b) r11
            if (r11 != 0) goto L_0x122b
            goto L_0x1204
        L_0x122b:
            int r13 = r3.a
            int r14 = r3.h
            java.lang.String r15 = r3.i
            r38 = r2
            int r2 = r3.n
            r24 = r10
            float r10 = r3.j
            r25 = r0
            float r0 = r3.k
            float r1 = r3.l
            float r23 = r12.b()
            r26 = r9
            java.util.ArrayList<h0.g.a.g.a.e$c> r9 = r11.f
            r27 = r3
            h0.g.a.g.a.e$c r3 = new h0.g.a.g.a.e$c
            r18 = r3
            r19 = r13
            r20 = r10
            r21 = r0
            r22 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            r9.add(r3)
            r0 = -1
            if (r2 == r0) goto L_0x1260
            r11.e = r2
        L_0x1260:
            r11.c = r14
            r11.b(r12)
            r11.d = r15
            r28 = r39
            r22 = r5
            r23 = r6
            r13 = r16
            r10 = r17
            r12 = r26
            r14 = r27
            r9 = r29
            r27 = r31
            r21 = r33
            r29 = r4
            r26 = r7
            goto L_0x149d
        L_0x1281:
            r1 = r35
            goto L_0x11db
        L_0x1285:
            r25 = r0
            r38 = r2
            r27 = r3
            r26 = r9
            r24 = r10
            int r0 = r11.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x13b1;
                case -1249320805: goto L_0x1397;
                case -1225497657: goto L_0x137b;
                case -1225497656: goto L_0x1361;
                case -1225497655: goto L_0x1340;
                case -1001078227: goto L_0x1325;
                case -908189618: goto L_0x12ff;
                case -908189617: goto L_0x12e6;
                case -40300674: goto L_0x12dc;
                case -4379043: goto L_0x12d2;
                case 37232917: goto L_0x12c8;
                case 92909918: goto L_0x12be;
                case 156108012: goto L_0x12b2;
                case 1530034690: goto L_0x12a6;
                default: goto L_0x1296;
            }
        L_0x1296:
            r1 = r39
            r13 = r16
            r10 = r17
            r9 = r29
            r3 = r30
            r2 = r31
            r0 = r33
            goto L_0x13c8
        L_0x12a6:
            java.lang.String r0 = "wavePhase"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x12af
            goto L_0x1296
        L_0x12af:
            r0 = 13
            goto L_0x12ee
        L_0x12b2:
            java.lang.String r0 = "waveOffset"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x12bb
            goto L_0x1296
        L_0x12bb:
            r0 = 12
            goto L_0x12ee
        L_0x12be:
            boolean r0 = r11.equals(r8)
            if (r0 != 0) goto L_0x12c5
            goto L_0x1296
        L_0x12c5:
            r0 = 11
            goto L_0x12ee
        L_0x12c8:
            boolean r0 = r11.equals(r4)
            if (r0 != 0) goto L_0x12cf
            goto L_0x1296
        L_0x12cf:
            r0 = 10
            goto L_0x12ee
        L_0x12d2:
            boolean r0 = r11.equals(r5)
            if (r0 != 0) goto L_0x12d9
            goto L_0x1296
        L_0x12d9:
            r0 = 9
            goto L_0x12ee
        L_0x12dc:
            boolean r0 = r11.equals(r6)
            if (r0 != 0) goto L_0x12e3
            goto L_0x1296
        L_0x12e3:
            r0 = 8
            goto L_0x12ee
        L_0x12e6:
            boolean r0 = r11.equals(r7)
            if (r0 != 0) goto L_0x12ed
            goto L_0x1296
        L_0x12ed:
            r0 = 7
        L_0x12ee:
            r1 = r39
            r14 = r0
            r13 = r16
            r10 = r17
            r9 = r29
            r3 = r30
            r2 = r31
            r0 = r33
            goto L_0x13c9
        L_0x12ff:
            r0 = r33
            boolean r1 = r11.equals(r0)
            if (r1 != 0) goto L_0x1315
            r1 = r39
            r13 = r16
            r10 = r17
            r9 = r29
            r3 = r30
            r2 = r31
            goto L_0x13c8
        L_0x1315:
            r1 = 6
            r14 = r1
            r13 = r16
            r10 = r17
            r9 = r29
            r3 = r30
            r2 = r31
            r1 = r39
            goto L_0x13c9
        L_0x1325:
            r1 = r39
            r0 = r33
            boolean r2 = r11.equals(r1)
            if (r2 != 0) goto L_0x1332
            r2 = r31
            goto L_0x134c
        L_0x1332:
            r2 = 5
            r14 = r2
            r13 = r16
            r10 = r17
            r9 = r29
            r3 = r30
            r2 = r31
            goto L_0x13c9
        L_0x1340:
            r1 = r39
            r2 = r31
            r0 = r33
            boolean r3 = r11.equals(r2)
            if (r3 != 0) goto L_0x1356
        L_0x134c:
            r13 = r16
            r10 = r17
            r9 = r29
            r3 = r30
            goto L_0x13c8
        L_0x1356:
            r13 = r16
            r10 = r17
            r9 = r29
            r3 = r30
            r14 = 4
            goto L_0x13c9
        L_0x1361:
            r1 = r39
            r3 = r30
            r2 = r31
            r0 = r33
            boolean r9 = r11.equals(r3)
            r13 = r16
            r10 = r17
            if (r9 != 0) goto L_0x1377
            r9 = r29
            goto L_0x13c8
        L_0x1377:
            r9 = r29
            r14 = 3
            goto L_0x13c9
        L_0x137b:
            r1 = r39
            r9 = r29
            r3 = r30
            r2 = r31
            r0 = r33
            boolean r10 = r11.equals(r9)
            if (r10 != 0) goto L_0x1390
            r13 = r16
            r10 = r17
            goto L_0x13c8
        L_0x1390:
            r10 = 2
            r14 = r10
            r13 = r16
            r10 = r17
            goto L_0x13c9
        L_0x1397:
            r1 = r39
            r10 = r17
            r9 = r29
            r3 = r30
            r2 = r31
            r0 = r33
            boolean r13 = r11.equals(r10)
            if (r13 != 0) goto L_0x13ac
            r13 = r16
            goto L_0x13c8
        L_0x13ac:
            r13 = 1
            r14 = r13
            r13 = r16
            goto L_0x13c9
        L_0x13b1:
            r1 = r39
            r13 = r16
            r10 = r17
            r9 = r29
            r3 = r30
            r2 = r31
            r0 = r33
            boolean r14 = r11.equals(r13)
            if (r14 != 0) goto L_0x13c6
            goto L_0x13c8
        L_0x13c6:
            r14 = 0
            goto L_0x13c9
        L_0x13c8:
            r14 = -1
        L_0x13c9:
            switch(r14) {
                case 0: goto L_0x142c;
                case 1: goto L_0x1427;
                case 2: goto L_0x1422;
                case 3: goto L_0x141d;
                case 4: goto L_0x1418;
                case 5: goto L_0x1413;
                case 6: goto L_0x140e;
                case 7: goto L_0x1409;
                case 8: goto L_0x1404;
                case 9: goto L_0x13ff;
                case 10: goto L_0x13fa;
                case 11: goto L_0x13f5;
                case 12: goto L_0x13f0;
                case 13: goto L_0x13eb;
                default: goto L_0x13cc;
            }
        L_0x13cc:
            r14 = r27
            boolean r12 = r11.startsWith(r12)
            if (r12 != 0) goto L_0x1433
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "  UNKNOWN  "
            r12.append(r15)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            java.lang.String r15 = "WARNING! KeyCycle"
            android.util.Log.v(r15, r12)
            goto L_0x1433
        L_0x13eb:
            r14 = r27
            float r12 = r14.l
            goto L_0x1430
        L_0x13f0:
            r14 = r27
            float r12 = r14.k
            goto L_0x1430
        L_0x13f5:
            r14 = r27
            float r12 = r14.o
            goto L_0x1430
        L_0x13fa:
            r14 = r27
            float r12 = r14.r
            goto L_0x1430
        L_0x13ff:
            r14 = r27
            float r12 = r14.p
            goto L_0x1430
        L_0x1404:
            r14 = r27
            float r12 = r14.q
            goto L_0x1430
        L_0x1409:
            r14 = r27
            float r12 = r14.v
            goto L_0x1430
        L_0x140e:
            r14 = r27
            float r12 = r14.u
            goto L_0x1430
        L_0x1413:
            r14 = r27
            float r12 = r14.m
            goto L_0x1430
        L_0x1418:
            r14 = r27
            float r12 = r14.y
            goto L_0x1430
        L_0x141d:
            r14 = r27
            float r12 = r14.x
            goto L_0x1430
        L_0x1422:
            r14 = r27
            float r12 = r14.w
            goto L_0x1430
        L_0x1427:
            r14 = r27
            float r12 = r14.t
            goto L_0x1430
        L_0x142c:
            r14 = r27
            float r12 = r14.s
        L_0x1430:
            r20 = r12
            goto L_0x1436
        L_0x1433:
            r12 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x1430
        L_0x1436:
            boolean r12 = java.lang.Float.isNaN(r20)
            if (r12 == 0) goto L_0x143f
            r12 = r26
            goto L_0x1449
        L_0x143f:
            r12 = r26
            java.lang.Object r11 = r12.get(r11)
            h0.g.b.a.b r11 = (h0.g.b.a.b) r11
            if (r11 != 0) goto L_0x1463
        L_0x1449:
            r33 = r0
            r39 = r1
            r31 = r2
            r30 = r3
            r29 = r9
            r17 = r10
            r9 = r12
            r16 = r13
            r3 = r14
            r10 = r24
            r0 = r25
            r1 = r35
            r2 = r38
            goto L_0x11db
        L_0x1463:
            int r15 = r14.a
            r21 = r0
            int r0 = r14.h
            r28 = r1
            java.lang.String r1 = r14.i
            r27 = r2
            int r2 = r14.n
            r30 = r3
            float r3 = r14.j
            r29 = r4
            float r4 = r14.k
            r22 = r5
            float r5 = r14.l
            r23 = r6
            java.util.ArrayList<h0.g.a.g.a.e$c> r6 = r11.f
            r26 = r7
            h0.g.a.g.a.e$c r7 = new h0.g.a.g.a.e$c
            r16 = r15
            r15 = r7
            r17 = r3
            r18 = r4
            r19 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            r6.add(r7)
            r3 = -1
            if (r2 == r3) goto L_0x1499
            r11.e = r2
        L_0x1499:
            r11.c = r0
            r11.d = r1
        L_0x149d:
            r1 = r35
            r2 = r38
            r17 = r10
            r16 = r13
            r3 = r14
            r33 = r21
            r5 = r22
            r6 = r23
            r10 = r24
            r0 = r25
            r7 = r26
            r31 = r27
            r39 = r28
            r4 = r29
            r29 = r9
            r9 = r12
            goto L_0x11db
        L_0x14bd:
            r28 = r39
            r25 = r0
            r38 = r2
            r22 = r5
            r23 = r6
            r26 = r7
            r13 = r16
            r10 = r17
            r9 = r29
            r27 = r31
            r21 = r33
            r29 = r4
            r1 = r35
            r2 = r38
            r17 = r10
            r16 = r13
            r33 = r21
            r5 = r22
            r6 = r23
            r0 = r25
            r7 = r26
            r31 = r27
            r39 = r28
            r4 = r29
            r29 = r9
            goto L_0x11bc
        L_0x14f1:
            r25 = r0
            r0 = r1
            java.util.HashMap<java.lang.String, h0.g.b.a.b> r1 = r0.z
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x14fe:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x1511
            java.lang.Object r2 = r1.next()
            h0.g.b.a.b r2 = (h0.g.b.a.b) r2
            r3 = r25
            r2.c(r3)
            goto L_0x14fe
        L_0x1510:
            r0 = r1
        L_0x1511:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.b.b.n.f(int, int, long):void");
    }

    public String toString() {
        StringBuilder P0 = a.P0(" start: x: ");
        P0.append(this.e.Y1);
        P0.append(" y: ");
        P0.append(this.e.Z1);
        P0.append(" end: x: ");
        P0.append(this.f.Y1);
        P0.append(" y: ");
        P0.append(this.f.Z1);
        return P0.toString();
    }
}
