package t0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.request.Header;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.Handshake;
import okhttp3.Protocol;
import q0.b0;
import q0.d0;
import q0.e0;
import q0.f;
import q0.f0;
import q0.g;
import q0.u;
import q0.v;
import q0.w;
import q0.z;
import r0.i;
import r0.k;
import r0.y;
import retrofit2.Invocation;
import t0.t;

/* compiled from: OkHttpCall */
public final class n<T> implements d<T> {
    public f Y1;
    public Throwable Z1;
    public boolean a2;
    public final u c;
    public final Object[] d;
    public final f.a q;
    public final h<f0, T> x;
    public volatile boolean y;

    /* compiled from: OkHttpCall */
    public class a implements g {
        public final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        public void a(f fVar, IOException iOException) {
            try {
                this.a.onFailure(n.this, iOException);
            } catch (Throwable th) {
                a0.o(th);
                th.printStackTrace();
            }
        }

        public void b(f fVar, e0 e0Var) {
            try {
                try {
                    this.a.onResponse(n.this, n.this.d(e0Var));
                } catch (Throwable th) {
                    a0.o(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                a0.o(th2);
                th2.printStackTrace();
            }
        }
    }

    /* compiled from: OkHttpCall */
    public static final class b extends f0 {
        public final f0 c;
        public final i d;
        public IOException q;

        /* compiled from: OkHttpCall */
        public class a extends k {
            public a(y yVar) {
                super(yVar);
            }

            public long q0(r0.f fVar, long j) throws IOException {
                try {
                    return super.q0(fVar, j);
                } catch (IOException e) {
                    b.this.q = e;
                    throw e;
                }
            }
        }

        public b(f0 f0Var) {
            this.c = f0Var;
            this.d = m0.r.t.a.r.m.a1.a.c0(new a(f0Var.source()));
        }

        public void close() {
            this.c.close();
        }

        public long contentLength() {
            return this.c.contentLength();
        }

        public q0.y contentType() {
            return this.c.contentType();
        }

        public i source() {
            return this.d;
        }
    }

    /* compiled from: OkHttpCall */
    public static final class c extends f0 {
        public final q0.y c;
        public final long d;

        public c(q0.y yVar, long j) {
            this.c = yVar;
            this.d = j;
        }

        public long contentLength() {
            return this.d;
        }

        public q0.y contentType() {
            return this.c;
        }

        public i source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public n(u uVar, Object[] objArr, f.a aVar, h<f0, T> hVar) {
        this.c = uVar;
        this.d = objArr;
        this.q = aVar;
        this.x = hVar;
    }

    public void J(f<T> fVar) {
        f fVar2;
        Throwable th;
        synchronized (this) {
            if (!this.a2) {
                this.a2 = true;
                fVar2 = this.Y1;
                th = this.Z1;
                if (fVar2 == null && th == null) {
                    try {
                        f b2 = b();
                        this.Y1 = b2;
                        fVar2 = b2;
                    } catch (Throwable th2) {
                        th = th2;
                        a0.o(th);
                        this.Z1 = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            fVar.onFailure(this, th);
            return;
        }
        if (this.y) {
            fVar2.cancel();
        }
        fVar2.enqueue(new a(fVar));
    }

    public final f b() throws IOException {
        w wVar;
        f.a aVar = this.q;
        u uVar = this.c;
        Object[] objArr = this.d;
        r<?>[] rVarArr = uVar.j;
        int length = objArr.length;
        if (length == rVarArr.length) {
            t tVar = new t(uVar.c, uVar.b, uVar.d, uVar.e, uVar.f, uVar.g, uVar.h, uVar.i);
            if (uVar.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                rVarArr[i].a(tVar, objArr[i]);
            }
            w.a aVar2 = tVar.f;
            if (aVar2 != null) {
                wVar = aVar2.b();
            } else {
                w wVar2 = tVar.d;
                String str = tVar.e;
                Objects.requireNonNull(wVar2);
                m0.n.b.i.e(str, "link");
                w.a g = wVar2.g(str);
                wVar = g != null ? g.b() : null;
                if (wVar == null) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Malformed URL. Base: ");
                    P0.append(tVar.d);
                    P0.append(", Relative: ");
                    P0.append(tVar.e);
                    throw new IllegalArgumentException(P0.toString());
                }
            }
            t.a aVar3 = tVar.m;
            if (aVar3 == null) {
                u.a aVar4 = tVar.l;
                if (aVar4 != null) {
                    aVar3 = new u(aVar4.a, aVar4.b);
                } else {
                    z.a aVar5 = tVar.k;
                    if (aVar5 != null) {
                        aVar3 = aVar5.c();
                    } else if (tVar.j) {
                        aVar3 = d0.c((q0.y) null, new byte[0]);
                    }
                }
            }
            q0.y yVar = tVar.i;
            if (yVar != null) {
                if (aVar3 != null) {
                    aVar3 = new t.a(aVar3, yVar);
                } else {
                    tVar.h.a(Header.CONTENT_TYPE, yVar.d);
                }
            }
            b0.a aVar6 = tVar.g;
            aVar6.i(wVar);
            aVar6.d(tVar.h.d());
            aVar6.e(tVar.c, aVar3);
            aVar6.g(Invocation.class, new Invocation(uVar.a, arrayList));
            f newCall = aVar.newCall(aVar6.b());
            Objects.requireNonNull(newCall, "Call.Factory returned null.");
            return newCall;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.u0(i0.d.a.a.a.Q0("Argument count (", length, ") doesn't match expected count ("), rVarArr.length, ")"));
    }

    public final f c() throws IOException {
        f fVar = this.Y1;
        if (fVar != null) {
            return fVar;
        }
        Throwable th = this.Z1;
        if (th == null) {
            try {
                f b2 = b();
                this.Y1 = b2;
                return b2;
            } catch (IOException | Error | RuntimeException e) {
                a0.o(e);
                this.Z1 = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public void cancel() {
        f fVar;
        this.y = true;
        synchronized (this) {
            fVar = this.Y1;
        }
        if (fVar != null) {
            fVar.cancel();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return new n(this.c, this.d, this.q, this.x);
    }

    public v<T> d(e0 e0Var) throws IOException {
        e0 e0Var2 = e0Var;
        f0 f0Var = e0Var2.a2;
        m0.n.b.i.e(e0Var2, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        b0 b0Var = e0Var2.d;
        Protocol protocol = e0Var2.q;
        int i = e0Var2.y;
        String str = e0Var2.x;
        Handshake handshake = e0Var2.Y1;
        v.a j = e0Var2.Z1.j();
        e0 e0Var3 = e0Var2.b2;
        e0 e0Var4 = e0Var2.c2;
        e0 e0Var5 = e0Var2.d2;
        long j2 = e0Var2.e2;
        long j3 = e0Var2.f2;
        q0.h0.g.c cVar = e0Var2.g2;
        long j4 = j3;
        long j5 = j2;
        c cVar2 = new c(f0Var.contentType(), f0Var.contentLength());
        if (!(i >= 0)) {
            throw new IllegalStateException(i0.d.a.a.a.e0("code < 0: ", i).toString());
        } else if (b0Var == null) {
            throw new IllegalStateException("request == null".toString());
        } else if (protocol == null) {
            throw new IllegalStateException("protocol == null".toString());
        } else if (str != null) {
            e0 e0Var6 = new e0(b0Var, protocol, str, i, handshake, j.d(), cVar2, e0Var3, e0Var4, e0Var5, j5, j4, cVar);
            int i2 = e0Var6.y;
            if (i2 < 200 || i2 >= 300) {
                try {
                    f0 a3 = a0.a(f0Var);
                    Objects.requireNonNull(a3, "body == null");
                    if (!e0Var6.e()) {
                        return new v<>(e0Var6, null, a3);
                    }
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                } finally {
                    f0Var.close();
                }
            } else if (i2 == 204 || i2 == 205) {
                f0Var.close();
                return v.b(null, e0Var6);
            } else {
                b bVar = new b(f0Var);
                try {
                    return v.b(this.x.a(bVar), e0Var6);
                } catch (RuntimeException e) {
                    IOException iOException = bVar.q;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
        } else {
            throw new IllegalStateException("message == null".toString());
        }
    }

    public v<T> execute() throws IOException {
        f c2;
        synchronized (this) {
            if (!this.a2) {
                this.a2 = true;
                c2 = c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.y) {
            c2.cancel();
        }
        return d(c2.execute());
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.y) {
            return true;
        }
        synchronized (this) {
            f fVar = this.Y1;
            if (fVar == null || !fVar.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized b0 request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return c().request();
    }

    /* renamed from: clone  reason: collision with other method in class */
    public d m60clone() {
        return new n(this.c, this.d, this.q, this.x);
    }
}
