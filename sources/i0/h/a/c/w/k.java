package i0.h.a.c.w;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import java.util.Objects;

/* compiled from: ShapeAppearanceModel */
public class k {
    public static final c a = new i(0.5f);
    public d b;
    public d c;
    public d d;
    public d e;
    public c f;
    public c g;
    public c h;
    public c i;
    public f j;
    public f k;
    public f l;
    public f m;

    public k(b bVar, a aVar) {
        this.b = bVar.a;
        this.c = bVar.b;
        this.d = bVar.c;
        this.e = bVar.d;
        this.f = bVar.e;
        this.g = bVar.f;
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
    }

    public static b a(Context context, int i2, int i3, c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, R.styleable.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i4);
            c c2 = c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cVar);
            c c3 = c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, c2);
            c c4 = c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, c2);
            c c5 = c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, c2);
            c c6 = c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, c2);
            b bVar = new b();
            d z = i0.h.a.b.c.m.b.z(i5);
            bVar.a = z;
            b.b(z);
            bVar.e = c3;
            d z2 = i0.h.a.b.c.m.b.z(i6);
            bVar.b = z2;
            b.b(z2);
            bVar.f = c4;
            d z3 = i0.h.a.b.c.m.b.z(i7);
            bVar.c = z3;
            b.b(z3);
            bVar.g = c5;
            d z4 = i0.h.a.b.c.m.b.z(i8);
            bVar.d = z4;
            b.b(z4);
            bVar.h = c6;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b b(Context context, AttributeSet attributeSet, int i2, int i3, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, cVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i3 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public boolean d(RectF rectF) {
        Class<f> cls = f.class;
        boolean z = this.m.getClass().equals(cls) && this.k.getClass().equals(cls) && this.j.getClass().equals(cls) && this.l.getClass().equals(cls);
        float a2 = this.f.a(rectF);
        boolean z2 = this.g.a(rectF) == a2 && this.i.a(rectF) == a2 && this.h.a(rectF) == a2;
        boolean z3 = (this.c instanceof j) && (this.b instanceof j) && (this.d instanceof j) && (this.e instanceof j);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    public k e(float f2) {
        b bVar = new b(this);
        bVar.c(f2);
        return bVar.a();
    }

    /* compiled from: ShapeAppearanceModel */
    public static final class b {
        public d a = new j();
        public d b = new j();
        public d c = new j();
        public d d = new j();
        public c e = new a(0.0f);
        public c f = new a(0.0f);
        public c g = new a(0.0f);
        public c h = new a(0.0f);
        public f i = new f();
        public f j = new f();
        public f k = new f();
        public f l = new f();

        public b() {
        }

        public static float b(d dVar) {
            if (dVar instanceof j) {
                Objects.requireNonNull((j) dVar);
                return -1.0f;
            }
            if (dVar instanceof e) {
                Objects.requireNonNull((e) dVar);
            }
            return -1.0f;
        }

        public k a() {
            return new k(this, (a) null);
        }

        public b c(float f2) {
            this.e = new a(f2);
            this.f = new a(f2);
            this.g = new a(f2);
            this.h = new a(f2);
            return this;
        }

        public b d(float f2) {
            this.h = new a(f2);
            return this;
        }

        public b e(float f2) {
            this.g = new a(f2);
            return this;
        }

        public b f(float f2) {
            this.e = new a(f2);
            return this;
        }

        public b g(float f2) {
            this.f = new a(f2);
            return this;
        }

        public b(k kVar) {
            this.a = kVar.b;
            this.b = kVar.c;
            this.c = kVar.d;
            this.d = kVar.e;
            this.e = kVar.f;
            this.f = kVar.g;
            this.g = kVar.h;
            this.h = kVar.i;
            this.i = kVar.j;
            this.j = kVar.k;
            this.k = kVar.l;
            this.l = kVar.m;
        }
    }

    public k() {
        this.b = new j();
        this.c = new j();
        this.d = new j();
        this.e = new j();
        this.f = new a(0.0f);
        this.g = new a(0.0f);
        this.h = new a(0.0f);
        this.i = new a(0.0f);
        this.j = new f();
        this.k = new f();
        this.l = new f();
        this.m = new f();
    }
}
