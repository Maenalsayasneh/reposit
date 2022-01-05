package h0.b.f;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

/* compiled from: AppCompatRatingBar */
public class q extends RatingBar {
    public final o c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = androidx.appcompat.R.attr.ratingBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            h0.b.f.r0.a(r1, r2)
            h0.b.f.o r2 = new h0.b.f.o
            r2.<init>(r1)
            r1.c = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.c.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
