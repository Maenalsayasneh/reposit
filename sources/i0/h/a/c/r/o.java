package i0.h.a.c.r;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import i0.h.a.c.r.c;

/* compiled from: IndeterminateDrawable */
public final class o<S extends c> extends l {
    public m<S> e2;
    public n<ObjectAnimator> f2;

    public o(Context context, c cVar, m<S> mVar, n<ObjectAnimator> nVar) {
        super(context, cVar);
        this.e2 = mVar;
        mVar.b = this;
        this.f2 = nVar;
        nVar.a = this;
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            m<S> mVar = this.e2;
            float c = c();
            mVar.a.a();
            mVar.a(canvas, c);
            this.e2.c(canvas, this.c2);
            int i = 0;
            while (true) {
                n<ObjectAnimator> nVar = this.f2;
                int[] iArr = nVar.c;
                if (i < iArr.length) {
                    m<S> mVar2 = this.e2;
                    Paint paint = this.c2;
                    float[] fArr = nVar.b;
                    int i2 = i * 2;
                    mVar2.b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public int getIntrinsicHeight() {
        return this.e2.d();
    }

    public int getIntrinsicWidth() {
        return this.e2.e();
    }

    public boolean i(boolean z, boolean z2, boolean z3) {
        boolean i = super.i(z, z2, z3);
        if (!isRunning()) {
            this.f2.a();
        }
        this.x.a(this.d.getContentResolver());
        if (z && z3) {
            this.f2.f();
        }
        return i;
    }
}
