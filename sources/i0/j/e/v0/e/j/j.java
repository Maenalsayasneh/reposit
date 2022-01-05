package i0.j.e.v0.e.j;

import com.instabug.library.network.RequestResponse;
import k0.b.y.f;

/* compiled from: AttributesRemoteDataSource */
public class j implements f<RequestResponse> {
    public boolean test(Object obj) throws Exception {
        return ((RequestResponse) obj).getResponseCode() == 200;
    }
}
