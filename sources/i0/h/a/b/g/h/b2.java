package i0.h.a.b.g.h;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class b2 implements ListIterator<String> {
    public ListIterator<String> c;
    public final /* synthetic */ int d;
    public final /* synthetic */ y1 q;

    public b2(y1 y1Var, int i) {
        this.q = y1Var;
        this.d = i;
        this.c = y1Var.c.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.c.hasNext();
    }

    public final boolean hasPrevious() {
        return this.c.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.c.next();
    }

    public final int nextIndex() {
        return this.c.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.c.previous();
    }

    public final int previousIndex() {
        return this.c.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
