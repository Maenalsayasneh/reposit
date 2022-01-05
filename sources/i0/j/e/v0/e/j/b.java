package i0.j.e.v0.e.j;

import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import io.reactivex.internal.operators.completable.CompletableCreate;
import k0.b.d;

/* compiled from: AttributesLocalDataSource */
public class b implements d {
    public void a(k0.b.b bVar) {
        UserAttributeCacheManager.deleteAll(1);
        ((CompletableCreate.Emitter) bVar).a();
    }
}
