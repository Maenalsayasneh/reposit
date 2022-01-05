package i0.j.c.k.d;

import com.instabug.library.model.State;
import com.instabug.library.network.Request;
import k0.b.y.e;

/* compiled from: MessagingService */
public class h implements e<Request, Request> {
    public final /* synthetic */ String c;

    public h(String str) {
        this.c = str;
    }

    public Object apply(Object obj) throws Exception {
        Request request = (Request) obj;
        request.addRequestBodyParameter(State.KEY_PUSH_TOKEN, this.c);
        return request;
    }
}
