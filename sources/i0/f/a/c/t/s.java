package i0.f.a.c.t;

import com.fasterxml.jackson.core.JsonLocation;
import i0.f.a.b.c;

/* compiled from: TokenBufferReadContext */
public class s extends c {
    public final c c;
    public final JsonLocation d;
    public String e;
    public Object f;

    public s(c cVar, JsonLocation jsonLocation) {
        super(cVar);
        this.c = cVar.c();
        this.e = cVar.a();
        this.f = cVar.b();
        this.d = jsonLocation;
    }

    public String a() {
        return this.e;
    }

    public Object b() {
        return this.f;
    }

    public c c() {
        return this.c;
    }

    public void g(Object obj) {
        this.f = obj;
    }

    public s() {
        super(0, -1);
        this.c = null;
        this.d = JsonLocation.c;
    }

    public s(s sVar, int i, int i2) {
        super(i, i2);
        this.c = sVar;
        this.d = sVar.d;
    }
}
