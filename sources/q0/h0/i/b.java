package q0.h0.i;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt__IndentKt;
import org.json.HTTP;
import q0.a0;
import q0.b0;
import q0.e0;
import q0.h0.g.g;
import q0.h0.h.j;
import q0.p;
import q0.v;
import r0.h;
import r0.i;
import r0.l;
import r0.w;
import r0.y;
import r0.z;

/* compiled from: Http1ExchangeCodec.kt */
public final class b implements q0.h0.h.d {
    public int a;
    public final a b;
    public v c;
    public final a0 d;
    public final g e;
    public final i f;
    public final h g;

    /* compiled from: Http1ExchangeCodec.kt */
    public abstract class a implements y {
        public final l c;
        public boolean d;

        public a() {
            this.c = new l(b.this.f.d());
        }

        public final void a() {
            b bVar = b.this;
            int i = bVar.a;
            if (i != 6) {
                if (i == 5) {
                    b.i(bVar, this.c);
                    b.this.a = 6;
                    return;
                }
                StringBuilder P0 = i0.d.a.a.a.P0("state: ");
                P0.append(b.this.a);
                throw new IllegalStateException(P0.toString());
            }
        }

        public z d() {
            return this.c;
        }

        public long q0(r0.f fVar, long j) {
            m0.n.b.i.e(fVar, "sink");
            try {
                return b.this.f.q0(fVar, j);
            } catch (IOException e) {
                b.this.e.l();
                a();
                throw e;
            }
        }
    }

    /* renamed from: q0.h0.i.b$b  reason: collision with other inner class name */
    /* compiled from: Http1ExchangeCodec.kt */
    public final class C0288b implements w {
        public final l c;
        public boolean d;

        public C0288b() {
            this.c = new l(b.this.g.d());
        }

        public void S(r0.f fVar, long j) {
            m0.n.b.i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
            if (!(!this.d)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                b.this.g.W(j);
                b.this.g.K(HTTP.CRLF);
                b.this.g.S(fVar, j);
                b.this.g.K(HTTP.CRLF);
            }
        }

        public synchronized void close() {
            if (!this.d) {
                this.d = true;
                b.this.g.K("0\r\n\r\n");
                b.i(b.this, this.c);
                b.this.a = 3;
            }
        }

        public z d() {
            return this.c;
        }

        public synchronized void flush() {
            if (!this.d) {
                b.this.g.flush();
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class c extends a {
        public final q0.w Y1;
        public final /* synthetic */ b Z1;
        public long x = -1;
        public boolean y = true;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, q0.w wVar) {
            super();
            m0.n.b.i.e(wVar, "url");
            this.Z1 = bVar;
            this.Y1 = wVar;
        }

        public void close() {
            if (!this.d) {
                if (this.y && !q0.h0.c.h(this, 100, TimeUnit.MILLISECONDS)) {
                    this.Z1.e.l();
                    a();
                }
                this.d = true;
            }
        }

        public long q0(r0.f fVar, long j) {
            m0.n.b.i.e(fVar, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount < 0: ", j).toString());
            } else if (!(!this.d)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.y) {
                return -1;
            } else {
                long j2 = this.x;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        this.Z1.f.e0();
                    }
                    try {
                        this.x = this.Z1.f.E0();
                        String e0 = this.Z1.f.e0();
                        if (e0 != null) {
                            String obj = StringsKt__IndentKt.X(e0).toString();
                            if (this.x >= 0) {
                                if (obj.length() <= 0) {
                                    z = false;
                                }
                                if (!z || StringsKt__IndentKt.J(obj, ";", false, 2)) {
                                    if (this.x == 0) {
                                        this.y = false;
                                        b bVar = this.Z1;
                                        bVar.c = bVar.b.a();
                                        a0 a0Var = this.Z1.d;
                                        m0.n.b.i.c(a0Var);
                                        p pVar = a0Var.f2;
                                        q0.w wVar = this.Y1;
                                        v vVar = this.Z1.c;
                                        m0.n.b.i.c(vVar);
                                        q0.h0.h.e.d(pVar, wVar, vVar);
                                        a();
                                    }
                                    if (!this.y) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.x + obj + '\"');
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long q02 = super.q0(fVar, Math.min(j, this.x));
                if (q02 != -1) {
                    this.x -= q02;
                    return q02;
                }
                this.Z1.e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class d extends a {
        public long x;

        public d(long j) {
            super();
            this.x = j;
            if (j == 0) {
                a();
            }
        }

        public void close() {
            if (!this.d) {
                if (this.x != 0 && !q0.h0.c.h(this, 100, TimeUnit.MILLISECONDS)) {
                    b.this.e.l();
                    a();
                }
                this.d = true;
            }
        }

        public long q0(r0.f fVar, long j) {
            m0.n.b.i.e(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount < 0: ", j).toString());
            } else if (!this.d) {
                long j2 = this.x;
                if (j2 == 0) {
                    return -1;
                }
                long q02 = super.q0(fVar, Math.min(j2, j));
                if (q02 != -1) {
                    long j3 = this.x - q02;
                    this.x = j3;
                    if (j3 == 0) {
                        a();
                    }
                    return q02;
                }
                b.this.e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class e implements w {
        public final l c;
        public boolean d;

        public e() {
            this.c = new l(b.this.g.d());
        }

        public void S(r0.f fVar, long j) {
            m0.n.b.i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
            if (!this.d) {
                q0.h0.c.c(fVar.d, 0, j);
                b.this.g.S(fVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public void close() {
            if (!this.d) {
                this.d = true;
                b.i(b.this, this.c);
                b.this.a = 3;
            }
        }

        public z d() {
            return this.c;
        }

        public void flush() {
            if (!this.d) {
                b.this.g.flush();
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class f extends a {
        public boolean x;

        public f(b bVar) {
            super();
        }

        public void close() {
            if (!this.d) {
                if (!this.x) {
                    a();
                }
                this.d = true;
            }
        }

        public long q0(r0.f fVar, long j) {
            m0.n.b.i.e(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount < 0: ", j).toString());
            } else if (!(!this.d)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.x) {
                return -1;
            } else {
                long q02 = super.q0(fVar, j);
                if (q02 != -1) {
                    return q02;
                }
                this.x = true;
                a();
                return -1;
            }
        }
    }

    public b(a0 a0Var, g gVar, i iVar, h hVar) {
        m0.n.b.i.e(gVar, "connection");
        m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        m0.n.b.i.e(hVar, "sink");
        this.d = a0Var;
        this.e = gVar;
        this.f = iVar;
        this.g = hVar;
        this.b = new a(iVar);
    }

    public static final void i(b bVar, l lVar) {
        Objects.requireNonNull(bVar);
        z zVar = lVar.e;
        z zVar2 = z.a;
        m0.n.b.i.e(zVar2, "delegate");
        lVar.e = zVar2;
        zVar.a();
        zVar.b();
    }

    public void a() {
        this.g.flush();
    }

    public void b(b0 b0Var) {
        m0.n.b.i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        Proxy.Type type = this.e.q.b.type();
        m0.n.b.i.d(type, "connection.route().proxy.type()");
        m0.n.b.i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        m0.n.b.i.e(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(b0Var.c);
        sb.append(' ');
        q0.w wVar = b0Var.b;
        if (!wVar.c && type == Proxy.Type.HTTP) {
            sb.append(wVar);
        } else {
            m0.n.b.i.e(wVar, "url");
            String b2 = wVar.b();
            String d2 = wVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            sb.append(b2);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k(b0Var.d, sb2);
    }

    public y c(e0 e0Var) {
        m0.n.b.i.e(e0Var, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (!q0.h0.h.e.a(e0Var)) {
            return j(0);
        }
        boolean z = true;
        if (StringsKt__IndentKt.f("chunked", e0.b(e0Var, "Transfer-Encoding", (String) null, 2), true)) {
            q0.w wVar = e0Var.d.b;
            if (this.a != 4) {
                z = false;
            }
            if (z) {
                this.a = 5;
                return new c(this, wVar);
            }
            StringBuilder P0 = i0.d.a.a.a.P0("state: ");
            P0.append(this.a);
            throw new IllegalStateException(P0.toString().toString());
        }
        long k = q0.h0.c.k(e0Var);
        if (k != -1) {
            return j(k);
        }
        if (this.a != 4) {
            z = false;
        }
        if (z) {
            this.a = 5;
            this.e.l();
            return new f(this);
        }
        StringBuilder P02 = i0.d.a.a.a.P0("state: ");
        P02.append(this.a);
        throw new IllegalStateException(P02.toString().toString());
    }

    public void cancel() {
        Socket socket = this.e.b;
        if (socket != null) {
            q0.h0.c.e(socket);
        }
    }

    public e0.a d(boolean z) {
        int i = this.a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                j a2 = j.a(this.b.b());
                e0.a aVar = new e0.a();
                aVar.f(a2.a);
                aVar.c = a2.b;
                aVar.e(a2.c);
                aVar.d(this.b.a());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.a = 3;
                    return aVar;
                }
                this.a = 4;
                return aVar;
            } catch (EOFException e2) {
                throw new IOException(i0.d.a.a.a.n0("unexpected end of stream on ", this.e.q.a.a.i()), e2);
            }
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("state: ");
            P0.append(this.a);
            throw new IllegalStateException(P0.toString().toString());
        }
    }

    public g e() {
        return this.e;
    }

    public void f() {
        this.g.flush();
    }

    public long g(e0 e0Var) {
        m0.n.b.i.e(e0Var, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (!q0.h0.h.e.a(e0Var)) {
            return 0;
        }
        if (StringsKt__IndentKt.f("chunked", e0.b(e0Var, "Transfer-Encoding", (String) null, 2), true)) {
            return -1;
        }
        return q0.h0.c.k(e0Var);
    }

    public w h(b0 b0Var, long j) {
        m0.n.b.i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        boolean z = true;
        if (StringsKt__IndentKt.f("chunked", b0Var.b("Transfer-Encoding"), true)) {
            if (this.a != 1) {
                z = false;
            }
            if (z) {
                this.a = 2;
                return new C0288b();
            }
            StringBuilder P0 = i0.d.a.a.a.P0("state: ");
            P0.append(this.a);
            throw new IllegalStateException(P0.toString().toString());
        } else if (j != -1) {
            if (this.a != 1) {
                z = false;
            }
            if (z) {
                this.a = 2;
                return new e();
            }
            StringBuilder P02 = i0.d.a.a.a.P0("state: ");
            P02.append(this.a);
            throw new IllegalStateException(P02.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final y j(long j) {
        if (this.a == 4) {
            this.a = 5;
            return new d(j);
        }
        StringBuilder P0 = i0.d.a.a.a.P0("state: ");
        P0.append(this.a);
        throw new IllegalStateException(P0.toString().toString());
    }

    public final void k(v vVar, String str) {
        m0.n.b.i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS);
        m0.n.b.i.e(str, "requestLine");
        if (this.a == 0) {
            this.g.K(str).K(HTTP.CRLF);
            int size = vVar.size();
            for (int i = 0; i < size; i++) {
                this.g.K(vVar.c(i)).K(": ").K(vVar.k(i)).K(HTTP.CRLF);
            }
            this.g.K(HTTP.CRLF);
            this.a = 1;
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("state: ");
        P0.append(this.a);
        throw new IllegalStateException(P0.toString().toString());
    }
}
