package com.instabug.library.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.network.Request;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.z;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import k0.b.l;
import k0.b.m;
import k0.b.n;
import org.json.JSONException;

public class NetworkManager implements i0.j.e.v0.a {
    public static final String APP_TOKEN = "application_token";
    private static final int DEFAULT_CONNECTION_TIME_OUT = 15000;
    private static final int DEFAULT_READ_TIME_OUT = 10000;
    public static final String TAG = "NetworkManager";
    public static final String UUID = "uuid";
    /* access modifiers changed from: private */
    public OnDoRequestListener onDoRequestListener;

    public interface OnDoRequestListener {
        void onComplete();

        void onRequestStarted(Request request);

        void onStart();
    }

    public enum RequestType {
        NORMAL,
        MULTI_PART,
        FILE_DOWNLOAD
    }

    public class a implements n<RequestResponse> {
        public final /* synthetic */ Request a;

        public a(Request request) {
            this.a = request;
        }

        public void a(m<RequestResponse> mVar) {
            if (NetworkManager.this.onDoRequestListener != null) {
                NetworkManager.this.onDoRequestListener.onStart();
            }
            try {
                InstabugSDKLogger.d("NetworkManager", "Request Url: " + this.a.getRequestUrl());
                HttpURLConnection httpURLConnection = null;
                int[] iArr = b.a;
                int i = iArr[this.a.getRequestType().ordinal()];
                if (i == 1) {
                    httpURLConnection = NetworkManager.this.connectWithNormalType(this.a);
                } else if (i == 2) {
                    httpURLConnection = NetworkManager.this.connectWithFileDownloadType(this.a);
                } else if (i == 3) {
                    httpURLConnection = NetworkManager.this.connectWithMultiPartType(this.a);
                }
                if (httpURLConnection != null) {
                    if (httpURLConnection.getResponseCode() >= 400) {
                        NetworkManager.this.handleServerConnectionError(httpURLConnection);
                    }
                    InstabugSDKLogger.d("NetworkManager", "Network request completed successfully");
                    int i2 = iArr[this.a.getRequestType().ordinal()];
                    if (i2 == 1) {
                        ((ObservableCreate.CreateEmitter) mVar).b(NetworkManager.this.handleRequestResponse(httpURLConnection));
                    } else if (i2 == 2) {
                        ((ObservableCreate.CreateEmitter) mVar).b(NetworkManager.this.handleFileDownloadRequestResponse(this.a, httpURLConnection));
                    } else if (i2 == 3) {
                        ((ObservableCreate.CreateEmitter) mVar).b(NetworkManager.this.handleMultipartRequestResponse(httpURLConnection));
                    }
                }
                if (NetworkManager.this.onDoRequestListener != null) {
                    NetworkManager.this.onDoRequestListener.onComplete();
                }
                ((ObservableCreate.CreateEmitter) mVar).a();
            } catch (UnsatisfiedLinkError e) {
                InstabugSDKLogger.e("NetworkManager", e.getMessage(), e);
                try {
                    ((ObservableCreate.CreateEmitter) mVar).c(e);
                } catch (Exception unused) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Request got error: ");
                    P0.append(this.a.getRequestUrl());
                    InstabugSDKLogger.e("NetworkManager", P0.toString(), e);
                }
                InstabugCore.setTemporaryDisabled();
            } catch (Exception e2) {
                try {
                    ((ObservableCreate.CreateEmitter) mVar).c(e2);
                } catch (Exception unused2) {
                    StringBuilder P02 = i0.d.a.a.a.P0("Request got error: ");
                    P02.append(this.a.getRequestUrl());
                    InstabugSDKLogger.e("NetworkManager", P02.toString(), e2);
                }
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            /*
                com.instabug.library.network.NetworkManager.RequestType.values()
                r0 = 3
                int[] r1 = new int[r0]
                a = r1
                com.instabug.library.network.NetworkManager$RequestType r2 = com.instabug.library.network.NetworkManager.RequestType.NORMAL     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.network.NetworkManager$RequestType r2 = com.instabug.library.network.NetworkManager.RequestType.FILE_DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0026 }
                com.instabug.library.network.NetworkManager$RequestType r2 = com.instabug.library.network.NetworkManager.RequestType.MULTI_PART     // Catch:{ NoSuchFieldError -> 0x0026 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0026 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.network.NetworkManager.b.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public HttpURLConnection connectWithFileDownloadType(Request request) throws Exception {
        StringBuilder P0 = i0.d.a.a.a.P0("Connect to: ");
        P0.append(request.getRequestUrl());
        P0.append(" with fileDownload type");
        InstabugSDKLogger.d("NetworkManager", P0.toString());
        return connectWithNormalType(request);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014b A[Catch:{ IOException -> 0x014f }] */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection connectWithMultiPartType(com.instabug.library.network.Request r11) throws java.lang.Exception {
        /*
            r10 = this;
            java.lang.String r0 = "Connect to: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = r11.getRequestUrl()
            r0.append(r1)
            java.lang.String r1 = " with multiPart type"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NetworkManager"
            com.instabug.library.util.InstabugSDKLogger.d(r1, r0)
            java.net.HttpURLConnection r0 = r10.buildConnection(r11)
            com.instabug.library.network.Request$RequestMethod r1 = r11.getRequestMethod()
            if (r1 == 0) goto L_0x0030
            com.instabug.library.network.Request$RequestMethod r1 = r11.getRequestMethod()
            java.lang.String r1 = r1.toString()
            r0.setRequestMethod(r1)
        L_0x0030:
            java.lang.String r1 = "Connection"
            java.lang.String r2 = "Keep-Alive"
            r0.setRequestProperty(r1, r2)
            java.lang.String r1 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r0.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r2 = ""
            r0.setRequestProperty(r1, r2)
            i0.j.e.v0.d r1 = new i0.j.e.v0.d
            r1.<init>(r0)
            java.util.ArrayList r2 = r11.getRequestBodyParameters()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "\""
            java.lang.String r5 = "\r\n"
            java.lang.String r6 = "--"
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r3 = r2.next()
            com.instabug.library.network.Request$RequestParameter r3 = (com.instabug.library.network.Request.RequestParameter) r3
            java.lang.String r7 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = r3.toString()
            java.io.PrintWriter r8 = r1.c
            java.io.PrintWriter r6 = r8.append(r6)
            java.lang.String r8 = r1.a
            java.io.PrintWriter r6 = r6.append(r8)
            r6.append(r5)
            java.io.PrintWriter r6 = r1.c
            java.lang.String r8 = "Content-Disposition: form-data; name=\""
            java.io.PrintWriter r6 = r6.append(r8)
            java.io.PrintWriter r6 = r6.append(r7)
            java.io.PrintWriter r4 = r6.append(r4)
            r4.append(r5)
            java.io.PrintWriter r4 = r1.c
            r4.append(r5)
            java.io.PrintWriter r4 = r1.c
            java.io.PrintWriter r3 = r4.append(r3)
            r3.append(r5)
            java.io.PrintWriter r3 = r1.c
            r3.flush()
            goto L_0x0052
        L_0x00a6:
            com.instabug.library.network.Request$FileToUpload r11 = r11.getFileToUpload()
            if (r11 == 0) goto L_0x015e
            java.lang.String r2 = r11.getFilePartName()
            java.io.File r3 = new java.io.File
            java.lang.String r7 = r11.getFilePath()
            r3.<init>(r7)
            java.lang.String r7 = r11.getFileName()
            java.lang.String r11 = r11.getFileType()
            java.io.PrintWriter r8 = r1.c
            java.io.PrintWriter r8 = r8.append(r6)
            java.lang.String r9 = r1.a
            java.io.PrintWriter r8 = r8.append(r9)
            r8.append(r5)
            java.io.PrintWriter r8 = r1.c
            java.lang.String r9 = "Content-Disposition: file; name=\""
            java.io.PrintWriter r8 = r8.append(r9)
            java.io.PrintWriter r2 = r8.append(r2)
            java.lang.String r8 = "\"; filename=\""
            java.io.PrintWriter r2 = r2.append(r8)
            java.io.PrintWriter r2 = r2.append(r7)
            java.io.PrintWriter r2 = r2.append(r4)
            r2.append(r5)
            java.io.PrintWriter r2 = r1.c
            java.lang.String r4 = "Content-Type: "
            java.io.PrintWriter r2 = r2.append(r4)
            java.io.PrintWriter r11 = r2.append(r11)
            r11.append(r5)
            java.io.PrintWriter r11 = r1.c
            r11.append(r5)
            java.io.PrintWriter r11 = r1.c
            r11.flush()
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ all -> 0x0141 }
            r11.<init>(r3)     // Catch:{ all -> 0x0141 }
            r2 = 1048576(0x100000, float:1.469368E-39)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x013f }
        L_0x010f:
            int r3 = r11.read(r2)     // Catch:{ all -> 0x013f }
            r4 = -1
            if (r3 == r4) goto L_0x011d
            java.io.OutputStream r4 = r1.b     // Catch:{ all -> 0x013f }
            r7 = 0
            r4.write(r2, r7, r3)     // Catch:{ all -> 0x013f }
            goto L_0x010f
        L_0x011d:
            java.io.OutputStream r2 = r1.b     // Catch:{ IOException -> 0x0126 }
            r2.flush()     // Catch:{ IOException -> 0x0126 }
            r11.close()     // Catch:{ IOException -> 0x0126 }
            goto L_0x0134
        L_0x0126:
            r11 = move-exception
            java.lang.String r2 = r11.getMessage()
            if (r2 == 0) goto L_0x0134
            java.lang.String r2 = r11.getMessage()
            com.instabug.library.util.InstabugSDKLogger.e(r1, r2, r11)
        L_0x0134:
            java.io.PrintWriter r11 = r1.c
            r11.append(r5)
            java.io.PrintWriter r11 = r1.c
            r11.flush()
            goto L_0x015e
        L_0x013f:
            r0 = move-exception
            goto L_0x0144
        L_0x0141:
            r11 = move-exception
            r0 = r11
            r11 = 0
        L_0x0144:
            java.io.OutputStream r2 = r1.b     // Catch:{ IOException -> 0x014f }
            r2.flush()     // Catch:{ IOException -> 0x014f }
            if (r11 == 0) goto L_0x015d
            r11.close()     // Catch:{ IOException -> 0x014f }
            goto L_0x015d
        L_0x014f:
            r11 = move-exception
            java.lang.String r2 = r11.getMessage()
            if (r2 == 0) goto L_0x015d
            java.lang.String r2 = r11.getMessage()
            com.instabug.library.util.InstabugSDKLogger.e(r1, r2, r11)
        L_0x015d:
            throw r0
        L_0x015e:
            java.io.PrintWriter r11 = r1.c
            java.io.PrintWriter r11 = r11.append(r5)
            r11.flush()
            java.io.PrintWriter r11 = r1.c
            java.io.PrintWriter r11 = r11.append(r6)
            java.lang.String r2 = r1.a
            java.io.PrintWriter r11 = r11.append(r2)
            java.io.PrintWriter r11 = r11.append(r6)
            r11.append(r5)
            java.io.PrintWriter r11 = r1.c
            r11.close()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.network.NetworkManager.connectWithMultiPartType(com.instabug.library.network.Request):java.net.HttpURLConnection");
    }

    /* access modifiers changed from: private */
    public HttpURLConnection connectWithNormalType(Request request) throws Exception {
        StringBuilder P0 = i0.d.a.a.a.P0("Connect to: ");
        P0.append(request.getRequestUrl());
        P0.append(" with normal type");
        InstabugSDKLogger.d("NetworkManager", P0.toString());
        HttpURLConnection buildConnection = buildConnection(request);
        setURLConnectionDefaultTimeOut(buildConnection);
        if (request.getRequestMethod() != null) {
            buildConnection.setRequestMethod(request.getRequestMethod().toString());
        }
        if (request.getRequestMethod() == Request.RequestMethod.Post || request.getRequestMethod() == Request.RequestMethod.put) {
            buildConnection.setDoOutput(true);
            writeRequestBody(buildConnection.getOutputStream(), request.getRequestBody());
        }
        return buildConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[Catch:{ IOException -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064 A[Catch:{ IOException -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0075 A[Catch:{ IOException -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0042=Splitter:B:21:0x0042, B:30:0x0058=Splitter:B:30:0x0058} */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String convertStreamToString(java.io.InputStream r7) {
        /*
            r6 = this;
            java.lang.String r0 = "NetworkManager"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ OutOfMemoryError -> 0x0057, Exception -> 0x0041 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ OutOfMemoryError -> 0x0057, Exception -> 0x0041 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r7, r4)     // Catch:{ OutOfMemoryError -> 0x0057, Exception -> 0x0041 }
            r2.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x0057, Exception -> 0x0041 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x003a, Exception -> 0x0035, all -> 0x0033 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x003a, Exception -> 0x0035, all -> 0x0033 }
        L_0x0014:
            java.lang.String r3 = r2.readLine()     // Catch:{ OutOfMemoryError -> 0x003a, Exception -> 0x0035, all -> 0x0033 }
            if (r3 == 0) goto L_0x0023
            r1.append(r3)     // Catch:{ OutOfMemoryError -> 0x003a, Exception -> 0x0035, all -> 0x0033 }
            r3 = 10
            r1.append(r3)     // Catch:{ OutOfMemoryError -> 0x003a, Exception -> 0x0035, all -> 0x0033 }
            goto L_0x0014
        L_0x0023:
            java.lang.String r0 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x003a, Exception -> 0x0035, all -> 0x0033 }
            r7.close()     // Catch:{ IOException -> 0x002e }
            r2.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x0070
        L_0x0035:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0042
        L_0x003a:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0058
        L_0x003f:
            r0 = move-exception
            goto L_0x006f
        L_0x0041:
            r2 = move-exception
        L_0x0042:
            java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x003f }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r3, r2)     // Catch:{ all -> 0x003f }
            r7.close()     // Catch:{ IOException -> 0x0052 }
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x006c
        L_0x0052:
            r7 = move-exception
            r7.printStackTrace()
            goto L_0x006c
        L_0x0057:
            r2 = move-exception
        L_0x0058:
            java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x003f }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r3, r2)     // Catch:{ all -> 0x003f }
            r7.close()     // Catch:{ IOException -> 0x0068 }
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r7 = move-exception
            r7.printStackTrace()
        L_0x006c:
            java.lang.String r7 = ""
            return r7
        L_0x006f:
            r2 = r1
        L_0x0070:
            r7.close()     // Catch:{ IOException -> 0x0079 }
            if (r2 == 0) goto L_0x007d
            r2.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r7 = move-exception
            r7.printStackTrace()
        L_0x007d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.network.NetworkManager.convertStreamToString(java.io.InputStream):java.lang.String");
    }

    private void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                outputStream.write(read);
            } else {
                return;
            }
        }
    }

    private Map<String, String> getHeaderFields(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        for (String str : httpURLConnection.getHeaderFields().keySet()) {
            hashMap.put(str, httpURLConnection.getHeaderField(str));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"RESOURCE_LEAK"})
    public RequestResponse handleFileDownloadRequestResponse(Request request, HttpURLConnection httpURLConnection) throws IOException {
        RequestResponse requestResponse = new RequestResponse();
        int responseCode = httpURLConnection.getResponseCode();
        requestResponse.setResponseCode(responseCode);
        requestResponse.setHeaders(getHeaderFields(httpURLConnection));
        InstabugSDKLogger.d("NetworkManager", "File downloader request response code: " + responseCode);
        File downloadedFile = request.getDownloadedFile();
        if (downloadedFile != null) {
            copyStream(httpURLConnection.getInputStream(), new FileOutputStream(downloadedFile));
            requestResponse.setResponseBody(downloadedFile);
            InstabugSDKLogger.addVerboseLog("NetworkManager", "File downloader request response: " + downloadedFile.getPath());
        } else {
            requestResponse.setResponseBody((Object) null);
            InstabugSDKLogger.addVerboseLog("NetworkManager", "File downloader request response is null");
        }
        httpURLConnection.disconnect();
        return requestResponse;
    }

    /* access modifiers changed from: private */
    public RequestResponse handleMultipartRequestResponse(HttpURLConnection httpURLConnection) throws IOException {
        return handleRequestResponse(httpURLConnection);
    }

    /* access modifiers changed from: private */
    public RequestResponse handleRequestResponse(HttpURLConnection httpURLConnection) throws IOException {
        RequestResponse requestResponse = new RequestResponse();
        int responseCode = httpURLConnection.getResponseCode();
        requestResponse.setResponseCode(responseCode);
        requestResponse.setHeaders(getHeaderFields(httpURLConnection));
        InstabugSDKLogger.d("NetworkManager", "Request response code: " + responseCode);
        String convertStreamToString = convertStreamToString(httpURLConnection.getInputStream());
        requestResponse.setResponseBody(convertStreamToString);
        InstabugSDKLogger.addVerboseLog("NetworkManager", "Request response: " + convertStreamToString);
        httpURLConnection.disconnect();
        return requestResponse;
    }

    /* access modifiers changed from: private */
    public void handleServerConnectionError(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        try {
            if (httpURLConnection.getURL() != null && isInstabugRequest(httpURLConnection.getURL().toString())) {
                InstabugSDKLogger.e("NetworkManager", "Network request got error");
                InstabugSDKLogger.e("NetworkManager", "Error getting Network request response of: " + httpURLConnection.getURL().toString() + " : " + convertStreamToString(errorStream));
            }
        } catch (OutOfMemoryError e) {
            InstabugSDKLogger.e("NetworkManager", e.getMessage(), e);
        }
    }

    private boolean isAuthorizationEnabled() {
        z j = z.j();
        com.instabug.library.a aVar = com.instabug.library.a.BE_DISABLE_SIGNING;
        return j.i(aVar) && z.j().a(aVar) != Feature.State.DISABLED;
    }

    public static boolean isOnline(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("Could not read network state. To enable please add the following line in your AndroidManifest.xml <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\"/>\n");
            P0.append(e.getMessage());
            InstabugSDKLogger.w("NetworkManager", P0.toString());
            return false;
        } catch (Exception e2) {
            InstabugSDKLogger.e("NetworkManager", "Something went wrong while checking network state", e2);
            return false;
        }
    }

    private HttpURLConnection setURLConnectionDefaultTimeOut(HttpURLConnection httpURLConnection) {
        return setURLConnectionTimeOut(httpURLConnection, 10000, 15000);
    }

    private void writeRequestBody(OutputStream outputStream, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes(Charset.forName("UTF8")));
        gZIPOutputStream.close();
        outputStream.write(byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c2, code lost:
        if (r9.isEmpty() == false) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection buildConnection(com.instabug.library.network.Request r13) throws java.lang.Exception, java.lang.UnsatisfiedLinkError {
        /*
            r12 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r13.getRequestUrl()
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r0.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept-Charset"
            java.lang.String r2 = "UTF-8"
            r0.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r0.setRequestProperty(r1, r2)
            boolean r1 = r12.isAuthorizationEnabled()
            if (r1 == 0) goto L_0x0115
            boolean r1 = r12.isAuthorizationRequired(r13)
            if (r1 == 0) goto L_0x0115
            int r1 = com.instabug.library.network.authorization.NetworkOfficer.a
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "amx "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r6 = com.instabug.library.network.authorization.NetworkOfficer.getClientId()
            java.lang.Class<com.instabug.library.network.authorization.NetworkOfficer> r7 = com.instabug.library.network.authorization.NetworkOfficer.class
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = ""
            r8.<init>(r9)
            com.instabug.library.network.Request$RequestMethod r10 = r13.getRequestMethod()
            if (r10 == 0) goto L_0x006b
            com.instabug.library.network.Request$RequestMethod r10 = r13.getRequestMethod()
            java.lang.String r10 = r10.toString()
            r8.append(r10)
        L_0x006b:
            java.lang.String r10 = r13.getRequestUrl()
            java.lang.String r10 = i0.j.e.v0.b.a.a(r10)
            r8.append(r10)
            r8.append(r6)
            r8.append(r1)
            com.instabug.library.network.Request$RequestMethod r1 = r13.getRequestMethod()
            com.instabug.library.network.Request$RequestMethod r10 = com.instabug.library.network.Request.RequestMethod.Post
            if (r1 == r10) goto L_0x008c
            com.instabug.library.network.Request$RequestMethod r1 = r13.getRequestMethod()
            com.instabug.library.network.Request$RequestMethod r10 = com.instabug.library.network.Request.RequestMethod.put
            if (r1 != r10) goto L_0x00e6
        L_0x008c:
            java.lang.String r1 = r13.getRequestBody()
            if (r1 == 0) goto L_0x00e6
            boolean r1 = r13.isMultiPartRequest()
            r10 = 0
            if (r1 == 0) goto L_0x009a
            goto L_0x00d0
        L_0x009a:
            java.lang.String r1 = r13.getRequestBody()     // Catch:{ IOException -> 0x00c5 }
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = r13.getRequestBody()     // Catch:{ IOException -> 0x00c5 }
            boolean r1 = r1.isEmpty()     // Catch:{ IOException -> 0x00c5 }
            if (r1 == 0) goto L_0x00ab
            goto L_0x00d0
        L_0x00ab:
            java.lang.String r1 = r13.getRequestBody()     // Catch:{ IOException -> 0x00c5 }
            byte[] r1 = i0.j.e.v0.b.a.c(r1)     // Catch:{ IOException -> 0x00c5 }
            r9 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r9)     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r9 = i0.j.e.v0.b.a.d(r1)     // Catch:{ IOException -> 0x00c5 }
            if (r9 == 0) goto L_0x00cf
            boolean r1 = r9.isEmpty()     // Catch:{ IOException -> 0x00c5 }
            if (r1 == 0) goto L_0x00d0
            goto L_0x00cf
        L_0x00c5:
            r1 = move-exception
            java.lang.String r9 = r7.getSimpleName()
            java.lang.String r11 = "get singature base string"
            com.instabug.library.util.InstabugSDKLogger.e(r9, r11, r1)
        L_0x00cf:
            r9 = r10
        L_0x00d0:
            if (r9 == 0) goto L_0x00dc
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x00e6
            r8.append(r9)
            goto L_0x00e6
        L_0x00dc:
            java.lang.String r1 = r7.getSimpleName()
            java.lang.String r7 = "failed to hash body"
            com.instabug.library.util.InstabugSDKLogger.e(r1, r7)
            goto L_0x00ed
        L_0x00e6:
            r8.append(r2)
            java.lang.String r10 = r8.toString()
        L_0x00ed:
            if (r10 == 0) goto L_0x00fa
            java.lang.String r1 = com.instabug.library.network.authorization.NetworkOfficer.getAppSecret()
            java.lang.String r1 = i0.j.e.v0.b.a.b(r1, r10)
            r4.append(r1)
        L_0x00fa:
            r4.append(r5)
            r4.append(r6)
            r4.append(r5)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0115
            java.lang.String r2 = "Authorization"
            r0.setRequestProperty(r2, r1)
        L_0x0115:
            java.util.ArrayList r13 = r13.getHeaders()
            java.util.Iterator r13 = r13.iterator()
        L_0x011d:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x013d
            java.lang.Object r1 = r13.next()
            com.instabug.library.network.Request$RequestParameter r1 = (com.instabug.library.network.Request.RequestParameter) r1
            java.lang.Object r2 = r1.getValue()
            if (r2 == 0) goto L_0x011d
            java.lang.String r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.setRequestProperty(r2, r1)
            goto L_0x011d
        L_0x013d:
            r13 = 1
            r0.setDoInput(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.network.NetworkManager.buildConnection(com.instabug.library.network.Request):java.net.HttpURLConnection");
    }

    public Request buildRequest(Context context, Request.Endpoint endpoint, Request.RequestMethod requestMethod) throws JSONException {
        return buildRequest(context, endpoint, requestMethod, RequestType.NORMAL);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public Request buildRequestWithoutUUID(Context context, Request.Endpoint endpoint, Request.RequestMethod requestMethod) throws JSONException {
        Request request = new Request(endpoint, RequestType.NORMAL);
        request.setRequestMethod(requestMethod);
        request.addParameter("application_token", SettingsManager.getInstance().getAppToken());
        return request;
    }

    public l<RequestResponse> doRequest(Request request) {
        OnDoRequestListener onDoRequestListener2 = this.onDoRequestListener;
        if (onDoRequestListener2 != null) {
            onDoRequestListener2.onRequestStarted(request);
        }
        return RxJavaPlugins.onAssembly(new ObservableCreate(new a(request)));
    }

    public boolean isAuthorizationRequired(Request request) {
        return isInstabugRequest(request) && !isFeatureRequest(request);
    }

    public boolean isFeatureRequest(Request request) {
        if (request.getRequestMethod() == null || request.getEndpoint() == null || !request.getRequestMethod().equals(Request.RequestMethod.Get) || !request.getEndpoint().contains(Request.Endpoint.APP_SETTINGS.toString())) {
            return false;
        }
        return true;
    }

    public boolean isInstabugRequest(Request request) {
        return request.getRequestUrl().contains(Request.BASE_URL);
    }

    public void setOnDoRequestListener(OnDoRequestListener onDoRequestListener2) {
        this.onDoRequestListener = onDoRequestListener2;
    }

    public HttpURLConnection setURLConnectionTimeOut(HttpURLConnection httpURLConnection, int i, int i2) {
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setConnectTimeout(i2);
        return httpURLConnection;
    }

    private boolean isInstabugRequest(String str) {
        if (str != null) {
            return str.startsWith(Request.BASE_URL);
        }
        return false;
    }

    public Request buildRequest(Context context, Request.Endpoint endpoint, Request.RequestMethod requestMethod, RequestType requestType) throws JSONException {
        Request request = new Request(endpoint, requestType);
        request.setRequestMethod(requestMethod);
        return buildRequest(context, request);
    }

    public Request buildRequest(Context context, String str, Request.RequestMethod requestMethod) throws JSONException {
        return buildRequest(context, str, requestMethod, RequestType.NORMAL);
    }

    public Request buildRequest(Context context, String str, Request.RequestMethod requestMethod, RequestType requestType) throws JSONException {
        Request request = new Request(str, requestType);
        request.setRequestMethod(requestMethod);
        return buildRequest(context, request);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    private Request buildRequest(Context context, Request request) throws JSONException {
        request.addParameter("application_token", SettingsManager.getInstance().getAppToken());
        request.addParameter("uuid", i0.j.e.c1.b.C());
        return request;
    }
}
