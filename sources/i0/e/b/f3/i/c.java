package i0.e.b.f3.i;

import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.user.model.UserSelf;
import i0.e.b.f3.k.b;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: UserStore.kt */
public final class c {
    public final b a;
    public UserSelf b;

    public c(b bVar) {
        i.e(bVar, "userSharedPreferences");
        this.a = bVar;
    }

    public final synchronized UserSelf a() {
        b bVar;
        bVar = this.a;
        Objects.requireNonNull(bVar);
        return bVar.l(Key.WAITLISTED_USER);
    }

    public final synchronized void b(UserSelf userSelf) {
        i.e(userSelf, "loggedInUser");
        this.b = userSelf;
        b bVar = this.a;
        Objects.requireNonNull(bVar);
        i.e(userSelf, "user");
        bVar.m(userSelf, Key.LOGGED_IN_USER);
        bVar.i(Key.AUTH_TOKEN, userSelf.e.b);
    }
}
