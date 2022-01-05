package i0.b.a.p0;

import com.airbnb.epoxy.paging3.PagedDataModelCache;
import java.util.Collections;

/* compiled from: PagedDataModelCache.kt */
public final class a implements Runnable {
    public final /* synthetic */ PagedDataModelCache c;

    public a(PagedDataModelCache pagedDataModelCache) {
        this.c = pagedDataModelCache;
    }

    public final void run() {
        PagedDataModelCache pagedDataModelCache = this.c;
        synchronized (pagedDataModelCache) {
            Collections.fill(pagedDataModelCache.a, (Object) null);
        }
    }
}
