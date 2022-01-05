package q0.h0.g;

import com.instabug.library.networkv2.request.RequestMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.IOException;
import java.util.Objects;
import m0.n.b.i;
import okhttp3.internal.connection.RouteException;
import q0.a0;
import q0.b0;
import q0.e0;
import q0.h0.h.g;
import q0.x;

/* compiled from: ConnectInterceptor.kt */
public final class a implements x {
    public static final a a = new a();

    public e0 intercept(x.a aVar) throws IOException {
        i.e(aVar, "chain");
        g gVar = (g) aVar;
        e eVar = gVar.b;
        Objects.requireNonNull(eVar);
        i.e(gVar, "chain");
        synchronized (eVar) {
            if (!eVar.e2) {
                throw new IllegalStateException("released".toString());
            } else if (!(!eVar.d2)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!(!eVar.c2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = eVar.Y1;
        i.c(dVar);
        a0 a0Var = eVar.i2;
        i.e(a0Var, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        i.e(gVar, "chain");
        try {
            c cVar = new c(eVar, eVar.d, dVar, dVar.a(gVar.g, gVar.h, gVar.i, a0Var.x2, a0Var.b2, !i.a(gVar.f.c, RequestMethod.GET)).k(a0Var, gVar));
            eVar.b2 = cVar;
            eVar.g2 = cVar;
            synchronized (eVar) {
                eVar.c2 = true;
                eVar.d2 = true;
            }
            if (!eVar.f2) {
                return g.c(gVar, 0, cVar, (b0) null, 0, 0, 0, 61).a(gVar.f);
            }
            throw new IOException("Canceled");
        } catch (RouteException e) {
            dVar.c(e.c);
            throw e;
        } catch (IOException e2) {
            dVar.c(e2);
            throw new RouteException(e2);
        }
    }
}
