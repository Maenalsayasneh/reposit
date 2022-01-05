package i0.b.a;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import com.airbnb.epoxy.PoolReference;
import h0.q.p;
import java.util.ArrayList;
import m0.n.b.i;

/* compiled from: ActivityRecyclerPool.kt */
public final class a {
    public final ArrayList<PoolReference> a = new ArrayList<>(5);

    public final Lifecycle a(Context context) {
        if (context instanceof p) {
            return ((p) context).getLifecycle();
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        i.d(baseContext, "baseContext");
        return a(baseContext);
    }
}
