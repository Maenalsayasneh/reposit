package i0.e.b.g3.l.v2.z;

import com.clubhouse.android.data.models.local.ParentTopic;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.ui.clubs.create.topics.ClubTopicsArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ClubTopicsViewModel.kt */
public final class d implements j {
    public final Club a;
    public final List<ParentTopic> b;
    public final List<Topic> c;
    public final boolean d;

    public d() {
        this((Club) null, (List) null, (List) null, 7, (f) null);
    }

    public d(Club club, List<ParentTopic> list, List<Topic> list2) {
        i.e(list2, "selectedTopics");
        this.a = club;
        this.b = list;
        this.c = list2;
        this.d = list2.size() < 3;
    }

    public static d copy$default(d dVar, Club club, List<ParentTopic> list, List<Topic> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            club = dVar.a;
        }
        if ((i & 2) != 0) {
            list = dVar.b;
        }
        if ((i & 4) != 0) {
            list2 = dVar.c;
        }
        Objects.requireNonNull(dVar);
        i.e(list2, "selectedTopics");
        return new d(club, list, list2);
    }

    public final Club component1() {
        return this.a;
    }

    public final List<ParentTopic> component2() {
        return this.b;
    }

    public final List<Topic> component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.b, dVar.b) && i.a(this.c, dVar.c);
    }

    public int hashCode() {
        Club club = this.a;
        int i = 0;
        int hashCode = (club == null ? 0 : club.hashCode()) * 31;
        List<ParentTopic> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ClubTopicsViewState(club=");
        P0.append(this.a);
        P0.append(", topics=");
        P0.append(this.b);
        P0.append(", selectedTopics=");
        return a.A0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(ClubTopicsArgs clubTopicsArgs) {
        this(clubTopicsArgs.c, (List) null, clubTopicsArgs.d, 2, (f) null);
        i.e(clubTopicsArgs, "args");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Club club, List list, List list2, int i, f fVar) {
        this((i & 1) != 0 ? null : club, (i & 2) != 0 ? null : list, (i & 4) != 0 ? EmptyList.c : list2);
    }
}
