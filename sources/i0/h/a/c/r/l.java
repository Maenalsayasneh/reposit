package i0.h.a.c.r;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import h0.c0.a.a.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DrawableWithAnimatedVisibilityChange */
public abstract class l extends Drawable implements Animatable {
    public static final Property<l, Float> c = new a(Float.class, "growFraction");
    public ValueAnimator Y1;
    public List<b> Z1;
    public boolean a2;
    public float b2;
    public final Paint c2 = new Paint();
    public final Context d;
    public int d2;
    public final c q;
    public a x;
    public ValueAnimator y;

    /* compiled from: DrawableWithAnimatedVisibilityChange */
    public static class a extends Property<l, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((l) obj).c());
        }

        public void set(Object obj, Object obj2) {
            l lVar = (l) obj;
            float floatValue = ((Float) obj2).floatValue();
            if (lVar.b2 != floatValue) {
                lVar.b2 = floatValue;
                lVar.invalidateSelf();
            }
        }
    }

    public l(Context context, c cVar) {
        this.d = context;
        this.q = cVar;
        this.x = new a();
        this.d2 = 255;
        invalidateSelf();
    }

    public final void b(ValueAnimator... valueAnimatorArr) {
        boolean z = this.a2;
        this.a2 = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.a2 = z;
    }

    public float c() {
        c cVar = this.q;
        boolean z = true;
        if (!(cVar.e != 0)) {
            if (cVar.f == 0) {
                z = false;
            }
            if (!z) {
                return 1.0f;
            }
        }
        return this.b2;
    }

    public boolean d() {
        return h(false, false, false);
    }

    public boolean e() {
        ValueAnimator valueAnimator = this.Y1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean f() {
        ValueAnimator valueAnimator = this.y;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public void g(b bVar) {
        if (this.Z1 == null) {
            this.Z1 = new ArrayList();
        }
        if (!this.Z1.contains(bVar)) {
            this.Z1.add(bVar);
        }
    }

    public int getAlpha() {
        return this.d2;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean h(boolean z, boolean z2, boolean z3) {
        return i(z, z2, z3 && this.x.a(this.d.getContentResolver()) > 0.0f);
    }

    public boolean i(boolean z, boolean z2, boolean z3) {
        if (this.y == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c, new float[]{0.0f, 1.0f});
            this.y = ofFloat;
            ofFloat.setDuration(500);
            this.y.setInterpolator(i0.h.a.c.a.a.b);
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.y = valueAnimator;
                valueAnimator.addListener(new j(this));
            } else {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
        }
        if (this.Y1 == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, c, new float[]{1.0f, 0.0f});
            this.Y1 = ofFloat2;
            ofFloat2.setDuration(500);
            this.Y1.setInterpolator(i0.h.a.c.a.a.b);
            ValueAnimator valueAnimator2 = this.Y1;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                this.Y1 = valueAnimator2;
                valueAnimator2.addListener(new k(this));
            } else {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator3 = z ? this.y : this.Y1;
        if (!z3) {
            if (valueAnimator3.isRunning()) {
                valueAnimator3.end();
            } else {
                b(valueAnimator3);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator3.isRunning()) {
            return false;
        } else {
            boolean z4 = !z || super.setVisible(z, false);
            if (!(!z ? this.q.f != 0 : this.q.e != 0)) {
                b(valueAnimator3);
                return z4;
            }
            if (z2 || !valueAnimator3.isPaused()) {
                valueAnimator3.start();
            } else {
                valueAnimator3.resume();
            }
            return z4;
        }
    }

    public boolean isRunning() {
        return f() || e();
    }

    public boolean j(b bVar) {
        List<b> list = this.Z1;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.Z1.remove(bVar);
        if (!this.Z1.isEmpty()) {
            return true;
        }
        this.Z1 = null;
        return true;
    }

    public void setAlpha(int i) {
        this.d2 = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.c2.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return h(z, z2, true);
    }

    public void start() {
        i(true, true, false);
    }

    public void stop() {
        i(false, true, false);
    }
}
