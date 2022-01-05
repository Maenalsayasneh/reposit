package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import i0.j.e.c1.a;
import i0.j.e.t0.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: MigrateUserAttributesAction */
public class i implements Action {
    public final String a;

    public i(String str) {
        this.a = str;
    }

    public void run() throws Exception {
        if (a.a == null) {
            a.a = new a();
        }
        a aVar = a.a;
        String str = this.a;
        Objects.requireNonNull(aVar);
        List<g> retrieveAnonymousUserAttributes = UserAttributeCacheManager.retrieveAnonymousUserAttributes();
        if (!retrieveAnonymousUserAttributes.isEmpty()) {
            HashMap<String, String> retrieveAll = UserAttributeCacheManager.retrieveAll();
            for (g next : retrieveAnonymousUserAttributes) {
                retrieveAll.put(next.b, next.c);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next2 : retrieveAll.entrySet()) {
                arrayList.add(new g((String) next2.getKey(), (String) next2.getValue(), str, false, 0, (g.a) null));
            }
            UserAttributeCacheManager.insertAll(arrayList);
            UserAttributeCacheManager.deleteAnonymousUserAttribute();
        }
    }
}
