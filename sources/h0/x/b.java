package h0.x;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import h0.q.r;
import h0.x.a;
import java.util.Map;
import java.util.Objects;

/* compiled from: SavedStateRegistryController */
public final class b {
    public final c a;
    public final a b = new a();

    public b(c cVar) {
        this.a = cVar;
    }

    public void a(Bundle bundle) {
        Lifecycle lifecycle = this.a.getLifecycle();
        if (((r) lifecycle).c == Lifecycle.State.INITIALIZED) {
            lifecycle.a(new Recreator(this.a));
            a aVar = this.b;
            if (!aVar.c) {
                if (bundle != null) {
                    aVar.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                lifecycle.a(new SavedStateRegistry$1(aVar));
                aVar.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        h0.c.a.b.b<K, V>.d c = aVar.a.c();
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
