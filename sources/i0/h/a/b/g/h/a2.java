package i0.h.a.b.g.h;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class a2 implements Iterator<String> {
    public Iterator<String> c;
    public final /* synthetic */ y1 d;

    public a2(y1 y1Var) {
        this.d = y1Var;
        this.c = y1Var.c.iterator();
    }

    public final boolean hasNext() {
        return this.c.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.c.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
