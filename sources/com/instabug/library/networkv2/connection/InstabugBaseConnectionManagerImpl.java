package com.instabug.library.networkv2.connection;

import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Request;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.w0.b.a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

public abstract class InstabugBaseConnectionManagerImpl implements a {
    public static final int DEFAULT_CONNECTION_TIME_OUT = 15000;
    public static final int DEFAULT_READ_TIME_OUT = 10000;
    private final String TAG = InstabugBaseConnectionManagerImpl.class.getSimpleName();

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection buildBaseConnection(com.instabug.library.networkv2.request.Request r16) throws java.lang.Exception {
        /*
            r15 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r16.getRequestUrl()
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            r1 = r0
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            java.lang.String r0 = r15.getContentType()
            java.lang.String r2 = "Content-Type"
            r1.setRequestProperty(r2, r0)
            java.lang.String r0 = "Accept-Charset"
            java.lang.String r2 = "UTF-8"
            r1.setRequestProperty(r0, r2)
            java.lang.String r0 = r16.getRequestMethod()
            if (r0 == 0) goto L_0x0029
            r1.setRequestMethod(r0)
        L_0x0029:
            i0.j.e.z r0 = i0.j.e.z.j()
            com.instabug.library.a r2 = com.instabug.library.a.BE_DISABLE_SIGNING
            boolean r0 = r0.i(r2)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0045
            i0.j.e.z r0 = i0.j.e.z.j()
            com.instabug.library.Feature$State r0 = r0.a(r2)
            com.instabug.library.Feature$State r2 = com.instabug.library.Feature.State.DISABLED
            if (r0 == r2) goto L_0x0045
            r0 = r4
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            if (r0 == 0) goto L_0x014f
            java.net.URL r0 = r1.getURL()
            java.lang.String r0 = r0.toString()
            boolean r2 = i0.j.c.l.a.K(r0)
            if (r2 == 0) goto L_0x0063
            com.instabug.library.network.Request$Endpoint r2 = com.instabug.library.network.Request.Endpoint.APP_SETTINGS
            java.lang.String r2 = r2.name()
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0063
            r3 = r4
        L_0x0063:
            if (r3 == 0) goto L_0x014f
            int r0 = com.instabug.library.networkv2.authorization.NetworkOfficer.a
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "amx "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = ":"
            r5.append(r6)
            java.lang.String r7 = com.instabug.library.networkv2.authorization.NetworkOfficer.getClientId()
            java.lang.String r8 = com.instabug.library.networkv2.authorization.NetworkOfficer.getAppSecret()
            java.lang.Class<com.instabug.library.networkv2.authorization.NetworkOfficer> r9 = com.instabug.library.networkv2.authorization.NetworkOfficer.class
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r16.getRequestMethod()
            if (r11 == 0) goto L_0x009e
            java.lang.String r11 = r16.getRequestMethod()
            r10.append(r11)
        L_0x009e:
            java.lang.String r11 = r16.getRequestUrl()
            java.lang.String r11 = i0.j.e.v0.b.a.a(r11)
            r10.append(r11)
            r10.append(r7)
            r10.append(r0)
            java.lang.String r0 = r16.getRequestMethod()
            java.lang.String r11 = "POST"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = r16.getRequestMethod()
            java.lang.String r11 = "PUT"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0126
        L_0x00c7:
            java.lang.String r0 = r16.getRequestBody()
            if (r0 == 0) goto L_0x0126
            boolean r0 = r16.isMultiPartRequest()
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x00d6
            goto L_0x0104
        L_0x00d6:
            r12 = 0
            java.lang.String r0 = r16.getRequestBody()     // Catch:{ IOException -> 0x0106 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = r16.getRequestBody()     // Catch:{ IOException -> 0x0106 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x0106 }
            if (r0 == 0) goto L_0x00e8
            goto L_0x0104
        L_0x00e8:
            java.lang.String r0 = r16.getRequestBody()     // Catch:{ IOException -> 0x0106 }
            byte[] r0 = i0.j.e.v0.b.a.c(r0)     // Catch:{ IOException -> 0x0106 }
            r13 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r13)     // Catch:{ IOException -> 0x0106 }
            java.lang.String r0 = i0.j.e.v0.b.a.d(r0)     // Catch:{ IOException -> 0x0106 }
            if (r0 == 0) goto L_0x0110
            boolean r13 = r0.isEmpty()     // Catch:{ IOException -> 0x0106 }
            if (r13 == 0) goto L_0x0102
            goto L_0x0110
        L_0x0102:
            r12 = r0
            goto L_0x0110
        L_0x0104:
            r12 = r11
            goto L_0x0110
        L_0x0106:
            r0 = move-exception
            java.lang.String r13 = r9.getSimpleName()
            java.lang.String r14 = "get singature base string"
            com.instabug.library.util.InstabugSDKLogger.e(r13, r14, r0)
        L_0x0110:
            if (r12 == 0) goto L_0x011c
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0126
            r10.append(r12)
            goto L_0x0126
        L_0x011c:
            java.lang.String r0 = r9.getSimpleName()
            java.lang.String r9 = "failed to hash body"
            com.instabug.library.util.InstabugSDKLogger.e(r0, r9)
            goto L_0x012d
        L_0x0126:
            r10.append(r2)
            java.lang.String r11 = r10.toString()
        L_0x012d:
            java.lang.String r0 = i0.j.e.v0.b.a.b(r8, r11)
            r5.append(r0)
            r5.append(r6)
            r5.append(r7)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x014f
            java.lang.String r2 = "Authorization"
            r1.setRequestProperty(r2, r0)
        L_0x014f:
            java.util.List r0 = r16.getHeaders()
            java.util.Iterator r0 = r0.iterator()
        L_0x0157:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0171
            java.lang.Object r2 = r0.next()
            com.instabug.library.networkv2.request.RequestParameter r2 = (com.instabug.library.networkv2.request.RequestParameter) r2
            java.lang.String r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.setRequestProperty(r3, r2)
            goto L_0x0157
        L_0x0171:
            r1.setDoInput(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl.buildBaseConnection(com.instabug.library.networkv2.request.Request):java.net.HttpURLConnection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0095, code lost:
        if (r8.getMessage() == null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ce, code lost:
        if (r8.getMessage() == null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d0, code lost:
        r1 = r8.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d4, code lost:
        com.instabug.library.util.InstabugSDKLogger.e(r7, r1, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077 A[Catch:{ IOException -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b0 A[Catch:{ IOException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e2 A[Catch:{ IOException -> 0x00e6 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0063=Splitter:B:31:0x0063, B:54:0x009c=Splitter:B:54:0x009c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String convertStreamToString(java.io.InputStream r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to convert stream of a request"
            java.lang.String r1 = "Failed to close stream of a request"
            r2 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ OutOfMemoryError -> 0x0098, Exception -> 0x005f, all -> 0x005c }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r8, r4)     // Catch:{ OutOfMemoryError -> 0x0098, Exception -> 0x005f, all -> 0x005c }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
            r2.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
        L_0x0016:
            java.lang.String r5 = r2.readLine()     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
            if (r5 == 0) goto L_0x0025
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
            r5 = 10
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
            goto L_0x0016
        L_0x0025:
            r3.close()     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
            java.lang.String r0 = r4.toString()     // Catch:{ OutOfMemoryError -> 0x005a, Exception -> 0x0058, all -> 0x0055 }
            r8.close()     // Catch:{ IOException -> 0x0033 }
            r3.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0054
        L_0x0033:
            r8 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0047
        L_0x0038:
            java.lang.String r2 = r8.getMessage()
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r8.getMessage()
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            com.instabug.library.util.InstabugSDKLogger.e(r7, r2, r8)
        L_0x0047:
            java.lang.String r2 = r8.getMessage()
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = r8.getMessage()
        L_0x0051:
            com.instabug.library.util.InstabugSDKLogger.e(r7, r1, r8)
        L_0x0054:
            return r0
        L_0x0055:
            r0 = move-exception
            goto L_0x00dd
        L_0x0058:
            r2 = move-exception
            goto L_0x0063
        L_0x005a:
            r2 = move-exception
            goto L_0x009c
        L_0x005c:
            r0 = move-exception
            goto L_0x00dc
        L_0x005f:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L_0x0063:
            java.lang.String r4 = r7.TAG     // Catch:{ all -> 0x00da }
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x006f
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x00da }
        L_0x006f:
            com.instabug.library.util.InstabugSDKLogger.e(r4, r0, r2)     // Catch:{ all -> 0x00da }
            r8.close()     // Catch:{ IOException -> 0x007b }
            if (r3 == 0) goto L_0x00d7
            r3.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x00d7
        L_0x007b:
            r8 = move-exception
            if (r3 == 0) goto L_0x0091
            r3.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x0091
        L_0x0082:
            java.lang.String r0 = r8.getMessage()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r8.getMessage()
            goto L_0x008e
        L_0x008d:
            r0 = r1
        L_0x008e:
            com.instabug.library.util.InstabugSDKLogger.e(r7, r0, r8)
        L_0x0091:
            java.lang.String r0 = r8.getMessage()
            if (r0 == 0) goto L_0x00d4
            goto L_0x00d0
        L_0x0098:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L_0x009c:
            java.lang.String r4 = r7.TAG     // Catch:{ all -> 0x00da }
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x00a8
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x00da }
        L_0x00a8:
            com.instabug.library.util.InstabugSDKLogger.e(r4, r0, r2)     // Catch:{ all -> 0x00da }
            r8.close()     // Catch:{ IOException -> 0x00b4 }
            if (r3 == 0) goto L_0x00d7
            r3.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00d7
        L_0x00b4:
            r8 = move-exception
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00ca
        L_0x00bb:
            java.lang.String r0 = r8.getMessage()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = r8.getMessage()
            goto L_0x00c7
        L_0x00c6:
            r0 = r1
        L_0x00c7:
            com.instabug.library.util.InstabugSDKLogger.e(r7, r0, r8)
        L_0x00ca:
            java.lang.String r0 = r8.getMessage()
            if (r0 == 0) goto L_0x00d4
        L_0x00d0:
            java.lang.String r1 = r8.getMessage()
        L_0x00d4:
            com.instabug.library.util.InstabugSDKLogger.e(r7, r1, r8)
        L_0x00d7:
            java.lang.String r8 = ""
            return r8
        L_0x00da:
            r0 = move-exception
            r2 = r3
        L_0x00dc:
            r3 = r2
        L_0x00dd:
            r8.close()     // Catch:{ IOException -> 0x00e6 }
            if (r3 == 0) goto L_0x0109
            r3.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x0109
        L_0x00e6:
            r8 = move-exception
            if (r3 == 0) goto L_0x00fc
            r3.close()     // Catch:{ IOException -> 0x00ed }
            goto L_0x00fc
        L_0x00ed:
            java.lang.String r2 = r8.getMessage()
            if (r2 == 0) goto L_0x00f8
            java.lang.String r2 = r8.getMessage()
            goto L_0x00f9
        L_0x00f8:
            r2 = r1
        L_0x00f9:
            com.instabug.library.util.InstabugSDKLogger.e(r7, r2, r8)
        L_0x00fc:
            java.lang.String r2 = r8.getMessage()
            if (r2 == 0) goto L_0x0106
            java.lang.String r1 = r8.getMessage()
        L_0x0106:
            com.instabug.library.util.InstabugSDKLogger.e(r7, r1, r8)
        L_0x0109:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl.convertStreamToString(java.io.InputStream):java.lang.String");
    }

    public HttpURLConnection create(Request request) throws Exception {
        String str = this.TAG;
        StringBuilder P0 = i0.d.a.a.a.P0("Starting a request to url: ");
        P0.append(request.getRequestUrl());
        InstabugSDKLogger.d(str, P0.toString());
        return setupConnection(buildBaseConnection(request), request);
    }

    public abstract /* synthetic */ String getContentType();

    public Map<String, String> getHeaderFields(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        for (String str : httpURLConnection.getHeaderFields().keySet()) {
            hashMap.put(str, httpURLConnection.getHeaderField(str));
        }
        return hashMap;
    }

    public abstract /* synthetic */ RequestResponse handleResponse(HttpURLConnection httpURLConnection, Request request) throws IOException;

    public void handleServerError(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (httpURLConnection.getURL() != null && i0.j.c.l.a.K(httpURLConnection.getURL().toString())) {
                InstabugSDKLogger.e(this.TAG, "Network request got error");
                String str = this.TAG;
                InstabugSDKLogger.e(str, "Error getting Network request response: " + convertStreamToString(errorStream));
            }
        } catch (OutOfMemoryError e) {
            InstabugSDKLogger.e(this.TAG, e.getMessage(), e);
        }
    }

    public abstract /* synthetic */ HttpURLConnection setupConnection(HttpURLConnection httpURLConnection, Request request) throws Exception;
}
