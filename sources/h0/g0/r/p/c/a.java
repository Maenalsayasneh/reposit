package h0.g0.r.p.c;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import h0.g0.i;

/* compiled from: SystemJobInfoConverter */
public class a {
    public static final String a = i.e("SystemJobInfoConverter");
    public final ComponentName b;

    public a(Context context) {
        this.b = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
