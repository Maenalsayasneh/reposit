package i0.e.b.f3.k;

import android.content.SharedPreferences;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.user.model.UserSelf;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.l.a;

/* compiled from: UserSharedPreferences.kt */
public final class b extends a {
    public final SharedPreferences b;
    public final a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(SharedPreferences sharedPreferences, a aVar) {
        super(sharedPreferences);
        i.e(sharedPreferences, "sharedPreferences");
        i.e(aVar, "json");
        this.b = sharedPreferences;
        this.c = aVar;
    }

    public final void k() {
        Key[] keyArr = {Key.WAITLISTED_USER, Key.WAITLISTED_USER_AUTH_TOKEN};
        i.e(keyArr, "keys");
        SharedPreferences.Editor edit = this.a.edit();
        i.d(edit, "editor");
        for (int i = 0; i < 2; i++) {
            edit.remove(keyArr[i].asString());
        }
        edit.commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015 A[Catch:{ Exception -> 0x002d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.clubhouse.android.user.model.UserSelf l(com.clubhouse.android.shared.preferences.Key r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            java.lang.String r5 = i0.e.b.f3.k.a.c(r4, r5, r1, r0, r1)     // Catch:{ Exception -> 0x002d }
            if (r5 == 0) goto L_0x0011
            boolean r0 = kotlin.text.StringsKt__IndentKt.o(r5)     // Catch:{ Exception -> 0x002d }
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0033
        L_0x0015:
            n0.c.l.a r0 = r4.c     // Catch:{ Exception -> 0x002d }
            n0.c.m.b r2 = r0.a()     // Catch:{ Exception -> 0x002d }
            java.lang.Class<com.clubhouse.android.user.model.UserSelf> r3 = com.clubhouse.android.user.model.UserSelf.class
            m0.r.n r3 = m0.n.b.m.e(r3)     // Catch:{ Exception -> 0x002d }
            kotlinx.serialization.KSerializer r2 = m0.r.t.a.r.m.a1.a.u3(r2, r3)     // Catch:{ Exception -> 0x002d }
            java.lang.Object r5 = r0.b(r2, r5)     // Catch:{ Exception -> 0x002d }
            com.clubhouse.android.user.model.UserSelf r5 = (com.clubhouse.android.user.model.UserSelf) r5     // Catch:{ Exception -> 0x002d }
            r1 = r5
            goto L_0x0033
        L_0x002d:
            r5 = move-exception
            v0.a.a$b r0 = v0.a.a.d
            r0.e(r5)
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.f3.k.b.l(com.clubhouse.android.shared.preferences.Key):com.clubhouse.android.user.model.UserSelf");
    }

    public final void m(UserSelf userSelf, Key key) {
        SharedPreferences.Editor edit = this.b.edit();
        i.d(edit, "editor");
        a aVar = this.c;
        edit.putString(f(key), aVar.c(m0.r.t.a.r.m.a1.a.u3(aVar.b.k, m.e(UserSelf.class)), userSelf));
        edit.apply();
    }
}
