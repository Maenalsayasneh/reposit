package i0.j.e.d1.d;

import android.util.Pair;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import i0.j.e.d1.d.h.a;

/* compiled from: AttributeFiltersFunctions */
public final class e implements a<Pair<String, String>> {
    public void apply(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            Object obj2 = pair.second;
            if (obj2 == null) {
                StringBuilder P0 = i0.d.a.a.a.P0("Passed null value to UserAttribute key: ");
                P0.append((String) pair.first);
                P0.append(".Ignoring this attribute.");
                InstabugSDKLogger.e("AttributeFiltersFunctions", P0.toString());
                return;
            }
            UserAttributeCacheManager.insert((String) pair.first, StringUtility.trimString((String) obj2));
        }
    }
}
