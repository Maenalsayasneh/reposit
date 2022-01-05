package i0.h.a.c.i;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.google.android.material.R;
import com.google.android.material.card.MaterialCardView;
import i0.h.a.c.w.d;
import i0.h.a.c.w.e;
import i0.h.a.c.w.g;
import i0.h.a.c.w.j;
import i0.h.a.c.w.k;
import java.util.Objects;

/* compiled from: MaterialCardViewHelper */
public class a {
    public static final int[] a = {16842912};
    public static final double b = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView c;
    public final Rect d = new Rect();
    public final g e;
    public final g f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public k n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public g r;
    public g s;
    public boolean t = false;
    public boolean u;

    /* renamed from: i0.h.a.c.i.a$a  reason: collision with other inner class name */
    /* compiled from: MaterialCardViewHelper */
    public class C0139a extends InsetDrawable {
        public C0139a(a aVar, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i2, int i3) {
        this.c = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i2, i3);
        this.e = gVar;
        gVar.q(materialCardView.getContext());
        gVar.v(-12303292);
        k kVar = gVar.q.a;
        Objects.requireNonNull(kVar);
        k.b bVar = new k.b(kVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i2, R.style.CardView);
        int i4 = R.styleable.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i4)) {
            bVar.c(obtainStyledAttributes.getDimension(i4, 0.0f));
        }
        this.f = new g();
        h(bVar.a());
        obtainStyledAttributes.recycle();
    }

    public final float a() {
        return Math.max(Math.max(b(this.n.b, this.e.n()), b(this.n.c, this.e.o())), Math.max(b(this.n.d, this.e.i()), b(this.n.e, this.e.h())));
    }

    public final float b(d dVar, float f2) {
        if (dVar instanceof j) {
            return (float) ((1.0d - b) * ((double) f2));
        }
        if (dVar instanceof e) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    public final float c() {
        return this.c.getMaxCardElevation() + (j() ? a() : 0.0f);
    }

    public final float d() {
        return (this.c.getMaxCardElevation() * 1.5f) + (j() ? a() : 0.0f);
    }

    public final Drawable e() {
        if (this.p == null) {
            int[] iArr = i0.h.a.c.u.a.a;
            this.s = new g(this.n);
            this.p = new RippleDrawable(this.l, (Drawable) null, this.s);
        }
        if (this.q == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = this.k;
            if (drawable != null) {
                stateListDrawable.addState(a, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.f, stateListDrawable});
            this.q = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.q;
    }

    public final Drawable f(Drawable drawable) {
        int i2;
        int i3;
        if (this.c.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) d());
            i3 = (int) Math.ceil((double) c());
            i2 = ceil;
        } else {
            i3 = 0;
            i2 = 0;
        }
        return new C0139a(this, drawable, i3, i2, i3, i2);
    }

    public void g(Drawable drawable) {
        this.k = drawable;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.k = mutate;
            mutate.setTintList(this.m);
        }
        if (this.q != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.k;
            if (drawable2 != null) {
                stateListDrawable.addState(a, drawable2);
            }
            this.q.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, stateListDrawable);
        }
    }

    public void h(k kVar) {
        this.n = kVar;
        g gVar = this.e;
        gVar.q.a = kVar;
        gVar.invalidateSelf();
        g gVar2 = this.e;
        gVar2.q2 = !gVar2.r();
        g gVar3 = this.f;
        if (gVar3 != null) {
            gVar3.q.a = kVar;
            gVar3.invalidateSelf();
        }
        g gVar4 = this.s;
        if (gVar4 != null) {
            gVar4.q.a = kVar;
            gVar4.invalidateSelf();
        }
        g gVar5 = this.r;
        if (gVar5 != null) {
            gVar5.q.a = kVar;
            gVar5.invalidateSelf();
        }
    }

    public final boolean i() {
        return this.c.getPreventCornerOverlap() && !this.e.r();
    }

    public final boolean j() {
        return this.c.getPreventCornerOverlap() && this.e.r() && this.c.getUseCompatPadding();
    }

    public void k() {
        float f2 = 0.0f;
        float a2 = i() || j() ? a() : 0.0f;
        if (this.c.getPreventCornerOverlap() && this.c.getUseCompatPadding()) {
            f2 = (float) ((1.0d - b) * ((double) this.c.getCardViewRadius()));
        }
        int i2 = (int) (a2 - f2);
        MaterialCardView materialCardView = this.c;
        Rect rect = this.d;
        materialCardView.Z1.set(rect.left + i2, rect.top + i2, rect.right + i2, rect.bottom + i2);
        ((h0.e.a.a) CardView.d).c(materialCardView.b2);
    }

    public void l() {
        if (!this.t) {
            this.c.setBackgroundInternal(f(this.e));
        }
        this.c.setForeground(f(this.j));
    }

    public final void m() {
        int[] iArr = i0.h.a.c.u.a.a;
        Drawable drawable = this.p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.l);
            return;
        }
        g gVar = this.r;
        if (gVar != null) {
            gVar.t(this.l);
        }
    }

    public void n() {
        this.f.x((float) this.i, this.o);
    }
}
