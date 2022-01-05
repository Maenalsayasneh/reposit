package i0.h.a.a.h.e;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import i0.h.a.a.h.e.p;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent */
public final class k extends p {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final NetworkConnectionInfo g;

    /* compiled from: AutoValue_LogEvent */
    public static final class b extends p.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public NetworkConnectionInfo g;
    }

    public k(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, a aVar) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = networkConnectionInfo;
    }

    public Integer a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public NetworkConnectionInfo d() {
        return this.g;
    }

    public byte[] e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a == pVar.b() && ((num = this.b) != null ? num.equals(pVar.a()) : pVar.a() == null) && this.c == pVar.c()) {
            if (Arrays.equals(this.d, pVar instanceof k ? ((k) pVar).d : pVar.e()) && ((str = this.e) != null ? str.equals(pVar.f()) : pVar.f() == null) && this.f == pVar.g()) {
                NetworkConnectionInfo networkConnectionInfo = this.g;
                if (networkConnectionInfo == null) {
                    if (pVar.d() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.g;
        if (networkConnectionInfo != null) {
            i2 = networkConnectionInfo.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("LogEvent{eventTimeMs=");
        P0.append(this.a);
        P0.append(", eventCode=");
        P0.append(this.b);
        P0.append(", eventUptimeMs=");
        P0.append(this.c);
        P0.append(", sourceExtension=");
        P0.append(Arrays.toString(this.d));
        P0.append(", sourceExtensionJsonProto3=");
        P0.append(this.e);
        P0.append(", timezoneOffsetSeconds=");
        P0.append(this.f);
        P0.append(", networkConnectionInfo=");
        P0.append(this.g);
        P0.append("}");
        return P0.toString();
    }
}
