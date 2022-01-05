package i0.j.b.o.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.instabug.library.util.memory.MemoryUtils;
import i0.h.a.b.c.m.b;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.l;
import k0.b.y.e;
import k0.b.z.e.c.i;

/* compiled from: ActivityViewInspector */
public final class g implements e<i, l<i>> {
    public final /* synthetic */ i c;
    public final /* synthetic */ Activity d;

    public g(i iVar, Activity activity) {
        this.c = iVar;
        this.d = activity;
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Object apply(Object obj) throws Exception {
        i iVar = (i) obj;
        this.c.g.add(iVar);
        if (!MemoryUtils.isLowMemory(this.d)) {
            return RxJavaPlugins.onAssembly(new i(b.o(iVar)));
        }
        return null;
    }
}
