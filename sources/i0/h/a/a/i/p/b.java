package i0.h.a.a.i.p;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: AutoValue_BackendResponse */
public final class b extends BackendResponse {
    public final BackendResponse.Status a;
    public final long b;

    public b(BackendResponse.Status status, long j) {
        Objects.requireNonNull(status, "Null status");
        this.a = status;
        this.b = j;
    }

    public long b() {
        return this.b;
    }

    public BackendResponse.Status c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (!this.a.equals(backendResponse.c()) || this.b != backendResponse.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder P0 = a.P0("BackendResponse{status=");
        P0.append(this.a);
        P0.append(", nextRequestWaitMillis=");
        P0.append(this.b);
        P0.append("}");
        return P0.toString();
    }
}
