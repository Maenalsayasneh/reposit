package i0.h.a.c.t;

import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: TextAppearance */
public class c extends d {
    public final /* synthetic */ TextPaint a;
    public final /* synthetic */ d b;
    public final /* synthetic */ b c;

    public c(b bVar, TextPaint textPaint, d dVar) {
        this.c = bVar;
        this.a = textPaint;
        this.b = dVar;
    }

    public void a(int i) {
        this.b.a(i);
    }

    public void b(Typeface typeface, boolean z) {
        this.c.d(this.a, typeface);
        this.b.b(typeface, z);
    }
}
