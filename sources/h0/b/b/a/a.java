package h0.b.b.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.ResourceManagerInternal;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* compiled from: AppCompatResources */
public final class a {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<Context, SparseArray<?>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    public static Drawable a(Context context, int i) {
        return ResourceManagerInternal.get().getDrawable(context, i);
    }
}
