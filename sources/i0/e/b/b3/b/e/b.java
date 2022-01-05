package i0.e.b.b3.b.e;

import com.clubhouse.android.user.model.User;
import java.util.Map;
import m0.n.b.f;

/* compiled from: PagingItem.kt */
public abstract class b extends j {
    public final User b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Map<String, Object> f;

    public b(User user, boolean z, boolean z2, boolean z3, Map map, f fVar) {
        super(map, (f) null);
        this.b = user;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = map;
    }

    public static /* synthetic */ b f(b bVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.d();
        }
        if ((i & 2) != 0) {
            z2 = bVar.b();
        }
        if ((i & 4) != 0) {
            z3 = bVar.a();
        }
        return bVar.e(z, z2, z3);
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.d;
    }

    public User c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public abstract b e(boolean z, boolean z2, boolean z3);
}
