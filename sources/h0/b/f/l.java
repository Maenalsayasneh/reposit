package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import h0.b.b.a.a;
import h0.i.i.q;

/* compiled from: AppCompatImageHelper */
public class l {
    public final ImageView a;
    public u0 b;

    public l(ImageView imageView) {
        this.a = imageView;
    }

    public void a() {
        u0 u0Var;
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            int[] iArr = b0.a;
        }
        if (drawable != null && (u0Var = this.b) != null) {
            int[] drawableState = this.a.getDrawableState();
            PorterDuff.Mode mode = j.a;
            ResourceManagerInternal.tintDrawable(drawable, u0Var, drawableState);
        }
    }

    public void b(AttributeSet attributeSet, int i) {
        int l;
        Context context = this.a.getContext();
        int[] iArr = R.styleable.AppCompatImageView;
        w0 q = w0.q(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.a;
        q.o(imageView, imageView.getContext(), iArr, attributeSet, q.b, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (l = q.l(R.styleable.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.a(this.a.getContext(), l)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int[] iArr2 = b0.a;
            }
            int i2 = R.styleable.AppCompatImageView_tint;
            if (q.o(i2)) {
                this.a.setImageTintList(q.c(i2));
            }
            int i3 = R.styleable.AppCompatImageView_tintMode;
            if (q.o(i3)) {
                this.a.setImageTintMode(b0.c(q.j(i3, -1), (PorterDuff.Mode) null));
            }
            q.b.recycle();
        } catch (Throwable th) {
            q.b.recycle();
            throw th;
        }
    }

    public void c(int i) {
        if (i != 0) {
            Drawable a2 = a.a(this.a.getContext(), i);
            if (a2 != null) {
                int[] iArr = b0.a;
            }
            this.a.setImageDrawable(a2);
        } else {
            this.a.setImageDrawable((Drawable) null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new u0();
        }
        u0 u0Var = this.b;
        u0Var.a = colorStateList;
        u0Var.d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new u0();
        }
        u0 u0Var = this.b;
        u0Var.b = mode;
        u0Var.c = true;
        a();
    }
}
