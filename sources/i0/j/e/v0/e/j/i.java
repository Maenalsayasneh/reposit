package i0.j.e.v0.e.j;

import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Header;
import k0.b.y.d;

/* compiled from: AttributesRemoteDataSource */
public class i implements d<RequestResponse> {
    public final /* synthetic */ m c;

    public i(m mVar) {
        this.c = mVar;
    }

    public void b(Object obj) throws Exception {
        this.c.a.saveOrUpdateString("key_user_attrs_hash", ((RequestResponse) obj).getHeaders().get(Header.IF_MATCH));
    }
}
