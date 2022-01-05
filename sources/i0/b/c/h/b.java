package i0.b.c.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import m0.n.b.i;

/* compiled from: TypedArrayTypedArrayWrapper.kt */
public final class b extends c {
    public final TypedArray b;

    public b(Context context, TypedArray typedArray) {
        i.e(context, "context");
        i.e(typedArray, "typedArray");
        this.b = typedArray;
    }

    public boolean a(int i) {
        return this.b.getBoolean(i, false);
    }

    public ColorStateList b(int i) {
        if (m(this.b.getResourceId(i, 0))) {
            return null;
        }
        return this.b.getColorStateList(i);
    }

    public int c(int i) {
        return this.b.getDimensionPixelSize(i, -1);
    }

    public Drawable d(int i) {
        if (m(this.b.getResourceId(i, 0))) {
            return null;
        }
        return this.b.getDrawable(i);
    }

    public float e(int i) {
        return this.b.getFloat(i, -1.0f);
    }

    public int f(int i) {
        return this.b.getIndex(i);
    }

    public int g() {
        return this.b.getIndexCount();
    }

    public int h(int i) {
        return this.b.getInt(i, -1);
    }

    public int i(int i) {
        return this.b.getLayoutDimension(i, -1);
    }

    public int j(int i) {
        if (m(this.b.getResourceId(i, 0))) {
            return 0;
        }
        return this.b.getResourceId(i, 0);
    }

    public CharSequence k(int i) {
        if (m(this.b.getResourceId(i, 0))) {
            return null;
        }
        return this.b.getText(i);
    }

    public boolean l(int i) {
        return this.b.hasValue(i);
    }

    public void n() {
        this.b.recycle();
    }
}
