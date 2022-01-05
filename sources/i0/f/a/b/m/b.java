package i0.f.a.b.m;

import i0.f.a.b.m.j;
import java.lang.ref.SoftReference;

/* compiled from: BufferRecyclers */
public class b {
    public static final j a;
    public static final ThreadLocal<SoftReference<a>> b = new ThreadLocal<>();

    static {
        boolean z;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z ? j.a.a : null;
    }
}
