package q0.h0.g;

import androidx.core.app.NotificationCompat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import m0.n.b.i;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import q0.b0;
import q0.d0;
import q0.e0;
import q0.h0.h.d;
import q0.t;
import r0.f;
import r0.j;
import r0.k;
import r0.w;
import r0.y;

/* compiled from: Exchange.kt */
public final class c {
    public boolean a;
    public final g b;
    public final e c;
    public final t d;
    public final d e;
    public final d f;

    /* compiled from: Exchange.kt */
    public final class a extends j {
        public final /* synthetic */ c Y1;
        public boolean d;
        public long q;
        public boolean x;
        public final long y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, w wVar, long j) {
            super(wVar);
            i.e(wVar, "delegate");
            this.Y1 = cVar;
            this.y = j;
        }

        public void S(f fVar, long j) throws IOException {
            i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
            if (!this.x) {
                long j2 = this.y;
                if (j2 == -1 || this.q + j <= j2) {
                    try {
                        super.S(fVar, j);
                        this.q += j;
                    } catch (IOException e) {
                        throw a(e);
                    }
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0("expected ");
                    P0.append(this.y);
                    P0.append(" bytes but received ");
                    P0.append(this.q + j);
                    throw new ProtocolException(P0.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E a(E e) {
            if (this.d) {
                return e;
            }
            this.d = true;
            return this.Y1.a(this.q, false, true, e);
        }

        public void close() throws IOException {
            if (!this.x) {
                this.x = true;
                long j = this.y;
                if (j == -1 || this.q == j) {
                    try {
                        super.close();
                        a((IOException) null);
                    } catch (IOException e) {
                        throw a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }
    }

    /* compiled from: Exchange.kt */
    public final class b extends k {
        public final long Y1;
        public final /* synthetic */ c Z1;
        public long d;
        public boolean q = true;
        public boolean x;
        public boolean y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, y yVar, long j) {
            super(yVar);
            i.e(yVar, "delegate");
            this.Z1 = cVar;
            this.Y1 = j;
            if (j == 0) {
                a((IOException) null);
            }
        }

        public final <E extends IOException> E a(E e) {
            if (this.x) {
                return e;
            }
            this.x = true;
            if (e == null && this.q) {
                this.q = false;
                c cVar = this.Z1;
                t tVar = cVar.d;
                e eVar = cVar.c;
                Objects.requireNonNull(tVar);
                i.e(eVar, NotificationCompat.CATEGORY_CALL);
            }
            return this.Z1.a(this.d, true, false, e);
        }

        public void close() throws IOException {
            if (!this.y) {
                this.y = true;
                try {
                    super.close();
                    a((IOException) null);
                } catch (IOException e) {
                    throw a(e);
                }
            }
        }

        public long q0(f fVar, long j) throws IOException {
            i.e(fVar, "sink");
            if (!this.y) {
                try {
                    long q02 = this.c.q0(fVar, j);
                    if (this.q) {
                        this.q = false;
                        c cVar = this.Z1;
                        t tVar = cVar.d;
                        e eVar = cVar.c;
                        Objects.requireNonNull(tVar);
                        i.e(eVar, NotificationCompat.CATEGORY_CALL);
                    }
                    if (q02 == -1) {
                        a((IOException) null);
                        return -1;
                    }
                    long j2 = this.d + q02;
                    long j3 = this.Y1;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.Y1 + " bytes but received " + j2);
                        }
                    }
                    this.d = j2;
                    if (j2 == j3) {
                        a((IOException) null);
                    }
                    return q02;
                } catch (IOException e) {
                    throw a(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public c(e eVar, t tVar, d dVar, d dVar2) {
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        i.e(tVar, "eventListener");
        i.e(dVar, "finder");
        i.e(dVar2, "codec");
        this.c = eVar;
        this.d = tVar;
        this.e = dVar;
        this.f = dVar2;
        this.b = dVar2.e();
    }

    public final <E extends IOException> E a(long j, boolean z, boolean z2, E e2) {
        if (e2 != null) {
            e(e2);
        }
        if (z2) {
            if (e2 != null) {
                this.d.b(this.c, e2);
            } else {
                t tVar = this.d;
                e eVar = this.c;
                Objects.requireNonNull(tVar);
                i.e(eVar, NotificationCompat.CATEGORY_CALL);
            }
        }
        if (z) {
            if (e2 != null) {
                this.d.c(this.c, e2);
            } else {
                t tVar2 = this.d;
                e eVar2 = this.c;
                Objects.requireNonNull(tVar2);
                i.e(eVar2, NotificationCompat.CATEGORY_CALL);
            }
        }
        return this.c.h(this, z2, z, e2);
    }

    public final w b(b0 b0Var, boolean z) throws IOException {
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        this.a = z;
        d0 d0Var = b0Var.e;
        i.c(d0Var);
        long a2 = d0Var.a();
        t tVar = this.d;
        e eVar = this.c;
        Objects.requireNonNull(tVar);
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        return new a(this, this.f.h(b0Var, a2), a2);
    }

    public final e0.a c(boolean z) throws IOException {
        try {
            e0.a d2 = this.f.d(z);
            if (d2 != null) {
                i.e(this, "deferredTrailers");
                d2.m = this;
            }
            return d2;
        } catch (IOException e2) {
            this.d.c(this.c, e2);
            e(e2);
            throw e2;
        }
    }

    public final void d() {
        t tVar = this.d;
        e eVar = this.c;
        Objects.requireNonNull(tVar);
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
    }

    public final void e(IOException iOException) {
        this.e.c(iOException);
        g e2 = this.f.e();
        e eVar = this.c;
        synchronized (e2) {
            i.e(eVar, NotificationCompat.CATEGORY_CALL);
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).c == ErrorCode.REFUSED_STREAM) {
                    int i = e2.m + 1;
                    e2.m = i;
                    if (i > 1) {
                        e2.i = true;
                        e2.k++;
                    }
                } else if (((StreamResetException) iOException).c != ErrorCode.CANCEL || !eVar.f2) {
                    e2.i = true;
                    e2.k++;
                }
            } else if (!e2.j() || (iOException instanceof ConnectionShutdownException)) {
                e2.i = true;
                if (e2.l == 0) {
                    e2.d(eVar.i2, e2.q, iOException);
                    e2.k++;
                }
            }
        }
    }
}
