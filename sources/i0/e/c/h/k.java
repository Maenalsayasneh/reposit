package i0.e.c.h;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import i0.b.b.j;
import i0.e.c.f.b.a.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: BackchannelInboxViewModel.kt */
public final class k implements j {
    public final List<a> a;
    public final List<a> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ChatDestination g;

    public k() {
        this((List) null, (List) null, false, false, false, false, (ChatDestination) null, 127, (f) null);
    }

    public k(List<a> list, List<a> list2, boolean z, boolean z2, boolean z3, boolean z4, ChatDestination chatDestination) {
        i.e(list, "chats");
        i.e(list2, "requests");
        i.e(chatDestination, "selectedTab");
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = chatDestination;
    }

    public static k copy$default(k kVar, List<a> list, List<a> list2, boolean z, boolean z2, boolean z3, boolean z4, ChatDestination chatDestination, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kVar.a;
        }
        if ((i & 2) != 0) {
            list2 = kVar.b;
        }
        List<a> list3 = list2;
        if ((i & 4) != 0) {
            z = kVar.c;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = kVar.d;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = kVar.e;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = kVar.f;
        }
        boolean z8 = z4;
        if ((i & 64) != 0) {
            chatDestination = kVar.g;
        }
        ChatDestination chatDestination2 = chatDestination;
        Objects.requireNonNull(kVar);
        i.e(list, "chats");
        i.e(list3, "requests");
        i.e(chatDestination2, "selectedTab");
        return new k(list, list3, z5, z6, z7, z8, chatDestination2);
    }

    public final List<a> component1() {
        return this.a;
    }

    public final List<a> component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    public final ChatDestination component7() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.a, kVar.a) && i.a(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && this.g == kVar.g;
    }

    public int hashCode() {
        int H = i0.d.a.a.a.H(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (H + (z ? 1 : 0)) * 31;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.e;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f;
        if (!z5) {
            z2 = z5;
        }
        return this.g.hashCode() + ((i3 + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BackchannelInboxState(chats=");
        P0.append(this.a);
        P0.append(", requests=");
        P0.append(this.b);
        P0.append(", loading=");
        P0.append(this.c);
        P0.append(", error=");
        P0.append(this.d);
        P0.append(", unreadRequests=");
        P0.append(this.e);
        P0.append(", requestsEnabled=");
        P0.append(this.f);
        P0.append(", selectedTab=");
        P0.append(this.g);
        P0.append(')');
        return P0.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(java.util.List r6, java.util.List r7, boolean r8, boolean r9, boolean r10, boolean r11, com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r12, int r13, m0.n.b.f r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.c
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000c
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.c
        L_0x000c:
            r14 = r7
            r7 = r13 & 4
            r0 = 0
            if (r7 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r8
        L_0x0015:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r9
        L_0x001c:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            r10 = 1
        L_0x0021:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r11
        L_0x0028:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002e
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r12 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination.CHATS
        L_0x002e:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r0
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.c.h.k.<init>(java.util.List, java.util.List, boolean, boolean, boolean, boolean, com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination, int, m0.n.b.f):void");
    }
}
