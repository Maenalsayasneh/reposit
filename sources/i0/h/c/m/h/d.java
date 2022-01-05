package i0.h.c.m.h;

import i0.h.c.m.a;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonDataEncoderBuilder */
public class d implements a {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public void a(Object obj, Writer writer) throws IOException {
        e eVar = this.a;
        f fVar = new f(writer, eVar.b, eVar.c, eVar.d, eVar.e);
        fVar.g(obj, false);
        fVar.i();
        fVar.b.flush();
    }
}
