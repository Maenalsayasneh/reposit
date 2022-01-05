package i0.h.c.r.q;

import com.google.firebase.installations.remote.TokenResult;

/* compiled from: AutoValue_TokenResult */
public final class b extends TokenResult {
    public final String a;
    public final long b;
    public final TokenResult.ResponseCode c;

    /* renamed from: i0.h.c.r.q.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_TokenResult */
    public static final class C0152b extends TokenResult.a {
        public String a;
        public Long b;
        public TokenResult.ResponseCode c;

        public TokenResult a() {
            String str = this.b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.a, this.b.longValue(), this.c, (a) null);
            }
            throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str));
        }

        public TokenResult.a b(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public b(String str, long j, TokenResult.ResponseCode responseCode, a aVar) {
        this.a = str;
        this.b = j;
        this.c = responseCode;
    }

    public TokenResult.ResponseCode b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.a;
        if (str != null ? str.equals(tokenResult.c()) : tokenResult.c() == null) {
            if (this.b == tokenResult.d()) {
                TokenResult.ResponseCode responseCode = this.c;
                if (responseCode == null) {
                    if (tokenResult.b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("TokenResult{token=");
        P0.append(this.a);
        P0.append(", tokenExpirationTimestamp=");
        P0.append(this.b);
        P0.append(", responseCode=");
        P0.append(this.c);
        P0.append("}");
        return P0.toString();
    }
}
