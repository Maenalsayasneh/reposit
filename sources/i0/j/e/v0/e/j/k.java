package i0.j.e.v0.e.j;

import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.TimeUtils;
import k0.b.y.d;

/* compiled from: AttributesRemoteDataSource */
public class k implements d<RequestResponse> {
    public final /* synthetic */ m c;

    public k(m mVar) {
        this.c = mVar;
    }

    public void b(Object obj) throws Exception {
        RequestResponse requestResponse = (RequestResponse) obj;
        m mVar = this.c;
        mVar.a.saveOrUpdateLong("key_user_attrs_last_sync", TimeUtils.currentTimeMillis());
    }
}
