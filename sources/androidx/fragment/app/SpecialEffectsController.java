package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.FragmentManager;
import h0.i.e.a;
import h0.i.i.q;
import h0.o.a.a0;
import h0.o.a.q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class SpecialEffectsController {
    public final ViewGroup a;
    public final ArrayList<Operation> b = new ArrayList<>();
    public final ArrayList<Operation> c = new ArrayList<>();
    public boolean d = false;
    public boolean e = false;

    public class a implements Runnable {
        public final /* synthetic */ c c;

        public a(c cVar) {
            this.c = cVar;
        }

        public void run() {
            if (SpecialEffectsController.this.b.contains(this.c)) {
                c cVar = this.c;
                cVar.a.applyState(cVar.c.mView);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ c c;

        public b(c cVar) {
            this.c = cVar;
        }

        public void run() {
            SpecialEffectsController.this.b.remove(this.c);
            SpecialEffectsController.this.c.remove(this.c);
        }
    }

    public static class c extends Operation {
        public final a0 h;

        public c(Operation.State state, Operation.LifecycleImpact lifecycleImpact, a0 a0Var, h0.i.e.a aVar) {
            super(state, lifecycleImpact, a0Var.c, aVar);
            this.h = a0Var;
        }

        public void b() {
            super.b();
            this.h.k();
        }

        public void d() {
            if (this.b == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.h.c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = this.c.requireView();
                if (requireView.getParent() == null) {
                    this.h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static SpecialEffectsController f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.P());
    }

    public static SpecialEffectsController g(ViewGroup viewGroup, q0 q0Var) {
        int i = R.id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        Objects.requireNonNull((FragmentManager.f) q0Var);
        h0.o.a.b bVar = new h0.o.a.b(viewGroup);
        viewGroup.setTag(i, bVar);
        return bVar;
    }

    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, a0 a0Var) {
        synchronized (this.b) {
            h0.i.e.a aVar = new h0.i.e.a();
            Operation d2 = d(a0Var.c);
            if (d2 != null) {
                d2.c(state, lifecycleImpact);
                return;
            }
            c cVar = new c(state, lifecycleImpact, a0Var, aVar);
            this.b.add(cVar);
            cVar.d.add(new a(cVar));
            cVar.d.add(new b(cVar));
        }
    }

    public abstract void b(List<Operation> list, boolean z);

    public void c() {
        if (!this.e) {
            ViewGroup viewGroup = this.a;
            AtomicInteger atomicInteger = q.a;
            if (!viewGroup.isAttachedToWindow()) {
                e();
                this.d = false;
                return;
            }
            synchronized (this.b) {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.a();
                        if (!operation.g) {
                            this.c.add(operation);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                }
            }
        }
    }

    public final Operation d(Fragment fragment) {
        Iterator<Operation> it = this.b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.c.equals(fragment) && !next.f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.a;
        AtomicInteger atomicInteger = q.a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            i();
            Iterator<Operation> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (FragmentManager.R(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(operation);
                    Log.v("FragmentManager", sb.toString());
                }
                operation.a();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (FragmentManager.R(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(operation2);
                    Log.v("FragmentManager", sb2.toString());
                }
                operation2.a();
            }
        }
    }

    public void h() {
        synchronized (this.b) {
            i();
            this.e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.b.get(size);
                Operation.State from = Operation.State.from(operation.c.mView);
                Operation.State state = operation.a;
                Operation.State state2 = Operation.State.VISIBLE;
                if (state == state2 && from != state2) {
                    this.e = operation.c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<Operation> it = this.b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.b == Operation.LifecycleImpact.ADDING) {
                next.c(Operation.State.from(next.c.requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public static class Operation {
        public State a;
        public LifecycleImpact b;
        public final Fragment c;
        public final List<Runnable> d = new ArrayList();
        public final HashSet<h0.i.e.a> e = new HashSet<>();
        public boolean f = false;
        public boolean g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public class a implements a.C0042a {
            public a() {
            }

            public void a() {
                Operation.this.a();
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, h0.i.e.a aVar) {
            this.a = state;
            this.b = lifecycleImpact;
            this.c = fragment;
            aVar.b(new a());
        }

        public final void a() {
            if (!this.f) {
                this.f = true;
                if (this.e.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(this.e).iterator();
                while (it.hasNext()) {
                    ((h0.i.e.a) it.next()).a();
                }
            }
        }

        public void b() {
            if (!this.g) {
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.g = true;
                for (Runnable run : this.d) {
                    run.run();
                }
            }
        }

        public final void c(State state, LifecycleImpact lifecycleImpact) {
            int ordinal = lifecycleImpact.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (FragmentManager.R(2)) {
                            StringBuilder P0 = i0.d.a.a.a.P0("SpecialEffectsController: For fragment ");
                            P0.append(this.c);
                            P0.append(" mFinalState = ");
                            P0.append(this.a);
                            P0.append(" -> REMOVED. mLifecycleImpact  = ");
                            P0.append(this.b);
                            P0.append(" to REMOVING.");
                            Log.v("FragmentManager", P0.toString());
                        }
                        this.a = State.REMOVED;
                        this.b = LifecycleImpact.REMOVING;
                    }
                } else if (this.a == State.REMOVED) {
                    if (FragmentManager.R(2)) {
                        StringBuilder P02 = i0.d.a.a.a.P0("SpecialEffectsController: For fragment ");
                        P02.append(this.c);
                        P02.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        P02.append(this.b);
                        P02.append(" to ADDING.");
                        Log.v("FragmentManager", P02.toString());
                    }
                    this.a = State.VISIBLE;
                    this.b = LifecycleImpact.ADDING;
                }
            } else if (this.a != State.REMOVED) {
                if (FragmentManager.R(2)) {
                    StringBuilder P03 = i0.d.a.a.a.P0("SpecialEffectsController: For fragment ");
                    P03.append(this.c);
                    P03.append(" mFinalState = ");
                    P03.append(this.a);
                    P03.append(" -> ");
                    P03.append(state);
                    P03.append(". ");
                    Log.v("FragmentManager", P03.toString());
                }
                this.a = state;
            }
        }

        public void d() {
        }

        public String toString() {
            StringBuilder S0 = i0.d.a.a.a.S0("Operation ", "{");
            S0.append(Integer.toHexString(System.identityHashCode(this)));
            S0.append("} ");
            S0.append("{");
            S0.append("mFinalState = ");
            S0.append(this.a);
            S0.append("} ");
            S0.append("{");
            S0.append("mLifecycleImpact = ");
            S0.append(this.b);
            S0.append("} ");
            S0.append("{");
            S0.append("mFragment = ");
            S0.append(this.c);
            S0.append("}");
            return S0.toString();
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static State from(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            public void applyState(View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (ordinal == 1) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (ordinal == 2) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (ordinal == 3) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }

            public static State from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(i0.d.a.a.a.e0("Unknown visibility ", i));
            }
        }
    }
}
