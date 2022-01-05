package i0.f.a.c.p.f;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.c.p.c;

/* compiled from: AsArrayTypeSerializer */
public class a extends l {
    public a(c cVar, BeanProperty beanProperty) {
        super(cVar, beanProperty);
    }

    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    /* renamed from: g */
    public a a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new a(this.a, beanProperty);
    }
}
