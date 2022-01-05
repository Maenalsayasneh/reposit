package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import h0.g.a.h.j;
import h0.g.b.b.m;
import h0.g.b.b.n;
import h0.g.b.b.o;
import h0.g.b.b.p;
import h0.g.b.b.q;
import h0.g.b.b.r;
import h0.g.b.b.s;
import h0.g.b.b.t;
import h0.g.b.b.u;
import h0.g.b.b.x;
import h0.g.b.b.y;
import h0.g.c.b;
import h0.g.c.c;
import h0.g.c.d;
import h0.g.c.h;
import h0.i.i.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements k {
    public static boolean n2;
    public float A2;
    public Matrix A3;
    public float B2;
    public ArrayList<Integer> B3;
    public float C2;
    public long D2;
    public float E2;
    public boolean F2;
    public boolean G2;
    public i H2;
    public float I2;
    public float J2;
    public int K2;
    public d L2;
    public boolean M2;
    public h0.g.b.a.a N2;
    public c O2;
    public h0.g.b.b.b P2;
    public int Q2;
    public int R2;
    public boolean S2;
    public float T2;
    public float U2;
    public long V2;
    public float W2;
    public boolean X2;
    public ArrayList<o> Y2;
    public ArrayList<o> Z2;
    public CopyOnWriteArrayList<i> a3;
    public int b3;
    public long c3;
    public float d3;
    public int e3;
    public float f3;
    public boolean g3;
    public int h3;
    public int i3;
    public int j3;
    public int k3;
    public int l3;
    public int m3;
    public float n3;
    public r o2;
    public h0.g.a.g.a.d o3;
    public Interpolator p2;
    public boolean p3;
    public Interpolator q2 = null;
    public h q3;
    public float r2 = 0.0f;
    public Runnable r3;
    public int s2 = -1;
    public HashMap<View, ?> s3;
    public int t2 = -1;
    public Rect t3;
    public int u2 = -1;
    public boolean u3;
    public int v2;
    public TransitionState v3;
    public int w2;
    public e w3;
    public boolean x2;
    public boolean x3;
    public HashMap<View, n> y2;
    public RectF y3;
    public long z2;
    public View z3;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public class a implements Runnable {
        public final /* synthetic */ View c;

        public a(MotionLayout motionLayout, View view) {
            this.c = view;
        }

        public void run() {
            this.c.setNestedScrollingEnabled(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            MotionLayout.this.q3.a();
        }
    }

    public class c extends p {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c;

        public c() {
        }

        public float a() {
            return MotionLayout.this.r2;
        }

        public float getInterpolation(float f) {
            float f2 = this.a;
            if (f2 > 0.0f) {
                float f3 = this.c;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                MotionLayout.this.r2 = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.b;
            }
            float f4 = this.c;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            MotionLayout.this.r2 = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.b;
        }
    }

    public class d {
        public float[] a;
        public int[] b;
        public float[] c;
        public Path d;
        public Paint e;
        public Paint f;
        public Paint g;
        public Paint h;
        public Paint i;
        public float[] j;
        public DashPathEffect k;
        public int l;
        public Rect m = new Rect();
        public int n = 1;

        public d() {
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            this.e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.g = paint3;
            paint3.setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.h = paint4;
            paint4.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.k = dashPathEffect;
            this.g.setPathEffect(dashPathEffect);
            this.c = new float[100];
            this.b = new int[50];
        }

        public void a(Canvas canvas, int i2, int i3, n nVar) {
            int i4;
            int i5;
            int i6;
            float f2;
            float f3;
            Canvas canvas2 = canvas;
            int i7 = i2;
            n nVar2 = nVar;
            if (i7 == 4) {
                boolean z = false;
                boolean z2 = false;
                for (int i8 = 0; i8 < this.l; i8++) {
                    int[] iArr = this.b;
                    if (iArr[i8] == 1) {
                        z = true;
                    }
                    if (iArr[i8] == 0) {
                        z2 = true;
                    }
                }
                if (z) {
                    d(canvas);
                }
                if (z2) {
                    b(canvas);
                }
            }
            if (i7 == 2) {
                d(canvas);
            }
            if (i7 == 3) {
                b(canvas);
            }
            canvas2.drawLines(this.a, this.e);
            View view = nVar2.b;
            if (view != null) {
                i5 = view.getWidth();
                i4 = nVar2.b.getHeight();
            } else {
                i5 = 0;
                i4 = 0;
            }
            int i9 = 1;
            while (i9 < i3 - 1) {
                if (i7 == 4 && this.b[i9 - 1] == 0) {
                    i6 = i9;
                } else {
                    float[] fArr = this.c;
                    int i10 = i9 * 2;
                    float f4 = fArr[i10];
                    float f5 = fArr[i10 + 1];
                    this.d.reset();
                    this.d.moveTo(f4, f5 + 10.0f);
                    this.d.lineTo(f4 + 10.0f, f5);
                    this.d.lineTo(f4, f5 - 10.0f);
                    this.d.lineTo(f4 - 10.0f, f5);
                    this.d.close();
                    int i11 = i9 - 1;
                    q qVar = nVar2.u.get(i11);
                    if (i7 == 4) {
                        int[] iArr2 = this.b;
                        if (iArr2[i11] == 1) {
                            e(canvas2, f4 - 0.0f, f5 - 0.0f);
                        } else if (iArr2[i11] == 0) {
                            c(canvas2, f4 - 0.0f, f5 - 0.0f);
                        } else if (iArr2[i11] == 2) {
                            f2 = f5;
                            f3 = f4;
                            i6 = i9;
                            f(canvas, f4 - 0.0f, f5 - 0.0f, i5, i4);
                            canvas2.drawPath(this.d, this.i);
                        }
                        f2 = f5;
                        f3 = f4;
                        i6 = i9;
                        canvas2.drawPath(this.d, this.i);
                    } else {
                        f2 = f5;
                        f3 = f4;
                        i6 = i9;
                    }
                    if (i7 == 2) {
                        e(canvas2, f3 - 0.0f, f2 - 0.0f);
                    }
                    if (i7 == 3) {
                        c(canvas2, f3 - 0.0f, f2 - 0.0f);
                    }
                    if (i7 == 6) {
                        f(canvas, f3 - 0.0f, f2 - 0.0f, i5, i4);
                    }
                    canvas2.drawPath(this.d, this.i);
                }
                i9 = i6 + 1;
            }
            float[] fArr2 = this.a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f);
                float[] fArr3 = this.a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.a;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f2, f4), Math.max(f3, f5), Math.max(f2, f4), Math.max(f3, f5), this.g);
            canvas.drawLine(Math.min(f2, f4), Math.min(f3, f5), Math.min(f2, f4), Math.max(f3, f5), this.g);
        }

        public final void c(Canvas canvas, float f2, float f3) {
            Canvas canvas2 = canvas;
            float[] fArr = this.a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float min = Math.min(f4, f6);
            float max = Math.max(f5, f7);
            float min2 = f2 - Math.min(f4, f6);
            float max2 = Math.max(f5, f7) - f3;
            StringBuilder P0 = i0.d.a.a.a.P0("");
            P0.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            String sb = P0.toString();
            g(sb, this.h);
            canvas2.drawText(sb, ((min2 / 2.0f) - ((float) (this.m.width() / 2))) + min, f3 - 20.0f, this.h);
            canvas.drawLine(f2, f3, Math.min(f4, f6), f3, this.g);
            StringBuilder P02 = i0.d.a.a.a.P0("");
            P02.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f7 - f5))) + 0.5d))) / 100.0f);
            String sb2 = P02.toString();
            g(sb2, this.h);
            canvas2.drawText(sb2, f2 + 5.0f, max - ((max2 / 2.0f) - ((float) (this.m.height() / 2))), this.h);
            canvas.drawLine(f2, f3, f2, Math.max(f5, f7), this.g);
        }

        public final void d(Canvas canvas) {
            float[] fArr = this.a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
        }

        public final void e(Canvas canvas, float f2, float f3) {
            float f4 = f2;
            float f5 = f3;
            float[] fArr = this.a;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f6 - f8), (double) (f7 - f9));
            float f10 = f8 - f6;
            float f11 = f9 - f7;
            float f12 = (((f5 - f7) * f11) + ((f4 - f6) * f10)) / (hypot * hypot);
            float f13 = f6 + (f10 * f12);
            float f14 = f7 + (f12 * f11);
            Path path = new Path();
            path.moveTo(f2, f5);
            path.lineTo(f13, f14);
            float hypot2 = (float) Math.hypot((double) (f13 - f4), (double) (f14 - f5));
            StringBuilder P0 = i0.d.a.a.a.P0("");
            P0.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb = P0.toString();
            g(sb, this.h);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - ((float) (this.m.width() / 2)), -20.0f, this.h);
            canvas.drawLine(f4, f5, f13, f14, this.g);
        }

        public final void f(Canvas canvas, float f2, float f3, int i2, int i3) {
            Canvas canvas2 = canvas;
            StringBuilder P0 = i0.d.a.a.a.P0("");
            P0.append(((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i2)))) + 0.5d))) / 100.0f);
            String sb = P0.toString();
            g(sb, this.h);
            canvas2.drawText(sb, ((f2 / 2.0f) - ((float) (this.m.width() / 2))) + 0.0f, f3 - 20.0f, this.h);
            canvas.drawLine(f2, f3, Math.min(0.0f, 1.0f), f3, this.g);
            StringBuilder P02 = i0.d.a.a.a.P0("");
            P02.append(((float) ((int) (((double) (((f3 - ((float) (i3 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i3)))) + 0.5d))) / 100.0f);
            String sb2 = P02.toString();
            g(sb2, this.h);
            canvas2.drawText(sb2, f2 + 5.0f, 0.0f - ((f3 / 2.0f) - ((float) (this.m.height() / 2))), this.h);
            canvas.drawLine(f2, f3, f2, Math.max(0.0f, 1.0f), this.g);
        }

        public void g(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.m);
        }
    }

    public class e {
        public h0.g.a.h.c a = new h0.g.a.h.c();
        public h0.g.a.h.c b = new h0.g.a.h.c();
        public h0.g.c.c c = null;
        public h0.g.c.c d = null;
        public int e;
        public int f;

        public e() {
        }

        public void a() {
            int[] iArr;
            SparseArray sparseArray;
            int i;
            String str;
            String str2;
            String str3;
            int i2;
            h0.g.c.c cVar;
            Rect rect;
            Interpolator interpolator;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.y2.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = MotionLayout.this.getChildAt(i3);
                n nVar = new n(childAt);
                int id = childAt.getId();
                iArr2[i3] = id;
                sparseArray2.put(id, nVar);
                MotionLayout.this.y2.put(childAt, nVar);
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt2 = MotionLayout.this.getChildAt(i4);
                n nVar2 = MotionLayout.this.y2.get(childAt2);
                if (nVar2 == null) {
                    i = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                } else {
                    if (this.c != null) {
                        ConstraintWidget c2 = c(this.a, childAt2);
                        if (c2 != null) {
                            Rect t = MotionLayout.t(MotionLayout.this, c2);
                            h0.g.c.c cVar2 = this.c;
                            int width = MotionLayout.this.getWidth();
                            int height = MotionLayout.this.getHeight();
                            int i5 = cVar2.f;
                            if (i5 != 0) {
                                i2 = i5;
                                cVar = cVar2;
                                sparseArray = sparseArray2;
                                rect = t;
                                str = "MotionLayout";
                                iArr = iArr2;
                                str2 = "no widget for  ";
                                int i6 = width;
                                i = childCount;
                                str3 = " (";
                                nVar2.e(t, nVar2.a, i2, i6, height);
                            } else {
                                i = childCount;
                                sparseArray = sparseArray2;
                                iArr = iArr2;
                                i2 = i5;
                                cVar = cVar2;
                                rect = t;
                                str = "MotionLayout";
                                str2 = "no widget for  ";
                                str3 = " (";
                            }
                            q qVar = nVar2.e;
                            qVar.x = 0.0f;
                            qVar.y = 0.0f;
                            nVar2.d(qVar);
                            nVar2.e.f((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
                            c.a h = cVar.h(nVar2.c);
                            nVar2.e.a(h);
                            nVar2.k = h.d.h;
                            nVar2.g.f(rect, cVar, i2, nVar2.c);
                            nVar2.C = h.f.j;
                            c.C0036c cVar3 = h.d;
                            nVar2.E = cVar3.l;
                            nVar2.F = cVar3.k;
                            Context context = nVar2.b.getContext();
                            c.C0036c cVar4 = h.d;
                            int i7 = cVar4.n;
                            String str4 = cVar4.m;
                            int i8 = cVar4.o;
                            if (i7 == -2) {
                                interpolator = AnimationUtils.loadInterpolator(context, i8);
                            } else if (i7 == -1) {
                                interpolator = new m(h0.g.a.g.a.c.c(str4));
                            } else if (i7 == 0) {
                                interpolator = new AccelerateDecelerateInterpolator();
                            } else if (i7 == 1) {
                                interpolator = new AccelerateInterpolator();
                            } else if (i7 == 2) {
                                interpolator = new DecelerateInterpolator();
                            } else if (i7 == 4) {
                                interpolator = new BounceInterpolator();
                            } else if (i7 != 5) {
                                interpolator = null;
                            } else {
                                interpolator = new OvershootInterpolator();
                            }
                            nVar2.G = interpolator;
                        } else {
                            i = childCount;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            str = "MotionLayout";
                            str2 = "no widget for  ";
                            str3 = " (";
                            if (MotionLayout.this.K2 != 0) {
                                Log.e(str, g0.a.b.b.a.M() + str2 + g0.a.b.b.a.O(childAt2) + str3 + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        str = "MotionLayout";
                        str2 = "no widget for  ";
                        str3 = " (";
                        Objects.requireNonNull(MotionLayout.this);
                    }
                    if (this.d != null) {
                        ConstraintWidget c3 = c(this.b, childAt2);
                        if (c3 != null) {
                            Rect t2 = MotionLayout.t(MotionLayout.this, c3);
                            h0.g.c.c cVar5 = this.d;
                            int width2 = MotionLayout.this.getWidth();
                            int height2 = MotionLayout.this.getHeight();
                            int i9 = cVar5.f;
                            if (i9 != 0) {
                                nVar2.e(t2, nVar2.a, i9, width2, height2);
                                t2 = nVar2.a;
                            }
                            q qVar2 = nVar2.f;
                            qVar2.x = 1.0f;
                            qVar2.y = 1.0f;
                            nVar2.d(qVar2);
                            nVar2.f.f((float) t2.left, (float) t2.top, (float) t2.width(), (float) t2.height());
                            nVar2.f.a(cVar5.h(nVar2.c));
                            nVar2.h.f(t2, cVar5, i9, nVar2.c);
                        } else if (MotionLayout.this.K2 != 0) {
                            Log.e(str, g0.a.b.b.a.M() + str2 + g0.a.b.b.a.O(childAt2) + str3 + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i4++;
                childCount = i;
                sparseArray2 = sparseArray;
                iArr2 = iArr;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i10 = 0;
            while (i10 < childCount) {
                SparseArray sparseArray4 = sparseArray3;
                n nVar3 = (n) sparseArray4.get(iArr3[i10]);
                int i11 = nVar3.e.e2;
                if (i11 != -1) {
                    n nVar4 = (n) sparseArray4.get(i11);
                    nVar3.e.i(nVar4, nVar4.e);
                    nVar3.f.i(nVar4, nVar4.f);
                }
                i10++;
                sparseArray3 = sparseArray4;
            }
        }

        public void b(h0.g.a.h.c cVar, h0.g.a.h.c cVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> arrayList = cVar.M0;
            HashMap hashMap = new HashMap();
            hashMap.put(cVar, cVar2);
            cVar2.M0.clear();
            cVar2.k(cVar, hashMap);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof h0.g.a.h.a) {
                    constraintWidget = new h0.g.a.h.a();
                } else if (next instanceof h0.g.a.h.e) {
                    constraintWidget = new h0.g.a.h.e();
                } else if (next instanceof h0.g.a.h.d) {
                    constraintWidget = new h0.g.a.h.d();
                } else if (next instanceof h0.g.a.h.f) {
                    constraintWidget = new h0.g.a.h.g();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                cVar2.M0.add(constraintWidget);
                ConstraintWidget constraintWidget2 = constraintWidget.W;
                if (constraintWidget2 != null) {
                    ((j) constraintWidget2).M0.remove(constraintWidget);
                    constraintWidget.I();
                }
                constraintWidget.W = cVar2;
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).k(next2, hashMap);
            }
        }

        public ConstraintWidget c(h0.g.a.h.c cVar, View view) {
            if (cVar.f6m0 == view) {
                return cVar;
            }
            ArrayList<ConstraintWidget> arrayList = cVar.M0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                if (constraintWidget.f6m0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void d(h0.g.c.c cVar, h0.g.c.c cVar2) {
            this.c = cVar;
            this.d = cVar2;
            this.a = new h0.g.a.h.c();
            this.b = new h0.g.a.h.c();
            this.a.i0(MotionLayout.this.x.Q0);
            this.b.i0(MotionLayout.this.x.Q0);
            this.a.M0.clear();
            this.b.M0.clear();
            b(MotionLayout.this.x, this.a);
            b(MotionLayout.this.x, this.b);
            if (((double) MotionLayout.this.C2) > 0.5d) {
                if (cVar != null) {
                    f(this.a, cVar);
                }
                f(this.b, cVar2);
            } else {
                f(this.b, cVar2);
                if (cVar != null) {
                    f(this.a, cVar);
                }
            }
            this.a.R0 = MotionLayout.this.i();
            h0.g.a.h.c cVar3 = this.a;
            cVar3.N0.c(cVar3);
            this.b.R0 = MotionLayout.this.i();
            h0.g.a.h.c cVar4 = this.b;
            cVar4.N0.c(cVar4);
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    h0.g.a.h.c cVar5 = this.a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    cVar5.Q(dimensionBehaviour);
                    this.b.Q(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    h0.g.a.h.c cVar6 = this.a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    cVar6.T(dimensionBehaviour2);
                    this.b.T(dimensionBehaviour2);
                }
            }
        }

        public void e() {
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.v2;
            int i2 = motionLayout.w2;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout2 = MotionLayout.this;
            motionLayout2.l3 = mode;
            motionLayout2.m3 = mode2;
            int optimizationLevel = motionLayout2.getOptimizationLevel();
            MotionLayout motionLayout3 = MotionLayout.this;
            if (motionLayout3.t2 == motionLayout3.getStartState()) {
                MotionLayout motionLayout4 = MotionLayout.this;
                h0.g.a.h.c cVar = this.b;
                h0.g.c.c cVar2 = this.d;
                motionLayout4.q(cVar, optimizationLevel, (cVar2 == null || cVar2.f == 0) ? i : i2, (cVar2 == null || cVar2.f == 0) ? i2 : i);
                h0.g.c.c cVar3 = this.c;
                if (cVar3 != null) {
                    MotionLayout motionLayout5 = MotionLayout.this;
                    h0.g.a.h.c cVar4 = this.a;
                    int i3 = cVar3.f;
                    motionLayout5.q(cVar4, optimizationLevel, i3 == 0 ? i : i2, i3 == 0 ? i2 : i);
                }
            } else {
                h0.g.c.c cVar5 = this.c;
                if (cVar5 != null) {
                    MotionLayout motionLayout6 = MotionLayout.this;
                    h0.g.a.h.c cVar6 = this.a;
                    int i4 = cVar5.f;
                    motionLayout6.q(cVar6, optimizationLevel, i4 == 0 ? i : i2, i4 == 0 ? i2 : i);
                }
                MotionLayout motionLayout7 = MotionLayout.this;
                h0.g.a.h.c cVar7 = this.b;
                h0.g.c.c cVar8 = this.d;
                motionLayout7.q(cVar7, optimizationLevel, (cVar8 == null || cVar8.f == 0) ? i : i2, (cVar8 == null || cVar8.f == 0) ? i2 : i);
            }
            int i5 = 0;
            boolean z = true;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout8 = MotionLayout.this;
                motionLayout8.l3 = mode;
                motionLayout8.m3 = mode2;
                if (motionLayout8.t2 == motionLayout8.getStartState()) {
                    MotionLayout motionLayout9 = MotionLayout.this;
                    h0.g.a.h.c cVar9 = this.b;
                    int i6 = this.d.f;
                    motionLayout9.q(cVar9, optimizationLevel, i6 == 0 ? i : i2, i6 == 0 ? i2 : i);
                    h0.g.c.c cVar10 = this.c;
                    if (cVar10 != null) {
                        MotionLayout motionLayout10 = MotionLayout.this;
                        h0.g.a.h.c cVar11 = this.a;
                        int i7 = cVar10.f;
                        motionLayout10.q(cVar11, optimizationLevel, i7 == 0 ? i : i2, i7 == 0 ? i2 : i);
                    }
                } else {
                    h0.g.c.c cVar12 = this.c;
                    if (cVar12 != null) {
                        MotionLayout motionLayout11 = MotionLayout.this;
                        h0.g.a.h.c cVar13 = this.a;
                        int i8 = cVar12.f;
                        motionLayout11.q(cVar13, optimizationLevel, i8 == 0 ? i : i2, i8 == 0 ? i2 : i);
                    }
                    MotionLayout motionLayout12 = MotionLayout.this;
                    h0.g.a.h.c cVar14 = this.b;
                    int i9 = this.d.f;
                    motionLayout12.q(cVar14, optimizationLevel, i9 == 0 ? i : i2, i9 == 0 ? i2 : i);
                }
                MotionLayout.this.h3 = this.a.w();
                MotionLayout.this.i3 = this.a.q();
                MotionLayout.this.j3 = this.b.w();
                MotionLayout.this.k3 = this.b.q();
                MotionLayout motionLayout13 = MotionLayout.this;
                motionLayout13.g3 = (motionLayout13.h3 == motionLayout13.j3 && motionLayout13.i3 == motionLayout13.k3) ? false : true;
            }
            MotionLayout motionLayout14 = MotionLayout.this;
            int i10 = motionLayout14.h3;
            int i11 = motionLayout14.i3;
            int i12 = motionLayout14.l3;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                i10 = (int) ((motionLayout14.n3 * ((float) (motionLayout14.j3 - i10))) + ((float) i10));
            }
            int i13 = motionLayout14.m3;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                i11 = (int) ((motionLayout14.n3 * ((float) (motionLayout14.k3 - i11))) + ((float) i11));
            }
            int i14 = i11;
            h0.g.a.h.c cVar15 = this.a;
            motionLayout14.p(i, i2, i10, i14, cVar15.a1 || this.b.a1, cVar15.b1 || this.b.b1);
            MotionLayout motionLayout15 = MotionLayout.this;
            int childCount = motionLayout15.getChildCount();
            motionLayout15.w3.a();
            motionLayout15.G2 = true;
            SparseArray sparseArray = new SparseArray();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = motionLayout15.getChildAt(i15);
                sparseArray.put(childAt.getId(), motionLayout15.y2.get(childAt));
            }
            int width = motionLayout15.getWidth();
            int height = motionLayout15.getHeight();
            r.b bVar = motionLayout15.o2.c;
            int i16 = bVar != null ? bVar.p : -1;
            if (i16 != -1) {
                for (int i17 = 0; i17 < childCount; i17++) {
                    n nVar = motionLayout15.y2.get(motionLayout15.getChildAt(i17));
                    if (nVar != null) {
                        nVar.B = i16;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[motionLayout15.y2.size()];
            int i18 = 0;
            for (int i19 = 0; i19 < childCount; i19++) {
                n nVar2 = motionLayout15.y2.get(motionLayout15.getChildAt(i19));
                int i20 = nVar2.e.e2;
                if (i20 != -1) {
                    sparseBooleanArray.put(i20, true);
                    iArr[i18] = nVar2.e.e2;
                    i18++;
                }
            }
            for (int i21 = 0; i21 < i18; i21++) {
                n nVar3 = motionLayout15.y2.get(motionLayout15.findViewById(iArr[i21]));
                if (nVar3 != null) {
                    motionLayout15.o2.g(nVar3);
                    nVar3.f(width, height, motionLayout15.getNanoTime());
                }
            }
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt2 = motionLayout15.getChildAt(i22);
                n nVar4 = motionLayout15.y2.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && nVar4 != null) {
                    motionLayout15.o2.g(nVar4);
                    nVar4.f(width, height, motionLayout15.getNanoTime());
                }
            }
            r.b bVar2 = motionLayout15.o2.c;
            float f2 = bVar2 != null ? bVar2.i : 0.0f;
            if (f2 != 0.0f) {
                boolean z2 = ((double) f2) < 0.0d;
                float abs = Math.abs(f2);
                float f3 = -3.4028235E38f;
                float f4 = Float.MAX_VALUE;
                float f5 = -3.4028235E38f;
                float f6 = Float.MAX_VALUE;
                int i23 = 0;
                while (true) {
                    if (i23 >= childCount) {
                        z = false;
                        break;
                    }
                    n nVar5 = motionLayout15.y2.get(motionLayout15.getChildAt(i23));
                    if (!Float.isNaN(nVar5.k)) {
                        break;
                    }
                    q qVar = nVar5.f;
                    float f7 = qVar.Y1;
                    float f8 = qVar.Z1;
                    float f9 = z2 ? f8 - f7 : f8 + f7;
                    f6 = Math.min(f6, f9);
                    f5 = Math.max(f5, f9);
                    i23++;
                }
                if (z) {
                    for (int i24 = 0; i24 < childCount; i24++) {
                        n nVar6 = motionLayout15.y2.get(motionLayout15.getChildAt(i24));
                        if (!Float.isNaN(nVar6.k)) {
                            f4 = Math.min(f4, nVar6.k);
                            f3 = Math.max(f3, nVar6.k);
                        }
                    }
                    while (i5 < childCount) {
                        n nVar7 = motionLayout15.y2.get(motionLayout15.getChildAt(i5));
                        if (!Float.isNaN(nVar7.k)) {
                            nVar7.m = 1.0f / (1.0f - abs);
                            if (z2) {
                                nVar7.l = abs - (((f3 - nVar7.k) / (f3 - f4)) * abs);
                            } else {
                                nVar7.l = abs - (((nVar7.k - f4) * abs) / (f3 - f4));
                            }
                        }
                        i5++;
                    }
                    return;
                }
                while (i5 < childCount) {
                    n nVar8 = motionLayout15.y2.get(motionLayout15.getChildAt(i5));
                    q qVar2 = nVar8.f;
                    float f10 = qVar2.Y1;
                    float f11 = qVar2.Z1;
                    float f12 = z2 ? f11 - f10 : f11 + f10;
                    nVar8.m = 1.0f / (1.0f - abs);
                    nVar8.l = abs - (((f12 - f6) * abs) / (f5 - f6));
                    i5++;
                }
            }
        }

        public final void f(h0.g.a.h.c cVar, h0.g.c.c cVar2) {
            c.a aVar;
            c.a aVar2;
            SparseArray sparseArray = new SparseArray();
            d.a aVar3 = new d.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, cVar);
            sparseArray.put(MotionLayout.this.getId(), cVar);
            if (!(cVar2 == null || cVar2.f == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.q(this.b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = cVar.M0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.f6m0).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = cVar.M0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.f6m0;
                int id = view.getId();
                if (cVar2.i.containsKey(Integer.valueOf(id)) && (aVar2 = cVar2.i.get(Integer.valueOf(id))) != null) {
                    aVar2.a(aVar3);
                }
                next2.U(cVar2.h(view.getId()).e.d);
                next2.P(cVar2.h(view.getId()).e.e);
                if (view instanceof h0.g.c.a) {
                    h0.g.c.a aVar4 = (h0.g.c.a) view;
                    int id2 = aVar4.getId();
                    if (cVar2.i.containsKey(Integer.valueOf(id2)) && (aVar = cVar2.i.get(Integer.valueOf(id2))) != null && (next2 instanceof h0.g.a.h.g)) {
                        aVar4.m(aVar, (h0.g.a.h.g) next2, aVar3, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).s();
                    }
                }
                aVar3.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.a(false, view, next2, aVar3, sparseArray);
                if (cVar2.h(view.getId()).c.c == 1) {
                    next2.f8o0 = view.getVisibility();
                } else {
                    next2.f8o0 = cVar2.h(view.getId()).c.b;
                }
            }
            Iterator<ConstraintWidget> it3 = cVar.M0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof h0.g.a.h.i) {
                    h0.g.a.h.f fVar = (h0.g.a.h.f) next3;
                    ((h0.g.c.a) next3.f6m0).r(fVar, sparseArray);
                    ((h0.g.a.h.i) fVar).Y();
                }
            }
        }
    }

    public interface f {
    }

    public static class g implements f {
        public static g a = new g();
        public VelocityTracker b;

        public void a(int i) {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        public float b() {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        public float c() {
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }
    }

    public class h {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;

        public h() {
        }

        public void a() {
            int i = this.c;
            if (!(i == -1 && this.d == -1)) {
                if (i == -1) {
                    MotionLayout.this.J(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        MotionLayout.this.F(i, -1, -1);
                    } else {
                        MotionLayout.this.G(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.b)) {
                MotionLayout motionLayout = MotionLayout.this;
                float f = this.a;
                float f2 = this.b;
                if (!motionLayout.isAttachedToWindow()) {
                    if (motionLayout.q3 == null) {
                        motionLayout.q3 = new h();
                    }
                    h hVar = motionLayout.q3;
                    hVar.a = f;
                    hVar.b = f2;
                } else {
                    motionLayout.setProgress(f);
                    motionLayout.setState(TransitionState.MOVING);
                    motionLayout.r2 = f2;
                    motionLayout.u(1.0f);
                }
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
            } else if (!Float.isNaN(this.a)) {
                MotionLayout.this.setProgress(this.a);
            }
        }
    }

    public interface i {
        void a(MotionLayout motionLayout, int i, int i2, float f);

        void b(MotionLayout motionLayout, int i, int i2);

        void c(MotionLayout motionLayout, int i, boolean z, float f);

        void d(MotionLayout motionLayout, int i);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r rVar;
        this.v2 = 0;
        this.w2 = 0;
        this.x2 = true;
        this.y2 = new HashMap<>();
        this.z2 = 0;
        this.A2 = 1.0f;
        this.B2 = 0.0f;
        this.C2 = 0.0f;
        this.E2 = 0.0f;
        this.G2 = false;
        this.K2 = 0;
        this.M2 = false;
        this.N2 = new h0.g.b.a.a();
        this.O2 = new c();
        this.S2 = false;
        this.X2 = false;
        this.Y2 = null;
        this.Z2 = null;
        this.a3 = null;
        this.b3 = 0;
        this.c3 = -1;
        this.d3 = 0.0f;
        this.e3 = 0;
        this.f3 = 0.0f;
        this.g3 = false;
        this.o3 = new h0.g.a.g.a.d();
        this.p3 = false;
        this.r3 = null;
        this.s3 = new HashMap<>();
        this.t3 = new Rect();
        this.u3 = false;
        this.v3 = TransitionState.UNDEFINED;
        this.w3 = new e();
        this.x3 = false;
        this.y3 = new RectF();
        this.z3 = null;
        this.A3 = null;
        this.B3 = new ArrayList<>();
        n2 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.o2 = new r(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.t2 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.E2 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.G2 = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.K2 == 0) {
                        this.K2 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    this.K2 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.o2 == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.o2 = null;
            }
        }
        if (this.K2 != 0) {
            r rVar2 = this.o2;
            if (rVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int i4 = rVar2.i();
                r rVar3 = this.o2;
                h0.g.c.c b2 = rVar3.b(rVar3.i());
                String N = g0.a.b.b.a.N(getContext(), i4);
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder T0 = i0.d.a.a.a.T0("CHECK: ", N, " ALL VIEWS SHOULD HAVE ID's ");
                        T0.append(childAt.getClass().getName());
                        T0.append(" does not!");
                        Log.w("MotionLayout", T0.toString());
                    }
                    if (b2.i(id) == null) {
                        StringBuilder T02 = i0.d.a.a.a.T0("CHECK: ", N, " NO CONSTRAINTS for ");
                        T02.append(g0.a.b.b.a.O(childAt));
                        Log.w("MotionLayout", T02.toString());
                    }
                }
                Integer[] numArr = (Integer[]) b2.i.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i6 = 0; i6 < length; i6++) {
                    iArr[i6] = numArr[i6].intValue();
                }
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = iArr[i7];
                    String N3 = g0.a.b.b.a.N(getContext(), i8);
                    if (findViewById(iArr[i7]) == null) {
                        Log.w("MotionLayout", "CHECK: " + N + " NO View matches id " + N3);
                    }
                    if (b2.h(i8).e.e == -1) {
                        Log.w("MotionLayout", "CHECK: " + N + "(" + N3 + ") no LAYOUT_HEIGHT");
                    }
                    if (b2.h(i8).e.d == -1) {
                        Log.w("MotionLayout", "CHECK: " + N + "(" + N3 + ") no LAYOUT_HEIGHT");
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator<r.b> it = this.o2.d.iterator();
                while (it.hasNext()) {
                    r.b next = it.next();
                    if (next == this.o2.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (next.d == next.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i9 = next.d;
                    int i10 = next.c;
                    String N4 = g0.a.b.b.a.N(getContext(), i9);
                    String N5 = g0.a.b.b.a.N(getContext(), i10);
                    if (sparseIntArray.get(i9) == i10) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + N4 + "->" + N5);
                    }
                    if (sparseIntArray2.get(i10) == i9) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + N4 + "->" + N5);
                    }
                    sparseIntArray.put(i9, i10);
                    sparseIntArray2.put(i10, i9);
                    if (this.o2.b(i9) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + N4);
                    }
                    if (this.o2.b(i10) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + N4);
                    }
                }
            }
        }
        if (this.t2 == -1 && (rVar = this.o2) != null) {
            this.t2 = rVar.i();
            this.s2 = this.o2.i();
            this.u2 = this.o2.d();
        }
    }

    public static Rect t(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.t3.top = constraintWidget.y();
        motionLayout.t3.left = constraintWidget.x();
        Rect rect = motionLayout.t3;
        int w = constraintWidget.w();
        Rect rect2 = motionLayout.t3;
        rect.right = w + rect2.left;
        int q = constraintWidget.q();
        Rect rect3 = motionLayout.t3;
        rect2.bottom = q + rect3.top;
        return rect3;
    }

    public h0.g.c.c A(int i2) {
        r rVar = this.o2;
        if (rVar == null) {
            return null;
        }
        return rVar.b(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.B(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = r1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x00ab
            android.graphics.RectF r2 = r7.y3
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.y3
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x00ab
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            android.graphics.Matrix r2 = r10.getMatrix()
            boolean r3 = r2.isIdentity()
            if (r3 == 0) goto L_0x0085
            r11.offsetLocation(r8, r9)
            boolean r10 = r10.onTouchEvent(r11)
            float r8 = -r8
            float r9 = -r9
            r11.offsetLocation(r8, r9)
            goto L_0x00a8
        L_0x0085:
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r11)
            r11.offsetLocation(r8, r9)
            android.graphics.Matrix r8 = r7.A3
            if (r8 != 0) goto L_0x0097
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r7.A3 = r8
        L_0x0097:
            android.graphics.Matrix r8 = r7.A3
            r2.invert(r8)
            android.graphics.Matrix r8 = r7.A3
            r11.transform(r8)
            boolean r10 = r10.onTouchEvent(r11)
            r11.recycle()
        L_0x00a8:
            if (r10 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r1 = r0
        L_0x00ac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.B(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    public void C() {
        r.b bVar;
        u uVar;
        View view;
        r rVar = this.o2;
        if (rVar != null) {
            if (rVar.a(this, this.t2)) {
                requestLayout();
                return;
            }
            int i2 = this.t2;
            if (i2 != -1) {
                r rVar2 = this.o2;
                Iterator<r.b> it = rVar2.d.iterator();
                while (it.hasNext()) {
                    r.b next = it.next();
                    if (next.m.size() > 0) {
                        Iterator<r.b.a> it2 = next.m.iterator();
                        while (it2.hasNext()) {
                            it2.next().b(this);
                        }
                    }
                }
                Iterator<r.b> it3 = rVar2.f.iterator();
                while (it3.hasNext()) {
                    r.b next2 = it3.next();
                    if (next2.m.size() > 0) {
                        Iterator<r.b.a> it4 = next2.m.iterator();
                        while (it4.hasNext()) {
                            it4.next().b(this);
                        }
                    }
                }
                Iterator<r.b> it5 = rVar2.d.iterator();
                while (it5.hasNext()) {
                    r.b next3 = it5.next();
                    if (next3.m.size() > 0) {
                        Iterator<r.b.a> it6 = next3.m.iterator();
                        while (it6.hasNext()) {
                            it6.next().a(this, i2, next3);
                        }
                    }
                }
                Iterator<r.b> it7 = rVar2.f.iterator();
                while (it7.hasNext()) {
                    r.b next4 = it7.next();
                    if (next4.m.size() > 0) {
                        Iterator<r.b.a> it8 = next4.m.iterator();
                        while (it8.hasNext()) {
                            it8.next().a(this, i2, next4);
                        }
                    }
                }
            }
            if (this.o2.p() && (bVar = this.o2.c) != null && (uVar = bVar.l) != null) {
                int i4 = uVar.f;
                if (i4 != -1) {
                    view = uVar.t.findViewById(i4);
                    if (view == null) {
                        StringBuilder P0 = i0.d.a.a.a.P0("cannot find TouchAnchorId @id/");
                        P0.append(g0.a.b.b.a.N(uVar.t.getContext(), uVar.f));
                        Log.e("TouchResponse", P0.toString());
                    }
                } else {
                    view = null;
                }
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    nestedScrollView.setOnTouchListener(new s(uVar));
                    nestedScrollView.setOnScrollChangeListener(new t(uVar));
                }
            }
        }
    }

    public final void D() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.H2 != null || ((copyOnWriteArrayList = this.a3) != null && !copyOnWriteArrayList.isEmpty())) {
            Iterator<Integer> it = this.B3.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                i iVar = this.H2;
                if (iVar != null) {
                    iVar.d(this, next.intValue());
                }
                CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.a3;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<i> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().d(this, next.intValue());
                    }
                }
            }
            this.B3.clear();
        }
    }

    public void E() {
        this.w3.e();
        invalidate();
    }

    public void F(int i2, int i4, int i5) {
        h0.g.c.c cVar;
        b.a aVar;
        int a2;
        setState(TransitionState.SETUP);
        this.t2 = i2;
        this.s2 = -1;
        this.u2 = -1;
        h0.g.c.b bVar = this.e2;
        h0.g.c.c cVar2 = null;
        if (bVar != null) {
            float f2 = (float) i4;
            float f4 = (float) i5;
            int i6 = bVar.b;
            if (i6 == i2) {
                if (i2 == -1) {
                    aVar = bVar.d.valueAt(0);
                } else {
                    aVar = bVar.d.get(i6);
                }
                int i7 = bVar.c;
                if ((i7 == -1 || !aVar.b.get(i7).a(f2, f4)) && bVar.c != (a2 = aVar.a(f2, f4))) {
                    if (a2 != -1) {
                        cVar2 = aVar.b.get(a2).f;
                    }
                    if (a2 != -1) {
                        int i8 = aVar.b.get(a2).e;
                    }
                    if (cVar2 != null) {
                        bVar.c = a2;
                        cVar2.b(bVar.a);
                        return;
                    }
                    return;
                }
                return;
            }
            bVar.b = i2;
            b.a aVar2 = bVar.d.get(i2);
            int a4 = aVar2.a(f2, f4);
            if (a4 == -1) {
                cVar = aVar2.d;
            } else {
                cVar = aVar2.b.get(a4).f;
            }
            if (a4 != -1) {
                int i9 = aVar2.b.get(a4).e;
            }
            if (cVar == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f2 + ", " + f4);
                return;
            }
            bVar.c = a4;
            cVar.b(bVar.a);
            return;
        }
        r rVar = this.o2;
        if (rVar != null) {
            rVar.b(i2).c(this, true);
            setConstraintSet((h0.g.c.c) null);
            requestLayout();
        }
    }

    public void G(int i2, int i4) {
        if (!isAttachedToWindow()) {
            if (this.q3 == null) {
                this.q3 = new h();
            }
            h hVar = this.q3;
            hVar.c = i2;
            hVar.d = i4;
            return;
        }
        r rVar = this.o2;
        if (rVar != null) {
            this.s2 = i2;
            this.u2 = i4;
            rVar.o(i2, i4);
            this.w3.d(this.o2.b(i2), this.o2.b(i4));
            E();
            this.C2 = 0.0f;
            u(0.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r1 != 7) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if ((((r4 * r6) - (((r5 * r6) * r6) / 2.0f)) + r1) > 1.0f) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if ((((((r5 * r3) * r3) / 2.0f) + (r4 * r3)) + r1) < 0.0f) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r3 = r3.l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(int r15, float r16, float r17) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r8 = r16
            r4 = r17
            h0.g.b.b.r r2 = r0.o2
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            float r2 = r0.C2
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0012
            return
        L_0x0012:
            r2 = 1
            r0.M2 = r2
            long r5 = r14.getNanoTime()
            r0.z2 = r5
            h0.g.b.b.r r3 = r0.o2
            int r3 = r3.c()
            float r3 = (float) r3
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r3 / r5
            r0.A2 = r5
            r0.E2 = r8
            r0.G2 = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 7
            r7 = 6
            r9 = 2
            r10 = 0
            r11 = 0
            if (r1 == 0) goto L_0x00ce
            if (r1 == r2) goto L_0x00ce
            if (r1 == r9) goto L_0x00ce
            r12 = 4
            if (r1 == r12) goto L_0x00b8
            r12 = 5
            if (r1 == r12) goto L_0x0045
            if (r1 == r7) goto L_0x00ce
            if (r1 == r6) goto L_0x00ce
            goto L_0x016c
        L_0x0045:
            float r1 = r0.C2
            h0.g.b.b.r r5 = r0.o2
            float r5 = r5.h()
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            r7 = 1073741824(0x40000000, float:2.0)
            if (r6 <= 0) goto L_0x0061
            float r6 = r4 / r5
            float r9 = r4 * r6
            float r5 = r5 * r6
            float r5 = r5 * r6
            float r5 = r5 / r7
            float r9 = r9 - r5
            float r9 = r9 + r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x006f
            goto L_0x0070
        L_0x0061:
            float r3 = -r4
            float r3 = r3 / r5
            float r6 = r4 * r3
            float r5 = r5 * r3
            float r5 = r5 * r3
            float r5 = r5 / r7
            float r5 = r5 + r6
            float r5 = r5 + r1
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r10
        L_0x0070:
            if (r2 == 0) goto L_0x0088
            androidx.constraintlayout.motion.widget.MotionLayout$c r1 = r0.O2
            float r2 = r0.C2
            h0.g.b.b.r r3 = r0.o2
            float r3 = r3.h()
            r1.a = r4
            r1.b = r2
            r1.c = r3
            androidx.constraintlayout.motion.widget.MotionLayout$c r1 = r0.O2
            r0.p2 = r1
            goto L_0x016c
        L_0x0088:
            h0.g.b.a.a r1 = r0.N2
            float r2 = r0.C2
            float r5 = r0.A2
            h0.g.b.b.r r3 = r0.o2
            float r6 = r3.h()
            h0.g.b.b.r r3 = r0.o2
            h0.g.b.b.r$b r3 = r3.c
            if (r3 == 0) goto L_0x00a2
            h0.g.b.b.u r3 = r3.l
            if (r3 == 0) goto L_0x00a2
            float r3 = r3.u
            r7 = r3
            goto L_0x00a3
        L_0x00a2:
            r7 = r11
        L_0x00a3:
            r3 = r16
            r4 = r17
            r1.b(r2, r3, r4, r5, r6, r7)
            r0.r2 = r11
            int r1 = r0.t2
            r0.E2 = r8
            r0.t2 = r1
            h0.g.b.a.a r1 = r0.N2
            r0.p2 = r1
            goto L_0x016c
        L_0x00b8:
            androidx.constraintlayout.motion.widget.MotionLayout$c r1 = r0.O2
            float r2 = r0.C2
            h0.g.b.b.r r3 = r0.o2
            float r3 = r3.h()
            r1.a = r4
            r1.b = r2
            r1.c = r3
            androidx.constraintlayout.motion.widget.MotionLayout$c r1 = r0.O2
            r0.p2 = r1
            goto L_0x016c
        L_0x00ce:
            if (r1 == r2) goto L_0x00d9
            if (r1 != r6) goto L_0x00d3
            goto L_0x00d9
        L_0x00d3:
            if (r1 == r9) goto L_0x00d7
            if (r1 != r7) goto L_0x00da
        L_0x00d7:
            r8 = r3
            goto L_0x00da
        L_0x00d9:
            r8 = r11
        L_0x00da:
            h0.g.b.b.r r1 = r0.o2
            h0.g.b.b.r$b r2 = r1.c
            if (r2 == 0) goto L_0x00e7
            h0.g.b.b.u r3 = r2.l
            if (r3 == 0) goto L_0x00e7
            int r3 = r3.F
            goto L_0x00e8
        L_0x00e7:
            r3 = r10
        L_0x00e8:
            if (r3 != 0) goto L_0x010a
            h0.g.b.a.a r2 = r0.N2
            float r3 = r0.C2
            float r6 = r1.h()
            h0.g.b.b.r r1 = r0.o2
            h0.g.b.b.r$b r1 = r1.c
            if (r1 == 0) goto L_0x0100
            h0.g.b.b.u r1 = r1.l
            if (r1 == 0) goto L_0x0100
            float r1 = r1.u
            r7 = r1
            goto L_0x0101
        L_0x0100:
            r7 = r11
        L_0x0101:
            r1 = r2
            r2 = r3
            r3 = r8
            r4 = r17
            r1.b(r2, r3, r4, r5, r6, r7)
            goto L_0x0162
        L_0x010a:
            h0.g.b.a.a r1 = r0.N2
            float r3 = r0.C2
            if (r2 == 0) goto L_0x0117
            h0.g.b.b.u r4 = r2.l
            if (r4 == 0) goto L_0x0117
            float r4 = r4.B
            goto L_0x0118
        L_0x0117:
            r4 = r11
        L_0x0118:
            if (r2 == 0) goto L_0x0121
            h0.g.b.b.u r5 = r2.l
            if (r5 == 0) goto L_0x0121
            float r5 = r5.C
            goto L_0x0122
        L_0x0121:
            r5 = r11
        L_0x0122:
            if (r2 == 0) goto L_0x012b
            h0.g.b.b.u r6 = r2.l
            if (r6 == 0) goto L_0x012b
            float r6 = r6.A
            goto L_0x012c
        L_0x012b:
            r6 = r11
        L_0x012c:
            if (r2 == 0) goto L_0x0135
            h0.g.b.b.u r7 = r2.l
            if (r7 == 0) goto L_0x0135
            float r7 = r7.D
            goto L_0x0136
        L_0x0135:
            r7 = r11
        L_0x0136:
            if (r2 == 0) goto L_0x013f
            h0.g.b.b.u r2 = r2.l
            if (r2 == 0) goto L_0x013f
            int r2 = r2.E
            goto L_0x0140
        L_0x013f:
            r2 = r10
        L_0x0140:
            h0.g.a.g.a.k r9 = r1.b
            if (r9 != 0) goto L_0x014b
            h0.g.a.g.a.k r9 = new h0.g.a.g.a.k
            r9.<init>()
            r1.b = r9
        L_0x014b:
            h0.g.a.g.a.k r9 = r1.b
            r1.c = r9
            double r12 = (double) r8
            r9.c = r12
            double r12 = (double) r6
            r9.a = r12
            r9.e = r3
            double r5 = (double) r5
            r9.b = r5
            r9.g = r4
            r9.h = r7
            r9.i = r2
            r9.d = r11
        L_0x0162:
            int r1 = r0.t2
            r0.E2 = r8
            r0.t2 = r1
            h0.g.b.a.a r1 = r0.N2
            r0.p2 = r1
        L_0x016c:
            r0.F2 = r10
            long r1 = r14.getNanoTime()
            r0.z2 = r1
            r14.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.H(int, float, float):void");
    }

    public void I() {
        u(1.0f);
        this.r3 = null;
    }

    public void J(int i2) {
        h0.g.c.h hVar;
        if (!isAttachedToWindow()) {
            if (this.q3 == null) {
                this.q3 = new h();
            }
            this.q3.d = i2;
            return;
        }
        r rVar = this.o2;
        if (!(rVar == null || (hVar = rVar.b) == null)) {
            int i4 = this.t2;
            float f2 = (float) -1;
            h.a aVar = hVar.b.get(i2);
            if (aVar == null) {
                i4 = i2;
            } else {
                int i5 = (f2 > -1.0f ? 1 : (f2 == -1.0f ? 0 : -1));
                if (i5 != 0 && i5 != 0) {
                    Iterator<h.b> it = aVar.b.iterator();
                    h.b bVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            h.b next = it.next();
                            if (next.a(f2, f2)) {
                                if (i4 == next.e) {
                                    break;
                                }
                                bVar = next;
                            }
                        } else {
                            i4 = bVar != null ? bVar.e : aVar.c;
                        }
                    }
                } else if (aVar.c != i4) {
                    Iterator<h.b> it2 = aVar.b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (i4 == it2.next().e) {
                                break;
                            }
                        } else {
                            i4 = aVar.c;
                            break;
                        }
                    }
                }
            }
            if (i4 != -1) {
                i2 = i4;
            }
        }
        int i6 = this.t2;
        if (i6 != i2) {
            if (this.s2 == i2) {
                u(0.0f);
            } else if (this.u2 == i2) {
                u(1.0f);
            } else {
                this.u2 = i2;
                if (i6 != -1) {
                    G(i6, i2);
                    u(1.0f);
                    this.C2 = 0.0f;
                    I();
                    return;
                }
                this.M2 = false;
                this.E2 = 1.0f;
                this.B2 = 0.0f;
                this.C2 = 0.0f;
                this.D2 = getNanoTime();
                this.z2 = getNanoTime();
                this.F2 = false;
                this.p2 = null;
                this.A2 = ((float) this.o2.c()) / 1000.0f;
                this.s2 = -1;
                this.o2.o(-1, this.u2);
                SparseArray sparseArray = new SparseArray();
                int childCount = getChildCount();
                this.y2.clear();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    this.y2.put(childAt, new n(childAt));
                    sparseArray.put(childAt.getId(), this.y2.get(childAt));
                }
                this.G2 = true;
                this.w3.d((h0.g.c.c) null, this.o2.b(i2));
                E();
                this.w3.a();
                int childCount2 = getChildCount();
                for (int i8 = 0; i8 < childCount2; i8++) {
                    View childAt2 = getChildAt(i8);
                    n nVar = this.y2.get(childAt2);
                    if (nVar != null) {
                        q qVar = nVar.e;
                        qVar.x = 0.0f;
                        qVar.y = 0.0f;
                        qVar.f(childAt2.getX(), childAt2.getY(), (float) childAt2.getWidth(), (float) childAt2.getHeight());
                        nVar.g.g(childAt2);
                    }
                }
                int width = getWidth();
                int height = getHeight();
                for (int i9 = 0; i9 < childCount; i9++) {
                    n nVar2 = this.y2.get(getChildAt(i9));
                    if (nVar2 != null) {
                        this.o2.g(nVar2);
                        nVar2.f(width, height, getNanoTime());
                    }
                }
                r.b bVar2 = this.o2.c;
                float f4 = bVar2 != null ? bVar2.i : 0.0f;
                if (f4 != 0.0f) {
                    float f5 = Float.MAX_VALUE;
                    float f6 = -3.4028235E38f;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        q qVar2 = this.y2.get(getChildAt(i10)).f;
                        float f7 = qVar2.Z1 + qVar2.Y1;
                        f5 = Math.min(f5, f7);
                        f6 = Math.max(f6, f7);
                    }
                    for (int i11 = 0; i11 < childCount; i11++) {
                        n nVar3 = this.y2.get(getChildAt(i11));
                        q qVar3 = nVar3.f;
                        float f8 = qVar3.Y1;
                        float f9 = qVar3.Z1;
                        nVar3.m = 1.0f / (1.0f - f4);
                        nVar3.l = f4 - ((((f8 + f9) - f5) * f4) / (f6 - f5));
                    }
                }
                this.B2 = 0.0f;
                this.C2 = 0.0f;
                this.G2 = true;
                invalidate();
            }
        }
    }

    public void K(int i2, h0.g.c.c cVar) {
        r rVar = this.o2;
        if (rVar != null) {
            rVar.g.put(i2, cVar);
        }
        this.w3.d(this.o2.b(this.s2), this.o2.b(this.u2));
        E();
        if (this.t2 == i2) {
            cVar.c(this, true);
            setConstraintSet((h0.g.c.c) null);
            requestLayout();
        }
    }

    public void L(int i2, View... viewArr) {
        r rVar = this.o2;
        if (rVar != null) {
            y yVar = rVar.q;
            Objects.requireNonNull(yVar);
            ArrayList arrayList = new ArrayList();
            Iterator<x> it = yVar.b.iterator();
            x xVar = null;
            while (it.hasNext()) {
                x next = it.next();
                if (next.a == i2) {
                    for (View view : viewArr) {
                        if (next.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        int currentState = yVar.a.getCurrentState();
                        if (next.e == 2) {
                            next.a(yVar, yVar.a, currentState, (h0.g.c.c) null, viewArr2);
                        } else if (currentState == -1) {
                            String str = yVar.d;
                            StringBuilder P0 = i0.d.a.a.a.P0("No support for ViewTransition within transition yet. Currently: ");
                            P0.append(yVar.a.toString());
                            Log.w(str, P0.toString());
                        } else {
                            h0.g.c.c A = yVar.a.A(currentState);
                            if (A != null) {
                                next.a(yVar, yVar.a, currentState, A, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                    xVar = next;
                }
            }
            if (xVar == null) {
                Log.e(yVar.d, " Could not find ViewTransition");
                return;
            }
            return;
        }
        Log.e("MotionLayout", " no motionScene");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x038d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = 0
            r0.w(r2)
            h0.g.b.b.r r3 = r0.o2
            r4 = 0
            if (r3 == 0) goto L_0x0040
            h0.g.b.b.y r3 = r3.q
            if (r3 == 0) goto L_0x0040
            java.util.ArrayList<h0.g.b.b.x$a> r5 = r3.e
            if (r5 != 0) goto L_0x0016
            goto L_0x0040
        L_0x0016:
            java.util.Iterator r5 = r5.iterator()
        L_0x001a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r5.next()
            h0.g.b.b.x$a r6 = (h0.g.b.b.x.a) r6
            r6.a()
            goto L_0x001a
        L_0x002a:
            java.util.ArrayList<h0.g.b.b.x$a> r5 = r3.e
            java.util.ArrayList<h0.g.b.b.x$a> r6 = r3.f
            r5.removeAll(r6)
            java.util.ArrayList<h0.g.b.b.x$a> r5 = r3.f
            r5.clear()
            java.util.ArrayList<h0.g.b.b.x$a> r5 = r3.e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0040
            r3.e = r4
        L_0x0040:
            super.dispatchDraw(r27)
            h0.g.b.b.r r3 = r0.o2
            if (r3 != 0) goto L_0x0048
            return
        L_0x0048:
            int r3 = r0.K2
            r4 = 1
            r3 = r3 & r4
            r5 = 1093664768(0x41300000, float:11.0)
            r6 = 1092616192(0x41200000, float:10.0)
            if (r3 != r4) goto L_0x010b
            boolean r3 = r26.isInEditMode()
            if (r3 != 0) goto L_0x010b
            int r3 = r0.b3
            int r3 = r3 + r4
            r0.b3 = r3
            long r7 = r26.getNanoTime()
            long r9 = r0.c3
            r11 = -1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0088
            long r9 = r7 - r9
            r11 = 200000000(0xbebc200, double:9.8813129E-316)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x008a
            int r3 = r0.b3
            float r3 = (float) r3
            float r9 = (float) r9
            r10 = 814313567(0x3089705f, float:1.0E-9)
            float r9 = r9 * r10
            float r3 = r3 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r9
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r9
            r0.d3 = r3
            r0.b3 = r2
            r0.c3 = r7
            goto L_0x008a
        L_0x0088:
            r0.c3 = r7
        L_0x008a:
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r7 = 1109917696(0x42280000, float:42.0)
            r3.setTextSize(r7)
            float r7 = r26.getProgress()
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            float r7 = (float) r7
            float r7 = r7 / r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            float r9 = r0.d3
            r8.append(r9)
            java.lang.String r9 = " fps "
            r8.append(r9)
            int r9 = r0.s2
            java.lang.String r9 = g0.a.b.b.a.Q(r0, r9)
            r8.append(r9)
            java.lang.String r9 = " -> "
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r8 = i0.d.a.a.a.P0(r8)
            int r9 = r0.u2
            java.lang.String r9 = g0.a.b.b.a.Q(r0, r9)
            r8.append(r9)
            java.lang.String r9 = " (progress: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " ) state="
            r8.append(r7)
            int r7 = r0.t2
            r9 = -1
            if (r7 != r9) goto L_0x00e1
            java.lang.String r7 = "undefined"
            goto L_0x00e5
        L_0x00e1:
            java.lang.String r7 = g0.a.b.b.a.Q(r0, r7)
        L_0x00e5:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r8)
            int r8 = r26.getHeight()
            int r8 = r8 + -29
            float r8 = (float) r8
            r1.drawText(r7, r5, r8, r3)
            r8 = -7864184(0xffffffffff880088, float:NaN)
            r3.setColor(r8)
            int r8 = r26.getHeight()
            int r8 = r8 + -30
            float r8 = (float) r8
            r1.drawText(r7, r6, r8, r3)
        L_0x010b:
            int r3 = r0.K2
            if (r3 <= r4) goto L_0x0505
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = r0.L2
            if (r3 != 0) goto L_0x011a
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = new androidx.constraintlayout.motion.widget.MotionLayout$d
            r3.<init>()
            r0.L2 = r3
        L_0x011a:
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = r0.L2
            java.util.HashMap<android.view.View, h0.g.b.b.n> r7 = r0.y2
            h0.g.b.b.r r8 = r0.o2
            int r8 = r8.c()
            int r9 = r0.K2
            java.util.Objects.requireNonNull(r3)
            if (r7 == 0) goto L_0x0505
            int r10 = r7.size()
            if (r10 != 0) goto L_0x0133
            goto L_0x0505
        L_0x0133:
            r27.save()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
            boolean r10 = r10.isInEditMode()
            r11 = 2
            if (r10 != 0) goto L_0x018b
            r10 = r9 & 1
            if (r10 != r11) goto L_0x018b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            android.content.Context r11 = r11.getContext()
            android.content.res.Resources r11 = r11.getResources()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r12 = r12.u2
            java.lang.String r11 = r11.getResourceName(r12)
            r10.append(r11)
            java.lang.String r11 = ":"
            r10.append(r11)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            float r11 = r11.getProgress()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r11 = r11.getHeight()
            int r11 = r11 + -30
            float r11 = (float) r11
            android.graphics.Paint r12 = r3.h
            r1.drawText(r10, r6, r11, r12)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r6 = r6.getHeight()
            int r6 = r6 + -29
            float r6 = (float) r6
            android.graphics.Paint r11 = r3.e
            r1.drawText(r10, r5, r6, r11)
        L_0x018b:
            java.util.Collection r5 = r7.values()
            java.util.Iterator r5 = r5.iterator()
            r6 = r1
        L_0x0194:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0502
            java.lang.Object r7 = r5.next()
            h0.g.b.b.n r7 = (h0.g.b.b.n) r7
            h0.g.b.b.q r10 = r7.e
            int r10 = r10.q
            java.util.ArrayList<h0.g.b.b.q> r11 = r7.u
            java.util.Iterator r11 = r11.iterator()
        L_0x01aa:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01bd
            java.lang.Object r12 = r11.next()
            h0.g.b.b.q r12 = (h0.g.b.b.q) r12
            int r12 = r12.q
            int r10 = java.lang.Math.max(r10, r12)
            goto L_0x01aa
        L_0x01bd:
            h0.g.b.b.q r11 = r7.f
            int r11 = r11.q
            int r10 = java.lang.Math.max(r10, r11)
            if (r9 <= 0) goto L_0x01ca
            if (r10 != 0) goto L_0x01ca
            r10 = r4
        L_0x01ca:
            if (r10 != 0) goto L_0x01cd
            goto L_0x0194
        L_0x01cd:
            float[] r4 = r3.c
            int[] r11 = r3.b
            if (r4 == 0) goto L_0x0229
            h0.g.a.g.a.b[] r12 = r7.i
            r12 = r12[r2]
            double[] r15 = r12.f()
            if (r11 == 0) goto L_0x01f9
            java.util.ArrayList<h0.g.b.b.q> r12 = r7.u
            java.util.Iterator r12 = r12.iterator()
            r13 = r2
        L_0x01e4:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x01f9
            java.lang.Object r14 = r12.next()
            h0.g.b.b.q r14 = (h0.g.b.b.q) r14
            int r16 = r13 + 1
            int r14 = r14.i2
            r11[r13] = r14
            r13 = r16
            goto L_0x01e4
        L_0x01f9:
            r11 = r2
            r18 = r11
        L_0x01fc:
            int r12 = r15.length
            if (r2 >= r12) goto L_0x0226
            h0.g.a.g.a.b[] r12 = r7.i
            r11 = r12[r11]
            r12 = r15[r2]
            double[] r14 = r7.o
            r11.c(r12, r14)
            h0.g.b.b.q r11 = r7.e
            r12 = r15[r2]
            int[] r14 = r7.n
            double[] r0 = r7.o
            r19 = r15
            r15 = r0
            r16 = r4
            r17 = r18
            r11.e(r12, r14, r15, r16, r17)
            int r18 = r18 + 2
            int r2 = r2 + 1
            r11 = 0
            r0 = r26
            r15 = r19
            goto L_0x01fc
        L_0x0226:
            int r18 = r18 / 2
            goto L_0x022b
        L_0x0229:
            r18 = 0
        L_0x022b:
            r0 = r18
            r3.l = r0
            r0 = 1
            if (r10 < r0) goto L_0x04f0
            int r0 = r8 / 16
            float[] r2 = r3.a
            if (r2 == 0) goto L_0x023d
            int r2 = r2.length
            int r4 = r0 * 2
            if (r2 == r4) goto L_0x024a
        L_0x023d:
            int r2 = r0 * 2
            float[] r2 = new float[r2]
            r3.a = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r3.d = r2
        L_0x024a:
            int r2 = r3.n
            float r2 = (float) r2
            r6.translate(r2, r2)
            android.graphics.Paint r2 = r3.e
            r4 = 1996488704(0x77000000, float:2.5961484E33)
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.i
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.f
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.g
            r2.setColor(r4)
            float[] r2 = r3.a
            int r4 = r0 + -1
            float r4 = (float) r4
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = r6 / r4
            java.util.HashMap<java.lang.String, h0.g.b.a.c> r11 = r7.y
            java.lang.String r12 = "translationX"
            if (r11 != 0) goto L_0x0277
            r11 = 0
            goto L_0x027d
        L_0x0277:
            java.lang.Object r11 = r11.get(r12)
            h0.g.a.g.a.j r11 = (h0.g.a.g.a.j) r11
        L_0x027d:
            r15 = r11
            java.util.HashMap<java.lang.String, h0.g.b.a.c> r11 = r7.y
            java.lang.String r13 = "translationY"
            if (r11 != 0) goto L_0x0286
            r11 = 0
            goto L_0x028c
        L_0x0286:
            java.lang.Object r11 = r11.get(r13)
            h0.g.a.g.a.j r11 = (h0.g.a.g.a.j) r11
        L_0x028c:
            r14 = r11
            java.util.HashMap<java.lang.String, h0.g.b.a.b> r11 = r7.z
            if (r11 != 0) goto L_0x0293
            r11 = 0
            goto L_0x0299
        L_0x0293:
            java.lang.Object r11 = r11.get(r12)
            h0.g.b.a.b r11 = (h0.g.b.a.b) r11
        L_0x0299:
            r12 = r11
            java.util.HashMap<java.lang.String, h0.g.b.a.b> r11 = r7.z
            if (r11 != 0) goto L_0x02a0
            r11 = 0
            goto L_0x02a6
        L_0x02a0:
            java.lang.Object r11 = r11.get(r13)
            h0.g.b.a.b r11 = (h0.g.b.a.b) r11
        L_0x02a6:
            r13 = r11
            r11 = 0
        L_0x02a8:
            if (r11 >= r0) goto L_0x03b1
            r18 = r0
            float r0 = (float) r11
            float r0 = r0 * r4
            r19 = r4
            float r4 = r7.m
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x02d5
            float r6 = r7.l
            int r16 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x02bd
            r0 = 0
        L_0x02bd:
            int r16 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r16 <= 0) goto L_0x02d5
            r20 = r8
            r21 = r9
            double r8 = (double) r0
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x02d9
            float r0 = r0 - r6
            float r0 = r0 * r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r4)
            goto L_0x02d9
        L_0x02d5:
            r20 = r8
            r21 = r9
        L_0x02d9:
            double r8 = (double) r0
            h0.g.b.b.q r4 = r7.e
            h0.g.a.g.a.c r4 = r4.d
            java.util.ArrayList<h0.g.b.b.q> r6 = r7.u
            java.util.Iterator r6 = r6.iterator()
            r16 = 2143289344(0x7fc00000, float:NaN)
            r17 = 0
        L_0x02e8:
            boolean r22 = r6.hasNext()
            if (r22 == 0) goto L_0x031a
            java.lang.Object r22 = r6.next()
            r23 = r5
            r5 = r22
            h0.g.b.b.q r5 = (h0.g.b.b.q) r5
            r22 = r6
            h0.g.a.g.a.c r6 = r5.d
            if (r6 == 0) goto L_0x0315
            r24 = r6
            float r6 = r5.x
            int r25 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r25 >= 0) goto L_0x030b
            r17 = r6
            r4 = r24
            goto L_0x0315
        L_0x030b:
            boolean r6 = java.lang.Float.isNaN(r16)
            if (r6 == 0) goto L_0x0315
            float r5 = r5.x
            r16 = r5
        L_0x0315:
            r6 = r22
            r5 = r23
            goto L_0x02e8
        L_0x031a:
            r23 = r5
            if (r4 == 0) goto L_0x0338
            boolean r5 = java.lang.Float.isNaN(r16)
            if (r5 == 0) goto L_0x0326
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x0326:
            float r5 = r0 - r17
            float r16 = r16 - r17
            float r5 = r5 / r16
            double r5 = (double) r5
            double r4 = r4.a(r5)
            float r4 = (float) r4
            float r4 = r4 * r16
            float r4 = r4 + r17
            double r4 = (double) r4
            goto L_0x0339
        L_0x0338:
            r4 = r8
        L_0x0339:
            h0.g.a.g.a.b[] r6 = r7.i
            r8 = 0
            r6 = r6[r8]
            double[] r8 = r7.o
            r6.c(r4, r8)
            h0.g.a.g.a.b r6 = r7.j
            if (r6 == 0) goto L_0x034f
            double[] r8 = r7.o
            int r9 = r8.length
            if (r9 <= 0) goto L_0x034f
            r6.c(r4, r8)
        L_0x034f:
            h0.g.b.b.q r6 = r7.e
            int[] r8 = r7.n
            double[] r9 = r7.o
            int r22 = r11 * 2
            r24 = r11
            r11 = r6
            r6 = r12
            r1 = r13
            r12 = r4
            r4 = r14
            r14 = r8
            r5 = r15
            r15 = r9
            r16 = r2
            r17 = r22
            r11.e(r12, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x0374
            r8 = r2[r22]
            float r9 = r6.a(r0)
            float r9 = r9 + r8
            r2[r22] = r9
            goto L_0x037f
        L_0x0374:
            if (r5 == 0) goto L_0x037f
            r8 = r2[r22]
            float r9 = r5.a(r0)
            float r9 = r9 + r8
            r2[r22] = r9
        L_0x037f:
            if (r1 == 0) goto L_0x038d
            int r22 = r22 + 1
            r8 = r2[r22]
            float r0 = r1.a(r0)
            float r0 = r0 + r8
            r2[r22] = r0
            goto L_0x039a
        L_0x038d:
            if (r4 == 0) goto L_0x039a
            int r22 = r22 + 1
            r8 = r2[r22]
            float r0 = r4.a(r0)
            float r0 = r0 + r8
            r2[r22] = r0
        L_0x039a:
            int r11 = r24 + 1
            r0 = 1065353216(0x3f800000, float:1.0)
            r13 = r1
            r14 = r4
            r15 = r5
            r12 = r6
            r4 = r19
            r8 = r20
            r9 = r21
            r5 = r23
            r1 = r27
            r6 = r0
            r0 = r18
            goto L_0x02a8
        L_0x03b1:
            r23 = r5
            r20 = r8
            r21 = r9
            int r0 = r3.l
            r1 = r27
            r3.a(r1, r10, r0, r7)
            android.graphics.Paint r0 = r3.e
            r2 = -21965(0xffffffffffffaa33, float:NaN)
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f
            r2 = -2067046(0xffffffffffe0759a, float:NaN)
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.i
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.g
            r2 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
            r0.setColor(r2)
            int r0 = r3.n
            int r0 = -r0
            float r0 = (float) r0
            r1.translate(r0, r0)
            int r0 = r3.l
            r3.a(r1, r10, r0, r7)
            r0 = 5
            if (r10 != r0) goto L_0x04ea
            android.graphics.Path r0 = r3.d
            r0.reset()
            r0 = 0
        L_0x03ef:
            r2 = 50
            if (r0 > r2) goto L_0x04c1
            float r4 = (float) r0
            float r2 = (float) r2
            float r4 = r4 / r2
            float[] r2 = r3.j
            r5 = 0
            float r4 = r7.a(r4, r5)
            h0.g.a.g.a.b[] r5 = r7.i
            r6 = 0
            r5 = r5[r6]
            double r8 = (double) r4
            double[] r4 = r7.o
            r5.c(r8, r4)
            h0.g.b.b.q r4 = r7.e
            int[] r5 = r7.n
            double[] r6 = r7.o
            float r8 = r4.Y1
            float r9 = r4.Z1
            float r10 = r4.a2
            float r11 = r4.b2
            r12 = 0
        L_0x0417:
            int r13 = r5.length
            if (r12 >= r13) goto L_0x0436
            r14 = r6[r12]
            float r14 = (float) r14
            r15 = r5[r12]
            r13 = 1
            if (r15 == r13) goto L_0x0432
            r13 = 2
            if (r15 == r13) goto L_0x0430
            r13 = 3
            if (r15 == r13) goto L_0x042e
            r13 = 4
            if (r15 == r13) goto L_0x042c
            goto L_0x0433
        L_0x042c:
            r11 = r14
            goto L_0x0433
        L_0x042e:
            r10 = r14
            goto L_0x0433
        L_0x0430:
            r9 = r14
            goto L_0x0433
        L_0x0432:
            r8 = r14
        L_0x0433:
            int r12 = r12 + 1
            goto L_0x0417
        L_0x0436:
            h0.g.b.b.n r4 = r4.g2
            if (r4 == 0) goto L_0x045f
            r4 = 0
            double r4 = (double) r4
            double r14 = (double) r8
            double r8 = (double) r9
            double r16 = java.lang.Math.sin(r8)
            double r16 = r16 * r14
            double r16 = r16 + r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r10 / r6
            r18 = r14
            double r13 = (double) r6
            double r13 = r16 - r13
            float r6 = (float) r13
            double r8 = java.lang.Math.cos(r8)
            double r8 = r8 * r18
            double r4 = r4 - r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r8 = r11 / r8
            double r8 = (double) r8
            double r4 = r4 - r8
            float r9 = (float) r4
            r8 = r6
        L_0x045f:
            float r10 = r10 + r8
            float r11 = r11 + r9
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r4)
            java.lang.Float.isNaN(r4)
            r4 = 0
            float r8 = r8 + r4
            float r9 = r9 + r4
            float r10 = r10 + r4
            float r11 = r11 + r4
            r4 = 0
            r2[r4] = r8
            r4 = 1
            r2[r4] = r9
            r4 = 2
            r2[r4] = r10
            r4 = 3
            r2[r4] = r9
            r4 = 4
            r2[r4] = r10
            r4 = 5
            r2[r4] = r11
            r4 = 6
            r2[r4] = r8
            r5 = 7
            r2[r5] = r11
            android.graphics.Path r2 = r3.d
            float[] r6 = r3.j
            r8 = 0
            r8 = r6[r8]
            r9 = 1
            r6 = r6[r9]
            r2.moveTo(r8, r6)
            android.graphics.Path r2 = r3.d
            float[] r6 = r3.j
            r8 = 2
            r8 = r6[r8]
            r9 = 3
            r6 = r6[r9]
            r2.lineTo(r8, r6)
            android.graphics.Path r2 = r3.d
            float[] r6 = r3.j
            r8 = 4
            r8 = r6[r8]
            r9 = 5
            r6 = r6[r9]
            r2.lineTo(r8, r6)
            android.graphics.Path r2 = r3.d
            float[] r6 = r3.j
            r4 = r6[r4]
            r5 = r6[r5]
            r2.lineTo(r4, r5)
            android.graphics.Path r2 = r3.d
            r2.close()
            int r0 = r0 + 1
            goto L_0x03ef
        L_0x04c1:
            r0 = 0
            r2 = 1
            android.graphics.Paint r4 = r3.e
            r5 = 1140850688(0x44000000, float:512.0)
            r4.setColor(r5)
            r4 = 1073741824(0x40000000, float:2.0)
            r1.translate(r4, r4)
            android.graphics.Path r4 = r3.d
            android.graphics.Paint r5 = r3.e
            r1.drawPath(r4, r5)
            r4 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1.translate(r4, r4)
            android.graphics.Paint r4 = r3.e
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4.setColor(r5)
            android.graphics.Path r4 = r3.d
            android.graphics.Paint r5 = r3.e
            r1.drawPath(r4, r5)
            goto L_0x04ec
        L_0x04ea:
            r0 = 0
            r2 = 1
        L_0x04ec:
            r6 = r1
            r4 = r2
            r2 = r0
            goto L_0x04f8
        L_0x04f0:
            r23 = r5
            r20 = r8
            r21 = r9
            r2 = 0
            r4 = r0
        L_0x04f8:
            r0 = r26
            r8 = r20
            r9 = r21
            r5 = r23
            goto L_0x0194
        L_0x0502:
            r27.restore()
        L_0x0505:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void e(View view, int i2, int i4, int i5, int i6, int i7, int[] iArr) {
        if (!(!this.S2 && i2 == 0 && i4 == 0)) {
            iArr[0] = iArr[0] + i5;
            iArr[1] = iArr[1] + i6;
        }
        this.S2 = false;
    }

    public int[] getConstraintSetIds() {
        r rVar = this.o2;
        if (rVar == null) {
            return null;
        }
        int size = rVar.g.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = rVar.g.keyAt(i2);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.t2;
    }

    public ArrayList<r.b> getDefinedTransitions() {
        r rVar = this.o2;
        if (rVar == null) {
            return null;
        }
        return rVar.d;
    }

    public h0.g.b.b.b getDesignTool() {
        if (this.P2 == null) {
            this.P2 = new h0.g.b.b.b(this);
        }
        return this.P2;
    }

    public int getEndState() {
        return this.u2;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.C2;
    }

    public int getStartState() {
        return this.s2;
    }

    public float getTargetPosition() {
        return this.E2;
    }

    public Bundle getTransitionState() {
        if (this.q3 == null) {
            this.q3 = new h();
        }
        h hVar = this.q3;
        MotionLayout motionLayout = MotionLayout.this;
        hVar.d = motionLayout.u2;
        hVar.c = motionLayout.s2;
        hVar.b = motionLayout.getVelocity();
        hVar.a = MotionLayout.this.getProgress();
        h hVar2 = this.q3;
        Objects.requireNonNull(hVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", hVar2.a);
        bundle.putFloat("motion.velocity", hVar2.b);
        bundle.putInt("motion.StartState", hVar2.c);
        bundle.putInt("motion.EndState", hVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        r rVar = this.o2;
        if (rVar != null) {
            this.A2 = ((float) rVar.c()) / 1000.0f;
        }
        return (long) (this.A2 * 1000.0f);
    }

    public float getVelocity() {
        return this.r2;
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void j(int i2) {
        this.e2 = null;
    }

    public void k(View view, int i2, int i4, int i5, int i6, int i7) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r1 = (r1 = r1.c).l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            h0.g.b.b.r r1 = r0.o2
            if (r1 == 0) goto L_0x0015
            h0.g.b.b.r$b r1 = r1.c
            if (r1 == 0) goto L_0x0015
            h0.g.b.b.u r1 = r1.l
            if (r1 == 0) goto L_0x0015
            int r1 = r1.y
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r1 = 1
            return r1
        L_0x0015:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.l(android.view.View, android.view.View, int, int):boolean");
    }

    public void m(View view, View view2, int i2, int i4) {
        this.V2 = getNanoTime();
        this.W2 = 0.0f;
        this.T2 = 0.0f;
        this.U2 = 0.0f;
    }

    public void n(View view, int i2) {
        u uVar;
        float f2;
        r rVar = this.o2;
        if (rVar != null) {
            float f4 = this.W2;
            float f5 = 0.0f;
            if (f4 != 0.0f) {
                float f6 = this.T2 / f4;
                float f7 = this.U2 / f4;
                r.b bVar = rVar.c;
                if (bVar != null && (uVar = bVar.l) != null) {
                    boolean z = false;
                    uVar.o = false;
                    float progress = uVar.t.getProgress();
                    uVar.t.z(uVar.f, progress, uVar.j, uVar.i, uVar.p);
                    float f8 = uVar.m;
                    float[] fArr = uVar.p;
                    float f9 = fArr[0];
                    float f10 = uVar.n;
                    float f11 = fArr[1];
                    if (f8 != 0.0f) {
                        f2 = (f6 * f8) / fArr[0];
                    } else {
                        f2 = (f7 * f10) / fArr[1];
                    }
                    if (!Float.isNaN(f2)) {
                        progress += f2 / 3.0f;
                    }
                    if (progress != 0.0f) {
                        boolean z4 = progress != 1.0f;
                        int i4 = uVar.e;
                        if (i4 != 3) {
                            z = true;
                        }
                        if (z && z4) {
                            MotionLayout motionLayout = uVar.t;
                            if (((double) progress) >= 0.5d) {
                                f5 = 1.0f;
                            }
                            motionLayout.H(i4, f5, f2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        r6 = r6.l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(android.view.View r20, int r21, int r22, int[] r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            h0.g.b.b.r r4 = r0.o2
            if (r4 != 0) goto L_0x000d
            return
        L_0x000d:
            h0.g.b.b.r$b r5 = r4.c
            if (r5 == 0) goto L_0x0187
            boolean r6 = r5.o
            r7 = 1
            r6 = r6 ^ r7
            if (r6 != 0) goto L_0x0019
            goto L_0x0187
        L_0x0019:
            r8 = -1
            if (r6 == 0) goto L_0x002b
            h0.g.b.b.u r6 = r5.l
            if (r6 == 0) goto L_0x002b
            int r6 = r6.g
            if (r6 == r8) goto L_0x002b
            int r9 = r20.getId()
            if (r9 == r6) goto L_0x002b
            return
        L_0x002b:
            h0.g.b.b.r$b r6 = r4.c
            r9 = 0
            if (r6 == 0) goto L_0x0037
            h0.g.b.b.u r6 = r6.l
            if (r6 == 0) goto L_0x0037
            boolean r6 = r6.w
            goto L_0x0038
        L_0x0037:
            r6 = r9
        L_0x0038:
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x0059
            h0.g.b.b.u r6 = r5.l
            if (r6 == 0) goto L_0x0048
            int r6 = r6.y
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0048
            r8 = r3
        L_0x0048:
            float r6 = r0.B2
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x0052
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0059
        L_0x0052:
            boolean r6 = r1.canScrollVertically(r8)
            if (r6 == 0) goto L_0x0059
            return
        L_0x0059:
            h0.g.b.b.u r5 = r5.l
            if (r5 == 0) goto L_0x00d1
            int r5 = r5.y
            r5 = r5 & r7
            if (r5 == 0) goto L_0x00d1
            float r5 = (float) r2
            float r6 = (float) r3
            h0.g.b.b.r$b r8 = r4.c
            if (r8 == 0) goto L_0x00b0
            h0.g.b.b.u r8 = r8.l
            if (r8 == 0) goto L_0x00b0
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r8.t
            float r15 = r12.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r8.t
            int r14 = r8.f
            float r12 = r8.j
            float r11 = r8.i
            float[] r7 = r8.p
            r16 = r12
            r17 = r11
            r18 = r7
            r13.z(r14, r15, r16, r17, r18)
            float r7 = r8.m
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            r12 = 869711765(0x33d6bf95, float:1.0E-7)
            if (r11 == 0) goto L_0x009d
            float[] r6 = r8.p
            r8 = r6[r9]
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0098
            r6[r9] = r12
        L_0x0098:
            float r5 = r5 * r7
            r6 = r6[r9]
            float r5 = r5 / r6
            goto L_0x00b1
        L_0x009d:
            float[] r5 = r8.p
            r7 = 1
            r11 = r5[r7]
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 != 0) goto L_0x00a8
            r5[r7] = r12
        L_0x00a8:
            float r8 = r8.n
            float r6 = r6 * r8
            r5 = r5[r7]
            float r5 = r6 / r5
            goto L_0x00b1
        L_0x00b0:
            r5 = r10
        L_0x00b1:
            float r6 = r0.C2
            int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x00bb
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x00c5
        L_0x00bb:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x00d1
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d1
        L_0x00c5:
            r1.setNestedScrollingEnabled(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$a r2 = new androidx.constraintlayout.motion.widget.MotionLayout$a
            r2.<init>(r0, r1)
            r1.post(r2)
            return
        L_0x00d1:
            float r1 = r0.B2
            long r5 = r19.getNanoTime()
            float r7 = (float) r2
            r0.T2 = r7
            float r8 = (float) r3
            r0.U2 = r8
            long r11 = r0.V2
            long r11 = r5 - r11
            double r11 = (double) r11
            r13 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r11 = r11 * r13
            float r11 = (float) r11
            r0.W2 = r11
            r0.V2 = r5
            h0.g.b.b.r$b r4 = r4.c
            if (r4 == 0) goto L_0x016d
            h0.g.b.b.u r4 = r4.l
            if (r4 == 0) goto L_0x016d
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.t
            float r5 = r5.getProgress()
            boolean r6 = r4.o
            if (r6 != 0) goto L_0x0107
            r6 = 1
            r4.o = r6
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r4.t
            r6.setProgress(r5)
        L_0x0107:
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r4.t
            int r12 = r4.f
            float r14 = r4.j
            float r15 = r4.i
            float[] r6 = r4.p
            r13 = r5
            r16 = r6
            r11.z(r12, r13, r14, r15, r16)
            float r6 = r4.m
            float[] r11 = r4.p
            r12 = r11[r9]
            float r6 = r6 * r12
            float r12 = r4.n
            r13 = 1
            r11 = r11[r13]
            float r12 = r12 * r11
            float r12 = r12 + r6
            float r6 = java.lang.Math.abs(r12)
            double r11 = (double) r6
            r14 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x013c
            float[] r6 = r4.p
            r11 = 1008981770(0x3c23d70a, float:0.01)
            r6[r9] = r11
            r6[r13] = r11
        L_0x013c:
            float r6 = r4.m
            int r11 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r11 == 0) goto L_0x0149
            float r7 = r7 * r6
            float[] r6 = r4.p
            r6 = r6[r9]
            float r7 = r7 / r6
            goto L_0x0153
        L_0x0149:
            float r6 = r4.n
            float r8 = r8 * r6
            float[] r6 = r4.p
            r7 = 1
            r6 = r6[r7]
            float r7 = r8 / r6
        L_0x0153:
            float r5 = r5 + r7
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r6)
            float r5 = java.lang.Math.max(r5, r10)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r4.t
            float r6 = r6.getProgress()
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x016d
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r4.t
            r4.setProgress(r5)
        L_0x016d:
            float r4 = r0.B2
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0179
            r23[r9] = r2
            r1 = 1
            r23[r1] = r3
            goto L_0x017a
        L_0x0179:
            r1 = 1
        L_0x017a:
            r0.w(r9)
            r2 = r23[r9]
            if (r2 != 0) goto L_0x0185
            r2 = r23[r1]
            if (r2 == 0) goto L_0x0187
        L_0x0185:
            r0.S2 = r1
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.o(android.view.View, int, int, int[], int):void");
    }

    public void onAttachedToWindow() {
        r.b bVar;
        int i2;
        boolean z;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        r rVar = this.o2;
        if (!(rVar == null || (i2 = this.t2) == -1)) {
            h0.g.c.c b2 = rVar.b(i2);
            r rVar2 = this.o2;
            int i4 = 0;
            while (true) {
                if (i4 >= rVar2.g.size()) {
                    break;
                }
                int keyAt = rVar2.g.keyAt(i4);
                int i5 = rVar2.i.get(keyAt);
                int size = rVar2.i.size();
                while (true) {
                    if (i5 <= 0) {
                        z = false;
                        break;
                    } else if (i5 == keyAt) {
                        break;
                    } else {
                        int i6 = size - 1;
                        if (size < 0) {
                            break;
                        }
                        i5 = rVar2.i.get(i5);
                        size = i6;
                    }
                }
                z = true;
                if (z) {
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break;
                } else {
                    rVar2.n(keyAt, this);
                    i4++;
                }
            }
            if (b2 != null) {
                b2.c(this, true);
                setConstraintSet((h0.g.c.c) null);
                requestLayout();
            }
            this.s2 = this.t2;
        }
        C();
        h hVar = this.q3;
        if (hVar == null) {
            r rVar3 = this.o2;
            if (rVar3 != null && (bVar = rVar3.c) != null && bVar.n == 4) {
                I();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            }
        } else if (this.u3) {
            post(new b());
        } else {
            hVar.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        u uVar;
        int i2;
        RectF b2;
        int currentState;
        int i4;
        x xVar;
        r rVar = this.o2;
        if (rVar != null && this.x2) {
            y yVar = rVar.q;
            if (!(yVar == null || (currentState = yVar.a.getCurrentState()) == -1)) {
                if (yVar.c == null) {
                    yVar.c = new HashSet<>();
                    Iterator<x> it = yVar.b.iterator();
                    while (it.hasNext()) {
                        x next = it.next();
                        int childCount = yVar.a.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = yVar.a.getChildAt(i5);
                            if (next.c(childAt)) {
                                childAt.getId();
                                yVar.c.add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<x.a> arrayList = yVar.e;
                int i6 = 2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator<x.a> it2 = yVar.e.iterator();
                    while (it2.hasNext()) {
                        x.a next2 = it2.next();
                        Objects.requireNonNull(next2);
                        if (action != 1) {
                            if (action == 2) {
                                next2.d.b.getHitRect(next2.m);
                                if (!next2.m.contains((int) x, (int) y) && !next2.i) {
                                    next2.b(true);
                                }
                            }
                        } else if (!next2.i) {
                            next2.b(true);
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    h0.g.c.c A = yVar.a.A(currentState);
                    Iterator<x> it3 = yVar.b.iterator();
                    while (it3.hasNext()) {
                        x next3 = it3.next();
                        int i7 = next3.b;
                        if (i7 != 1 ? !(i7 != i6 ? !(i7 == 3 && action == 0) : action != 1) : action == 0) {
                            Iterator<View> it4 = yVar.c.iterator();
                            while (it4.hasNext()) {
                                View next4 = it4.next();
                                if (next3.c(next4)) {
                                    next4.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        xVar = next3;
                                        i4 = i6;
                                        next3.a(yVar, yVar.a, currentState, A, next4);
                                    } else {
                                        xVar = next3;
                                        i4 = i6;
                                    }
                                    next3 = xVar;
                                    i6 = i4;
                                }
                            }
                        }
                    }
                }
            }
            r.b bVar = this.o2.c;
            if (bVar != null && (!bVar.o) && (uVar = bVar.l) != null && ((motionEvent.getAction() != 0 || (b2 = uVar.b(this, new RectF())) == null || b2.contains(motionEvent.getX(), motionEvent.getY())) && (i2 = uVar.g) != -1)) {
                View view = this.z3;
                if (view == null || view.getId() != i2) {
                    this.z3 = findViewById(i2);
                }
                View view2 = this.z3;
                if (view2 != null) {
                    this.y3.set((float) view2.getLeft(), (float) this.z3.getTop(), (float) this.z3.getRight(), (float) this.z3.getBottom());
                    if (this.y3.contains(motionEvent.getX(), motionEvent.getY()) && !B((float) this.z3.getLeft(), (float) this.z3.getTop(), this.z3, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    public void onLayout(boolean z, int i2, int i4, int i5, int i6) {
        this.p3 = true;
        try {
            if (this.o2 == null) {
                super.onLayout(z, i2, i4, i5, i6);
                return;
            }
            int i7 = i5 - i2;
            int i8 = i6 - i4;
            if (!(this.Q2 == i7 && this.R2 == i8)) {
                E();
                w(true);
            }
            this.Q2 = i7;
            this.R2 = i8;
            this.p3 = false;
        } finally {
            this.p3 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (((r6 == r8.e && r7 == r8.f) ? false : true) != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            h0.g.b.b.r r3 = r0.o2
            if (r3 != 0) goto L_0x000e
            super.onMeasure(r18, r19)
            return
        L_0x000e:
            int r3 = r0.v2
            r4 = 0
            r5 = 1
            if (r3 != r1) goto L_0x001b
            int r3 = r0.w2
            if (r3 == r2) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = r4
            goto L_0x001c
        L_0x001b:
            r3 = r5
        L_0x001c:
            boolean r6 = r0.x3
            if (r6 == 0) goto L_0x0029
            r0.x3 = r4
            r17.C()
            r17.D()
            r3 = r5
        L_0x0029:
            boolean r6 = r0.b2
            if (r6 == 0) goto L_0x002e
            r3 = r5
        L_0x002e:
            r0.v2 = r1
            r0.w2 = r2
            h0.g.b.b.r r6 = r0.o2
            int r6 = r6.i()
            h0.g.b.b.r r7 = r0.o2
            int r7 = r7.d()
            if (r3 != 0) goto L_0x0050
            androidx.constraintlayout.motion.widget.MotionLayout$e r8 = r0.w3
            int r9 = r8.e
            if (r6 != r9) goto L_0x004d
            int r8 = r8.f
            if (r7 == r8) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r8 = r4
            goto L_0x004e
        L_0x004d:
            r8 = r5
        L_0x004e:
            if (r8 == 0) goto L_0x0076
        L_0x0050:
            int r8 = r0.s2
            r9 = -1
            if (r8 == r9) goto L_0x0076
            super.onMeasure(r18, r19)
            androidx.constraintlayout.motion.widget.MotionLayout$e r1 = r0.w3
            h0.g.b.b.r r2 = r0.o2
            h0.g.c.c r2 = r2.b(r6)
            h0.g.b.b.r r3 = r0.o2
            h0.g.c.c r3 = r3.b(r7)
            r1.d(r2, r3)
            androidx.constraintlayout.motion.widget.MotionLayout$e r1 = r0.w3
            r1.e()
            androidx.constraintlayout.motion.widget.MotionLayout$e r1 = r0.w3
            r1.e = r6
            r1.f = r7
            r1 = r4
            goto L_0x007c
        L_0x0076:
            if (r3 == 0) goto L_0x007b
            super.onMeasure(r18, r19)
        L_0x007b:
            r1 = r5
        L_0x007c:
            boolean r2 = r0.g3
            if (r2 != 0) goto L_0x0082
            if (r1 == 0) goto L_0x00d1
        L_0x0082:
            int r1 = r17.getPaddingTop()
            int r2 = r17.getPaddingBottom()
            int r2 = r2 + r1
            int r1 = r17.getPaddingLeft()
            int r3 = r17.getPaddingRight()
            int r3 = r3 + r1
            h0.g.a.h.c r1 = r0.x
            int r1 = r1.w()
            int r1 = r1 + r3
            h0.g.a.h.c r3 = r0.x
            int r3 = r3.q()
            int r3 = r3 + r2
            int r2 = r0.l3
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r6) goto L_0x00aa
            if (r2 != 0) goto L_0x00b9
        L_0x00aa:
            int r1 = r0.h3
            float r2 = (float) r1
            float r7 = r0.n3
            int r8 = r0.j3
            int r8 = r8 - r1
            float r1 = (float) r8
            float r7 = r7 * r1
            float r7 = r7 + r2
            int r1 = (int) r7
            r17.requestLayout()
        L_0x00b9:
            int r2 = r0.m3
            if (r2 == r6) goto L_0x00bf
            if (r2 != 0) goto L_0x00ce
        L_0x00bf:
            int r2 = r0.i3
            float r3 = (float) r2
            float r6 = r0.n3
            int r7 = r0.k3
            int r7 = r7 - r2
            float r2 = (float) r7
            float r6 = r6 * r2
            float r6 = r6 + r3
            int r3 = (int) r6
            r17.requestLayout()
        L_0x00ce:
            r0.setMeasuredDimension(r1, r3)
        L_0x00d1:
            float r1 = r0.E2
            float r2 = r0.C2
            float r1 = r1 - r2
            float r1 = java.lang.Math.signum(r1)
            long r2 = r17.getNanoTime()
            android.view.animation.Interpolator r6 = r0.p2
            boolean r7 = r6 instanceof h0.g.b.a.a
            r8 = 814313567(0x3089705f, float:1.0E-9)
            r9 = 0
            if (r7 != 0) goto L_0x00f3
            long r10 = r0.D2
            long r10 = r2 - r10
            float r7 = (float) r10
            float r7 = r7 * r1
            float r7 = r7 * r8
            float r10 = r0.A2
            float r7 = r7 / r10
            goto L_0x00f4
        L_0x00f3:
            r7 = r9
        L_0x00f4:
            float r10 = r0.C2
            float r10 = r10 + r7
            boolean r7 = r0.F2
            if (r7 == 0) goto L_0x00fd
            float r10 = r0.E2
        L_0x00fd:
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0107
            float r11 = r0.E2
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0111
        L_0x0107:
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0114
            float r11 = r0.E2
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0114
        L_0x0111:
            float r10 = r0.E2
            goto L_0x0115
        L_0x0114:
            r5 = r4
        L_0x0115:
            if (r6 == 0) goto L_0x012b
            if (r5 != 0) goto L_0x012b
            boolean r5 = r0.M2
            if (r5 == 0) goto L_0x0127
            long r10 = r0.z2
            long r2 = r2 - r10
            float r2 = (float) r2
            float r2 = r2 * r8
            float r10 = r6.getInterpolation(r2)
            goto L_0x012b
        L_0x0127:
            float r10 = r6.getInterpolation(r10)
        L_0x012b:
            if (r7 <= 0) goto L_0x0133
            float r2 = r0.E2
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x013d
        L_0x0133:
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x013f
            float r1 = r0.E2
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x013f
        L_0x013d:
            float r10 = r0.E2
        L_0x013f:
            r0.n3 = r10
            int r1 = r17.getChildCount()
            long r2 = r17.getNanoTime()
            android.view.animation.Interpolator r5 = r0.q2
            if (r5 != 0) goto L_0x014e
            goto L_0x0152
        L_0x014e:
            float r10 = r5.getInterpolation(r10)
        L_0x0152:
            if (r4 >= r1) goto L_0x016f
            android.view.View r12 = r0.getChildAt(r4)
            java.util.HashMap<android.view.View, h0.g.b.b.n> r5 = r0.y2
            java.lang.Object r5 = r5.get(r12)
            r11 = r5
            h0.g.b.b.n r11 = (h0.g.b.b.n) r11
            if (r11 == 0) goto L_0x016c
            h0.g.a.g.a.d r5 = r0.o3
            r13 = r10
            r14 = r2
            r16 = r5
            r11.c(r12, r13, r14, r16)
        L_0x016c:
            int r4 = r4 + 1
            goto L_0x0152
        L_0x016f:
            boolean r1 = r0.g3
            if (r1 == 0) goto L_0x0176
            r17.requestLayout()
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f4, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f4) {
        return false;
    }

    public void onRtlPropertiesChanged(int i2) {
        u uVar;
        r rVar = this.o2;
        if (rVar != null) {
            boolean i4 = i();
            rVar.p = i4;
            r.b bVar = rVar.c;
            if (bVar != null && (uVar = bVar.l) != null) {
                uVar.c(i4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0595  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            h0.g.b.b.r r2 = r0.o2
            if (r2 == 0) goto L_0x080f
            boolean r3 = r0.x2
            if (r3 == 0) goto L_0x080f
            boolean r2 = r2.p()
            if (r2 == 0) goto L_0x080f
            h0.g.b.b.r r2 = r0.o2
            h0.g.b.b.r$b r3 = r2.c
            r4 = 1
            if (r3 == 0) goto L_0x0023
            boolean r3 = r3.o
            r3 = r3 ^ r4
            if (r3 != 0) goto L_0x0023
            boolean r1 = super.onTouchEvent(r30)
            return r1
        L_0x0023:
            int r3 = r29.getCurrentState()
            java.util.Objects.requireNonNull(r2)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = r2.o
            if (r6 != 0) goto L_0x0044
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r2.a
            java.util.Objects.requireNonNull(r6)
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = androidx.constraintlayout.motion.widget.MotionLayout.g.a
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.b = r7
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = androidx.constraintlayout.motion.widget.MotionLayout.g.a
            r2.o = r6
        L_0x0044:
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = r2.o
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = (androidx.constraintlayout.motion.widget.MotionLayout.g) r6
            android.view.VelocityTracker r6 = r6.b
            if (r6 == 0) goto L_0x004f
            r6.addMovement(r1)
        L_0x004f:
            r6 = 2
            r8 = -1
            if (r3 == r8) goto L_0x0231
            int r11 = r30.getAction()
            if (r11 == 0) goto L_0x01c5
            if (r11 == r6) goto L_0x005d
            goto L_0x0231
        L_0x005d:
            boolean r11 = r2.m
            if (r11 == 0) goto L_0x0063
            goto L_0x0231
        L_0x0063:
            float r11 = r30.getRawY()
            float r12 = r2.s
            float r11 = r11 - r12
            float r12 = r30.getRawX()
            float r13 = r2.r
            float r12 = r12 - r13
            double r13 = (double) r12
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x007d
            double r13 = (double) r11
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x080d
        L_0x007d:
            android.view.MotionEvent r13 = r2.l
            if (r13 != 0) goto L_0x0083
            goto L_0x080d
        L_0x0083:
            if (r3 == r8) goto L_0x018b
            h0.g.c.h r14 = r2.b
            if (r14 == 0) goto L_0x0090
            int r14 = r14.a(r3, r8, r8)
            if (r14 == r8) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r14 = r3
        L_0x0091:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList<h0.g.b.b.r$b> r9 = r2.d
            java.util.Iterator r9 = r9.iterator()
        L_0x009c:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L_0x00b8
            java.lang.Object r17 = r9.next()
            r8 = r17
            h0.g.b.b.r$b r8 = (h0.g.b.b.r.b) r8
            int r6 = r8.d
            if (r6 == r14) goto L_0x00b2
            int r6 = r8.c
            if (r6 != r14) goto L_0x00b5
        L_0x00b2:
            r15.add(r8)
        L_0x00b5:
            r6 = 2
            r8 = -1
            goto L_0x009c
        L_0x00b8:
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            java.util.Iterator r8 = r15.iterator()
            r9 = 0
            r14 = 0
        L_0x00c3:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x0189
            java.lang.Object r15 = r8.next()
            h0.g.b.b.r$b r15 = (h0.g.b.b.r.b) r15
            boolean r4 = r15.o
            if (r4 == 0) goto L_0x00d5
            goto L_0x0172
        L_0x00d5:
            h0.g.b.b.u r4 = r15.l
            if (r4 == 0) goto L_0x0172
            boolean r7 = r2.p
            r4.c(r7)
            h0.g.b.b.u r4 = r15.l
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r2.a
            android.graphics.RectF r4 = r4.b(r7, r6)
            if (r4 == 0) goto L_0x00f8
            float r7 = r13.getX()
            float r10 = r13.getY()
            boolean r4 = r4.contains(r7, r10)
            if (r4 != 0) goto L_0x00f8
            goto L_0x0172
        L_0x00f8:
            h0.g.b.b.u r4 = r15.l
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r2.a
            android.graphics.RectF r4 = r4.a(r7, r6)
            if (r4 == 0) goto L_0x0112
            float r7 = r13.getX()
            float r10 = r13.getY()
            boolean r4 = r4.contains(r7, r10)
            if (r4 != 0) goto L_0x0112
            goto L_0x0172
        L_0x0112:
            h0.g.b.b.u r4 = r15.l
            float r7 = r4.m
            float r7 = r7 * r12
            float r10 = r4.n
            float r10 = r10 * r11
            float r10 = r10 + r7
            boolean r4 = r4.l
            if (r4 == 0) goto L_0x0156
            float r4 = r13.getX()
            h0.g.b.b.u r7 = r15.l
            java.util.Objects.requireNonNull(r7)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 - r7
            float r10 = r13.getY()
            r18 = r6
            h0.g.b.b.u r6 = r15.l
            java.util.Objects.requireNonNull(r6)
            float r10 = r10 - r7
            float r6 = r12 + r4
            float r7 = r11 + r10
            r19 = r8
            double r7 = (double) r7
            r20 = r11
            r21 = r12
            double r11 = (double) r6
            double r6 = java.lang.Math.atan2(r7, r11)
            double r11 = (double) r4
            r4 = r13
            r8 = r14
            double r13 = (double) r10
            double r10 = java.lang.Math.atan2(r11, r13)
            double r6 = r6 - r10
            float r6 = (float) r6
            r7 = 1092616192(0x41200000, float:10.0)
            float r10 = r6 * r7
            goto L_0x0160
        L_0x0156:
            r18 = r6
            r19 = r8
            r20 = r11
            r21 = r12
            r4 = r13
            r8 = r14
        L_0x0160:
            int r6 = r15.c
            if (r6 != r3) goto L_0x0167
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x016a
        L_0x0167:
            r6 = 1066192077(0x3f8ccccd, float:1.1)
        L_0x016a:
            float r6 = r6 * r10
            int r7 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x017c
            r9 = r6
            r14 = r15
            goto L_0x017d
        L_0x0172:
            r18 = r6
            r19 = r8
            r20 = r11
            r21 = r12
            r4 = r13
            r8 = r14
        L_0x017c:
            r14 = r8
        L_0x017d:
            r13 = r4
            r6 = r18
            r8 = r19
            r11 = r20
            r12 = r21
            r4 = 1
            goto L_0x00c3
        L_0x0189:
            r8 = r14
            goto L_0x018d
        L_0x018b:
            h0.g.b.b.r$b r14 = r2.c
        L_0x018d:
            if (r14 == 0) goto L_0x0231
            r0.setTransition((h0.g.b.b.r.b) r14)
            h0.g.b.b.r$b r3 = r2.c
            h0.g.b.b.u r3 = r3.l
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.a
            android.graphics.RectF r3 = r3.b(r4, r5)
            if (r3 == 0) goto L_0x01b2
            android.view.MotionEvent r4 = r2.l
            float r4 = r4.getX()
            android.view.MotionEvent r5 = r2.l
            float r5 = r5.getY()
            boolean r3 = r3.contains(r4, r5)
            if (r3 != 0) goto L_0x01b2
            r3 = 1
            goto L_0x01b3
        L_0x01b2:
            r3 = 0
        L_0x01b3:
            r2.n = r3
            h0.g.b.b.r$b r3 = r2.c
            h0.g.b.b.u r3 = r3.l
            float r4 = r2.r
            float r5 = r2.s
            r3.r = r4
            r3.s = r5
            r4 = 0
            r3.o = r4
            goto L_0x0231
        L_0x01c5:
            r4 = 0
            float r3 = r30.getRawX()
            r2.r = r3
            float r3 = r30.getRawY()
            r2.s = r3
            r2.l = r1
            r2.m = r4
            h0.g.b.b.r$b r1 = r2.c
            h0.g.b.b.u r1 = r1.l
            if (r1 == 0) goto L_0x080d
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.a
            android.graphics.RectF r1 = r1.a(r3, r5)
            if (r1 == 0) goto L_0x01fe
            android.view.MotionEvent r3 = r2.l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x01fe
            r1 = 0
            r2.l = r1
            r1 = 1
            r2.m = r1
            goto L_0x080d
        L_0x01fe:
            h0.g.b.b.r$b r1 = r2.c
            h0.g.b.b.u r1 = r1.l
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.a
            android.graphics.RectF r1 = r1.b(r3, r5)
            if (r1 == 0) goto L_0x0220
            android.view.MotionEvent r3 = r2.l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x0220
            r1 = 1
            r2.n = r1
            goto L_0x0223
        L_0x0220:
            r1 = 0
            r2.n = r1
        L_0x0223:
            h0.g.b.b.r$b r1 = r2.c
            h0.g.b.b.u r1 = r1.l
            float r3 = r2.r
            float r2 = r2.s
            r1.r = r3
            r1.s = r2
            goto L_0x080d
        L_0x0231:
            boolean r3 = r2.m
            if (r3 == 0) goto L_0x0237
            goto L_0x080d
        L_0x0237:
            h0.g.b.b.r$b r3 = r2.c
            if (r3 == 0) goto L_0x07de
            h0.g.b.b.u r3 = r3.l
            if (r3 == 0) goto L_0x07de
            boolean r4 = r2.n
            if (r4 != 0) goto L_0x07de
            androidx.constraintlayout.motion.widget.MotionLayout$f r4 = r2.o
            boolean r5 = r3.l
            if (r5 == 0) goto L_0x05ba
            androidx.constraintlayout.motion.widget.MotionLayout$g r4 = (androidx.constraintlayout.motion.widget.MotionLayout.g) r4
            android.view.VelocityTracker r5 = r4.b
            if (r5 == 0) goto L_0x0252
            r5.addMovement(r1)
        L_0x0252:
            int r5 = r30.getAction()
            if (r5 == 0) goto L_0x05a9
            r18 = 1135869952(0x43b40000, float:360.0)
            r19 = 1073741824(0x40000000, float:2.0)
            r11 = 1
            if (r5 == r11) goto L_0x041f
            r11 = 2
            if (r5 == r11) goto L_0x0264
            goto L_0x07de
        L_0x0264:
            r30.getRawY()
            r30.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.t
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r5 = r5 / r19
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.t
            int r8 = r8.getHeight()
            float r8 = (float) r8
            float r8 = r8 / r19
            int r9 = r3.k
            r10 = -1
            if (r9 == r10) goto L_0x02ba
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.t
            android.view.View r5 = r5.findViewById(r9)
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.t
            int[] r9 = r3.q
            r8.getLocationOnScreen(r9)
            int[] r8 = r3.q
            r9 = 0
            r8 = r8[r9]
            float r8 = (float) r8
            int r9 = r5.getLeft()
            int r10 = r5.getRight()
            int r10 = r10 + r9
            float r9 = (float) r10
            float r9 = r9 / r19
            float r8 = r8 + r9
            int[] r9 = r3.q
            r10 = 1
            r9 = r9[r10]
            float r9 = (float) r9
            int r10 = r5.getTop()
            int r5 = r5.getBottom()
            int r5 = r5 + r10
            float r5 = (float) r5
            float r5 = r5 / r19
            float r5 = r5 + r9
            r28 = r8
            r8 = r5
            r5 = r28
            goto L_0x030e
        L_0x02ba:
            int r9 = r3.f
            r10 = -1
            if (r9 == r10) goto L_0x030e
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.t
            java.util.HashMap<android.view.View, h0.g.b.b.n> r11 = r10.y2
            android.view.View r9 = r10.findViewById(r9)
            java.lang.Object r9 = r11.get(r9)
            h0.g.b.b.n r9 = (h0.g.b.b.n) r9
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.t
            h0.g.b.b.q r9 = r9.e
            int r9 = r9.e2
            android.view.View r9 = r10.findViewById(r9)
            if (r9 != 0) goto L_0x02e1
            java.lang.String r9 = "TouchResponse"
            java.lang.String r10 = "could not find view to animate to"
            android.util.Log.e(r9, r10)
            goto L_0x030e
        L_0x02e1:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.t
            int[] r8 = r3.q
            r5.getLocationOnScreen(r8)
            int[] r5 = r3.q
            r8 = 0
            r5 = r5[r8]
            float r5 = (float) r5
            int r8 = r9.getLeft()
            int r10 = r9.getRight()
            int r10 = r10 + r8
            float r8 = (float) r10
            float r8 = r8 / r19
            float r5 = r5 + r8
            int[] r8 = r3.q
            r10 = 1
            r8 = r8[r10]
            float r8 = (float) r8
            int r10 = r9.getTop()
            int r9 = r9.getBottom()
            int r9 = r9 + r10
            float r9 = (float) r9
            float r9 = r9 / r19
            float r8 = r8 + r9
        L_0x030e:
            float r9 = r30.getRawX()
            float r9 = r9 - r5
            float r10 = r30.getRawY()
            float r10 = r10 - r8
            float r11 = r30.getRawY()
            float r11 = r11 - r8
            double r11 = (double) r11
            float r13 = r30.getRawX()
            float r13 = r13 - r5
            double r14 = (double) r13
            double r11 = java.lang.Math.atan2(r11, r14)
            float r13 = r3.s
            float r13 = r13 - r8
            double r13 = (double) r13
            float r8 = r3.r
            float r8 = r8 - r5
            double r6 = (double) r8
            double r5 = java.lang.Math.atan2(r13, r6)
            double r5 = r11 - r5
            r7 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r5 = r5 * r7
            r7 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r5 / r7
            float r5 = (float) r5
            r6 = 1134886912(0x43a50000, float:330.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x034c
            float r5 = r5 - r18
            goto L_0x0354
        L_0x034c:
            r6 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0354
            float r5 = r5 + r18
        L_0x0354:
            float r6 = java.lang.Math.abs(r5)
            double r6 = (double) r6
            r13 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x0366
            boolean r6 = r3.o
            if (r6 == 0) goto L_0x07de
        L_0x0366:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.t
            float r6 = r6.getProgress()
            boolean r7 = r3.o
            if (r7 != 0) goto L_0x0378
            r7 = 1
            r3.o = r7
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.t
            r7.setProgress(r6)
        L_0x0378:
            int r7 = r3.f
            r8 = -1
            if (r7 == r8) goto L_0x03a2
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.t
            float r13 = r3.j
            float r14 = r3.i
            float[] r15 = r3.p
            r22 = r8
            r23 = r7
            r24 = r6
            r25 = r13
            r26 = r14
            r27 = r15
            r22.z(r23, r24, r25, r26, r27)
            float[] r7 = r3.p
            r8 = 1
            r13 = r7[r8]
            double r13 = (double) r13
            double r13 = java.lang.Math.toDegrees(r13)
            float r13 = (float) r13
            r7[r8] = r13
            goto L_0x03a7
        L_0x03a2:
            r8 = 1
            float[] r7 = r3.p
            r7[r8] = r18
        L_0x03a7:
            float r7 = r3.x
            float r5 = r5 * r7
            float[] r7 = r3.p
            r7 = r7[r8]
            float r5 = r5 / r7
            float r5 = r5 + r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r6)
            r7 = 0
            float r5 = java.lang.Math.max(r5, r7)
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.t
            float r8 = r8.getProgress()
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x040c
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x03cd
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x03d7
        L_0x03cd:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.t
            if (r7 != 0) goto L_0x03d3
            r7 = 1
            goto L_0x03d4
        L_0x03d3:
            r7 = 0
        L_0x03d4:
            r6.v(r7)
        L_0x03d7:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.t
            r6.setProgress(r5)
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.a(r5)
            float r5 = r4.b()
            float r4 = r4.c()
            double r6 = (double) r4
            double r4 = (double) r5
            double r13 = java.lang.Math.hypot(r6, r4)
            double r4 = java.lang.Math.atan2(r6, r4)
            double r4 = r4 - r11
            double r4 = java.lang.Math.sin(r4)
            double r4 = r4 * r13
            double r6 = (double) r9
            double r8 = (double) r10
            double r6 = java.lang.Math.hypot(r6, r8)
            double r4 = r4 / r6
            float r4 = (float) r4
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.t
            double r6 = (double) r4
            double r6 = java.lang.Math.toDegrees(r6)
            float r4 = (float) r6
            r5.r2 = r4
            goto L_0x0411
        L_0x040c:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.t
            r5 = 0
            r4.r2 = r5
        L_0x0411:
            float r4 = r30.getRawX()
            r3.r = r4
            float r4 = r30.getRawY()
            r3.s = r4
            goto L_0x07de
        L_0x041f:
            r5 = 0
            r3.o = r5
            r5 = 16
            r4.a(r5)
            float r5 = r4.b()
            float r4 = r4.c()
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.t
            float r6 = r6.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.t
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r7 = r7 / r19
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r19
            int r14 = r3.k
            r15 = -1
            if (r14 == r15) goto L_0x047b
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.t
            android.view.View r7 = r7.findViewById(r14)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.t
            int[] r14 = r3.q
            r11.getLocationOnScreen(r14)
            int[] r11 = r3.q
            r14 = 0
            r11 = r11[r14]
            float r11 = (float) r11
            int r14 = r7.getLeft()
            int r15 = r7.getRight()
            int r15 = r15 + r14
            float r14 = (float) r15
            float r14 = r14 / r19
            float r14 = r14 + r11
            int[] r11 = r3.q
            r15 = 1
            r11 = r11[r15]
            float r11 = (float) r11
            int r15 = r7.getTop()
            int r7 = r7.getBottom()
            goto L_0x04c0
        L_0x047b:
            int r14 = r3.f
            r15 = -1
            if (r14 == r15) goto L_0x04c6
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.t
            java.util.HashMap<android.view.View, h0.g.b.b.n> r11 = r7.y2
            android.view.View r7 = r7.findViewById(r14)
            java.lang.Object r7 = r11.get(r7)
            h0.g.b.b.n r7 = (h0.g.b.b.n) r7
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.t
            h0.g.b.b.q r7 = r7.e
            int r7 = r7.e2
            android.view.View r7 = r11.findViewById(r7)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.t
            int[] r14 = r3.q
            r11.getLocationOnScreen(r14)
            int[] r11 = r3.q
            r14 = 0
            r11 = r11[r14]
            float r11 = (float) r11
            int r14 = r7.getLeft()
            int r15 = r7.getRight()
            int r15 = r15 + r14
            float r14 = (float) r15
            float r14 = r14 / r19
            float r14 = r14 + r11
            int[] r11 = r3.q
            r15 = 1
            r11 = r11[r15]
            float r11 = (float) r11
            int r15 = r7.getTop()
            int r7 = r7.getBottom()
        L_0x04c0:
            int r7 = r7 + r15
            float r7 = (float) r7
            float r7 = r7 / r19
            float r11 = r11 + r7
            r7 = r14
        L_0x04c6:
            float r14 = r30.getRawX()
            float r14 = r14 - r7
            float r7 = r30.getRawY()
            float r7 = r7 - r11
            double r8 = (double) r7
            double r10 = (double) r14
            double r8 = java.lang.Math.atan2(r8, r10)
            double r8 = java.lang.Math.toDegrees(r8)
            int r10 = r3.f
            r11 = -1
            if (r10 == r11) goto L_0x0504
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.t
            float r15 = r3.j
            float r12 = r3.i
            float[] r13 = r3.p
            r22 = r11
            r23 = r10
            r24 = r6
            r25 = r15
            r26 = r12
            r27 = r13
            r22.z(r23, r24, r25, r26, r27)
            float[] r10 = r3.p
            r11 = 1
            r12 = r10[r11]
            double r12 = (double) r12
            double r12 = java.lang.Math.toDegrees(r12)
            float r12 = (float) r12
            r10[r11] = r12
            goto L_0x0509
        L_0x0504:
            r11 = 1
            float[] r10 = r3.p
            r10[r11] = r18
        L_0x0509:
            float r4 = r4 + r7
            double r10 = (double) r4
            float r5 = r5 + r14
            double r4 = (double) r5
            double r4 = java.lang.Math.atan2(r10, r4)
            double r4 = java.lang.Math.toDegrees(r4)
            double r4 = r4 - r8
            float r4 = (float) r4
            r5 = 1115291648(0x427a0000, float:62.5)
            float r4 = r4 * r5
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 != 0) goto L_0x052f
            r5 = 1077936128(0x40400000, float:3.0)
            float r13 = r4 * r5
            float r5 = r3.x
            float r13 = r13 * r5
            float[] r5 = r3.p
            r7 = 1
            r5 = r5[r7]
            float r13 = r13 / r5
            float r13 = r13 + r6
            goto L_0x0530
        L_0x052f:
            r13 = r6
        L_0x0530:
            r5 = 0
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0595
            r5 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0595
            int r5 = r3.e
            r7 = 3
            if (r5 == r7) goto L_0x0595
            float r7 = r3.x
            float r4 = r4 * r7
            float[] r7 = r3.p
            r8 = 1
            r7 = r7[r8]
            float r4 = r4 / r7
            double r7 = (double) r13
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0552
            r7 = 0
            goto L_0x0554
        L_0x0552:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0554:
            r8 = 6
            if (r5 != r8) goto L_0x0564
            float r5 = r6 + r4
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0562
            float r4 = java.lang.Math.abs(r4)
        L_0x0562:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0564:
            int r5 = r3.e
            r8 = 7
            if (r5 != r8) goto L_0x0577
            float r5 = r6 + r4
            r7 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0576
            float r4 = java.lang.Math.abs(r4)
            float r4 = -r4
        L_0x0576:
            r7 = 0
        L_0x0577:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.t
            int r8 = r3.e
            r9 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r9
            r5.H(r8, r7, r4)
            r4 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x058c
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x07de
        L_0x058c:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x07de
        L_0x0595:
            r4 = 0
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x05a0
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x07de
        L_0x05a0:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x07de
        L_0x05a9:
            float r4 = r30.getRawX()
            r3.r = r4
            float r4 = r30.getRawY()
            r3.s = r4
            r4 = 0
            r3.o = r4
            goto L_0x07de
        L_0x05ba:
            androidx.constraintlayout.motion.widget.MotionLayout$g r4 = (androidx.constraintlayout.motion.widget.MotionLayout.g) r4
            android.view.VelocityTracker r5 = r4.b
            if (r5 == 0) goto L_0x05c3
            r5.addMovement(r1)
        L_0x05c3:
            int r5 = r30.getAction()
            if (r5 == 0) goto L_0x07cf
            r6 = 1
            if (r5 == r6) goto L_0x06f7
            r6 = 2
            if (r5 == r6) goto L_0x05d1
            goto L_0x07de
        L_0x05d1:
            float r5 = r30.getRawY()
            float r6 = r3.s
            float r5 = r5 - r6
            float r6 = r30.getRawX()
            float r7 = r3.r
            float r6 = r6 - r7
            float r7 = r3.m
            float r7 = r7 * r6
            float r8 = r3.n
            float r8 = r8 * r5
            float r8 = r8 + r7
            float r7 = java.lang.Math.abs(r8)
            float r8 = r3.z
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x05f4
            boolean r7 = r3.o
            if (r7 == 0) goto L_0x07de
        L_0x05f4:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.t
            float r7 = r7.getProgress()
            boolean r8 = r3.o
            if (r8 != 0) goto L_0x0606
            r8 = 1
            r3.o = r8
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.t
            r8.setProgress(r7)
        L_0x0606:
            int r9 = r3.f
            r8 = -1
            if (r9 == r8) goto L_0x061a
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.t
            float r11 = r3.j
            float r12 = r3.i
            float[] r13 = r3.p
            r10 = r7
            r8.z(r9, r10, r11, r12, r13)
            r10 = 0
            r11 = 1
            goto L_0x0639
        L_0x061a:
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.t
            int r8 = r8.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.t
            int r9 = r9.getHeight()
            int r8 = java.lang.Math.min(r8, r9)
            float r8 = (float) r8
            float[] r9 = r3.p
            float r10 = r3.n
            float r10 = r10 * r8
            r11 = 1
            r9[r11] = r10
            float r10 = r3.m
            float r8 = r8 * r10
            r10 = 0
            r9[r10] = r8
        L_0x0639:
            float r8 = r3.m
            float[] r9 = r3.p
            r12 = r9[r10]
            float r8 = r8 * r12
            float r10 = r3.n
            r9 = r9[r11]
            float r10 = r10 * r9
            float r10 = r10 + r8
            float r8 = r3.x
            float r10 = r10 * r8
            float r8 = java.lang.Math.abs(r10)
            double r8 = (double) r8
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r9 = 1008981770(0x3c23d70a, float:0.01)
            if (r8 >= 0) goto L_0x0663
            float[] r8 = r3.p
            r10 = 0
            r8[r10] = r9
            r11 = 1
            r8[r11] = r9
            goto L_0x0665
        L_0x0663:
            r10 = 0
            r11 = 1
        L_0x0665:
            float r8 = r3.m
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0672
            float[] r5 = r3.p
            r5 = r5[r10]
            float r6 = r6 / r5
            goto L_0x0678
        L_0x0672:
            float[] r6 = r3.p
            r6 = r6[r11]
            float r6 = r5 / r6
        L_0x0678:
            float r7 = r7 + r6
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = java.lang.Math.min(r7, r5)
            r5 = 0
            float r6 = java.lang.Math.max(r6, r5)
            int r5 = r3.e
            r7 = 6
            if (r5 != r7) goto L_0x068d
            float r6 = java.lang.Math.max(r6, r9)
        L_0x068d:
            int r5 = r3.e
            r7 = 7
            if (r5 != r7) goto L_0x0699
            r5 = 1065185444(0x3f7d70a4, float:0.99)
            float r6 = java.lang.Math.min(r6, r5)
        L_0x0699:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.t
            float r5 = r5.getProgress()
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x06e4
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x06ae
            r7 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x06b8
        L_0x06ae:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.t
            if (r8 != 0) goto L_0x06b4
            r7 = 1
            goto L_0x06b5
        L_0x06b4:
            r7 = 0
        L_0x06b5:
            r5.v(r7)
        L_0x06b8:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.t
            r5.setProgress(r6)
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.a(r5)
            float r5 = r4.b()
            float r4 = r4.c()
            float r6 = r3.m
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x06d8
            float[] r4 = r3.p
            r6 = 0
            r4 = r4[r6]
            float r5 = r5 / r4
            goto L_0x06df
        L_0x06d8:
            float[] r5 = r3.p
            r6 = 1
            r5 = r5[r6]
            float r5 = r4 / r5
        L_0x06df:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.t
            r4.r2 = r5
            goto L_0x06e9
        L_0x06e4:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.t
            r5 = 0
            r4.r2 = r5
        L_0x06e9:
            float r4 = r30.getRawX()
            r3.r = r4
            float r4 = r30.getRawY()
            r3.s = r4
            goto L_0x07de
        L_0x06f7:
            r5 = 0
            r3.o = r5
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.a(r5)
            float r5 = r4.b()
            float r4 = r4.c()
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.t
            float r6 = r6.getProgress()
            int r8 = r3.f
            r7 = -1
            if (r8 == r7) goto L_0x0721
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.t
            float r10 = r3.j
            float r11 = r3.i
            float[] r12 = r3.p
            r9 = r6
            r7.z(r8, r9, r10, r11, r12)
            r9 = 0
            r10 = 1
            goto L_0x0740
        L_0x0721:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.t
            int r7 = r7.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.t
            int r8 = r8.getHeight()
            int r7 = java.lang.Math.min(r7, r8)
            float r7 = (float) r7
            float[] r8 = r3.p
            float r9 = r3.n
            float r9 = r9 * r7
            r10 = 1
            r8[r10] = r9
            float r9 = r3.m
            float r7 = r7 * r9
            r9 = 0
            r8[r9] = r7
        L_0x0740:
            float r7 = r3.m
            float[] r8 = r3.p
            r11 = r8[r9]
            r11 = r8[r10]
            r12 = 0
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0751
            r4 = r8[r9]
            float r5 = r5 / r4
            goto L_0x0755
        L_0x0751:
            r5 = r8[r10]
            float r5 = r4 / r5
        L_0x0755:
            boolean r4 = java.lang.Float.isNaN(r5)
            if (r4 != 0) goto L_0x0761
            r4 = 1077936128(0x40400000, float:3.0)
            float r4 = r5 / r4
            float r4 = r4 + r6
            goto L_0x0762
        L_0x0761:
            r4 = r6
        L_0x0762:
            r7 = 0
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x07bc
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x07bc
            int r7 = r3.e
            r8 = 3
            if (r7 == r8) goto L_0x07bc
            double r8 = (double) r4
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x077b
            r4 = 0
            goto L_0x077d
        L_0x077b:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x077d:
            r8 = 6
            if (r7 != r8) goto L_0x078e
            float r4 = r6 + r5
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x078c
            float r4 = java.lang.Math.abs(r5)
            r5 = r4
        L_0x078c:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x078e:
            int r7 = r3.e
            r8 = 7
            if (r7 != r8) goto L_0x07a2
            float r4 = r6 + r5
            r7 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x07a1
            float r4 = java.lang.Math.abs(r5)
            float r4 = -r4
            r5 = r4
        L_0x07a1:
            r4 = 0
        L_0x07a2:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.t
            int r8 = r3.e
            r7.H(r8, r4, r5)
            r4 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x07b4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x07de
        L_0x07b4:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x07de
        L_0x07bc:
            r5 = 0
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x07c7
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x07de
        L_0x07c7:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x07de
        L_0x07cf:
            float r4 = r30.getRawX()
            r3.r = r4
            float r4 = r30.getRawY()
            r3.s = r4
            r4 = 0
            r3.o = r4
        L_0x07de:
            float r3 = r30.getRawX()
            r2.r = r3
            float r3 = r30.getRawY()
            r2.s = r3
            int r1 = r30.getAction()
            r3 = 1
            if (r1 != r3) goto L_0x080d
            androidx.constraintlayout.motion.widget.MotionLayout$f r1 = r2.o
            if (r1 == 0) goto L_0x080d
            androidx.constraintlayout.motion.widget.MotionLayout$g r1 = (androidx.constraintlayout.motion.widget.MotionLayout.g) r1
            android.view.VelocityTracker r3 = r1.b
            if (r3 == 0) goto L_0x0802
            r3.recycle()
            r3 = 0
            r1.b = r3
            goto L_0x0803
        L_0x0802:
            r3 = 0
        L_0x0803:
            r2.o = r3
            int r1 = r0.t2
            r3 = -1
            if (r1 == r3) goto L_0x080d
            r2.a(r0, r1)
        L_0x080d:
            r1 = 1
            return r1
        L_0x080f:
            boolean r1 = super.onTouchEvent(r30)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof o) {
            o oVar = (o) view;
            if (this.a3 == null) {
                this.a3 = new CopyOnWriteArrayList<>();
            }
            this.a3.add(oVar);
            if (oVar.b2) {
                if (this.Y2 == null) {
                    this.Y2 = new ArrayList<>();
                }
                this.Y2.add(oVar);
            }
            if (oVar.c2) {
                if (this.Z2 == null) {
                    this.Z2 = new ArrayList<>();
                }
                this.Z2.add(oVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<o> arrayList = this.Y2;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<o> arrayList2 = this.Z2;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void requestLayout() {
        r rVar;
        r.b bVar;
        if (this.g3 || this.t2 != -1 || (rVar = this.o2) == null || (bVar = rVar.c) == null || bVar.q != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i2) {
        this.K2 = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.u3 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.x2 = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.o2 != null) {
            setState(TransitionState.MOVING);
            Interpolator f4 = this.o2.f();
            if (f4 != null) {
                setProgress(f4.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<o> arrayList = this.Z2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.Z2.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<o> arrayList = this.Y2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.Y2.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 < 0 || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.q3 == null) {
                this.q3 = new h();
            }
            this.q3.a = f2;
            return;
        }
        if (i2 <= 0) {
            if (this.C2 == 1.0f && this.t2 == this.u2) {
                setState(TransitionState.MOVING);
            }
            this.t2 = this.s2;
            if (this.C2 == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.C2 == 0.0f && this.t2 == this.s2) {
                setState(TransitionState.MOVING);
            }
            this.t2 = this.u2;
            if (this.C2 == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.t2 = -1;
            setState(TransitionState.MOVING);
        }
        if (this.o2 != null) {
            this.F2 = true;
            this.E2 = f2;
            this.B2 = f2;
            this.D2 = -1;
            this.z2 = -1;
            this.p2 = null;
            this.G2 = true;
            invalidate();
        }
    }

    public void setScene(r rVar) {
        u uVar;
        this.o2 = rVar;
        boolean i2 = i();
        rVar.p = i2;
        r.b bVar = rVar.c;
        if (!(bVar == null || (uVar = bVar.l) == null)) {
            uVar.c(i2);
        }
        E();
    }

    public void setStartState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.q3 == null) {
                this.q3 = new h();
            }
            h hVar = this.q3;
            hVar.c = i2;
            hVar.d = i2;
            return;
        }
        this.t2 = i2;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.t2 != -1) {
            TransitionState transitionState3 = this.v3;
            this.v3 = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                x();
            }
            int ordinal = transitionState3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (transitionState == transitionState4) {
                    x();
                }
                if (transitionState == transitionState2) {
                    y();
                }
            } else if (ordinal == 2 && transitionState == transitionState2) {
                y();
            }
        }
    }

    public void setTransition(int i2) {
        r.b bVar;
        r rVar = this.o2;
        if (rVar != null) {
            Iterator<r.b> it = rVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (bVar.a == i2) {
                    break;
                }
            }
            this.s2 = bVar.d;
            this.u2 = bVar.c;
            if (!isAttachedToWindow()) {
                if (this.q3 == null) {
                    this.q3 = new h();
                }
                h hVar = this.q3;
                hVar.c = this.s2;
                hVar.d = this.u2;
                return;
            }
            float f2 = Float.NaN;
            int i4 = this.t2;
            if (i4 == this.s2) {
                f2 = 0.0f;
            } else if (i4 == this.u2) {
                f2 = 1.0f;
            }
            r rVar2 = this.o2;
            rVar2.c = bVar;
            u uVar = bVar.l;
            if (uVar != null) {
                uVar.c(rVar2.p);
            }
            this.w3.d(this.o2.b(this.s2), this.o2.b(this.u2));
            E();
            if (this.C2 != f2) {
                if (f2 == 0.0f) {
                    v(true);
                    this.o2.b(this.s2).c(this, true);
                    setConstraintSet((h0.g.c.c) null);
                    requestLayout();
                } else if (f2 == 1.0f) {
                    v(false);
                    this.o2.b(this.u2).c(this, true);
                    setConstraintSet((h0.g.c.c) null);
                    requestLayout();
                }
            }
            this.C2 = Float.isNaN(f2) ? 0.0f : f2;
            if (Float.isNaN(f2)) {
                Log.v("MotionLayout", g0.a.b.b.a.M() + " transitionToStart ");
                u(0.0f);
                return;
            }
            setProgress(f2);
        }
    }

    public void setTransitionDuration(int i2) {
        r rVar = this.o2;
        if (rVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        r.b bVar = rVar.c;
        if (bVar != null) {
            bVar.h = Math.max(i2, 8);
        } else {
            rVar.j = i2;
        }
    }

    public void setTransitionListener(i iVar) {
        this.H2 = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.q3 == null) {
            this.q3 = new h();
        }
        h hVar = this.q3;
        Objects.requireNonNull(hVar);
        hVar.a = bundle.getFloat("motion.progress");
        hVar.b = bundle.getFloat("motion.velocity");
        hVar.c = bundle.getInt("motion.StartState");
        hVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.q3.a();
        }
    }

    public String toString() {
        Context context = getContext();
        return g0.a.b.b.a.N(context, this.s2) + "->" + g0.a.b.b.a.N(context, this.u2) + " (pos:" + this.C2 + " Dpos/Dt:" + this.r2;
    }

    public void u(float f2) {
        r rVar = this.o2;
        if (rVar != null) {
            float f4 = this.C2;
            float f5 = this.B2;
            if (f4 != f5 && this.F2) {
                this.C2 = f5;
            }
            float f6 = this.C2;
            if (f6 != f2) {
                this.M2 = false;
                this.E2 = f2;
                this.A2 = ((float) rVar.c()) / 1000.0f;
                setProgress(this.E2);
                this.p2 = null;
                this.q2 = this.o2.f();
                this.F2 = false;
                this.z2 = getNanoTime();
                this.G2 = true;
                this.B2 = f6;
                this.C2 = f6;
                invalidate();
            }
        }
    }

    public void v(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            n nVar = this.y2.get(getChildAt(i2));
            if (nVar != null && "button".equals(g0.a.b.b.a.O(nVar.b)) && nVar.A != null) {
                int i4 = 0;
                while (true) {
                    h0.g.b.b.k[] kVarArr = nVar.A;
                    if (i4 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i4].g(z ? -100.0f : 100.0f, nVar.b);
                    i4++;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            long r1 = r0.D2
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            long r1 = r23.getNanoTime()
            r0.D2 = r1
        L_0x0010:
            float r1 = r0.C2
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x0020
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0020
            r0.t2 = r4
        L_0x0020:
            boolean r3 = r0.X2
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0032
            boolean r3 = r0.G2
            if (r3 == 0) goto L_0x0241
            if (r24 != 0) goto L_0x0032
            float r3 = r0.E2
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0241
        L_0x0032:
            float r3 = r0.E2
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r23.getNanoTime()
            android.view.animation.Interpolator r3 = r0.p2
            boolean r10 = r3 instanceof h0.g.b.b.p
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0051
            long r12 = r0.D2
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.A2
            float r10 = r10 / r12
            goto L_0x0052
        L_0x0051:
            r10 = r2
        L_0x0052:
            float r12 = r0.C2
            float r12 = r12 + r10
            boolean r13 = r0.F2
            if (r13 == 0) goto L_0x005b
            float r12 = r0.E2
        L_0x005b:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0065
            float r14 = r0.E2
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x006f
        L_0x0065:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0075
            float r14 = r0.E2
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0075
        L_0x006f:
            float r12 = r0.E2
            r0.G2 = r7
            r14 = r6
            goto L_0x0076
        L_0x0075:
            r14 = r7
        L_0x0076:
            r0.C2 = r12
            r0.B2 = r12
            r0.D2 = r8
            r15 = 2
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto L_0x0105
            if (r14 != 0) goto L_0x0105
            boolean r14 = r0.M2
            if (r14 == 0) goto L_0x00e6
            long r4 = r0.z2
            long r4 = r8 - r4
            float r4 = (float) r4
            float r4 = r4 * r11
            float r3 = r3.getInterpolation(r4)
            android.view.animation.Interpolator r4 = r0.p2
            h0.g.b.a.a r5 = r0.N2
            if (r4 != r5) goto L_0x00a4
            h0.g.a.g.a.m r4 = r5.c
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x00a2
            r4 = r15
            goto L_0x00a5
        L_0x00a2:
            r4 = r6
            goto L_0x00a5
        L_0x00a4:
            r4 = r7
        L_0x00a5:
            r0.C2 = r3
            r0.D2 = r8
            android.view.animation.Interpolator r5 = r0.p2
            boolean r8 = r5 instanceof h0.g.b.b.p
            if (r8 == 0) goto L_0x00e4
            h0.g.b.b.p r5 = (h0.g.b.b.p) r5
            float r5 = r5.a()
            r0.r2 = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.A2
            float r8 = r8 * r9
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x00c6
            if (r4 != r15) goto L_0x00c6
            r0.G2 = r7
        L_0x00c6:
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d6
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00d6
            r0.C2 = r8
            r0.G2 = r7
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00d6:
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e4
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x00e4
            r0.C2 = r2
            r0.G2 = r7
            r12 = r2
            goto L_0x0108
        L_0x00e4:
            r12 = r3
            goto L_0x0108
        L_0x00e6:
            float r3 = r3.getInterpolation(r12)
            android.view.animation.Interpolator r4 = r0.p2
            boolean r5 = r4 instanceof h0.g.b.b.p
            if (r5 == 0) goto L_0x00f9
            h0.g.b.b.p r4 = (h0.g.b.b.p) r4
            float r4 = r4.a()
            r0.r2 = r4
            goto L_0x0103
        L_0x00f9:
            float r12 = r12 + r10
            float r4 = r4.getInterpolation(r12)
            float r4 = r4 - r3
            float r4 = r4 * r1
            float r4 = r4 / r10
            r0.r2 = r4
        L_0x0103:
            r12 = r3
            goto L_0x0107
        L_0x0105:
            r0.r2 = r10
        L_0x0107:
            r4 = r7
        L_0x0108:
            float r3 = r0.r2
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0117
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r3)
        L_0x0117:
            if (r4 == r6) goto L_0x0140
            if (r13 <= 0) goto L_0x0121
            float r3 = r0.E2
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x012b
        L_0x0121:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x012f
            float r3 = r0.E2
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x012f
        L_0x012b:
            float r12 = r0.E2
            r0.G2 = r7
        L_0x012f:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0139
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0140
        L_0x0139:
            r0.G2 = r7
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L_0x0140:
            int r3 = r23.getChildCount()
            r0.X2 = r7
            long r4 = r23.getNanoTime()
            r0.n3 = r12
            android.view.animation.Interpolator r8 = r0.q2
            if (r8 != 0) goto L_0x0152
            r8 = r12
            goto L_0x0156
        L_0x0152:
            float r8 = r8.getInterpolation(r12)
        L_0x0156:
            android.view.animation.Interpolator r9 = r0.q2
            if (r9 == 0) goto L_0x016e
            float r10 = r0.A2
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r9 = r9.getInterpolation(r10)
            r0.r2 = r9
            android.view.animation.Interpolator r10 = r0.q2
            float r10 = r10.getInterpolation(r12)
            float r9 = r9 - r10
            r0.r2 = r9
        L_0x016e:
            r9 = r7
        L_0x016f:
            if (r9 >= r3) goto L_0x0197
            android.view.View r10 = r0.getChildAt(r9)
            java.util.HashMap<android.view.View, h0.g.b.b.n> r11 = r0.y2
            java.lang.Object r11 = r11.get(r10)
            r17 = r11
            h0.g.b.b.n r17 = (h0.g.b.b.n) r17
            if (r17 == 0) goto L_0x0194
            boolean r11 = r0.X2
            h0.g.a.g.a.d r15 = r0.o3
            r18 = r10
            r19 = r8
            r20 = r4
            r22 = r15
            boolean r10 = r17.c(r18, r19, r20, r22)
            r10 = r10 | r11
            r0.X2 = r10
        L_0x0194:
            int r9 = r9 + 1
            goto L_0x016f
        L_0x0197:
            if (r13 <= 0) goto L_0x019f
            float r3 = r0.E2
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a9
        L_0x019f:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01ab
            float r3 = r0.E2
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01ab
        L_0x01a9:
            r3 = r6
            goto L_0x01ac
        L_0x01ab:
            r3 = r7
        L_0x01ac:
            boolean r4 = r0.X2
            if (r4 != 0) goto L_0x01bb
            boolean r4 = r0.G2
            if (r4 != 0) goto L_0x01bb
            if (r3 == 0) goto L_0x01bb
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r4)
        L_0x01bb:
            boolean r4 = r0.g3
            if (r4 == 0) goto L_0x01c2
            r23.requestLayout()
        L_0x01c2:
            boolean r4 = r0.X2
            r3 = r3 ^ r6
            r3 = r3 | r4
            r0.X2 = r3
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01e6
            int r3 = r0.s2
            r4 = -1
            if (r3 == r4) goto L_0x01e6
            int r4 = r0.t2
            if (r4 == r3) goto L_0x01e6
            r0.t2 = r3
            h0.g.b.b.r r4 = r0.o2
            h0.g.c.c r3 = r4.b(r3)
            r3.a(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x01e6:
            double r3 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0204
            int r3 = r0.t2
            int r4 = r0.u2
            if (r3 == r4) goto L_0x0204
            r0.t2 = r4
            h0.g.b.b.r r3 = r0.o2
            h0.g.c.c r3 = r3.b(r4)
            r3.a(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x0204:
            boolean r3 = r0.X2
            if (r3 != 0) goto L_0x0223
            boolean r3 = r0.G2
            if (r3 == 0) goto L_0x020d
            goto L_0x0223
        L_0x020d:
            if (r13 <= 0) goto L_0x0215
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x021d
        L_0x0215:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0226
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0226
        L_0x021d:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            goto L_0x0226
        L_0x0223:
            r23.invalidate()
        L_0x0226:
            boolean r3 = r0.X2
            if (r3 != 0) goto L_0x0241
            boolean r3 = r0.G2
            if (r3 != 0) goto L_0x0241
            if (r13 <= 0) goto L_0x0236
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x023e
        L_0x0236:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0241
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0241
        L_0x023e:
            r23.C()
        L_0x0241:
            float r1 = r0.C2
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0255
            int r1 = r0.t2
            int r2 = r0.u2
            if (r1 == r2) goto L_0x0250
            goto L_0x0251
        L_0x0250:
            r6 = r7
        L_0x0251:
            r0.t2 = r2
        L_0x0253:
            r7 = r6
            goto L_0x0264
        L_0x0255:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0264
            int r1 = r0.t2
            int r2 = r0.s2
            if (r1 == r2) goto L_0x0260
            goto L_0x0261
        L_0x0260:
            r6 = r7
        L_0x0261:
            r0.t2 = r2
            goto L_0x0253
        L_0x0264:
            boolean r1 = r0.x3
            r1 = r1 | r7
            r0.x3 = r1
            if (r7 == 0) goto L_0x0272
            boolean r1 = r0.p3
            if (r1 != 0) goto L_0x0272
            r23.requestLayout()
        L_0x0272:
            float r1 = r0.C2
            r0.B2 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.w(boolean):void");
    }

    public final void x() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.H2 != null || ((copyOnWriteArrayList = this.a3) != null && !copyOnWriteArrayList.isEmpty())) && this.f3 != this.B2) {
            if (this.e3 != -1) {
                i iVar = this.H2;
                if (iVar != null) {
                    iVar.b(this, this.s2, this.u2);
                }
                CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.a3;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<i> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b(this, this.s2, this.u2);
                    }
                }
            }
            this.e3 = -1;
            float f2 = this.B2;
            this.f3 = f2;
            i iVar2 = this.H2;
            if (iVar2 != null) {
                iVar2.a(this, this.s2, this.u2, f2);
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList3 = this.a3;
            if (copyOnWriteArrayList3 != null) {
                Iterator<i> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.s2, this.u2, this.B2);
                }
            }
        }
    }

    public void y() {
        int i2;
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.H2 != null || ((copyOnWriteArrayList = this.a3) != null && !copyOnWriteArrayList.isEmpty())) && this.e3 == -1) {
            this.e3 = this.t2;
            if (!this.B3.isEmpty()) {
                ArrayList<Integer> arrayList = this.B3;
                i2 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i2 = -1;
            }
            int i4 = this.t2;
            if (!(i2 == i4 || i4 == -1)) {
                this.B3.add(Integer.valueOf(i4));
            }
        }
        D();
        Runnable runnable = this.r3;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void z(int i2, float f2, float f4, float f5, float[] fArr) {
        String str;
        double[] dArr;
        int i4 = i2;
        float f6 = f2;
        HashMap<View, n> hashMap = this.y2;
        View view = this.d.get(i4);
        n nVar = hashMap.get(view);
        if (nVar != null) {
            float a2 = nVar.a(f6, nVar.v);
            h0.g.a.g.a.b[] bVarArr = nVar.i;
            int i5 = 0;
            if (bVarArr != null) {
                double d2 = (double) a2;
                bVarArr[0].e(d2, nVar.p);
                nVar.i[0].c(d2, nVar.o);
                float f7 = nVar.v[0];
                while (true) {
                    dArr = nVar.p;
                    if (i5 >= dArr.length) {
                        break;
                    }
                    dArr[i5] = dArr[i5] * ((double) f7);
                    i5++;
                }
                h0.g.a.g.a.b bVar = nVar.j;
                if (bVar != null) {
                    double[] dArr2 = nVar.o;
                    if (dArr2.length > 0) {
                        bVar.c(d2, dArr2);
                        nVar.j.e(d2, nVar.p);
                        nVar.e.g(f4, f5, fArr, nVar.n, nVar.p, nVar.o);
                    }
                } else {
                    nVar.e.g(f4, f5, fArr, nVar.n, dArr, nVar.o);
                }
            } else {
                q qVar = nVar.f;
                float f8 = qVar.Y1;
                q qVar2 = nVar.e;
                float f9 = f8 - qVar2.Y1;
                float f10 = qVar.Z1 - qVar2.Z1;
                fArr[0] = (((qVar.a2 - qVar2.a2) + f9) * f4) + ((1.0f - f4) * f9);
                fArr[1] = (((qVar.b2 - qVar2.b2) + f10) * f5) + ((1.0f - f5) * f10);
            }
            float y = view.getY();
            this.I2 = f6;
            this.J2 = y;
            return;
        }
        if (view == null) {
            str = i0.d.a.a.a.e0("", i4);
        } else {
            str = view.getContext().getResources().getResourceName(i4);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + str);
    }

    public void setTransition(r.b bVar) {
        long j;
        u uVar;
        r rVar = this.o2;
        rVar.c = bVar;
        if (!(bVar == null || (uVar = bVar.l) == null)) {
            uVar.c(rVar.p);
        }
        setState(TransitionState.SETUP);
        if (this.t2 == this.o2.d()) {
            this.C2 = 1.0f;
            this.B2 = 1.0f;
            this.E2 = 1.0f;
        } else {
            this.C2 = 0.0f;
            this.B2 = 0.0f;
            this.E2 = 0.0f;
        }
        boolean z = true;
        if ((bVar.r & 1) == 0) {
            z = false;
        }
        if (z) {
            j = -1;
        } else {
            j = getNanoTime();
        }
        this.D2 = j;
        int i2 = this.o2.i();
        int d2 = this.o2.d();
        if (i2 != this.s2 || d2 != this.u2) {
            this.s2 = i2;
            this.u2 = d2;
            this.o2.o(i2, d2);
            this.w3.d(this.o2.b(this.s2), this.o2.b(this.u2));
            e eVar = this.w3;
            int i4 = this.s2;
            int i5 = this.u2;
            eVar.e = i4;
            eVar.f = i5;
            eVar.e();
            E();
        }
    }
}
