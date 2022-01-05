package i0.b.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.airbnb.mvrx.MavericksViewModelConfig;
import m0.n.b.i;
import n0.a.f0;

/* compiled from: MavericksViewModelConfigFactory.kt */
public final class t extends MavericksViewModelConfig<S> {
    public final /* synthetic */ j d;
    public final /* synthetic */ f0 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(u uVar, j jVar, f0 f0Var, boolean z, l lVar, f0 f0Var2) {
        super(z, lVar, f0Var2);
        this.d = jVar;
        this.e = f0Var;
    }

    public <S extends j> MavericksViewModelConfig.BlockExecutions a(MavericksViewModel<S> mavericksViewModel) {
        i.e(mavericksViewModel, "viewModel");
        return MavericksViewModelConfig.BlockExecutions.No;
    }
}
