package i0.f.a.c.p.f;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.c.p.e;

/* compiled from: AsExternalTypeSerializer */
public class c extends l {
    public final String c;

    public c(i0.f.a.c.p.c cVar, BeanProperty beanProperty, String str) {
        super(cVar, beanProperty);
        this.c = str;
    }

    public e a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new c(this.a, beanProperty, this.c);
    }

    public String b() {
        return this.c;
    }

    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }
}
