package q0.h0.h;

import androidx.core.app.NotificationCompat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.io.IOException;
import java.util.List;
import m0.n.b.i;
import q0.b0;
import q0.e0;
import q0.h0.g.c;
import q0.h0.g.e;
import q0.k;
import q0.x;

/* compiled from: RealInterceptorChain.kt */
public final class g implements x.a {
    public int a;
    public final e b;
    public final List<x> c;
    public final int d;
    public final c e;
    public final b0 f;
    public final int g;
    public final int h;
    public final int i;

    public g(e eVar, List<? extends x> list, int i2, c cVar, b0 b0Var, int i3, int i4, int i5) {
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        i.e(list, "interceptors");
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        this.b = eVar;
        this.c = list;
        this.d = i2;
        this.e = cVar;
        this.f = b0Var;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public static g c(g gVar, int i2, c cVar, b0 b0Var, int i3, int i4, int i5, int i6) {
        g gVar2 = gVar;
        int i7 = (i6 & 1) != 0 ? gVar2.d : i2;
        c cVar2 = (i6 & 2) != 0 ? gVar2.e : cVar;
        b0 b0Var2 = (i6 & 4) != 0 ? gVar2.f : b0Var;
        int i8 = (i6 & 8) != 0 ? gVar2.g : i3;
        int i9 = (i6 & 16) != 0 ? gVar2.h : i4;
        int i10 = (i6 & 32) != 0 ? gVar2.i : i5;
        i.e(b0Var2, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        return new g(gVar2.b, gVar2.c, i7, cVar2, b0Var2, i8, i9, i10);
    }

    public e0 a(b0 b0Var) throws IOException {
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        boolean z = false;
        if (this.d < this.c.size()) {
            this.a++;
            c cVar = this.e;
            if (cVar != null) {
                if (cVar.e.b(b0Var.b)) {
                    if (!(this.a == 1)) {
                        StringBuilder P0 = a.P0("network interceptor ");
                        P0.append(this.c.get(this.d - 1));
                        P0.append(" must call proceed() exactly once");
                        throw new IllegalStateException(P0.toString().toString());
                    }
                } else {
                    StringBuilder P02 = a.P0("network interceptor ");
                    P02.append(this.c.get(this.d - 1));
                    P02.append(" must retain the same host and port");
                    throw new IllegalStateException(P02.toString().toString());
                }
            }
            g c2 = c(this, this.d + 1, (c) null, b0Var, 0, 0, 0, 58);
            x xVar = this.c.get(this.d);
            e0 intercept = xVar.intercept(c2);
            if (intercept != null) {
                if (this.e != null) {
                    if (!(this.d + 1 >= this.c.size() || c2.a == 1)) {
                        throw new IllegalStateException(("network interceptor " + xVar + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.a2 != null) {
                    z = true;
                }
                if (z) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + xVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + xVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public k b() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.b;
        }
        return null;
    }

    public b0 request() {
        return this.f;
    }
}
