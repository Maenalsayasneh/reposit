package i0.l.a.i.a;

import i0.l.a.i.a.i.l;
import i0.l.a.i.a.i.n;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: JSONValue */
public class f {
    public static e a = e.a;
    public static l b = new l();

    public static void a(String str, Appendable appendable, e eVar) {
        if (str != null) {
            eVar.h.a(str, appendable);
        }
    }

    public static void b(Object obj, Appendable appendable, e eVar) throws IOException {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        n nVar = b.k.get(cls);
        if (nVar == null) {
            if (cls.isArray()) {
                nVar = l.i;
            } else {
                l lVar = b;
                Class<?> cls2 = obj.getClass();
                Iterator it = lVar.l.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        nVar = null;
                        break;
                    }
                    l.i iVar = (l.i) it.next();
                    if (iVar.a.isAssignableFrom(cls2)) {
                        nVar = iVar.b;
                        break;
                    }
                }
                if (nVar == null) {
                    nVar = l.h;
                }
            }
            b.a(nVar, cls);
        }
        nVar.a(obj, appendable, eVar);
    }
}
