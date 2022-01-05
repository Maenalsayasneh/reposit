package i0.h.a.d.a.b;

import i0.h.a.d.a.j.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final /* synthetic */ class n2 implements Runnable {
    public final q2 c;

    public n2(q2 q2Var) {
        this.c = q2Var;
    }

    public final void run() {
        q2 q2Var = this.c;
        e3 a = q2Var.c.a();
        y yVar = q2Var.b;
        Objects.requireNonNull(yVar);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            Iterator it = ((ArrayList) yVar.d()).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                a h = yVar.h(file.getName());
                if (h != null) {
                    hashMap2.put(file.getName(), h);
                }
            }
        } catch (IOException e) {
            y.a.b(6, "Could not process directory while scanning installed packs: %s", new Object[]{e});
        }
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, Long.valueOf(yVar.q(str)));
        }
        p<List<String>> n = a.n(hashMap);
        y yVar2 = q2Var.b;
        yVar2.getClass();
        n.d(q2Var.e.a(), new o2(yVar2));
        n.c(q2Var.e.a(), p2.a);
    }
}
