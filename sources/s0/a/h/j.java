package s0.a.h;

import s0.a.g.h;

public class j implements h {
    public k c;
    public k d;
    public l q;

    public Object clone() {
        j jVar = new j();
        jVar.q = this.q;
        k kVar = this.c;
        if (kVar != null) {
            jVar.c = (k) kVar.clone();
        }
        k kVar2 = this.d;
        if (kVar2 != null) {
            jVar.d = (k) kVar2.clone();
        }
        return jVar;
    }

    public boolean r0(Object obj) {
        try {
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            k kVar = this.c;
            if (kVar != null && !kVar.r0(lVar.a)) {
                return false;
            }
            k kVar2 = this.d;
            if (kVar2 != null && !kVar2.r0(lVar.b)) {
                return false;
            }
            l lVar2 = this.q;
            if (lVar2 != null) {
                return lVar2.equals(obj);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
