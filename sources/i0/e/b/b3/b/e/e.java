package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.repos.ClubMembership;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PagingItem.kt */
public final class e extends j {
    public final ClubWithAdmin b;
    public final ClubMembership c;
    public final Map<String, Object> d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(com.clubhouse.android.data.models.local.club.ClubWithAdmin r2, com.clubhouse.android.data.repos.ClubMembership r3, java.util.Map<java.lang.String, java.lang.Object> r4, int r5) {
        /*
            r1 = this;
            r3 = r5 & 2
            r0 = 0
            if (r3 == 0) goto L_0x000a
            com.clubhouse.android.data.repos.ClubMembership r3 = h0.b0.v.X0(r2)
            goto L_0x000b
        L_0x000a:
            r3 = r0
        L_0x000b:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0010
            r4 = r0
        L_0x0010:
            java.lang.String r5 = "club"
            m0.n.b.i.e(r2, r5)
            java.lang.String r5 = "clubMembership"
            m0.n.b.i.e(r3, r5)
            r1.<init>((java.util.Map) r4, (m0.n.b.f) r0)
            r1.b = r2
            r1.c = r3
            r1.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.b3.b.e.e.<init>(com.clubhouse.android.data.models.local.club.ClubWithAdmin, com.clubhouse.android.data.repos.ClubMembership, java.util.Map, int):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i.a(this.b, eVar.b) && this.c == eVar.c && i.a(this.d, eVar.d);
    }

    public int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Map<String, Object> map = this.d;
        if (map == null) {
            i = 0;
        } else {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ClubItem(club=");
        P0.append(this.b);
        P0.append(", clubMembership=");
        P0.append(this.c);
        P0.append(", loggingContext=");
        return a.B0(P0, this.d, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ClubWithAdmin clubWithAdmin, ClubMembership clubMembership, Map<String, ? extends Object> map) {
        super((Map) map, (f) null);
        i.e(clubWithAdmin, "club");
        i.e(clubMembership, "clubMembership");
        this.b = clubWithAdmin;
        this.c = clubMembership;
        this.d = map;
    }
}
