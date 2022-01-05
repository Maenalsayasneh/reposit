package i0.h.a.b.n;

import android.accounts.Account;
import androidx.annotation.RecentlyNonNull;
import h0.b0.v;
import i0.h.a.b.c.g.a;
import i0.h.a.b.g.k.b;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class d {
    @RecentlyNonNull
    public static final i0.h.a.b.c.g.a<a> a;
    public static final a.g<b> b;
    public static final a.C0131a<b, a> c;

    static {
        a.g<b> gVar = new a.g<>();
        b = gVar;
        l lVar = new l();
        c = lVar;
        a = new i0.h.a.b.c.g.a<>("Wallet.API", lVar, gVar);
    }

    /* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
    public static final class a implements a.d.C0132a {
        public final int c;
        public final int d;
        public final boolean q;

        /* renamed from: i0.h.a.b.n.d$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
        public static final class C0137a {
            public int a = 3;

            @RecentlyNonNull
            public C0137a a(int i) {
                if (i != 0) {
                    if (i == 0) {
                        i = 0;
                    } else if (!(i == 2 || i == 1 || i == 23 || i == 3)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i)}));
                    }
                }
                this.a = i;
                return this;
            }
        }

        public a(C0137a aVar) {
            this.c = aVar.a;
            this.d = 1;
            this.q = true;
        }

        @RecentlyNonNull
        public Account J() {
            return null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!v.c0(Integer.valueOf(this.c), Integer.valueOf(aVar.c)) || !v.c0(Integer.valueOf(this.d), Integer.valueOf(aVar.d)) || !v.c0((Object) null, (Object) null) || !v.c0(Boolean.valueOf(this.q), Boolean.valueOf(aVar.q))) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), null, Boolean.valueOf(this.q)});
        }

        public a() {
            this(new C0137a());
        }
    }
}
