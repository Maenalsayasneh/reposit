package i0.j.c.k;

import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: InstabugPushNotificationTokenService */
public class a extends k0.b.b0.a {
    public void onComplete() {
        InstabugCore.setPushNotificationTokenSent(true);
    }

    public void onError(Throwable th) {
        InstabugCore.setPushNotificationTokenSent(false);
        InstabugSDKLogger.e("InstabugPushNotificationTokenService", th.getClass().getSimpleName(), th);
    }
}
