package i0.e.b.g3.n;

import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.remote.response.GetCreateChannelTargetsResponse;
import i0.b.b.b;
import i0.b.b.j;
import i0.e.b.z2.f.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CreateChannelViewModel.kt */
public final class t implements j {
    public final b<ChannelInRoomWithAccess> a;
    public final b<GetCreateChannelTargetsResponse> b;
    public final a c;
    public final List<UserInList> d;
    public final String e;
    public final boolean f;

    public t() {
        this((b) null, (b) null, (a) null, (List) null, (String) null, false, 63, (f) null);
    }

    public t(b<ChannelInRoomWithAccess> bVar, b<GetCreateChannelTargetsResponse> bVar2, a aVar, List<UserInList> list, String str, boolean z) {
        i.e(bVar, "createChannelRequest");
        i.e(bVar2, "targetsRequest");
        i.e(aVar, "audience");
        i.e(list, "selectedUsers");
        this.a = bVar;
        this.b = bVar2;
        this.c = aVar;
        this.d = list;
        this.e = str;
        this.f = z;
    }

    public static t copy$default(t tVar, b<ChannelInRoomWithAccess> bVar, b<GetCreateChannelTargetsResponse> bVar2, a aVar, List<UserInList> list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = tVar.a;
        }
        if ((i & 2) != 0) {
            bVar2 = tVar.b;
        }
        b<GetCreateChannelTargetsResponse> bVar3 = bVar2;
        if ((i & 4) != 0) {
            aVar = tVar.c;
        }
        a aVar2 = aVar;
        if ((i & 8) != 0) {
            list = tVar.d;
        }
        List<UserInList> list2 = list;
        if ((i & 16) != 0) {
            str = tVar.e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = tVar.f;
        }
        boolean z2 = z;
        Objects.requireNonNull(tVar);
        i.e(bVar, "createChannelRequest");
        i.e(bVar3, "targetsRequest");
        i.e(aVar2, "audience");
        i.e(list2, "selectedUsers");
        return new t(bVar, bVar3, aVar2, list2, str2, z2);
    }

    public final b<ChannelInRoomWithAccess> component1() {
        return this.a;
    }

    public final b<GetCreateChannelTargetsResponse> component2() {
        return this.b;
    }

    public final a component3() {
        return this.c;
    }

    public final List<UserInList> component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return i.a(this.a, tVar.a) && i.a(this.b, tVar.b) && i.a(this.c, tVar.c) && i.a(this.d, tVar.d) && i.a(this.e, tVar.e) && this.f == tVar.f;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int H = i0.d.a.a.a.H(this.d, (this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        int hashCode2 = (H + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CreateChannelViewState(createChannelRequest=");
        P0.append(this.a);
        P0.append(", targetsRequest=");
        P0.append(this.b);
        P0.append(", audience=");
        P0.append(this.c);
        P0.append(", selectedUsers=");
        P0.append(this.d);
        P0.append(", topic=");
        P0.append(this.e);
        P0.append(", selfInChannel=");
        return i0.d.a.a.a.C0(P0, this.f, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(i0.b.b.b r5, i0.b.b.b r6, i0.e.b.z2.f.a r7, java.util.List r8, java.lang.String r9, boolean r10, int r11, m0.n.b.f r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            i0.b.b.g0 r5 = i0.b.b.g0.b
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            i0.b.b.g0 r6 = i0.b.b.g0.b
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            com.clubhouse.android.channels.model.AudienceType r7 = com.clubhouse.android.channels.model.AudienceType.Open
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.c
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0020
            r9 = 0
        L_0x0020:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0026
            r10 = 0
        L_0x0026:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.n.t.<init>(i0.b.b.b, i0.b.b.b, i0.e.b.z2.f.a, java.util.List, java.lang.String, boolean, int, m0.n.b.f):void");
    }
}
