package h0.g0.r;

import androidx.work.impl.WorkDatabase;
import h0.g0.a;
import h0.g0.i;
import h0.g0.r.s.o;
import h0.g0.r.s.p;
import h0.g0.r.s.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers */
public class f {
    public static final String a = i.e("Schedulers");

    /* JADX INFO: finally extract failed */
    public static void a(a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list != null && list.size() != 0) {
            p q = workDatabase.q();
            workDatabase.c();
            try {
                q qVar = (q) q;
                List<o> d = qVar.d(aVar.h);
                List<o> b = qVar.b(200);
                if (((ArrayList) d).size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((ArrayList) d).iterator();
                    while (it.hasNext()) {
                        qVar.l(((o) it.next()).a, currentTimeMillis);
                    }
                }
                workDatabase.k();
                workDatabase.g();
                ArrayList arrayList = (ArrayList) d;
                if (arrayList.size() > 0) {
                    o[] oVarArr = (o[]) arrayList.toArray(new o[arrayList.size()]);
                    for (e next : list) {
                        if (next.c()) {
                            next.a(oVarArr);
                        }
                    }
                }
                ArrayList arrayList2 = (ArrayList) b;
                if (arrayList2.size() > 0) {
                    o[] oVarArr2 = (o[]) arrayList2.toArray(new o[arrayList2.size()]);
                    for (e next2 : list) {
                        if (!next2.c()) {
                            next2.a(oVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        }
    }
}
