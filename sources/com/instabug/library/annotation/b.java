package com.instabug.library.annotation;

import android.graphics.PointF;
import android.graphics.RectF;
import java.io.Serializable;

/* compiled from: DirectionRectF */
public class b extends RectF implements Serializable {
    public PointF Y1 = new PointF();
    public PointF Z1 = new PointF();
    public PointF a2 = new PointF();
    public boolean b2 = false;
    public a c;
    public boolean c2 = true;
    public C0105b d;
    public a q;
    public C0105b x;
    public PointF y = new PointF();

    /* compiled from: DirectionRectF */
    public enum a {
        LEFT,
        RIGHT
    }

    /* renamed from: com.instabug.library.annotation.b$b  reason: collision with other inner class name */
    /* compiled from: DirectionRectF */
    public enum C0105b {
        TOP,
        BOTTOM
    }

    public b() {
    }

    public PointF a() {
        return new PointF(this.right, this.bottom);
    }

    public final void c(b bVar) {
        if (bVar == null) {
            this.bottom = 0.0f;
            this.right = 0.0f;
            this.top = 0.0f;
            this.left = 0.0f;
            this.q = null;
            this.c = null;
            this.x = null;
            this.d = null;
            this.y.set(0.0f, 0.0f);
            this.Y1.set(0.0f, 0.0f);
            this.Z1.set(0.0f, 0.0f);
            this.a2.set(0.0f, 0.0f);
            this.b2 = false;
            this.c2 = true;
            return;
        }
        this.left = bVar.left;
        this.top = bVar.top;
        this.right = bVar.right;
        this.bottom = bVar.bottom;
        this.c = bVar.c;
        this.d = bVar.d;
        this.q = bVar.q;
        this.x = bVar.x;
        this.y.set(bVar.y);
        this.Y1.set(bVar.Y1);
        this.Z1.set(bVar.Z1);
        this.a2.set(bVar.a2);
        this.b2 = bVar.b2;
        this.c2 = bVar.c2;
    }

    public b(b bVar) {
        c(bVar);
    }

    public b(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }
}
