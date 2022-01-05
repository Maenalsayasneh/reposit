package i0.b.a.p0;

import android.util.Log;
import androidx.paging.AsyncPagedListDiffer;
import h0.v.a.r;
import i0.b.a.o;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import m0.n.b.i;

/* compiled from: PagedListModelCache.kt */
public final class c extends AsyncPagedListDiffer<T> {
    public final /* synthetic */ f l;

    /* compiled from: PagedListModelCache.kt */
    public static final class a implements Executor {
        public final /* synthetic */ c c;

        public a(c cVar) {
            this.c = cVar;
        }

        public final void execute(Runnable runnable) {
            this.c.l.j.post(runnable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(f fVar, r rVar, h0.v.a.c cVar) {
        super(rVar, cVar);
        this.l = fVar;
        if (!i.a(fVar.j, o.defaultModelBuildingHandler)) {
            try {
                Field declaredField = AsyncPagedListDiffer.class.getDeclaredField("mMainThreadExecutor");
                i.d(declaredField, "mainThreadExecutorField");
                declaredField.setAccessible(true);
                declaredField.set(this, new a(this));
            } catch (Throwable th) {
                Log.e("PagedListModelCache", "Failed to hijack update handler in AsyncPagedListDiffer.You can only build models on the main thread", th);
                throw new IllegalStateException("Failed to hijack update handler in AsyncPagedListDiffer.You can only build models on the main thread", th);
            }
        }
    }
}
