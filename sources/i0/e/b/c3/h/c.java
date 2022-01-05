package i0.e.b.c3.h;

import android.app.Application;
import com.airbnb.mvrx.MavericksViewModel;
import i0.b.b.j;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: HiltMavericksViewModelFactory.kt */
public class c<VM extends MavericksViewModel<S>, S extends j> implements v<VM, S> {
    public final Class<? extends MavericksViewModel<S>> a;

    public c(Class<? extends MavericksViewModel<S>> cls) {
        i.e(cls, "viewModelClass");
        this.a = cls;
    }

    public VM create(j0 j0Var, S s) {
        i.e(j0Var, "viewModelContext");
        i.e(s, "state");
        Application application = j0Var.a().getApplication();
        Objects.requireNonNull(application, "null cannot be cast to non-null type A");
        VM vm = null;
        a aVar = ((b) h.L0(new l.e(((l.d) ((a) h.L0(application, a.class)).g()).a, new i0.e.b.c3.j.a(), (l.a) null), b.class)).a().get(this.a);
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            vm = aVar.c(s);
        }
        Objects.requireNonNull(vm, "null cannot be cast to non-null type VM of com.clubhouse.android.di.mavericks.HiltMavericksViewModelFactory");
        return vm;
    }

    public S initialState(j0 j0Var) {
        i.e(j0Var, "viewModelContext");
        return null;
    }
}
