package com.instabug.library.networkv2;

import androidx.annotation.Keep;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.connection.FileDownloadConnectionManager;
import com.instabug.library.networkv2.connection.MultipartConnectionManager;
import com.instabug.library.networkv2.connection.NormalConnectionManager;
import com.instabug.library.networkv2.request.Request;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.w0.b.a;
import java.net.HttpURLConnection;

@Keep
public class NetworkManager implements INetworkManager {
    public static final String TAG = "NetworkManager";
    private OnDoRequestListener onDoRequestListener;

    public interface OnDoRequestListener {
        void onComplete();

        void onRequestStarted(Request request);

        void onStart();
    }

    public NetworkManager() {
    }

    private void doRequest(a aVar, Request request, Request.Callbacks<RequestResponse, Throwable> callbacks) {
        OnDoRequestListener onDoRequestListener2 = this.onDoRequestListener;
        if (onDoRequestListener2 != null) {
            onDoRequestListener2.onRequestStarted(request);
        }
        try {
            HttpURLConnection create = aVar.create(request);
            if (create.getResponseCode() >= 400) {
                aVar.handleServerError(create);
            }
            callbacks.onSucceeded(aVar.handleResponse(create, request));
            InstabugSDKLogger.d("NetworkManager", "Network request completed successfully");
            OnDoRequestListener onDoRequestListener3 = this.onDoRequestListener;
            if (onDoRequestListener3 != null) {
                onDoRequestListener3.onComplete();
            }
        } catch (Exception e) {
            callbacks.onFailed(e.getCause());
            logNetworkError(e, request.getRequestUrl());
        }
    }

    private void logNetworkError(Exception exc, String str) {
        StringBuilder T0 = i0.d.a.a.a.T0("Request: ", str, " got error: ");
        T0.append(exc.getClass().getSimpleName());
        InstabugSDKLogger.e("NetworkManager", T0.toString(), exc);
    }

    public void setOnDoRequestListener(OnDoRequestListener onDoRequestListener2) {
        this.onDoRequestListener = onDoRequestListener2;
    }

    public NetworkManager(OnDoRequestListener onDoRequestListener2) {
        this.onDoRequestListener = onDoRequestListener2;
    }

    public void doRequest(int i, Request request, Request.Callbacks<RequestResponse, Throwable> callbacks) {
        if (i == 1) {
            doRequest((a) new NormalConnectionManager(), request, callbacks);
        } else if (i == 2) {
            doRequest((a) new MultipartConnectionManager(), request, callbacks);
        } else if (i != 3) {
            StringBuilder P0 = i0.d.a.a.a.P0("undefined request type for ");
            P0.append(request.getRequestUrl());
            InstabugSDKLogger.w(this, P0.toString());
        } else {
            doRequest((a) new FileDownloadConnectionManager(), request, callbacks);
        }
    }
}
