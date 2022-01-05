package n0.c.i;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Iterables.kt */
public final class f implements Iterable<String>, m0.n.b.s.a {
    public final /* synthetic */ SerialDescriptor c;

    /* compiled from: SerialDescriptor.kt */
    public static final class a implements Iterator<String>, m0.n.b.s.a {
        public int c;
        public final /* synthetic */ f d;

        public a(f fVar) {
            this.d = fVar;
            this.c = fVar.c.e();
        }

        public boolean hasNext() {
            return this.c > 0;
        }

        public Object next() {
            SerialDescriptor serialDescriptor = this.d.c;
            int e = serialDescriptor.e();
            int i = this.c;
            this.c = i - 1;
            return serialDescriptor.g(e - i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(SerialDescriptor serialDescriptor) {
        this.c = serialDescriptor;
    }

    public Iterator<String> iterator() {
        return new a(this);
    }
}
