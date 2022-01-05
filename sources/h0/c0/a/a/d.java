package h0.c0.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat */
public class d extends c {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public h c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    /* compiled from: VectorDrawableCompat */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }

        public e(a aVar) {
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class h extends Drawable.ConstantState {
        public int a;
        public g b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public h(h hVar) {
            this.c = null;
            this.d = d.b;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f != null) {
                    gVar.f = new Paint(hVar.b.f);
                }
                if (hVar.b.e != null) {
                    this.b.e = new Paint(hVar.b.e);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a() {
            g gVar = this.b;
            if (gVar.p == null) {
                gVar.p = Boolean.valueOf(gVar.i.a());
            }
            return gVar.p.booleanValue();
        }

        public void b(int i2, int i3) {
            this.f.eraseColor(0);
            Canvas canvas = new Canvas(this.f);
            g gVar = this.b;
            gVar.a(gVar.i, g.a, canvas, i2, i3, (ColorFilter) null);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            return new d(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new d(this);
        }

        public h() {
            this.c = null;
            this.d = d.b;
            this.b = new g();
        }
    }

    public d() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new h();
    }

    public static d a(Resources resources, int i2, Resources.Theme theme) {
        d dVar = new d();
        ThreadLocal<TypedValue> threadLocal = h0.i.b.d.h.a;
        dVar.a = resources.getDrawable(i2, theme);
        new i(dVar.a.getConstantState());
        return dVar;
    }

    public PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cf, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f.getHeight()) == false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.a
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.j
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.j
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x0167
            android.graphics.Rect r0 = r10.j
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x0167
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.e
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.d
        L_0x0025:
            android.graphics.Matrix r1 = r10.i
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.i
            float[] r2 = r10.h
            r1.getValues(r2)
            float[] r1 = r10.h
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.h
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.h
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.h
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0062
        L_0x0060:
            r1 = r8
            r3 = r1
        L_0x0062:
            android.graphics.Rect r4 = r10.j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.j
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x0167
            if (r3 > 0) goto L_0x0084
            goto L_0x0167
        L_0x0084:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.j
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00a1
            int r6 = r10.getLayoutDirection()
            if (r6 != r5) goto L_0x00a1
            r6 = r5
            goto L_0x00a2
        L_0x00a1:
            r6 = r2
        L_0x00a2:
            if (r6 == 0) goto L_0x00b3
            android.graphics.Rect r6 = r10.j
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r7)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r8)
        L_0x00b3:
            android.graphics.Rect r6 = r10.j
            r6.offsetTo(r2, r2)
            h0.c0.a.a.d$h r6 = r10.c
            android.graphics.Bitmap r7 = r6.f
            if (r7 == 0) goto L_0x00d1
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00ce
            android.graphics.Bitmap r7 = r6.f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00ce
            r7 = r5
            goto L_0x00cf
        L_0x00ce:
            r7 = r2
        L_0x00cf:
            if (r7 != 0) goto L_0x00db
        L_0x00d1:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f = r7
            r6.k = r5
        L_0x00db:
            boolean r6 = r10.g
            if (r6 != 0) goto L_0x00e5
            h0.c0.a.a.d$h r6 = r10.c
            r6.b(r1, r3)
            goto L_0x0129
        L_0x00e5:
            h0.c0.a.a.d$h r6 = r10.c
            boolean r7 = r6.k
            if (r7 != 0) goto L_0x0109
            android.content.res.ColorStateList r7 = r6.g
            android.content.res.ColorStateList r8 = r6.c
            if (r7 != r8) goto L_0x0109
            android.graphics.PorterDuff$Mode r7 = r6.h
            android.graphics.PorterDuff$Mode r8 = r6.d
            if (r7 != r8) goto L_0x0109
            boolean r7 = r6.j
            boolean r8 = r6.e
            if (r7 != r8) goto L_0x0109
            int r7 = r6.i
            h0.c0.a.a.d$g r6 = r6.b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x0109
            r6 = r5
            goto L_0x010a
        L_0x0109:
            r6 = r2
        L_0x010a:
            if (r6 != 0) goto L_0x0129
            h0.c0.a.a.d$h r6 = r10.c
            r6.b(r1, r3)
            h0.c0.a.a.d$h r1 = r10.c
            android.content.res.ColorStateList r3 = r1.c
            r1.g = r3
            android.graphics.PorterDuff$Mode r3 = r1.d
            r1.h = r3
            h0.c0.a.a.d$g r3 = r1.b
            int r3 = r3.getRootAlpha()
            r1.i = r3
            boolean r3 = r1.e
            r1.j = r3
            r1.k = r2
        L_0x0129:
            h0.c0.a.a.d$h r1 = r10.c
            android.graphics.Rect r3 = r10.j
            h0.c0.a.a.d$g r6 = r1.b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x0138
            r2 = r5
        L_0x0138:
            r6 = 0
            if (r2 != 0) goto L_0x013f
            if (r0 != 0) goto L_0x013f
            r0 = r6
            goto L_0x015f
        L_0x013f:
            android.graphics.Paint r2 = r1.l
            if (r2 != 0) goto L_0x014d
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.l = r2
            r2.setFilterBitmap(r5)
        L_0x014d:
            android.graphics.Paint r2 = r1.l
            h0.c0.a.a.d$g r5 = r1.b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.l
        L_0x015f:
            android.graphics.Bitmap r1 = r1.f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.c0.a.a.d.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.c.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.e;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new i(this.a.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.c.b.k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.c.b.j;
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.c.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.c.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            h0.c0.a.a.d$h r0 = r1.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0028
            h0.c0.a.a.d$h r0 = r1.c
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.c0.a.a.d.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.c = new h(this.c);
            this.f = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.c;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.d) == null)) {
            this.d = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.a()) {
            boolean b2 = hVar.b.i.b(iArr);
            hVar.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.c.b.getRootAlpha() != i2) {
            this.c.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            g0.a.b.b.a.v0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            g0.a.b.b.a.w0(drawable, colorStateList);
            return;
        }
        h hVar = this.c;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.d = b(colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            g0.a.b.b.a.x0(drawable, mode);
            return;
        }
        h hVar = this.c;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.d = b(hVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class i extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            d dVar = new d();
            dVar.a = (VectorDrawable) this.a.newDrawable();
            return dVar;
        }

        public Drawable newDrawable(Resources resources) {
            d dVar = new d();
            dVar.a = (VectorDrawable) this.a.newDrawable(resources);
            return dVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            dVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
            return dVar;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static abstract class f extends e {
        public h0.i.c.d[] a = null;
        public String b;
        public int c = 0;
        public int d;

        public f() {
            super((a) null);
        }

        public h0.i.c.d[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(h0.i.c.d[] dVarArr) {
            if (!g0.a.b.b.a.i(this.a, dVarArr)) {
                this.a = g0.a.b.b.a.y(dVarArr);
                return;
            }
            h0.i.c.d[] dVarArr2 = this.a;
            for (int i = 0; i < dVarArr.length; i++) {
                dVarArr2[i].a = dVarArr[i].a;
                for (int i2 = 0; i2 < dVarArr[i].b.length; i2++) {
                    dVarArr2[i].b[i2] = dVarArr[i].b[i2];
                }
            }
        }

        public f(f fVar) {
            super((a) null);
            this.b = fVar.b;
            this.d = fVar.d;
            this.a = g0.a.b.b.a.y(fVar.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:201:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L_0x0012
            r0.inflate(r2, r9, r10, r11)
            return
        L_0x0012:
            h0.c0.a.a.d$h r12 = r1.c
            h0.c0.a.a.d$g r0 = new h0.c0.a.a.d$g
            r0.<init>()
            r12.b = r0
            int[] r0 = h0.c0.a.a.a.a
            android.content.res.TypedArray r3 = g0.a.b.b.a.h0(r2, r11, r10, r0)
            h0.c0.a.a.d$h r4 = r1.c
            h0.c0.a.a.d$g r5 = r4.b
            java.lang.String r0 = "tintMode"
            boolean r0 = g0.a.b.b.a.U(r9, r0)
            r13 = 6
            r14 = -1
            if (r0 != 0) goto L_0x0031
            r0 = r14
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getInt(r13, r14)
        L_0x0035:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r15 = 9
            r8 = 5
            r7 = 3
            if (r0 == r7) goto L_0x0051
            if (r0 == r8) goto L_0x0053
            if (r0 == r15) goto L_0x004e
            switch(r0) {
                case 14: goto L_0x004b;
                case 15: goto L_0x0048;
                case 16: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x0053
        L_0x0045:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x0053
        L_0x0048:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x0053
        L_0x004b:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0053
        L_0x004e:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x0053
        L_0x0051:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x0053:
            r4.d = r6
            java.lang.String r0 = "tint"
            boolean r0 = g0.a.b.b.a.U(r9, r0)
            r13 = 1
            r15 = 0
            r14 = 2
            if (r0 == 0) goto L_0x00b6
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r13, r0)
            int r6 = r0.type
            if (r6 == r14) goto L_0x0097
            r14 = 28
            if (r6 < r14) goto L_0x007b
            r14 = 31
            if (r6 > r14) goto L_0x007b
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00b7
        L_0x007b:
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r3.getResourceId(r13, r15)
            java.lang.ThreadLocal<android.util.TypedValue> r14 = h0.i.b.d.a.a
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ Exception -> 0x008e }
            android.content.res.ColorStateList r0 = h0.i.b.d.a.a(r0, r6, r11)     // Catch:{ Exception -> 0x008e }
            goto L_0x00b7
        L_0x008e:
            r0 = move-exception
            java.lang.String r6 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r6, r14, r0)
            goto L_0x00b6
        L_0x0097:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r13)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 == 0) goto L_0x00bb
            r4.c = r0
        L_0x00bb:
            boolean r0 = r4.e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = g0.a.b.b.a.U(r9, r6)
            if (r6 != 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            boolean r0 = r3.getBoolean(r8, r0)
        L_0x00ca:
            r4.e = r0
            float r0 = r5.l
            java.lang.String r4 = "viewportWidth"
            boolean r4 = g0.a.b.b.a.U(r9, r4)
            r14 = 7
            if (r4 != 0) goto L_0x00d8
            goto L_0x00dc
        L_0x00d8:
            float r0 = r3.getFloat(r14, r0)
        L_0x00dc:
            r5.l = r0
            float r0 = r5.m
            java.lang.String r4 = "viewportHeight"
            boolean r4 = g0.a.b.b.a.U(r9, r4)
            r6 = 8
            if (r4 != 0) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            float r0 = r3.getFloat(r6, r0)
        L_0x00ef:
            r5.m = r0
            float r4 = r5.l
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x04df
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x04c3
            float r0 = r5.j
            float r0 = r3.getDimension(r7, r0)
            r5.j = r0
            float r0 = r5.k
            r4 = 2
            float r0 = r3.getDimension(r4, r0)
            r5.k = r0
            float r4 = r5.j
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x04a7
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x048b
            float r0 = r5.getAlpha()
            java.lang.String r4 = "alpha"
            boolean r4 = g0.a.b.b.a.U(r9, r4)
            r14 = 4
            if (r4 != 0) goto L_0x0126
            goto L_0x012a
        L_0x0126:
            float r0 = r3.getFloat(r14, r0)
        L_0x012a:
            r5.setAlpha(r0)
            java.lang.String r0 = r3.getString(r15)
            if (r0 == 0) goto L_0x013a
            r5.o = r0
            h0.f.a<java.lang.String, java.lang.Object> r4 = r5.q
            r4.put(r0, r5)
        L_0x013a:
            r3.recycle()
            int r0 = r28.getChangingConfigurations()
            r12.a = r0
            r12.k = r13
            h0.c0.a.a.d$h r0 = r1.c
            h0.c0.a.a.d$g r5 = r0.b
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            h0.c0.a.a.d$d r3 = r5.i
            r4.push(r3)
            int r3 = r30.getEventType()
            int r20 = r30.getDepth()
            int r14 = r20 + 1
            r20 = r13
        L_0x015f:
            if (r3 == r13) goto L_0x0472
            int r6 = r30.getDepth()
            if (r6 >= r14) goto L_0x0169
            if (r3 == r7) goto L_0x0472
        L_0x0169:
            java.lang.String r6 = "group"
            r7 = 2
            if (r3 != r7) goto L_0x0440
            java.lang.String r3 = r30.getName()
            java.lang.Object r7 = r4.peek()
            h0.c0.a.a.d$d r7 = (h0.c0.a.a.d.C0027d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            java.lang.String r13 = "fillType"
            java.lang.String r15 = "pathData"
            if (r8 == 0) goto L_0x0316
            h0.c0.a.a.d$c r8 = new h0.c0.a.a.d$c
            r8.<init>()
            int[] r3 = h0.c0.a.a.a.c
            android.content.res.TypedArray r6 = g0.a.b.b.a.h0(r2, r11, r10, r3)
            r3 = 0
            r8.e = r3
            boolean r15 = g0.a.b.b.a.U(r9, r15)
            if (r15 != 0) goto L_0x01a9
            r24 = r4
            r25 = r5
            r1 = r6
            r15 = r8
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            goto L_0x02e8
        L_0x01a9:
            r15 = 0
            java.lang.String r3 = r6.getString(r15)
            if (r3 == 0) goto L_0x01b2
            r8.b = r3
        L_0x01b2:
            r3 = 2
            java.lang.String r15 = r6.getString(r3)
            if (r15 == 0) goto L_0x01bf
            h0.i.c.d[] r3 = g0.a.b.b.a.w(r15)
            r8.a = r3
        L_0x01bf:
            r15 = 1
            r20 = 0
            java.lang.String r23 = "fillColor"
            r18 = 0
            r3 = r6
            r24 = r4
            r4 = r30
            r25 = r5
            r5 = r32
            r26 = r6
            r6 = r23
            r18 = r14
            r1 = 3
            r14 = r7
            r7 = r15
            r15 = r8
            r1 = 5
            r8 = r20
            h0.i.b.d.b r3 = g0.a.b.b.a.P(r3, r4, r5, r6, r7, r8)
            r15.h = r3
            r3 = 12
            float r4 = r15.j
            java.lang.String r5 = "fillAlpha"
            boolean r5 = g0.a.b.b.a.U(r9, r5)
            if (r5 != 0) goto L_0x01f1
            r8 = r26
            goto L_0x01f7
        L_0x01f1:
            r8 = r26
            float r4 = r8.getFloat(r3, r4)
        L_0x01f7:
            r15.j = r4
            java.lang.String r3 = "strokeLineCap"
            boolean r3 = g0.a.b.b.a.U(r9, r3)
            if (r3 != 0) goto L_0x0205
            r3 = -1
            r7 = 8
            goto L_0x020d
        L_0x0205:
            r3 = -1
            r7 = 8
            int r4 = r8.getInt(r7, r3)
            r3 = r4
        L_0x020d:
            android.graphics.Paint$Cap r4 = r15.n
            if (r3 == 0) goto L_0x021e
            r5 = 1
            if (r3 == r5) goto L_0x021b
            r5 = 2
            if (r3 == r5) goto L_0x0218
            goto L_0x0220
        L_0x0218:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x0220
        L_0x021b:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x0220
        L_0x021e:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x0220:
            r15.n = r4
            java.lang.String r3 = "strokeLineJoin"
            boolean r3 = g0.a.b.b.a.U(r9, r3)
            if (r3 != 0) goto L_0x022f
            r3 = -1
            r5 = -1
            r6 = 9
            goto L_0x0236
        L_0x022f:
            r5 = -1
            r6 = 9
            int r3 = r8.getInt(r6, r5)
        L_0x0236:
            android.graphics.Paint$Join r4 = r15.o
            if (r3 == 0) goto L_0x0247
            r5 = 1
            if (r3 == r5) goto L_0x0244
            r5 = 2
            if (r3 == r5) goto L_0x0241
            goto L_0x0249
        L_0x0241:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x0249
        L_0x0244:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x0249
        L_0x0247:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
        L_0x0249:
            r15.o = r4
            r3 = 10
            float r4 = r15.p
            java.lang.String r5 = "strokeMiterLimit"
            boolean r5 = g0.a.b.b.a.U(r9, r5)
            if (r5 != 0) goto L_0x0258
            goto L_0x025c
        L_0x0258:
            float r4 = r8.getFloat(r3, r4)
        L_0x025c:
            r15.p = r4
            r16 = 3
            r20 = 0
            java.lang.String r21 = "strokeColor"
            r3 = r8
            r4 = r30
            r17 = -1
            r5 = r32
            r22 = r6
            r6 = r21
            r21 = r7
            r7 = r16
            r1 = r8
            r8 = r20
            h0.i.b.d.b r3 = g0.a.b.b.a.P(r3, r4, r5, r6, r7, r8)
            r15.f = r3
            r3 = 11
            float r4 = r15.i
            java.lang.String r5 = "strokeAlpha"
            boolean r5 = g0.a.b.b.a.U(r9, r5)
            if (r5 != 0) goto L_0x0289
            goto L_0x028d
        L_0x0289:
            float r4 = r1.getFloat(r3, r4)
        L_0x028d:
            r15.i = r4
            float r3 = r15.g
            java.lang.String r4 = "strokeWidth"
            boolean r4 = g0.a.b.b.a.U(r9, r4)
            if (r4 != 0) goto L_0x029a
            goto L_0x029f
        L_0x029a:
            r4 = 4
            float r3 = r1.getFloat(r4, r3)
        L_0x029f:
            r15.g = r3
            float r3 = r15.l
            java.lang.String r4 = "trimPathEnd"
            boolean r4 = g0.a.b.b.a.U(r9, r4)
            if (r4 != 0) goto L_0x02ac
            goto L_0x02b1
        L_0x02ac:
            r4 = 6
            float r3 = r1.getFloat(r4, r3)
        L_0x02b1:
            r15.l = r3
            float r3 = r15.m
            java.lang.String r4 = "trimPathOffset"
            boolean r4 = g0.a.b.b.a.U(r9, r4)
            if (r4 != 0) goto L_0x02be
            goto L_0x02c3
        L_0x02be:
            r4 = 7
            float r3 = r1.getFloat(r4, r3)
        L_0x02c3:
            r15.m = r3
            float r3 = r15.k
            java.lang.String r4 = "trimPathStart"
            boolean r4 = g0.a.b.b.a.U(r9, r4)
            if (r4 != 0) goto L_0x02d0
            goto L_0x02d5
        L_0x02d0:
            r4 = 5
            float r3 = r1.getFloat(r4, r3)
        L_0x02d5:
            r15.k = r3
            r3 = 13
            int r4 = r15.c
            boolean r5 = g0.a.b.b.a.U(r9, r13)
            if (r5 != 0) goto L_0x02e2
            goto L_0x02e6
        L_0x02e2:
            int r4 = r1.getInt(r3, r4)
        L_0x02e6:
            r15.c = r4
        L_0x02e8:
            r1.recycle()
            java.util.ArrayList<h0.c0.a.a.d$e> r1 = r14.b
            r1.add(r15)
            java.lang.String r1 = r15.getPathName()
            if (r1 == 0) goto L_0x0302
            r1 = r25
            h0.f.a<java.lang.String, java.lang.Object> r3 = r1.q
            java.lang.String r4 = r15.getPathName()
            r3.put(r4, r15)
            goto L_0x0304
        L_0x0302:
            r1 = r25
        L_0x0304:
            int r3 = r0.a
            int r4 = r15.d
            r3 = r3 | r4
            r0.a = r3
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
            r20 = 0
            goto L_0x043d
        L_0x0316:
            r24 = r4
            r1 = r5
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            java.lang.String r4 = "clip-path"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0382
            h0.c0.a.a.d$b r3 = new h0.c0.a.a.d$b
            r3.<init>()
            boolean r4 = g0.a.b.b.a.U(r9, r15)
            if (r4 != 0) goto L_0x0336
            goto L_0x0365
        L_0x0336:
            int[] r4 = h0.c0.a.a.a.d
            android.content.res.TypedArray r4 = g0.a.b.b.a.h0(r2, r11, r10, r4)
            r5 = 0
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L_0x0345
            r3.b = r6
        L_0x0345:
            r5 = 1
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L_0x0352
            h0.i.c.d[] r5 = g0.a.b.b.a.w(r6)
            r3.a = r5
        L_0x0352:
            boolean r5 = g0.a.b.b.a.U(r9, r13)
            if (r5 != 0) goto L_0x035a
            r15 = 0
            goto L_0x0360
        L_0x035a:
            r5 = 0
            r6 = 2
            int r15 = r4.getInt(r6, r5)
        L_0x0360:
            r3.c = r15
            r4.recycle()
        L_0x0365:
            java.util.ArrayList<h0.c0.a.a.d$e> r4 = r14.b
            r4.add(r3)
            java.lang.String r4 = r3.getPathName()
            if (r4 == 0) goto L_0x0379
            h0.f.a<java.lang.String, java.lang.Object> r4 = r1.q
            java.lang.String r5 = r3.getPathName()
            r4.put(r5, r3)
        L_0x0379:
            int r4 = r0.a
            int r3 = r3.d
            r3 = r3 | r4
            r0.a = r3
            goto L_0x0436
        L_0x0382:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0436
            h0.c0.a.a.d$d r3 = new h0.c0.a.a.d$d
            r3.<init>()
            int[] r4 = h0.c0.a.a.a.b
            android.content.res.TypedArray r4 = g0.a.b.b.a.h0(r2, r11, r10, r4)
            r5 = 0
            r3.l = r5
            float r6 = r3.c
            java.lang.String r7 = "rotation"
            boolean r7 = g0.a.b.b.a.U(r9, r7)
            if (r7 != 0) goto L_0x03a2
            r7 = 5
            goto L_0x03a7
        L_0x03a2:
            r7 = 5
            float r6 = r4.getFloat(r7, r6)
        L_0x03a7:
            r3.c = r6
            float r6 = r3.d
            r8 = 1
            float r6 = r4.getFloat(r8, r6)
            r3.d = r6
            float r6 = r3.e
            r13 = 2
            float r6 = r4.getFloat(r13, r6)
            r3.e = r6
            float r6 = r3.f
            java.lang.String r15 = "scaleX"
            boolean r15 = g0.a.b.b.a.U(r9, r15)
            if (r15 != 0) goto L_0x03c6
            goto L_0x03cb
        L_0x03c6:
            r15 = 3
            float r6 = r4.getFloat(r15, r6)
        L_0x03cb:
            r3.f = r6
            float r6 = r3.g
            java.lang.String r15 = "scaleY"
            boolean r15 = g0.a.b.b.a.U(r9, r15)
            if (r15 != 0) goto L_0x03d9
            r15 = 4
            goto L_0x03de
        L_0x03d9:
            r15 = 4
            float r6 = r4.getFloat(r15, r6)
        L_0x03de:
            r3.g = r6
            float r6 = r3.h
            java.lang.String r5 = "translateX"
            boolean r5 = g0.a.b.b.a.U(r9, r5)
            if (r5 != 0) goto L_0x03ec
            r5 = 6
            goto L_0x03f1
        L_0x03ec:
            r5 = 6
            float r6 = r4.getFloat(r5, r6)
        L_0x03f1:
            r3.h = r6
            float r6 = r3.i
            java.lang.String r5 = "translateY"
            boolean r5 = g0.a.b.b.a.U(r9, r5)
            if (r5 != 0) goto L_0x03ff
            r5 = 7
            goto L_0x0404
        L_0x03ff:
            r5 = 7
            float r6 = r4.getFloat(r5, r6)
        L_0x0404:
            r3.i = r6
            r6 = 0
            java.lang.String r5 = r4.getString(r6)
            if (r5 == 0) goto L_0x040f
            r3.m = r5
        L_0x040f:
            r3.c()
            r4.recycle()
            java.util.ArrayList<h0.c0.a.a.d$e> r4 = r14.b
            r4.add(r3)
            r4 = r24
            r4.push(r3)
            java.lang.String r5 = r3.getGroupName()
            if (r5 == 0) goto L_0x042e
            h0.f.a<java.lang.String, java.lang.Object> r5 = r1.q
            java.lang.String r14 = r3.getGroupName()
            r5.put(r14, r3)
        L_0x042e:
            int r5 = r0.a
            int r3 = r3.k
            r3 = r3 | r5
            r0.a = r3
            goto L_0x043d
        L_0x0436:
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
        L_0x043d:
            r14 = r6
            r5 = 3
            goto L_0x0461
        L_0x0440:
            r1 = r5
            r18 = r14
            r14 = r15
            r5 = 3
            r15 = 4
            r17 = -1
            r21 = 8
            r22 = 9
            r27 = r13
            r13 = r7
            r7 = r8
            r8 = r27
            if (r3 != r5) goto L_0x0461
            java.lang.String r3 = r30.getName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0461
            r4.pop()
        L_0x0461:
            int r3 = r30.next()
            r13 = r8
            r15 = r14
            r14 = r18
            r6 = r21
            r8 = r7
            r7 = r5
            r5 = r1
            r1 = r28
            goto L_0x015f
        L_0x0472:
            if (r20 != 0) goto L_0x0481
            android.content.res.ColorStateList r0 = r12.c
            android.graphics.PorterDuff$Mode r1 = r12.d
            r2 = r28
            android.graphics.PorterDuffColorFilter r0 = r2.b(r0, r1)
            r2.d = r0
            return
        L_0x0481:
            r2 = r28
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L_0x048b:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04a7:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04c3:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04df:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.c0.a.a.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public d(h hVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = hVar;
        this.d = b(hVar.c, hVar.d);
    }

    /* compiled from: VectorDrawableCompat */
    public static class c extends f {
        public int[] e;
        public h0.i.b.d.b f;
        public float g = 0.0f;
        public h0.i.b.d.b h;
        public float i = 1.0f;
        public float j = 1.0f;
        public float k = 0.0f;
        public float l = 1.0f;
        public float m = 0.0f;
        public Paint.Cap n = Paint.Cap.BUTT;
        public Paint.Join o = Paint.Join.MITER;
        public float p = 4.0f;

        public c() {
        }

        public boolean a() {
            return this.h.c() || this.f.c();
        }

        public boolean b(int[] iArr) {
            return this.f.d(iArr) | this.h.d(iArr);
        }

        public float getFillAlpha() {
            return this.j;
        }

        public int getFillColor() {
            return this.h.c;
        }

        public float getStrokeAlpha() {
            return this.i;
        }

        public int getStrokeColor() {
            return this.f.c;
        }

        public float getStrokeWidth() {
            return this.g;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public float getTrimPathStart() {
            return this.k;
        }

        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        public void setFillColor(int i2) {
            this.h.c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f.c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.k = f2;
        }

        public c(c cVar) {
            super(cVar);
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.c = cVar.c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class g {
        public static final Matrix a = new Matrix();
        public final Path b;
        public final Path c;
        public final Matrix d;
        public Paint e;
        public Paint f;
        public PathMeasure g;
        public int h;
        public final C0027d i;
        public float j;
        public float k;
        public float l;
        public float m;
        public int n;
        public String o;
        public Boolean p;
        public final h0.f.a<String, Object> q;

        public g() {
            this.d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new h0.f.a<>();
            this.i = new C0027d();
            this.b = new Path();
            this.c = new Path();
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        public final void a(C0027d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            C0027d dVar2 = dVar;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            dVar2.a.set(matrix);
            dVar2.a.preConcat(dVar2.j);
            canvas.save();
            ? r11 = 0;
            int i4 = 0;
            while (i4 < dVar2.b.size()) {
                e eVar = dVar2.b.get(i4);
                if (eVar instanceof C0027d) {
                    a((C0027d) eVar, dVar2.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f2 = ((float) i2) / gVar2.l;
                    float f3 = ((float) i3) / gVar2.m;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = dVar2.a;
                    gVar2.d.set(matrix2);
                    gVar2.d.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = min;
                    float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r11], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.b;
                        Objects.requireNonNull(fVar);
                        path.reset();
                        h0.i.c.d[] dVarArr = fVar.a;
                        if (dVarArr != null) {
                            h0.i.c.d.b(dVarArr, path);
                        }
                        Path path2 = gVar.b;
                        gVar.c.reset();
                        if (fVar instanceof b) {
                            gVar.c.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            gVar.c.addPath(path2, gVar.d);
                            canvas2.clipPath(gVar.c);
                        } else {
                            c cVar = (c) fVar;
                            float f6 = cVar.k;
                            if (!(f6 == 0.0f && cVar.l == 1.0f)) {
                                float f7 = cVar.m;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (cVar.l + f7) % 1.0f;
                                if (gVar.g == null) {
                                    gVar.g = new PathMeasure();
                                }
                                gVar.g.setPath(gVar.b, r11);
                                float length = gVar.g.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path2.reset();
                                if (f10 > f11) {
                                    gVar.g.getSegment(f10, length, path2, true);
                                    gVar.g.getSegment(0.0f, f11, path2, true);
                                } else {
                                    gVar.g.getSegment(f10, f11, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            gVar.c.addPath(path2, gVar.d);
                            h0.i.b.d.b bVar = cVar.h;
                            if (bVar.b() || bVar.c != 0) {
                                h0.i.b.d.b bVar2 = cVar.h;
                                if (gVar.f == null) {
                                    Paint paint = new Paint(1);
                                    gVar.f = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = gVar.f;
                                if (bVar2.b()) {
                                    Shader shader = bVar2.a;
                                    shader.setLocalMatrix(gVar.d);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(cVar.j * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i5 = bVar2.c;
                                    float f12 = cVar.j;
                                    PorterDuff.Mode mode = d.b;
                                    paint2.setColor((i5 & 16777215) | (((int) (((float) Color.alpha(i5)) * f12)) << 24));
                                }
                                paint2.setColorFilter(colorFilter2);
                                gVar.c.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(gVar.c, paint2);
                            }
                            h0.i.b.d.b bVar3 = cVar.f;
                            if (bVar3.b() || bVar3.c != 0) {
                                h0.i.b.d.b bVar4 = cVar.f;
                                if (gVar.e == null) {
                                    Paint paint3 = new Paint(1);
                                    gVar.e = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = gVar.e;
                                Paint.Join join = cVar.o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(cVar.p);
                                if (bVar4.b()) {
                                    Shader shader2 = bVar4.a;
                                    shader2.setLocalMatrix(gVar.d);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(cVar.i * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i6 = bVar4.c;
                                    float f13 = cVar.i;
                                    PorterDuff.Mode mode2 = d.b;
                                    paint4.setColor((i6 & 16777215) | (((int) (((float) Color.alpha(i6)) * f13)) << 24));
                                }
                                paint4.setColorFilter(colorFilter2);
                                paint4.setStrokeWidth(cVar.g * abs * f4);
                                canvas2.drawPath(gVar.c, paint4);
                            }
                        }
                    }
                    i4++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                int i7 = i2;
                int i8 = i3;
                gVar = gVar2;
                i4++;
                gVar2 = gVar;
                r11 = 0;
            }
            g gVar3 = gVar2;
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.n = i2;
        }

        public g(g gVar) {
            this.d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            h0.f.a<String, Object> aVar = new h0.f.a<>();
            this.q = aVar;
            this.i = new C0027d(gVar.i, aVar);
            this.b = new Path(gVar.b);
            this.c = new Path(gVar.c);
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.m = gVar.m;
            this.h = gVar.h;
            this.n = gVar.n;
            this.o = gVar.o;
            String str = gVar.o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.p = gVar.p;
        }
    }

    /* renamed from: h0.c0.a.a.d$d  reason: collision with other inner class name */
    /* compiled from: VectorDrawableCompat */
    public static class C0027d extends e {
        public final Matrix a;
        public final ArrayList<e> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public int k;
        public int[] l;
        public String m;

        public C0027d(C0027d dVar, h0.f.a<String, Object> aVar) {
            super((a) null);
            f fVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.m = null;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof C0027d) {
                    this.b.add(new C0027d((C0027d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(fVar);
                    String str2 = fVar.b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).b(iArr);
            }
            return z;
        }

        public final void c() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                c();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                c();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                c();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f) {
                this.f = f2;
                c();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                c();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                c();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                c();
            }
        }

        public C0027d() {
            super((a) null);
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }
    }
}
