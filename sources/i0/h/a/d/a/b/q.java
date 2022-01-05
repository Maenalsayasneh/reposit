package i0.h.a.d.a.b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;

public final /* synthetic */ class q implements Runnable {
    public final s c;
    public final Bundle d;
    public final AssetPackState q;

    public q(s sVar, Bundle bundle, AssetPackState assetPackState) {
        this.c = sVar;
        this.d = bundle;
        this.q = assetPackState;
    }

    public final void run() {
        s sVar = this.c;
        Bundle bundle = this.d;
        AssetPackState assetPackState = this.q;
        f1 f1Var = sVar.g;
        if (((Boolean) f1Var.a(new v0(f1Var, bundle))).booleanValue()) {
            sVar.n.post(new p(sVar, assetPackState));
            sVar.i.a().h();
        }
    }
}
