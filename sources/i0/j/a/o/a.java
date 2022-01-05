package i0.j.a.o;

import com.instabug.apm.model.APMNetworkLog;
import com.instabug.library.model.NetworkLog;
import com.instabug.library.util.ObjectMapper;
import i0.j.a.o.c.a;
import i0.j.a.o.c.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

/* compiled from: APMHttpUrlConnection */
public class a extends HttpURLConnection implements a.C0157a {
    public final i0.j.a.n.a.a a = i0.j.a.g.a.i();
    public HttpURLConnection b;
    public long c;
    public long d;
    public b e;
    public HashMap<String, String> f = new HashMap<>();
    public APMNetworkLog g = new APMNetworkLog();

    public a(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.b = httpURLConnection;
        this.c = System.currentTimeMillis() * 1000;
        this.d = System.nanoTime();
        this.g.setUrl(httpURLConnection.getURL().toString());
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.b.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put(entry.getKey().toString(), entry.getValue().toString());
                if (entry.getKey().toString().equalsIgnoreCase(NetworkLog.CONTENT_TYPE)) {
                    this.g.setResponseContentType(entry.getValue().toString());
                }
            }
        }
        this.g.setResponseHeaders(ObjectMapper.toJson((Map<String, String>) hashMap).toString());
        c(this.c, Long.valueOf(j));
    }

    public void addRequestProperty(String str, String str2) {
        if (str != null) {
            this.f.put(str, str2);
            if (str.equalsIgnoreCase(NetworkLog.CONTENT_TYPE)) {
                this.g.setRequestContentType(str2);
            }
        }
        this.b.addRequestProperty(str, str2);
    }

    public final void b() {
        c(this.c, (Long) null);
    }

    public final void c(long j, Long l) {
        b bVar = this.e;
        if (bVar == null) {
            this.g.setRequestBodySize(0);
        } else {
            this.g.setRequestBodySize(bVar.c.longValue());
        }
        if (l != null) {
            this.g.setResponseBodySize(l.longValue());
        }
        this.g.setStartTime(Long.valueOf(j));
        long d2 = d(this.d);
        this.g.setTotalDuration(d2);
        this.g.setRequestHeaders(ObjectMapper.toJson((Map<String, String>) this.f).toString());
        if (this.g.getResponseCode() > 0) {
            this.g.setErrorMessage((String) null);
            if (this.g.getResponseCode() >= 400) {
                this.a.a("Request [$method] $url has failed after $duration ms status code $code".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d2)).replace("$code", String.valueOf(this.g.getResponseCode())));
            } else {
                this.a.a("Request [$method] $url has succeeded.\nTotal duration: $duration ms\nStatus code: $code".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d2)).replace("$code", String.valueOf(this.g.getResponseCode())));
            }
        }
        this.g.insert();
    }

    public void connect() throws IOException {
        this.c = System.currentTimeMillis() * 1000;
        this.a.a("Request [$method] $url has started.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()));
        b();
        try {
            this.b.connect();
        } catch (IOException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }

    public final long d(long j) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
    }

    public void disconnect() {
        b();
        this.b.disconnect();
    }

    public boolean getAllowUserInteraction() {
        return this.b.getAllowUserInteraction();
    }

    public int getConnectTimeout() {
        return this.b.getConnectTimeout();
    }

    public Object getContent() throws IOException {
        try {
            return this.b.getContent();
        } catch (IOException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }

    public String getContentEncoding() {
        return this.b.getContentEncoding();
    }

    public int getContentLength() {
        int contentLength = this.b.getContentLength();
        if (this.g.getResponseBodySize() == 0) {
            this.g.setResponseBodySize((long) contentLength);
            b();
        }
        return contentLength;
    }

    public long getContentLengthLong() {
        return this.b.getContentLengthLong();
    }

    public String getContentType() {
        return this.b.getContentType();
    }

    public long getDate() {
        return this.b.getDate();
    }

    public boolean getDefaultUseCaches() {
        return this.b.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.b.getDoInput();
    }

    public boolean getDoOutput() {
        return this.b.getDoOutput();
    }

    public InputStream getErrorStream() {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (this.b.getContentLength() < 0) {
            InputStream errorStream = this.b.getErrorStream();
            if (errorStream == null) {
                inputStream = null;
            } else {
                inputStream = new i0.j.a.o.c.a(errorStream, this);
            }
        } else {
            inputStream = this.b.getErrorStream();
        }
        if (inputStream != null) {
            if ("gzip".equalsIgnoreCase(getContentEncoding())) {
                try {
                    inputStream2 = new GZIPInputStream(inputStream);
                } catch (Exception unused) {
                }
            }
            inputStream2 = inputStream;
        }
        b();
        return inputStream2;
    }

    public long getExpiration() {
        return this.b.getExpiration();
    }

    public String getHeaderField(int i) {
        return this.b.getHeaderField(i);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.b.getHeaderFieldDate(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.b.getHeaderFieldInt(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.b.getHeaderFieldKey(i);
    }

    public long getHeaderFieldLong(String str, long j) {
        return this.b.getHeaderFieldLong(str, j);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.b.getHeaderFields();
    }

    public long getIfModifiedSince() {
        return this.b.getIfModifiedSince();
    }

    public InputStream getInputStream() throws IOException {
        i0.j.a.o.c.a aVar;
        try {
            InputStream inputStream = this.b.getInputStream();
            if (inputStream == null) {
                aVar = null;
            } else {
                aVar = new i0.j.a.o.c.a(inputStream, this);
            }
            if ("gzip".equalsIgnoreCase(getContentEncoding())) {
                try {
                    return new GZIPInputStream(aVar);
                } catch (Exception unused) {
                }
            }
            return aVar;
        } catch (IOException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }

    public boolean getInstanceFollowRedirects() {
        return this.b.getInstanceFollowRedirects();
    }

    public long getLastModified() {
        return this.b.getLastModified();
    }

    public OutputStream getOutputStream() throws IOException {
        try {
            if (this.e == null) {
                this.e = new b(this.b.getOutputStream());
            }
            return this.e;
        } catch (IOException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }

    public Permission getPermission() throws IOException {
        try {
            return this.b.getPermission();
        } catch (IOException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }

    public int getReadTimeout() {
        return this.b.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.b.getRequestMethod();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.b.getRequestProperties();
    }

    public String getRequestProperty(String str) {
        return this.b.getRequestProperty(str);
    }

    public int getResponseCode() throws IOException {
        try {
            int responseCode = this.b.getResponseCode();
            this.g.setResponseCode(responseCode);
            b();
            return responseCode;
        } catch (IOException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }

    public String getResponseMessage() throws IOException {
        try {
            return this.b.getResponseMessage();
        } catch (IOException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }

    public URL getURL() {
        return this.b.getURL();
    }

    public boolean getUseCaches() {
        return this.b.getUseCaches();
    }

    public void setAllowUserInteraction(boolean z) {
        this.b.setAllowUserInteraction(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.b.setChunkedStreamingMode(i);
    }

    public void setConnectTimeout(int i) {
        this.b.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.b.setDefaultUseCaches(z);
    }

    public void setDoInput(boolean z) {
        this.b.setDoInput(z);
    }

    public void setDoOutput(boolean z) {
        this.b.setDoOutput(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.b.setFixedLengthStreamingMode(i);
    }

    public void setIfModifiedSince(long j) {
        this.b.setIfModifiedSince(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.b.setInstanceFollowRedirects(z);
    }

    public void setReadTimeout(int i) {
        this.b.setReadTimeout(i);
    }

    public void setRequestMethod(String str) throws ProtocolException {
        try {
            this.b.setRequestMethod(str);
            this.g.setMethod(str);
        } catch (ProtocolException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }

    public void setRequestProperty(String str, String str2) {
        if (str != null) {
            this.f.put(str, str2);
            if (str.equalsIgnoreCase(NetworkLog.CONTENT_TYPE)) {
                this.g.setRequestContentType(str2);
            }
        }
        this.b.setRequestProperty(str, str2);
    }

    public void setUseCaches(boolean z) {
        this.b.setUseCaches(z);
    }

    public String toString() {
        return this.b.toString();
    }

    public boolean usingProxy() {
        return this.b.usingProxy();
    }

    public String getHeaderField(String str) {
        return this.b.getHeaderField(str);
    }

    public void setFixedLengthStreamingMode(long j) {
        this.b.setFixedLengthStreamingMode(j);
    }

    public Object getContent(Class[] clsArr) throws IOException {
        try {
            return this.b.getContent(clsArr);
        } catch (IOException e2) {
            this.g.setErrorMessage(e2.getClass().getSimpleName());
            this.a.d("Request [$method] $url has failed after $duration ms due to $error.".replace("$method", this.b.getRequestMethod()).replace("$url", this.b.getURL().toString()).replace("$duration", String.valueOf(d(this.d))).replace("$error", e2.toString()));
            b();
            throw e2;
        }
    }
}
