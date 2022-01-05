package i0.e.b.g3.u;

import com.clubhouse.android.ui.profile.FollowListArgs;
import com.clubhouse.android.ui.profile.FollowListType;
import h0.u.w;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FollowListViewModel.kt */
public final class l4 implements j {
    public final FollowListType a;
    public final int b;
    public final long c;
    public final w<i0.e.b.b3.b.e.j> d;

    public l4() {
        this((FollowListType) null, 0, 0, (w) null, 15, (f) null);
    }

    public l4(FollowListType followListType, int i, long j, w<i0.e.b.b3.b.e.j> wVar) {
        i.e(followListType, "listType");
        this.a = followListType;
        this.b = i;
        this.c = j;
        this.d = wVar;
    }

    public static l4 copy$default(l4 l4Var, FollowListType followListType, int i, long j, w<i0.e.b.b3.b.e.j> wVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            followListType = l4Var.a;
        }
        if ((i2 & 2) != 0) {
            i = l4Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = l4Var.c;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            wVar = l4Var.d;
        }
        w<i0.e.b.b3.b.e.j> wVar2 = wVar;
        Objects.requireNonNull(l4Var);
        i.e(followListType, "listType");
        return new l4(followListType, i3, j2, wVar2);
    }

    public final FollowListType component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final long component3() {
        return this.c;
    }

    public final w<i0.e.b.b3.b.e.j> component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.a == l4Var.a && this.b == l4Var.b && this.c == l4Var.c && i.a(this.d, l4Var.d);
    }

    public int hashCode() {
        int hashCode = (Long.hashCode(this.c) + a.M(this.b, this.a.hashCode() * 31, 31)) * 31;
        w<i0.e.b.b3.b.e.j> wVar = this.d;
        return hashCode + (wVar == null ? 0 : wVar.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("FollowListState(listType=");
        P0.append(this.a);
        P0.append(", userId=");
        P0.append(this.b);
        P0.append(", notificationId=");
        P0.append(this.c);
        P0.append(", data=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l4(com.clubhouse.android.ui.profile.FollowListType r4, int r5, long r6, h0.u.w r8, int r9, m0.n.b.f r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            com.clubhouse.android.ui.profile.FollowListType r4 = com.clubhouse.android.ui.profile.FollowListType.FOLLOWERS
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000b
            r5 = 0
        L_0x000b:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0012
            r6 = 0
        L_0x0012:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0018
            r8 = 0
        L_0x0018:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.l4.<init>(com.clubhouse.android.ui.profile.FollowListType, int, long, h0.u.w, int, m0.n.b.f):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l4(FollowListArgs followListArgs) {
        this(followListArgs.q, followListArgs.c, followListArgs.d, (w) null, 8, (f) null);
        i.e(followListArgs, "args");
    }
}
