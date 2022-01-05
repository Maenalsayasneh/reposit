package i0.j.e.v0.e.j;

import com.instabug.library.network.RequestResponse;
import k0.b.y.e;

/* compiled from: AttributesRemoteDataSource */
public class h implements e<RequestResponse, String> {
    public Object apply(Object obj) throws Exception {
        RequestResponse requestResponse = (RequestResponse) obj;
        return (requestResponse == null || requestResponse.getResponseBody() == null) ? "{}" : (String) requestResponse.getResponseBody();
    }
}
