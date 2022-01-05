package h0.u;

import androidx.paging.ActiveFlowTracker;
import androidx.paging.CachedPageEventFlow;
import androidx.paging.MulticastedPagingData$accumulated$1;
import androidx.paging.MulticastedPagingData$accumulated$2;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import m0.l.c;
import m0.n.b.i;
import n0.a.f0;

/* compiled from: CachedPagingData.kt */
public final class l<T> {
    public final CachedPageEventFlow<T> a;
    public final f0 b;
    public final w<T> c;
    public final ActiveFlowTracker d = null;

    public l(f0 f0Var, w wVar, ActiveFlowTracker activeFlowTracker, int i) {
        int i2 = i & 4;
        i.e(f0Var, "scope");
        i.e(wVar, "parent");
        this.b = f0Var;
        this.c = wVar;
        this.a = new CachedPageEventFlow<>(new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new MulticastedPagingData$accumulated$1(this, (c) null), wVar.d), new MulticastedPagingData$accumulated$2(this, (c) null)), f0Var);
    }
}
