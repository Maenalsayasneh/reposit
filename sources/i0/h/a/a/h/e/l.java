package i0.h.a.a.h.e;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

/* compiled from: AutoValue_LogRequest */
public final class l extends q {
    public final long a;
    public final long b;
    public final ClientInfo c;
    public final Integer d;
    public final String e;
    public final List<p> f;
    public final QosTier g;

    public l(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier, a aVar) {
        this.a = j;
        this.b = j2;
        this.c = clientInfo;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = qosTier;
    }

    public ClientInfo a() {
        return this.c;
    }

    public List<p> b() {
        return this.f;
    }

    public Integer c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public QosTier e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<p> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == qVar.f() && this.b == qVar.g() && ((clientInfo = this.c) != null ? clientInfo.equals(qVar.a()) : qVar.a() == null) && ((num = this.d) != null ? num.equals(qVar.c()) : qVar.c() == null) && ((str = this.e) != null ? str.equals(qVar.d()) : qVar.d() == null) && ((list = this.f) != null ? list.equals(qVar.b()) : qVar.b() == null)) {
            QosTier qosTier = this.g;
            if (qosTier == null) {
                if (qVar.e() == null) {
                    return true;
                }
            } else if (qosTier.equals(qVar.e())) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.a;
    }

    public long g() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.c;
        int i2 = 0;
        int hashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<p> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.g;
        if (qosTier != null) {
            i2 = qosTier.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("LogRequest{requestTimeMs=");
        P0.append(this.a);
        P0.append(", requestUptimeMs=");
        P0.append(this.b);
        P0.append(", clientInfo=");
        P0.append(this.c);
        P0.append(", logSource=");
        P0.append(this.d);
        P0.append(", logSourceName=");
        P0.append(this.e);
        P0.append(", logEvents=");
        P0.append(this.f);
        P0.append(", qosTier=");
        P0.append(this.g);
        P0.append("}");
        return P0.toString();
    }
}
