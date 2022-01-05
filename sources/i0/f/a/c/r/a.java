package i0.f.a.c.r;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import java.util.Map;

/* compiled from: AnyGetterWriter */
public class a {
    public final BeanProperty a;
    public final AnnotatedMember b;
    public g<Object> c;
    public MapSerializer d;

    public a(BeanProperty beanProperty, AnnotatedMember annotatedMember, g<?> gVar) {
        this.b = annotatedMember;
        this.a = beanProperty;
        this.c = gVar;
        if (gVar instanceof MapSerializer) {
            this.d = (MapSerializer) gVar;
        }
    }

    public void a(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception {
        Object l = this.b.l(obj);
        if (l != null) {
            if (l instanceof Map) {
                MapSerializer mapSerializer = this.d;
                if (mapSerializer != null) {
                    mapSerializer.z((Map) l, jsonGenerator, iVar);
                } else {
                    this.c.f(l, jsonGenerator, iVar);
                }
            } else {
                iVar.n(this.a.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", new Object[]{this.b.d(), l.getClass().getName()}));
                throw null;
            }
        }
    }
}
