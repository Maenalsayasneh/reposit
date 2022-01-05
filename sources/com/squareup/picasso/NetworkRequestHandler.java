package com.squareup.picasso;

import android.net.NetworkInfo;
import android.os.Handler;
import com.instabug.library.networkv2.request.Header;
import com.squareup.picasso.Picasso;
import i0.d.a.a.a;
import i0.o.a.j;
import i0.o.a.t;
import i0.o.a.v;
import i0.o.a.x;
import java.io.IOException;
import m0.n.b.f;
import m0.n.b.i;
import q0.b0;
import q0.e;
import q0.e0;
import q0.f0;

public class NetworkRequestHandler extends v {
    public final j a;
    public final x b;

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public static final class ResponseException extends IOException {
        public final int c;
        public final int d;

        public ResponseException(int i, int i2) {
            super(a.e0("HTTP ", i));
            this.c = i;
            this.d = i2;
        }
    }

    public NetworkRequestHandler(j jVar, x xVar) {
        this.a = jVar;
        this.b = xVar;
    }

    public boolean c(t tVar) {
        String scheme = tVar.d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    public int e() {
        return 2;
    }

    public v.a f(t tVar, int i) throws IOException {
        e eVar;
        boolean z = true;
        if (i != 0) {
            eVar = NetworkPolicy.isOfflineOnly(i) ? e.a : new e(!NetworkPolicy.shouldReadFromDiskCache(i), !NetworkPolicy.shouldWriteToDiskCache(i), -1, -1, false, false, false, -1, -1, false, false, false, (String) null, (f) null);
        } else {
            eVar = null;
        }
        b0.a aVar = new b0.a();
        aVar.h(tVar.d.toString());
        if (eVar != null) {
            i.e(eVar, "cacheControl");
            String eVar2 = eVar.toString();
            if (eVar2.length() != 0) {
                z = false;
            }
            if (z) {
                aVar.f(Header.CACHE_CONTROL);
            } else {
                aVar.c(Header.CACHE_CONTROL, eVar2);
            }
        }
        e0 a2 = this.a.a(aVar.b());
        f0 f0Var = a2.a2;
        if (a2.e()) {
            Picasso.LoadedFrom loadedFrom = a2.c2 == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
            if (loadedFrom == Picasso.LoadedFrom.DISK && f0Var.contentLength() == 0) {
                f0Var.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && f0Var.contentLength() > 0) {
                x xVar = this.b;
                long contentLength = f0Var.contentLength();
                Handler handler = xVar.c;
                handler.sendMessage(handler.obtainMessage(4, Long.valueOf(contentLength)));
            }
            return new v.a(f0Var.source(), loadedFrom);
        }
        f0Var.close();
        throw new ResponseException(a2.y, 0);
    }

    public boolean g(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
