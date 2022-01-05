package com.instabug.library.annotation.f;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.instabug.library.Instabug;
import com.instabug.library.annotation.b;
import i0.j.c.l.a;

/* compiled from: ZoomedShape */
public class h extends c {
    public float Y1;
    public float Z1;
    public float a2;
    public PointF y;

    public h(Bitmap bitmap) {
        super(-65536);
        this.x = bitmap;
        this.q = true;
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Path a(b bVar) {
        return null;
    }

    public void b(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
    }

    public void d(Canvas canvas, b bVar, i0.j.e.b.b[] bVarArr) {
        PointF pointF = this.y;
        if (pointF == null) {
            pointF = bVar.a();
        }
        bVarArr[2].b = pointF;
        bVarArr[2].c = Instabug.getPrimaryColor();
        bVarArr[2].b(canvas);
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
        Region region = new Region();
        RectF rectF = new RectF();
        Path path = new Path();
        path.addCircle(this.Y1, this.Z1, this.a2, Path.Direction.CW);
        path.computeBounds(rectF, true);
        region.setPath(path, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return region.contains((int) pointF.x, (int) pointF.y);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void h(Canvas canvas, Bitmap bitmap, float f, float f2) {
        this.a2 = (float) Math.min(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        this.Y1 = (((float) bitmap.getWidth()) / 2.0f) + f;
        this.Z1 = (((float) bitmap.getHeight()) / 2.0f) + f2;
        this.y = a.j(this.a2, 45.0f, new PointF(this.Y1, this.Z1));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = (width * 200) / 100;
        int i2 = (200 * height) / 100;
        Bitmap createBitmap = Bitmap.createBitmap(Bitmap.createScaledBitmap(bitmap, i, i2, true), Math.abs(i - width) / 2, Math.abs(i2 - height) / 2, width, height);
        Rect rect = new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        rect.inset(-6, -6);
        Bitmap createBitmap2 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint = new Paint(1);
        canvas2.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        float centerX = (float) rect.centerX();
        float centerY = (float) rect.centerY();
        float min = Math.min(centerX, centerY);
        canvas2.drawCircle(centerX, centerY, min, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas2.drawBitmap(createBitmap, (Rect) null, rect, paint);
        Paint paint2 = new Paint(1);
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(2.0f);
        canvas2.drawCircle(centerX, centerY, min - 2.0f, paint2);
        canvas.drawBitmap(createBitmap2, f, f2, (Paint) null);
    }
}
