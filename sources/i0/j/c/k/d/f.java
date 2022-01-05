package i0.j.c.k.d;

import com.instabug.library.network.RequestResponse;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.a;
import k0.b.y.e;
import k0.b.z.e.a.b;

/* compiled from: MessagingService */
public class f implements e<RequestResponse, k0.b.e> {
    public Object apply(Object obj) throws Exception {
        RequestResponse requestResponse = (RequestResponse) obj;
        if (requestResponse.getResponseCode() == 200) {
            return a.c();
        }
        return RxJavaPlugins.onAssembly((a) new b(new Exception(i0.d.a.a.a.U(requestResponse, i0.d.a.a.a.P0("sending push notification token got error with response code: ")))));
    }
}
