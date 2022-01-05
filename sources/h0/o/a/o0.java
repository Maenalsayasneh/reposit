package h0.o.a;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import h0.q.g0;
import h0.q.l;
import h0.q.m0;
import h0.q.n0;
import h0.q.r;
import h0.x.a;
import h0.x.b;
import h0.x.c;

/* compiled from: FragmentViewLifecycleOwner */
public class o0 implements l, c, h0.q.o0 {
    public final Fragment c;
    public final n0 d;
    public m0.b q;
    public r x = null;
    public b y = null;

    public o0(Fragment fragment, n0 n0Var) {
        this.c = fragment;
        this.d = n0Var;
    }

    public void a(Lifecycle.Event event) {
        r rVar = this.x;
        rVar.d("handleLifecycleEvent");
        rVar.g(event.getTargetState());
    }

    public void b() {
        if (this.x == null) {
            this.x = new r(this);
            this.y = new b(this);
        }
    }

    public m0.b getDefaultViewModelProviderFactory() {
        m0.b defaultViewModelProviderFactory = this.c.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.c.mDefaultFactory)) {
            this.q = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.q == null) {
            Application application = null;
            Context context = this.c.requireContext().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.q = new g0(application, this, this.c.getArguments());
        }
        return this.q;
    }

    public Lifecycle getLifecycle() {
        b();
        return this.x;
    }

    public a getSavedStateRegistry() {
        b();
        return this.y.b;
    }

    public n0 getViewModelStore() {
        b();
        return this.d;
    }
}
