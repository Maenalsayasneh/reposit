package i0.e.c.f.b.a;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import com.clubhouse.pubsub.user.backchannel.models.remote.Role;
import h0.b0.v;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: BackchannelChat.kt */
public final class a {
    public final String a;
    public final int b;
    public final OffsetDateTime c;
    public final c d;
    public final int e;
    public final ChatType f;
    public final List<ChatMember> g;
    public final List<ChatMember> h;
    public final boolean i;
    public final List<ChatMember> j;
    public final List<ChatMember> k;
    public final List<ChatMember> l;
    public final List<ChatMember> m;
    public final List<ChatMember> n;
    public final List<Integer> o;
    public final List<Integer> p;
    public final boolean q;
    public final ChatMember r;
    public final boolean s;
    public final ChatDestination t;
    public final String u;

    public a(String str, int i2, OffsetDateTime offsetDateTime, c cVar, int i3, ChatType chatType, List<ChatMember> list, List<ChatMember> list2, boolean z) {
        boolean z2;
        String str2;
        List<ChatMember> list3 = list;
        List<ChatMember> list4 = list2;
        i.e(str, "id");
        i.e(offsetDateTime, "timeUpdated");
        i.e(chatType, "type");
        i.e(list3, "participants");
        i.e(list4, "blockedParticipants");
        this.a = str;
        this.b = i2;
        this.c = offsetDateTime;
        this.d = cVar;
        this.e = i3;
        this.f = chatType;
        this.g = list3;
        this.h = list4;
        this.i = z;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!(((ChatMember) next).getId().intValue() != this.b ? false : z3)) {
                arrayList.add(next);
            }
        }
        this.j = arrayList;
        List<ChatMember> list5 = this.g;
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : list5) {
            if (((ChatMember) next2).q) {
                arrayList2.add(next2);
            }
        }
        this.k = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next3 = it2.next();
            if (((ChatMember) next3).x == Role.ADMIN) {
                arrayList3.add(next3);
            }
        }
        this.l = arrayList3;
        List<ChatMember> list6 = this.k;
        ArrayList arrayList4 = new ArrayList();
        for (T next4 : list6) {
            if (((ChatMember) next4).x == Role.MEMBER) {
                arrayList4.add(next4);
            }
        }
        this.m = arrayList4;
        List<ChatMember> list7 = this.k;
        ArrayList arrayList5 = new ArrayList();
        for (T next5 : list7) {
            if (!(((ChatMember) next5).getId().intValue() == this.b)) {
                arrayList5.add(next5);
            }
        }
        this.n = arrayList5;
        ArrayList arrayList6 = new ArrayList(h.K(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Integer.valueOf(((ChatMember) it3.next()).getId().intValue()));
        }
        this.o = arrayList6;
        List<ChatMember> list8 = this.h;
        ArrayList arrayList7 = new ArrayList(h.K(list8, 10));
        for (ChatMember id : list8) {
            arrayList7.add(Integer.valueOf(id.getId().intValue()));
        }
        this.p = arrayList7;
        this.q = this.e > 0;
        for (ChatMember chatMember : this.g) {
            if (chatMember.getId().intValue() == this.b) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                this.r = chatMember;
                this.s = chatMember.x == Role.ADMIN;
                this.t = chatMember.b2;
                if (this.n.size() == 1) {
                    str2 = this.n.get(0).Y1;
                } else {
                    List<ChatMember> list9 = this.n;
                    ArrayList arrayList8 = new ArrayList(h.K(list9, 10));
                    for (ChatMember chatMember2 : list9) {
                        Objects.requireNonNull(chatMember2);
                        arrayList8.add(v.f0(chatMember2));
                    }
                    str2 = g.E(arrayList8, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63);
                }
                this.u = str2;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && this.b == aVar.b && i.a(this.c, aVar.c) && i.a(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && i.a(this.g, aVar.g) && i.a(this.h, aVar.h) && this.i == aVar.i;
    }

    public int hashCode() {
        int hashCode = (this.c.hashCode() + i0.d.a.a.a.M(this.b, this.a.hashCode() * 31, 31)) * 31;
        c cVar = this.d;
        int H = i0.d.a.a.a.H(this.h, i0.d.a.a.a.H(this.g, (this.f.hashCode() + i0.d.a.a.a.M(this.e, (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31)) * 31, 31), 31);
        boolean z = this.i;
        if (z) {
            z = true;
        }
        return H + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BackchannelChat(id=");
        P0.append(this.a);
        P0.append(", selfId=");
        P0.append(this.b);
        P0.append(", timeUpdated=");
        P0.append(this.c);
        P0.append(", lastMessage=");
        P0.append(this.d);
        P0.append(", unreadCount=");
        P0.append(this.e);
        P0.append(", type=");
        P0.append(this.f);
        P0.append(", participants=");
        P0.append(this.g);
        P0.append(", blockedParticipants=");
        P0.append(this.h);
        P0.append(", archived=");
        return i0.d.a.a.a.C0(P0, this.i, ')');
    }
}
