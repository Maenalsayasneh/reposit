package i0.h.a.a.h.e;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* compiled from: AutoValue_ClientInfo */
public final class j extends ClientInfo {
    public final ClientInfo.ClientType a;
    public final a b;

    public j(ClientInfo.ClientType clientType, a aVar, a aVar2) {
        this.a = clientType;
        this.b = aVar;
    }

    public a a() {
        return this.b;
    }

    public ClientInfo.ClientType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.a;
        if (clientType != null ? clientType.equals(clientInfo.b()) : clientInfo.b() == null) {
            a aVar = this.b;
            if (aVar == null) {
                if (clientInfo.a() == null) {
                    return true;
                }
            } else if (aVar.equals(clientInfo.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.a;
        int i = 0;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClientInfo{clientType=");
        P0.append(this.a);
        P0.append(", androidClientInfo=");
        P0.append(this.b);
        P0.append("}");
        return P0.toString();
    }
}
