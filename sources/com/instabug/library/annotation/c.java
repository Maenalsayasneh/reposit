package com.instabug.library.annotation;

import android.graphics.Canvas;
import android.graphics.PointF;
import com.instabug.library.annotation.f.g;
import java.io.Serializable;
import java.util.Objects;
import java.util.Stack;

/* compiled from: MarkUpDrawable */
public class c implements Serializable {
    public volatile g c;
    public g d;
    public b q = new b();
    public b x = new b();
    public Stack<b> y = new Stack<>();

    public c(g gVar) {
        this.c = gVar;
        this.d = gVar;
    }

    public void a(Canvas canvas) {
        g gVar = this.c;
        b bVar = this.q;
        Objects.requireNonNull(bVar);
        PointF pointF = new PointF(bVar.left, bVar.top);
        b bVar2 = this.q;
        Objects.requireNonNull(bVar2);
        PointF pointF2 = new PointF(bVar2.right, bVar2.top);
        PointF a = this.q.a();
        b bVar3 = this.q;
        Objects.requireNonNull(bVar3);
        gVar.b(canvas, pointF, pointF2, a, new PointF(bVar3.left, bVar3.bottom));
    }

    public final void b(b bVar) {
        if (this.x != null) {
            this.y.push(new b(this.x));
        }
        this.x = bVar;
    }
}
