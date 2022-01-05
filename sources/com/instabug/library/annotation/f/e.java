package com.instabug.library.annotation.f;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.instabug.library.annotation.b;
import i0.j.c.l.a;
import java.util.List;

/* compiled from: PathShape */
public class e extends f {
    public final RectF Y1;
    public final Paint Z1;
    public Path a2;
    public Matrix b2 = new Matrix();
    public List<PointF> c2;

    public e(Path path, float f, Paint paint, List<PointF> list) {
        super(paint.getColor(), f, 0);
        this.a2 = path;
        this.Z1 = new Paint(paint);
        this.c2 = list;
        RectF rectF = new RectF();
        this.Y1 = rectF;
        path.computeBounds(rectF, true);
    }

    public void b(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        a.v(canvas, pointF, pointF2, this.c);
        a.v(canvas, pointF, pointF4, this.c);
        a.v(canvas, pointF2, pointF3, this.c);
        a.v(canvas, pointF3, pointF4, this.c);
    }

    public void c(Canvas canvas, b bVar, b bVar2) {
        this.b2.reset();
        Path path = new Path(this.a2);
        this.b2.setRectToRect(this.Y1, new RectF(bVar), Matrix.ScaleToFit.FILL);
        path.transform(this.b2);
        canvas.drawPath(path, this.Z1);
    }

    public void f(b bVar, b bVar2, boolean z) {
        if (Math.abs(bVar2.width() - bVar.width()) >= 1.0f || Math.abs(bVar2.height() - bVar.height()) >= 1.0f) {
            float max = Math.max(bVar.width() / bVar2.width(), bVar.height() / bVar2.height());
            Matrix matrix = new Matrix();
            matrix.postScale(max, max, bVar2.centerX(), bVar2.centerY());
            matrix.mapRect(bVar2);
            return;
        }
        bVar2.c(bVar);
    }

    public boolean g(PointF pointF, b bVar) {
        float f = pointF.x;
        float f2 = pointF.y;
        RectF rectF = new RectF(f - 50.0f, f2 - 50.0f, f + 50.0f, f2 + 50.0f);
        for (PointF next : this.c2) {
            float[] fArr = {next.x, next.y};
            float[] fArr2 = new float[2];
            this.b2.mapPoints(fArr2, fArr);
            if (rectF.contains(fArr2[0], fArr2[1])) {
                return true;
            }
        }
        return false;
    }
}
