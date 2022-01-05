package h0.b.f;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBar */
public class s extends SeekBar {
    public final t c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = androidx.appcompat.R.attr.seekBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            h0.b.f.r0.a(r1, r2)
            h0.b.f.t r2 = new h0.b.f.t
            r2.<init>(r1)
            r1.c = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.c;
        Drawable drawable = tVar.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(tVar.d.getDrawableState())) {
            tVar.d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.c.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.c.d(canvas);
    }
}
