package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import h0.q.n;
import h0.q.p;
import h0.q.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {
    public Random a = new Random();
    public final Map<Integer, String> b = new HashMap();
    public final Map<String, Integer> c = new HashMap();
    public final Map<String, d> d = new HashMap();
    public ArrayList<String> e = new ArrayList<>();
    public final transient Map<String, c<?>> f = new HashMap();
    public final Map<String, Object> g = new HashMap();
    public final Bundle h = new Bundle();

    public class a extends h0.a.f.b<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ h0.a.f.d.a c;

        public a(String str, int i, h0.a.f.d.a aVar) {
            this.a = str;
            this.b = i;
            this.c = aVar;
        }

        public void a(I i, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultRegistry.this.e.add(this.a);
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            ActivityResultRegistry.this.b(num != null ? num.intValue() : this.b, this.c, i, activityOptionsCompat);
        }

        public void b() {
            ActivityResultRegistry.this.f(this.a);
        }
    }

    public class b extends h0.a.f.b<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ h0.a.f.d.a c;

        public b(String str, int i, h0.a.f.d.a aVar) {
            this.a = str;
            this.b = i;
            this.c = aVar;
        }

        public void a(I i, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultRegistry.this.e.add(this.a);
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            ActivityResultRegistry.this.b(num != null ? num.intValue() : this.b, this.c, i, activityOptionsCompat);
        }

        public void b() {
            ActivityResultRegistry.this.f(this.a);
        }
    }

    public static class c<O> {
        public final h0.a.f.a<O> a;
        public final h0.a.f.d.a<?, O> b;

        public c(h0.a.f.a<O> aVar, h0.a.f.d.a<?, O> aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }
    }

    public static class d {
        public final Lifecycle a;
        public final ArrayList<n> b = new ArrayList<>();

        public d(Lifecycle lifecycle) {
            this.a = lifecycle;
        }
    }

    public final boolean a(int i, int i2, Intent intent) {
        h0.a.f.a<O> aVar;
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        c cVar = this.f.get(str);
        if (cVar == null || (aVar = cVar.a) == null) {
            this.g.remove(str);
            this.h.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        aVar.onActivityResult(cVar.b.parseResult(i2, intent));
        return true;
    }

    public abstract <I, O> void b(int i, h0.a.f.d.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i2, ActivityOptionsCompat activityOptionsCompat);

    public final <I, O> h0.a.f.b<I> c(String str, h0.a.f.d.a<I, O> aVar, h0.a.f.a<O> aVar2) {
        int e2 = e(str);
        this.f.put(str, new c(aVar2, aVar));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            aVar2.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.h.getParcelable(str);
        if (activityResult != null) {
            this.h.remove(str);
            aVar2.onActivityResult(aVar.parseResult(activityResult.c, activityResult.d));
        }
        return new b(str, e2, aVar);
    }

    public final <I, O> h0.a.f.b<I> d(final String str, p pVar, final h0.a.f.d.a<I, O> aVar, final h0.a.f.a<O> aVar2) {
        Lifecycle lifecycle = pVar.getLifecycle();
        r rVar = (r) lifecycle;
        if (!rVar.c.isAtLeast(Lifecycle.State.STARTED)) {
            int e2 = e(str);
            d dVar = this.d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            AnonymousClass1 r02 = new n() {
                public void a(p pVar, Lifecycle.Event event) {
                    if (Lifecycle.Event.ON_START.equals(event)) {
                        ActivityResultRegistry.this.f.put(str, new c(aVar2, aVar));
                        if (ActivityResultRegistry.this.g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.g.get(str);
                            ActivityResultRegistry.this.g.remove(str);
                            aVar2.onActivityResult(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.h.remove(str);
                            aVar2.onActivityResult(aVar.parseResult(activityResult.c, activityResult.d));
                        }
                    } else if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f.remove(str);
                    } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        ActivityResultRegistry.this.f(str);
                    }
                }
            };
            dVar.a.a(r02);
            dVar.b.add(r02);
            this.d.put(str, dVar);
            return new a(str, e2, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + rVar.c + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final int e(String str) {
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (this.b.containsKey(Integer.valueOf(i))) {
                nextInt = this.a.nextInt(2147418112);
            } else {
                this.b.put(Integer.valueOf(i), str);
                this.c.put(str, Integer.valueOf(i));
                return i;
            }
        }
    }

    public final void f(String str) {
        Integer remove;
        if (!this.e.contains(str) && (remove = this.c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f.remove(str);
        if (this.g.containsKey(str)) {
            StringBuilder T0 = i0.d.a.a.a.T0("Dropping pending result for request ", str, ": ");
            T0.append(this.g.get(str));
            Log.w("ActivityResultRegistry", T0.toString());
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            StringBuilder T02 = i0.d.a.a.a.T0("Dropping pending result for request ", str, ": ");
            T02.append(this.h.getParcelable(str));
            Log.w("ActivityResultRegistry", T02.toString());
            this.h.remove(str);
        }
        d dVar = this.d.get(str);
        if (dVar != null) {
            Iterator<n> it = dVar.b.iterator();
            while (it.hasNext()) {
                dVar.a.b(it.next());
            }
            dVar.b.clear();
            this.d.remove(str);
        }
    }
}
