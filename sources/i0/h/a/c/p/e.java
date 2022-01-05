package i0.h.a.c.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h0.i.i.q;
import i0.h.a.c.w.g;
import i0.h.a.c.w.k;
import i0.h.a.c.w.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FloatingActionButtonImpl */
public class e {
    public static final TimeInterpolator a = i0.h.a.c.a.a.c;
    public static final int[] b = {16842919, 16842910};
    public static final int[] c = {16843623, 16842908, 16842910};
    public static final int[] d = {16842908, 16842910};
    public static final int[] e = {16843623, 16842910};
    public static final int[] f = {16842910};
    public static final int[] g = new int[0];
    public int A;
    public int B = 0;
    public ArrayList<Animator.AnimatorListener> C;
    public ArrayList<Animator.AnimatorListener> D;
    public ArrayList<C0142e> E;
    public final FloatingActionButton F;
    public final i0.h.a.c.v.b G;
    public final Rect H = new Rect();
    public final RectF I = new RectF();
    public final RectF J = new RectF();
    public final Matrix K = new Matrix();
    public ViewTreeObserver.OnPreDrawListener L;
    public k h;
    public i0.h.a.c.w.g i;
    public Drawable j;
    public a k;
    public Drawable l;
    public boolean m;
    public boolean n = true;
    public float o;
    public float p;
    public float q;
    public int r;
    public final i0.h.a.c.q.g s;
    public i0.h.a.c.a.g t;
    public i0.h.a.c.a.g u;
    public Animator v;
    public i0.h.a.c.a.g w;
    public i0.h.a.c.a.g x;
    public float y;
    public float z = 1.0f;

    /* compiled from: FloatingActionButtonImpl */
    public class a extends i0.h.a.c.a.f {
        public a() {
        }

        public Object evaluate(float f, Object obj, Object obj2) {
            e.this.z = f;
            ((Matrix) obj).getValues(this.a);
            ((Matrix) obj2).getValues(this.b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.b;
                float f2 = fArr[i];
                float[] fArr2 = this.a;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.c.setValues(this.b);
            return this.c;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class b extends h {
        public b(e eVar) {
            super((c) null);
        }

        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class c extends h {
        public c() {
            super((c) null);
        }

        public float a() {
            e eVar = e.this;
            return eVar.o + eVar.p;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class d extends h {
        public d() {
            super((c) null);
        }

        public float a() {
            e eVar = e.this;
            return eVar.o + eVar.q;
        }
    }

    /* renamed from: i0.h.a.c.p.e$e  reason: collision with other inner class name */
    /* compiled from: FloatingActionButtonImpl */
    public interface C0142e {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    public interface f {
    }

    /* compiled from: FloatingActionButtonImpl */
    public class g extends h {
        public g() {
            super((c) null);
        }

        public float a() {
            return e.this.o;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;
        public float c;

        public h(c cVar) {
        }

        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            e.this.w((float) ((int) this.c));
            this.a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            if (!this.a) {
                i0.h.a.c.w.g gVar = e.this.i;
                if (gVar == null) {
                    f = 0.0f;
                } else {
                    f = gVar.q.o;
                }
                this.b = f;
                this.c = a();
                this.a = true;
            }
            e eVar = e.this;
            float f2 = this.b;
            eVar.w((float) ((int) ((valueAnimator.getAnimatedFraction() * (this.c - f2)) + f2)));
        }
    }

    public e(FloatingActionButton floatingActionButton, i0.h.a.c.v.b bVar) {
        this.F = floatingActionButton;
        this.G = bVar;
        i0.h.a.c.q.g gVar = new i0.h.a.c.q.g();
        this.s = gVar;
        gVar.a(b, c(new d()));
        gVar.a(c, c(new c()));
        gVar.a(d, c(new c()));
        gVar.a(e, c(new c()));
        gVar.a(f, c(new g()));
        gVar.a(g, c(new b(this)));
        this.y = floatingActionButton.getRotation();
    }

    public final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.F.getDrawable();
        if (drawable != null && this.A != 0) {
            RectF rectF = this.I;
            RectF rectF2 = this.J;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.A;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.A;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    public final AnimatorSet b(i0.h.a.c.a.g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F, View.ALPHA, new float[]{f2});
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F, View.SCALE_X, new float[]{f3});
        gVar.d("scale").a(ofFloat2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            ofFloat2.setEvaluator(new f(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, View.SCALE_Y, new float[]{f3});
        gVar.d("scale").a(ofFloat3);
        if (i2 == 26) {
            ofFloat3.setEvaluator(new f(this));
        }
        arrayList.add(ofFloat3);
        a(f4, this.K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.F, new i0.h.a.c.a.e(), new a(), new Matrix[]{new Matrix(this.K)});
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        i0.h.a.b.c.m.b.g0(animatorSet, arrayList);
        return animatorSet;
    }

    public final ValueAnimator c(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public float d() {
        throw null;
    }

    public void e(Rect rect) {
        int sizeDimension = this.m ? (this.r - this.F.getSizeDimension()) / 2 : 0;
        float d2 = this.n ? d() + this.q : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) d2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (d2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public void f(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        throw null;
    }

    public boolean g() {
        if (this.F.getVisibility() == 0) {
            if (this.B == 1) {
                return true;
            }
            return false;
        } else if (this.B != 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean h() {
        if (this.F.getVisibility() != 0) {
            if (this.B == 2) {
                return true;
            }
            return false;
        } else if (this.B != 1) {
            return true;
        } else {
            return false;
        }
    }

    public void i() {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void k(int[] iArr) {
        throw null;
    }

    public void l(float f2, float f3, float f4) {
        throw null;
    }

    public void m() {
        ArrayList<C0142e> arrayList = this.E;
        if (arrayList != null) {
            Iterator<C0142e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void n() {
        ArrayList<C0142e> arrayList = this.E;
        if (arrayList != null) {
            Iterator<C0142e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void o(float f2) {
        this.z = f2;
        Matrix matrix = this.K;
        a(f2, matrix);
        this.F.setImageMatrix(matrix);
    }

    public void p(ColorStateList colorStateList) {
        throw null;
    }

    public final void q(k kVar) {
        this.h = kVar;
        i0.h.a.c.w.g gVar = this.i;
        if (gVar != null) {
            gVar.q.a = kVar;
            gVar.invalidateSelf();
        }
        Drawable drawable = this.j;
        if (drawable instanceof o) {
            ((o) drawable).setShapeAppearanceModel(kVar);
        }
        a aVar = this.k;
        if (aVar != null) {
            aVar.o = kVar;
            aVar.invalidateSelf();
        }
    }

    public boolean r() {
        throw null;
    }

    public final boolean s() {
        FloatingActionButton floatingActionButton = this.F;
        AtomicInteger atomicInteger = q.a;
        return floatingActionButton.isLaidOut() && !this.F.isInEditMode();
    }

    public final boolean t() {
        return !this.m || this.F.getSizeDimension() >= this.r;
    }

    public void u() {
        throw null;
    }

    public final void v() {
        Rect rect = this.H;
        e(rect);
        g0.a.b.b.a.m(this.l, "Didn't initialize content background");
        if (r()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.l, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.G;
            Objects.requireNonNull(bVar);
            e.super.setBackgroundDrawable(insetDrawable);
        } else {
            i0.h.a.c.v.b bVar2 = this.G;
            Drawable drawable = this.l;
            FloatingActionButton.b bVar3 = (FloatingActionButton.b) bVar2;
            Objects.requireNonNull(bVar3);
            if (drawable != null) {
                e.super.setBackgroundDrawable(drawable);
            }
        }
        i0.h.a.c.v.b bVar4 = this.G;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton.b bVar5 = (FloatingActionButton.b) bVar4;
        FloatingActionButton.this.g2.set(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i6 = floatingActionButton.d2;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public void w(float f2) {
        i0.h.a.c.w.g gVar = this.i;
        if (gVar != null) {
            g.b bVar = gVar.q;
            if (bVar.o != f2) {
                bVar.o = f2;
                gVar.B();
            }
        }
    }
}
