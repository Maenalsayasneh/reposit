package i0.j.e.r0;

import com.instabug.library.util.TimeUtils;
import io.reactivex.internal.operators.completable.CompletableCreate;
import k0.b.b;
import k0.b.d;

/* compiled from: SessionsSyncManager */
public class o implements d {
    public final /* synthetic */ r a;

    public o(r rVar) {
        this.a = rVar;
    }

    public void a(b bVar) throws Exception {
        r rVar = this.a;
        rVar.c.saveOrUpdateLong("key_last_batch_synced_at", TimeUtils.currentTimeMillis());
        ((CompletableCreate.Emitter) bVar).a();
    }
}
