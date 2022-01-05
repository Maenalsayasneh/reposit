package i0.j.e.d1.d;

import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import i0.j.e.d1.d.h.a;

/* compiled from: AttributeFiltersFunctions */
public final class d implements a<String> {
    public void apply(Object obj) {
        String str = (String) obj;
        if (str != null) {
            UserAttributeCacheManager.delete(str);
        }
    }
}
