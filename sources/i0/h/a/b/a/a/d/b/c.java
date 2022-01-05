package i0.h.a.b.a.a.d.b;

import com.google.android.gms.common.api.Status;
import com.instabug.library.networkv2.request.Header;
import h0.b0.v;
import i0.h.a.b.c.g.j.m;
import i0.h.a.b.c.j.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class c implements Runnable {
    public static final a c = new a("RevokeAccessOperation", new String[0]);
    public final String d;
    public final m q = new m((i0.h.a.b.c.g.c) null);

    public c(String str) {
        v.x(str);
        this.d = str;
    }

    public final void run() {
        Status status = Status.q;
        try {
            String valueOf = String.valueOf(this.d);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty(Header.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.c;
            } else {
                c.b("Unable to revoke access!", new Object[0]);
            }
            a aVar = c;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            a aVar2 = c;
            String valueOf2 = String.valueOf(e.toString());
            aVar2.b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            a aVar3 = c;
            String valueOf3 = String.valueOf(e2.toString());
            aVar3.b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.q.e(status);
    }
}
