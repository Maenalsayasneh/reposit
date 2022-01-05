package i0.b.c.g;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import i0.b.c.h.c;
import m0.n.b.i;

/* compiled from: EmptyStyle.kt */
public final class a implements e {
    public static final a a = new a();

    @SuppressLint({"Recycle"})
    public c a(Context context, int[] iArr) {
        i.e(context, "context");
        i.e(iArr, UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY);
        return i0.b.c.h.a.b;
    }

    public boolean b() {
        return true;
    }

    public String c(Context context) {
        i.e(context, "context");
        return "EmptyStyle";
    }
}
