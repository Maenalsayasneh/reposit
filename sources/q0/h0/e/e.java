package q0.h0.e;

import okhttp3.internal.cache.DiskLruCache;
import r0.k;
import r0.y;

/* compiled from: DiskLruCache.kt */
public final class e extends k {
    public boolean d;
    public final /* synthetic */ DiskLruCache.a q;
    public final /* synthetic */ y x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(DiskLruCache.a aVar, y yVar, y yVar2) {
        super(yVar2);
        this.q = aVar;
        this.x = yVar;
    }

    public void close() {
        super.close();
        if (!this.d) {
            this.d = true;
            synchronized (this.q.j) {
                DiskLruCache.a aVar = this.q;
                int i = aVar.g - 1;
                aVar.g = i;
                if (i == 0 && aVar.e) {
                    aVar.j.y(aVar);
                }
            }
        }
    }
}
