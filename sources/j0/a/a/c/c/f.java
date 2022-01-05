package j0.a.a.c.c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import i0.e.b.l;
import i0.j.f.p.h;
import j0.a.a.c.a.c;
import j0.a.b.b;
import java.util.Objects;

/* compiled from: FragmentComponentManager */
public class f implements b<Object> {
    public volatile Object c;
    public final Object d = new Object();
    public final Fragment q;

    /* compiled from: FragmentComponentManager */
    public interface a {
        c d();
    }

    public f(Fragment fragment) {
        this.q = fragment;
    }

    public static final Context b(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public Object U() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = a();
                }
            }
        }
        return this.c;
    }

    public final Object a() {
        Objects.requireNonNull(this.q.getHost(), "Hilt Fragments must be attached before creating the component.");
        h.D(this.q.getHost() instanceof b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.q.getHost().getClass());
        c d2 = ((a) h.L0(this.q.getHost(), a.class)).d();
        Fragment fragment = this.q;
        l.c.b.a aVar = (l.c.b.a) d2;
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(fragment);
        aVar.d = fragment;
        h.C(fragment, Fragment.class);
        return new l.c.b.C0214b(aVar.a, aVar.b, aVar.c, aVar.d, (l.a) null);
    }
}
