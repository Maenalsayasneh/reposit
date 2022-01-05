package i0.j.e.d1.d;

import android.annotation.SuppressLint;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import com.instabug.library.util.filters.Filter;

/* compiled from: AttributeFiltersFunctions */
public final class a implements Filter<String> {
    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Object apply(Object obj) {
        String str = (String) obj;
        if (UserAttributeCacheManager.getType(str) == 1) {
            return null;
        }
        return str;
    }
}
