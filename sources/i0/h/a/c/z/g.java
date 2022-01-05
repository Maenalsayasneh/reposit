package i0.h.a.c.z;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import i0.h.a.c.w.k;

/* compiled from: CutoutDrawable */
public class g extends i0.h.a.c.w.g {
    public final Paint r2;
    public final RectF s2;
    public int t2;

    public g() {
        this((k) null);
    }

    public void C(float f, float f2, float f3, float f4) {
        RectF rectF = this.s2;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else {
            this.t2 = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        }
        super.draw(canvas);
        canvas.drawRect(this.s2, this.r2);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.t2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(k kVar) {
        super(kVar == null ? new k() : kVar);
        Paint paint = new Paint(1);
        this.r2 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.s2 = new RectF();
    }
}
