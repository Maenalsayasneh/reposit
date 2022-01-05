package i0.h.a.a.i;

import com.google.android.datatransport.runtime.EventInternal;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_EventInternal */
public final class a extends EventInternal {
    public final String a;
    public final Integer b;
    public final e c;
    public final long d;
    public final long e;
    public final Map<String, String> f;

    /* compiled from: AutoValue_EventInternal */
    public static final class b extends EventInternal.a {
        public String a;
        public Integer b;
        public e c;
        public Long d;
        public Long e;
        public Map<String, String> f;

        public EventInternal b() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = i0.d.a.a.a.n0(str, " encodedPayload");
            }
            if (this.d == null) {
                str = i0.d.a.a.a.n0(str, " eventMillis");
            }
            if (this.e == null) {
                str = i0.d.a.a.a.n0(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = i0.d.a.a.a.n0(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, (C0124a) null);
            }
            throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str));
        }

        public Map<String, String> c() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public EventInternal.a d(e eVar) {
            Objects.requireNonNull(eVar, "Null encodedPayload");
            this.c = eVar;
            return this;
        }

        public EventInternal.a e(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public EventInternal.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        public EventInternal.a g(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    public a(String str, Integer num, e eVar, long j, long j2, Map map, C0124a aVar) {
        this.a = str;
        this.b = num;
        this.c = eVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (!this.a.equals(eventInternal.getTransportName()) || ((num = this.b) != null ? !num.equals(eventInternal.getCode()) : eventInternal.getCode() != null) || !this.c.equals(eventInternal.getEncodedPayload()) || this.d != eventInternal.getEventMillis() || this.e != eventInternal.getUptimeMillis() || !this.f.equals(eventInternal.getAutoMetadata())) {
            return false;
        }
        return true;
    }

    public Map<String, String> getAutoMetadata() {
        return this.f;
    }

    public Integer getCode() {
        return this.b;
    }

    public e getEncodedPayload() {
        return this.c;
    }

    public long getEventMillis() {
        return this.d;
    }

    public String getTransportName() {
        return this.a;
    }

    public long getUptimeMillis() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventInternal{transportName=");
        P0.append(this.a);
        P0.append(", code=");
        P0.append(this.b);
        P0.append(", encodedPayload=");
        P0.append(this.c);
        P0.append(", eventMillis=");
        P0.append(this.d);
        P0.append(", uptimeMillis=");
        P0.append(this.e);
        P0.append(", autoMetadata=");
        P0.append(this.f);
        P0.append("}");
        return P0.toString();
    }
}
