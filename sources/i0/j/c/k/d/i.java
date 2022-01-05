package i0.j.c.k.d;

import android.content.Context;
import com.instabug.library.network.Request;
import java.util.concurrent.Callable;

/* compiled from: MessagingService */
public class i implements Callable<Request> {
    public final /* synthetic */ Context c;
    public final /* synthetic */ d d;

    public i(d dVar, Context context) {
        this.d = dVar;
        this.c = context;
    }

    public Object call() throws Exception {
        return this.d.b.buildRequest(this.c, Request.Endpoint.PUSH_TOKEN, Request.RequestMethod.Post);
    }
}
