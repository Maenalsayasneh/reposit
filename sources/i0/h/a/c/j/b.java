package i0.h.a.c.j;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import i0.h.a.c.q.h;
import i0.h.a.c.w.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable */
public class b extends g implements Drawable.Callback, h.b {
    public static final int[] r2 = {16842910};
    public static final ShapeDrawable s2 = new ShapeDrawable(new OvalShape());
    public CharSequence A2;
    public int A3;
    public boolean B2;
    public boolean B3;
    public Drawable C2;
    public ColorStateList D2;
    public float E2;
    public boolean F2;
    public boolean G2;
    public Drawable H2;
    public Drawable I2;
    public ColorStateList J2;
    public float K2;
    public CharSequence L2;
    public boolean M2;
    public boolean N2;
    public Drawable O2;
    public ColorStateList P2;
    public i0.h.a.c.a.g Q2;
    public i0.h.a.c.a.g R2;
    public float S2;
    public float T2;
    public float U2;
    public float V2;
    public float W2;
    public float X2;
    public float Y2;
    public float Z2;
    public final Context a3;
    public final Paint b3 = new Paint(1);
    public final Paint.FontMetrics c3 = new Paint.FontMetrics();
    public final RectF d3 = new RectF();
    public final PointF e3 = new PointF();
    public final Path f3 = new Path();
    public final h g3;
    public int h3;
    public int i3;
    public int j3;
    public int k3;
    public int l3;
    public int m3;
    public boolean n3;
    public int o3;
    public int p3 = 255;
    public ColorFilter q3;
    public PorterDuffColorFilter r3;
    public ColorStateList s3;
    public ColorStateList t2;
    public PorterDuff.Mode t3 = PorterDuff.Mode.SRC_IN;
    public ColorStateList u2;
    public int[] u3;
    public float v2;
    public boolean v3;
    public float w2 = -1.0f;
    public ColorStateList w3;
    public ColorStateList x2;
    public WeakReference<a> x3 = new WeakReference<>((Object) null);
    public float y2;
    public TextUtils.TruncateAt y3;
    public ColorStateList z2;
    public boolean z3;

    /* compiled from: ChipDrawable */
    public interface a {
        void a();
    }

    public b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.q.b = new i0.h.a.c.n.a(context);
        B();
        this.a3 = context;
        h hVar = new h(this);
        this.g3 = hVar;
        this.A2 = "";
        hVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = r2;
        setState(iArr);
        i0(iArr);
        this.z3 = true;
        int[] iArr2 = i0.h.a.c.u.a.a;
        s2.setTint(-1);
    }

    public static boolean L(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean M(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void C(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.H2) {
                if (drawable.isStateful()) {
                    drawable.setState(this.u3);
                }
                drawable.setTintList(this.J2);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.C2;
            if (drawable == drawable2 && this.F2) {
                drawable2.setTintList(this.D2);
            }
        }
    }

    public final void D(Rect rect, RectF rectF) {
        float f;
        rectF.setEmpty();
        if (t0() || s0()) {
            float f2 = this.S2 + this.T2;
            float K = K();
            if (getLayoutDirection() == 0) {
                float f4 = ((float) rect.left) + f2;
                rectF.left = f4;
                rectF.right = f4 + K;
            } else {
                float f5 = ((float) rect.right) - f2;
                rectF.right = f5;
                rectF.left = f5 - K;
            }
            Drawable drawable = this.n3 ? this.O2 : this.C2;
            float f6 = this.E2;
            if (f6 <= 0.0f && drawable != null) {
                f6 = (float) Math.ceil((double) i0.h.a.b.c.m.b.E(this.a3, 24));
                if (((float) drawable.getIntrinsicHeight()) <= f6) {
                    f = (float) drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f6;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    public float E() {
        if (!t0() && !s0()) {
            return 0.0f;
        }
        return K() + this.T2 + this.U2;
    }

    public final void F(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (u0()) {
            float f = this.Z2 + this.Y2;
            if (getLayoutDirection() == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.K2;
            } else {
                float f4 = ((float) rect.left) + f;
                rectF.left = f4;
                rectF.right = f4 + this.K2;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.K2;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public final void G(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (u0()) {
            float f = this.Z2 + this.Y2 + this.K2 + this.X2 + this.W2;
            if (getLayoutDirection() == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public float H() {
        if (u0()) {
            return this.X2 + this.K2 + this.Y2;
        }
        return 0.0f;
    }

    public float I() {
        return this.B3 ? n() : this.w2;
    }

    public Drawable J() {
        Drawable drawable = this.H2;
        if (drawable != null) {
            return g0.a.b.b.a.D0(drawable);
        }
        return null;
    }

    public final float K() {
        Drawable drawable = this.n3 ? this.O2 : this.C2;
        float f = this.E2;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    public void N() {
        a aVar = (a) this.x3.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean O(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z4;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.t2;
        int e = e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.h3) : 0);
        boolean z5 = true;
        if (this.h3 != e) {
            this.h3 = e;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.u2;
        int e2 = e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.i3) : 0);
        if (this.i3 != e2) {
            this.i3 = e2;
            onStateChange = true;
        }
        int a2 = h0.i.c.a.a(e2, e);
        if ((this.j3 != a2) || (this.q.d == null)) {
            this.j3 = a2;
            t(ColorStateList.valueOf(a2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.x2;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.k3) : 0;
        if (this.k3 != colorForState) {
            this.k3 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.w3 == null || !i0.h.a.c.u.a.c(iArr)) ? 0 : this.w3.getColorForState(iArr, this.l3);
        if (this.l3 != colorForState2) {
            this.l3 = colorForState2;
            if (this.v3) {
                onStateChange = true;
            }
        }
        i0.h.a.c.t.b bVar = this.g3.f;
        int colorForState3 = (bVar == null || (colorStateList = bVar.a) == null) ? 0 : colorStateList.getColorForState(iArr, this.m3);
        if (this.m3 != colorForState3) {
            this.m3 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (state[i] == 16842912) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        boolean z6 = z && this.M2;
        if (this.n3 == z6 || this.O2 == null) {
            z4 = false;
        } else {
            float E = E();
            this.n3 = z6;
            if (E != E()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.s3;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.o3) : 0;
        if (this.o3 != colorForState4) {
            this.o3 = colorForState4;
            this.r3 = i0.h.a.b.c.m.b.n0(this, this.s3, this.t3);
        } else {
            z5 = onStateChange;
        }
        if (M(this.C2)) {
            z5 |= this.C2.setState(iArr);
        }
        if (M(this.O2)) {
            z5 |= this.O2.setState(iArr);
        }
        if (M(this.H2)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.H2.setState(iArr3);
        }
        int[] iArr4 = i0.h.a.c.u.a.a;
        if (M(this.I2)) {
            z5 |= this.I2.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            N();
        }
        return z5;
    }

    public void P(boolean z) {
        if (this.M2 != z) {
            this.M2 = z;
            float E = E();
            if (!z && this.n3) {
                this.n3 = false;
            }
            float E3 = E();
            invalidateSelf();
            if (E != E3) {
                N();
            }
        }
    }

    public void Q(Drawable drawable) {
        if (this.O2 != drawable) {
            float E = E();
            this.O2 = drawable;
            float E3 = E();
            v0(this.O2);
            C(this.O2);
            invalidateSelf();
            if (E != E3) {
                N();
            }
        }
    }

    public void R(ColorStateList colorStateList) {
        if (this.P2 != colorStateList) {
            this.P2 = colorStateList;
            if (this.N2 && this.O2 != null && this.M2) {
                this.O2.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void S(boolean z) {
        if (this.N2 != z) {
            boolean s02 = s0();
            this.N2 = z;
            boolean s03 = s0();
            if (s02 != s03) {
                if (s03) {
                    C(this.O2);
                } else {
                    v0(this.O2);
                }
                invalidateSelf();
                N();
            }
        }
    }

    public void T(ColorStateList colorStateList) {
        if (this.u2 != colorStateList) {
            this.u2 = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void U(float f) {
        if (this.w2 != f) {
            this.w2 = f;
            this.q.a = this.q.a.e(f);
            invalidateSelf();
        }
    }

    public void V(float f) {
        if (this.Z2 != f) {
            this.Z2 = f;
            invalidateSelf();
            N();
        }
    }

    public void W(Drawable drawable) {
        Drawable drawable2 = this.C2;
        Drawable drawable3 = null;
        Drawable D0 = drawable2 != null ? g0.a.b.b.a.D0(drawable2) : null;
        if (D0 != drawable) {
            float E = E();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.C2 = drawable3;
            float E3 = E();
            v0(D0);
            if (t0()) {
                C(this.C2);
            }
            invalidateSelf();
            if (E != E3) {
                N();
            }
        }
    }

    public void X(float f) {
        if (this.E2 != f) {
            float E = E();
            this.E2 = f;
            float E3 = E();
            invalidateSelf();
            if (E != E3) {
                N();
            }
        }
    }

    public void Y(ColorStateList colorStateList) {
        this.F2 = true;
        if (this.D2 != colorStateList) {
            this.D2 = colorStateList;
            if (t0()) {
                this.C2.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Z(boolean z) {
        if (this.B2 != z) {
            boolean t02 = t0();
            this.B2 = z;
            boolean t03 = t0();
            if (t02 != t03) {
                if (t03) {
                    C(this.C2);
                } else {
                    v0(this.C2);
                }
                invalidateSelf();
                N();
            }
        }
    }

    public void a() {
        N();
        invalidateSelf();
    }

    public void a0(float f) {
        if (this.v2 != f) {
            this.v2 = f;
            invalidateSelf();
            N();
        }
    }

    public void b0(float f) {
        if (this.S2 != f) {
            this.S2 = f;
            invalidateSelf();
            N();
        }
    }

    public void c0(ColorStateList colorStateList) {
        if (this.x2 != colorStateList) {
            this.x2 = colorStateList;
            if (this.B3) {
                y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d0(float f) {
        if (this.y2 != f) {
            this.y2 = f;
            this.b3.setStrokeWidth(f);
            if (this.B3) {
                this.q.l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i4;
        int i5;
        int i6;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.p3) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i) : 0;
            if (!this.B3) {
                this.b3.setColor(this.h3);
                this.b3.setStyle(Paint.Style.FILL);
                this.d3.set(bounds);
                canvas2.drawRoundRect(this.d3, I(), I(), this.b3);
            }
            if (!this.B3) {
                this.b3.setColor(this.i3);
                this.b3.setStyle(Paint.Style.FILL);
                Paint paint = this.b3;
                ColorFilter colorFilter = this.q3;
                if (colorFilter == null) {
                    colorFilter = this.r3;
                }
                paint.setColorFilter(colorFilter);
                this.d3.set(bounds);
                canvas2.drawRoundRect(this.d3, I(), I(), this.b3);
            }
            if (this.B3) {
                super.draw(canvas);
            }
            if (this.y2 > 0.0f && !this.B3) {
                this.b3.setColor(this.k3);
                this.b3.setStyle(Paint.Style.STROKE);
                if (!this.B3) {
                    Paint paint2 = this.b3;
                    ColorFilter colorFilter2 = this.q3;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.r3;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.d3;
                float f = this.y2 / 2.0f;
                rectF.set(((float) bounds.left) + f, ((float) bounds.top) + f, ((float) bounds.right) - f, ((float) bounds.bottom) - f);
                float f2 = this.w2 - (this.y2 / 2.0f);
                canvas2.drawRoundRect(this.d3, f2, f2, this.b3);
            }
            this.b3.setColor(this.l3);
            this.b3.setStyle(Paint.Style.FILL);
            this.d3.set(bounds);
            if (!this.B3) {
                canvas2.drawRoundRect(this.d3, I(), I(), this.b3);
            } else {
                c(new RectF(bounds), this.f3);
                g(canvas, this.b3, this.f3, this.q.a, j());
            }
            if (t0()) {
                D(bounds, this.d3);
                RectF rectF2 = this.d3;
                float f4 = rectF2.left;
                float f5 = rectF2.top;
                canvas2.translate(f4, f5);
                this.C2.setBounds(0, 0, (int) this.d3.width(), (int) this.d3.height());
                this.C2.draw(canvas2);
                canvas2.translate(-f4, -f5);
            }
            if (s0()) {
                D(bounds, this.d3);
                RectF rectF3 = this.d3;
                float f6 = rectF3.left;
                float f7 = rectF3.top;
                canvas2.translate(f6, f7);
                this.O2.setBounds(0, 0, (int) this.d3.width(), (int) this.d3.height());
                this.O2.draw(canvas2);
                canvas2.translate(-f6, -f7);
            }
            if (!this.z3 || this.A2 == null) {
                i2 = saveLayerAlpha;
                i4 = 0;
                i5 = 255;
            } else {
                PointF pointF = this.e3;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.A2 != null) {
                    float E = E() + this.S2 + this.V2;
                    if (getLayoutDirection() == 0) {
                        pointF.x = ((float) bounds.left) + E;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - E;
                        align = Paint.Align.RIGHT;
                    }
                    this.g3.a.getFontMetrics(this.c3);
                    Paint.FontMetrics fontMetrics = this.c3;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.d3;
                rectF4.setEmpty();
                if (this.A2 != null) {
                    float E3 = E() + this.S2 + this.V2;
                    float H = H() + this.Z2 + this.W2;
                    if (getLayoutDirection() == 0) {
                        rectF4.left = ((float) bounds.left) + E3;
                        rectF4.right = ((float) bounds.right) - H;
                    } else {
                        rectF4.left = ((float) bounds.left) + H;
                        rectF4.right = ((float) bounds.right) - E3;
                    }
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                h hVar = this.g3;
                if (hVar.f != null) {
                    hVar.a.drawableState = getState();
                    h hVar2 = this.g3;
                    hVar2.f.c(this.a3, hVar2.a, hVar2.b);
                }
                this.g3.a.setTextAlign(align);
                boolean z = Math.round(this.g3.a(this.A2.toString())) > Math.round(this.d3.width());
                if (z) {
                    i6 = canvas.save();
                    canvas2.clipRect(this.d3);
                } else {
                    i6 = 0;
                }
                CharSequence charSequence = this.A2;
                if (z && this.y3 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.g3.a, this.d3.width(), this.y3);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.e3;
                i2 = saveLayerAlpha;
                float f8 = pointF2.x;
                i4 = 0;
                float f9 = pointF2.y;
                i5 = 255;
                canvas.drawText(charSequence2, 0, length, f8, f9, this.g3.a);
                if (z) {
                    canvas2.restoreToCount(i6);
                }
            }
            if (u0()) {
                F(bounds, this.d3);
                RectF rectF5 = this.d3;
                float f10 = rectF5.left;
                float f11 = rectF5.top;
                canvas2.translate(f10, f11);
                this.H2.setBounds(i4, i4, (int) this.d3.width(), (int) this.d3.height());
                int[] iArr = i0.h.a.c.u.a.a;
                this.I2.setBounds(this.H2.getBounds());
                this.I2.jumpToCurrentState();
                this.I2.draw(canvas2);
                canvas2.translate(-f10, -f11);
            }
            if (this.p3 < i5) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    public void e0(Drawable drawable) {
        Drawable J = J();
        if (J != drawable) {
            float H = H();
            this.H2 = drawable != null ? drawable.mutate() : null;
            int[] iArr = i0.h.a.c.u.a.a;
            this.I2 = new RippleDrawable(i0.h.a.c.u.a.b(this.z2), this.H2, s2);
            float H3 = H();
            v0(J);
            if (u0()) {
                C(this.H2);
            }
            invalidateSelf();
            if (H != H3) {
                N();
            }
        }
    }

    public void f0(float f) {
        if (this.Y2 != f) {
            this.Y2 = f;
            invalidateSelf();
            if (u0()) {
                N();
            }
        }
    }

    public void g0(float f) {
        if (this.K2 != f) {
            this.K2 = f;
            invalidateSelf();
            if (u0()) {
                N();
            }
        }
    }

    public int getAlpha() {
        return this.p3;
    }

    public ColorFilter getColorFilter() {
        return this.q3;
    }

    public int getIntrinsicHeight() {
        return (int) this.v2;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(H() + this.g3.a(this.A2.toString()) + E() + this.S2 + this.V2 + this.W2 + this.Z2), this.A3);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.B3) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.w2);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.v2, this.w2);
        }
        outline.setAlpha(((float) this.p3) / 255.0f);
    }

    public void h0(float f) {
        if (this.X2 != f) {
            this.X2 = f;
            invalidateSelf();
            if (u0()) {
                N();
            }
        }
    }

    public boolean i0(int[] iArr) {
        if (Arrays.equals(this.u3, iArr)) {
            return false;
        }
        this.u3 = iArr;
        if (u0()) {
            return O(getState(), iArr);
        }
        return false;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.t2
            boolean r0 = L(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.u2
            boolean r0 = L(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.x2
            boolean r0 = L(r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.v3
            if (r0 == 0) goto L_0x0026
            android.content.res.ColorStateList r0 = r3.w3
            boolean r0 = L(r0)
            if (r0 != 0) goto L_0x0064
        L_0x0026:
            i0.h.a.c.q.h r0 = r3.g3
            i0.h.a.c.t.b r0 = r0.f
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.a
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.N2
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.O2
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.M2
            if (r0 == 0) goto L_0x0049
            r0 = r2
            goto L_0x004a
        L_0x0049:
            r0 = r1
        L_0x004a:
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.C2
            boolean r0 = M(r0)
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.O2
            boolean r0 = M(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.s3
            boolean r0 = L(r0)
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.j.b.isStateful():boolean");
    }

    public void j0(ColorStateList colorStateList) {
        if (this.J2 != colorStateList) {
            this.J2 = colorStateList;
            if (u0()) {
                this.H2.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void k0(boolean z) {
        if (this.G2 != z) {
            boolean u02 = u0();
            this.G2 = z;
            boolean u03 = u0();
            if (u02 != u03) {
                if (u03) {
                    C(this.H2);
                } else {
                    v0(this.H2);
                }
                invalidateSelf();
                N();
            }
        }
    }

    public void l0(float f) {
        if (this.U2 != f) {
            float E = E();
            this.U2 = f;
            float E3 = E();
            invalidateSelf();
            if (E != E3) {
                N();
            }
        }
    }

    public void m0(float f) {
        if (this.T2 != f) {
            float E = E();
            this.T2 = f;
            float E3 = E();
            invalidateSelf();
            if (E != E3) {
                N();
            }
        }
    }

    public void n0(ColorStateList colorStateList) {
        if (this.z2 != colorStateList) {
            this.z2 = colorStateList;
            this.w3 = this.v3 ? i0.h.a.c.u.a.b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void o0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.A2, charSequence)) {
            this.A2 = charSequence;
            this.g3.d = true;
            invalidateSelf();
            N();
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (t0()) {
            onLayoutDirectionChanged |= this.C2.setLayoutDirection(i);
        }
        if (s0()) {
            onLayoutDirectionChanged |= this.O2.setLayoutDirection(i);
        }
        if (u0()) {
            onLayoutDirectionChanged |= this.H2.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (t0()) {
            onLevelChange |= this.C2.setLevel(i);
        }
        if (s0()) {
            onLevelChange |= this.O2.setLevel(i);
        }
        if (u0()) {
            onLevelChange |= this.H2.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.B3) {
            super.onStateChange(iArr);
        }
        return O(iArr, this.u3);
    }

    public void p0(float f) {
        if (this.W2 != f) {
            this.W2 = f;
            invalidateSelf();
            N();
        }
    }

    public void q0(float f) {
        if (this.V2 != f) {
            this.V2 = f;
            invalidateSelf();
            N();
        }
    }

    public void r0(boolean z) {
        if (this.v3 != z) {
            this.v3 = z;
            this.w3 = z ? i0.h.a.c.u.a.b(this.z2) : null;
            onStateChange(getState());
        }
    }

    public final boolean s0() {
        return this.N2 && this.O2 != null && this.n3;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.p3 != i) {
            this.p3 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.q3 != colorFilter) {
            this.q3 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.s3 != colorStateList) {
            this.s3 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.t3 != mode) {
            this.t3 = mode;
            this.r3 = i0.h.a.b.c.m.b.n0(this, this.s3, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z4) {
        boolean visible = super.setVisible(z, z4);
        if (t0()) {
            visible |= this.C2.setVisible(z, z4);
        }
        if (s0()) {
            visible |= this.O2.setVisible(z, z4);
        }
        if (u0()) {
            visible |= this.H2.setVisible(z, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final boolean t0() {
        return this.B2 && this.C2 != null;
    }

    public final boolean u0() {
        return this.G2 && this.H2 != null;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }
}
