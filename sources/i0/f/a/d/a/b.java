package i0.f.a.d.a;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import i0.d.a.a.a;
import i0.f.a.b.c;

/* compiled from: CBORReadContext */
public final class b extends c {
    public final b c;
    public final i0.f.a.b.j.b d;
    public int e;
    public String f;
    public Object g;
    public b h = null;

    public b(b bVar, i0.f.a.b.j.b bVar2, int i, int i2) {
        this.c = bVar;
        this.d = bVar2;
        this.a = i;
        this.e = i2;
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

    public b i(int i) {
        i0.f.a.b.j.b bVar;
        b bVar2 = this.h;
        if (bVar2 == null) {
            i0.f.a.b.j.b bVar3 = this.d;
            if (bVar3 == null) {
                bVar = null;
            } else {
                bVar = bVar3.a();
            }
            bVar2 = new b(this, bVar, 1, i);
            this.h = bVar2;
        } else {
            bVar2.m(1, i);
        }
        return bVar2;
    }

    public b j(int i) {
        i0.f.a.b.j.b bVar;
        b bVar2 = this.h;
        if (bVar2 == null) {
            i0.f.a.b.j.b bVar3 = this.d;
            if (bVar3 == null) {
                bVar = null;
            } else {
                bVar = bVar3.a();
            }
            b bVar4 = new b(this, bVar, 2, i);
            this.h = bVar4;
            return bVar4;
        }
        bVar2.m(2, i);
        return bVar2;
    }

    public boolean k() {
        int i = this.b + 1;
        this.b = i;
        return i != this.e;
    }

    public boolean l() {
        return this.e >= 0;
    }

    public void m(int i, int i2) {
        this.a = i;
        this.e = i2;
        this.b = -1;
        this.f = null;
        this.g = null;
        i0.f.a.b.j.b bVar = this.d;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void n(String str) throws JsonProcessingException {
        this.f = str;
        i0.f.a.b.j.b bVar = this.d;
        if (bVar != null && bVar.b(str)) {
            String o02 = a.o0("Duplicate field '", str, "'");
            Object obj = bVar.a;
            throw new JsonParseException((JsonParser) null, o02, obj instanceof JsonParser ? ((JsonParser) obj).w() : null);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.a;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            int i2 = this.b;
            if (i2 < 0) {
                i2 = 0;
            }
            sb.append(i2);
            sb.append(']');
        } else if (i == 2) {
            sb.append('{');
            if (this.f != null) {
                sb.append('\"');
                i0.f.a.b.i.a.a(sb, this.f);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }
}
