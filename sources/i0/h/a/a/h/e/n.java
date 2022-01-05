package i0.h.a.a.h.e;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* compiled from: AutoValue_NetworkConnectionInfo */
public final class n extends NetworkConnectionInfo {
    public final NetworkConnectionInfo.NetworkType a;
    public final NetworkConnectionInfo.MobileSubtype b;

    public n(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype, a aVar) {
        this.a = networkType;
        this.b = mobileSubtype;
    }

    public NetworkConnectionInfo.MobileSubtype a() {
        return this.b;
    }

    public NetworkConnectionInfo.NetworkType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.b()) : networkConnectionInfo.b() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.a() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.a;
        int i = 0;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        if (mobileSubtype != null) {
            i = mobileSubtype.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("NetworkConnectionInfo{networkType=");
        P0.append(this.a);
        P0.append(", mobileSubtype=");
        P0.append(this.b);
        P0.append("}");
        return P0.toString();
    }
}
