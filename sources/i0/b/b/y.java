package i0.b.b;

import com.airbnb.mvrx.MavericksViewModel;
import h0.q.k0;
import i0.b.b.j;
import m0.n.b.i;

/* compiled from: MavericksViewModelWrapper.kt */
public final class y<VM extends MavericksViewModel<S>, S extends j> extends k0 {
    public final VM a;

    public y(VM vm) {
        i.e(vm, "viewModel");
        this.a = vm;
    }

    public void onCleared() {
        super.onCleared();
        this.a.i();
    }
}
