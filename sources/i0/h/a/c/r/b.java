package i0.h.a.c.r;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.R;
import i0.h.a.c.q.j;
import i0.h.a.c.r.c;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: BaseProgressIndicator */
public abstract class b<S extends c> extends ProgressBar {
    public static final int c = R.style.Widget_MaterialComponents_ProgressIndicator;
    public final int Y1;
    public a Z1;
    public boolean a2 = false;
    public int b2 = 4;
    public final Runnable c2 = new a();
    public S d;
    public final Runnable d2 = new C0143b();
    public final h0.c0.a.a.b e2 = new c();
    public final h0.c0.a.a.b f2 = new d();
    public int q;
    public boolean x;
    public boolean y;

    /* compiled from: BaseProgressIndicator */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b bVar = b.this;
            if (bVar.Y1 > 0) {
                SystemClock.uptimeMillis();
            }
            bVar.setVisibility(0);
        }
    }

    /* renamed from: i0.h.a.c.r.b$b  reason: collision with other inner class name */
    /* compiled from: BaseProgressIndicator */
    public class C0143b implements Runnable {
        public C0143b() {
        }

        public void run() {
            b bVar = b.this;
            boolean z = false;
            ((l) bVar.getCurrentDrawable()).h(false, false, true);
            if ((bVar.getProgressDrawable() == null || !bVar.getProgressDrawable().isVisible()) && (bVar.getIndeterminateDrawable() == null || !bVar.getIndeterminateDrawable().isVisible())) {
                z = true;
            }
            if (z) {
                bVar.setVisibility(4);
            }
            Objects.requireNonNull(b.this);
        }
    }

    /* compiled from: BaseProgressIndicator */
    public class c extends h0.c0.a.a.b {
        public c() {
        }

        public void a(Drawable drawable) {
            b.this.setIndeterminate(false);
            b.this.c(0, false);
            b bVar = b.this;
            bVar.c(bVar.q, bVar.x);
        }
    }

    /* compiled from: BaseProgressIndicator */
    public class d extends h0.c0.a.a.b {
        public d() {
        }

        public void a(Drawable drawable) {
            b bVar = b.this;
            if (!bVar.a2) {
                bVar.setVisibility(bVar.b2);
            }
        }
    }

    public b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(i0.h.a.c.a0.a.a.a(context, attributeSet, i, c), attributeSet, i);
        Context context2 = getContext();
        this.d = b(context2, attributeSet);
        TypedArray d3 = j.d(context2, attributeSet, R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        d3.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.Y1 = Math.min(d3.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        d3.recycle();
        this.Z1 = new a();
        this.y = true;
    }

    private m<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().e2;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().f2;
        }
    }

    public void a(boolean z) {
        if (this.y) {
            ((l) getCurrentDrawable()).h(d(), false, z);
        }
    }

    public abstract S b(Context context, AttributeSet attributeSet);

    public void c(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.q = i;
            this.x = z;
            this.a2 = true;
            if (!getIndeterminateDrawable().isVisible() || this.Z1.a(getContext().getContentResolver()) == 0.0f) {
                this.e2.a(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().f2.e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (getWindowVisibility() == 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = h0.i.i.q.a
            boolean r0 = r4.isAttachedToWindow()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0033
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L_0x0033
            r0 = r4
        L_0x0011:
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0028
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L_0x0026
        L_0x0024:
            r0 = r1
            goto L_0x002d
        L_0x0026:
            r0 = r2
            goto L_0x002d
        L_0x0028:
            boolean r3 = r0 instanceof android.view.View
            if (r3 != 0) goto L_0x0030
            goto L_0x0024
        L_0x002d:
            if (r0 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0030:
            android.view.View r0 = (android.view.View) r0
            goto L_0x0011
        L_0x0033:
            r1 = r2
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.r.b.d():boolean");
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.d.f;
    }

    public int[] getIndicatorColor() {
        return this.d.c;
    }

    public int getShowAnimationBehavior() {
        return this.d.e;
    }

    public int getTrackColor() {
        return this.d.d;
    }

    public int getTrackCornerRadius() {
        return this.d.b;
    }

    public int getTrackThickness() {
        return this.d.a;
    }

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().f2.d(this.e2);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(this.f2);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().g(this.f2);
        }
        if (d()) {
            if (this.Y1 > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.d2);
        removeCallbacks(this.c2);
        ((l) getCurrentDrawable()).d();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().j(this.f2);
            getIndeterminateDrawable().f2.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().j(this.f2);
        }
        super.onDetachedFromWindow();
    }

    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        m currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.e();
            int d3 = currentDrawingDelegate.d();
            if (e < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = e + getPaddingLeft() + getPaddingRight();
            }
            if (d3 < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = d3 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a(i == 0);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        a(false);
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.Z1 = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().x = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().x = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.d.f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            if (d()) {
                if (z) {
                    throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
                }
            }
            l lVar = (l) getCurrentDrawable();
            if (lVar != null) {
                lVar.d();
            }
            super.setIndeterminate(z);
            l lVar2 = (l) getCurrentDrawable();
            if (lVar2 != null) {
                lVar2.h(d(), false, false);
            }
            this.a2 = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof o) {
            ((l) drawable).d();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{i0.h.a.b.c.m.b.K(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.d.c = iArr;
            getIndeterminateDrawable().f2.c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            c(i, false);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof i) {
            i iVar = (i) drawable;
            iVar.d();
            super.setProgressDrawable(iVar);
            iVar.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.d.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.d;
        if (s.d != i) {
            s.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.d;
        if (s.b != i) {
            s.b = Math.min(i, s.a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.d;
        if (s.a != i) {
            s.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.b2 = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public o<S> getIndeterminateDrawable() {
        return (o) super.getIndeterminateDrawable();
    }

    public i<S> getProgressDrawable() {
        return (i) super.getProgressDrawable();
    }
}
