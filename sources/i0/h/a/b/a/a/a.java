package i0.h.a.b.a.a;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import h0.b0.v;
import i0.h.a.b.a.a.d.b.g;
import i0.h.a.b.c.g.a;
import i0.h.a.b.g.a.e;
import i0.h.a.b.g.b.d;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class a {
    public static final a.g<e> a;
    public static final a.g<g> b;
    public static final a.C0131a<e, C0129a> c;
    public static final a.C0131a<g, GoogleSignInOptions> d;
    public static final i0.h.a.b.c.g.a<GoogleSignInOptions> e;

    @Deprecated
    /* renamed from: i0.h.a.b.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
    public static class C0129a implements a.d {
        public static final C0129a c = new C0129a(new C0130a());
        public final String d;
        public final boolean q;
        public final String x;

        public C0129a(C0130a aVar) {
            this.d = aVar.a;
            this.q = aVar.b.booleanValue();
            this.x = aVar.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0129a)) {
                return false;
            }
            C0129a aVar = (C0129a) obj;
            return v.c0(this.d, aVar.d) && this.q == aVar.q && v.c0(this.x, aVar.x);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.d, Boolean.valueOf(this.q), this.x});
        }

        @Deprecated
        /* renamed from: i0.h.a.b.a.a.a$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
        public static class C0130a {
            public String a;
            public Boolean b = Boolean.FALSE;
            public String c;

            public C0130a() {
            }

            public C0130a(C0129a aVar) {
                this.a = aVar.d;
                this.b = Boolean.valueOf(aVar.q);
                this.c = aVar.x;
            }
        }
    }

    static {
        a.g<e> gVar = new a.g<>();
        a = gVar;
        a.g<g> gVar2 = new a.g<>();
        b = gVar2;
        f fVar = new f();
        c = fVar;
        g gVar3 = new g();
        d = gVar3;
        i0.h.a.b.c.g.a<c> aVar = b.c;
        v.A(fVar, "Cannot construct an Api with a null ClientBuilder");
        v.A(gVar, "Cannot construct an Api with a null ClientKey");
        e = new i0.h.a.b.c.g.a<>("Auth.GOOGLE_SIGN_IN_API", gVar3, gVar2);
        d dVar = b.d;
    }
}
