package i0.j.c.k.d;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import k0.b.o;
import k0.b.y.e;

/* compiled from: MessagingService */
public class g implements e<Request, o<RequestResponse>> {
    public final /* synthetic */ d c;

    public g(d dVar) {
        this.c = dVar;
    }

    public Object apply(Object obj) throws Exception {
        return this.c.b.doRequest((Request) obj);
    }
}
