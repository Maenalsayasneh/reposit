package i0.f.a.a;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import i0.d.a.a.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SimpleObjectIdResolver */
public class a0 implements z {
    public Map<ObjectIdGenerator.IdKey, Object> a;

    public void a(ObjectIdGenerator.IdKey idKey, Object obj) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.a;
        if (map == null) {
            this.a = new HashMap();
        } else {
            Object obj2 = map.get(idKey);
            if (obj2 != null) {
                if (obj2 != obj) {
                    StringBuilder P0 = a.P0("Already had POJO for id (");
                    P0.append(idKey.q.getClass().getName());
                    P0.append(") [");
                    P0.append(idKey);
                    P0.append("]");
                    throw new IllegalStateException(P0.toString());
                }
                return;
            }
        }
        this.a.put(idKey, obj);
    }

    public z b(Object obj) {
        return new a0();
    }

    public boolean c(z zVar) {
        return zVar.getClass() == a0.class;
    }

    public Object d(ObjectIdGenerator.IdKey idKey) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }
}
