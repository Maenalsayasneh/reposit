package i0.h.a.d.a.d;

import com.google.android.play.core.install.InstallState;
import com.pubnub.api.builder.PubNubErrorBuilder;
import java.util.Objects;

public final class a extends InstallState {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public a(int i, long j, long j2, int i2, String str) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        Objects.requireNonNull(str, "Null packageName");
        this.e = str;
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.a == installState.c() && this.b == installState.a() && this.c == installState.e() && this.d == installState.b() && this.e.equals(installState.d());
        }
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        int i2 = this.d;
        String str = this.e;
        StringBuilder sb = new StringBuilder(str.length() + PubNubErrorBuilder.PNERR_PUSH_TOPIC_MISSING);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
