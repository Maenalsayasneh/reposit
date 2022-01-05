package i0.f.a.c.p.f;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.c.p.c;

/* compiled from: AsWrapperTypeSerializer */
public class e extends l {
    public e(c cVar, BeanProperty beanProperty) {
        super(cVar, beanProperty);
    }

    public i0.f.a.c.p.e a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new e(this.a, beanProperty);
    }

    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }
}
