package com.clubhouse.android.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.core.ui.TriStateButton;
import com.clubhouse.android.databinding.FragmentProfileBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentThanksFragment;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.t.q;
import i0.b.b.e;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.u.a3;
import i0.e.b.g3.u.b3;
import i0.e.b.g3.u.c3;
import i0.e.b.g3.u.c4;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.e5;
import i0.e.b.g3.u.h4;
import i0.e.b.g3.u.j3;
import i0.e.b.g3.u.k2;
import i0.e.b.g3.u.k3;
import i0.e.b.g3.u.l2;
import i0.e.b.g3.u.l3;
import i0.e.b.g3.u.m2;
import i0.e.b.g3.u.m3;
import i0.e.b.g3.u.n2;
import i0.e.b.g3.u.o2;
import i0.e.b.g3.u.o3;
import i0.e.b.g3.u.p2;
import i0.e.b.g3.u.p3;
import i0.e.b.g3.u.q2;
import i0.e.b.g3.u.r2;
import i0.e.b.g3.u.t2;
import i0.e.b.g3.u.u2;
import i0.e.b.g3.u.v2;
import i0.e.b.g3.u.w2;
import i0.e.b.g3.u.x2;
import i0.e.b.g3.u.y2;
import i0.e.b.g3.u.y4;
import i0.e.b.g3.u.z2;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.i;
import m0.n.a.l;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u00020\u001b8F@\u0006X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\u00020!8F@\u0006X\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8F@\u0006X\u0002¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010*R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b,\u0010\u0011R(\u00106\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010\u0004\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/clubhouse/android/ui/profile/ProfileFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Lm0/i;", "Q0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "Lh0/a/f/b;", "Landroid/content/Intent;", "f2", "Lh0/a/f/b;", "getInstagramOAuthToken", "Li0/e/a/b/a;", "d2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Lcom/clubhouse/android/ui/profile/EditBioViewModel;", "c2", "Lm0/c;", "getBioViewModel", "()Lcom/clubhouse/android/ui/profile/EditBioViewModel;", "bioViewModel", "Lcom/clubhouse/android/databinding/FragmentProfileBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "O0", "()Lcom/clubhouse/android/databinding/FragmentProfileBinding;", "binding", "Lcom/clubhouse/android/ui/profile/ProfileViewModel;", "b2", "P0", "()Lcom/clubhouse/android/ui/profile/ProfileViewModel;", "viewModel", "g2", "getTwitterOAuthToken", "Li0/e/b/a3/f/b;", "e2", "Li0/e/b/a3/f/b;", "getActivityBannerHandler", "()Li0/e/b/a3/f/b;", "setActivityBannerHandler", "(Li0/e/b/a3/f/b;)V", "getActivityBannerHandler$annotations", "activityBannerHandler", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ProfileFragment.kt */
public final class ProfileFragment extends Hilt_ProfileFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ProfileFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentProfileBinding;")), m.c(new PropertyReference1Impl(m.a(ProfileFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/ProfileViewModel;")), m.c(new PropertyReference1Impl(m.a(ProfileFragment.class), "bioViewModel", "getBioViewModel()Lcom/clubhouse/android/ui/profile/EditBioViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentProfileBinding.class, this);
    public final m0.c b2;
    public final m0.c c2;
    public i0.e.a.b.a d2;
    public i0.e.b.a3.f.b e2;
    public h0.a.f.b<Intent> f2;
    public h0.a.f.b<Intent> g2;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<c5, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(1);
            this.c = i;
            this.d = obj;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                c5 c5Var = (c5) obj;
                m0.n.b.i.e(c5Var, "state");
                if (!c5Var.r && c5Var.l != null) {
                    if (c5Var.u) {
                        Objects.requireNonNull(ReportIncidentThanksFragment.Z1);
                        v.p0((ProfileFragment) this.d, ReportIncidentThanksFragment.b2, new s(0, (ProfileFragment) this.d, c5Var));
                    } else {
                        Objects.requireNonNull(ReportProfileLegacyFragment.Z1);
                        v.p0((ProfileFragment) this.d, ReportProfileLegacyFragment.b2, new s(1, (ProfileFragment) this.d, c5Var));
                    }
                }
                return i.a;
            } else if (i == 1) {
                c5 c5Var2 = (c5) obj;
                m0.n.b.i.e(c5Var2, "state");
                if (c5Var2.p && !(c5Var2.j instanceof e)) {
                    ((ProfileFragment) this.d).P0().p(e5.a);
                }
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<ProfileFragment, ProfileViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public b(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new ProfileFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(c5.class), false, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class c extends h<ProfileFragment, EditBioViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public c(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new ProfileFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(c4.class), true, this.b);
        }
    }

    public ProfileFragment() {
        super(R.layout.fragment_profile);
        d a3 = m.a(ProfileViewModel.class);
        b bVar = new b(a3, false, new ProfileFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3);
        k<Object>[] kVarArr = Z1;
        this.b2 = bVar.a(this, kVarArr[1]);
        d a4 = m.a(EditBioViewModel.class);
        this.c2 = new c(a4, true, new ProfileFragment$special$$inlined$parentFragmentViewModel$default$1(this, a4, a4), a4).a(this, kVarArr[2]);
    }

    public static final void N0(ProfileFragment profileFragment) {
        EditBioArgs editBioArgs = new EditBioArgs(!m0.n.b.i.a(profileFragment.O0().d.getText().toString(), profileFragment.getString(R.string.add_a_bio)) ? profileFragment.O0().d.getText().toString() : "");
        m0.n.b.i.e(editBioArgs, "mavericksArg");
        v.a1(profileFragment, new y4.b(editBioArgs), (q) null, 2);
    }

    public void J() {
        v.v2(P0(), new ProfileFragment$invalidate$1(this));
    }

    public final FragmentProfileBinding O0() {
        return (FragmentProfileBinding) this.a2.getValue(this, Z1[0]);
    }

    public final ProfileViewModel P0() {
        return (ProfileViewModel) this.b2.getValue();
    }

    public final void Q0() {
        P0().p(h4.a);
        ScrollView scrollView = O0().N;
        m0.n.b.i.d(scrollView, "binding.scroll");
        i0.e.b.d3.k.F(scrollView);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProfileViewModel P0 = P0();
        m0.n.b.i.e(this, "<this>");
        m0.n.b.i.e(P0, "viewModel");
        h0.a.f.b<Intent> registerForActivityResult = registerForActivityResult(new h0.a.f.d.d(), new i0.e.b.d3.c(P0, this));
        m0.n.b.i.d(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult()\n        ) { result ->\n            viewModel.processIntent(OAuthReturned)\n            if (result.resultCode == Activity.RESULT_OK) {\n                val intent = result.data\n                if (intent == null) {\n                    showInstagramConnectError()\n                } else {\n                    try {\n                        val authResponse = AuthorizationResponse.fromIntent(intent)\n                        val authCode: String? = authResponse?.authorizationCode\n                        if (authCode.isNullOrBlank()) {\n                            showInstagramConnectError()\n                        } else {\n                            viewModel.processIntent(UpdateInstagramProfile(authCode))\n                        }\n                    } catch (exception: Exception) {\n                        showInstagramConnectError(exception)\n                    }\n                }\n            } else if (result.resultCode != Activity.RESULT_CANCELED) {\n                showInstagramConnectError()\n            }\n        }");
        this.f2 = registerForActivityResult;
        ProfileViewModel P02 = P0();
        m0.n.b.i.e(this, "<this>");
        m0.n.b.i.e(P02, "viewModel");
        h0.a.f.b<Intent> registerForActivityResult2 = registerForActivityResult(new h0.a.f.d.d(), new i0.e.b.d3.b(P02, this));
        m0.n.b.i.d(registerForActivityResult2, "registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->\n            viewModel.processIntent(OAuthReturned)\n            if (result.resultCode == Activity.RESULT_OK) {\n                val intent = result.data\n                if (intent == null) {\n                    showTwitterConnectError()\n                } else {\n                    try {\n                        val verifier: String? =\n                            intent.data?.getQueryParameters(\"oauth_verifier\")?.firstOrNull()\n                        if (verifier.isNullOrBlank()) {\n                            showTwitterConnectError()\n                        } else {\n                            viewModel.processIntent(UpdateTwitterProfile(verifier))\n                        }\n                    } catch (exception: Exception) {\n                        showTwitterConnectError(exception)\n                    }\n                }\n            } else if (result.resultCode != Activity.RESULT_CANCELED) {\n                showTwitterConnectError()\n            }\n        }");
        this.g2 = registerForActivityResult2;
    }

    public void onViewCreated(View view, Bundle bundle) {
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.v2(P0(), new a(0, this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((EditBioViewModel) this.c2.getValue()).l, new ProfileFragment$onViewCreated$2(this, (m0.l.c<? super ProfileFragment$onViewCreated$2>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        v.g1(this, P0(), ProfileFragment$onViewCreated$3.c, v.q2(this, (String) null, 1, (Object) null), new ProfileFragment$onViewCreated$4(this, (m0.l.c<? super ProfileFragment$onViewCreated$4>) null), new ProfileFragment$onViewCreated$5(this, (m0.l.c<? super ProfileFragment$onViewCreated$5>) null));
        v.p0(this, "club_created_id", new ProfileFragment$onViewCreated$6(this));
        v.p0(this, "photo_url", new ProfileFragment$onViewCreated$7(this));
        ProfileViewModel P0 = P0();
        m0.n.b.i.e(this, "<this>");
        m0.n.b.i.e(P0, "viewModel");
        Objects.requireNonNull(HalfEventFragment.p2);
        v.p0(this, HalfEventFragment.r2, new HalfProfileUtil$getEventsNavigationResults$1(P0));
        v.p0(this, "event_deletion_result", new HalfProfileUtil$getEventsNavigationResults$2(P0));
        v.p0(this, "event_update_result", new HalfProfileUtil$getEventsNavigationResults$3(P0));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(P0().l, new ProfileFragment$onViewCreated$8(this, (m0.l.c<? super ProfileFragment$onViewCreated$8>) null));
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, h0.q.q.a(viewLifecycleOwner2));
        O0().b.setOnClickListener(new p3(this));
        EpoxyRecyclerView epoxyRecyclerView = O0().i;
        m0.n.b.i.d(epoxyRecyclerView, "binding.clubList");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new ProfileFragment$buildClubModels$1(this));
        EpoxyRecyclerView epoxyRecyclerView2 = O0().p;
        m0.n.b.i.d(epoxyRecyclerView2, "binding.followSuggestionsList");
        i0.e.b.d3.k.D(epoxyRecyclerView2, this, new ProfileFragment$buildFollowSuggestionModels$1(this));
        O0().m.setOnClickListener(new c3(this));
        O0().S.setOnClickListener(new q2(this));
        O0().K.setOnClickListener(new z2(this));
        O0().M.setOnClickListener(new u2(this));
        O0().r.setOnClickListener(new y2(this));
        Button button = O0().v;
        m0.n.b.i.d(button, "binding.giveMoneyButton");
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, h0.q.q.a(viewLifecycleOwner3), new t2(this));
        TriStateButton triStateButton = O0().k;
        m0.n.b.i.d(triStateButton, "binding.followButton");
        p viewLifecycleOwner4 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner4, "viewLifecycleOwner");
        i0.e.b.d3.k.H(triStateButton, h0.q.q.a(viewLifecycleOwner4), new l2(this));
        O0().F.setOnClickListener(new m2(this));
        O0().R.setOnClickListener(new j3(this));
        O0().A.setOnClickListener(new o3(this));
        O0().c.setOnClickListener(new o2(this));
        O0().Y.setOnClickListener(new v2(this));
        O0().I.setOnClickListener(new k3(this));
        O0().P.setOnClickListener(new k2(this));
        O0().O.setOnClickListener(new a3(this));
        O0().Q.setOnClickListener(new n2(this));
        TextView textView = O0().E;
        m0.n.b.i.d(textView, "binding.name");
        p viewLifecycleOwner5 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner5, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView, h0.q.q.a(viewLifecycleOwner5), new l3(this));
        TextView textView2 = O0().X;
        m0.n.b.i.d(textView2, "binding.username");
        p viewLifecycleOwner6 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner6, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView2, h0.q.q.a(viewLifecycleOwner6), new b3(this));
        O0().d.setOnClickListener(new p2(this));
        Button button2 = O0().V;
        m0.n.b.i.d(button2, "binding.twitter");
        p viewLifecycleOwner7 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner7, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button2, h0.q.q.a(viewLifecycleOwner7), new m3(this));
        Button button3 = O0().w;
        m0.n.b.i.d(button3, "binding.instagram");
        p viewLifecycleOwner8 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner8, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button3, h0.q.q.a(viewLifecycleOwner8), new r2(this));
        ConstraintLayout constraintLayout = O0().W.a;
        m0.n.b.i.d(constraintLayout, "binding.upcomingEventContainer.root");
        p viewLifecycleOwner9 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner9, "viewLifecycleOwner");
        i0.e.b.d3.k.H(constraintLayout, h0.q.q.a(viewLifecycleOwner9), new w2(this));
        RSVPButton rSVPButton = O0().W.b;
        m0.n.b.i.d(rSVPButton, "binding.upcomingEventContainer.bellIcon");
        p viewLifecycleOwner10 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner10, "viewLifecycleOwner");
        i0.e.b.d3.k.H(rSVPButton, h0.q.q.a(viewLifecycleOwner10), new x2(this));
        p viewLifecycleOwner11 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner11, "viewLifecycleOwner");
        viewLifecycleOwner11.getLifecycle().a(new ProfileFragment$onViewCreated$$inlined$observeResume$1(this));
    }
}
