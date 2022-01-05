package i0.f.a.c.t;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.f;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;

/* compiled from: RawValue */
public class p implements f {
    public Object c;

    public p(String str) {
        this.c = str;
    }

    public void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        Object obj = this.c;
        if (obj instanceof f) {
            ((f) obj).b(jsonGenerator, iVar);
        } else if (obj instanceof i0.f.a.b.f) {
            jsonGenerator.D0((i0.f.a.b.f) obj);
        } else {
            jsonGenerator.F0(String.valueOf(obj));
        }
    }

    public void c(JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Object obj = this.c;
        if (obj instanceof f) {
            ((f) obj).c(jsonGenerator, iVar, eVar);
        } else if (obj instanceof i0.f.a.b.f) {
            b(jsonGenerator, iVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        Object obj2 = this.c;
        Object obj3 = ((p) obj).c;
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 == null || !obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return String.format("[RawValue of type %s]", new Object[]{f.f(this.c)});
    }
}
