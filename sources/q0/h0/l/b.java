package q0.h0.l;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.PaymentMethod;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import m0.n.b.f;
import m0.n.b.i;
import okhttp3.Protocol;
import q0.h0.l.i.f;
import q0.h0.l.i.g;
import q0.h0.l.i.h;
import q0.h0.l.i.j;
import q0.h0.l.i.k;
import q0.h0.l.i.l;
import q0.h0.n.c;
import q0.h0.n.e;

/* compiled from: AndroidPlatform.kt */
public final class b extends h {
    public static final boolean d;
    public static final a e = new a((f) null);
    public final List<k> f;
    public final h g;

    /* compiled from: AndroidPlatform.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* renamed from: q0.h0.l.b$b  reason: collision with other inner class name */
    /* compiled from: AndroidPlatform.kt */
    public static final class C0291b implements e {
        public final X509TrustManager a;
        public final Method b;

        public C0291b(X509TrustManager x509TrustManager, Method method) {
            i.e(x509TrustManager, "trustManager");
            i.e(method, "findByIssuerAndSignatureMethod");
            this.a = x509TrustManager;
            this.b = method;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            i.e(x509Certificate, "cert");
            try {
                Object invoke = this.b.invoke(this.a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0291b)) {
                return false;
            }
            C0291b bVar = (C0291b) obj;
            return i.a(this.a, bVar.a) && i.a(this.b, bVar.b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("CustomTrustRootIndex(trustManager=");
            P0.append(this.a);
            P0.append(", findByIssuerAndSignatureMethod=");
            P0.append(this.b);
            P0.append(")");
            return P0.toString();
        }
    }

    static {
        boolean z = false;
        if (h.c.c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        d = z;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        l.a aVar = l.h;
        i.e("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt" + ".OpenSSLSocketFactoryImpl");
            Class<?> cls3 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            i.d(cls3, "paramsClass");
            lVar = new l(cls, cls2, cls3);
        } catch (Exception e2) {
            h.a.i("unable to load android socket classes", 5, e2);
            lVar = null;
        }
        kVarArr[0] = lVar;
        f.a aVar2 = q0.h0.l.i.f.b;
        kVarArr[1] = new j(q0.h0.l.i.f.a);
        kVarArr[2] = new j(q0.h0.l.i.i.a);
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
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", new Class[0]);
            method = cls4.getMethod("open", new Class[]{String.class});
            method2 = cls4.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.g = new h(method3, method, method2);
    }

    public c b(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        q0.h0.l.i.b b = q0.h0.l.i.b.b(x509TrustManager);
        return b != null ? b : super.b(x509TrustManager);
    }

    public e c(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            i.d(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0291b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        T t;
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
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

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        i.e(socket, "socket");
        i.e(inetSocketAddress, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    public String f(SSLSocket sSLSocket) {
        T t;
        i.e(sSLSocket, "sslSocket");
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

    public Object g(String str) {
        i.e(str, "closer");
        h hVar = this.g;
        Objects.requireNonNull(hVar);
        i.e(str, "closer");
        Method method = hVar.a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = hVar.b;
            i.c(method2);
            method2.invoke(invoke, new Object[]{str});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean h(String str) {
        i.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public void k(String str, Object obj) {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        h hVar = this.g;
        Objects.requireNonNull(hVar);
        boolean z = false;
        if (obj != null) {
            try {
                Method method = hVar.c;
                i.c(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            h.j(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
