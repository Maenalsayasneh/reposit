package q0.h0.l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import q0.h0.l.i.a;
import q0.h0.l.i.b;
import q0.h0.l.i.f;
import q0.h0.l.i.g;
import q0.h0.l.i.i;
import q0.h0.l.i.j;
import q0.h0.l.i.k;
import q0.h0.n.c;

/* compiled from: Android10Platform.kt */
public final class a extends h {
    public static final boolean d = (h.c.c() && Build.VERSION.SDK_INT >= 29);
    public static final a e = null;
    public final List<k> f;

    public a() {
        k[] kVarArr = new k[4];
        kVarArr[0] = a.C0292a.a() ? new q0.h0.l.i.a() : null;
        f.a aVar = f.b;
        kVarArr[1] = new j(f.a);
        kVarArr[2] = new j(i.a);
        kVarArr[3] = new j(g.a);
        List M = m0.j.g.M(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) M).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).b()) {
                arrayList.add(next);
            }
        }
        this.f = arrayList;
    }

    public c b(X509TrustManager x509TrustManager) {
        m0.n.b.i.e(x509TrustManager, "trustManager");
        b b = b.b(x509TrustManager);
        return b != null ? b : super.b(x509TrustManager);
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        T t;
        m0.n.b.i.e(sSLSocket, "sslSocket");
        m0.n.b.i.e(list, "protocols");
        Iterator<T> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    public String f(SSLSocket sSLSocket) {
        T t;
        m0.n.b.i.e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            return kVar.c(sSLSocket);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public boolean h(String str) {
        m0.n.b.i.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
