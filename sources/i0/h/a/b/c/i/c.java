package i0.h.a.b.c.i;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class c {
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<i0.h.a.b.c.g.a<?>, b> d;
    public final View e;
    public final String f;
    public final String g;
    public final i0.h.a.b.k.a h;
    public Integer i;

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public static final class a {
        public Account a;
        public h0.f.c<Scope> b;
        public String c;
        public String d;
        public i0.h.a.b.k.a e = i0.h.a.b.k.a.c;

        @RecentlyNonNull
        public final c a() {
            return new c(this.a, this.b, (Map) null, 0, (View) null, this.c, this.d, this.e);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public static final class b {
    }

    public c(Account account, @RecentlyNonNull Set set, @RecentlyNonNull Map map, int i2, @RecentlyNonNull View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull i0.h.a.b.k.a aVar) {
        this.a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        Map<i0.h.a.b.c.g.a<?>, b> emptyMap = Collections.emptyMap();
        this.d = emptyMap;
        this.e = null;
        this.f = str;
        this.g = str2;
        this.h = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (b requireNonNull : emptyMap.values()) {
            Objects.requireNonNull(requireNonNull);
            hashSet.addAll((Collection) null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
