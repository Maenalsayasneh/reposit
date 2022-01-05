package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentWaitlistBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.b0;
import i0.e.b.g3.r.q2;
import i0.e.b.g3.r.u2;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/WaitlistFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentWaitlistBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentWaitlistBinding;", "binding", "Lcom/clubhouse/android/ui/onboarding/WaitlistViewModel;", "b2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/onboarding/WaitlistViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: WaitlistFragment.kt */
public final class WaitlistFragment extends Hilt_WaitlistFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(WaitlistFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentWaitlistBinding;")), m.c(new PropertyReference1Impl(m.a(WaitlistFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/WaitlistViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentWaitlistBinding.class, this);
    public final c b2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<WaitlistFragment, WaitlistViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new WaitlistFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(u2.class), false, this.b);
        }
    }

    public WaitlistFragment() {
        super(R.layout.fragment_waitlist);
        d a3 = m.a(WaitlistViewModel.class);
        this.b2 = new a(a3, false, new WaitlistFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public void J() {
        v.v2((WaitlistViewModel) this.b2.getValue(), new WaitlistFragment$invalidate$1(this));
    }

    public final FragmentWaitlistBinding N0() {
        return (FragmentWaitlistBinding) this.a2.getValue(this, Z1[0]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Annotation annotation = null;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((WaitlistViewModel) this.b2.getValue()).l, new WaitlistFragment$onViewCreated$1(this, (m0.l.c<? super WaitlistFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        q2 q2Var = new q2(this);
        SpannedString spannedString = (SpannedString) getText(R.string.learn_more_blog_post);
        SpannableString spannableString = new SpannableString(spannedString);
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spannedString.getSpans(0, spannedString.length(), Annotation.class);
        if (annotationArr != null) {
            int length = annotationArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                Annotation annotation2 = annotationArr[i];
                if (i.a(annotation2.getValue(), "blog_link")) {
                    annotation = annotation2;
                    break;
                }
                i++;
            }
            if (annotation != null) {
                spannableString.setSpan(q2Var, spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation), 33);
            }
        }
        TextView textView = N0().a;
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        N0().c.setOnClickListener(new b0(this));
    }
}
