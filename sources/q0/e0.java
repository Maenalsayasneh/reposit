package q0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.Closeable;
import java.util.Objects;
import m0.n.b.i;
import okhttp3.Handshake;
import okhttp3.Protocol;
import q0.h0.g.c;
import q0.v;

/* compiled from: Response.kt */
public final class e0 implements Closeable {
    public final Handshake Y1;
    public final v Z1;
    public final f0 a2;
    public final e0 b2;
    public e c;
    public final e0 c2;
    public final b0 d;
    public final e0 d2;
    public final long e2;
    public final long f2;
    public final c g2;
    public final Protocol q;
    public final String x;
    public final int y;

    public e0(b0 b0Var, Protocol protocol, String str, int i, Handshake handshake, v vVar, f0 f0Var, e0 e0Var, e0 e0Var2, e0 e0Var3, long j, long j2, c cVar) {
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(protocol, "protocol");
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS);
        this.d = b0Var;
        this.q = protocol;
        this.x = str;
        this.y = i;
        this.Y1 = handshake;
        this.Z1 = vVar;
        this.a2 = f0Var;
        this.b2 = e0Var;
        this.c2 = e0Var2;
        this.d2 = e0Var3;
        this.e2 = j;
        this.f2 = j2;
        this.g2 = cVar;
    }

    public static String b(e0 e0Var, String str, String str2, int i) {
        int i2 = i & 2;
        Objects.requireNonNull(e0Var);
        i.e(str, "name");
        String b = e0Var.Z1.b(str);
        if (b != null) {
            return b;
        }
        return null;
    }

    public final e a() {
        e eVar = this.c;
        if (eVar != null) {
            return eVar;
        }
        e b = e.b.b(this.Z1);
        this.c = b;
        return b;
    }

    public void close() {
        f0 f0Var = this.a2;
        if (f0Var != null) {
            f0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean e() {
        int i = this.y;
        return 200 <= i && 299 >= i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Response{protocol=");
        P0.append(this.q);
        P0.append(", code=");
        P0.append(this.y);
        P0.append(", message=");
        P0.append(this.x);
        P0.append(", url=");
        P0.append(this.d.b);
        P0.append('}');
        return P0.toString();
    }

    /* compiled from: Response.kt */
    public static class a {
        public b0 a;
        public Protocol b;
        public int c;
        public String d;
        public Handshake e;
        public v.a f;
        public f0 g;
        public e0 h;
        public e0 i;
        public e0 j;
        public long k;
        public long l;
        public c m;

        public a() {
            this.c = -1;
            this.f = new v.a();
        }

        public e0 a() {
            int i2 = this.c;
            if (i2 >= 0) {
                b0 b0Var = this.a;
                if (b0Var != null) {
                    Protocol protocol = this.b;
                    if (protocol != null) {
                        String str = this.d;
                        if (str != null) {
                            return new e0(b0Var, protocol, str, i2, this.e, this.f.d(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder P0 = i0.d.a.a.a.P0("code < 0: ");
            P0.append(this.c);
            throw new IllegalStateException(P0.toString().toString());
        }

        public a b(e0 e0Var) {
            c("cacheResponse", e0Var);
            this.i = e0Var;
            return this;
        }

        public final void c(String str, e0 e0Var) {
            if (e0Var != null) {
                boolean z = true;
                if (e0Var.a2 == null) {
                    if (e0Var.b2 == null) {
                        if (e0Var.c2 == null) {
                            if (e0Var.d2 != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(i0.d.a.a.a.n0(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(i0.d.a.a.a.n0(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(i0.d.a.a.a.n0(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(i0.d.a.a.a.n0(str, ".body != null").toString());
            }
        }

        public a d(v vVar) {
            i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS);
            this.f = vVar.j();
            return this;
        }

        public a e(String str) {
            i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            this.d = str;
            return this;
        }

        public a f(Protocol protocol) {
            i.e(protocol, "protocol");
            this.b = protocol;
            return this;
        }

        public a g(b0 b0Var) {
            i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
            this.a = b0Var;
            return this;
        }

        public a(e0 e0Var) {
            i.e(e0Var, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
            this.c = -1;
            this.a = e0Var.d;
            this.b = e0Var.q;
            this.c = e0Var.y;
            this.d = e0Var.x;
            this.e = e0Var.Y1;
            this.f = e0Var.Z1.j();
            this.g = e0Var.a2;
            this.h = e0Var.b2;
            this.i = e0Var.c2;
            this.j = e0Var.d2;
            this.k = e0Var.e2;
            this.l = e0Var.f2;
            this.m = e0Var.g2;
        }
    }
}
