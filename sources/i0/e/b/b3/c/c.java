package i0.e.b.b3.c;

import com.clubhouse.android.data.models.local.EventInClub;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.q;

/* compiled from: EventCache.kt */
public final class c {
    public q<Map<Integer, Boolean>> a = a0.a(g.o());

    public final void a(int i, boolean z) {
        q<Map<Integer, Boolean>> qVar = this.a;
        qVar.setValue(g.c0(qVar.getValue(), new Pair(Integer.valueOf(i), Boolean.valueOf(z))));
    }

    public final void b(List<EventInClub> list) {
        if (list != null) {
            for (EventInClub eventInClub : list) {
                a(eventInClub.Y1, i.a(eventInClub.x, Boolean.TRUE));
            }
        }
    }
}
