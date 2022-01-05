package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import h0.q.n;
import h0.q.p;
import h0.q.r;
import h0.x.a;
import h0.x.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements n {
    public final c c;

    public static final class a implements a.b {
        public final Set<String> a = new HashSet();

        public a(h0.x.a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.c = cVar;
    }

    public void a(p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            r rVar = (r) pVar.getLifecycle();
            rVar.d("removeObserver");
            rVar.b.k(this);
            Bundle a2 = this.c.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a2 != null) {
                ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0075a.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.C0075a) declaredConstructor.newInstance(new Object[0])).a(this.c);
                                } catch (Exception e) {
                                    throw new RuntimeException(i0.d.a.a.a.n0("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder P0 = i0.d.a.a.a.P0("Class");
                                P0.append(asSubclass.getSimpleName());
                                P0.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(P0.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(i0.d.a.a.a.o0("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
