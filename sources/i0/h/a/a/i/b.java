package i0.h.a.a.i;

import com.google.android.datatransport.Priority;
import i0.h.a.a.i.h;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_TransportContext */
public final class b extends h {
    public final String a;
    public final byte[] b;
    public final Priority c;

    /* renamed from: i0.h.a.a.i.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_TransportContext */
    public static final class C0125b extends h.a {
        public String a;
        public byte[] b;
        public Priority c;

        public h a() {
            String str = this.a == null ? " backendName" : "";
            if (this.c == null) {
                str = i0.d.a.a.a.n0(str, " priority");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c, (a) null);
            }
            throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str));
        }

        public h.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        public h.a c(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.c = priority;
            return this;
        }
    }

    public b(String str, byte[] bArr, Priority priority, a aVar) {
        this.a = str;
        this.b = bArr;
        this.c = priority;
    }

    public String b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public Priority d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a.equals(hVar.b())) {
            if (Arrays.equals(this.b, hVar instanceof b ? ((b) hVar).b : hVar.c()) && this.c.equals(hVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
