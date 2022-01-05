package i0.j.e.w0.b;

import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Request;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: InstabugBaseConnectionManager */
public interface a {
    HttpURLConnection create(Request request) throws Exception;

    String getContentType();

    RequestResponse handleResponse(HttpURLConnection httpURLConnection, Request request) throws IOException;

    void handleServerError(HttpURLConnection httpURLConnection);

    HttpURLConnection setupConnection(HttpURLConnection httpURLConnection, Request request) throws Exception;
}
