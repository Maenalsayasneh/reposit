package i0.l.a.i.a.i;

import i0.l.a.i.a.e;
import java.io.IOException;
import java.util.Objects;

/* compiled from: JsonWriter */
public class k implements n<boolean[]> {
    public k(l lVar) {
    }

    public void a(Object obj, Appendable appendable, e eVar) throws IOException {
        Objects.requireNonNull(eVar);
        appendable.append('[');
        boolean z = false;
        for (boolean z2 : (boolean[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Boolean.toString(z2));
        }
        appendable.append(']');
    }
}
