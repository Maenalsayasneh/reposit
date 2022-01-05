package i0.h.a.d.a.a;

import android.app.PendingIntent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import i0.d.a.a.a;
import java.util.Objects;

public final class r extends a {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final PendingIntent k;
    public final PendingIntent l;
    public final PendingIntent m;
    public final PendingIntent n;

    public r(String str, int i2, int i3, int i4, @Nullable Integer num, int i5, long j2, long j3, long j4, long j5, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        Objects.requireNonNull(str, "Null packageName");
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = num;
        this.f = i5;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = pendingIntent;
        this.l = pendingIntent2;
        this.m = pendingIntent3;
        this.n = pendingIntent4;
    }

    public final int a() {
        return this.b;
    }

    public final long b() {
        return this.i;
    }

    public final long c() {
        return this.g;
    }

    public final long d() {
        return this.j;
    }

    @Nullable
    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.m()) && this.b == aVar.a() && this.c == aVar.o() && this.d == aVar.l() && ((num = this.e) != null ? num.equals(aVar.e()) : aVar.e() == null) && this.f == aVar.p() && this.g == aVar.c() && this.h == aVar.n() && this.i == aVar.b() && this.j == aVar.d() && ((pendingIntent = this.k) != null ? pendingIntent.equals(aVar.f()) : aVar.f() == null) && ((pendingIntent2 = this.l) != null ? pendingIntent2.equals(aVar.g()) : aVar.g() == null) && ((pendingIntent3 = this.m) != null ? pendingIntent3.equals(aVar.h()) : aVar.h() == null)) {
                PendingIntent pendingIntent4 = this.n;
                PendingIntent i2 = aVar.i();
                if (pendingIntent4 != null ? pendingIntent4.equals(i2) : i2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final PendingIntent f() {
        return this.k;
    }

    @Nullable
    public final PendingIntent g() {
        return this.l;
    }

    @Nullable
    public final PendingIntent h() {
        return this.m;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        Integer num = this.e;
        int i2 = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i3 = this.f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        long j5 = this.j;
        int i4 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        PendingIntent pendingIntent = this.k;
        int hashCode3 = (i4 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.n;
        if (pendingIntent4 != null) {
            i2 = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    @Nullable
    public final PendingIntent i() {
        return this.n;
    }

    public final int l() {
        return this.d;
    }

    @NonNull
    public final String m() {
        return this.a;
    }

    public final long n() {
        return this.h;
    }

    public final int o() {
        return this.c;
    }

    public final int p() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        String valueOf = String.valueOf(this.e);
        int i5 = this.f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        long j5 = this.j;
        String valueOf2 = String.valueOf(this.k);
        long j6 = j5;
        String valueOf3 = String.valueOf(this.l);
        String valueOf4 = String.valueOf(this.m);
        long j7 = j4;
        String valueOf5 = String.valueOf(this.n);
        int length = str.length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + valueOf4.length() + valueOf5.length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i2);
        sb.append(", updateAvailability=");
        sb.append(i3);
        sb.append(", installStatus=");
        sb.append(i4);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i5);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", additionalSpaceRequired=");
        sb.append(j7);
        sb.append(", assetPackStorageSize=");
        sb.append(j6);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        a.s(sb, ", flexibleUpdateIntent=", valueOf3, ", immediateDestructiveUpdateIntent=", valueOf4);
        return a.z0(sb, ", flexibleDestructiveUpdateIntent=", valueOf5, "}");
    }
}
