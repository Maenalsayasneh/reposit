package i0.j.f.p;

import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.f.o.c;
import java.io.FileNotFoundException;
import k0.b.b0.b;

/* compiled from: PlayStoreUtils */
public final class a extends b<RequestResponse> {
    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        String simpleName = f.class.getSimpleName();
        StringBuilder P0 = i0.d.a.a.a.P0("checkingIsLiveApp onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        InstabugSDKLogger.v(simpleName, P0.toString());
        int i = c.b;
        boolean z = true;
        i0.j.f.o.a.a().k = true;
        if (requestResponse.getResponseCode() != 200) {
            z = false;
        }
        i0.j.f.o.a.a().g = z;
    }

    public void c() {
        InstabugSDKLogger.v(f.class.getSimpleName(), "checkingIsLiveApp started");
    }

    public void onComplete() {
        InstabugSDKLogger.v(f.class.getSimpleName(), "checkingIsLiveApp completed");
    }

    public void onError(Throwable th) {
        Class<f> cls = f.class;
        if (th instanceof FileNotFoundException) {
            InstabugSDKLogger.w(cls.getSimpleName(), "Can't find this app on playstore");
        } else {
            String simpleName = cls.getSimpleName();
            StringBuilder P0 = i0.d.a.a.a.P0("checkingIsLiveApp got error: ");
            P0.append(th.getMessage());
            InstabugSDKLogger.e(simpleName, P0.toString(), th);
        }
        int i = c.b;
        i0.j.f.o.a.a().g = false;
        i0.j.f.o.a.a().k = true;
    }
}
