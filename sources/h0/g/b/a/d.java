package h0.g.b.a;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.g.a.g.a.o;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ViewTimeCycle */
public abstract class d extends o {

    /* compiled from: ViewTimeCycle */
    public static class a extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setAlpha(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class b extends d {
        public String k;
        public SparseArray<ConstraintAttribute> l;
        public SparseArray<float[]> m = new SparseArray<>();
        public float[] n;
        public float[] o;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.k = str.split(InstabugDbContract.COMMA_SEP)[1];
            this.l = sparseArray;
        }

        public void b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void c(int i) {
            int size = this.l.size();
            int e = this.l.valueAt(0).e();
            double[] dArr = new double[size];
            int i2 = e + 2;
            this.n = new float[i2];
            this.o = new float[e];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.l.keyAt(i3);
                float[] valueAt = this.m.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.l.valueAt(i3).c(this.n);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.n;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][e] = (double) valueAt[0];
                dArr2[i3][e + 1] = (double) valueAt[1];
            }
            this.a = h0.g.a.g.a.b.a(i, dArr, dArr2);
        }

        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            View view2 = view;
            long j2 = j;
            this.a.d((double) f, this.n);
            float[] fArr = this.n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.i;
            if (Float.isNaN(this.j)) {
                float a = dVar.a(view2, this.k, 0);
                this.j = a;
                if (Float.isNaN(a)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float) ((((((double) j3) * 1.0E-9d) * ((double) f2)) + ((double) this.j)) % 1.0d);
            this.j = f4;
            this.i = j2;
            float a2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.o;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.h;
                float[] fArr3 = this.n;
                this.h = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * a2) + f3;
                i++;
            }
            this.l.valueAt(0).h(view2, this.o);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class c extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setElevation(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* renamed from: h0.g.b.a.d$d  reason: collision with other inner class name */
    /* compiled from: ViewTimeCycle */
    public static class C0033d extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class e extends d {
        public boolean k = false;

        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            View view2 = view;
            if (view2 instanceof MotionLayout) {
                ((MotionLayout) view2).setProgress(d(f, j, view, dVar));
            } else if (this.k) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.k = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, new Object[]{Float.valueOf(d(f, j, view, dVar))});
                    } catch (IllegalAccessException e) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    }
                }
            }
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class f extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setRotation(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class g extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setRotationX(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class h extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setRotationY(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class i extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setScaleX(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class j extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setScaleY(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class k extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setTranslationX(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class l extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setTranslationY(d(f, j, view, dVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class m extends d {
        public boolean e(View view, float f, long j, h0.g.a.g.a.d dVar) {
            view.setTranslationZ(d(f, j, view, dVar));
            return this.h;
        }
    }

    public float d(float f2, long j2, View view, h0.g.a.g.a.d dVar) {
        long j3 = j2;
        View view2 = view;
        h0.g.a.g.a.d dVar2 = dVar;
        this.a.d((double) f2, this.g);
        float[] fArr = this.g;
        boolean z = true;
        float f3 = fArr[1];
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float a2 = dVar2.a(view2, this.f, 0);
            this.j = a2;
            if (Float.isNaN(a2)) {
                this.j = 0.0f;
            }
        }
        int i3 = i2;
        float f4 = (float) ((((((double) (j3 - this.i)) * 1.0E-9d) * ((double) f3)) + ((double) this.j)) % 1.0d);
        this.j = f4;
        String str = this.f;
        if (!dVar2.a.containsKey(view2)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, new float[]{f4});
            dVar2.a.put(view2, hashMap);
        } else {
            HashMap hashMap2 = dVar2.a.get(view2);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f4});
                dVar2.a.put(view2, hashMap2);
            } else {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f4;
                hashMap2.put(str, fArr2);
            }
        }
        this.i = j3;
        float f5 = this.g[0];
        float a3 = (a(this.j) * f5) + this.g[2];
        if (f5 == 0.0f && i3 == 0) {
            z = false;
        }
        this.h = z;
        return a3;
    }

    public abstract boolean e(View view, float f2, long j2, h0.g.a.g.a.d dVar);
}
