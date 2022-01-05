package i0.h.a.c.p;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import i0.h.a.c.w.k;
import i0.h.a.c.w.l;

/* compiled from: BorderDrawable */
public class a extends Drawable {
    public final l a = l.a.a;
    public final Paint b;
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final b g = new b((C0141a) null);
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n = true;
    public k o;
    public ColorStateList p;

    /* compiled from: BorderDrawable */
    public class b extends Drawable.ConstantState {
        public b(C0141a aVar) {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a(k kVar) {
        this.o = kVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public RectF a() {
        this.f.set(getBounds());
        return this.f;
    }

    public void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.m = colorStateList.getColorForState(getState(), this.m);
        }
        this.p = colorStateList;
        this.n = true;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (this.n) {
            Paint paint = this.b;
            Rect rect = this.d;
            copyBounds(rect);
            float height = this.h / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{h0.i.c.a.a(this.i, this.m), h0.i.c.a.a(this.j, this.m), h0.i.c.a.a(h0.i.c.a.c(this.j, 0), this.m), h0.i.c.a.a(h0.i.c.a.c(this.l, 0), this.m), h0.i.c.a.a(this.l, this.m), h0.i.c.a.a(this.k, this.m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        copyBounds(this.d);
        this.e.set(this.d);
        float min = Math.min(this.o.f.a(a()), this.e.width() / 2.0f);
        if (this.o.d(a())) {
            this.e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.e, min, min, this.b);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.g;
    }

    public int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.o.d(a())) {
            outline.setRoundRect(getBounds(), this.o.f.a(a()));
            return;
        }
        copyBounds(this.d);
        this.e.set(this.d);
        this.a.a(this.o, 1.0f, this.e, (l.b) null, this.c);
        if (this.c.isConvex()) {
            outline.setConvexPath(this.c);
        }
    }

    public boolean getPadding(Rect rect) {
        if (!this.o.d(a())) {
            return true;
        }
        int round = Math.round(this.h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        this.n = true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.m)) == this.m)) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
