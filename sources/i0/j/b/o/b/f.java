package i0.j.b.o.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.instabug.library.util.memory.MemoryUtils;
import i0.j.b.r.a.a.b;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.l;
import k0.b.v.a.a;
import k0.b.y.e;
import k0.b.z.e.c.h;

/* compiled from: ActivityViewInspector */
public final class f implements e<i, l<i>> {
    public final /* synthetic */ Activity c;

    public f(Activity activity) {
        this.c = activity;
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Object apply(Object obj) throws Exception {
        i iVar = (i) obj;
        if (!MemoryUtils.isLowMemory(this.c)) {
            return RxJavaPlugins.onAssembly(new h(new b(iVar, this.c))).v(a.a()).s(k0.b.d0.a.b());
        }
        return null;
    }
}
