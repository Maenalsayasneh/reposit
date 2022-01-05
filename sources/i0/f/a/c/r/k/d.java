package i0.f.a.c.r.k;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;

/* compiled from: TypeWrappedSerializer */
public final class d extends g<Object> implements i0.f.a.c.r.d {
    public final e c;
    public final g<Object> d;

    public d(e eVar, g<?> gVar) {
        this.c = eVar;
        this.d = gVar;
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        g gVar = this.d;
        if (gVar instanceof i0.f.a.c.r.d) {
            gVar = iVar.U(gVar, beanProperty);
        }
        if (gVar == this.d) {
            return this;
        }
        return new d(this.c, gVar);
    }

    public Class<Object> c() {
        return Object.class;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        this.d.g(obj, jsonGenerator, iVar, this.c);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        this.d.g(obj, jsonGenerator, iVar, eVar);
    }
}
