package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatBackgroundHelper */
public class e {
    public final View a;
    public final j b;
    public int c = -1;
    public u0 d;
    public u0 e;
    public u0 f;

    public e(View view) {
        this.a = view;
        this.b = j.a();
    }

    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new u0();
                }
                u0 u0Var = this.f;
                u0Var.a = null;
                u0Var.d = false;
                u0Var.b = null;
                u0Var.c = false;
                View view = this.a;
                AtomicInteger atomicInteger = q.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    u0Var.d = true;
                    u0Var.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = this.a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    u0Var.c = true;
                    u0Var.b = backgroundTintMode;
                }
                if (u0Var.d || u0Var.c) {
                    int[] drawableState = this.a.getDrawableState();
                    PorterDuff.Mode mode = j.a;
                    ResourceManagerInternal.tintDrawable(background, u0Var, drawableState);
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            u0 u0Var2 = this.e;
            if (u0Var2 != null) {
                int[] drawableState2 = this.a.getDrawableState();
                PorterDuff.Mode mode2 = j.a;
                ResourceManagerInternal.tintDrawable(background, u0Var2, drawableState2);
                return;
            }
            u0 u0Var3 = this.d;
            if (u0Var3 != null) {
                int[] drawableState3 = this.a.getDrawableState();
                PorterDuff.Mode mode3 = j.a;
                ResourceManagerInternal.tintDrawable(background, u0Var3, drawableState3);
            }
        }
    }

    public ColorStateList b() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = R.styleable.ViewBackgroundHelper;
        w0 q = w0.q(context, attributeSet, iArr, i, 0);
        View view = this.a;
        q.o(view, view.getContext(), iArr, attributeSet, q.b, i, 0);
        try {
            int i2 = R.styleable.ViewBackgroundHelper_android_background;
            if (q.o(i2)) {
                this.c = q.l(i2, -1);
                ColorStateList d2 = this.b.d(this.a.getContext(), this.c);
                if (d2 != null) {
                    g(d2);
                }
            }
            int i3 = R.styleable.ViewBackgroundHelper_backgroundTint;
            if (q.o(i3)) {
                this.a.setBackgroundTintList(q.c(i3));
            }
            int i4 = R.styleable.ViewBackgroundHelper_backgroundTintMode;
            if (q.o(i4)) {
                this.a.setBackgroundTintMode(b0.c(q.j(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            q.b.recycle();
        }
    }

    public void e() {
        this.c = -1;
        g((ColorStateList) null);
        a();
    }

    public void f(int i) {
        this.c = i;
        j jVar = this.b;
        g(jVar != null ? jVar.d(this.a.getContext(), i) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new u0();
            }
            u0 u0Var = this.d;
            u0Var.a = colorStateList;
            u0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new u0();
        }
        u0 u0Var = this.e;
        u0Var.a = colorStateList;
        u0Var.d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new u0();
        }
        u0 u0Var = this.e;
        u0Var.b = mode;
        u0Var.c = true;
        a();
    }
}
