package i0.h.a.c.w;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import i0.h.a.c.w.l;
import i0.h.a.c.w.n;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: MaterialShapeDrawable */
public class g extends Drawable implements o {
    public static final String c = g.class.getSimpleName();
    public static final Paint d = new Paint(1);
    public final BitSet Y1;
    public boolean Z1;
    public final Matrix a2;
    public final Path b2;
    public final Path c2;
    public final RectF d2;
    public final RectF e2;
    public final Region f2;
    public final Region g2;
    public k h2;
    public final Paint i2;
    public final Paint j2;
    public final i0.h.a.c.v.a k2;
    public final l.b l2;
    public final l m2;
    public PorterDuffColorFilter n2;
    public PorterDuffColorFilter o2;
    public final RectF p2;
    public b q;
    public boolean q2;
    public final n.f[] x;
    public final n.f[] y;

    /* compiled from: MaterialShapeDrawable */
    public class a implements l.b {
        public a() {
        }
    }

    public g() {
        this(new k());
    }

    public final boolean A() {
        PorterDuffColorFilter porterDuffColorFilter = this.n2;
        PorterDuffColorFilter porterDuffColorFilter2 = this.o2;
        b bVar = this.q;
        this.n2 = d(bVar.g, bVar.h, this.i2, true);
        b bVar2 = this.q;
        this.o2 = d(bVar2.f, bVar2.h, this.j2, false);
        b bVar3 = this.q;
        if (bVar3.u) {
            this.k2.a(bVar3.g.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.n2) || !Objects.equals(porterDuffColorFilter2, this.o2)) {
            return true;
        }
        return false;
    }

    public final void B() {
        b bVar = this.q;
        float f = bVar.o + bVar.p;
        bVar.r = (int) Math.ceil((double) (0.75f * f));
        this.q.s = (int) Math.ceil((double) (f * 0.25f));
        A();
        super.invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.q.j != 1.0f) {
            this.a2.reset();
            Matrix matrix = this.a2;
            float f = this.q.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.a2);
        }
        path.computeBounds(this.p2, true);
    }

    public final void c(RectF rectF, Path path) {
        l lVar = this.m2;
        b bVar = this.q;
        k kVar = bVar.a;
        float f = bVar.k;
        lVar.a(kVar, f, rectF, this.l2, path);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
        r3 = e(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter d(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.e(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.e(r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.w.g.d(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e9, code lost:
        if ((!r() && !r12.b2.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            android.graphics.Paint r0 = r12.i2
            android.graphics.PorterDuffColorFilter r1 = r12.n2
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r12.i2
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r12.i2
            i0.h.a.c.w.g$b r2 = r12.q
            int r2 = r2.m
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r12.j2
            android.graphics.PorterDuffColorFilter r2 = r12.o2
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r12.j2
            i0.h.a.c.w.g$b r2 = r12.q
            float r2 = r2.l
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r12.j2
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r12.j2
            i0.h.a.c.w.g$b r3 = r12.q
            int r3 = r3.m
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r12.Z1
            r3 = 0
            if (r2 == 0) goto L_0x00c4
            float r2 = r12.m()
            float r2 = -r2
            i0.h.a.c.w.g$b r4 = r12.q
            i0.h.a.c.w.k r4 = r4.a
            java.util.Objects.requireNonNull(r4)
            i0.h.a.c.w.k$b r5 = new i0.h.a.c.w.k$b
            r5.<init>(r4)
            i0.h.a.c.w.c r6 = r4.f
            boolean r7 = r6 instanceof i0.h.a.c.w.i
            if (r7 == 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            i0.h.a.c.w.b r7 = new i0.h.a.c.w.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0064:
            r5.e = r6
            i0.h.a.c.w.c r6 = r4.g
            boolean r7 = r6 instanceof i0.h.a.c.w.i
            if (r7 == 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            i0.h.a.c.w.b r7 = new i0.h.a.c.w.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0073:
            r5.f = r6
            i0.h.a.c.w.c r6 = r4.i
            boolean r7 = r6 instanceof i0.h.a.c.w.i
            if (r7 == 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            i0.h.a.c.w.b r7 = new i0.h.a.c.w.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0082:
            r5.h = r6
            i0.h.a.c.w.c r4 = r4.h
            boolean r6 = r4 instanceof i0.h.a.c.w.i
            if (r6 == 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            i0.h.a.c.w.b r6 = new i0.h.a.c.w.b
            r6.<init>(r2, r4)
            r4 = r6
        L_0x0091:
            r5.g = r4
            i0.h.a.c.w.k r7 = r5.a()
            r12.h2 = r7
            i0.h.a.c.w.l r6 = r12.m2
            i0.h.a.c.w.g$b r2 = r12.q
            float r8 = r2.k
            android.graphics.RectF r2 = r12.e2
            android.graphics.RectF r4 = r12.j()
            r2.set(r4)
            float r2 = r12.m()
            android.graphics.RectF r4 = r12.e2
            r4.inset(r2, r2)
            android.graphics.RectF r9 = r12.e2
            android.graphics.Path r11 = r12.c2
            r10 = 0
            r6.a(r7, r8, r9, r10, r11)
            android.graphics.RectF r2 = r12.j()
            android.graphics.Path r4 = r12.b2
            r12.b(r2, r4)
            r12.Z1 = r3
        L_0x00c4:
            i0.h.a.c.w.g$b r2 = r12.q
            int r4 = r2.q
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L_0x00ed
            int r2 = r2.r
            if (r2 <= 0) goto L_0x00ed
            if (r4 == r5) goto L_0x00eb
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r4 = r12.r()
            if (r4 != 0) goto L_0x00e8
            android.graphics.Path r4 = r12.b2
            boolean r4 = r4.isConvex()
            if (r4 != 0) goto L_0x00e8
            r4 = 29
            if (r2 >= r4) goto L_0x00e8
            r2 = r6
            goto L_0x00e9
        L_0x00e8:
            r2 = r3
        L_0x00e9:
            if (r2 == 0) goto L_0x00ed
        L_0x00eb:
            r2 = r6
            goto L_0x00ee
        L_0x00ed:
            r2 = r3
        L_0x00ee:
            if (r2 != 0) goto L_0x00f2
            goto L_0x0186
        L_0x00f2:
            r13.save()
            int r2 = r12.k()
            int r4 = r12.l()
            float r2 = (float) r2
            float r4 = (float) r4
            r13.translate(r2, r4)
            boolean r2 = r12.q2
            if (r2 != 0) goto L_0x010d
            r12.f(r13)
            r13.restore()
            goto L_0x0186
        L_0x010d:
            android.graphics.RectF r2 = r12.p2
            float r2 = r2.width()
            android.graphics.Rect r4 = r12.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            float r2 = r2 - r4
            int r2 = (int) r2
            android.graphics.RectF r4 = r12.p2
            float r4 = r4.height()
            android.graphics.Rect r7 = r12.getBounds()
            int r7 = r7.height()
            float r7 = (float) r7
            float r4 = r4 - r7
            int r4 = (int) r4
            if (r2 < 0) goto L_0x01d4
            if (r4 < 0) goto L_0x01d4
            android.graphics.RectF r7 = r12.p2
            float r7 = r7.width()
            int r7 = (int) r7
            i0.h.a.c.w.g$b r8 = r12.q
            int r8 = r8.r
            int r8 = r8 * r5
            int r8 = r8 + r7
            int r8 = r8 + r2
            android.graphics.RectF r7 = r12.p2
            float r7 = r7.height()
            int r7 = (int) r7
            i0.h.a.c.w.g$b r9 = r12.q
            int r9 = r9.r
            int r9 = r9 * r5
            int r9 = r9 + r7
            int r9 = r9 + r4
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r9, r5)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r5)
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.left
            i0.h.a.c.w.g$b r9 = r12.q
            int r9 = r9.r
            int r8 = r8 - r9
            int r8 = r8 - r2
            float r2 = (float) r8
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.top
            i0.h.a.c.w.g$b r9 = r12.q
            int r9 = r9.r
            int r8 = r8 - r9
            int r8 = r8 - r4
            float r4 = (float) r8
            float r8 = -r2
            float r9 = -r4
            r7.translate(r8, r9)
            r12.f(r7)
            r7 = 0
            r13.drawBitmap(r5, r2, r4, r7)
            r5.recycle()
            r13.restore()
        L_0x0186:
            i0.h.a.c.w.g$b r2 = r12.q
            android.graphics.Paint$Style r4 = r2.v
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r4 == r5) goto L_0x0192
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            if (r4 != r5) goto L_0x0193
        L_0x0192:
            r3 = r6
        L_0x0193:
            if (r3 == 0) goto L_0x01a4
            android.graphics.Paint r6 = r12.i2
            android.graphics.Path r7 = r12.b2
            i0.h.a.c.w.k r8 = r2.a
            android.graphics.RectF r9 = r12.j()
            r4 = r12
            r5 = r13
            r4.g(r5, r6, r7, r8, r9)
        L_0x01a4:
            boolean r2 = r12.p()
            if (r2 == 0) goto L_0x01c9
            android.graphics.Paint r5 = r12.j2
            android.graphics.Path r6 = r12.c2
            i0.h.a.c.w.k r7 = r12.h2
            android.graphics.RectF r2 = r12.e2
            android.graphics.RectF r3 = r12.j()
            r2.set(r3)
            float r2 = r12.m()
            android.graphics.RectF r3 = r12.e2
            r3.inset(r2, r2)
            android.graphics.RectF r8 = r12.e2
            r3 = r12
            r4 = r13
            r3.g(r4, r5, r6, r7, r8)
        L_0x01c9:
            android.graphics.Paint r13 = r12.i2
            r13.setAlpha(r0)
            android.graphics.Paint r13 = r12.j2
            r13.setAlpha(r1)
            return
        L_0x01d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.w.g.draw(android.graphics.Canvas):void");
    }

    public int e(int i) {
        b bVar = this.q;
        float f = bVar.o + bVar.p + bVar.n;
        i0.h.a.c.n.a aVar = bVar.b;
        return aVar != null ? aVar.a(i, f) : i;
    }

    public final void f(Canvas canvas) {
        if (this.Y1.cardinality() > 0) {
            Log.w(c, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.q.s != 0) {
            canvas.drawPath(this.b2, this.k2.e);
        }
        for (int i = 0; i < 4; i++) {
            n.f fVar = this.x[i];
            i0.h.a.c.v.a aVar = this.k2;
            int i3 = this.q.r;
            Matrix matrix = n.f.a;
            fVar.a(matrix, aVar, i3, canvas);
            this.y[i].a(matrix, this.k2, this.q.r, canvas);
        }
        if (this.q2) {
            int k = k();
            int l = l();
            canvas.translate((float) (-k), (float) (-l));
            canvas.drawPath(this.b2, d);
            canvas.translate((float) k, (float) l);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a3 = kVar.g.a(rectF) * this.q.k;
            canvas.drawRoundRect(rectF, a3, a3, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public Drawable.ConstantState getConstantState() {
        return this.q;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.q.q != 2) {
            if (r()) {
                outline.setRoundRect(getBounds(), n() * this.q.k);
                return;
            }
            b(j(), this.b2);
            if (this.b2.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.b2);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.q.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f2.set(getBounds());
        b(j(), this.b2);
        this.g2.setPath(this.b2, this.f2);
        this.f2.op(this.g2, Region.Op.DIFFERENCE);
        return this.f2;
    }

    public float h() {
        return this.q.a.i.a(j());
    }

    public float i() {
        return this.q.a.h.a(j());
    }

    public void invalidateSelf() {
        this.Z1 = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.q.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.q.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.q.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.q.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            i0.h.a.c.w.g$b r0 = r1.q
            android.content.res.ColorStateList r0 = r0.g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            i0.h.a.c.w.g$b r0 = r1.q
            android.content.res.ColorStateList r0 = r0.f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            i0.h.a.c.w.g$b r0 = r1.q
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            i0.h.a.c.w.g$b r0 = r1.q
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.w.g.isStateful():boolean");
    }

    public RectF j() {
        this.d2.set(getBounds());
        return this.d2;
    }

    public int k() {
        b bVar = this.q;
        return (int) (Math.sin(Math.toRadians((double) bVar.t)) * ((double) bVar.s));
    }

    public int l() {
        b bVar = this.q;
        return (int) (Math.cos(Math.toRadians((double) bVar.t)) * ((double) bVar.s));
    }

    public final float m() {
        if (p()) {
            return this.j2.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public Drawable mutate() {
        this.q = new b(this.q);
        return this;
    }

    public float n() {
        return this.q.a.f.a(j());
    }

    public float o() {
        return this.q.a.g.a(j());
    }

    public void onBoundsChange(Rect rect) {
        this.Z1 = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = z(iArr) || A();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        Paint.Style style = this.q.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.j2.getStrokeWidth() > 0.0f;
    }

    public void q(Context context) {
        this.q.b = new i0.h.a.c.n.a(context);
        B();
    }

    public boolean r() {
        return this.q.a.d(j());
    }

    public void s(float f) {
        b bVar = this.q;
        if (bVar.o != f) {
            bVar.o = f;
            B();
        }
    }

    public void setAlpha(int i) {
        b bVar = this.q;
        if (bVar.m != i) {
            bVar.m = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.q.c = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.q.a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.q.g = colorStateList;
        A();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.q;
        if (bVar.h != mode) {
            bVar.h = mode;
            A();
            super.invalidateSelf();
        }
    }

    public void t(ColorStateList colorStateList) {
        b bVar = this.q;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void u(float f) {
        b bVar = this.q;
        if (bVar.k != f) {
            bVar.k = f;
            this.Z1 = true;
            invalidateSelf();
        }
    }

    public void v(int i) {
        this.k2.a(i);
        this.q.u = false;
        super.invalidateSelf();
    }

    public void w(float f, int i) {
        this.q.l = f;
        invalidateSelf();
        y(ColorStateList.valueOf(i));
    }

    public void x(float f, ColorStateList colorStateList) {
        this.q.l = f;
        invalidateSelf();
        y(colorStateList);
    }

    public void y(ColorStateList colorStateList) {
        b bVar = this.q;
        if (bVar.e != colorStateList) {
            bVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean z(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.q.d == null || (color2 = this.i2.getColor()) == (colorForState2 = this.q.d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.i2.setColor(colorForState2);
            z = true;
        }
        if (this.q.e == null || (color = this.j2.getColor()) == (colorForState = this.q.e.getColorForState(iArr, color))) {
            return z;
        }
        this.j2.setColor(colorForState);
        return true;
    }

    public g(k kVar) {
        this(new b(kVar, (i0.h.a.c.n.a) null));
    }

    public g(b bVar) {
        l lVar;
        this.x = new n.f[4];
        this.y = new n.f[4];
        this.Y1 = new BitSet(8);
        this.a2 = new Matrix();
        this.b2 = new Path();
        this.c2 = new Path();
        this.d2 = new RectF();
        this.e2 = new RectF();
        this.f2 = new Region();
        this.g2 = new Region();
        Paint paint = new Paint(1);
        this.i2 = paint;
        Paint paint2 = new Paint(1);
        this.j2 = paint2;
        this.k2 = new i0.h.a.c.v.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.a.a;
        } else {
            lVar = new l();
        }
        this.m2 = lVar;
        this.p2 = new RectF();
        this.q2 = true;
        this.q = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = d;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        A();
        z(getState());
        this.l2 = new a();
    }

    /* compiled from: MaterialShapeDrawable */
    public static final class b extends Drawable.ConstantState {
        public k a;
        public i0.h.a.c.n.a b;
        public ColorFilter c;
        public ColorStateList d = null;
        public ColorStateList e = null;
        public ColorStateList f = null;
        public ColorStateList g = null;
        public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
        public Rect i = null;
        public float j = 1.0f;
        public float k = 1.0f;
        public float l;
        public int m = 255;
        public float n = 0.0f;
        public float o = 0.0f;
        public float p = 0.0f;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public Paint.Style v = Paint.Style.FILL_AND_STROKE;

        public b(k kVar, i0.h.a.c.n.a aVar) {
            this.a = kVar;
            this.b = null;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.Z1 = true;
            return gVar;
        }

        public b(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.l = bVar.l;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
            this.h = bVar.h;
            this.g = bVar.g;
            this.m = bVar.m;
            this.j = bVar.j;
            this.s = bVar.s;
            this.q = bVar.q;
            this.u = bVar.u;
            this.k = bVar.k;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.r = bVar.r;
            this.t = bVar.t;
            this.f = bVar.f;
            this.v = bVar.v;
            if (bVar.i != null) {
                this.i = new Rect(bVar.i);
            }
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i3) {
        this(k.b(context, attributeSet, i, i3, new a((float) 0)).a());
    }
}
