package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends Lambda implements l<IOException, i> {
    public final /* synthetic */ DiskLruCache.Editor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i) {
        super(1);
        this.c = editor;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((IOException) obj, "it");
        synchronized (this.c.d) {
            this.c.c();
        }
        return i.a;
    }
}
