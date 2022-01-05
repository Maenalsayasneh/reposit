package i0.j.b.t.k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instabug.bug.view.reporting.b;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: BaseReportingFragment */
public class e extends BroadcastReceiver {
    public final /* synthetic */ b a;

    public e(b bVar) {
        this.a = bVar;
    }

    public void onReceive(Context context, Intent intent) {
        InstabugSDKLogger.d("BaseReportingFragment", "Refreshing Attachments");
        if (this.a.getActivity() != null) {
            b bVar = this.a;
            int i = b.c;
            P p = bVar.presenter;
            if (p != null) {
                ((k) p).l();
            }
        }
    }
}
