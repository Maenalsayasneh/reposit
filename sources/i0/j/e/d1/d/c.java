package i0.j.e.d1.d;

import android.annotation.SuppressLint;
import android.util.Pair;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import com.instabug.library.util.filters.Filter;

/* compiled from: AttributeFiltersFunctions */
public final class c implements Filter<Pair<String, String>> {
    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Object apply(Object obj) {
        Pair pair = (Pair) obj;
        if (UserAttributeCacheManager.getType((String) pair.first) == 1) {
            return null;
        }
        return pair;
    }
}
