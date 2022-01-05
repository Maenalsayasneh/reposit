package i0.l.a.i.a.i;

import i0.l.a.i.a.e;
import java.io.IOException;
import java.util.Objects;

/* compiled from: JsonWriter */
public class h implements n<long[]> {
    public h(l lVar) {
    }

    public void a(Object obj, Appendable appendable, e eVar) throws IOException {
        Objects.requireNonNull(eVar);
        appendable.append('[');
        boolean z = false;
        for (long j : (long[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Long.toString(j));
        }
        appendable.append(']');
    }
}
