package h0.q;

import android.annotation.SuppressLint;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import h0.c.a.b.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: LifecycleRegistry */
public class r extends Lifecycle {
    public h0.c.a.b.a<o, a> b = new h0.c.a.b.a<>();
    public Lifecycle.State c;
    public final WeakReference<p> d;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public ArrayList<Lifecycle.State> h = new ArrayList<>();
    public final boolean i;

    /* compiled from: LifecycleRegistry */
    public static class a {
        public Lifecycle.State a;
        public n b;

        public a(o oVar, Lifecycle.State state) {
            n nVar;
            Map<Class<?>, Integer> map = u.a;
            boolean z = oVar instanceof n;
            boolean z2 = oVar instanceof j;
            if (z && z2) {
                nVar = new FullLifecycleObserverAdapter((j) oVar, (n) oVar);
            } else if (z2) {
                nVar = new FullLifecycleObserverAdapter((j) oVar, (n) null);
            } else if (z) {
                nVar = (n) oVar;
            } else {
                Class<?> cls = oVar.getClass();
                if (u.c(cls) == 2) {
                    List list = u.b.get(cls);
                    if (list.size() == 1) {
                        nVar = new SingleGeneratedAdapterObserver(u.a((Constructor) list.get(0), oVar));
                    } else {
                        k[] kVarArr = new k[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            kVarArr[i] = u.a((Constructor) list.get(i), oVar);
                        }
                        nVar = new CompositeGeneratedAdaptersObserver(kVarArr);
                    }
                } else {
                    nVar = new ReflectiveGenericLifecycleObserver(oVar);
                }
            }
            this.b = nVar;
            this.a = state;
        }

        public void a(p pVar, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.a = r.f(this.a, targetState);
            this.b.a(pVar, event);
            this.a = targetState;
        }
    }

    public r(p pVar) {
        this.d = new WeakReference<>(pVar);
        this.c = Lifecycle.State.INITIALIZED;
        this.i = true;
    }

    public static Lifecycle.State f(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public void a(o oVar) {
        p pVar;
        d("addObserver");
        Lifecycle.State state = this.c;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar = new a(oVar, state2);
        if (this.b.j(oVar, aVar) == null && (pVar = (p) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            Lifecycle.State c2 = c(oVar);
            this.e++;
            while (aVar.a.compareTo(c2) < 0 && this.b.y.containsKey(oVar)) {
                this.h.add(aVar.a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.a);
                if (upFrom != null) {
                    aVar.a(pVar, upFrom);
                    h();
                    c2 = c(oVar);
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0("no event up from ");
                    P0.append(aVar.a);
                    throw new IllegalStateException(P0.toString());
                }
            }
            if (!z) {
                j();
            }
            this.e--;
        }
    }

    public void b(o oVar) {
        d("removeObserver");
        this.b.k(oVar);
    }

    public final Lifecycle.State c(o oVar) {
        h0.c.a.b.a<o, a> aVar = this.b;
        Lifecycle.State state = null;
        b.c<K, V> cVar = aVar.y.containsKey(oVar) ? aVar.y.get(oVar).x : null;
        Lifecycle.State state2 = cVar != null ? ((a) cVar.d).a : null;
        if (!this.h.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.h;
            state = arrayList.get(arrayList.size() - 1);
        }
        return f(f(this.c, state2), state);
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(String str) {
        if (this.i && !h0.c.a.a.a.d().b()) {
            throw new IllegalStateException(i0.d.a.a.a.o0("Method ", str, " must be called on the main thread"));
        }
    }

    public void e(Lifecycle.Event event) {
        d("handleLifecycleEvent");
        g(event.getTargetState());
    }

    public final void g(Lifecycle.State state) {
        if (this.c != state) {
            this.c = state;
            if (this.f || this.e != 0) {
                this.g = true;
                return;
            }
            this.f = true;
            j();
            this.f = false;
        }
    }

    public final void h() {
        ArrayList<Lifecycle.State> arrayList = this.h;
        arrayList.remove(arrayList.size() - 1);
    }

    public void i(Lifecycle.State state) {
        d("setCurrentState");
        g(state);
    }

    public final void j() {
        Lifecycle.State state;
        p pVar = (p) this.d.get();
        if (pVar != null) {
            while (true) {
                h0.c.a.b.a<o, a> aVar = this.b;
                boolean z = true;
                if (!(aVar.x == 0 || (((a) aVar.c.d).a == (state = ((a) aVar.d.d).a) && this.c == state))) {
                    z = false;
                }
                if (!z) {
                    this.g = false;
                    if (this.c.compareTo(((a) aVar.c.d).a) < 0) {
                        h0.c.a.b.a<o, a> aVar2 = this.b;
                        b.C0026b bVar = new b.C0026b(aVar2.d, aVar2.c);
                        aVar2.q.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            a aVar3 = (a) entry.getValue();
                            while (aVar3.a.compareTo(this.c) > 0 && !this.g && this.b.contains(entry.getKey())) {
                                Lifecycle.Event downFrom = Lifecycle.Event.downFrom(aVar3.a);
                                if (downFrom != null) {
                                    this.h.add(downFrom.getTargetState());
                                    aVar3.a(pVar, downFrom);
                                    h();
                                } else {
                                    StringBuilder P0 = i0.d.a.a.a.P0("no event down from ");
                                    P0.append(aVar3.a);
                                    throw new IllegalStateException(P0.toString());
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar = this.b.d;
                    if (!this.g && cVar != null && this.c.compareTo(((a) cVar.d).a) > 0) {
                        b<K, V>.d c2 = this.b.c();
                        while (c2.hasNext() && !this.g) {
                            Map.Entry entry2 = (Map.Entry) c2.next();
                            a aVar4 = (a) entry2.getValue();
                            while (aVar4.a.compareTo(this.c) < 0 && !this.g && this.b.contains(entry2.getKey())) {
                                this.h.add(aVar4.a);
                                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar4.a);
                                if (upFrom != null) {
                                    aVar4.a(pVar, upFrom);
                                    h();
                                } else {
                                    StringBuilder P02 = i0.d.a.a.a.P0("no event up from ");
                                    P02.append(aVar4.a);
                                    throw new IllegalStateException(P02.toString());
                                }
                            }
                        }
                    }
                } else {
                    this.g = false;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
