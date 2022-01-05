package i0.e.b.g3.j.k0;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ActivityOverflowViewModel.kt */
public final class g implements j {
    public final List<ActionableNotification> a;

    public g() {
        this((List) null, 1, (f) null);
    }

    public g(List<ActionableNotification> list) {
        i.e(list, "actionableNotifications");
        this.a = list;
    }

    public static g copy$default(g gVar, List<ActionableNotification> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gVar.a;
        }
        Objects.requireNonNull(gVar);
        i.e(list, "actionableNotifications");
        return new g(list);
    }

    public final List<ActionableNotification> component1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && i.a(this.a, ((g) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("ActivityOverflowViewState(actionableNotifications="), this.a, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(List list, int i, f fVar) {
        this((i & 1) != 0 ? EmptyList.c : list);
    }
}
