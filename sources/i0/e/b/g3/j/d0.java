package i0.e.b.g3.j;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import h0.u.w;
import i0.b.b.j;
import i0.d.a.a.a;
import i0.e.b.b3.b.e.i;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;

/* compiled from: ActivityViewModel.kt */
public final class d0 implements j {
    public final w<i> a;
    public final List<ActionableNotification> b;
    public final List<ActionableNotification> c;

    public d0() {
        this((w) null, (List) null, (List) null, 7, (f) null);
    }

    public d0(w<i> wVar, List<ActionableNotification> list, List<ActionableNotification> list2) {
        m0.n.b.i.e(wVar, "notificationRequest");
        m0.n.b.i.e(list, "actionableNotifications");
        m0.n.b.i.e(list2, "onClubHouseNotifications");
        this.a = wVar;
        this.b = list;
        this.c = list2;
    }

    public static d0 copy$default(d0 d0Var, w<i> wVar, List<ActionableNotification> list, List<ActionableNotification> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = d0Var.a;
        }
        if ((i & 2) != 0) {
            list = d0Var.b;
        }
        if ((i & 4) != 0) {
            list2 = d0Var.c;
        }
        Objects.requireNonNull(d0Var);
        m0.n.b.i.e(wVar, "notificationRequest");
        m0.n.b.i.e(list, "actionableNotifications");
        m0.n.b.i.e(list2, "onClubHouseNotifications");
        return new d0(wVar, list, list2);
    }

    public final w<i> component1() {
        return this.a;
    }

    public final List<ActionableNotification> component2() {
        return this.b;
    }

    public final List<ActionableNotification> component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return m0.n.b.i.a(this.a, d0Var.a) && m0.n.b.i.a(this.b, d0Var.b) && m0.n.b.i.a(this.c, d0Var.c);
    }

    public int hashCode() {
        return this.c.hashCode() + a.H(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActivityViewState(notificationRequest=");
        P0.append(this.a);
        P0.append(", actionableNotifications=");
        P0.append(this.b);
        P0.append(", onClubHouseNotifications=");
        return a.A0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d0(w wVar, List list, List list2, int i, f fVar) {
        this((i & 1) != 0 ? w.c.a() : wVar, (i & 2) != 0 ? EmptyList.c : list, (i & 4) != 0 ? EmptyList.c : list2);
    }

    public d0(int i) {
        this((w) null, (List) null, (List) null, 7, (f) null);
    }
}
