package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import q0.h0.c;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements l<IOException, i> {
    public final /* synthetic */ DiskLruCache c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.c = diskLruCache;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((IOException) obj, "it");
        DiskLruCache diskLruCache = this.c;
        byte[] bArr = c.a;
        diskLruCache.g2 = true;
        return i.a;
    }
}
