package i0.h.a.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.h.a.d.a.e.g;
import i0.h.a.d.a.e.o0;
import i0.h.a.d.a.j.m;

public final class e extends g {
    public final /* synthetic */ n Y1;
    public final /* synthetic */ int d;
    public final /* synthetic */ String q;
    public final /* synthetic */ m x;
    public final /* synthetic */ int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(n nVar, m mVar, int i, String str, m mVar2, int i2) {
        super(mVar);
        this.Y1 = nVar;
        this.d = i;
        this.q = str;
        this.x = mVar2;
        this.y = i2;
    }

    public final void a() {
        try {
            n nVar = this.Y1;
            String str = nVar.c;
            int i = this.d;
            String str2 = this.q;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString(InstabugDbContract.APMUiTraceEntry.COLUMN_MODULE_NAME, str2);
            ((o0) nVar.e.l).l(str, bundle, n.a(), new m(this.Y1, this.x, this.d, this.q, this.y));
        } catch (RemoteException e) {
            n.a.a(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
