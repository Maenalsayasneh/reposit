package i0.e.b.b3.c;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.repos.ClubMembership;
import h0.b0.v;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.q;

/* compiled from: ClubCache.kt */
public final class b {
    public q<Map<Integer, ClubMembership>> a;
    public final d<Map<Integer, ClubMembership>> b;

    public b() {
        q<Map<Integer, ClubMembership>> a2 = a0.a(g.o());
        this.a = a2;
        this.b = a2;
    }

    public final void a(int i, ClubMembership clubMembership) {
        i.e(clubMembership, "membership");
        q<Map<Integer, ClubMembership>> qVar = this.a;
        qVar.setValue(g.c0(qVar.getValue(), new Pair(Integer.valueOf(i), clubMembership)));
    }

    public final void b(List<ClubWithAdmin> list) {
        if (list != null) {
            for (ClubWithAdmin clubWithAdmin : list) {
                a(clubWithAdmin.x, v.X0(clubWithAdmin));
            }
        }
    }
}
