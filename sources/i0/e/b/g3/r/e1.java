package i0.e.b.g3.r;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.b.b.j;
import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.m;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FollowFriendsViewModel.kt */
public final class e1 implements j {
    public final List<m> a;
    public final Set<Integer> b;
    public final Set<Integer> c;
    public final boolean d;
    public final List<a<m>> e;

    public e1() {
        this((List) null, (Set) null, (Set) null, false, 15, (f) null);
    }

    public e1(List<m> list, Set<Integer> set, Set<Integer> set2, boolean z) {
        i.e(list, MessageExtension.FIELD_DATA);
        i.e(set, "preSelected");
        i.e(set2, "usersToFollow");
        this.a = list;
        this.b = set;
        this.c = set2;
        this.d = z;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (m mVar : list) {
            arrayList.add(new a(mVar, this.c.contains(mVar.g.getId())));
        }
        this.e = arrayList;
    }

    public static e1 copy$default(e1 e1Var, List<m> list, Set<Integer> set, Set<Integer> set2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = e1Var.a;
        }
        if ((i & 2) != 0) {
            set = e1Var.b;
        }
        if ((i & 4) != 0) {
            set2 = e1Var.c;
        }
        if ((i & 8) != 0) {
            z = e1Var.d;
        }
        Objects.requireNonNull(e1Var);
        i.e(list, MessageExtension.FIELD_DATA);
        i.e(set, "preSelected");
        i.e(set2, "usersToFollow");
        return new e1(list, set, set2, z);
    }

    public final Set<Integer> component2() {
        return this.b;
    }

    public final Set<Integer> component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return i.a(this.a, e1Var.a) && i.a(this.b, e1Var.b) && i.a(this.c, e1Var.c) && this.d == e1Var.d;
    }

    public int hashCode() {
        int I = i0.d.a.a.a.I(this.c, i0.d.a.a.a.I(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        if (z) {
            z = true;
        }
        return I + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FollowFriendsState(data=");
        P0.append(this.a);
        P0.append(", preSelected=");
        P0.append(this.b);
        P0.append(", usersToFollow=");
        P0.append(this.c);
        P0.append(", loading=");
        return i0.d.a.a.a.C0(P0, this.d, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e1(List list, Set set, Set set2, boolean z, int i, f fVar) {
        this((i & 1) != 0 ? EmptyList.c : list, (i & 2) != 0 ? EmptySet.c : set, (i & 4) != 0 ? EmptySet.c : set2, (i & 8) != 0 ? false : z);
    }
}
