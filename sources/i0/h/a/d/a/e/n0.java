package i0.h.a.d.a.e;

import android.os.IBinder;
import android.os.IInterface;

public abstract class n0 extends f0 implements o0 {
    public static o0 d0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof o0 ? (o0) queryLocalInterface : new m0(iBinder);
    }
}
