package i0.h.c.r.p;

import com.google.firebase.installations.local.PersistedInstallation;
import i0.h.c.r.p.c;
import java.util.Objects;

/* compiled from: AutoValue_PersistedInstallationEntry */
public final class a extends c {
    public final String b;
    public final PersistedInstallation.RegistrationStatus c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    /* compiled from: AutoValue_PersistedInstallationEntry */
    public static final class b extends c.a {
        public String a;
        public PersistedInstallation.RegistrationStatus b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        public b() {
        }

        public c a() {
            String str = this.b == null ? " registrationStatus" : "";
            if (this.e == null) {
                str = i0.d.a.a.a.n0(str, " expiresInSecs");
            }
            if (this.f == null) {
                str = i0.d.a.a.a.n0(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g, (C0150a) null);
            }
            throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str));
        }

        public c.a b(PersistedInstallation.RegistrationStatus registrationStatus) {
            Objects.requireNonNull(registrationStatus, "Null registrationStatus");
            this.b = registrationStatus;
            return this;
        }

        public c.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        public c.a d(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public b(c cVar, C0150a aVar) {
            a aVar2 = (a) cVar;
            this.a = aVar2.b;
            this.b = aVar2.c;
            this.c = aVar2.d;
            this.d = aVar2.e;
            this.e = Long.valueOf(aVar2.f);
            this.f = Long.valueOf(aVar2.g);
            this.g = aVar2.h;
        }
    }

    public a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4, C0150a aVar) {
        this.b = str;
        this.c = registrationStatus;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    public String a() {
        return this.d;
    }

    public long b() {
        return this.f;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str3 = this.b;
        if (str3 != null ? str3.equals(cVar.c()) : cVar.c() == null) {
            if (this.c.equals(cVar.f()) && ((str = this.d) != null ? str.equals(cVar.a()) : cVar.a() == null) && ((str2 = this.e) != null ? str2.equals(cVar.e()) : cVar.e() == null) && this.f == cVar.b() && this.g == cVar.g()) {
                String str4 = this.h;
                if (str4 == null) {
                    if (cVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(cVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public PersistedInstallation.RegistrationStatus f() {
        return this.c;
    }

    public long g() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f;
        long j2 = this.g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    public c.a k() {
        return new b(this, (C0150a) null);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("PersistedInstallationEntry{firebaseInstallationId=");
        P0.append(this.b);
        P0.append(", registrationStatus=");
        P0.append(this.c);
        P0.append(", authToken=");
        P0.append(this.d);
        P0.append(", refreshToken=");
        P0.append(this.e);
        P0.append(", expiresInSecs=");
        P0.append(this.f);
        P0.append(", tokenCreationEpochInSecs=");
        P0.append(this.g);
        P0.append(", fisError=");
        return i0.d.a.a.a.y0(P0, this.h, "}");
    }
}
