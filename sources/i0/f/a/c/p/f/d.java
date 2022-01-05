package i0.f.a.c.p.f;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.c.p.c;

/* compiled from: AsPropertyTypeSerializer */
public class d extends a {
    public final String c;

    public d(c cVar, BeanProperty beanProperty, String str) {
        super(cVar, beanProperty);
        this.c = str;
    }

    public String b() {
        return this.c;
    }

    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.PROPERTY;
    }

    /* renamed from: h */
    public d g(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new d(this.a, beanProperty, this.c);
    }
}
