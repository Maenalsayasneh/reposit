package com.instabug.library.annotation.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.instabug.library.Instabug;
import i0.j.c.l.a;
import java.util.Objects;

/* compiled from: BlurredRectShape */
public class b extends c {
    public final Context y;

    public b(Bitmap bitmap, Context context) {
        super(-65536);
        this.y = context;
        if (bitmap != null) {
            this.x = a.h(bitmap, 18, context);
            this.q = true;
        }
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Path a(com.instabug.library.annotation.b bVar) {
        return null;
    }

    public void b(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        a.v(canvas, pointF, pointF2, this.c);
        a.v(canvas, pointF, pointF4, this.c);
        a.v(canvas, pointF2, pointF3, this.c);
        a.v(canvas, pointF3, pointF4, this.c);
    }

    public void d(Canvas canvas, com.instabug.library.annotation.b bVar, i0.j.e.b.b[] bVarArr) {
        Objects.requireNonNull(bVar);
        PointF[] pointFArr = {new PointF(bVar.left, bVar.top), new PointF(bVar.right, bVar.top), bVar.a(), new PointF(bVar.left, bVar.bottom)};
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr[i].b = pointFArr[i];
            bVarArr[i].c = Instabug.getPrimaryColor();
            bVarArr[i].b(canvas);
        }
    }

    public void f(com.instabug.library.annotation.b bVar, com.instabug.library.annotation.b bVar2, boolean z) {
        bVar2.c(bVar);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void h(Canvas canvas, Bitmap bitmap, float f, float f2) {
        canvas.drawBitmap(bitmap, f, f2, (Paint) null);
    }
}
