package com.clubhouse.android.ui.onboarding;

import android.widget.EditText;
import com.clubhouse.android.core.ui.BaseFragment;
import com.clubhouse.android.databinding.FragmentCollectNameBinding;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.e.b.d3.k;
import i0.e.b.g3.r.b2;
import i0.e.b.g3.r.d;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: CollectNameUtil.kt */
public final class CollectNameUtil {
    public final BaseFragment a;
    public final FragmentCollectNameBinding b;
    public final CollectNameViewModel c;

    public CollectNameUtil(BaseFragment baseFragment, FragmentCollectNameBinding fragmentCollectNameBinding, CollectNameViewModel collectNameViewModel) {
        i.e(baseFragment, "fragment");
        i.e(fragmentCollectNameBinding, "binding");
        i.e(collectNameViewModel, "viewModel");
        this.a = baseFragment;
        this.b = fragmentCollectNameBinding;
        this.c = collectNameViewModel;
    }

    public static final boolean a(CollectNameUtil collectNameUtil) {
        return (StringsKt__IndentKt.o(collectNameUtil.b.b.getText().toString()) ^ true) && (StringsKt__IndentKt.o(collectNameUtil.b.c.getText().toString()) ^ true);
    }

    public final void b() {
        this.b.e.setOnClickListener(new d(this));
        EditText editText = this.b.c;
        i.d(editText, "binding.lastName");
        k.B(editText, new CollectNameUtil$setUpViews$2(this));
        EditText editText2 = this.b.b;
        i.d(editText2, "binding.firstName");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(k.M(editText2), new CollectNameUtil$setUpViews$3(this, (c<? super CollectNameUtil$setUpViews$3>) null));
        p viewLifecycleOwner = this.a.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        EditText editText3 = this.b.c;
        i.d(editText3, "binding.lastName");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(k.M(editText3), new CollectNameUtil$setUpViews$4(this, (c<? super CollectNameUtil$setUpViews$4>) null));
        p viewLifecycleOwner2 = this.a.getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner2));
    }

    public final void c(String str, String str2) {
        i.e(str, "firstName");
        i.e(str2, "lastName");
        boolean z = true;
        if (!(str.length() == 0)) {
            if (str2.length() != 0) {
                z = false;
            }
            if (!z) {
                this.c.p(new b2(str, str2));
                return;
            }
        }
        v.f2(this.a, CollectNameUtil$updateName$1.c);
    }
}
