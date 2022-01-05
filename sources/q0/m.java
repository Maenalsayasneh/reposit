package q0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import m0.j.g;
import m0.n.b.i;
import okhttp3.TlsVersion;
import q0.h0.c;
import q0.j;

/* compiled from: ConnectionSpec.kt */
public final class m {
    public static final j[] a;
    public static final j[] b;
    public static final m c;
    public static final m d = new m(false, false, (String[]) null, (String[]) null);
    public final boolean e;
    public final boolean f;
    public final String[] g;
    public final String[] h;

    /* compiled from: ConnectionSpec.kt */
    public static final class a {
        public boolean a;
        public String[] b;
        public String[] c;
        public boolean d;

        public a(boolean z) {
            this.a = z;
        }

        public final m a() {
            return new m(this.a, this.d, this.b, this.c);
        }

        public final a b(String... strArr) {
            i.e(strArr, "cipherSuites");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(j... jVarArr) {
            i.e(jVarArr, "cipherSuites");
            if (this.a) {
                ArrayList arrayList = new ArrayList(jVarArr.length);
                for (j jVar : jVarArr) {
                    arrayList.add(jVar.t);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                b((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z) {
            if (this.a) {
                this.d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(String... strArr) {
            i.e(strArr, "tlsVersions");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(TlsVersion... tlsVersionArr) {
            i.e(tlsVersionArr, "tlsVersions");
            if (this.a) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion javaName : tlsVersionArr) {
                    arrayList.add(javaName.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                e((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(m mVar) {
            i.e(mVar, "connectionSpec");
            this.a = mVar.e;
            this.b = mVar.g;
            this.c = mVar.h;
            this.d = mVar.f;
        }
    }

    static {
        j jVar = j.p;
        j jVar2 = j.q;
        j jVar3 = j.r;
        j jVar4 = j.j;
        j jVar5 = j.l;
        j jVar6 = j.k;
        j jVar7 = j.m;
        j jVar8 = j.o;
        j jVar9 = j.n;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9};
        a = jVarArr;
        j[] jVarArr2 = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, j.h, j.i, j.f, j.g, j.d, j.e, j.c};
        b = jVarArr2;
        a aVar = new a(true);
        aVar.c((j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.f(tlsVersion, tlsVersion2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c((j[]) Arrays.copyOf(jVarArr2, jVarArr2.length));
        aVar2.f(tlsVersion, tlsVersion2);
        aVar2.d(true);
        c = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c((j[]) Arrays.copyOf(jVarArr2, jVarArr2.length));
        aVar3.f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
    }

    public m(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.e = z;
        this.f = z2;
        this.g = strArr;
        this.h = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        i.e(sSLSocket, "sslSocket");
        if (this.g != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            i.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            String[] strArr3 = this.g;
            j.b bVar = j.s;
            Comparator<String> comparator = j.a;
            strArr = c.p(enabledCipherSuites, strArr3, j.a);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.h != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            i.d(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = c.p(enabledProtocols, this.h, m0.k.a.c);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        i.d(supportedCipherSuites, "supportedCipherSuites");
        j.b bVar2 = j.s;
        Comparator<String> comparator2 = j.a;
        Comparator<String> comparator3 = j.a;
        byte[] bArr = c.a;
        i.e(supportedCipherSuites, "$this$indexOf");
        i.e("TLS_FALLBACK_SCSV", InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.e(comparator3, "comparator");
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (((j.a) comparator3).compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z && i != -1) {
            i.d(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            i.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            i.e(strArr, "$this$concat");
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
            i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            strArr = (String[]) copyOf;
            strArr[h.t1(strArr)] = str;
        }
        a aVar = new a(this);
        i.d(strArr, "cipherSuitesIntersection");
        aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
        i.d(strArr2, "tlsVersionsIntersection");
        aVar.e((String[]) Arrays.copyOf(strArr2, strArr2.length));
        m a2 = aVar.a();
        if (a2.d() != null) {
            sSLSocket.setEnabledProtocols(a2.h);
        }
        if (a2.b() != null) {
            sSLSocket.setEnabledCipherSuites(a2.g);
        }
    }

    public final List<j> b() {
        String[] strArr = this.g;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b2 : strArr) {
            arrayList.add(j.s.b(b2));
        }
        return g.v0(arrayList);
    }

    public final boolean c(SSLSocket sSLSocket) {
        i.e(sSLSocket, "socket");
        if (!this.e) {
            return false;
        }
        String[] strArr = this.h;
        if (strArr != null && !c.j(strArr, sSLSocket.getEnabledProtocols(), m0.k.a.c)) {
            return false;
        }
        String[] strArr2 = this.g;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        j.b bVar = j.s;
        Comparator<String> comparator = j.a;
        if (!c.j(strArr2, enabledCipherSuites, j.a)) {
            return false;
        }
        return true;
    }

    public final List<TlsVersion> d() {
        String[] strArr = this.h;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a2 : strArr) {
            arrayList.add(TlsVersion.Companion.a(a2));
        }
        return g.v0(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.e;
        m mVar = (m) obj;
        if (z != mVar.e) {
            return false;
        }
        return !z || (Arrays.equals(this.g, mVar.g) && Arrays.equals(this.h, mVar.h) && this.f == mVar.f);
    }

    public int hashCode() {
        if (!this.e) {
            return 17;
        }
        String[] strArr = this.g;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.h;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f ^ true ? 1 : 0);
    }

    public String toString() {
        if (!this.e) {
            return "ConnectionSpec()";
        }
        StringBuilder S0 = i0.d.a.a.a.S0("ConnectionSpec(", "cipherSuites=");
        S0.append(Objects.toString(b(), "[all enabled]"));
        S0.append(", ");
        S0.append("tlsVersions=");
        S0.append(Objects.toString(d(), "[all enabled]"));
        S0.append(", ");
        S0.append("supportsTlsExtensions=");
        return i0.d.a.a.a.C0(S0, this.f, ')');
    }
}
