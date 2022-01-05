package i0.e.b.g3.n;

import h0.u.w;
import i0.b.b.j;
import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.m;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ChooseUsersViewModel.kt */
public final class q implements j {
    public final w<a<m>> a;
    public final List<m> b;

    public q() {
        this((w) null, (List) null, 3, (f) null);
    }

    public q(w<a<m>> wVar, List<m> list) {
        i.e(wVar, "userData");
        i.e(list, "selectedUsers");
        this.a = wVar;
        this.b = list;
    }

    public static q copy$default(q qVar, w<a<m>> wVar, List<m> list, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = qVar.a;
        }
        if ((i & 2) != 0) {
            list = qVar.b;
        }
        Objects.requireNonNull(qVar);
        i.e(wVar, "userData");
        i.e(list, "selectedUsers");
        return new q(wVar, list);
    }

    public final w<a<m>> component1() {
        return this.a;
    }

    public final List<m> component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return i.a(this.a, qVar.a) && i.a(this.b, qVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChooseUsersViewState(userData=");
        P0.append(this.a);
        P0.append(", selectedUsers=");
        return i0.d.a.a.a.A0(P0, this.b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q(w wVar, List list, int i, f fVar) {
        this((i & 1) != 0 ? w.c.a() : wVar, (i & 2) != 0 ? EmptyList.c : list);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(com.clubhouse.android.ui.creation.ChooseUsersArgs r10) {
        /*
            r9 = this;
            java.lang.String r0 = "args"
            m0.n.b.i.e(r10, r0)
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r10 = r10.c
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = i0.j.f.p.h.K(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L_0x0016:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r10.next()
            r3 = r1
            com.clubhouse.android.data.models.local.user.UserInList r3 = (com.clubhouse.android.data.models.local.user.UserInList) r3
            i0.e.b.b3.b.e.m r1 = new i0.e.b.b3.b.e.m
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 30
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            goto L_0x0016
        L_0x0033:
            r10 = 1
            r1 = 0
            r9.<init>(r1, r0, r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.n.q.<init>(com.clubhouse.android.ui.creation.ChooseUsersArgs):void");
    }
}
