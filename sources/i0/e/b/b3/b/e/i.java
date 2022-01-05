package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.notification.NotificationType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.e.b.b3.a.a.e.j;
import i0.e.b.b3.a.a.e.k;
import j$.time.OffsetDateTime;
import java.util.Map;

/* compiled from: PagingItem.kt */
public final class i extends j {
    public final Long b;
    public final j c;
    public final NotificationType d;
    public final String e;
    public final String f;
    public final String g;
    public final OffsetDateTime h;
    public final Boolean i;
    public final k j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Long l, j jVar, NotificationType notificationType, String str, String str2, String str3, OffsetDateTime offsetDateTime, Boolean bool, k kVar) {
        super((Map) null, 1);
        m0.n.b.i.e(notificationType, "type");
        m0.n.b.i.e(str3, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        m0.n.b.i.e(offsetDateTime, "timeCreated");
        this.b = l;
        this.c = jVar;
        this.d = notificationType;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = offsetDateTime;
        this.i = bool;
        this.j = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m0.n.b.i.a(this.b, iVar.b) && m0.n.b.i.a(this.c, iVar.c) && this.d == iVar.d && m0.n.b.i.a(this.e, iVar.e) && m0.n.b.i.a(this.f, iVar.f) && m0.n.b.i.a(this.g, iVar.g) && m0.n.b.i.a(this.h, iVar.h) && m0.n.b.i.a(this.i, iVar.i) && m0.n.b.i.a(this.j, iVar.j);
    }

    public int hashCode() {
        Long l = this.b;
        int i2 = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        j jVar = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (this.h.hashCode() + a.F(this.g, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        Boolean bool = this.i;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        k kVar = this.j;
        if (kVar != null) {
            i2 = kVar.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder P0 = a.P0("NotificationItem(id=");
        P0.append(this.b);
        P0.append(", source=");
        P0.append(this.c);
        P0.append(", type=");
        P0.append(this.d);
        P0.append(", photoUrl=");
        P0.append(this.e);
        P0.append(", name=");
        P0.append(this.f);
        P0.append(", message=");
        P0.append(this.g);
        P0.append(", timeCreated=");
        P0.append(this.h);
        P0.append(", isUnread=");
        P0.append(this.i);
        P0.append(", target=");
        P0.append(this.j);
        P0.append(')');
        return P0.toString();
    }
}
