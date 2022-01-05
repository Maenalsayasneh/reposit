package h0.m.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Objects;

/* compiled from: TypefaceEmojiSpan */
public final class g extends d {
    public g(b bVar) {
        super(bVar);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        Objects.requireNonNull(a.a());
        b bVar = this.d;
        Typeface typeface = bVar.c.d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i6 = bVar.b * 2;
        char[] cArr = bVar.c.b;
        canvas.drawText(cArr, i6, 2, f, (float) i4, paint);
        paint2.setTypeface(typeface2);
    }
}
