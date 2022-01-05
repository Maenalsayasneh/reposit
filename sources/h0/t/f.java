package h0.t;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import h0.q.f0;
import h0.q.g0;
import h0.q.k0;
import h0.q.l;
import h0.q.m0;
import h0.q.n0;
import h0.q.o0;
import h0.q.p;
import h0.q.r;
import h0.x.c;
import java.util.UUID;

/* compiled from: NavBackStackEntry */
public final class f implements p, o0, l, c {
    public final UUID Y1;
    public Lifecycle.State Z1;
    public Lifecycle.State a2;
    public g b2;
    public final Context c;
    public m0.b c2;
    public final k d;
    public f0 d2;
    public Bundle q;
    public final r x;
    public final h0.x.b y;

    /* compiled from: NavBackStackEntry */
    public static class a extends h0.q.a {
        public a(c cVar, Bundle bundle) {
            super(cVar, (Bundle) null);
        }

        public <T extends k0> T create(String str, Class<T> cls, f0 f0Var) {
            return new b(f0Var);
        }
    }

    /* compiled from: NavBackStackEntry */
    public static class b extends k0 {
        public f0 a;

        public b(f0 f0Var) {
            this.a = f0Var;
        }
    }

    public f(Context context, k kVar, Bundle bundle, p pVar, g gVar) {
        this(context, kVar, bundle, pVar, gVar, UUID.randomUUID(), (Bundle) null);
    }

    public f0 a() {
        if (this.d2 == null) {
            a aVar = new a(this, (Bundle) null);
            n0 viewModelStore = getViewModelStore();
            Class cls = b.class;
            String canonicalName = cls.getCanonicalName();
            if (canonicalName != null) {
                String n02 = i0.d.a.a.a.n0("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                k0 k0Var = viewModelStore.a.get(n02);
                if (cls.isInstance(k0Var)) {
                    aVar.onRequery(k0Var);
                } else {
                    k0Var = aVar.create(n02, cls);
                    k0 put = viewModelStore.a.put(n02, k0Var);
                    if (put != null) {
                        put.onCleared();
                    }
                }
                this.d2 = ((b) k0Var).a;
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
        }
        return this.d2;
    }

    public void b() {
        if (this.Z1.ordinal() < this.a2.ordinal()) {
            this.x.i(this.Z1);
        } else {
            this.x.i(this.a2);
        }
    }

    public m0.b getDefaultViewModelProviderFactory() {
        if (this.c2 == null) {
            this.c2 = new g0((Application) this.c.getApplicationContext(), this, this.q);
        }
        return this.c2;
    }

    public Lifecycle getLifecycle() {
        return this.x;
    }

    public h0.x.a getSavedStateRegistry() {
        return this.y.b;
    }

    public n0 getViewModelStore() {
        g gVar = this.b2;
        if (gVar != null) {
            UUID uuid = this.Y1;
            n0 n0Var = gVar.b.get(uuid);
            if (n0Var != null) {
                return n0Var;
            }
            n0 n0Var2 = new n0();
            gVar.b.put(uuid, n0Var2);
            return n0Var2;
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public f(Context context, k kVar, Bundle bundle, p pVar, g gVar, UUID uuid, Bundle bundle2) {
        this.x = new r(this);
        h0.x.b bVar = new h0.x.b(this);
        this.y = bVar;
        this.Z1 = Lifecycle.State.CREATED;
        this.a2 = Lifecycle.State.RESUMED;
        this.c = context;
        this.Y1 = uuid;
        this.d = kVar;
        this.q = bundle;
        this.b2 = gVar;
        bVar.a(bundle2);
        if (pVar != null) {
            this.Z1 = ((r) pVar.getLifecycle()).c;
        }
    }
}
