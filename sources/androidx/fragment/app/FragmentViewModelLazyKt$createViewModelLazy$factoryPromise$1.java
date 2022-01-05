package androidx.fragment.app;

import h0.q.m0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: FragmentViewModelLazy.kt */
public final class FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1 extends Lambda implements a<m0.b> {
    public final /* synthetic */ Fragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(Fragment fragment) {
        super(0);
        this.c = fragment;
    }

    public Object invoke() {
        return this.c.getDefaultViewModelProviderFactory();
    }
}
