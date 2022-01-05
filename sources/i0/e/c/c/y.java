package i0.e.c.c;

import com.clubhouse.backchannel.chat.ChatArgs;
import com.clubhouse.backchannel.chat.style.MessageColor;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import i0.b.b.j;
import i0.e.c.f.b.a.a;
import i0.e.c.f.b.a.b;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: BackchannelChatViewModel.kt */
public final class y implements j {
    public final String a;
    public final a b;
    public final List<b> c;
    public final boolean d;
    public final boolean e;
    public final Map<Integer, MessageColor> f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public y(String str, a aVar, List<? extends b> list, boolean z, boolean z2, Map<Integer, ? extends MessageColor> map, boolean z3, boolean z4, boolean z5) {
        List<ChatMember> list2;
        i.e(str, "chatId");
        i.e(list, "chatSegments");
        i.e(map, "colors");
        this.a = str;
        this.b = aVar;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = map;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        boolean z6 = true;
        boolean z7 = !z && z2;
        this.j = z7;
        this.k = !z7;
        this.l = (aVar != null && (list2 = aVar.h) != null && list2.isEmpty()) || z4;
        ChatDestination chatDestination = null;
        ChatType chatType = ChatType.ONE_ON_ONE;
        this.m = (aVar != null ? aVar.t : chatDestination) != ChatDestination.REQUESTS ? false : z6;
    }

    public static y copy$default(y yVar, String str, a aVar, List list, boolean z, boolean z2, Map map, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        y yVar2 = yVar;
        int i3 = i2;
        String str2 = (i3 & 1) != 0 ? yVar2.a : str;
        a aVar2 = (i3 & 2) != 0 ? yVar2.b : aVar;
        List list2 = (i3 & 4) != 0 ? yVar2.c : list;
        boolean z6 = (i3 & 8) != 0 ? yVar2.d : z;
        boolean z7 = (i3 & 16) != 0 ? yVar2.e : z2;
        Map map2 = (i3 & 32) != 0 ? yVar2.f : map;
        boolean z8 = (i3 & 64) != 0 ? yVar2.g : z3;
        boolean z9 = (i3 & 128) != 0 ? yVar2.h : z4;
        boolean z10 = (i3 & 256) != 0 ? yVar2.i : z5;
        Objects.requireNonNull(yVar);
        i.e(str2, "chatId");
        i.e(list2, "chatSegments");
        i.e(map2, "colors");
        return new y(str2, aVar2, list2, z6, z7, map2, z8, z9, z10);
    }

    public final String component1() {
        return this.a;
    }

    public final a component2() {
        return this.b;
    }

    public final List<b> component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final Map<Integer, MessageColor> component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return i.a(this.a, yVar.a) && i.a(this.b, yVar.b) && i.a(this.c, yVar.c) && this.d == yVar.d && this.e == yVar.e && i.a(this.f, yVar.f) && this.g == yVar.g && this.h == yVar.h && this.i == yVar.i;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int H = i0.d.a.a.a.H(this.c, (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        boolean z = this.d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (H + (z ? 1 : 0)) * 31;
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = (this.f.hashCode() + ((i2 + (z3 ? 1 : 0)) * 31)) * 31;
        boolean z4 = this.g;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.h;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.i;
        if (!z6) {
            z2 = z6;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BackchannelChatState(chatId=");
        P0.append(this.a);
        P0.append(", chat=");
        P0.append(this.b);
        P0.append(", chatSegments=");
        P0.append(this.c);
        P0.append(", sendEnabled=");
        P0.append(this.d);
        P0.append(", startRoomEnabled=");
        P0.append(this.e);
        P0.append(", colors=");
        P0.append(this.f);
        P0.append(", blockWarningShown=");
        P0.append(this.g);
        P0.append(", blockWarningAccepted=");
        P0.append(this.h);
        P0.append(", roomLoading=");
        return i0.d.a.a.a.C0(P0, this.i, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public y(ChatArgs chatArgs) {
        this(chatArgs.c, (a) null, (List) null, false, false, (Map) null, false, false, false, 510, (f) null);
        i.e(chatArgs, "args");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y(java.lang.String r10, i0.e.c.f.b.a.a r11, java.util.List r12, boolean r13, boolean r14, java.util.Map r15, boolean r16, boolean r17, boolean r18, int r19, m0.n.b.f r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0009
        L_0x0008:
            r1 = r11
        L_0x0009:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0010
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.c
            goto L_0x0011
        L_0x0010:
            r2 = r12
        L_0x0011:
            r3 = r0 & 8
            r4 = 0
            if (r3 == 0) goto L_0x0018
            r3 = r4
            goto L_0x0019
        L_0x0018:
            r3 = r13
        L_0x0019:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x001f
            r5 = r4
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0029
            java.util.Map r6 = m0.j.g.o()
            goto L_0x002a
        L_0x0029:
            r6 = r15
        L_0x002a:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0030
            r7 = r4
            goto L_0x0032
        L_0x0030:
            r7 = r16
        L_0x0032:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0038
            r8 = r4
            goto L_0x003a
        L_0x0038:
            r8 = r17
        L_0x003a:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r4 = r18
        L_0x0041:
            r11 = r9
            r12 = r10
            r13 = r1
            r14 = r2
            r15 = r3
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.c.c.y.<init>(java.lang.String, i0.e.c.f.b.a.a, java.util.List, boolean, boolean, java.util.Map, boolean, boolean, boolean, int, m0.n.b.f):void");
    }
}
