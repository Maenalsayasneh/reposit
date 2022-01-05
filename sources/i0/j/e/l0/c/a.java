package i0.j.e.l0.c;

import android.util.Log;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import h0.q.z;
import i0.j.e.l0.b.k.d;
import i0.j.e.l0.b.k.e;
import i0.j.e.l0.j.b;

/* compiled from: LoggingSettingResolver */
public class a implements z<Integer> {
    public void onChanged(Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                Log.d("a", "logging level: " + num);
                ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new b(new d(new e()), new i0.j.e.l0.b.j.a[0])).orchestrate();
            } else if (intValue == 1) {
                Log.d("a", "logging level: " + num);
            } else if (intValue == 2) {
                Log.d("a", "logging level: " + num);
            }
        }
    }
}
