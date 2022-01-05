package h0.b.f;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: TintContextWrapper */
public class t0 extends ContextWrapper {
    public static final Object a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof t0) && !(context.getResources() instanceof v0)) {
            context.getResources();
            int i = b1.a;
        }
        return context;
    }
}
