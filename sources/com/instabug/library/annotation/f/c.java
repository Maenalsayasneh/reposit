package com.instabug.library.annotation.f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import com.instabug.library.annotation.b;

/* compiled from: CroppedRectShape */
public abstract class c extends g {
    public Bitmap x;

    public c(int i) {
        super(i, 0.0f);
    }

    public void c(Canvas canvas, b bVar, b bVar2) {
        if (this.x != null) {
            float f = bVar.left;
            float f2 = bVar.top;
            float width = bVar.width();
            float height = bVar.height();
            if (f < 0.0f) {
                width += f;
                f = 0.0f;
            }
            if (f2 < 0.0f) {
                height += f2;
                f2 = 0.0f;
            }
            if (f + width > ((float) this.x.getWidth())) {
                width = ((float) this.x.getWidth()) - f;
            }
            if (f2 + height > ((float) this.x.getHeight())) {
                height = ((float) this.x.getHeight()) - f2;
            }
            if (width > 0.0f && height > 0.0f) {
                Bitmap createBitmap = Bitmap.createBitmap(this.x, (int) f, (int) f2, (int) width, (int) height);
                float f3 = bVar.left;
                float f4 = bVar.top;
                if (f3 < 0.0f) {
                    f3 = bVar.right - ((float) createBitmap.getWidth());
                }
                if (bVar.top < 0.0f) {
                    f4 = bVar.bottom - ((float) createBitmap.getHeight());
                }
                h(canvas, createBitmap, f3, f4);
            }
        }
    }

    public void e(b bVar, b bVar2, int i, int i2) {
        float f = (float) i;
        bVar.left = bVar2.left + f;
        float f2 = (float) i2;
        bVar.top = bVar2.top + f2;
        bVar.right = bVar2.right + f;
        bVar.bottom = bVar2.bottom + f2;
    }

    public boolean g(PointF pointF, b bVar) {
        RectF rectF = new RectF(bVar);
        float f = -(this.d.getStrokeWidth() + 20.0f);
        rectF.inset(f, f);
        return rectF.contains((float) ((int) pointF.x), (float) ((int) pointF.y));
    }

    public abstract void h(Canvas canvas, Bitmap bitmap, float f, float f2);
}
