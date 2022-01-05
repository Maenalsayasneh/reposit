package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentCollectUsernameWithSuggestionsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.c2;
import i0.e.b.g3.r.j;
import i0.e.b.g3.r.w0;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u000f8@@\u0000X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u00020\u001b8@@\u0000X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/clubhouse/android/ui/onboarding/CollectUsernameWithSuggestionsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "", "displayedText", "P0", "(Ljava/lang/String;)V", "Lcom/clubhouse/android/databinding/FragmentCollectUsernameWithSuggestionsBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentCollectUsernameWithSuggestionsBinding;", "binding", "", "c2", "Z", "K0", "()Z", "shouldShowKeyboard", "Lcom/clubhouse/android/ui/onboarding/CollectUsernameViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/onboarding/CollectUsernameViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: CollectUsernameWithSuggestionsFragment.kt */
public final class CollectUsernameWithSuggestionsFragment extends Hilt_CollectUsernameWithSuggestionsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(CollectUsernameWithSuggestionsFragment.class), "binding", "getBinding$app_productionRelease()Lcom/clubhouse/android/databinding/FragmentCollectUsernameWithSuggestionsBinding;")), m.c(new PropertyReference1Impl(m.a(CollectUsernameWithSuggestionsFragment.class), "viewModel", "getViewModel$app_productionRelease()Lcom/clubhouse/android/ui/onboarding/CollectUsernameViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentCollectUsernameWithSuggestionsBinding.class, this);
    public final c b2;
    public final boolean c2;

    /* compiled from: CollectUsernameWithSuggestionsFragment.kt */
    public static final class a implements TextWatcher {
        public final /* synthetic */ CollectUsernameWithSuggestionsFragment c;

        public a(CollectUsernameWithSuggestionsFragment collectUsernameWithSuggestionsFragment) {
            this.c = collectUsernameWithSuggestionsFragment;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
            if (kotlin.text.StringsKt__IndentKt.H(r2, "@", false, 2) == false) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
            /*
                r1 = this;
                com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameWithSuggestionsBinding r2 = r2.N0()
                android.widget.EditText r2 = r2.h
                int r2 = r2.length()
                r3 = 0
                java.lang.String r4 = "@"
                r5 = 1
                if (r2 < r5) goto L_0x002a
                com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameWithSuggestionsBinding r2 = r2.N0()
                android.widget.EditText r2 = r2.h
                android.text.Editable r2 = r2.getText()
                java.lang.String r0 = "binding.username.text"
                m0.n.b.i.d(r2, r0)
                r0 = 2
                boolean r2 = kotlin.text.StringsKt__IndentKt.H(r2, r4, r3, r0)
                if (r2 != 0) goto L_0x004c
            L_0x002a:
                com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameWithSuggestionsBinding r2 = r2.N0()
                android.widget.EditText r2 = r2.h
                r2.setText(r4)
                com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameWithSuggestionsBinding r2 = r2.N0()
                android.widget.EditText r2 = r2.h
                com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment r4 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameWithSuggestionsBinding r4 = r4.N0()
                android.widget.EditText r4 = r4.h
                int r4 = r4.length()
                r2.setSelection(r4)
            L_0x004c:
                com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameWithSuggestionsBinding r2 = r2.N0()
                android.widget.Button r2 = r2.e
                java.lang.String r4 = "binding.nextButton"
                m0.n.b.i.d(r2, r4)
                com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment r4 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameWithSuggestionsBinding r4 = r4.N0()
                android.widget.EditText r4 = r4.h
                int r4 = r4.length()
                if (r4 <= r5) goto L_0x0068
                r3 = r5
            L_0x0068:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                i0.e.b.d3.k.k(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment.a.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<CollectUsernameWithSuggestionsFragment, CollectUsernameViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public b(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new CollectUsernameWithSuggestionsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(w0.class), false, this.b);
        }
    }

    public CollectUsernameWithSuggestionsFragment() {
        super(R.layout.fragment_collect_username_with_suggestions);
        d a3 = m.a(CollectUsernameViewModel.class);
        this.b2 = new b(a3, false, new CollectUsernameWithSuggestionsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = true;
    }

    public void J() {
        v.v2(O0(), new CollectUsernameWithSuggestionsFragment$invalidate$1(this));
    }

    public boolean K0() {
        return this.c2;
    }

    public final FragmentCollectUsernameWithSuggestionsBinding N0() {
        return (FragmentCollectUsernameWithSuggestionsBinding) this.a2.getValue(this, Z1[0]);
    }

    public final CollectUsernameViewModel O0() {
        return (CollectUsernameViewModel) this.b2.getValue();
    }

    public final void P0(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(1);
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        O0().p(new c2(substring));
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.V(this);
        N0().e.setOnClickListener(new j(this));
        N0().a.setOnClickListener(new i0.e.b.g3.r.k(this));
        EditText editText = N0().h;
        i.d(editText, "binding.username");
        i0.e.b.d3.k.B(editText, new CollectUsernameWithSuggestionsFragment$onViewCreated$3(this));
        N0().h.addTextChangedListener(new a(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new CollectUsernameWithSuggestionsFragment$handleEffects$1(this, (m0.l.c<? super CollectUsernameWithSuggestionsFragment$handleEffects$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
    }
}
