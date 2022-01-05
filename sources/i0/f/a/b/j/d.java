package i0.f.a.b.j;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import i0.d.a.a.a;
import i0.f.a.b.c;

/* compiled from: JsonReadContext */
public final class d extends c {
    public final d c;
    public b d;
    public d e;
    public String f;
    public Object g;
    public int h;
    public int i;

    public d(d dVar, b bVar, int i2, int i3, int i4) {
        this.c = dVar;
        this.d = bVar;
        this.a = i2;
        this.h = i3;
        this.i = i4;
        this.b = -1;
    }

    public String a() {
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

    public d i() {
        this.g = null;
        return this.c;
    }

    public d j(int i2, int i3) {
        b bVar;
        d dVar = this.e;
        if (dVar == null) {
            b bVar2 = this.d;
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = bVar2.a();
            }
            dVar = new d(this, bVar, 1, i2, i3);
            this.e = dVar;
        } else {
            dVar.m(1, i2, i3);
        }
        return dVar;
    }

    public d k(int i2, int i3) {
        b bVar;
        d dVar = this.e;
        if (dVar == null) {
            b bVar2 = this.d;
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = bVar2.a();
            }
            d dVar2 = new d(this, bVar, 2, i2, i3);
            this.e = dVar2;
            return dVar2;
        }
        dVar.m(2, i2, i3);
        return dVar;
    }

    public boolean l() {
        int i2 = this.b + 1;
        this.b = i2;
        if (this.a == 0 || i2 <= 0) {
            return false;
        }
        return true;
    }

    public void m(int i2, int i3, int i4) {
        this.a = i2;
        this.b = -1;
        this.h = i3;
        this.i = i4;
        this.f = null;
        this.g = null;
        b bVar = this.d;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void n(String str) throws JsonProcessingException {
        this.f = str;
        b bVar = this.d;
        if (bVar != null && bVar.b(str)) {
            Object obj = bVar.a;
            throw new JsonParseException(obj instanceof JsonParser ? (JsonParser) obj : null, a.o0("Duplicate field '", str, "'"));
        }
    }
}
