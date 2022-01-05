package i0.j.e.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: SDKInvokedBroadcast */
public class a extends BroadcastReceiver {
    public C0178a a;

    /* renamed from: i0.j.e.d.a$a  reason: collision with other inner class name */
    /* compiled from: SDKInvokedBroadcast */
    public interface C0178a {
        void onSDKInvoked(boolean z);
    }

    public a(C0178a aVar) {
        this.a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        InstabugSDKLogger.d("SDKInvokedBroadcast", "onReceive");
        if (intent.getExtras() != null) {
            this.a.onSDKInvoked(intent.getExtras().getBoolean("SDK invoking state"));
        }
    }
}
