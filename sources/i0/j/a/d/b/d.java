package i0.j.a.d.b;

import com.instabug.library.model.common.Session;
import java.util.List;

/* compiled from: SessionCacheModel */
public class d implements Session {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final long h;
    public final int i;
    public List<b> j;
    public List<c> k;
    public List<f> l;
    public List<a> m;
    public e n;

    public d(String str, String str2, String str3, String str4, String str5, long j2, long j3, long j4, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j2;
        this.g = j3;
        this.i = i2;
        this.h = j4;
    }

    public String getAppVersion() {
        return this.d;
    }

    public String getId() {
        return this.a;
    }

    public String getOs() {
        return this.c;
    }

    public long getStartNanoTime() {
        return this.h;
    }

    public long getStartTimestampMicros() {
        return this.g;
    }

    public String getUuid() {
        return this.e;
    }
}
