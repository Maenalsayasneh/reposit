package h0.g0.r;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import h0.g0.i;
import h0.g0.k;
import h0.g0.m;
import h0.g0.o;
import h0.g0.r.t.d;
import h0.g0.r.t.q.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl */
public class g extends m {
    public static final String a = i.e("WorkContinuationImpl");
    public final l b;
    public final String c;
    public final ExistingWorkPolicy d;
    public final List<? extends o> e;
    public final List<String> f;
    public final List<String> g;
    public final List<g> h = null;
    public boolean i;
    public k j;

    public g(l lVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends o> list, List<g> list2) {
        this.b = lVar;
        this.c = str;
        this.d = existingWorkPolicy;
        this.e = list;
        this.f = new ArrayList(list.size());
        this.g = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a2 = ((o) list.get(i2)).a();
            this.f.add(a2);
            this.g.add(a2);
        }
    }

    public static boolean b(g gVar, Set<String> set) {
        set.addAll(gVar.f);
        Set<String> c2 = c(gVar);
        for (String contains : set) {
            if (((HashSet) c2).contains(contains)) {
                return true;
            }
        }
        List<g> list = gVar.h;
        if (list != null && !list.isEmpty()) {
            for (g b2 : list) {
                if (b(b2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.f);
        return false;
    }

    public static Set<String> c(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> list = gVar.h;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                hashSet.addAll(gVar2.f);
            }
        }
        return hashSet;
    }

    public k a() {
        if (!this.i) {
            d dVar = new d(this);
            ((b) this.b.h).a.execute(dVar);
            this.j = dVar.q;
        } else {
            i.c().f(a, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f)}), new Throwable[0]);
        }
        return this.j;
    }
}
