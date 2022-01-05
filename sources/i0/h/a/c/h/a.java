package i0.h.a.c.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import h0.i.i.q;
import i0.h.a.b.c.m.b;
import i0.h.a.c.w.g;
import i0.h.a.c.w.k;
import i0.h.a.c.w.o;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MaterialButtonHelper */
public class a {
    public final MaterialButton a;
    public k b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;
    public int s;

    public a(MaterialButton materialButton, k kVar) {
        this.a = materialButton;
        this.b = kVar;
    }

    public o a() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (o) this.r.getDrawable(2);
        }
        return (o) this.r.getDrawable(1);
    }

    public g b() {
        return c(false);
    }

    public final g c(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public final g d() {
        return c(true);
    }

    public void e(k kVar) {
        this.b = kVar;
        if (b() != null) {
            g b2 = b();
            b2.q.a = kVar;
            b2.invalidateSelf();
        }
        if (d() != null) {
            g d2 = d();
            d2.q.a = kVar;
            d2.invalidateSelf();
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void f(int i2, int i3) {
        MaterialButton materialButton = this.a;
        AtomicInteger atomicInteger = q.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = this.a.getPaddingTop();
        int paddingEnd = this.a.getPaddingEnd();
        int paddingBottom = this.a.getPaddingBottom();
        int i4 = this.e;
        int i5 = this.f;
        this.f = i3;
        this.e = i2;
        if (!this.o) {
            g();
        }
        this.a.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public final void g() {
        MaterialButton materialButton = this.a;
        g gVar = new g(this.b);
        gVar.q(this.a.getContext());
        gVar.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        gVar.x((float) this.h, this.k);
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        gVar2.w((float) this.h, this.n ? b.L(this.a, R.attr.colorSurface) : 0);
        g gVar3 = new g(this.b);
        this.m = gVar3;
        gVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(i0.h.a.c.u.a.b(this.l), new InsetDrawable(new LayerDrawable(new Drawable[]{gVar2, gVar}), this.c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b();
        if (b2 != null) {
            b2.s((float) this.s);
        }
    }

    public final void h() {
        g b2 = b();
        g d2 = d();
        if (b2 != null) {
            b2.x((float) this.h, this.k);
            if (d2 != null) {
                d2.w((float) this.h, this.n ? b.L(this.a, R.attr.colorSurface) : 0);
            }
        }
    }
}
