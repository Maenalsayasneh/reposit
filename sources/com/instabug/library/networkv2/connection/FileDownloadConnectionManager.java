package com.instabug.library.networkv2.connection;

import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Request;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

public class FileDownloadConnectionManager extends NormalConnectionManager {
    private final String TAG = MultipartConnectionManager.class.getSimpleName();

    private void copyStream(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                outputStream.write(read);
            } else {
                inputStream.close();
                outputStream.close();
                return;
            }
        }
    }

    public RequestResponse handleResponse(HttpURLConnection httpURLConnection, Request request) throws IOException {
        RequestResponse requestResponse = new RequestResponse();
        int responseCode = httpURLConnection.getResponseCode();
        requestResponse.setResponseCode(responseCode);
        requestResponse.setHeaders(getHeaderFields(httpURLConnection));
        String str = this.TAG;
        InstabugSDKLogger.d(str, "File downloader request response code: " + responseCode);
        if (request.getDownloadedFile() != null) {
            copyStream(httpURLConnection);
            String str2 = this.TAG;
            StringBuilder P0 = a.P0("File downloader request response: ");
            P0.append(request.getDownloadedFile().getPath());
            InstabugSDKLogger.addVerboseLog(str2, P0.toString());
        } else {
            InstabugSDKLogger.d(this.TAG, "File for download is not found");
        }
        requestResponse.setResponseBody(request.getDownloadedFile());
        httpURLConnection.disconnect();
        return requestResponse;
    }
}
