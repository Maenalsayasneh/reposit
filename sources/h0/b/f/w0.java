package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import h0.b.b.a.a;
import h0.i.b.d.h;

/* compiled from: TintTypedArray */
public class w0 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public w0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static w0 p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 q(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        if (this.b.hasValue(i) && (resourceId = this.b.getResourceId(i, 0)) != 0) {
            Context context = this.a;
            ThreadLocal<TypedValue> threadLocal = a.a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return this.b.getColorStateList(i);
    }

    public float d(int i, float f) {
        return this.b.getDimension(i, f);
    }

    public int e(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return this.b.getDrawable(i);
        }
        return a.a(this.a, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        Drawable drawable;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        j a2 = j.a();
        Context context = this.a;
        synchronized (a2) {
            drawable = a2.c.getDrawable(context, resourceId, true);
        }
        return drawable;
    }

    public Typeface i(int i, int i2, h.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        Context context = this.a;
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = h.a;
        if (context.isRestricted()) {
            return null;
        }
        return h.b(context, resourceId, typedValue, i2, aVar, (Handler) null, true, false);
    }

    public int j(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public int k(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public int l(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public String m(int i) {
        return this.b.getString(i);
    }

    public CharSequence n(int i) {
        return this.b.getText(i);
    }

    public boolean o(int i) {
        return this.b.hasValue(i);
    }
}
