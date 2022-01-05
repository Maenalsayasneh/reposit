package com.clubhouse.android.ui.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentConnectSocialAccountsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.profile.settings.AccountViewModel;
import com.clubhouse.app.R;
import h0.a.f.b;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.n;
import i0.e.b.g3.u.z5.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016¨\u0006!"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/ConnectSocialAccountsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentConnectSocialAccountsBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentConnectSocialAccountsBinding;", "binding", "Lh0/a/f/b;", "Landroid/content/Intent;", "d2", "Lh0/a/f/b;", "getTwitterOAuthToken", "Lcom/clubhouse/android/ui/profile/settings/AccountViewModel;", "a2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/profile/settings/AccountViewModel;", "viewModel", "c2", "getInstagramOAuthToken", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ConnectSocialAccountsFragment.kt */
public final class ConnectSocialAccountsFragment extends Hilt_ConnectSocialAccountsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ConnectSocialAccountsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/settings/AccountViewModel;")), m.c(new PropertyReference1Impl(m.a(ConnectSocialAccountsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentConnectSocialAccountsBinding;"))};
    public final c a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentConnectSocialAccountsBinding.class, this);
    public b<Intent> c2;
    public b<Intent> d2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ConnectSocialAccountsFragment, AccountViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ConnectSocialAccountsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(n0.class), false, this.b);
        }
    }

    public ConnectSocialAccountsFragment() {
        super(R.layout.fragment_connect_social_accounts);
        d a3 = m.a(AccountViewModel.class);
        this.a2 = new a(a3, false, new ConnectSocialAccountsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[0]);
    }

    public void J() {
        v.v2(O0(), new ConnectSocialAccountsFragment$invalidate$1(this));
    }

    public final FragmentConnectSocialAccountsBinding N0() {
        return (FragmentConnectSocialAccountsBinding) this.b2.getValue(this, Z1[1]);
    }

    public final AccountViewModel O0() {
        return (AccountViewModel) this.a2.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.V(this);
        AccountViewModel O0 = O0();
        i.e(this, "<this>");
        i.e(O0, "viewModel");
        b<Intent> registerForActivityResult = registerForActivityResult(new h0.a.f.d.d(), new i0.e.b.d3.c(O0, this));
        i.d(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult()\n        ) { result ->\n            viewModel.processIntent(OAuthReturned)\n            if (result.resultCode == Activity.RESULT_OK) {\n                val intent = result.data\n                if (intent == null) {\n                    showInstagramConnectError()\n                } else {\n                    try {\n                        val authResponse = AuthorizationResponse.fromIntent(intent)\n                        val authCode: String? = authResponse?.authorizationCode\n                        if (authCode.isNullOrBlank()) {\n                            showInstagramConnectError()\n                        } else {\n                            viewModel.processIntent(UpdateInstagramProfile(authCode))\n                        }\n                    } catch (exception: Exception) {\n                        showInstagramConnectError(exception)\n                    }\n                }\n            } else if (result.resultCode != Activity.RESULT_CANCELED) {\n                showInstagramConnectError()\n            }\n        }");
        this.c2 = registerForActivityResult;
        AccountViewModel O02 = O0();
        i.e(this, "<this>");
        i.e(O02, "viewModel");
        b<Intent> registerForActivityResult2 = registerForActivityResult(new h0.a.f.d.d(), new i0.e.b.d3.b(O02, this));
        i.d(registerForActivityResult2, "registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->\n            viewModel.processIntent(OAuthReturned)\n            if (result.resultCode == Activity.RESULT_OK) {\n                val intent = result.data\n                if (intent == null) {\n                    showTwitterConnectError()\n                } else {\n                    try {\n                        val verifier: String? =\n                            intent.data?.getQueryParameters(\"oauth_verifier\")?.firstOrNull()\n                        if (verifier.isNullOrBlank()) {\n                            showTwitterConnectError()\n                        } else {\n                            viewModel.processIntent(UpdateTwitterProfile(verifier))\n                        }\n                    } catch (exception: Exception) {\n                        showTwitterConnectError(exception)\n                    }\n                }\n            } else if (result.resultCode != Activity.RESULT_CANCELED) {\n                showTwitterConnectError()\n            }\n        }");
        this.d2 = registerForActivityResult2;
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().c.setOnClickListener(new n(this));
        Button button = N0().d;
        i.d(button, "binding.twitter");
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner), new i0.e.b.g3.r.m(this));
        Button button2 = N0().a;
        i.d(button2, "binding.instagram");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button2, q.a(viewLifecycleOwner2), new i0.e.b.g3.r.l(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new ConnectSocialAccountsFragment$onViewCreated$4(this, (m0.l.c<? super ConnectSocialAccountsFragment$onViewCreated$4>) null));
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner3));
    }
}
