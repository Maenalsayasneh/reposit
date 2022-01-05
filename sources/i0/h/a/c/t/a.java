package i0.h.a.c.t;

import android.graphics.Typeface;
import i0.h.a.c.q.b;
import i0.h.a.c.q.c;

/* compiled from: CancelableFontCallback */
public final class a extends d {
    public final Typeface a;
    public final C0144a b;
    public boolean c;

    /* renamed from: i0.h.a.c.t.a$a  reason: collision with other inner class name */
    /* compiled from: CancelableFontCallback */
    public interface C0144a {
    }

    public a(C0144a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    public void a(int i) {
        c(this.a);
    }

    public void b(Typeface typeface, boolean z) {
        c(typeface);
    }

    public final void c(Typeface typeface) {
        if (!this.c) {
            c cVar = ((b) this.b).a;
            a aVar = cVar.v;
            boolean z = true;
            if (aVar != null) {
                aVar.c = true;
            }
            if (cVar.s != typeface) {
                cVar.s = typeface;
            } else {
                z = false;
            }
            if (z) {
                cVar.k();
            }
        }
    }
}
