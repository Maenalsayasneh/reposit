package q0.h0.h;

import com.instabug.library.networkv2.request.RequestMethod;
import m0.n.b.i;

/* compiled from: HttpMethod.kt */
public final class f {
    public static final boolean a(String str) {
        i.e(str, "method");
        return !i.a(str, RequestMethod.GET) && !i.a(str, "HEAD");
    }
}
