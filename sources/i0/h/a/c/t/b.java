package i0.h.a.c.t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.material.R;
import h0.i.b.d.h;

/* compiled from: TextAppearance */
public class b {
    public final ColorStateList a;
    public final ColorStateList b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    /* compiled from: TextAppearance */
    public class a extends h.a {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public void d(int i) {
            b.this.m = true;
            this.a.a(i);
        }

        public void e(Typeface typeface) {
            b bVar = b.this;
            bVar.n = Typeface.create(typeface, bVar.d);
            b bVar2 = b.this;
            bVar2.m = true;
            this.a.b(bVar2.n, false);
        }
    }

    public b(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, R.styleable.TextAppearance);
        this.k = obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f);
        this.a = i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor);
        i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.d = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.e = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int i3 = R.styleable.TextAppearance_fontFamily;
        i3 = !obtainStyledAttributes.hasValue(i3) ? R.styleable.TextAppearance_android_fontFamily : i3;
        this.l = obtainStyledAttributes.getResourceId(i3, 0);
        this.c = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.b = i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.f = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.g = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.h = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, R.styleable.MaterialTextAppearance);
        int i4 = R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.i = obtainStyledAttributes2.hasValue(i4);
        this.j = obtainStyledAttributes2.getFloat(i4, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.n == null && (str = this.c) != null) {
            this.n = Typeface.create(str, this.d);
        }
        if (this.n == null) {
            int i2 = this.e;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, this.d);
        }
    }

    public void b(Context context, d dVar) {
        a();
        int i2 = this.l;
        if (i2 == 0) {
            this.m = true;
        }
        if (this.m) {
            dVar.b(this.n, true);
            return;
        }
        try {
            a aVar = new a(dVar);
            ThreadLocal<TypedValue> threadLocal = h.a;
            if (context.isRestricted()) {
                aVar.a(-4, (Handler) null);
                return;
            }
            h.b(context, i2, new TypedValue(), 0, aVar, (Handler) null, false, false);
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            dVar.a(1);
        } catch (Exception e2) {
            StringBuilder P0 = i0.d.a.a.a.P0("Error loading font ");
            P0.append(this.c);
            Log.d("TextAppearance", P0.toString(), e2);
            this.m = true;
            dVar.a(-3);
        }
    }

    public void c(Context context, TextPaint textPaint, d dVar) {
        a();
        d(textPaint, this.n);
        b(context, new c(this, textPaint, dVar));
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.h;
        float f3 = this.f;
        float f4 = this.g;
        ColorStateList colorStateList2 = this.b;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
