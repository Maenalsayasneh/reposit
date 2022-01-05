package i0.j.e.d1.d;

import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import i0.j.e.d1.d.h.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AttributeFiltersFunctions */
public final class f implements a<HashMap<String, String>> {
    public void apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        if (hashMap != null) {
            for (Map.Entry key : hashMap.entrySet()) {
                UserAttributeCacheManager.delete((String) key.getKey());
            }
        }
    }
}
