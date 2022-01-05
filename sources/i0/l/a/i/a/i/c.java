package i0.l.a.i.a.i;

import i0.l.a.i.a.e;
import java.io.IOException;

/* compiled from: JsonWriter */
public class c implements n<Double> {
    public c(l lVar) {
    }

    public void a(Object obj, Appendable appendable, e eVar) throws IOException {
        Double d = (Double) obj;
        if (d.isInfinite()) {
            appendable.append("null");
        } else {
            appendable.append(d.toString());
        }
    }
}
