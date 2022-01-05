package i0.e.b.g3.m.g;

import com.clubhouse.android.data.models.local.ParentTopic;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: TopicsViewModel.kt */
public final class d implements j {
    public final List<ParentTopic> a;
    public final Set<Integer> b;

    public d() {
        this((List) null, (Set) null, 3, (f) null);
    }

    public d(List<ParentTopic> list, Set<Integer> set) {
        i.e(list, "topics");
        i.e(set, "selected");
        this.a = list;
        this.b = set;
    }

    public static d copy$default(d dVar, List<ParentTopic> list, Set<Integer> set, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dVar.a;
        }
        if ((i & 2) != 0) {
            set = dVar.b;
        }
        Objects.requireNonNull(dVar);
        i.e(list, "topics");
        i.e(set, "selected");
        return new d(list, set);
    }

    public final List<ParentTopic> component1() {
        return this.a;
    }

    public final Set<Integer> component2() {
        return this.b;
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
        StringBuilder P0 = a.P0("TopicsViewState(topics=");
        P0.append(this.a);
        P0.append(", selected=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(List list, Set set, int i, f fVar) {
        this((i & 1) != 0 ? EmptyList.c : list, (i & 2) != 0 ? EmptySet.c : set);
    }
}
