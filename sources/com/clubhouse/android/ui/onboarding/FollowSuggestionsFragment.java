package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.FragmentFollowSuggestionsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.g3.r.r;
import i0.e.b.g3.r.s;
import i0.e.b.g3.r.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b%\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00060!R\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/FollowSuggestionsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/onboarding/FollowSuggestionsViewModel;", "c2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/onboarding/FollowSuggestionsViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentFollowSuggestionsBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentFollowSuggestionsBinding;", "binding", "Li0/e/a/b/a;", "a2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Lcom/clubhouse/android/ui/onboarding/FollowSuggestionsFragment$PagingItemController;", "d2", "Lcom/clubhouse/android/ui/onboarding/FollowSuggestionsFragment$PagingItemController;", "pagedController", "<init>", "PagingItemController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: FollowSuggestionsFragment.kt */
public final class FollowSuggestionsFragment extends Hilt_FollowSuggestionsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(FollowSuggestionsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentFollowSuggestionsBinding;")), m.c(new PropertyReference1Impl(m.a(FollowSuggestionsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/FollowSuggestionsViewModel;"))};
    public i0.e.a.b.a a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentFollowSuggestionsBinding.class, this);
    public final c c2;
    public final PagingItemController d2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/FollowSuggestionsFragment$PagingItemController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/a3/d/a;", "Li0/e/b/b3/b/e/m;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/a3/d/a;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/onboarding/FollowSuggestionsFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FollowSuggestionsFragment.kt */
    public final class PagingItemController extends PagingDataEpoxyController<i0.e.b.a3.d.a<i0.e.b.b3.b.e.m>> {
        public final /* synthetic */ FollowSuggestionsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PagingItemController(FollowSuggestionsFragment followSuggestionsFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(followSuggestionsFragment, "this$0");
            this.this$0 = followSuggestionsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m30buildItemModel$lambda0(FollowSuggestionsFragment followSuggestionsFragment, UserInList userInList, View view) {
            i.e(followSuggestionsFragment, "this$0");
            i.e(userInList, "$user");
            k<Object>[] kVarArr = FollowSuggestionsFragment.Z1;
            followSuggestionsFragment.O0().p(new z1(userInList));
        }

        public t<?> buildItemModel(int i, i0.e.b.a3.d.a<i0.e.b.b3.b.e.m> aVar) {
            if (aVar != null) {
                UserInList userInList = ((i0.e.b.b3.b.e.m) aVar.a).g;
                i0.e.b.g3.r.c3.c cVar = new i0.e.b.g3.r.c3.c();
                cVar.t(userInList.getId());
                FollowSuggestionsFragment$PagingItemController$buildItemModel$1 followSuggestionsFragment$PagingItemController$buildItemModel$1 = new FollowSuggestionsFragment$PagingItemController$buildItemModel$1(this.this$0, userInList);
                cVar.w();
                cVar.i = followSuggestionsFragment$PagingItemController$buildItemModel$1;
                String str = userInList.y;
                cVar.w();
                cVar.j = str;
                String str2 = userInList.Z1;
                cVar.w();
                cVar.k = str2;
                boolean z = aVar.b;
                cVar.w();
                cVar.l = z;
                i0.e.b.g3.r.t tVar = new i0.e.b.g3.r.t(this.this$0, userInList);
                cVar.w();
                cVar.o = tVar;
                i.d(cVar, "@AndroidEntryPoint\nclass FollowSuggestionsFragment : BaseFragment(R.layout.fragment_follow_suggestions) {\n\n    @Inject\n    lateinit var actionTrailRecorder: ActionTrailRecorder\n\n    private val binding: FragmentFollowSuggestionsBinding by viewBinding()\n    private val viewModel: FollowSuggestionsViewModel by fragmentViewModel()\n    private val pagedController: PagingItemController = PagingItemController()\n\n    override fun onCreate(savedInstanceState: Bundle?) {\n        super.onCreate(savedInstanceState)\n\n        disableBackPress()\n\n        viewModel.onAsync(\n            FollowSuggestionsState::navigateTo,\n            uniqueOnly(),\n            onFail = {\n                showBanner {\n                    message(it.message ?: getString(R.string.common_error_try_again))\n                    style(Banner.Style.Negative)\n                }\n            },\n            onSuccess = { destination ->\n                analytics().trackEvent(ONBOARDING_FOLLOWS_DONE)\n                navigateToDestination(destination)\n            }\n        )\n    }\n\n    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n        super.onViewCreated(view, savedInstanceState)\n\n        viewModel.effectFlow.onEach {\n            when (it) {\n                is FollowThresholdNotMet -> {\n                    alertDialog {\n                        setTitle(R.string.are_you_sure)\n                        setMessage(R.string.clubhouse_will_be_quiet)\n                        setPositiveButton(R.string.yes) { dialog, _ ->\n                            analytics().trackEvent(ONBOARDING_FOLLOW_SUGGESTIONS_SKIPPED)\n                            viewModel.processIntent(Finish)\n                        }\n                        setNegativeButton(R.string.never_mind) { dialog, _ ->\n                            dialog.dismiss()\n                        }\n                    }\n                }\n            }\n        }.launchIn(viewLifecycleOwner.lifecycleScope)\n\n        binding.followSuggestions.setController(pagedController)\n        binding.continueButton.setDebouncedOnClickListener(viewLifecycleOwner.lifecycleScope) {\n            viewModel.processIntent(AdvanceToNext)\n        }\n        binding.suggestionToggle.setOnClickListener {\n            viewModel.processIntent(ToggleSuggestions)\n        }\n        pagedController.scrollToTopOnHeaderLoad(binding.followSuggestions)\n        pagedController.observeState().onEach { state ->\n            binding.loading.showIf(\n                state is PagingState.Loading\n                        || state is PagingState.Empty\n                        || state is PagingState.LoadError\n            )\n\n            if (state is PagingState.LoadError) {\n                viewModel.processIntent(Finish)\n            }\n\n            if (state is PagingState.Loaded) {\n                withState(viewModel) { viewState ->\n                    binding.continueButton.text = getString(viewState.buttonString)\n                    binding.suggestionToggle.text = getString(viewState.suggestionToggleString)\n                }\n            }\n        }.launchIn(viewLifecycleOwner.lifecycleScope)\n    }\n\n    override fun invalidate() {\n        withState(viewModel) { state ->\n            state.users?.let {\n                viewLifecycleOwner.lifecycleScope.launch {\n                    pagedController.submitData(it)\n                }\n            }\n        }\n    }\n\n    inner class PagingItemController : PagingDataEpoxyController<SelectableItem<UserItem>>() {\n        override fun buildItemModel(\n            currentPosition: Int,\n            item: SelectableItem<UserItem>?\n        ): EpoxyModel<*> {\n                val user = requireNotNull(item).item.user\n                return SimpleListUser_()\n                    .id(user.id)\n                    .impressionLoggingAction {\n                        withState(viewModel) { state ->\n                            actionTrailRecorder.recommendationImpression(\n                                SourceLocation.ONBOARDING_SUGGESTED,\n                                user.loggingContext\n                            )\n                        }\n                    }\n                    .name(user.name)\n                    .image(user.photoUrl)\n                    .selected(item.selected)\n                    .clickListener { _ -> viewModel.processIntent(ToggleFollow(user)) }\n        }\n    }\n}");
                return cVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<FollowSuggestionsFragment, FollowSuggestionsViewModel> {
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
            return i0.b.b.g.a.b(fragment, kVar, this.a, new FollowSuggestionsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(FollowSuggestionsState.class), false, this.b);
        }
    }

    public FollowSuggestionsFragment() {
        super(R.layout.fragment_follow_suggestions);
        d a3 = m.a(FollowSuggestionsViewModel.class);
        this.c2 = new a(a3, false, new FollowSuggestionsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.d2 = new PagingItemController(this);
    }

    public void J() {
        v.v2(O0(), new FollowSuggestionsFragment$invalidate$1(this));
    }

    public final FragmentFollowSuggestionsBinding N0() {
        return (FragmentFollowSuggestionsBinding) this.b2.getValue(this, Z1[0]);
    }

    public final FollowSuggestionsViewModel O0() {
        return (FollowSuggestionsViewModel) this.c2.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.V(this);
        v.g1(this, O0(), FollowSuggestionsFragment$onCreate$1.c, v.q2(this, (String) null, 1, (Object) null), new FollowSuggestionsFragment$onCreate$2(this, (m0.l.c<? super FollowSuggestionsFragment$onCreate$2>) null), new FollowSuggestionsFragment$onCreate$3(this, (m0.l.c<? super FollowSuggestionsFragment$onCreate$3>) null));
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new FollowSuggestionsFragment$onViewCreated$1(this, (m0.l.c<? super FollowSuggestionsFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        N0().c.setController(this.d2);
        Button button = N0().b;
        i.d(button, "binding.continueButton");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner2), new r(this));
        N0().e.setOnClickListener(new s(this));
        PagingItemController pagingItemController = this.d2;
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = N0().c;
        i.d(impressionTrackingEpoxyRecyclerView, "binding.followSuggestions");
        v.T1(pagingItemController, impressionTrackingEpoxyRecyclerView);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(v.f1(this.d2), new FollowSuggestionsFragment$onViewCreated$4(this, (m0.l.c<? super FollowSuggestionsFragment$onViewCreated$4>) null));
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner3));
    }
}
