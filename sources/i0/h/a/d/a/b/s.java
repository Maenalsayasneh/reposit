package i0.h.a.d.a.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import i0.h.a.d.a.e.a0;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.g.c;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class s extends c<AssetPackState> {
    public final f1 g;
    public final o0 h;
    public final a0<e3> i;
    public final h0 j;
    public final r0 k;
    public final a0<Executor> l;
    public final a0<Executor> m;
    public final Handler n = new Handler(Looper.getMainLooper());

    public s(Context context, f1 f1Var, o0 o0Var, a0<e3> a0Var, r0 r0Var, h0 h0Var, a0<Executor> a0Var2, a0<Executor> a0Var3) {
        super(new f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.g = f1Var;
        this.h = o0Var;
        this.i = a0Var;
        this.k = r0Var;
        this.j = h0Var;
        this.l = a0Var2;
        this.m = a0Var3;
    }

    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.a.b(6, "Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState d = AssetPackState.d(bundleExtra, stringArrayList.get(0), this.k, u.a);
            this.a.b(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{d});
            if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                Objects.requireNonNull(this.j);
            }
            this.m.a().execute(new q(this, bundleExtra, d));
            this.l.a().execute(new r(this, bundleExtra));
            return;
        }
        this.a.b(6, "Empty bundle received from broadcast.", new Object[0]);
    }
}
