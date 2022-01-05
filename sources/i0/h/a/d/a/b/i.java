package i0.h.a.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.AssetPackException;
import i0.h.a.d.a.e.p0;
import i0.h.a.d.a.j.m;
import java.util.List;

public class i<T> extends p0 {
    public final m<T> a;
    public final /* synthetic */ n b;

    public i(n nVar, m<T> mVar) {
        this.b = nVar;
        this.a = mVar;
    }

    public i(n nVar, m mVar, byte[] bArr) {
        this.b = nVar;
        this.a = mVar;
    }

    public void O(Bundle bundle, Bundle bundle2) {
        this.b.f.b();
        n.a.b(4, "onKeepAlive(%b)", new Object[]{Boolean.valueOf(bundle.getBoolean("keep_alive"))});
    }

    public void W(Bundle bundle) {
        this.b.e.b();
        int i = bundle.getInt("error_code");
        n.a.b(6, "onError(%d)", new Object[]{Integer.valueOf(i)});
        this.a.a(new AssetPackException(i));
    }

    public void Y(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.b.e.b();
        n.a.b(4, "onGetChunkFileDescriptor", new Object[0]);
    }

    public void f0(List<Bundle> list) {
        this.b.e.b();
        n.a.b(4, "onGetSessionStates", new Object[0]);
    }

    public i(n nVar, m mVar, char[] cArr) {
        this.b = nVar;
        this.a = mVar;
    }

    public i(n nVar, m mVar, int[] iArr) {
        this.b = nVar;
        this.a = mVar;
    }
}
