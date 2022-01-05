package q0;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import okhttp3.Protocol;
import q0.h0.c;
import q0.w;

/* compiled from: Address.kt */
public final class a {
    public final w a;
    public final List<Protocol> b;
    public final List<m> c;
    public final s d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final h h;
    public final c i;
    public final Proxy j;
    public final ProxySelector k;

    public a(String str, int i2, s sVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h hVar, c cVar, Proxy proxy, List<? extends Protocol> list, List<m> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i3 = i2;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        c cVar2 = cVar;
        ProxySelector proxySelector2 = proxySelector;
        i.e(str, "uriHost");
        i.e(sVar, "dns");
        i.e(socketFactory2, "socketFactory");
        i.e(cVar2, "proxyAuthenticator");
        i.e(list, "protocols");
        i.e(list2, "connectionSpecs");
        i.e(proxySelector2, "proxySelector");
        this.d = sVar;
        this.e = socketFactory2;
        this.f = sSLSocketFactory2;
        this.g = hostnameVerifier;
        this.h = hVar;
        this.i = cVar2;
        this.j = proxy;
        this.k = proxySelector2;
        w.a aVar = new w.a();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        i.e(str3, "scheme");
        boolean z = true;
        if (StringsKt__IndentKt.f(str3, "http", true)) {
            aVar.b = "http";
        } else if (StringsKt__IndentKt.f(str3, "https", true)) {
            aVar.b = "https";
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.n0("unexpected scheme: ", str3));
        }
        i.e(str, "host");
        String Y3 = m0.r.t.a.r.m.a1.a.Y3(w.b.d(w.b, str, 0, 0, false, 7));
        if (Y3 != null) {
            aVar.e = Y3;
            if ((1 > i3 || 65535 < i3) ? false : z) {
                aVar.f = i3;
                this.a = aVar.b();
                this.b = c.x(list);
                this.c = c.x(list2);
                return;
            }
            throw new IllegalArgumentException(i0.d.a.a.a.e0("unexpected port: ", i2).toString());
        }
        throw new IllegalArgumentException(i0.d.a.a.a.n0("unexpected host: ", str));
    }

    public final boolean a(a aVar) {
        i.e(aVar, "that");
        return i.a(this.d, aVar.d) && i.a(this.i, aVar.i) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c) && i.a(this.k, aVar.k) && i.a(this.j, aVar.j) && i.a(this.f, aVar.f) && i.a(this.g, aVar.g) && i.a(this.h, aVar.h) && this.a.h == aVar.a.h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && a(aVar);
        }
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.i.hashCode();
        int H = i0.d.a.a.a.H(this.c, i0.d.a.a.a.H(this.b, (hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31, 31), 31);
        int hashCode3 = Objects.hashCode(this.j);
        int hashCode4 = Objects.hashCode(this.f);
        int hashCode5 = Objects.hashCode(this.g);
        return Objects.hashCode(this.h) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((this.k.hashCode() + H) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder P0 = i0.d.a.a.a.P0("Address{");
        P0.append(this.a.g);
        P0.append(':');
        P0.append(this.a.h);
        P0.append(", ");
        if (this.j != null) {
            sb = i0.d.a.a.a.P0("proxy=");
            obj = this.j;
        } else {
            sb = i0.d.a.a.a.P0("proxySelector=");
            obj = this.k;
        }
        sb.append(obj);
        P0.append(sb.toString());
        P0.append("}");
        return P0.toString();
    }
}
