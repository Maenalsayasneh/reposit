package i0.h.a.b.b;

import android.os.Bundle;
import i0.h.a.b.c.m.b;
import i0.h.a.b.m.f;
import i0.h.a.b.m.g;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class w implements f {
    public static final f a = new w();

    public final g a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.a;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return b.H(null);
        }
        return b.H(bundle);
    }
}
