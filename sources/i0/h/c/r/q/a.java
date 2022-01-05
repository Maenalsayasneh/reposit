package i0.h.c.r.q;

import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;

/* compiled from: AutoValue_InstallationResponse */
public final class a extends InstallationResponse {
    public final String a;
    public final String b;
    public final String c;
    public final TokenResult d;
    public final InstallationResponse.ResponseCode e;

    public a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode, C0151a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tokenResult;
        this.e = responseCode;
    }

    public TokenResult a() {
        return this.d;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public InstallationResponse.ResponseCode d() {
        return this.e;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.a;
        if (str != null ? str.equals(installationResponse.e()) : installationResponse.e() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(installationResponse.b()) : installationResponse.b() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(installationResponse.c()) : installationResponse.c() == null) {
                    TokenResult tokenResult = this.d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.a()) : installationResponse.a() == null) {
                        InstallationResponse.ResponseCode responseCode = this.e;
                        if (responseCode == null) {
                            if (installationResponse.d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("InstallationResponse{uri=");
        P0.append(this.a);
        P0.append(", fid=");
        P0.append(this.b);
        P0.append(", refreshToken=");
        P0.append(this.c);
        P0.append(", authToken=");
        P0.append(this.d);
        P0.append(", responseCode=");
        P0.append(this.e);
        P0.append("}");
        return P0.toString();
    }
}
