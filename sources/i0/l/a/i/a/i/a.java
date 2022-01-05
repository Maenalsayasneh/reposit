package i0.l.a.i.a.i;

import i0.l.a.i.a.e;
import i0.l.a.i.a.f;
import java.io.IOException;
import java.util.Objects;

/* compiled from: ArrayWriter */
public class a implements n<Object> {
    public <E> void a(E e, Appendable appendable, e eVar) throws IOException {
        Objects.requireNonNull(eVar);
        appendable.append('[');
        boolean z = false;
        for (Object obj : (Object[]) e) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            f.b(obj, appendable, eVar);
        }
        appendable.append(']');
    }
}
