package i0.h.a.c.q;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import i0.h.a.c.t.c;
import i0.h.a.c.t.d;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper */
public class h {
    public final TextPaint a = new TextPaint(1);
    public final d b = new a();
    public float c;
    public boolean d = true;
    public WeakReference<b> e = new WeakReference<>((Object) null);
    public i0.h.a.c.t.b f;

    /* compiled from: TextDrawableHelper */
    public class a extends d {
        public a() {
        }

        public void a(int i) {
            h hVar = h.this;
            hVar.d = true;
            b bVar = (b) hVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z) {
            if (!z) {
                h hVar = h.this;
                hVar.d = true;
                b bVar = (b) hVar.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: TextDrawableHelper */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        float f2;
        if (!this.d) {
            return this.c;
        }
        if (str == null) {
            f2 = 0.0f;
        } else {
            f2 = this.a.measureText(str, 0, str.length());
        }
        this.c = f2;
        this.d = false;
        return f2;
    }

    public void b(i0.h.a.c.t.b bVar, Context context) {
        if (this.f != bVar) {
            this.f = bVar;
            if (bVar != null) {
                TextPaint textPaint = this.a;
                d dVar = this.b;
                bVar.a();
                bVar.d(textPaint, bVar.n);
                bVar.b(context, new c(bVar, textPaint, dVar));
                b bVar2 = (b) this.e.get();
                if (bVar2 != null) {
                    this.a.drawableState = bVar2.getState();
                }
                bVar.c(context, this.a, this.b);
                this.d = true;
            }
            b bVar3 = (b) this.e.get();
            if (bVar3 != null) {
                bVar3.a();
                bVar3.onStateChange(bVar3.getState());
            }
        }
    }
}
