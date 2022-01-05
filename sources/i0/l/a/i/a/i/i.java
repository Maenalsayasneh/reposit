package i0.l.a.i.a.i;

import i0.l.a.i.a.e;
import java.io.IOException;
import java.util.Objects;

/* compiled from: JsonWriter */
public class i implements n<float[]> {
    public i(l lVar) {
    }

    public void a(Object obj, Appendable appendable, e eVar) throws IOException {
        Objects.requireNonNull(eVar);
        appendable.append('[');
        boolean z = false;
        for (float f : (float[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Float.toString(f));
        }
        appendable.append(']');
    }
}
