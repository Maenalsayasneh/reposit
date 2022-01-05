package i0.l.a.i.a.i;

import java.io.IOException;

/* compiled from: JsonWriter */
public class e implements n<Float> {
    public e(l lVar) {
    }

    public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
        Float f = (Float) obj;
        if (f.isInfinite()) {
            appendable.append("null");
        } else {
            appendable.append(f.toString());
        }
    }
}
