package io.sentry.transport;

import com.instabug.library.model.NetworkLog;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.networkv2.request.RequestMethod;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.d.a.a.a;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class HttpConnection {
    private static final Charset UTF_8 = Charset.forName(FileEncryptionUtil.ENCODING_UTF_8);
    private final SentryOptions options;
    private final Proxy proxy;
    private final RateLimiter rateLimiter;
    private final RequestDetails requestDetails;

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails2, RateLimiter rateLimiter2) {
        this(sentryOptions, requestDetails2, AuthenticatorWrapper.getInstance(), rateLimiter2);
    }

    private void closeAndDisconnect(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    private HttpURLConnection createConnection() throws IOException {
        HttpURLConnection open = open();
        for (Map.Entry next : this.requestDetails.getHeaders().entrySet()) {
            open.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        open.setRequestMethod(RequestMethod.POST);
        open.setDoOutput(true);
        open.setRequestProperty(Header.CONTENT_ENCODING, "gzip");
        open.setRequestProperty(Header.CONTENT_TYPE, "application/x-sentry-envelope");
        open.setRequestProperty("Accept", NetworkLog.JSON);
        open.setRequestProperty(Header.CONNECTION, "close");
        open.setConnectTimeout(this.options.getConnectionTimeoutMillis());
        open.setReadTimeout(this.options.getReadTimeoutMillis());
        HostnameVerifier hostnameVerifier = this.options.getHostnameVerifier();
        boolean z = open instanceof HttpsURLConnection;
        if (z && hostnameVerifier != null) {
            ((HttpsURLConnection) open).setHostnameVerifier(hostnameVerifier);
        }
        SSLSocketFactory sslSocketFactory = this.options.getSslSocketFactory();
        if (z && sslSocketFactory != null) {
            ((HttpsURLConnection) open).setSSLSocketFactory(sslSocketFactory);
        }
        open.connect();
        return open;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        if (r5 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        $closeResource(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0045, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getErrorMessageFromStream(java.net.HttpURLConnection r5) {
        /*
            r4 = this;
            java.io.InputStream r5 = r5.getErrorStream()     // Catch:{ IOException -> 0x0046 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x003d }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x003d }
            java.nio.charset.Charset r2 = UTF_8     // Catch:{ all -> 0x003d }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            r2 = 1
        L_0x0016:
            java.lang.String r3 = r0.readLine()     // Catch:{ all -> 0x0036 }
            if (r3 == 0) goto L_0x0028
            if (r2 != 0) goto L_0x0023
            java.lang.String r2 = "\n"
            r1.append(r2)     // Catch:{ all -> 0x0036 }
        L_0x0023:
            r1.append(r3)     // Catch:{ all -> 0x0036 }
            r2 = 0
            goto L_0x0016
        L_0x0028:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0036 }
            r2 = 0
            $closeResource(r2, r0)     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x0035
            $closeResource(r2, r5)     // Catch:{ IOException -> 0x0046 }
        L_0x0035:
            return r1
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r2 = move-exception
            $closeResource(r1, r0)     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            if (r5 == 0) goto L_0x0045
            $closeResource(r0, r5)     // Catch:{ IOException -> 0x0046 }
        L_0x0045:
            throw r1     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            java.lang.String r5 = "Failed to obtain error message while analyzing send failure."
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.HttpConnection.getErrorMessageFromStream(java.net.HttpURLConnection):java.lang.String");
    }

    private boolean isSuccessfulResponseCode(int i) {
        return i == 200;
    }

    /* JADX INFO: finally extract failed */
    private TransportResult readAndLog(HttpURLConnection httpURLConnection) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            updateRetryAfterLimits(httpURLConnection, responseCode);
            if (!isSuccessfulResponseCode(responseCode)) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                logger.log(sentryLevel, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.options.isDebug()) {
                    this.options.getLogger().log(sentryLevel, getErrorMessageFromStream(httpURLConnection), new Object[0]);
                }
                TransportResult error = TransportResult.error(responseCode);
                closeAndDisconnect(httpURLConnection);
                return error;
            }
            this.options.getLogger().log(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
            TransportResult success = TransportResult.success();
            closeAndDisconnect(httpURLConnection);
            return success;
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.ERROR, e, "Error reading and logging the response stream", new Object[0]);
            closeAndDisconnect(httpURLConnection);
            return TransportResult.error();
        } catch (Throwable th) {
            closeAndDisconnect(httpURLConnection);
            throw th;
        }
    }

    private Proxy resolveProxy(SentryOptions.Proxy proxy2) {
        if (proxy2 != null) {
            String port = proxy2.getPort();
            String host = proxy2.getHost();
            if (!(port == null || host == null)) {
                try {
                    return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, Integer.parseInt(port)));
                } catch (NumberFormatException e) {
                    ILogger logger = this.options.getLogger();
                    SentryLevel sentryLevel = SentryLevel.ERROR;
                    StringBuilder P0 = a.P0("Failed to parse Sentry Proxy port: ");
                    P0.append(proxy2.getPort());
                    P0.append(". Proxy is ignored");
                    logger.log(sentryLevel, e, P0.toString(), new Object[0]);
                }
            }
        }
        return null;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public HttpURLConnection open() throws IOException {
        URLConnection uRLConnection;
        if (this.proxy == null) {
            uRLConnection = this.requestDetails.getUrl().openConnection();
        } else {
            uRLConnection = this.requestDetails.getUrl().openConnection(this.proxy);
        }
        return (HttpURLConnection) uRLConnection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        $closeResource(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0029, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002a, code lost:
        if (r1 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        $closeResource(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.sentry.transport.TransportResult send(io.sentry.SentryEnvelope r6) throws java.io.IOException {
        /*
            r5 = this;
            java.net.HttpURLConnection r0 = r5.createConnection()
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch:{ Exception -> 0x0032 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0027 }
            r2.<init>(r1)     // Catch:{ all -> 0x0027 }
            io.sentry.SentryOptions r3 = r5.options     // Catch:{ all -> 0x0020 }
            io.sentry.ISerializer r3 = r3.getSerializer()     // Catch:{ all -> 0x0020 }
            r3.serialize((io.sentry.SentryEnvelope) r6, (java.io.OutputStream) r2)     // Catch:{ all -> 0x0020 }
            r6 = 0
            $closeResource(r6, r2)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0043
            $closeResource(r6, r1)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0043
        L_0x0020:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r3 = move-exception
            $closeResource(r6, r2)     // Catch:{ all -> 0x0027 }
            throw r3     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r2 = move-exception
            if (r1 == 0) goto L_0x002f
            $closeResource(r6, r1)     // Catch:{ Exception -> 0x0032 }
        L_0x002f:
            throw r2     // Catch:{ Exception -> 0x0032 }
        L_0x0030:
            r6 = move-exception
            goto L_0x0048
        L_0x0032:
            r6 = move-exception
            io.sentry.SentryOptions r1 = r5.options     // Catch:{ all -> 0x0030 }
            io.sentry.ILogger r1 = r1.getLogger()     // Catch:{ all -> 0x0030 }
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.ERROR     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "An exception occurred while submitting the envelope to the Sentry server."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0030 }
            r1.log(r2, r6, r3, r4)     // Catch:{ all -> 0x0030 }
        L_0x0043:
            io.sentry.transport.TransportResult r6 = r5.readAndLog(r0)
            return r6
        L_0x0048:
            r5.readAndLog(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.HttpConnection.send(io.sentry.SentryEnvelope):io.sentry.transport.TransportResult");
    }

    public void updateRetryAfterLimits(HttpURLConnection httpURLConnection, int i) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.rateLimiter.updateRetryAfterLimits(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i);
    }

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails2, AuthenticatorWrapper authenticatorWrapper, RateLimiter rateLimiter2) {
        this.requestDetails = requestDetails2;
        this.options = sentryOptions;
        this.rateLimiter = rateLimiter2;
        Proxy resolveProxy = resolveProxy(sentryOptions.getProxy());
        this.proxy = resolveProxy;
        if (resolveProxy != null && sentryOptions.getProxy() != null) {
            String user = sentryOptions.getProxy().getUser();
            String pass = sentryOptions.getProxy().getPass();
            if (user != null && pass != null) {
                authenticatorWrapper.setDefault(new ProxyAuthenticator(user, pass));
            }
        }
    }
}
