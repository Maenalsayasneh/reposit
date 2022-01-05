package n0.c.i;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Iterables.kt */
public final class e implements Iterable<SerialDescriptor>, m0.n.b.s.a {
    public final /* synthetic */ SerialDescriptor c;

    /* compiled from: SerialDescriptor.kt */
    public static final class a implements Iterator<SerialDescriptor>, m0.n.b.s.a {
        public int c;
        public final /* synthetic */ e d;

        public a(e eVar) {
            this.d = eVar;
            this.c = eVar.c.e();
        }

        public boolean hasNext() {
            return this.c > 0;
        }

        public Object next() {
            SerialDescriptor serialDescriptor = this.d.c;
            int e = serialDescriptor.e();
            int i = this.c;
            this.c = i - 1;
            return serialDescriptor.h(e - i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(SerialDescriptor serialDescriptor) {
        this.c = serialDescriptor;
    }

    public Iterator<SerialDescriptor> iterator() {
        return new a(this);
    }
}
