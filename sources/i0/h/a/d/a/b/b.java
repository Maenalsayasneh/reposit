package i0.h.a.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.h.a.d.a.e.g;
import i0.h.a.d.a.e.o0;
import i0.h.a.d.a.j.m;
import java.util.ArrayList;
import java.util.List;

public final class b extends g {
    public final /* synthetic */ List d;
    public final /* synthetic */ m q;
    public final /* synthetic */ n x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(n nVar, m mVar, List list, m mVar2) {
        super(mVar);
        this.x = nVar;
        this.d = list;
        this.q = mVar2;
    }

    public final void a() {
        List<String> list = this.d;
        ArrayList arrayList = new ArrayList(list.size());
        for (String putString : list) {
            Bundle bundle = new Bundle();
            bundle.putString(InstabugDbContract.APMUiTraceEntry.COLUMN_MODULE_NAME, putString);
            arrayList.add(bundle);
        }
        try {
            n nVar = this.x;
            ((o0) nVar.e.l).m(nVar.c, arrayList, n.a(), new i(this.x, this.q, (byte[]) null));
        } catch (RemoteException e) {
            n.a.a(e, "cancelDownloads(%s)", this.d);
        }
    }
}
