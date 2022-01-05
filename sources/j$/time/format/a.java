package j$.time.format;

import j$.time.ZoneId;
import j$.time.k;
import j$.time.temporal.f;
import j$.time.temporal.l;
import j$.time.temporal.q;
import j$.time.temporal.r;

public final /* synthetic */ class a implements r {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    public final Object a(l lVar) {
        int i = c.b;
        int i2 = q.a;
        ZoneId zoneId = (ZoneId) lVar.d(f.a);
        if (zoneId == null || (zoneId instanceof k)) {
            return null;
        }
        return zoneId;
    }
}
