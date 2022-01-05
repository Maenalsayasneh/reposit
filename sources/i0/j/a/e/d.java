package i0.j.a.e;

import h0.f.a;
import java.util.Map;

/* compiled from: APMPerSessionConfigurationProviderImpl */
public class d {
    public Map<String, Object> a = new a();

    public Object a(String str, Object obj) {
        Object obj2 = this.a.get(str);
        return (obj2 == null || !obj2.getClass().isInstance(obj)) ? obj : obj2;
    }
}
