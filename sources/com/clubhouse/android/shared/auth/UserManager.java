package com.clubhouse.android.shared.auth;

import android.content.SharedPreferences;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.user.model.UserSelf;
import i0.e.b.f3.i.a;
import i0.e.b.f3.i.c;
import i0.e.b.f3.k.b;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Result;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.q;
import n0.a.g2.z;
import n0.a.v;

/* compiled from: UserManager.kt */
public final class UserManager {
    public final c a;
    public final a b;
    public final i0.e.a.a c;
    public final z<UserSelf> d;
    public final d<Integer> e;
    public final d<Integer> f;

    public UserManager(c cVar, a aVar, i0.e.a.a aVar2) {
        i.e(cVar, "userStore");
        i.e(aVar, "userComponentHandler");
        i.e(aVar2, "analytics");
        this.a = cVar;
        this.b = aVar;
        this.c = aVar2;
        q a2 = a0.a(null);
        this.d = a2;
        d<Integer> f1 = m0.r.t.a.r.m.a1.a.f1(new UserManager$special$$inlined$map$1(new UserManager$special$$inlined$filter$1(a2)));
        this.e = f1;
        this.f = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(m0.r.t.a.r.m.a1.a.f1(f1));
    }

    public static /* synthetic */ void g(UserManager userManager, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        int i2 = i & 4;
        userManager.f(str, str2, (String) null);
    }

    public final void a(UserSelf userSelf) {
        i.e(userSelf, "user");
        c cVar = this.a;
        synchronized (cVar) {
            i.e(userSelf, "waitlistedUser");
            b bVar = cVar.a;
            Objects.requireNonNull(bVar);
            i.e(userSelf, "user");
            bVar.m(userSelf, Key.WAITLISTED_USER);
            bVar.i(Key.WAITLISTED_USER_AUTH_TOKEN, userSelf.e.b);
        }
    }

    public final Integer b() {
        UserSelf userSelf = (UserSelf) ((q) this.d).getValue();
        if (userSelf == null) {
            return null;
        }
        return Integer.valueOf(userSelf.a);
    }

    public final boolean c() {
        return ((q) this.d).getValue() != null;
    }

    public final void d(Object obj) {
        ((q) this.d).setValue(null);
        c cVar = this.a;
        synchronized (cVar) {
            cVar.b = null;
            SharedPreferences.Editor edit = cVar.a.a.edit();
            i.d(edit, "editor");
            edit.clear();
            edit.commit();
        }
        a aVar = this.b;
        i0.e.b.h3.a.b bVar = aVar.d;
        if (bVar != null) {
            v vVar = (v) ((i0.e.b.h3.a.a) h.L0(bVar, i0.e.b.h3.a.a.class)).a().a;
            Throwable a2 = Result.a(obj);
            if (a2 == null) {
                vVar.H(obj);
            } else {
                vVar.G(a2);
            }
        }
        aVar.d = null;
    }

    public final void e(UserSelf userSelf) {
        a aVar = this.b;
        Objects.requireNonNull(aVar);
        i.e(userSelf, "user");
        l.h hVar = (l.h) aVar.c;
        Objects.requireNonNull(hVar);
        hVar.b = userSelf;
        h.C(userSelf, UserSelf.class);
        aVar.d = new l.i(hVar.a, new i0.e.c.g.c(), new i0.e.d.a.a(), new i0.e.e.l.c(), hVar.b, (l.a) null);
        ((q) this.d).setValue(userSelf);
    }

    public final void f(String str, String str2, String str3) {
        UserSelf userSelf = (UserSelf) ((q) this.d).getValue();
        if (userSelf != null) {
            if (str == null) {
                str = userSelf.b;
            }
            String str4 = str;
            if (str2 == null) {
                str2 = userSelf.c;
            }
            String str5 = str2;
            if (str3 == null) {
                str3 = userSelf.d;
            }
            UserSelf a2 = UserSelf.a(userSelf, 0, str4, str5, str3, (AccessCredential) null, 17);
            this.a.b(a2);
            ((q) this.d).setValue(a2);
        }
    }

    public final UserSelf h() {
        return this.a.a();
    }
}
