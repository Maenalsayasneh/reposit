package i0.j.e.v0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.z;

/* compiled from: InstabugNetworkReceiver */
public class c extends BroadcastReceiver {
    public boolean a;

    public void onReceive(Context context, Intent intent) {
        InstabugSDKLogger.d("InstabugNetworkReceiver", "Network state changed");
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null && Instabug.isEnabled()) {
                InstabugSDKLogger.d("InstabugNetworkReceiver", "ActiveNetwork not equal null, checking local cache");
                z.j().c(context);
                SDKCoreEventPublisher.post(new SDKCoreEvent(SDKCoreEvent.Network.TYPE_NETWORK, SDKCoreEvent.Network.VALUE_ACTIVATED));
                return;
            }
            return;
        }
        InstabugSDKLogger.e("InstabugNetworkReceiver", "Context is null.");
    }
}
