package h0.b.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import h0.b.e.a;

/* compiled from: ActionBar */
public abstract class a {

    /* compiled from: ActionBar */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* compiled from: ActionBar */
    public static abstract class c {
        public abstract void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public abstract void f();

    public boolean g() {
        return false;
    }

    public abstract void h(Configuration configuration);

    public void i() {
    }

    public abstract boolean j(int i, KeyEvent keyEvent);

    public boolean k(KeyEvent keyEvent) {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract void m(Drawable drawable);

    public abstract void n(View view, C0015a aVar);

    public abstract void o(boolean z);

    public abstract void p(boolean z);

    public abstract void q(boolean z);

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(int i);

    public abstract void u(CharSequence charSequence);

    public abstract void v(CharSequence charSequence);

    public abstract void w();

    public h0.b.e.a x(a.C0017a aVar) {
        return null;
    }

    /* renamed from: h0.b.a.a$a  reason: collision with other inner class name */
    /* compiled from: ActionBar */
    public static class C0015a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0015a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBarLayout);
            this.a = obtainStyledAttributes.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0015a(int i, int i2) {
            super(i, i2);
            this.a = 0;
            this.a = 8388627;
        }

        public C0015a(int i, int i2, int i3) {
            super(i, i2);
            this.a = 0;
            this.a = i3;
        }

        public C0015a(C0015a aVar) {
            super(aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public C0015a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
