package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.AssetPackState;

public final /* synthetic */ class p implements Runnable {
    public final s c;
    public final AssetPackState d;

    public p(s sVar, AssetPackState assetPackState) {
        this.c = sVar;
        this.d = assetPackState;
    }

    public final void run() {
        this.c.c(this.d);
    }
}
