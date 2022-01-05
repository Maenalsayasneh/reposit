package i0.e.b.g3.z;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import m0.n.b.i;

/* compiled from: CustomTypefaceSpan.kt */
public final class a extends MetricAffectingSpan {
    public final Typeface c;

    public a(Typeface typeface) {
        i.e(typeface, "typeface");
        this.c = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        i.e(textPaint, "ds");
        textPaint.setTypeface(this.c);
    }

    public void updateMeasureState(TextPaint textPaint) {
        i.e(textPaint, "paint");
        textPaint.setTypeface(this.c);
    }
}
