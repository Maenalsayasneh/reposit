package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.q.d;
import h0.q.n;
import h0.q.p;

public class ReflectiveGenericLifecycleObserver implements n {
    public final Object c;
    public final d.a d;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.c = obj;
        this.d = d.a.b(obj.getClass());
    }

    public void a(p pVar, Lifecycle.Event event) {
        d.a aVar = this.d;
        Object obj = this.c;
        d.a.a(aVar.a.get(event), pVar, event, obj);
        d.a.a(aVar.a.get(Lifecycle.Event.ON_ANY), pVar, event, obj);
    }
}
