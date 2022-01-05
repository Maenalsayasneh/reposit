package i0.h.a.c.p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i0.h.a.c.v.b;
import i0.h.a.c.w.g;
import i0.h.a.c.w.k;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: FloatingActionButtonImplLollipop */
public class h extends e {

    /* compiled from: FloatingActionButtonImplLollipop */
    public static class a extends g {
        public a(k kVar) {
            super(kVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    public h(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    public float d() {
        return this.F.getElevation();
    }

    public void e(Rect rect) {
        if (FloatingActionButton.this.f2) {
            super.e(rect);
        } else if (!t()) {
            int sizeDimension = (this.r - this.F.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    public void f(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        k kVar = this.h;
        Objects.requireNonNull(kVar);
        a aVar = new a(kVar);
        this.i = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.i.setTintMode(mode);
        }
        this.i.q(this.F.getContext());
        if (i > 0) {
            Context context = this.F.getContext();
            k kVar2 = this.h;
            Objects.requireNonNull(kVar2);
            a aVar2 = new a(kVar2);
            int color = h0.i.b.a.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = h0.i.b.a.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = h0.i.b.a.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = h0.i.b.a.getColor(context, R.color.design_fab_stroke_end_outer_color);
            aVar2.i = color;
            aVar2.j = color2;
            aVar2.k = color3;
            aVar2.l = color4;
            float f = (float) i;
            if (aVar2.h != f) {
                aVar2.h = f;
                aVar2.b.setStrokeWidth(f * 1.3333f);
                aVar2.n = true;
                aVar2.invalidateSelf();
            }
            aVar2.b(colorStateList);
            this.k = aVar2;
            a aVar3 = this.k;
            Objects.requireNonNull(aVar3);
            g gVar = this.i;
            Objects.requireNonNull(gVar);
            drawable = new LayerDrawable(new Drawable[]{aVar3, gVar});
        } else {
            this.k = null;
            drawable = this.i;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(i0.h.a.c.u.a.b(colorStateList2), drawable, (Drawable) null);
        this.j = rippleDrawable;
        this.l = rippleDrawable;
    }

    public void i() {
    }

    public void j() {
        v();
    }

    public void k(int[] iArr) {
    }

    public void l(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(e.b, x(f, f3));
        stateListAnimator.addState(e.c, x(f, f2));
        stateListAnimator.addState(e.d, x(f, f2));
        stateListAnimator.addState(e.e, x(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.F, "elevation", new float[]{f}).setDuration(0));
        if (i <= 24) {
            FloatingActionButton floatingActionButton = this.F;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.F, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(e.a);
        stateListAnimator.addState(e.f, animatorSet);
        stateListAnimator.addState(e.g, x(0.0f, 0.0f));
        this.F.setStateListAnimator(stateListAnimator);
        if (r()) {
            v();
        }
    }

    public void p(ColorStateList colorStateList) {
        Drawable drawable = this.j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(i0.h.a.c.u.a.b(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(i0.h.a.c.u.a.b(colorStateList));
        }
    }

    public boolean r() {
        return FloatingActionButton.this.f2 || !t();
    }

    public void u() {
    }

    public final Animator x(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.F, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.F, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(e.a);
        return animatorSet;
    }
}
