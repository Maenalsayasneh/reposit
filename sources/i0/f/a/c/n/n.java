package i0.f.a.c.n;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.PropertyName;
import i0.d.a.a.a;
import i0.f.a.a.a0;
import i0.f.a.a.z;
import i0.f.a.c.t.f;

/* compiled from: ObjectIdInfo */
public class n {
    public static final n a = new n(PropertyName.d, Object.class, (Class<? extends ObjectIdGenerator<?>>) null, false, (Class<? extends z>) null);
    public final PropertyName b;
    public final Class<? extends ObjectIdGenerator<?>> c;
    public final Class<? extends z> d;
    public final Class<?> e;
    public final boolean f;

    public n(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z, Class<? extends z> cls3) {
        this.b = propertyName;
        this.e = cls;
        this.c = cls2;
        this.f = z;
        this.d = cls3 == null ? a0.class : cls3;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ObjectIdInfo: propName=");
        P0.append(this.b);
        P0.append(", scope=");
        P0.append(f.E(this.e));
        P0.append(", generatorType=");
        P0.append(f.E(this.c));
        P0.append(", alwaysAsId=");
        P0.append(this.f);
        return P0.toString();
    }
}
