package com.pubnub.api.endpoints.vendor;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.logging.Logger;
import m0.r.t.a.r.m.a1.a;
import okhttp3.Protocol;
import q0.b0;
import q0.e0;
import q0.f;
import q0.f0;
import q0.g;
import q0.v;
import q0.y;
import r0.h;
import r0.i;
import r0.s;
import r0.t;
import r0.z;

public class AppEngineFactory implements f {
    private static final Logger log = Logger.getLogger(AppEngineFactory.class.getName());
    private PubNub pubNub;
    private b0 request;

    public static class Factory implements f.a {
        private PubNub pubNub;

        public Factory(PubNub pubNub2) {
            this.pubNub = pubNub2;
        }

        public f newCall(b0 b0Var) {
            return new AppEngineFactory(b0Var, this.pubNub);
        }
    }

    public AppEngineFactory(b0 b0Var, PubNub pubNub2) {
        this.request = b0Var;
        this.pubNub = pubNub2;
    }

    public void cancel() {
    }

    public void enqueue(g gVar) {
    }

    public e0 execute() throws IOException {
        b0 signRequest = PubNubUtil.signRequest(this.request, this.pubNub.getConfiguration(), this.pubNub.getTimestamp());
        this.request = signRequest;
        final HttpURLConnection httpURLConnection = (HttpURLConnection) signRequest.b.k().openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod(this.request.c);
        v vVar = this.request.d;
        if (vVar != null) {
            for (int i = 0; i < vVar.size(); i++) {
                String c = vVar.c(i);
                httpURLConnection.setRequestProperty(c, vVar.b(c));
            }
        }
        if (this.request.e != null) {
            h b0 = a.b0(a.A3(httpURLConnection.getOutputStream()));
            this.request.e.d(b0);
            ((s) b0).close();
        }
        httpURLConnection.connect();
        final i c0 = a.c0(a.D3(httpURLConnection.getInputStream()));
        if (httpURLConnection.getResponseCode() == 200) {
            e0.a aVar = new e0.a();
            aVar.c = httpURLConnection.getResponseCode();
            aVar.e(httpURLConnection.getResponseMessage());
            aVar.g(this.request);
            aVar.f(Protocol.HTTP_1_1);
            aVar.g = new f0() {
                public long contentLength() {
                    try {
                        return Long.parseLong(httpURLConnection.getHeaderField("content-length"));
                    } catch (NumberFormatException unused) {
                        return -1;
                    }
                }

                public y contentType() {
                    String contentType = httpURLConnection.getContentType();
                    y.a aVar = y.c;
                    return y.a.b(contentType);
                }

                public i source() {
                    return c0;
                }
            };
            return aVar.a();
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Fail to call  :: ");
        t tVar = (t) c0;
        tVar.c.V(tVar.q);
        P0.append(tVar.c.w());
        throw new IOException(P0.toString());
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isExecuted() {
        return false;
    }

    public b0 request() {
        return this.request;
    }

    public z timeout() {
        return z.a;
    }

    public f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
