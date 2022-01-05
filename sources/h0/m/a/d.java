package h0.m.a;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import g0.a.b.b.a;

/* compiled from: EmojiSpan */
public abstract class d extends ReplacementSpan {
    public final Paint.FontMetricsInt c = new Paint.FontMetricsInt();
    public final b d;
    public short q = -1;
    public float x = 1.0f;

    public d(b bVar) {
        a.m(bVar, "metadata cannot be null");
        this.d = bVar;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.c);
        Paint.FontMetricsInt fontMetricsInt2 = this.c;
        this.x = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.d.c());
        this.d.c();
        h0.a0.a.a.a e = this.d.e();
        int a = e.a(12);
        short s = (short) ((int) (((float) (a != 0 ? e.b.getShort(a + e.a) : 0)) * this.x));
        this.q = s;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.c;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s;
    }
}
