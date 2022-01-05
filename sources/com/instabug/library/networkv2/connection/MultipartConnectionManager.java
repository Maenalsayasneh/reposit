package com.instabug.library.networkv2.connection;

import com.instabug.library.model.NetworkLog;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.FileToUpload;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.networkv2.request.Request;
import com.instabug.library.networkv2.request.RequestParameter;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.w0.a;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.json.HTTP;

public class MultipartConnectionManager extends InstabugBaseConnectionManagerImpl {
    private final String TAG = MultipartConnectionManager.class.getSimpleName();

    private a buildMultipartRequest(Request request, HttpURLConnection httpURLConnection, FileToUpload fileToUpload) throws IOException {
        a aVar = new a(httpURLConnection);
        for (RequestParameter next : request.getRequestBodyParameters()) {
            String key = next.getKey();
            String obj = next.getValue().toString();
            aVar.c.append("--").append(aVar.a).append(HTTP.CRLF);
            aVar.c.append("Content-Disposition: form-data; name=\"").append(key).append("\"").append(HTTP.CRLF);
            aVar.c.append(HTTP.CRLF);
            aVar.c.append(obj).append(HTTP.CRLF);
            aVar.c.flush();
            aVar.c.close();
        }
        String filePartName = fileToUpload.getFilePartName();
        String filePath = fileToUpload.getFilePath();
        String fileName = fileToUpload.getFileName();
        aVar.c.append("--").append(aVar.a).append(HTTP.CRLF).append("Content-Disposition: file; name=\"").append(filePartName).append("\"; filename=\"").append(fileName).append("\"").append(HTTP.CRLF).append("Content-Type: ").append(fileToUpload.getFileType()).append(HTTP.CRLF).append(HTTP.CRLF).flush();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        try {
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    aVar.b.write(bArr, 0, read);
                } else {
                    aVar.b.flush();
                    aVar.c.append(HTTP.CRLF);
                    aVar.c.flush();
                    return aVar;
                }
            }
        } finally {
            aVar.c.close();
            fileInputStream.close();
        }
    }

    public int getConnectTimeOut() {
        return 0;
    }

    public String getContentType() {
        return NetworkLog.JSON;
    }

    public int getReadTimeOut() {
        return 0;
    }

    public RequestResponse handleResponse(HttpURLConnection httpURLConnection, Request request) throws IOException {
        RequestResponse requestResponse = new RequestResponse();
        int responseCode = httpURLConnection.getResponseCode();
        requestResponse.setResponseCode(responseCode);
        requestResponse.setHeaders(getHeaderFields(httpURLConnection));
        String str = this.TAG;
        InstabugSDKLogger.d(str, "Request response code: " + responseCode);
        String convertStreamToString = convertStreamToString(httpURLConnection.getInputStream());
        requestResponse.setResponseBody(convertStreamToString);
        String str2 = this.TAG;
        InstabugSDKLogger.addVerboseLog(str2, "Request response: " + convertStreamToString);
        httpURLConnection.disconnect();
        return requestResponse;
    }

    public HttpURLConnection setupConnection(HttpURLConnection httpURLConnection, Request request) throws Exception {
        StringBuilder P0 = i0.d.a.a.a.P0("Connect to: ");
        P0.append(request.getRequestUrl());
        P0.append(" with multiPart type");
        InstabugSDKLogger.d(this, P0.toString());
        httpURLConnection.setRequestProperty(Header.CONNECTION, "Keep-Alive");
        httpURLConnection.setRequestProperty(Header.CACHE_CONTROL, "no-cache");
        httpURLConnection.setRequestProperty(Header.CONTENT_ENCODING, "");
        FileToUpload fileToUpload = request.getFileToUpload();
        if (fileToUpload != null) {
            a buildMultipartRequest = buildMultipartRequest(request, httpURLConnection, fileToUpload);
            buildMultipartRequest.c.append(HTTP.CRLF).flush();
            buildMultipartRequest.c.append("--").append(buildMultipartRequest.a).append("--").append(HTTP.CRLF);
            buildMultipartRequest.c.close();
        }
        return httpURLConnection;
    }
}
