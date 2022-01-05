package h0.g.b.a;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewOscillator */
public abstract class b extends h0.g.a.g.a.e {

    /* compiled from: ViewOscillator */
    public static class a extends b {
        public void d(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* renamed from: h0.g.b.a.b$b  reason: collision with other inner class name */
    /* compiled from: ViewOscillator */
    public static class C0031b extends b {
        public float[] g = new float[1];
        public ConstraintAttribute h;

        public void b(Object obj) {
            this.h = (ConstraintAttribute) obj;
        }

        public void d(View view, float f) {
            this.g[0] = a(f);
            this.h.h(view, this.g);
        }
    }

    /* compiled from: ViewOscillator */
    public static class c extends b {
        public void d(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* compiled from: ViewOscillator */
    public static class d extends b {
        public void d(View view, float f) {
        }
    }

    /* compiled from: ViewOscillator */
    public static class e extends b {
        public boolean g = false;

        public void d(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
            } else if (!this.g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e("ViewOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* compiled from: ViewOscillator */
    public static class f extends b {
        public void d(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewOscillator */
    public static class g extends b {
        public void d(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewOscillator */
    public static class h extends b {
        public void d(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewOscillator */
    public static class i extends b {
        public void d(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewOscillator */
    public static class j extends b {
        public void d(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewOscillator */
    public static class k extends b {
        public void d(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewOscillator */
    public static class l extends b {
        public void d(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewOscillator */
    public static class m extends b {
        public void d(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public abstract void d(View view, float f2);
}
