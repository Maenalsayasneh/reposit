package com.instabug.apm.networkinterception;

import i0.j.a.o.a;
import i0.j.a.o.b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class URLConnectionHandler {
    public static URLConnection openConnection(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            return new b((HttpsURLConnection) openConnection);
        }
        return openConnection instanceof HttpURLConnection ? new a((HttpURLConnection) openConnection) : openConnection;
    }
}
