package i0.n.c.b.d.b;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import m0.n.b.i;

/* compiled from: SinchCallHistoryChangeObserver.kt */
public final class d extends ContentObserver {
    public final a a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(new Handler());
        i.e(aVar, "callHistoryChangeListener");
        this.a = aVar;
    }

    public void onChange(boolean z, Uri uri) {
        super.onChange(z, uri);
        this.a.a();
    }
}
