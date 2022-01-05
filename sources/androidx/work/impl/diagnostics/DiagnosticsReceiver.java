package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import h0.g0.i;
import h0.g0.j;
import h0.g0.r.l;
import java.util.Collections;
import java.util.Objects;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = i.e("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            i.c().a(a, "Requesting diagnostics", new Throwable[0]);
            try {
                l c = l.c(context);
                Objects.requireNonNull(c);
                c.b(Collections.singletonList((j) new j.a(DiagnosticsWorker.class).a()));
            } catch (IllegalStateException e) {
                i.c().b(a, "WorkManager is not initialized", e);
            }
        }
    }
}
