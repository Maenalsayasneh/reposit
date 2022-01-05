package i0.h.a.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class e implements Runnable {
    public final a c;
    public final Intent d;
    public final Context q;
    public final boolean x;
    public final BroadcastReceiver.PendingResult y;

    public e(a aVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = aVar;
        this.d = intent;
        this.q = context;
        this.x = z;
        this.y = pendingResult;
    }

    public final void run() {
        int i;
        a aVar = this.c;
        Intent intent = this.d;
        Context context = this.q;
        boolean z = this.x;
        BroadcastReceiver.PendingResult pendingResult = this.y;
        Objects.requireNonNull(aVar);
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = aVar.a(context, intent2);
            } else {
                i = aVar.b(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }
}
