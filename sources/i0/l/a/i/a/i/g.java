package i0.l.a.i.a.i;

import i0.l.a.i.a.e;
import java.io.IOException;
import java.util.Objects;

/* compiled from: JsonWriter */
public class g implements n<short[]> {
    public g(l lVar) {
    }

    public void a(Object obj, Appendable appendable, e eVar) throws IOException {
        Objects.requireNonNull(eVar);
        appendable.append('[');
        boolean z = false;
        for (short s : (short[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Short.toString(s));
        }
        appendable.append(']');
    }
}
