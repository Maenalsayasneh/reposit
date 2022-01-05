package i0.j.e.v0;

import com.instabug.library.networkv2.request.Header;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.d.a.a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;

/* compiled from: Multipart */
public class d {
    public final String a;
    public OutputStream b;
    public PrintWriter c = new PrintWriter(new OutputStreamWriter(this.b, FileEncryptionUtil.ENCODING_UTF_8), true);

    public d(HttpURLConnection httpURLConnection) throws IOException {
        StringBuilder P0 = a.P0("===");
        P0.append(System.currentTimeMillis());
        P0.append("===");
        String sb = P0.toString();
        this.a = sb;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setChunkedStreamingMode(1048576);
        httpURLConnection.setRequestProperty(Header.CONTENT_TYPE, "multipart/form-data; boundary=" + sb);
        this.b = httpURLConnection.getOutputStream();
    }
}
