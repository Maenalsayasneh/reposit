package i0.f.a.b.j;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import i0.d.a.a.a;
import i0.f.a.b.c;

/* compiled from: JsonWriteContext */
public class e extends c {
    public final e c;
    public b d;
    public e e;
    public String f;
    public Object g;
    public boolean h;

    public e(int i, e eVar, b bVar) {
        this.a = i;
        this.c = eVar;
        this.d = bVar;
        this.b = -1;
    }

    public static e m(b bVar) {
        return new e(0, (e) null, bVar);
    }

    public final String a() {
        return this.f;
    }

    public Object b() {
        return this.g;
    }

    public c c() {
        return this.c;
    }

    public void g(Object obj) {
        this.g = obj;
    }

    public e i() {
        b bVar;
        e eVar = this.e;
        if (eVar == null) {
            b bVar2 = this.d;
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = bVar2.a();
            }
            e eVar2 = new e(1, this, bVar);
            this.e = eVar2;
            return eVar2;
        }
        eVar.n(1);
        return eVar;
    }

    public e j(Object obj) {
        b bVar;
        e eVar = this.e;
        if (eVar == null) {
            b bVar2 = this.d;
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = bVar2.a();
            }
            e eVar2 = new e(1, this, bVar, obj);
            this.e = eVar2;
            return eVar2;
        }
        eVar.o(1, obj);
        return eVar;
    }

    public e k() {
        b bVar;
        e eVar = this.e;
        if (eVar == null) {
            b bVar2 = this.d;
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = bVar2.a();
            }
            e eVar2 = new e(2, this, bVar);
            this.e = eVar2;
            return eVar2;
        }
        eVar.n(2);
        return eVar;
    }

    public e l(Object obj) {
        b bVar;
        e eVar = this.e;
        if (eVar == null) {
            b bVar2 = this.d;
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = bVar2.a();
            }
            e eVar2 = new e(2, this, bVar, obj);
            this.e = eVar2;
            return eVar2;
        }
        eVar.o(2, obj);
        return eVar;
    }

    public e n(int i) {
        this.a = i;
        this.b = -1;
        this.f = null;
        this.h = false;
        this.g = null;
        b bVar = this.d;
        if (bVar != null) {
            bVar.c();
        }
        return this;
    }

    public e o(int i, Object obj) {
        this.a = i;
        this.b = -1;
        this.f = null;
        this.h = false;
        this.g = obj;
        b bVar = this.d;
        if (bVar != null) {
            bVar.c();
        }
        return this;
    }

    public int p(String str) throws JsonProcessingException {
        if (this.a != 2 || this.h) {
            return 4;
        }
        this.h = true;
        this.f = str;
        b bVar = this.d;
        if (bVar != null && bVar.b(str)) {
            Object obj = bVar.a;
            throw new JsonGenerationException(a.o0("Duplicate field '", str, "'"), obj instanceof JsonGenerator ? (JsonGenerator) obj : null);
        } else if (this.b < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int q() {
        int i = this.a;
        if (i == 2) {
            if (!this.h) {
                return 5;
            }
            this.h = false;
            this.b++;
            return 2;
        } else if (i == 1) {
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 < 0) {
                return 0;
            }
            return 1;
        } else {
            int i3 = this.b + 1;
            this.b = i3;
            if (i3 == 0) {
                return 0;
            }
            return 3;
        }
    }

    public e(int i, e eVar, b bVar, Object obj) {
        this.a = i;
        this.c = eVar;
        this.d = bVar;
        this.b = -1;
        this.g = obj;
    }
}
