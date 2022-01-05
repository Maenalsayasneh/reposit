package i0.e.b.b3.a.a.d.a;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FeedItem.kt */
public final class d extends e {
    public final List<EventInClub> a;
    public final List<EventInClub> b;

    public d() {
        this((List) null, (List) null, 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(List<EventInClub> list, List<EventInClub> list2) {
        super((f) null);
        i.e(list, "events");
        i.e(list2, "featuredEvents");
        this.a = list;
        this.b = list2;
    }

    public static d a(d dVar, List<EventInClub> list, List<EventInClub> list2, int i) {
        if ((i & 1) != 0) {
            list = dVar.a;
        }
        if ((i & 2) != 0) {
            list2 = dVar.b;
        }
        i.e(list, "events");
        i.e(list2, "featuredEvents");
        return new d(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.b, dVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventsFeedItem(events=");
        P0.append(this.a);
        P0.append(", featuredEvents=");
        return a.A0(P0, this.b, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(List list, List list2, int i) {
        super((f) null);
        EmptyList emptyList = (i & 1) != 0 ? EmptyList.c : null;
        EmptyList emptyList2 = (i & 2) != 0 ? EmptyList.c : null;
        i.e(emptyList, "events");
        i.e(emptyList2, "featuredEvents");
        this.a = emptyList;
        this.b = emptyList2;
    }
}
