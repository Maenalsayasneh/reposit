package com.clubhouse.android.ui.clubs;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.core.ui.WrappedBottomSheetArgs;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.databinding.FragmentClubBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.events.HalfEventArgs;
import com.clubhouse.android.ui.profile.ProfilePhotoArgs;
import com.clubhouse.android.ui.profile.ProfilePhotoFragment;
import com.clubhouse.app.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import h0.t.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.b3.b.e.f;
import i0.e.b.g3.l.l1;
import i0.e.b.g3.l.m2;
import i0.e.b.g3.l.o1;
import i0.e.b.g3.l.t2;
import i0.e.b.g3.l.v1;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b7\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\b*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00060\u001fR\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001d\u00100\u001a\u00020+8B@\u0002X\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00106\u001a\u0002018@@\u0000X\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/clubhouse/android/ui/clubs/ClubFragment;", "Lcom/clubhouse/android/ui/common/PhotoCreationFragment;", "Lcom/clubhouse/android/data/models/remote/response/GetClubResponse;", "clubInfo", "", "W0", "(Lcom/clubhouse/android/data/models/remote/response/GetClubResponse;)Z", "isAdmin", "", "photoUrl", "Lm0/i;", "V0", "(ZLjava/lang/String;)V", "reason", "U0", "(Lcom/clubhouse/android/data/models/remote/response/GetClubResponse;Ljava/lang/String;)V", "Lcom/clubhouse/android/data/models/local/club/Club;", "X0", "(Lcom/clubhouse/android/data/models/local/club/Club;)Ljava/lang/String;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Landroid/net/Uri;", "uri", "M0", "(Landroid/net/Uri;)V", "Lcom/clubhouse/android/ui/clubs/ClubFragment$ClubMemberItemController;", "i2", "Lcom/clubhouse/android/ui/clubs/ClubFragment$ClubMemberItemController;", "pagedController", "Li0/e/a/b/a;", "f2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Lcom/clubhouse/android/databinding/FragmentClubBinding;", "g2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "S0", "()Lcom/clubhouse/android/databinding/FragmentClubBinding;", "binding", "Lcom/clubhouse/android/ui/clubs/ClubViewModel;", "h2", "Lm0/c;", "T0", "()Lcom/clubhouse/android/ui/clubs/ClubViewModel;", "viewModel", "<init>", "ClubMemberItemController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ClubFragment.kt */
public final class ClubFragment extends Hilt_ClubFragment {
    public static final /* synthetic */ k<Object>[] e2 = {m.c(new PropertyReference1Impl(m.a(ClubFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentClubBinding;")), m.c(new PropertyReference1Impl(m.a(ClubFragment.class), "viewModel", "getViewModel$app_productionRelease()Lcom/clubhouse/android/ui/clubs/ClubViewModel;"))};
    public i0.e.a.b.a f2;
    public final FragmentViewBindingDelegate g2 = new FragmentViewBindingDelegate(FragmentClubBinding.class, this);
    public final c h2;
    public final ClubMemberItemController i2;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<Boolean, i> {
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
                ((Boolean) obj).booleanValue();
                v.v2(((ClubFragment) this.d).T0(), new ClubFragment$onViewCreated$10$1((ClubFragment) this.d));
                return i.a;
            } else if (i == 1) {
                ((Boolean) obj).booleanValue();
                ((ClubFragment) this.d).T0().p(m2.a);
                return i.a;
            } else if (i == 2) {
                ((Boolean) obj).booleanValue();
                v.v2(((ClubFragment) this.d).T0(), new ClubFragment$onViewCreated$9$1((ClubFragment) this.d));
                return i.a;
            } else {
                throw null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/clubhouse/android/ui/clubs/ClubFragment$ClubMemberItemController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/f;", "", "Li0/b/a/t;", "models", "Lm0/i;", "addModels", "(Ljava/util/List;)V", "", "currentPosition", "item", "buildItemModel", "(ILi0/e/b/b3/b/e/f;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/clubs/ClubFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ClubFragment.kt */
    public final class ClubMemberItemController extends PagingDataEpoxyController<f> {
        public final /* synthetic */ ClubFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClubMemberItemController(ClubFragment clubFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (m0.n.b.f) null);
            m0.n.b.i.e(clubFragment, "this$0");
            this.this$0 = clubFragment;
        }

        public void addModels(List<? extends t<?>> list) {
            m0.n.b.i.e(list, "models");
            if (this.this$0.getView() != null) {
                ClubFragment clubFragment = this.this$0;
                k<Object>[] kVarArr = ClubFragment.e2;
                v.v2(clubFragment.T0(), new ClubFragment$buildHeaderModels$1(clubFragment, this));
            }
            super.addModels(list);
        }

        public t<?> buildItemModel(int i, f fVar) {
            if (fVar != null) {
                Object v2 = v.v2(this.this$0.T0(), new ClubFragment$ClubMemberItemController$buildItemModel$1(fVar, this.this$0));
                StringBuilder sb = new StringBuilder(31756);
                sb.append("@AndroidEntryPoint\nclass ClubFragment : PhotoCreationFragment(R.layout.fragment_club) {\n\n    @Inject\n    lateinit var actionTrailRecorder: ActionTrailRecorder\n\n    private val binding: FragmentClubBinding by viewBinding()\n    internal val viewModel: ClubViewModel by fragmentViewModel()\n\n    private val pagedController = ClubMemberItemController()\n\n    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n        super.onViewCreated(view, savedInstanceState)\n\n        viewModel.onAsync(\n            ClubViewState::clubRequest,\n            onFail = {\n                showNegativeBanner {\n                    message(getString(R.string.common_error_try_again))\n                }\n            })\n\n        viewModel.effectFlow.onEach {\n            when (it) {\n                is ShowSuccess -> showBanner { message(it.message) }\n                is ShowError -> showNegativeBanner {\n                    message(it.message ?: getString(R.string.common_error_try_again))\n                }\n                is ClubDeleted -> {\n                    showBanner { message(resources.getString(R.string.club_deleted)) }\n                    navigateUpSafe()\n                }\n            }\n        }.launchIn(viewLifecycleOwner.lifecycleScope)\n\n        getNavigationResult(ClubTopicsFragment.SELECTED_TOPICS_RESULT) { topics: List<Topic> ->\n            viewModel.processIntent(UpdateTopics(topics))\n        }\n        getNavigationResult(EditClubDescriptionFragment.DESCRIPTION) { description: String ->\n            viewModel.processIntent(UpdateClubDescription(description))\n        }\n        getNavigationResult(EditClubRulesFragment.RULES) { rules: List<ClubRule> ->\n            viewModel.processIntent(UpdateRules(rules))\n        }\n        getNavigationResult(AddEditEventFragment.EVENT_CREATE_RESULT) { event: EventInClub ->\n            navigateSafe(\n                ClubFragmentDirections.actionClubFragmentToHalfEventDialog(\n                    HalfEventArgs(eventId = event.id)\n                )\n            )\n            viewModel.processIntent(UpdateEvents)\n        }\n        getNavigationResult(AddEditEventFragment.EVENT_DELETION_RESULT) { _: Boolean ->\n            viewModel.processIntent(UpdateEvents)\n        }\n        getNavigationResult(GrowClubFragment.CLUB_UPDATE_RESULT) { _: Boolean ->\n            withState(viewModel) { state ->\n                state.clubInfo?.let {\n                    viewModel.processIntent(Refresh(it.club.id))\n                }\n            }\n        }\n        getNavigationResult(ClubMemberSearchFragment.CLUB_MEMBER_SEARCH_KEY) { _: Boolean ->\n            withState(viewModel) { state ->\n                state.clubInfo?.let {\n                    // refresh the member list to reflect any role updates from the search screen\n                    if (state.clubInfo.isAdmin) {\n                        viewModel.processIntent(GetClubMemberList(it.club.id))\n                    }\n                }\n            }\n        }\n\n        binding.back.setOnClickListener {\n            navigateUpSafe()\n        }\n\n        configurePagingController()\n    }\n\n    private fun configurePagingController() {\n        binding.club.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL , false)\n        binding.club.itemAnimator = null\n        binding.club.setController(pagedController)\n    }\n\n    override fun invalidate() {\n        withState(viewModel) { state ->\n            binding.loading.showIfWithFade(state.clubRequest is Loading)\n            binding.share.setDebouncedOnClickListener(viewLifecycleOwner.lifecycleScope) {\n                actionTrailRecorder.recordExternalShare(SHARE_TYPE_CLUB, SourceLocation.CLUB)\n                state.club?.url?.let { requireContext().openShare(it) }\n            }\n\n            if (state.clubRequest is Success\n                && state.events is Success\n                && !state.migrationUpsellType.wasShown\n            ) {\n                when (state.migrationUpsellType) {\n                    is Leaders, is MemberApproval, is MemberRoomStart -> showClubMigrationUpsell(\n                        state.migrationUpsellType,\n                        state.clubRequest.invoke().club\n                    )\n                    else -> {\n                    }\n                }\n            }\n\n            viewLifecycleOwner.lifecycleScope.launch {\n                state.clubInfo?.let {\n                    pagedController.submitData(state.clubMembershipData)\n                    pagedController.requestModelBuild()\n                }\n            }\n\n            if (state.clubInfo?.isAdmin == true) {\n                binding.bindMenuForAdmin(state.clubInfo)\n            } else if (state.clubInfo?.isLeader == true) {\n                binding.bindMenuForLeader(state.clubInfo)\n            } else {\n                binding.menuAdmin.hide()\n                binding.menuLeader.hide()\n            }\n\n            if (state.justCreated && state.club != null) {\n                navigateSafe(\n                    ClubFragmentDirections.actionClubFragmentToHalfWelcomeNewClubDialog(\n                        HalfWelcomeNewClubArgs(club = state.club)\n                    )\n                )\n                viewModel.processIntent(ClearJustCreated)\n            }\n        }\n    }\n\n    override fun onPhotoCreated(uri: Uri) {\n        viewModel.processIntent(UpdatePhoto(uri))\n    }\n\n    inner class ClubMemberItemController : PagingDataEpoxyController<ClubUserItem>() {\n\n        override fun addModels(models: List<EpoxyModel<*>>) {\n            if (view != null) {\n                buildHeaderModels()\n            }\n            super.addModels(models)\n        }\n\n        override fun buildItemModel(currentPosition: Int, item: ClubUserItem?): EpoxyModel<*> {\n            requireNotNull(item)\n\n            return withState(viewModel) { state ->\n                ClubMember_()\n                    .id(item.user.id)\n                    .user(item.user)\n                    .userBio(item.user.bio)\n                    .following(item.followedBySelf)\n                    .showFollowButton(!item.isSelf && !item.blockedBySelf && !state.isAdmin)\n                    .showDropdownButton(!item.isSelf && state.isAdmin)\n                    .clickListener { _ -> showProfileFragment(item.user) }\n                    .followClickListener { _ ->\n                        viewModel.processIntent(ToggleFollowUser(item.user.id))\n                    }\n                    .clubRole(\n                        when {\n                            item.user.isAdmin -> ClubRole.ADMIN\n                            item.user.isLeader -> ClubRole.LEADER\n                            else -> ClubRole.MEMBER\n                        }\n                    )\n                    .clubRoleSelectionListener { role ->\n                        viewModel.processIntent(UpdateClubRole(item.user, role))\n                    }\n                    .removeMemberSelectionListener {\n                        viewModel.processIntent(RemoveFromClub(item.user))\n                    }\n            }\n        }\n    }\n\n    private fun EpoxyController.buildHeaderModels() {\n        withState(viewModel) { state ->\n            val events = state.events.invoke()?.events\n            state.clubInfo?.let { clubInfo ->\n                when {\n                    clubInfo.isAdmin -> {\n                        buildHeaderModelForAdmin(clubInfo, events)\n                    }\n                    clubInfo.isLeader -> {\n                        buildHeaderModelForLeader(clubInfo, events)\n                    }\n                    clubInfo.isMember -> {\n                        buildHeaderModelForMember(clubInfo, events)\n                    }\n                    else -> {\n                        buildHeaderModelForStranger(clubInfo, events)\n                    }\n                }\n            }\n        }\n    }\n\n    private fun EpoxyController.buildHeaderModelForAdmin(clubInfo: GetClubResponse, events: List<EventInClub>? = null) {\n        val club = clubInfo.club\n        clubHeader {\n            id(club.id)\n            photoUrl(club.photoUrl)\n            photoClickListener { _ -> handlePhotoClick(true, club.photoUrl) }\n            name(club.name)\n            memberCount(club.memberCount())\n            showRules(club.rules.isNotEmpty())\n            rulesClickListener { _ -> showHalfClubRules(club) }\n        }\n        clubActionButtons {\n            id(\"ClubActionButtons\" + club.id)\n            clubStatus(ClubActionButtons.ClubStatus.ADMIN)\n            numPendingNominations(clubInfo.numPendingNominations)\n            scheduleRoomClickListener { _ -> showAddEditEvent(clubInfo) }\n            addMembersClickListener { _ -> withState(viewModel) { showGrowClub(club.id, GrowClubMethod.INVITE) } }\n        }\n        if (!events.isNullOrEmpty() || isEmptyStateAllowed(clubInfo)) {\n            clubEvents {\n                id(\"ClubEvents\" + club.id)\n                events(events)\n                allowEmptyState(isEmptyStateAllowed(clubInfo))\n                eventMenuClickListener { event -> showOverflowMenu(event) }\n                eventClickListener { event -> showHalfEvent(event) }\n            }\n        }\n        if (!club.description.isNullOrEmpty()) {\n            clubDescription {\n                id(\"Description\" + club.id)\n                description(club.description)\n            }\n        }\n        if (!clubInfo.topics.isNullOrEmpty()) {\n            clubTopics {\n                id(\"Topics\" + club.id)\n                topics(clubInfo.topics)\n            }\n        }\n        clubMemberSearchBar {\n            id(\"Search Bar\" + club.id)\n            searchClickListener { _ ->\n                navigateToMemberSearch()\n            }\n        }\n    }\n\n    private fun EpoxyController.buildHeaderModelForLeader(\n        clubInfo: GetClubResponse,\n        events: List<EventInClub>? = null\n    ) {\n        val club = clubInfo.club\n        clubHeader {\n            id(club.id)\n            photoUrl(club.photoUrl)\n            photoClickListener { _ -> handlePhotoClick(false, club.photoUrl) }\n            name(club.name)\n            memberCount(club.memberCount())\n            showRules(club.rules.isNotEmpty())\n            rulesClickListener { _ -> showHalfClubRules(club) }\n        }\n        clubActionButtons {\n            id(\"ClubActionButtons\" + club.id)\n            clubStatus(ClubActionButtons.ClubStatus.LEADER)\n            askToJoinEnabled(club.isAskToJoinAllowed)\n            membershipOpen(club.isMembershipOpen)\n            scheduleRoomClickListener { _ -> showAddEditEvent(clubInfo) }\n            nominateMembersClickListener { _ ->\n                showGrowClub(club.id, GrowClubMethod.NOMINATION)\n            }\n            memberClickListener { _ ->\n                actionSheet {\n                    if (!club.rules.isNullOrEmpty()) {\n                        action {\n                            text = getString(R.string.view_rules)\n                            action = { showHalfClubRules(club) }\n                        }\n                    }\n                    action {\n                        text = getString(R.string.leave_club)\n                        action = {\n                            alertDialog {\n                                setTitle(R.string.leave_the_club)\n                                setMessage(R.string.leave_club_message_member)\n                                setPositiveButton(R.string.leave) { _, _ ->\n                                    viewModel.processIntent(LeaveClubForSelf)\n                                }\n                                setNegativeButton(R.string.never_mind) { dialog, _ ->\n                                    dialog.cancel()\n                                }\n                            }\n                        }\n                    }\n                }\n            }\n            inviteMembersClickListener { _ ->\n                showGrowClub(club.id, GrowClubMethod.INVITE)\n            }\n        }\n        if (!events.isNullOrEmpty() || isEmptyStateAllowed(clubInfo)) {\n            clubEvents {\n                id(\"ClubEvents\" + club.id)\n                events(events)\n                allowEmptyState(isEmptyStateAllowed(clubInfo))\n                eventMenuClickListener { event -> showOverflowMenu(event) }\n                eventClickListener { event -> showHalfEvent(event) }\n            }\n        }\n        if (!club.description.isNullOrEmpty()) {\n            clubDescription {\n                id(\"Description\" + club.id)\n                description(club.description)\n            }\n        }\n        if (!clubInfo.topics.isNullOrEmpty()) {\n            clubTopics {\n                id(\"Topics\" + club.id)\n                topics(clubInfo.topics)\n            }\n        }\n        clubMemberSearchBar {\n            id(\"Search Bar\" + club.id)\n            searchClickListener { _ ->\n                navigateToMemberSearch()\n            }\n        }\n    }\n\n    private fun EpoxyController.buildHeaderModelForMember(clubInfo: GetClubResponse, events: List<EventInClub>? = null) {\n        val club = clubInfo.club\n        clubHeader {\n            id(club.id)\n            photoUrl(club.photoUrl)\n            photoClickListener { _ -> handlePhotoClick(false, club.photoUrl) }\n            name(club.name)\n            memberCount(club.memberCount())\n            showRules(club.rules.isNotEmpty())\n            rulesClickListener { _ -> showHalfClubRules(club) }\n        }\n        clubActionButtons {\n            id(\"ClubActionButtons\" + club.id)\n            clubStatus(ClubActionButtons.ClubStatus.MEMBER)\n            askToJoinEnabled(club.isAskToJoinAllowed)\n            membershipOpen(club.isMembershipOpen)\n            nominateMembersClickListener { _ ->\n                showGrowClub(club.id, GrowClubMethod.NOMINATION)\n            }\n            memberClickListener { _ ->\n                actionSheet {\n                    if (!club.rules.isNullOrEmpty()) {\n                        action {\n                            text = getString(R.string.view_rules)\n                            action = { showHalfClubRules(club) }\n                        }\n                    }\n                    action {\n                        text = getString(R.string.leave_club)\n                        action = {\n                            alertDialog {\n                                setTitle(R.string.leave_the_club)\n                                setMessage(\n                                    if (club.isMembershipOpen) {\n                                        R.string.leave_club_message_member_open_membership\n                                    } else {\n                                        R.string.leave_club_message_member\n                                    }\n                                )\n                                setPositiveButton(R.string.leave) { _, _ ->\n                                    viewModel.processIntent(LeaveClubForSelf)\n                                }\n                                setNegativeButton(R.string.never_mind) { dialog, _ ->\n                                    dialog.cancel()\n                                }\n                            }\n                        }\n                    }\n                }\n            }\n            inviteMembersClickListener { _ ->\n                showGrowClub(club.id, GrowClubMethod.INVITE)\n            }\n        }\n        if (!events.isNullOrEmpty() || isEmptyStateAllowed(clubInfo)) {\n            clubEvents {\n                id(\"ClubEvents\" + club.id)\n                events(events)\n                allowEmptyState(isEmptyStateAllowed(clubInfo))\n                eventClickListener { event -> showHalfEvent(event) }\n            }\n        }\n        if (!club.description.isNullOrEmpty()) {\n            clubDescription {\n                id(\"Description\" + club.id)\n                description(club.description)\n            }\n        }\n        if (!clubInfo.topics.isNullOrEmpty()) {\n            clubTopics {\n                id(\"Topics\" + club.id)\n                topics(clubInfo.topics)\n            }\n        }\n    }\n\n    private fun EpoxyController.buildHeaderModelForStranger(clubInfo: GetClubResponse, events: List<EventInClub>? = null) {\n        val club = clubInfo.club\n        clubHeader {\n            id(club.id)\n            photoUrl(club.photoUrl)\n            photoClickListener { _ -> handlePhotoClick(false, club.photoUrl) }\n            memberCount(club.memberCount())\n            showRules(club.rules.isN");
                sb.append("otEmpty())\n            rulesClickListener { _ -> showHalfClubRules(club) }\n            name(club.name)\n        }\n        clubActionButtons {\n            id(\"ClubActionButtons\" + club.id)\n            clubStatus(ClubActionButtons.ClubStatus.STRANGER)\n            inviter(clubInfo.addByUser)\n            invited(clubInfo.isPendingAccept)\n            membershipOpen(clubInfo.club.isMembershipOpen)\n            askToJoinEnabled(clubInfo.club.isAskToJoinAllowed)\n            pendingApproval(clubInfo.isPendingApproval)\n            applyToJoinClickListener { _ ->\n                if (clubInfo.isPendingApproval) {\n                    actionSheet {\n                        action {\n                            text = getString(R.string.take_back_application_to_join)\n                            action = { viewModel.processIntent(RevokeApplication(club.id)) }\n                        }\n                    }\n                } else {\n                    showNominationReasonDialog(\n                        this@ClubFragment,\n                        requireContext(),\n                        getString(R.string.you),\n                        club.name,\n                        { handleClubRulesOnJoin(clubInfo, it) },\n                        { handleClubRulesOnJoin(clubInfo) })\n                }\n            }\n            joinClickListener { _ -> handleClubRulesOnJoin(clubInfo) }\n            acceptInviteClickListener { _ -> handleClubRulesOnAccept(clubInfo) }\n        }\n        if (!events.isNullOrEmpty() || isEmptyStateAllowed(clubInfo)) {\n            clubEvents {\n                id(\"ClubEvents\" + club.id)\n                events(events)\n                allowEmptyState(isEmptyStateAllowed(clubInfo))\n                eventClickListener { event -> showHalfEvent(event) }\n            }\n        }\n        if (!club.description.isNullOrEmpty()) {\n            clubDescription {\n                id(\"Description\" + club.id)\n                description(club.description)\n            }\n        }\n        if (!clubInfo.topics.isNullOrEmpty()) {\n            clubTopics {\n                id(\"Topics\" + club.id)\n                topics(clubInfo.topics)\n            }\n        }\n    }\n\n    private fun isEmptyStateAllowed(clubInfo: GetClubResponse?) =\n        clubInfo?.isAdmin ?: false || clubInfo?.isLeader ?: false || (clubInfo?.isMember ?: false && clubInfo?.club?.isCommunity ?: false)\n\n    private fun showOverflowMenu(event: EventInClub) {\n        actionSheet {\n            title = event.name\n            action {\n                text = getString(R.string.delete_event)\n                action = {\n                    viewModel.processIntent(DeleteEvent(event))\n                }\n            }\n        }\n    }\n\n    private fun showHalfEvent(event: EventInClub) {\n        navigateSafe(\n            ClubFragmentDirections.actionClubFragmentToHalfEventDialog(\n                HalfEventArgs(event = event)\n            )\n        )\n    }\n\n    private fun handlePhotoClick(isAdmin: Boolean, photoUrl: String?) {\n        photoUrl?.let {\n            if (isAdmin) {\n                actionSheet {\n                    action {\n                        text = getString(R.string.change_photo)\n                        action = { promptToAddImage() }\n                    }\n                    action {\n                        text = getString(R.string.view_photo)\n                        action = { showClubPhoto(it) }\n                    }\n                }\n            } else {\n                showClubPhoto(it)\n            }\n        } ?: run {\n            if (isAdmin) {\n                promptToAddImage()\n            }\n        }\n    }\n\n    private fun handleClubRulesOnJoin(clubInfo: GetClubResponse, reason: String? = \"\") {\n        val club = clubInfo.club\n        if (club.rules.isNullOrEmpty()) {\n            withState(viewModel) {\n                viewModel.processIntent(\n                    JoinClub(reason, it.args?.source ?: SourceLocation.UNKNOWN))\n\n            }\n        } else {\n            getNavigationResult(HalfClubRulesFragment.CLUB_RULES_SHOWN) { clubRulesAccepted: Boolean ->\n                if (clubRulesAccepted) {\n                    viewModel.processIntent(Refresh(club.id))\n                }\n            }\n            showHalfClubRules(club, true, reason)\n        }\n    }\n\n    private fun handleClubRulesOnAccept(clubInfo: GetClubResponse) {\n        val club = clubInfo.club\n        if (club.rules.isNullOrEmpty()) {\n            viewModel.processIntent(AcceptClubInvite(clubInfo.club.id))\n        } else {\n            getNavigationResult(HalfClubRulesFragment.CLUB_RULES_SHOWN) { clubRulesAccepted: Boolean ->\n                if (clubRulesAccepted) {\n                    viewModel.processIntent(Refresh(club.id))\n                }\n            }\n            showHalfClubRules(club, clubInfo.isPendingAccept)\n        }\n    }\n\n    private fun FragmentClubBinding.bindMenuForAdmin(clubInfo: GetClubResponse) {\n        val club = clubInfo.club\n        menuAdmin.show()\n        menuAdmin.setOnClickListener {\n            popUpMenu(it) {\n                inflate(R.menu.menu_club_admin)\n                menu.findItem(R.id.edit_topics)\n                    .setTitle(\n                        if (clubInfo.topics.isNullOrEmpty()) {\n                            getString(R.string.add_club_topics)\n                        } else {\n                            getString(R.string.edit_club_topics)\n                        })\n                menu.findItem(R.id.edit_rules)\n                    .setTitle(\n                        if (club.rules.isNullOrEmpty()) {\n                            getString(R.string.add_club_rules)\n                        } else {\n                            getString(R.string.edit_club_rules)\n                        })\n                menu.findItem(R.id.membership_setting)\n                    .setTitle(\n                        if (club.isMembershipOpen) {\n                            getString(R.string.membership_approval_only)\n                        } else {\n                            getString(R.string.membership_open_to_all)\n                        }\n                    )\n                menu.findItem(R.id.apply_to_join_setting)\n                    .setVisible(!club.isMembershipOpen)\n                    .setTitle(\n                        if (club.isAskToJoinAllowed) {\n                            getString(R.string.stop_letting_people_apply_to_join)\n                        } else {\n                            getString(R.string.start_letting_people_apply_to_join)\n                        }\n                    )\n                menu.findItem(R.id.host_room_setting)\n                    .setTitle(\n                        if (club.isCommunity) {\n                            getString(R.string.limit_hosting_to_leaders_admin)\n                        } else {\n                            getString(R.string.let_all_members_host_rooms)\n                        })\n                menu.findItem(R.id.member_list_setting)\n                    .setTitle(\n                        if (club.isMembershipPrivate) {\n                            getString(R.string.show_member_list)\n                        } else {\n                            getString(R.string.hide_member_list)\n                        })\n                if (clubInfo.canDeleteClub) {\n                    menu.findItem(R.id.delete_club).show()\n                }\n                setOnMenuItemClickListener { item ->\n                    when (item.itemId) {\n                        R.id.edit_topics -> {\n                            showEditTopics(club, clubInfo.topics)\n                            true\n                        }\n                        R.id.edit_rules -> {\n                            showEditRules(club.name, club.rules)\n                            true\n                        }\n                        R.id.edit_description -> {\n                            showEditDescription(club.name, club.description)\n                            true\n                        }\n                        R.id.membership_setting -> {\n                            showUpdateMembershipSetting()\n                            true\n                        }\n                        R.id.apply_to_join_setting -> {\n                            viewModel.processIntent(UpdateIsAskToJoinAllowed(!club.isAskToJoinAllowed))\n                            true\n                        }\n                        R.id.host_room_setting -> {\n                            val clubCommunitySetting = !club.isCommunity\n                            viewModel.processIntent(UpdateLetMemberStartRoom(club.id, clubCommunitySetting))\n                            true\n                        }\n                        R.id.member_list_setting -> {\n                            val membershipPrivateSetting = !club.isMembershipPrivate\n                            viewModel.processIntent(UpdateMemberPrivacy(club.id, membershipPrivateSetting))\n                            true\n                        }\n                        R.id.leave_club -> {\n                            alertDialog {\n                                setTitle(R.string.leave_the_club)\n                                setMessage(\n                                    if (club.isMembershipOpen) {\n                                        R.string.leave_club_message_admin_open_membership\n                                    } else {\n                                        R.string.leave_club_message_admin\n                                    }\n                                )\n                                setPositiveButton(R.string.leave) { _, _ ->\n                                    viewModel.processIntent(LeaveClubForSelf)\n                                }\n                                setNegativeButton(R.string.never_mind) { dialog, _ ->\n                                    dialog.cancel()\n                                }\n                            }\n                            true\n                        }\n                        R.id.delete_club -> {\n                            alertDialog {\n                                setTitle(R.string.delete_club)\n                                setMessage(R.string.delete_club_message)\n                                setPositiveButton(R.string.delete) { _, _ ->\n                                    viewModel.processIntent(DeleteClub)\n                                }\n                                setNegativeButton(R.string.cancel) { dialog, _ ->\n                                    dialog.cancel()\n                                }\n                            }\n                            true\n                        }\n                        else -> false\n                    }\n                }\n            }\n        }\n    }\n\n    private fun FragmentClubBinding.bindMenuForLeader(clubInfo: GetClubResponse) {\n        val club = clubInfo.club\n        menuLeader.show()\n        menuLeader.setOnClickListener {\n            popUpMenu(it) {\n                inflate(R.menu.menu_club_leader)\n                setOnMenuItemClickListener { item ->\n                    when (item.itemId) {\n                        R.id.leave_club -> {\n                            alertDialog {\n                                setTitle(R.string.leave_the_club)\n                                setMessage(\n                                    if (club.isMembershipOpen) {\n                                        R.string.leave_club_message_leader_open_membership\n                                    } else {\n                                        R.string.leave_club_message_leader\n                                    }\n                                )\n                                setPositiveButton(R.string.leave) { _, _ ->\n                                    viewModel.processIntent(LeaveClubForSelf)\n                                }\n                                setNegativeButton(R.string.never_mind) { dialog, _ ->\n                                    dialog.cancel()\n                                }\n                            }\n                            true\n                        }\n                        else -> false\n                    }\n                }\n            }\n        }\n    }\n\n    private fun navigateToMemberSearch() {\n        withState(viewModel) { state ->\n            requireNotNull(state.clubId)\n            requireNotNull(state.clubInfo)\n\n            navigateSafe(\n                ClubFragmentDirections.actionClubFragmentToClubMemberSearchFragment(\n                    ClubMemberSearchArgs(\n                        clubId = state.clubId,\n                        isAdmin = state.clubInfo.isAdmin,\n                        isLeader = state.clubInfo.isLeader\n                    )\n                )\n            )\n        }\n    }\n\n    private fun showClubMigrationUpsell(upsellType: UpsellType, club: ClubWithAdmin) {\n        val upsellView = layoutInflater.inflate(R.layout.club_migration_upsell, null)\n        val upsellBinding = ClubMigrationUpsellBinding.bind(upsellView)\n\n        upsellBinding.title.text = upsellType.title(resources)\n        upsellBinding.body.text = upsellType.body(resources)\n        upsellBinding.noButton.text = upsellType.noButtonText(resources)\n        upsellBinding.yesButton.text = upsellType.yesButtonText(resources)\n        upsellBinding.noButton.showIf(upsellType.showNoButton())\n        upsellBinding.faqButton.showIf(upsellType.showFAQButton())\n\n        val alertDialog =\n            AlertDialog.Builder(requireContext(), R.style.Clubhouse_AlertDialog_Rounded).apply {\n                setView(upsellView)\n                setCancelable(false)\n            }.create()\n        alertDialog.window?.setDimAmount(.05f)\n\n        upsellBinding.yesButton.setOnClickListener {\n            val nextUpsellType = upsellType.nextUpsell(club)\n            if (upsellType is MemberApproval && !upsellType.readOnly) {\n                // let anyone join as member\n                viewModel.processIntent(ClubMigrationOpenMembership)\n            }\n            if (upsellType is MemberRoomStart) {\n                // allow members to start rooms\n                viewModel.processIntent(UpdateLetMemberStartRoom(club.id, true))\n            }\n            viewModel.processIntent(UpdateMigrationUpsellType(nextUpsellType))\n            alertDialog.dismiss()\n        }\n\n        upsellBinding.noButton.setOnClickListener {\n            val nextUpsellType = upsellType.nextUpsell(club)\n            if (upsellType is MemberApproval && !upsellType.readOnly) {\n                showBanner {\n                    message(R.string.upsell_type_member_approval_no_success)\n                }\n                alertDialog.dismiss()\n                return@setOnClickListener\n            } else if (upsellType is MemberRoomStart) {\n                showBanner {\n                    message(R.string.dont_let_members_start_rooms_setting)\n                }\n            }\n            viewModel.processIntent(UpdateMigrationUpsellType(nextUpsellType))\n            alertDialog.dismiss()\n        }\n\n        upsellBinding.faqButton.setOnClickListener {\n            openBrowserUrl(getString(R.string.clubhouse_club_migration_faq))\n        }\n\n        viewModel.processIntent(UpdateMigrationUpsellShown(upsellType))\n        alertDialog.show()\n    }\n\n    private fun Club.memberCount(): String =\n        resources.getQuantityString(R.plurals.num_members, numMembers, numMembers.stringForValue())\n}");
                m0.n.b.i.d(v2, sb.toString());
                return (t) v2;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<ClubFragment, ClubViewModel> {
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
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new ClubFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(v1.class), false, this.b);
        }
    }

    public ClubFragment() {
        super(R.layout.fragment_club);
        d a2 = m.a(ClubViewModel.class);
        this.h2 = new b(a2, false, new ClubFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, e2[1]);
        this.i2 = new ClubMemberItemController(this);
    }

    public static final void R0(ClubFragment clubFragment, EventInClub eventInClub) {
        Objects.requireNonNull(clubFragment);
        HalfEventArgs halfEventArgs = new HalfEventArgs((String) null, (Integer) null, (String) null, (String) null, eventInClub, (SourceLocation) null, (Map) null, 111);
        m0.n.b.i.e(halfEventArgs, "mavericksArg");
        v.a1(clubFragment, new l1(halfEventArgs), (q) null, 2);
    }

    public void J() {
        v.v2(T0(), new ClubFragment$invalidate$1(this));
    }

    public void M0(Uri uri) {
        m0.n.b.i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        T0().p(new t2(uri));
    }

    public final FragmentClubBinding S0() {
        return (FragmentClubBinding) this.g2.getValue(this, e2[0]);
    }

    public final ClubViewModel T0() {
        return (ClubViewModel) this.h2.getValue();
    }

    public final void U0(GetClubResponse getClubResponse, String str) {
        ClubWithAdmin clubWithAdmin = getClubResponse.c;
        List<ClubRule> list = clubWithAdmin.a2;
        if (list == null || list.isEmpty()) {
            v.v2(T0(), new ClubFragment$handleClubRulesOnJoin$1(this, str));
            return;
        }
        Objects.requireNonNull(HalfClubRulesFragment.p2);
        v.p0(this, HalfClubRulesFragment.r2, new ClubFragment$handleClubRulesOnJoin$2(this, clubWithAdmin));
        Boolean bool = Boolean.TRUE;
        m0.n.b.i.e(this, "<this>");
        m0.n.b.i.e(clubWithAdmin, "club");
        HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(clubWithAdmin, bool, str, SourceLocation.CLUB, (Map) null, 16);
        i0.d.a.a.a.m(halfClubRulesArgs, "mavericksArg", halfClubRulesArgs, this, (q) null, 2);
    }

    public final void V0(boolean z, String str) {
        i iVar = null;
        if (str != null) {
            if (z) {
                v.e(this, new ClubFragment$handlePhotoClick$1$1(this, str));
            } else {
                m0.n.b.i.e(this, "<this>");
                m0.n.b.i.e(str, "photoUrl");
                ProfilePhotoArgs profilePhotoArgs = new ProfilePhotoArgs(str, 0.88f);
                m0.n.b.i.e(profilePhotoArgs, "arg");
                Bundle bundle = new Bundle();
                bundle.putParcelable("mavericks:arg", profilePhotoArgs);
                WrappedBottomSheetArgs wrappedBottomSheetArgs = new WrappedBottomSheetArgs(ProfilePhotoFragment.class, bundle);
                m0.n.b.i.e(wrappedBottomSheetArgs, "mavericksArg");
                v.a1(this, new o1(wrappedBottomSheetArgs), (q) null, 2);
            }
            iVar = i.a;
        }
        if (iVar == null && z) {
            N0();
        }
    }

    public final boolean W0(GetClubResponse getClubResponse) {
        boolean z;
        if (!getClubResponse.d && !getClubResponse.x) {
            if (!getClubResponse.q) {
                return false;
            }
            ClubWithAdmin clubWithAdmin = getClubResponse.c;
            if (clubWithAdmin == null) {
                z = false;
            } else {
                z = clubWithAdmin.e2;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final String X0(Club club) {
        Resources resources = getResources();
        int i = ((ClubWithAdmin) club).b2;
        String quantityString = resources.getQuantityString(R.plurals.num_members, i, new Object[]{i0.e.b.f3.d.a(i)});
        m0.n.b.i.d(quantityString, "resources.getQuantityString(R.plurals.num_members, numMembers, numMembers.stringForValue())");
        return quantityString;
    }

    public void onViewCreated(View view, Bundle bundle) {
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.h1(this, T0(), ClubFragment$onViewCreated$1.c, (DeliveryMode) null, new ClubFragment$onViewCreated$2(this, (m0.l.c<? super ClubFragment$onViewCreated$2>) null), (p) null, 10, (Object) null);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(T0().l, new ClubFragment$onViewCreated$3(this, (m0.l.c<? super ClubFragment$onViewCreated$3>) null));
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        v.p0(this, "selected_topics_result", new ClubFragment$onViewCreated$4(this));
        v.p0(this, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, new ClubFragment$onViewCreated$5(this));
        v.p0(this, "club_rules", new ClubFragment$onViewCreated$6(this));
        v.p0(this, "event_create_result", new ClubFragment$onViewCreated$7(this));
        v.p0(this, "event_deletion_result", new a(1, this));
        v.p0(this, "club_update_result", new a(2, this));
        Objects.requireNonNull(ClubMemberSearchFragment.Z1);
        v.p0(this, ClubMemberSearchFragment.b2, new a(0, this));
        S0().a.setOnClickListener(new i0.e.b.g3.l.k(this));
        S0().b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        S0().b.setItemAnimator((RecyclerView.k) null);
        S0().b.setController(this.i2);
    }
}
