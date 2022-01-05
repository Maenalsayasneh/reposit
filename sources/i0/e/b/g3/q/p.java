package i0.e.b.g3.q;

import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.ui.invites.PendingInvitesArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PendingInvitesViewModel.kt */
public final class p implements j {
    public final List<SuggestedInvite> a;

    public p() {
        this((List) null, 1, (f) null);
    }

    public p(List<SuggestedInvite> list) {
        i.e(list, "pendingInvites");
        this.a = list;
    }

    public static p copy$default(p pVar, List<SuggestedInvite> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pVar.a;
        }
        Objects.requireNonNull(pVar);
        i.e(list, "pendingInvites");
        return new p(list);
    }

    public final List<SuggestedInvite> component1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && i.a(this.a, ((p) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("PendingInvitesViewState(pendingInvites="), this.a, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p(PendingInvitesArgs pendingInvitesArgs) {
        this(pendingInvitesArgs.c);
        i.e(pendingInvitesArgs, "args");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p(List list, int i, f fVar) {
        this((List<SuggestedInvite>) (i & 1) != 0 ? EmptyList.c : list);
    }
}
