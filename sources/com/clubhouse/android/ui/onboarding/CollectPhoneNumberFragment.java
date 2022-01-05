package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentCollectPhoneNumberBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b.a.d;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.d2;
import i0.e.b.g3.r.e;
import i0.e.b.g3.r.f;
import i0.e.b.g3.r.p0;
import i0.e.b.g3.r.q0;
import i0.e.b.g3.r.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nR\u001c\u0010\u0011\u001a\u00020\f8\u0016@\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/CollectPhoneNumberFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "P0", "", "c2", "Z", "K0", "()Z", "shouldShowKeyboard", "Lcom/clubhouse/android/ui/onboarding/CollectPhoneNumberViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/onboarding/CollectPhoneNumberViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentCollectPhoneNumberBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentCollectPhoneNumberBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: CollectPhoneNumberFragment.kt */
public final class CollectPhoneNumberFragment extends Hilt_CollectPhoneNumberFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(CollectPhoneNumberFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentCollectPhoneNumberBinding;")), m.c(new PropertyReference1Impl(m.a(CollectPhoneNumberFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/CollectPhoneNumberViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentCollectPhoneNumberBinding.class, this);
    public final c b2;
    public final boolean c2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<CollectPhoneNumberFragment, CollectPhoneNumberViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new CollectPhoneNumberFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(p0.class), false, this.b);
        }
    }

    public CollectPhoneNumberFragment() {
        super(R.layout.fragment_collect_phone_number);
        d a3 = m.a(CollectPhoneNumberViewModel.class);
        this.b2 = new a(a3, false, new CollectPhoneNumberFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = true;
    }

    public void J() {
        v.v2(O0(), new CollectPhoneNumberFragment$invalidate$1(this));
    }

    public boolean K0() {
        return this.c2;
    }

    public final FragmentCollectPhoneNumberBinding N0() {
        return (FragmentCollectPhoneNumberBinding) this.a2.getValue(this, Z1[0]);
    }

    public final CollectPhoneNumberViewModel O0() {
        return (CollectPhoneNumberViewModel) this.b2.getValue();
    }

    public final void P0() {
        String fullNumberWithPlus = N0().a.getFullNumberWithPlus();
        if (N0().a.f()) {
            CollectPhoneNumberViewModel O0 = O0();
            i.d(fullNumberWithPlus, "fullNumber");
            O0.p(new d2(fullNumberWithPlus));
            return;
        }
        CollectPhoneNumberFragment$validatePhoneNumber$1 collectPhoneNumberFragment$validatePhoneNumber$1 = new CollectPhoneNumberFragment$validatePhoneNumber$1(this, fullNumberWithPlus);
        i.e(this, "<this>");
        i.e(collectPhoneNumberFragment$validatePhoneNumber$1, "f");
        d.a aVar = new d.a(requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        collectPhoneNumberFragment$validatePhoneNumber$1.invoke(aVar);
        aVar.g();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Annotation annotation;
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Annotation annotation2 = null;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new CollectPhoneNumberFragment$onViewCreated$1(this, (m0.l.c<? super CollectPhoneNumberFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        r0 r0Var = new r0(this);
        q0 q0Var = new q0(this);
        SpannedString spannedString = (SpannedString) getText(R.string.terms_privacy_message);
        SpannableString spannableString = new SpannableString(spannedString);
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spannedString.getSpans(0, spannedString.length(), Annotation.class);
        if (annotationArr != null) {
            int length = annotationArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotationArr[i2];
                if (i.a(annotation.getValue(), "terms_link")) {
                    break;
                }
                i2++;
            }
            if (annotation != null) {
                spannableString.setSpan(r0Var, spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation), 33);
            }
        }
        if (annotationArr != null) {
            int length2 = annotationArr.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Annotation annotation3 = annotationArr[i];
                if (i.a(annotation3.getValue(), "privacy_link")) {
                    annotation2 = annotation3;
                    break;
                }
                i++;
            }
            if (annotation2 != null) {
                spannableString.setSpan(q0Var, spannedString.getSpanStart(annotation2), spannedString.getSpanEnd(annotation2), 33);
            }
        }
        TextView textView = N0().e;
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        N0().a.setEditText_registeredCarrierNumber(N0().d);
        N0().a.setTypeFace(h0.i.b.d.h.a(requireContext(), R.font.nunito_regular));
        N0().a.setPhoneNumberValidityChangeListener(new e(this));
        N0().c.setOnClickListener(new f(this));
        EditText editText = N0().d;
        i.d(editText, "binding.phoneNumber");
        i0.e.b.d3.k.B(editText, new CollectPhoneNumberFragment$onViewCreated$4(this));
    }
}
