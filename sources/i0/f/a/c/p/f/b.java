package i0.f.a.c.p.f;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.c.p.c;

/* compiled from: AsExistingPropertyTypeSerializer */
public class b extends d {
    public b(c cVar, BeanProperty beanProperty, String str) {
        super(cVar, beanProperty, str);
    }

    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }

    /* renamed from: i */
    public b h(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new b(this.a, beanProperty, this.c);
    }
}
