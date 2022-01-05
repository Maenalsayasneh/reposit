package i0.j.e.d1.d;

import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import com.instabug.library.util.filters.Filter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AttributeFiltersFunctions */
public final class b implements Filter<HashMap<String, String>> {
    public Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (UserAttributeCacheManager.getType((String) entry.getKey()) != 1) {
                    hashMap2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return hashMap2;
    }
}
