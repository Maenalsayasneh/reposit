package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentValidateNumberBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.e2;
import i0.e.b.g3.r.t1;
import i0.e.b.g3.r.x;
import i0.e.b.g3.r.y;
import i0.e.b.g3.r.z;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.StringsKt__IndentKt;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/ValidateNumberFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentValidateNumberBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentValidateNumberBinding;", "binding", "", "d2", "Z", "K0", "()Z", "shouldShowKeyboard", "Lcom/clubhouse/android/ui/onboarding/ValidateNumberViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/onboarding/ValidateNumberViewModel;", "viewModel", "Lcom/clubhouse/android/ui/onboarding/ValidateNumberArgs;", "c2", "Lm0/o/c;", "getArgs", "()Lcom/clubhouse/android/ui/onboarding/ValidateNumberArgs;", "args", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ValidateNumberFragment.kt */
public final class ValidateNumberFragment extends Hilt_ValidateNumberFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ValidateNumberFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentValidateNumberBinding;")), m.c(new PropertyReference1Impl(m.a(ValidateNumberFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/ValidateNumberViewModel;")), m.c(new PropertyReference1Impl(m.a(ValidateNumberFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/onboarding/ValidateNumberArgs;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentValidateNumberBinding.class, this);
    public final c b2;
    public final m0.o.c c2;
    public final boolean d2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ValidateNumberFragment, ValidateNumberViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ValidateNumberFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(t1.class), false, this.b);
        }
    }

    public ValidateNumberFragment() {
        super(R.layout.fragment_validate_number);
        d a3 = m.a(ValidateNumberViewModel.class);
        this.b2 = new a(a3, false, new ValidateNumberFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = new i0.b.b.i();
        this.d2 = true;
    }

    public void J() {
        v.v2(O0(), new ValidateNumberFragment$invalidate$1(this));
    }

    public boolean K0() {
        return this.d2;
    }

    public final FragmentValidateNumberBinding N0() {
        return (FragmentValidateNumberBinding) this.a2.getValue(this, Z1[0]);
    }

    public final ValidateNumberViewModel O0() {
        return (ValidateNumberViewModel) this.b2.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.g1(this, O0(), ValidateNumberFragment$onCreate$1.c, v.q2(this, (String) null, 1, (Object) null), new ValidateNumberFragment$onCreate$2(this, (m0.l.c<? super ValidateNumberFragment$onCreate$2>) null), new ValidateNumberFragment$onCreate$3(this, (m0.l.c<? super ValidateNumberFragment$onCreate$3>) null));
        v.g1(this, O0(), ValidateNumberFragment$onCreate$4.c, v.q2(this, (String) null, 1, (Object) null), new ValidateNumberFragment$onCreate$5(this, (m0.l.c<? super ValidateNumberFragment$onCreate$5>) null), new ValidateNumberFragment$onCreate$6(this, (m0.l.c<? super ValidateNumberFragment$onCreate$6>) null));
        v.g1(this, O0(), ValidateNumberFragment$onCreate$7.c, v.q2(this, (String) null, 1, (Object) null), new ValidateNumberFragment$onCreate$8(this, (m0.l.c<? super ValidateNumberFragment$onCreate$8>) null), new ValidateNumberFragment$onCreate$9(this, (m0.l.c<? super ValidateNumberFragment$onCreate$9>) null));
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        i.d(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        g0.a.b.b.a.a(onBackPressedDispatcher, this, false, new ValidateNumberFragment$onCreate$10(this), 2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int intValue;
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().a.setOnClickListener(new z(this));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.c = 4;
        Integer num = ((ValidateNumberArgs) this.c2.getValue(this, Z1[2])).d;
        if (num != null && (intValue = num.intValue()) > 0) {
            ref$IntRef.c = intValue;
        }
        N0().b.setHint(StringsKt__IndentKt.z("• ", ref$IntRef.c));
        EditText editText = N0().b;
        InputFilter[] filters = editText.getFilters();
        i.d(filters, "binding.code.filters");
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(ref$IntRef.c);
        i.e(filters, "$this$plus");
        int length = filters.length;
        Object[] copyOf = Arrays.copyOf(filters, length + 1);
        copyOf[length] = lengthFilter;
        i.d(copyOf, "result");
        editText.setFilters((InputFilter[]) copyOf);
        EditText editText2 = N0().b;
        i.d(editText2, "binding.code");
        editText2.addTextChangedListener(new e2(ref$IntRef, this));
        EditText editText3 = N0().b;
        i.d(editText3, "binding.code");
        i0.e.b.d3.k.B(editText3, new ValidateNumberFragment$bindCode$3(this));
        Button button = N0().d;
        i.d(button, "binding.nextButton");
        i0.e.b.d3.k.h(button);
        N0().d.setOnClickListener(new x(this));
        N0().e.setOnClickListener(new y(this));
    }
}
