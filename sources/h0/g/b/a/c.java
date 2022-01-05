package h0.g.b.a;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewSpline */
public abstract class c extends h0.g.a.g.a.j {

    /* compiled from: ViewSpline */
    public static class a extends c {
        public void d(View view, float f) {
            view.setAlpha((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class b extends c {
        public SparseArray<ConstraintAttribute> f;
        public float[] g;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(InstabugDbContract.COMMA_SEP)[1];
            this.f = sparseArray;
        }

        public void b(int i, float f2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void c(int i) {
            int size = this.f.size();
            int e = this.f.valueAt(0).e();
            double[] dArr = new double[size];
            this.g = new float[e];
            int[] iArr = new int[2];
            iArr[1] = e;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f.keyAt(i2)) * 0.01d;
                this.f.valueAt(i2).c(this.g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.g;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.a = h0.g.a.g.a.b.a(i, dArr, dArr2);
        }

        public void d(View view, float f2) {
            this.a.d((double) f2, this.g);
            this.f.valueAt(0).h(view, this.g);
        }
    }

    /* renamed from: h0.g.b.a.c$c  reason: collision with other inner class name */
    /* compiled from: ViewSpline */
    public static class C0032c extends c {
        public void d(View view, float f) {
            view.setElevation((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class d extends c {
        public void d(View view, float f) {
        }
    }

    /* compiled from: ViewSpline */
    public static class e extends c {
        public void d(View view, float f) {
            view.setPivotX((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class f extends c {
        public void d(View view, float f) {
            view.setPivotY((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class g extends c {
        public boolean f = false;

        public void d(View view, float f2) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress((float) this.a.b((double) f2, 0));
            } else if (!this.f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf((float) this.a.b((double) f2, 0))});
                    } catch (IllegalAccessException e) {
                        Log.e("ViewSpline", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewSpline", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* compiled from: ViewSpline */
    public static class h extends c {
        public void d(View view, float f) {
            view.setRotation((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class i extends c {
        public void d(View view, float f) {
            view.setRotationX((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class j extends c {
        public void d(View view, float f) {
            view.setRotationY((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class k extends c {
        public void d(View view, float f) {
            view.setScaleX((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class l extends c {
        public void d(View view, float f) {
            view.setScaleY((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class m extends c {
        public void d(View view, float f) {
            view.setTranslationX((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class n extends c {
        public void d(View view, float f) {
            view.setTranslationY((float) this.a.b((double) f, 0));
        }
    }

    /* compiled from: ViewSpline */
    public static class o extends c {
        public void d(View view, float f) {
            view.setTranslationZ((float) this.a.b((double) f, 0));
        }
    }

    public abstract void d(View view, float f2);
}
