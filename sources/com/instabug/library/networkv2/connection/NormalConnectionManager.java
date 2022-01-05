package com.instabug.library.networkv2.connection;

import com.instabug.library.model.NetworkLog;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.networkv2.request.Request;
import com.instabug.library.networkv2.request.RequestMethod;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;

public class NormalConnectionManager extends InstabugBaseConnectionManagerImpl {
    private final String TAG = NormalConnectionManager.class.getSimpleName();

    private void writeRequestBody(OutputStream outputStream, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes(Charset.forName("UTF8")));
        gZIPOutputStream.close();
        outputStream.write(byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
    }

    public int getConnectTimeOut() {
        return InstabugBaseConnectionManagerImpl.DEFAULT_CONNECTION_TIME_OUT;
    }

    public String getContentType() {
        return NetworkLog.JSON;
    }

    public int getReadTimeOut() {
        return InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT;
    }

    public RequestResponse handleResponse(HttpURLConnection httpURLConnection, Request request) throws IOException {
        String str;
        RequestResponse requestResponse = new RequestResponse();
        int responseCode = httpURLConnection.getResponseCode();
        requestResponse.setResponseCode(responseCode);
        requestResponse.setHeaders(getHeaderFields(httpURLConnection));
        String str2 = this.TAG;
        InstabugSDKLogger.d(str2, "Request response code: " + responseCode);
        try {
            str = convertStreamToString(httpURLConnection.getInputStream());
        } catch (IOException e) {
            InstabugSDKLogger.e(e, e.getMessage());
            str = "";
        }
        requestResponse.setResponseBody(str);
        String str3 = this.TAG;
        InstabugSDKLogger.addVerboseLog(str3, "Request response: " + str);
        httpURLConnection.disconnect();
        return requestResponse;
    }

    public HttpURLConnection setupConnection(HttpURLConnection httpURLConnection, Request request) throws Exception {
        StringBuilder P0 = a.P0("Connect to: ");
        P0.append(request.getRequestUrl());
        P0.append(" with normal type");
        InstabugSDKLogger.d(this, P0.toString());
        httpURLConnection.setRequestProperty(Header.CONTENT_ENCODING, "gzip");
        httpURLConnection.setReadTimeout(getReadTimeOut());
        httpURLConnection.setConnectTimeout(getConnectTimeOut());
        if (httpURLConnection.getRequestMethod().equals(RequestMethod.POST) || httpURLConnection.getRequestMethod().equals(RequestMethod.PUT)) {
            httpURLConnection.setDoOutput(true);
            writeRequestBody(httpURLConnection.getOutputStream(), request.getRequestBody());
        }
        return httpURLConnection;
    }
}
