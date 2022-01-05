package i0.l.a.i.a.i;

import i0.l.a.i.a.e;
import i0.l.a.i.a.f;
import java.io.IOException;
import java.util.Date;

/* compiled from: JsonWriter */
public class d implements n<Date> {
    public d(l lVar) {
    }

    public void a(Object obj, Appendable appendable, e eVar) throws IOException {
        appendable.append('\"');
        f.a(((Date) obj).toString(), appendable, eVar);
        appendable.append('\"');
    }
}
