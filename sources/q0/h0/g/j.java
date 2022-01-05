package q0.h0.g;

import androidx.core.app.NotificationCompat;
import com.stripe.android.model.PaymentMethod;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import m0.n.b.i;
import okhttp3.internal.connection.RouteSelector$resetNextProxy$1;
import q0.f;
import q0.g0;
import q0.t;
import q0.w;

/* compiled from: RouteSelector.kt */
public final class j {
    public List<? extends Proxy> a;
    public int b;
    public List<? extends InetSocketAddress> c;
    public final List<g0> d = new ArrayList();
    public final q0.a e;
    public final i f;
    public final f g;
    public final t h;

    /* compiled from: RouteSelector.kt */
    public static final class a {
        public int a;
        public final List<g0> b;

        public a(List<g0> list) {
            i.e(list, "routes");
            this.b = list;
        }

        public final boolean a() {
            return this.a < this.b.size();
        }

        public final g0 b() {
            if (a()) {
                List<g0> list = this.b;
                int i = this.a;
                this.a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public j(q0.a aVar, i iVar, f fVar, t tVar) {
        i.e(aVar, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        i.e(iVar, "routeDatabase");
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(tVar, "eventListener");
        this.e = aVar;
        this.f = iVar;
        this.g = fVar;
        this.h = tVar;
        EmptyList emptyList = EmptyList.c;
        this.a = emptyList;
        this.c = emptyList;
        w wVar = aVar.a;
        RouteSelector$resetNextProxy$1 routeSelector$resetNextProxy$1 = new RouteSelector$resetNextProxy$1(this, aVar.j, wVar);
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(wVar, "url");
        List<Proxy> a2 = routeSelector$resetNextProxy$1.invoke();
        this.a = a2;
        this.b = 0;
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(wVar, "url");
        i.e(a2, "proxies");
    }

    public final boolean a() {
        return b() || (this.d.isEmpty() ^ true);
    }

    public final boolean b() {
        return this.b < this.a.size();
    }
}
