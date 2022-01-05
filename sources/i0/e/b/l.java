package i0.e.b;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.analytics.actiontrails.ActionTrailUploader;
import com.clubhouse.android.channels.ChannelBroadcastReceiver;
import com.clubhouse.android.channels.ChannelComponentHandler;
import com.clubhouse.android.channels.ChannelService;
import com.clubhouse.android.channels.di.ChannelProviders$provideCoroutineScope$1$1;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.channels.repos.SpeakerStateDataSource;
import com.clubhouse.android.channels.rtc.RtcWrapper;
import com.clubhouse.android.core.oauth.OAuthAuthentication;
import com.clubhouse.android.core.storage.Store;
import com.clubhouse.android.core.ui.WrappedBottomSheetFragment;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.error.ErrorResponse;
import com.clubhouse.android.data.network.BuddyListDataSource;
import com.clubhouse.android.data.network.FeedDataSource;
import com.clubhouse.android.data.network.MeDataSource;
import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.data.network.UserProfileDataSource;
import com.clubhouse.android.data.repos.ActivityRepo;
import com.clubhouse.android.data.repos.ChannelRepo;
import com.clubhouse.android.data.repos.InviteRepo;
import com.clubhouse.android.data.repos.LanguageRepo;
import com.clubhouse.android.data.repos.NotificationRepo;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.data.repos.PaymentsRepo;
import com.clubhouse.android.data.repos.PhoneContactsRepo;
import com.clubhouse.android.data.repos.TopicRepo;
import com.clubhouse.android.data.repos.UpdatesRepo;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.data.safetynet.SafetyNetClient;
import com.clubhouse.android.di.ApiModule$provideJson$1;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.di.user.UserModule$provideCoroutineScope$1$1;
import com.clubhouse.android.notifications.PushListenerService;
import com.clubhouse.android.shared.FeatureFlags;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.android.shared.preferences.DeviceSharedPreferences;
import com.clubhouse.android.shared.ui.AppBannerHandler;
import com.clubhouse.android.ui.NavigationViewModel;
import com.clubhouse.android.ui.actionsheet.ActionSheetFragment;
import com.clubhouse.android.ui.activity.ActivityFragment;
import com.clubhouse.android.ui.activity.ActivityViewModel;
import com.clubhouse.android.ui.activity.overflow.ActivityOverflowFragment;
import com.clubhouse.android.ui.activity.overflow.ActivityOverflowViewModel;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.users.follow.FollowSpeakersFragment;
import com.clubhouse.android.ui.channels.users.follow.FollowSpeakersViewModel;
import com.clubhouse.android.ui.channels.users.ping.PingUserFragment;
import com.clubhouse.android.ui.channels.users.ping.PingUserViewModel;
import com.clubhouse.android.ui.channels.users.recent.RecentlyDepartedSpeakersFragment;
import com.clubhouse.android.ui.channels.users.search.SearchInRoomFragment;
import com.clubhouse.android.ui.channels.users.search.SearchInRoomViewModel;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubMemberSearchFragment;
import com.clubhouse.android.ui.clubs.ClubMemberSearchViewModel;
import com.clubhouse.android.ui.clubs.ClubViewModel;
import com.clubhouse.android.ui.clubs.HalfClubRulesFragment;
import com.clubhouse.android.ui.clubs.HalfClubRulesViewModel;
import com.clubhouse.android.ui.clubs.HalfWelcomeNewClubFragment;
import com.clubhouse.android.ui.clubs.create.CreateClubFragment;
import com.clubhouse.android.ui.clubs.create.CreateClubViewModel;
import com.clubhouse.android.ui.clubs.create.topics.ClubTopicsFragment;
import com.clubhouse.android.ui.clubs.create.topics.ClubTopicsViewModel;
import com.clubhouse.android.ui.clubs.description.EditClubDescriptionFragment;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import com.clubhouse.android.ui.clubs.invites.GrowClubViewModel;
import com.clubhouse.android.ui.clubs.nominations.ClubNominationsFragment;
import com.clubhouse.android.ui.clubs.nominations.ClubNominationsViewModel;
import com.clubhouse.android.ui.clubs.rules.EditClubRulesFragment;
import com.clubhouse.android.ui.clubs.rules.EditClubRulesViewModel;
import com.clubhouse.android.ui.common.topics.TopicsFragment;
import com.clubhouse.android.ui.common.topics.TopicsViewModel;
import com.clubhouse.android.ui.creation.ChooseUsersFragment;
import com.clubhouse.android.ui.creation.ChooseUsersViewModel;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import com.clubhouse.android.ui.creation.CreateChannelViewModel;
import com.clubhouse.android.ui.events.EventsFragment;
import com.clubhouse.android.ui.events.EventsViewModel;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.events.HalfEventViewModel;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventViewModel;
import com.clubhouse.android.ui.events.creation.EventHostClubFragment;
import com.clubhouse.android.ui.hallway.HallwayFragment;
import com.clubhouse.android.ui.hallway.HallwayViewModel;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.hallway.feed.FeedViewModel;
import com.clubhouse.android.ui.invites.InvitesFragment;
import com.clubhouse.android.ui.invites.InvitesViewModel;
import com.clubhouse.android.ui.invites.PendingInvitesFragment;
import com.clubhouse.android.ui.onboarding.AddPhotoFragment;
import com.clubhouse.android.ui.onboarding.CollectNameFragment;
import com.clubhouse.android.ui.onboarding.CollectNameViewModel;
import com.clubhouse.android.ui.onboarding.CollectPhoneNumberFragment;
import com.clubhouse.android.ui.onboarding.CollectPhoneNumberViewModel;
import com.clubhouse.android.ui.onboarding.CollectUsernameFragment;
import com.clubhouse.android.ui.onboarding.CollectUsernameViewModel;
import com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment;
import com.clubhouse.android.ui.onboarding.ConnectSocialAccountsFragment;
import com.clubhouse.android.ui.onboarding.ContactsPermissionFragment;
import com.clubhouse.android.ui.onboarding.FollowFriendsFragment;
import com.clubhouse.android.ui.onboarding.FollowFriendsViewModel;
import com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment;
import com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel;
import com.clubhouse.android.ui.onboarding.InvitedByFragment;
import com.clubhouse.android.ui.onboarding.ValidateNumberFragment;
import com.clubhouse.android.ui.onboarding.ValidateNumberViewModel;
import com.clubhouse.android.ui.onboarding.ValidateNumberWithCallFragment;
import com.clubhouse.android.ui.onboarding.ValidateNumberWithCallViewModel;
import com.clubhouse.android.ui.onboarding.WaitlistFragment;
import com.clubhouse.android.ui.onboarding.WaitlistViewModel;
import com.clubhouse.android.ui.onboarding.WelcomeFragment;
import com.clubhouse.android.ui.onboarding.WelcomeRoomFragment;
import com.clubhouse.android.ui.onboarding.WelcomeRoomViewModel;
import com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsFragment;
import com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsViewModel;
import com.clubhouse.android.ui.onboarding.topics.OnboardingTopicsFragment;
import com.clubhouse.android.ui.onboarding.topics.OnboardingTopicsViewModel;
import com.clubhouse.android.ui.payments.AcknowledgePaymentFragment;
import com.clubhouse.android.ui.payments.PaymentsRegistrationFragment;
import com.clubhouse.android.ui.payments.PaymentsRegistrationViewModel;
import com.clubhouse.android.ui.payments.RecentPaymentsFragment;
import com.clubhouse.android.ui.payments.RecentPaymentsViewModel;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment;
import com.clubhouse.android.ui.payments.SendDirectPaymentViewModel;
import com.clubhouse.android.ui.profile.EditBioFragment;
import com.clubhouse.android.ui.profile.EditBioViewModel;
import com.clubhouse.android.ui.profile.EditNameFragment;
import com.clubhouse.android.ui.profile.EditPhotoFragment;
import com.clubhouse.android.ui.profile.EditPhotoViewModel;
import com.clubhouse.android.ui.profile.EditUsernameFragment;
import com.clubhouse.android.ui.profile.FollowListFragment;
import com.clubhouse.android.ui.profile.FollowListViewModel;
import com.clubhouse.android.ui.profile.HalfProfileContainerFragment;
import com.clubhouse.android.ui.profile.HalfProfileContainerViewModel;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.HalfProfileViewModel;
import com.clubhouse.android.ui.profile.ProfileFragment;
import com.clubhouse.android.ui.profile.ProfilePhotoFragment;
import com.clubhouse.android.ui.profile.ProfileViewModel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsViewModel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryContainerFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryContainerViewModel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectSubCategoryFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentThanksFragment;
import com.clubhouse.android.ui.profile.reports.ReportProfileFragment;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyViewModel;
import com.clubhouse.android.ui.profile.settings.AccountFragment;
import com.clubhouse.android.ui.profile.settings.AccountViewModel;
import com.clubhouse.android.ui.profile.settings.DeactivateFragment;
import com.clubhouse.android.ui.profile.settings.DeactivateViewModel;
import com.clubhouse.android.ui.profile.settings.EditTopicsFragment;
import com.clubhouse.android.ui.profile.settings.LanguagesFragment;
import com.clubhouse.android.ui.profile.settings.LanguagesViewModel;
import com.clubhouse.android.ui.profile.settings.NotificationSettingsFragment;
import com.clubhouse.android.ui.profile.settings.NotificationSettingsViewModel;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import com.clubhouse.android.ui.profile.settings.SettingsViewModel;
import com.clubhouse.android.ui.recentSpeakers.RecentSpeakersFragment;
import com.clubhouse.android.ui.recentSpeakers.RecentSpeakersViewModel;
import com.clubhouse.android.ui.search.ExploreFragment;
import com.clubhouse.android.ui.search.ExploreV2Fragment;
import com.clubhouse.android.ui.search.ExploreV2ViewModel;
import com.clubhouse.android.ui.search.ExploreViewModel;
import com.clubhouse.android.ui.selection.SelectionFragment;
import com.clubhouse.android.ui.selection.SelectionViewModel;
import com.clubhouse.android.ui.splash.SplashFragment;
import com.clubhouse.android.user.model.UserSelf;
import com.clubhouse.backchannel.archive.BackchannelArchiveFragment;
import com.clubhouse.backchannel.archive.BackchannelArchiveViewModel;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import com.clubhouse.backchannel.chat.BackchannelChatViewModel;
import com.clubhouse.backchannel.container.BackchannelContainerFragment;
import com.clubhouse.backchannel.container.BackchannelModalContainerFragment;
import com.clubhouse.backchannel.create.BackchannelCreateChatFragment;
import com.clubhouse.backchannel.create.BackchannelCreateChatViewModel;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment;
import com.clubhouse.backchannel.inbox.BackchannelInboxViewModel;
import com.clubhouse.backchannel.members.BackchannelAddMemberFragment;
import com.clubhouse.backchannel.members.BackchannelChatMembersFragment;
import com.clubhouse.backchannel.members.BackchannelMembersViewModel;
import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import com.clubhouse.wave.WaveBarViewModel;
import com.clubhouse.wave.WaveCoordinatorViewModel;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import com.clubhouse.wave.data.models.local.SentWave;
import com.instabug.library.model.NetworkLog;
import com.pubnub.api.PubNub;
import com.squareup.picasso.Picasso;
import h0.b0.v;
import h0.g0.n;
import h0.o.a.k;
import h0.q.k0;
import h0.q.p;
import h0.q.q;
import i0.e.b.g3.q.o;
import i0.e.b.g3.r.j0;
import i0.e.b.g3.r.l1;
import i0.e.b.g3.u.y5.q0;
import i0.e.b.g3.u.y5.u0;
import i0.e.b.g3.u.y5.y0;
import i0.k.b.a.a.a.d;
import j0.a.a.c.c.c;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.JobSupport;
import m0.l.e;
import m0.n.b.m;
import n0.a.d0;
import n0.a.f0;
import n0.a.f1;
import n0.a.m0;
import n0.a.x;
import q0.a0;
import q0.y;
import t0.h;
import t0.w;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public final class l extends i {
    public volatile Object A = new j0.b.c();
    public volatile Object B = new j0.b.c();
    public volatile Object C = new j0.b.c();
    public volatile Object D = new j0.b.c();
    public volatile Object E = new j0.b.c();
    public volatile Object F = new j0.b.c();
    public volatile Object G = new j0.b.c();
    public volatile Object H = new j0.b.c();
    public volatile Object I = new j0.b.c();
    public volatile Object J = new j0.b.c();
    public volatile Object K = new j0.b.c();
    public volatile Object L = new j0.b.c();
    public volatile Object M = new j0.b.c();
    public volatile Object N = new j0.b.c();
    public volatile Object O = new j0.b.c();
    public volatile Object P = new j0.b.c();
    public volatile Object Q = new j0.b.c();
    public volatile Object R = new j0.b.c();
    public volatile Object S = new j0.b.c();
    public volatile Object T = new j0.b.c();
    public volatile Object U = new j0.b.c();
    public volatile Object V = new j0.b.c();
    public final i0.e.b.c3.a a;
    public final j0.a.a.c.d.a b;
    public final i0.e.b.c3.g.c c;
    public final i0.e.b.c3.d d;
    public final i0.e.c.g.b e;
    public final i0.e.e.l.b f;
    public final l g = this;
    public volatile Object h = new j0.b.c();
    public volatile Object i = new j0.b.c();
    public volatile Object j = new j0.b.c();
    public volatile Object k = new j0.b.c();
    public volatile Object l = new j0.b.c();
    public volatile Object m = new j0.b.c();
    public volatile Object n = new j0.b.c();
    public volatile Object o = new j0.b.c();
    public volatile Object p = new j0.b.c();
    public volatile Object q = new j0.b.c();
    public volatile Object r = new j0.b.c();
    public volatile Object s = new j0.b.c();
    public volatile Object t = new j0.b.c();
    public volatile Object u = new j0.b.c();
    public volatile Object v = new j0.b.c();
    public volatile Object w = new j0.b.c();
    public volatile Object x = new j0.b.c();
    public volatile Object y = new j0.b.c();
    public volatile Object z = new j0.b.c();

    /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
    public static final class b implements j0.a.a.c.a.b {
        public final l a;

        public b(l lVar, a aVar) {
            this.a = lVar;
        }
    }

    /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
    public static final class c extends d {
        public final l a;
        public final c b = this;
        public volatile Object c = new j0.b.c();

        /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
        public static final class a implements j0.a.a.c.a.a {
            public final l a;
            public final c b;
            public Activity c;

            public a(l lVar, c cVar, a aVar) {
                this.a = lVar;
                this.b = cVar;
            }
        }

        /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
        public static final class b extends c {
            public final i0.e.b.c3.f.b a;
            public final Activity b;
            public final l c;
            public final c d;
            public final b e = this;
            public volatile Object f = new j0.b.c();
            public volatile Object g = new j0.b.c();
            public volatile Object h = new j0.b.c();
            public volatile Object i = new j0.b.c();
            public volatile Object j = new j0.b.c();
            public volatile Object k = new j0.b.c();
            public volatile Object l = new j0.b.c();
            public volatile Object m = new j0.b.c();
            public volatile k n;
            public volatile Object o = new j0.b.c();
            public volatile Object p = new j0.b.c();

            /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
            public static final class a implements j0.a.a.c.a.c {
                public final l a;
                public final c b;
                public final b c;
                public Fragment d;

                public a(l lVar, c cVar, b bVar, a aVar) {
                    this.a = lVar;
                    this.b = cVar;
                    this.c = bVar;
                }
            }

            /* renamed from: i0.e.b.l$c$b$b  reason: collision with other inner class name */
            /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
            public static final class C0214b extends f {
                public final Fragment a;
                public final l b;
                public final b c;

                public C0214b(l lVar, c cVar, b bVar, Fragment fragment, a aVar) {
                    this.b = lVar;
                    this.c = bVar;
                    this.a = fragment;
                }

                public void A(PendingInvitesFragment pendingInvitesFragment) {
                    pendingInvitesFragment.c = H0();
                }

                public void A0(HallwayFragment hallwayFragment) {
                    hallwayFragment.c = H0();
                    hallwayFragment.a2 = this.c.h();
                    hallwayFragment.b2 = this.b.L();
                }

                public void B(FollowFriendsFragment followFriendsFragment) {
                    followFriendsFragment.c = H0();
                    followFriendsFragment.a2 = l.m(this.b);
                }

                public void B0(HalfWelcomeNewClubFragment halfWelcomeNewClubFragment) {
                    halfWelcomeNewClubFragment.k2 = H0();
                }

                public void C(CreateChannelFragment createChannelFragment) {
                    createChannelFragment.k2 = H0();
                }

                public void C0(FollowSuggestionsFragment followSuggestionsFragment) {
                    followSuggestionsFragment.c = H0();
                    followSuggestionsFragment.a2 = l.m(this.b);
                }

                public void D(EditTopicsFragment editTopicsFragment) {
                    editTopicsFragment.c = H0();
                }

                public void D0(WelcomeRoomFragment welcomeRoomFragment) {
                    welcomeRoomFragment.c = H0();
                }

                public void E(HalfClubRulesFragment halfClubRulesFragment) {
                    halfClubRulesFragment.k2 = H0();
                }

                public void E0(HalfProfileFragment halfProfileFragment) {
                    halfProfileFragment.c = H0();
                    halfProfileFragment.b2 = this.b.L();
                    halfProfileFragment.k2 = l.m(this.b);
                }

                public void F(PaymentsRegistrationFragment paymentsRegistrationFragment) {
                    paymentsRegistrationFragment.c = H0();
                }

                public void F0(BackchannelArchiveFragment backchannelArchiveFragment) {
                    backchannelArchiveFragment.c = H0();
                }

                public void G(EditNameFragment editNameFragment) {
                    editNameFragment.c = H0();
                }

                public void G0(BackchannelInboxFragment backchannelInboxFragment) {
                    backchannelInboxFragment.c = H0();
                }

                public void H(AcknowledgePaymentFragment acknowledgePaymentFragment) {
                    acknowledgePaymentFragment.k2 = H0();
                }

                public final AppBannerHandler H0() {
                    return new AppBannerHandler(this.c.b, this.a);
                }

                public void I(HalfEventFragment halfEventFragment) {
                    halfEventFragment.k2 = H0();
                    halfEventFragment.s2 = l.m(this.b);
                }

                public void J(ValidateNumberFragment validateNumberFragment) {
                    validateNumberFragment.c = H0();
                }

                public void K(AddEditEventFragment addEditEventFragment) {
                    addEditEventFragment.c = H0();
                }

                public void L(EditClubRulesFragment editClubRulesFragment) {
                    editClubRulesFragment.c = H0();
                }

                public void M(ChannelFragment channelFragment) {
                    channelFragment.c = H0();
                    channelFragment.a2 = l.m(this.b);
                }

                public void N(SplashFragment splashFragment) {
                    splashFragment.c = H0();
                    splashFragment.Z1 = this.b.K();
                    splashFragment.a2 = l.m(this.b);
                }

                public void O(RecentlyDepartedSpeakersFragment recentlyDepartedSpeakersFragment) {
                    recentlyDepartedSpeakersFragment.k2 = H0();
                }

                public void P(WelcomeFragment welcomeFragment) {
                    welcomeFragment.c = H0();
                }

                public void Q(ProfilePhotoFragment profilePhotoFragment) {
                    profilePhotoFragment.c = H0();
                }

                public void R(BackchannelChatFragment backchannelChatFragment) {
                    Object obj;
                    backchannelChatFragment.c = H0();
                    l lVar = this.b;
                    Object obj2 = lVar.V;
                    if (obj2 instanceof j0.b.c) {
                        synchronized (obj2) {
                            obj = lVar.V;
                            if (obj instanceof j0.b.c) {
                                Objects.requireNonNull(lVar.c);
                                obj = new i0.e.b.c3.g.b();
                                j0.b.a.a(lVar.V, obj);
                                lVar.V = obj;
                            }
                        }
                        obj2 = obj;
                    }
                    backchannelChatFragment.a2 = (i0.e.b.z2.f.c) obj2;
                }

                public void S(GrowClubFragment growClubFragment) {
                    growClubFragment.c = H0();
                    growClubFragment.a2 = l.m(this.b);
                }

                public void T(ClubTopicsFragment clubTopicsFragment) {
                    clubTopicsFragment.c = H0();
                }

                public void U(ReportIncidentThanksFragment reportIncidentThanksFragment) {
                    reportIncidentThanksFragment.c = H0();
                }

                public void V(OnboardingClubsFragment onboardingClubsFragment) {
                    onboardingClubsFragment.c = H0();
                }

                public void W(ConnectSocialAccountsFragment connectSocialAccountsFragment) {
                    connectSocialAccountsFragment.c = H0();
                }

                public void X(TopicsFragment topicsFragment) {
                    topicsFragment.c = H0();
                }

                public void Y(EditBioFragment editBioFragment) {
                    editBioFragment.k2 = H0();
                }

                public void Z(ExploreFragment exploreFragment) {
                    exploreFragment.c = H0();
                    exploreFragment.a2 = l.m(this.b);
                }

                public j0.a.a.c.b.c a() {
                    return this.c.a();
                }

                public void a0(ReportProfileLegacyFragment reportProfileLegacyFragment) {
                    reportProfileLegacyFragment.c = H0();
                }

                public void b(FollowListFragment followListFragment) {
                    followListFragment.c = H0();
                }

                public void b0(EventsFragment eventsFragment) {
                    eventsFragment.c = H0();
                    eventsFragment.a2 = this.b.L();
                }

                public void c(CollectNameFragment collectNameFragment) {
                    collectNameFragment.c = H0();
                }

                public void c0(AccountFragment accountFragment) {
                    accountFragment.c = H0();
                }

                public void d(RecentPaymentsFragment recentPaymentsFragment) {
                    recentPaymentsFragment.c = H0();
                }

                public void d0(EditPhotoFragment editPhotoFragment) {
                    editPhotoFragment.c = H0();
                }

                public void e(EditUsernameFragment editUsernameFragment) {
                    editUsernameFragment.c = H0();
                }

                public void e0(AddPhotoFragment addPhotoFragment) {
                    addPhotoFragment.c = H0();
                }

                public void f(EventHostClubFragment eventHostClubFragment) {
                    eventHostClubFragment.k2 = H0();
                }

                public void f0(FeedFragment feedFragment) {
                    feedFragment.c = H0();
                    feedFragment.a2 = l.m(this.b);
                }

                public void g(InvitesFragment invitesFragment) {
                    invitesFragment.c = H0();
                }

                public void g0(FollowSpeakersFragment followSpeakersFragment) {
                    followSpeakersFragment.k2 = H0();
                }

                public void h(EditClubDescriptionFragment editClubDescriptionFragment) {
                    editClubDescriptionFragment.k2 = H0();
                }

                public void h0(InvitedByFragment invitedByFragment) {
                    invitedByFragment.c = H0();
                }

                public void i(ProfileFragment profileFragment) {
                    profileFragment.c = H0();
                    profileFragment.d2 = l.m(this.b);
                    profileFragment.e2 = this.c.j();
                }

                public void i0(SendDirectPaymentFragment sendDirectPaymentFragment) {
                    sendDirectPaymentFragment.k2 = H0();
                }

                public void j(SelectionFragment selectionFragment) {
                    selectionFragment.c = H0();
                }

                public void j0(ChooseUsersFragment chooseUsersFragment) {
                    chooseUsersFragment.k2 = H0();
                }

                public void k(WaitlistFragment waitlistFragment) {
                    waitlistFragment.c = H0();
                }

                public void k0(BackchannelCreateChatFragment backchannelCreateChatFragment) {
                    backchannelCreateChatFragment.c = H0();
                }

                public void l(LanguagesFragment languagesFragment) {
                    languagesFragment.c = H0();
                }

                public void l0(ClubMemberSearchFragment clubMemberSearchFragment) {
                    clubMemberSearchFragment.c = H0();
                }

                public void m(ReportProfileFragment reportProfileFragment) {
                    reportProfileFragment.c = H0();
                }

                public void m0(CreateClubFragment createClubFragment) {
                    createClubFragment.c = H0();
                }

                public void n(ClubNominationsFragment clubNominationsFragment) {
                    clubNominationsFragment.c = H0();
                }

                public void n0(ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment) {
                    reportIncidentSelectChannelFragment.c = H0();
                }

                public void o(CollectUsernameFragment collectUsernameFragment) {
                    collectUsernameFragment.c = H0();
                }

                public void o0(ActivityFragment activityFragment) {
                    activityFragment.c = H0();
                }

                public void p(ValidateNumberWithCallFragment validateNumberWithCallFragment) {
                    validateNumberWithCallFragment.c = H0();
                }

                public void p0(ReportIncidentSelectSubCategoryFragment reportIncidentSelectSubCategoryFragment) {
                    reportIncidentSelectSubCategoryFragment.c = H0();
                }

                public void q(WrappedBottomSheetFragment wrappedBottomSheetFragment) {
                    wrappedBottomSheetFragment.k2 = H0();
                }

                public void q0(DeactivateFragment deactivateFragment) {
                    deactivateFragment.c = H0();
                }

                public void r(ClubFragment clubFragment) {
                    clubFragment.c = H0();
                    clubFragment.f2 = l.m(this.b);
                }

                public void r0(ActivityOverflowFragment activityOverflowFragment) {
                    activityOverflowFragment.c = H0();
                }

                public void s(ExploreV2Fragment exploreV2Fragment) {
                    exploreV2Fragment.c = H0();
                    exploreV2Fragment.a2 = l.m(this.b);
                }

                public void s0(BackchannelChatMembersFragment backchannelChatMembersFragment) {
                    backchannelChatMembersFragment.k2 = H0();
                }

                public void t(PingUserFragment pingUserFragment) {
                    pingUserFragment.k2 = H0();
                    pingUserFragment.s2 = l.m(this.b);
                }

                public void t0(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment) {
                    reportIncidentAddDetailsFragment.c = H0();
                }

                public void u(ActionSheetFragment actionSheetFragment) {
                    actionSheetFragment.k2 = H0();
                }

                public void u0(SettingsFragment settingsFragment) {
                    settingsFragment.c = H0();
                    settingsFragment.a2 = this.b.z();
                }

                public void v(OnboardingTopicsFragment onboardingTopicsFragment) {
                    onboardingTopicsFragment.c = H0();
                }

                public void v0(BuddyListFragment buddyListFragment) {
                    buddyListFragment.c = H0();
                }

                public void w(BackchannelAddMemberFragment backchannelAddMemberFragment) {
                    backchannelAddMemberFragment.k2 = H0();
                }

                public void w0(CollectPhoneNumberFragment collectPhoneNumberFragment) {
                    collectPhoneNumberFragment.c = H0();
                }

                public void x(ContactsPermissionFragment contactsPermissionFragment) {
                    contactsPermissionFragment.c = H0();
                    contactsPermissionFragment.Z1 = l.q(this.b);
                }

                public void x0(ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment) {
                    reportIncidentSelectCategoryFragment.c = H0();
                }

                public void y(SearchInRoomFragment searchInRoomFragment) {
                    searchInRoomFragment.k2 = H0();
                }

                public void y0(CollectUsernameWithSuggestionsFragment collectUsernameWithSuggestionsFragment) {
                    collectUsernameWithSuggestionsFragment.c = H0();
                }

                public void z(RecentSpeakersFragment recentSpeakersFragment) {
                    recentSpeakersFragment.c = H0();
                }

                public void z0(NotificationSettingsFragment notificationSettingsFragment) {
                    notificationSettingsFragment.c = H0();
                }
            }

            public b(l lVar, c cVar, i0.e.b.c3.f.b bVar, Activity activity, a aVar) {
                this.c = lVar;
                this.d = cVar;
                this.a = bVar;
                this.b = activity;
            }

            public j0.a.a.c.b.c a() {
                return new j0.a.a.c.b.c(i0.j.f.p.h.l3(this.c.b), Collections.emptySet(), new C0215c(this.c, this.d, (a) null));
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: com.clubhouse.android.ui.BottomBarCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.clubhouse.android.ui.BottomBarCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.clubhouse.android.notifications.NotificationsCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.clubhouse.android.notifications.NotificationsCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.clubhouse.android.shared.review.ReviewCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.clubhouse.android.shared.review.ReviewCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.clubhouse.android.shared.auth.SessionCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.clubhouse.android.shared.auth.SessionCoordinator} */
            /* JADX WARNING: type inference failed for: r0v19 */
            /* JADX WARNING: type inference failed for: r1v8 */
            /* JADX WARNING: type inference failed for: r1v11 */
            /* JADX WARNING: type inference failed for: r1v14 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void b(com.clubhouse.android.ui.ClubhouseActivity r10) {
                /*
                    r9 = this;
                    r9.e()
                    java.lang.Object r0 = r9.j
                    boolean r1 = r0 instanceof j0.b.c
                    if (r1 == 0) goto L_0x0039
                    monitor-enter(r0)
                    java.lang.Object r1 = r9.j     // Catch:{ all -> 0x0036 }
                    boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x0036 }
                    if (r2 == 0) goto L_0x0033
                    com.clubhouse.android.shared.auth.SessionCoordinator r1 = new com.clubhouse.android.shared.auth.SessionCoordinator     // Catch:{ all -> 0x0036 }
                    android.app.Activity r4 = r9.b     // Catch:{ all -> 0x0036 }
                    i0.e.b.a3.f.b r5 = r9.j()     // Catch:{ all -> 0x0036 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0036 }
                    com.clubhouse.android.shared.auth.UserManager r6 = r2.K()     // Catch:{ all -> 0x0036 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0036 }
                    i0.e.b.f3.i.a r7 = r2.h()     // Catch:{ all -> 0x0036 }
                    n0.a.f0 r8 = r9.f()     // Catch:{ all -> 0x0036 }
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0036 }
                    java.lang.Object r2 = r9.j     // Catch:{ all -> 0x0036 }
                    j0.b.a.a(r2, r1)     // Catch:{ all -> 0x0036 }
                    r9.j = r1     // Catch:{ all -> 0x0036 }
                L_0x0033:
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    r0 = r1
                    goto L_0x0039
                L_0x0036:
                    r10 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    throw r10
                L_0x0039:
                    com.clubhouse.android.shared.auth.SessionCoordinator r0 = (com.clubhouse.android.shared.auth.SessionCoordinator) r0
                    com.clubhouse.android.shared.update.UpdatesCoordinator r0 = r9.h()
                    r10.y = r0
                    java.lang.Object r0 = r9.l
                    boolean r1 = r0 instanceof j0.b.c
                    if (r1 == 0) goto L_0x0079
                    monitor-enter(r0)
                    java.lang.Object r1 = r9.l     // Catch:{ all -> 0x0076 }
                    boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x0076 }
                    if (r2 == 0) goto L_0x0073
                    com.clubhouse.android.shared.review.ReviewCoordinator r1 = new com.clubhouse.android.shared.review.ReviewCoordinator     // Catch:{ all -> 0x0076 }
                    android.app.Activity r4 = r9.b     // Catch:{ all -> 0x0076 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0076 }
                    i0.e.b.f3.k.b r5 = r2.L()     // Catch:{ all -> 0x0076 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0076 }
                    i0.e.b.f3.i.a r6 = r2.h()     // Catch:{ all -> 0x0076 }
                    n0.a.f0 r7 = r9.f()     // Catch:{ all -> 0x0076 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0076 }
                    com.clubhouse.analytics.AmplitudeAnalytics r8 = r2.u()     // Catch:{ all -> 0x0076 }
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0076 }
                    java.lang.Object r2 = r9.l     // Catch:{ all -> 0x0076 }
                    j0.b.a.a(r2, r1)     // Catch:{ all -> 0x0076 }
                    r9.l = r1     // Catch:{ all -> 0x0076 }
                L_0x0073:
                    monitor-exit(r0)     // Catch:{ all -> 0x0076 }
                    r0 = r1
                    goto L_0x0079
                L_0x0076:
                    r10 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0076 }
                    throw r10
                L_0x0079:
                    com.clubhouse.android.shared.review.ReviewCoordinator r0 = (com.clubhouse.android.shared.review.ReviewCoordinator) r0
                    java.lang.Object r0 = r9.m
                    boolean r1 = r0 instanceof j0.b.c
                    if (r1 == 0) goto L_0x00b3
                    monitor-enter(r0)
                    java.lang.Object r1 = r9.m     // Catch:{ all -> 0x00b0 }
                    boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x00b0 }
                    if (r2 == 0) goto L_0x00ad
                    com.clubhouse.android.notifications.NotificationsCoordinator r1 = new com.clubhouse.android.notifications.NotificationsCoordinator     // Catch:{ all -> 0x00b0 }
                    android.app.Activity r4 = r9.b     // Catch:{ all -> 0x00b0 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x00b0 }
                    com.clubhouse.android.shared.auth.UserManager r5 = r2.K()     // Catch:{ all -> 0x00b0 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x00b0 }
                    i0.e.b.f3.i.a r6 = r2.h()     // Catch:{ all -> 0x00b0 }
                    n0.a.f0 r7 = r9.f()     // Catch:{ all -> 0x00b0 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x00b0 }
                    com.clubhouse.analytics.AmplitudeAnalytics r8 = r2.u()     // Catch:{ all -> 0x00b0 }
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b0 }
                    java.lang.Object r2 = r9.m     // Catch:{ all -> 0x00b0 }
                    j0.b.a.a(r2, r1)     // Catch:{ all -> 0x00b0 }
                    r9.m = r1     // Catch:{ all -> 0x00b0 }
                L_0x00ad:
                    monitor-exit(r0)     // Catch:{ all -> 0x00b0 }
                    r0 = r1
                    goto L_0x00b3
                L_0x00b0:
                    r10 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00b0 }
                    throw r10
                L_0x00b3:
                    com.clubhouse.android.notifications.NotificationsCoordinator r0 = (com.clubhouse.android.notifications.NotificationsCoordinator) r0
                    i0.e.b.l r0 = r9.c
                    i0.e.a.b.a r0 = i0.e.b.l.m(r0)
                    r10.Y1 = r0
                    i0.e.b.l r0 = r9.c
                    com.clubhouse.analytics.AmplitudeAnalytics r0 = r0.u()
                    r10.Z1 = r0
                    i0.e.b.l r0 = r9.c
                    com.clubhouse.android.shared.auth.UserManager r0 = r0.K()
                    r10.a2 = r0
                    r9.c()
                    java.lang.Object r10 = r9.o
                    boolean r0 = r10 instanceof j0.b.c
                    if (r0 == 0) goto L_0x010d
                    monitor-enter(r10)
                    java.lang.Object r0 = r9.o     // Catch:{ all -> 0x010a }
                    boolean r1 = r0 instanceof j0.b.c     // Catch:{ all -> 0x010a }
                    if (r1 == 0) goto L_0x0107
                    com.clubhouse.android.ui.BottomBarCoordinator r0 = new com.clubhouse.android.ui.BottomBarCoordinator     // Catch:{ all -> 0x010a }
                    h0.o.a.k r3 = r9.g()     // Catch:{ all -> 0x010a }
                    i0.e.b.l r1 = r9.c     // Catch:{ all -> 0x010a }
                    i0.e.b.f3.i.a r4 = r1.h()     // Catch:{ all -> 0x010a }
                    i0.e.b.l r1 = r9.c     // Catch:{ all -> 0x010a }
                    com.clubhouse.android.shared.auth.UserManager r5 = r1.K()     // Catch:{ all -> 0x010a }
                    i0.e.b.m r6 = new i0.e.b.m     // Catch:{ all -> 0x010a }
                    r6.<init>(r9)     // Catch:{ all -> 0x010a }
                    com.clubhouse.android.channels.ActiveChannelCoordinator r7 = r9.e()     // Catch:{ all -> 0x010a }
                    n0.a.f0 r8 = r9.f()     // Catch:{ all -> 0x010a }
                    r2 = r0
                    r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x010a }
                    java.lang.Object r1 = r9.o     // Catch:{ all -> 0x010a }
                    j0.b.a.a(r1, r0)     // Catch:{ all -> 0x010a }
                    r9.o = r0     // Catch:{ all -> 0x010a }
                L_0x0107:
                    monitor-exit(r10)     // Catch:{ all -> 0x010a }
                    r10 = r0
                    goto L_0x010d
                L_0x010a:
                    r0 = move-exception
                    monitor-exit(r10)     // Catch:{ all -> 0x010a }
                    throw r0
                L_0x010d:
                    com.clubhouse.android.ui.BottomBarCoordinator r10 = (com.clubhouse.android.ui.BottomBarCoordinator) r10
                    r9.i()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.c.b.b(com.clubhouse.android.ui.ClubhouseActivity):void");
            }

            public Handler c() {
                Object obj;
                Object obj2 = this.f;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.f;
                        if (obj instanceof j0.b.c) {
                            i0.e.b.c3.f.b bVar = this.a;
                            Activity activity = this.b;
                            Objects.requireNonNull(bVar);
                            m0.n.b.i.e(activity, "activity");
                            obj = new Handler(activity.getMainLooper());
                            j0.b.a.a(this.f, obj);
                            this.f = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (Handler) obj2;
            }

            public j0.a.a.c.a.c d() {
                return new a(this.c, this.d, this.e, (a) null);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.android.channels.ActiveChannelCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.android.channels.ActiveChannelCoordinator} */
            /* JADX WARNING: type inference failed for: r1v3 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.clubhouse.android.channels.ActiveChannelCoordinator e() {
                /*
                    r9 = this;
                    java.lang.Object r0 = r9.h
                    boolean r1 = r0 instanceof j0.b.c
                    if (r1 == 0) goto L_0x0038
                    monitor-enter(r0)
                    java.lang.Object r1 = r9.h     // Catch:{ all -> 0x0035 }
                    boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x0035 }
                    if (r2 == 0) goto L_0x0032
                    com.clubhouse.android.channels.ActiveChannelCoordinator r1 = new com.clubhouse.android.channels.ActiveChannelCoordinator     // Catch:{ all -> 0x0035 }
                    android.app.Activity r4 = r9.b     // Catch:{ all -> 0x0035 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0035 }
                    i0.e.a.b.a r5 = i0.e.b.l.m(r2)     // Catch:{ all -> 0x0035 }
                    n0.a.f0 r6 = r9.f()     // Catch:{ all -> 0x0035 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0035 }
                    com.clubhouse.android.shared.auth.UserManager r7 = r2.K()     // Catch:{ all -> 0x0035 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0035 }
                    i0.e.b.f3.i.a r8 = r2.h()     // Catch:{ all -> 0x0035 }
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0035 }
                    java.lang.Object r2 = r9.h     // Catch:{ all -> 0x0035 }
                    j0.b.a.a(r2, r1)     // Catch:{ all -> 0x0035 }
                    r9.h = r1     // Catch:{ all -> 0x0035 }
                L_0x0032:
                    monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                    r0 = r1
                    goto L_0x0038
                L_0x0035:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                    throw r1
                L_0x0038:
                    com.clubhouse.android.channels.ActiveChannelCoordinator r0 = (com.clubhouse.android.channels.ActiveChannelCoordinator) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.c.b.e():com.clubhouse.android.channels.ActiveChannelCoordinator");
            }

            public final f0 f() {
                Object obj;
                Object obj2 = this.g;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.g;
                        if (obj instanceof j0.b.c) {
                            i0.e.b.c3.f.b bVar = this.a;
                            Activity activity = this.b;
                            Objects.requireNonNull(bVar);
                            m0.n.b.i.e(activity, "activity");
                            obj = q.a((p) activity);
                            j0.b.a.a(this.g, obj);
                            this.g = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (f0) obj2;
            }

            public final k g() {
                k kVar = this.n;
                if (kVar == null) {
                    Activity activity = this.b;
                    try {
                        kVar = (k) activity;
                        Objects.requireNonNull(kVar, "Cannot return null from a non-@Nullable @Provides method");
                        this.n = kVar;
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e2);
                    }
                }
                return kVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.android.shared.update.UpdatesCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.android.shared.update.UpdatesCoordinator} */
            /* JADX WARNING: type inference failed for: r1v3 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.clubhouse.android.shared.update.UpdatesCoordinator h() {
                /*
                    r9 = this;
                    java.lang.Object r0 = r9.k
                    boolean r1 = r0 instanceof j0.b.c
                    if (r1 == 0) goto L_0x0036
                    monitor-enter(r0)
                    java.lang.Object r1 = r9.k     // Catch:{ all -> 0x0033 }
                    boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x0033 }
                    if (r2 == 0) goto L_0x0030
                    com.clubhouse.android.shared.update.UpdatesCoordinator r1 = new com.clubhouse.android.shared.update.UpdatesCoordinator     // Catch:{ all -> 0x0033 }
                    android.app.Activity r4 = r9.b     // Catch:{ all -> 0x0033 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0033 }
                    com.clubhouse.android.shared.preferences.DeviceSharedPreferences r5 = r2.z()     // Catch:{ all -> 0x0033 }
                    i0.e.b.a3.f.b r6 = r9.j()     // Catch:{ all -> 0x0033 }
                    n0.a.f0 r7 = r9.f()     // Catch:{ all -> 0x0033 }
                    i0.e.b.l r2 = r9.c     // Catch:{ all -> 0x0033 }
                    com.clubhouse.android.data.repos.UpdatesRepo r8 = i0.e.b.l.j(r2)     // Catch:{ all -> 0x0033 }
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0033 }
                    java.lang.Object r2 = r9.k     // Catch:{ all -> 0x0033 }
                    j0.b.a.a(r2, r1)     // Catch:{ all -> 0x0033 }
                    r9.k = r1     // Catch:{ all -> 0x0033 }
                L_0x0030:
                    monitor-exit(r0)     // Catch:{ all -> 0x0033 }
                    r0 = r1
                    goto L_0x0036
                L_0x0033:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0033 }
                    throw r1
                L_0x0036:
                    com.clubhouse.android.shared.update.UpdatesCoordinator r0 = (com.clubhouse.android.shared.update.UpdatesCoordinator) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.c.b.h():com.clubhouse.android.shared.update.UpdatesCoordinator");
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.android.shared.wave.WaveCoordinator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.android.shared.wave.WaveCoordinator} */
            /* JADX WARNING: type inference failed for: r1v3 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.clubhouse.android.shared.wave.WaveCoordinator i() {
                /*
                    r11 = this;
                    java.lang.Object r0 = r11.p
                    boolean r1 = r0 instanceof j0.b.c
                    if (r1 == 0) goto L_0x0041
                    monitor-enter(r0)
                    java.lang.Object r1 = r11.p     // Catch:{ all -> 0x003e }
                    boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x003e }
                    if (r2 == 0) goto L_0x003b
                    com.clubhouse.android.shared.wave.WaveCoordinator r1 = new com.clubhouse.android.shared.wave.WaveCoordinator     // Catch:{ all -> 0x003e }
                    h0.o.a.k r4 = r11.g()     // Catch:{ all -> 0x003e }
                    i0.e.b.n r5 = new i0.e.b.n     // Catch:{ all -> 0x003e }
                    r5.<init>(r11)     // Catch:{ all -> 0x003e }
                    com.clubhouse.android.channels.ActiveChannelCoordinator r6 = r11.e()     // Catch:{ all -> 0x003e }
                    i0.e.b.a3.f.b r7 = r11.j()     // Catch:{ all -> 0x003e }
                    i0.e.b.l r2 = r11.c     // Catch:{ all -> 0x003e }
                    i0.e.b.f3.i.a r8 = r2.h()     // Catch:{ all -> 0x003e }
                    i0.e.b.l r2 = r11.c     // Catch:{ all -> 0x003e }
                    com.clubhouse.android.shared.auth.UserManager r9 = r2.K()     // Catch:{ all -> 0x003e }
                    n0.a.f0 r10 = r11.f()     // Catch:{ all -> 0x003e }
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x003e }
                    java.lang.Object r2 = r11.p     // Catch:{ all -> 0x003e }
                    j0.b.a.a(r2, r1)     // Catch:{ all -> 0x003e }
                    r11.p = r1     // Catch:{ all -> 0x003e }
                L_0x003b:
                    monitor-exit(r0)     // Catch:{ all -> 0x003e }
                    r0 = r1
                    goto L_0x0041
                L_0x003e:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x003e }
                    throw r1
                L_0x0041:
                    com.clubhouse.android.shared.wave.WaveCoordinator r0 = (com.clubhouse.android.shared.wave.WaveCoordinator) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.c.b.i():com.clubhouse.android.shared.wave.WaveCoordinator");
            }

            public final i0.e.b.a3.f.b j() {
                Object obj;
                Object obj2 = this.i;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.i;
                        if (obj instanceof j0.b.c) {
                            i0.e.b.c3.f.b bVar = this.a;
                            Activity activity = this.b;
                            Objects.requireNonNull(bVar);
                            m0.n.b.i.e(activity, "activity");
                            obj = new AppBannerHandler(activity, (Fragment) null);
                            j0.b.a.a(this.i, obj);
                            this.i = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (i0.e.b.a3.f.b) obj2;
            }
        }

        /* renamed from: i0.e.b.l$c$c  reason: collision with other inner class name */
        /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
        public static final class C0215c implements j0.a.a.c.a.e {
            public final l a;
            public final c b;
            public h0.q.f0 c;

            public C0215c(l lVar, c cVar, a aVar) {
                this.a = lVar;
                this.b = cVar;
            }
        }

        /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
        public static final class d extends k {
            public d(l lVar, c cVar, h0.q.f0 f0Var) {
            }

            public Map<String, l0.a.a<k0>> a() {
                return Collections.emptyMap();
            }
        }

        public c(l lVar, a aVar) {
            this.a = lVar;
        }

        public j0.a.a.a a() {
            Object obj;
            Object obj2 = this.c;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.c;
                    if (obj instanceof j0.b.c) {
                        obj = new c.d();
                        j0.b.a.a(this.c, obj);
                        this.c = obj;
                    }
                }
                obj2 = obj;
            }
            return (j0.a.a.a) obj2;
        }

        public j0.a.a.c.a.a b() {
            return new a(this.a, this.b, (a) null);
        }
    }

    /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
    public static final class d implements i0.e.b.c3.h.d {
        public final l a;

        public d(l lVar, a aVar) {
            this.a = lVar;
        }
    }

    /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
    public static final class e extends g {
        public final i0.e.b.c3.j.a a;
        public final l b;
        public final e c = this;
        public volatile Object d = new j0.b.c();
        public volatile Object e = new j0.b.c();

        public e(l lVar, i0.e.b.c3.j.a aVar, a aVar2) {
            this.b = lVar;
            this.a = aVar;
        }

        public Map<Class<? extends MavericksViewModel<?>>, i0.e.b.a3.a.a<?, ?>> a() {
            j0.b.b bVar = new j0.b.b(70);
            y yVar = new y(this);
            bVar.a.put(CollectPhoneNumberViewModel.class, yVar);
            j0 j0Var = new j0(this);
            bVar.a.put(ValidateNumberViewModel.class, j0Var);
            u0 u0Var = new u0(this);
            bVar.a.put(ValidateNumberWithCallViewModel.class, u0Var);
            f1 f1Var = new f1(this);
            bVar.a.put(l1.class, f1Var);
            q1 q1Var = new q1(this);
            bVar.a.put(WaitlistViewModel.class, q1Var);
            b2 b2Var = new b2(this);
            bVar.a.put(CollectNameViewModel.class, b2Var);
            g2 g2Var = new g2(this);
            bVar.a.put(CollectUsernameViewModel.class, g2Var);
            h2 h2Var = new h2(this);
            bVar.a.put(j0.class, h2Var);
            i2 i2Var = new i2(this);
            bVar.a.put(TopicsViewModel.class, i2Var);
            o oVar = new o(this);
            bVar.a.put(LanguagesViewModel.class, oVar);
            p pVar = new p(this);
            bVar.a.put(EditPhotoViewModel.class, pVar);
            r rVar = new r(this);
            bVar.a.put(FollowSuggestionsViewModel.class, rVar);
            s sVar = new s(this);
            bVar.a.put(FollowFriendsViewModel.class, sVar);
            t tVar = new t(this);
            bVar.a.put(OnboardingTopicsViewModel.class, tVar);
            u uVar = new u(this);
            bVar.a.put(OnboardingClubsViewModel.class, uVar);
            v vVar = new v(this);
            bVar.a.put(HallwayViewModel.class, vVar);
            w wVar = new w(this);
            bVar.a.put(FeedViewModel.class, wVar);
            x xVar = new x(this);
            bVar.a.put(BuddyListViewModel.class, xVar);
            z zVar = new z(this);
            bVar.a.put(ChannelViewModel.class, zVar);
            a0 a0Var = new a0(this);
            bVar.a.put(CreateChannelViewModel.class, a0Var);
            b0 b0Var = new b0(this);
            bVar.a.put(ProfileViewModel.class, b0Var);
            c0 c0Var = new c0(this);
            bVar.a.put(FollowListViewModel.class, c0Var);
            d0 d0Var = new d0(this);
            bVar.a.put(HalfProfileViewModel.class, d0Var);
            e0 e0Var = new e0(this);
            bVar.a.put(SettingsViewModel.class, e0Var);
            f0 f0Var = new f0(this);
            bVar.a.put(NotificationSettingsViewModel.class, f0Var);
            g0 g0Var = new g0(this);
            bVar.a.put(DeactivateViewModel.class, g0Var);
            h0 h0Var = new h0(this);
            bVar.a.put(AccountViewModel.class, h0Var);
            i0 i0Var = new i0(this);
            bVar.a.put(PaymentsRegistrationViewModel.class, i0Var);
            k0 k0Var = new k0(this);
            bVar.a.put(SendDirectPaymentViewModel.class, k0Var);
            l0 l0Var = new l0(this);
            bVar.a.put(RecentPaymentsViewModel.class, l0Var);
            m0 m0Var = new m0(this);
            bVar.a.put(ClubViewModel.class, m0Var);
            n0 n0Var = new n0(this);
            bVar.a.put(ClubMemberSearchViewModel.class, n0Var);
            o0 o0Var = new o0(this);
            bVar.a.put(CreateClubViewModel.class, o0Var);
            p0 p0Var = new p0(this);
            bVar.a.put(SelectionViewModel.class, p0Var);
            q0 q0Var = new q0(this);
            bVar.a.put(EventsViewModel.class, q0Var);
            r0 r0Var = new r0(this);
            bVar.a.put(InvitesViewModel.class, r0Var);
            s0 s0Var = new s0(this);
            bVar.a.put(o.class, s0Var);
            t0 t0Var = new t0(this);
            bVar.a.put(HalfEventViewModel.class, t0Var);
            v0 v0Var = new v0(this);
            bVar.a.put(AddEditEventViewModel.class, v0Var);
            w0 w0Var = new w0(this);
            bVar.a.put(SearchInRoomViewModel.class, w0Var);
            x0 x0Var = new x0(this);
            bVar.a.put(FollowSpeakersViewModel.class, x0Var);
            z0 z0Var = new z0(this);
            bVar.a.put(PingUserViewModel.class, z0Var);
            a1 a1Var = new a1(this);
            bVar.a.put(ChooseUsersViewModel.class, a1Var);
            b1 b1Var = new b1(this);
            bVar.a.put(HalfClubRulesViewModel.class, b1Var);
            c1 c1Var = new c1(this);
            bVar.a.put(EditBioViewModel.class, c1Var);
            d1 d1Var = new d1(this);
            bVar.a.put(HalfProfileContainerViewModel.class, d1Var);
            e1 e1Var = new e1(this);
            bVar.a.put(ReportProfileLegacyViewModel.class, e1Var);
            g1 g1Var = new g1(this);
            bVar.a.put(q0.class, g1Var);
            h1 h1Var = new h1(this);
            bVar.a.put(ReportIncidentSelectCategoryContainerViewModel.class, h1Var);
            i1 i1Var = new i1(this);
            bVar.a.put(y0.class, i1Var);
            j1 j1Var = new j1(this);
            bVar.a.put(u0.class, j1Var);
            k1 k1Var = new k1(this);
            bVar.a.put(ReportIncidentAddDetailsViewModel.class, k1Var);
            l1 l1Var = new l1(this);
            bVar.a.put(ExploreViewModel.class, l1Var);
            m1 m1Var = new m1(this);
            bVar.a.put(ExploreV2ViewModel.class, m1Var);
            n1 n1Var = new n1(this);
            bVar.a.put(ActivityViewModel.class, n1Var);
            o1 o1Var = new o1(this);
            bVar.a.put(ActivityOverflowViewModel.class, o1Var);
            p1 p1Var = new p1(this);
            bVar.a.put(NavigationViewModel.class, p1Var);
            r1 r1Var = new r1(this);
            bVar.a.put(WelcomeRoomViewModel.class, r1Var);
            s1 s1Var = new s1(this);
            bVar.a.put(GrowClubViewModel.class, s1Var);
            t1 t1Var = new t1(this);
            bVar.a.put(EditClubRulesViewModel.class, t1Var);
            u1 u1Var = new u1(this);
            bVar.a.put(ClubTopicsViewModel.class, u1Var);
            v1 v1Var = new v1(this);
            bVar.a.put(RecentSpeakersViewModel.class, v1Var);
            w1 w1Var = new w1(this);
            bVar.a.put(ClubNominationsViewModel.class, w1Var);
            x1 x1Var = new x1(this);
            bVar.a.put(BackchannelInboxViewModel.class, x1Var);
            y1 y1Var = new y1(this);
            bVar.a.put(BackchannelChatViewModel.class, y1Var);
            a2 a2Var = new a2(this);
            bVar.a.put(BackchannelCreateChatViewModel.class, a2Var);
            c2 c2Var = new c2(this);
            bVar.a.put(BackchannelMembersViewModel.class, c2Var);
            d2 d2Var = new d2(this);
            bVar.a.put(BackchannelArchiveViewModel.class, d2Var);
            e2 e2Var = new e2(this);
            bVar.a.put(WaveBarViewModel.class, e2Var);
            f2 f2Var = new f2(this);
            bVar.a.put(WaveCoordinatorViewModel.class, f2Var);
            return bVar.a();
        }

        public final i0.e.b.f3.j.a b() {
            Object obj;
            Object obj2 = this.e;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.e;
                    if (obj instanceof j0.b.c) {
                        obj = new i0.e.b.f3.j.a(this.b.h());
                        j0.b.a.a(this.e, obj);
                        this.e = obj;
                    }
                }
                obj2 = obj;
            }
            return (i0.e.b.f3.j.a) obj2;
        }

        public final i0.e.b.f3.j.g c() {
            return new i0.e.b.f3.j.g(new i0.e.b.f3.j.h(this.b.h()), new i0.e.b.f3.j.i(this.b.h()), new i0.e.b.f3.j.c(this.b.h()), new i0.e.b.f3.j.b(this.b.h()));
        }

        public final UserRepo d() {
            Object obj;
            Object obj2 = this.d;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.d;
                    if (obj instanceof j0.b.c) {
                        i0.e.b.c3.j.a aVar = this.a;
                        i0.e.b.f3.i.a h = this.b.h();
                        Objects.requireNonNull(aVar);
                        m0.n.b.i.e(h, "userComponentHandler");
                        obj = ((i0.e.b.c3.i.a) i0.j.f.p.h.L0(h, i0.e.b.c3.i.a.class)).c();
                        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
                        j0.b.a.a(this.d, obj);
                        this.d = obj;
                    }
                }
                obj2 = obj;
            }
            return (UserRepo) obj2;
        }
    }

    /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
    public static final class f implements j0.a.a.c.a.d {
        public final l a;
        public Service b;

        public f(l lVar, a aVar) {
            this.a = lVar;
        }
    }

    /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
    public static final class g extends h {
        public final l a;

        public g(l lVar, Service service) {
            this.a = lVar;
        }

        public void a(PushListenerService pushListenerService) {
            pushListenerService.c2 = this.a.h();
            pushListenerService.d2 = l.m(this.a);
            pushListenerService.e2 = this.a.u();
        }

        public void b(ChannelService channelService) {
            channelService.Y1 = this.a.h();
            channelService.Z1 = new ChannelBroadcastReceiver();
        }
    }

    /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
    public static final class h implements i0.e.b.h3.a.c {
        public final l a;
        public UserSelf b;

        public h(l lVar, a aVar) {
            this.a = lVar;
        }
    }

    /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
    public static final class i extends j {
        public volatile Object A = new j0.b.c();
        public volatile Object B = new j0.b.c();
        public volatile Object C = new j0.b.c();
        public volatile Object D = new j0.b.c();
        public volatile Object E = new j0.b.c();
        public volatile Object F = new j0.b.c();
        public volatile Object G = new j0.b.c();
        public volatile Object H = new j0.b.c();
        public volatile Object I = new j0.b.c();
        public volatile Object J = new j0.b.c();
        public final i0.e.d.a.a a;
        public final UserSelf b;
        public final i0.e.c.g.c c;
        public final i0.e.e.l.c d;
        public final l e;
        public final i f = this;
        public volatile Object g = new j0.b.c();
        public volatile Object h = new j0.b.c();
        public volatile Object i = new j0.b.c();
        public volatile Object j = new j0.b.c();
        public volatile Object k = new j0.b.c();
        public volatile Object l = new j0.b.c();
        public volatile Object m = new j0.b.c();
        public volatile Object n = new j0.b.c();
        public volatile Object o = new j0.b.c();
        public volatile Object p = new j0.b.c();
        public volatile Object q = new j0.b.c();
        public volatile Object r = new j0.b.c();
        public volatile Object s = new j0.b.c();
        public volatile Object t = new j0.b.c();
        public volatile Object u = new j0.b.c();
        public volatile Object v = new j0.b.c();
        public volatile Object w = new j0.b.c();
        public volatile Object x = new j0.b.c();
        public volatile Object y = new j0.b.c();
        public volatile Object z = new j0.b.c();

        /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
        public static final class a implements i0.e.b.z2.e.b {
            public final l a;
            public final i b;
            public String c;
            public SourceLocation d;

            public a(l lVar, i iVar, a aVar) {
                this.a = lVar;
                this.b = iVar;
            }
        }

        /* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
        public static final class b extends e {
            public final String a;
            public final SourceLocation b;
            public final l c;
            public final i d;
            public volatile Object e = new j0.b.c();
            public volatile Object f = new j0.b.c();
            public volatile Object g = new j0.b.c();
            public volatile Object h = new j0.b.c();
            public volatile Object i = new j0.b.c();
            public volatile Object j = new j0.b.c();
            public volatile Object k = new j0.b.c();
            public volatile Object l = new j0.b.c();
            public volatile Object m = new j0.b.c();

            public b(l lVar, i iVar, String str, SourceLocation sourceLocation, a aVar) {
                this.c = lVar;
                this.d = iVar;
                this.a = str;
                this.b = sourceLocation;
            }

            public i0.e.b.a3.a.b a() {
                Object obj;
                Object obj2 = this.m;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.m;
                        if (obj instanceof j0.b.c) {
                            obj = new i0.e.b.a3.a.b();
                            j0.b.a.a(this.m, obj);
                            this.m = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (i0.e.b.a3.a.b) obj2;
            }

            public String b() {
                return this.a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.android.channels.analytics.ChannelLogger} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.android.channels.analytics.ChannelLogger} */
            /* JADX WARNING: type inference failed for: r1v3 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.clubhouse.android.channels.analytics.ChannelLogger c() {
                /*
                    r12 = this;
                    java.lang.Object r0 = r12.l
                    boolean r1 = r0 instanceof j0.b.c
                    if (r1 == 0) goto L_0x0042
                    monitor-enter(r0)
                    java.lang.Object r1 = r12.l     // Catch:{ all -> 0x003f }
                    boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x003f }
                    if (r2 == 0) goto L_0x003c
                    com.clubhouse.android.channels.analytics.ChannelLogger r1 = new com.clubhouse.android.channels.analytics.ChannelLogger     // Catch:{ all -> 0x003f }
                    n0.a.f0 r4 = r12.i()     // Catch:{ all -> 0x003f }
                    com.clubhouse.android.channels.mvi.ChannelControlModel r5 = r12.d()     // Catch:{ all -> 0x003f }
                    com.clubhouse.android.channels.mvi.ChannelControlModel r6 = r12.d()     // Catch:{ all -> 0x003f }
                    java.lang.String r7 = r12.a     // Catch:{ all -> 0x003f }
                    i0.e.b.l$i r2 = r12.d     // Catch:{ all -> 0x003f }
                    com.clubhouse.android.user.model.UserSelf r8 = r2.b     // Catch:{ all -> 0x003f }
                    com.clubhouse.android.data.repos.ChannelRepo r9 = r2.b()     // Catch:{ all -> 0x003f }
                    i0.e.b.l r2 = r12.c     // Catch:{ all -> 0x003f }
                    com.clubhouse.analytics.AmplitudeAnalytics r10 = r2.u()     // Catch:{ all -> 0x003f }
                    i0.e.b.l r2 = r12.c     // Catch:{ all -> 0x003f }
                    i0.e.a.b.a r11 = i0.e.b.l.m(r2)     // Catch:{ all -> 0x003f }
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x003f }
                    java.lang.Object r2 = r12.l     // Catch:{ all -> 0x003f }
                    j0.b.a.a(r2, r1)     // Catch:{ all -> 0x003f }
                    r12.l = r1     // Catch:{ all -> 0x003f }
                L_0x003c:
                    monitor-exit(r0)     // Catch:{ all -> 0x003f }
                    r0 = r1
                    goto L_0x0042
                L_0x003f:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x003f }
                    throw r1
                L_0x0042:
                    com.clubhouse.android.channels.analytics.ChannelLogger r0 = (com.clubhouse.android.channels.analytics.ChannelLogger) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.b.c():com.clubhouse.android.channels.analytics.ChannelLogger");
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.clubhouse.android.channels.mvi.ChannelControlModel} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.clubhouse.android.channels.mvi.ChannelControlModel} */
            /* JADX WARNING: type inference failed for: r0v3 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.clubhouse.android.channels.mvi.ChannelControlModel d() {
                /*
                    r18 = this;
                    r1 = r18
                    java.lang.Object r2 = r1.j
                    boolean r0 = r2 instanceof j0.b.c
                    if (r0 == 0) goto L_0x0066
                    monitor-enter(r2)
                    java.lang.Object r0 = r1.j     // Catch:{ all -> 0x0063 }
                    boolean r3 = r0 instanceof j0.b.c     // Catch:{ all -> 0x0063 }
                    if (r3 == 0) goto L_0x0060
                    com.clubhouse.android.channels.mvi.ChannelControlModel r0 = new com.clubhouse.android.channels.mvi.ChannelControlModel     // Catch:{ all -> 0x0063 }
                    i0.e.b.z2.g.k r5 = r18.g()     // Catch:{ all -> 0x0063 }
                    i0.e.b.l$i r3 = r1.d     // Catch:{ all -> 0x0063 }
                    com.clubhouse.android.shared.FeatureFlags r6 = r3.e()     // Catch:{ all -> 0x0063 }
                    i0.e.b.a3.a.b r7 = r18.a()     // Catch:{ all -> 0x0063 }
                    i0.e.b.l$i r3 = r1.d     // Catch:{ all -> 0x0063 }
                    com.clubhouse.android.data.repos.ChannelRepo r8 = r3.b()     // Catch:{ all -> 0x0063 }
                    i0.e.b.l$i r3 = r1.d     // Catch:{ all -> 0x0063 }
                    com.clubhouse.android.data.repos.UserRepo r9 = r3.c()     // Catch:{ all -> 0x0063 }
                    i0.e.b.l$i r3 = r1.d     // Catch:{ all -> 0x0063 }
                    com.clubhouse.wave.data.repos.DefaultWaveRepo r10 = r3.s()     // Catch:{ all -> 0x0063 }
                    i0.e.b.l r3 = r1.c     // Catch:{ all -> 0x0063 }
                    com.clubhouse.android.channels.rtc.RtcWrapper r11 = i0.e.b.l.n(r3)     // Catch:{ all -> 0x0063 }
                    i0.e.b.l$i r3 = r1.d     // Catch:{ all -> 0x0063 }
                    com.clubhouse.android.user.model.UserSelf r12 = r3.b     // Catch:{ all -> 0x0063 }
                    com.clubhouse.android.channels.pubsub.PubNubClient r13 = r18.h()     // Catch:{ all -> 0x0063 }
                    i0.e.b.z2.a r14 = r18.f()     // Catch:{ all -> 0x0063 }
                    i0.e.b.l r3 = r1.c     // Catch:{ all -> 0x0063 }
                    android.content.res.Resources r15 = i0.e.b.l.o(r3)     // Catch:{ all -> 0x0063 }
                    i0.e.b.l r3 = r1.c     // Catch:{ all -> 0x0063 }
                    i0.e.b.z2.d r16 = i0.e.b.l.p(r3)     // Catch:{ all -> 0x0063 }
                    i0.e.b.l r3 = r1.c     // Catch:{ all -> 0x0063 }
                    i0.e.b.f3.k.b r17 = r3.L()     // Catch:{ all -> 0x0063 }
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0063 }
                    java.lang.Object r3 = r1.j     // Catch:{ all -> 0x0063 }
                    j0.b.a.a(r3, r0)     // Catch:{ all -> 0x0063 }
                    r1.j = r0     // Catch:{ all -> 0x0063 }
                L_0x0060:
                    monitor-exit(r2)     // Catch:{ all -> 0x0063 }
                    r2 = r0
                    goto L_0x0066
                L_0x0063:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0063 }
                    throw r0
                L_0x0066:
                    com.clubhouse.android.channels.mvi.ChannelControlModel r2 = (com.clubhouse.android.channels.mvi.ChannelControlModel) r2
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.b.d():com.clubhouse.android.channels.mvi.ChannelControlModel");
            }

            public SpeakerStateDataSource e() {
                Object obj;
                Object obj2 = this.k;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.k;
                        if (obj instanceof j0.b.c) {
                            obj = new SpeakerStateDataSource(l.n(this.c), this.c.K(), i());
                            j0.b.a.a(this.k, obj);
                            this.k = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (SpeakerStateDataSource) obj2;
            }

            public final i0.e.b.z2.a f() {
                Object obj;
                Object obj2 = this.i;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.i;
                        if (obj instanceof j0.b.c) {
                            obj = new i0.e.b.z2.a(i(), this.c.J(), this.a);
                            j0.b.a.a(this.i, obj);
                            this.i = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (i0.e.b.z2.a) obj2;
            }

            public final i0.e.b.z2.g.k g() {
                Object obj;
                Object obj2 = this.e;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.e;
                        if (obj instanceof j0.b.c) {
                            String str = this.a;
                            SourceLocation sourceLocation = this.b;
                            ChannelRepo b2 = this.d.b();
                            m0.n.b.i.e(str, "channelId");
                            m0.n.b.i.e(sourceLocation, "sourceLocation");
                            m0.n.b.i.e(b2, "repo");
                            i0.e.b.z2.g.k kVar = new i0.e.b.z2.g.k(str, b2.f(str), sourceLocation, (i0.e.b.b3.a.a.c.a) null, (i0.e.b.b3.a.a.c.d) null, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131064, (m0.n.b.f) null);
                            j0.b.a.a(this.e, kVar);
                            this.e = kVar;
                            obj = kVar;
                        }
                    }
                    obj2 = obj;
                }
                return (i0.e.b.z2.g.k) obj2;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.android.channels.pubsub.PubNubClient} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.android.channels.pubsub.PubNubClient} */
            /* JADX WARNING: type inference failed for: r1v3 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.clubhouse.android.channels.pubsub.PubNubClient h() {
                /*
                    r10 = this;
                    java.lang.Object r0 = r10.h
                    boolean r1 = r0 instanceof j0.b.c
                    if (r1 == 0) goto L_0x003a
                    monitor-enter(r0)
                    java.lang.Object r1 = r10.h     // Catch:{ all -> 0x0037 }
                    boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x0037 }
                    if (r2 == 0) goto L_0x0034
                    com.clubhouse.android.channels.pubsub.PubNubClient r1 = new com.clubhouse.android.channels.pubsub.PubNubClient     // Catch:{ all -> 0x0037 }
                    com.pubnub.api.PubNub r4 = r10.j()     // Catch:{ all -> 0x0037 }
                    i0.e.b.l r2 = r10.c     // Catch:{ all -> 0x0037 }
                    n0.c.l.a r5 = r2.C()     // Catch:{ all -> 0x0037 }
                    i0.e.b.l r2 = r10.c     // Catch:{ all -> 0x0037 }
                    com.clubhouse.analytics.AmplitudeAnalytics r6 = r2.u()     // Catch:{ all -> 0x0037 }
                    java.lang.String r7 = r10.a     // Catch:{ all -> 0x0037 }
                    i0.e.b.l$i r2 = r10.d     // Catch:{ all -> 0x0037 }
                    com.clubhouse.android.user.model.UserSelf r8 = r2.b     // Catch:{ all -> 0x0037 }
                    n0.a.f0 r9 = r10.i()     // Catch:{ all -> 0x0037 }
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0037 }
                    java.lang.Object r2 = r10.h     // Catch:{ all -> 0x0037 }
                    j0.b.a.a(r2, r1)     // Catch:{ all -> 0x0037 }
                    r10.h = r1     // Catch:{ all -> 0x0037 }
                L_0x0034:
                    monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                    r0 = r1
                    goto L_0x003a
                L_0x0037:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                    throw r1
                L_0x003a:
                    com.clubhouse.android.channels.pubsub.PubNubClient r0 = (com.clubhouse.android.channels.pubsub.PubNubClient) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.b.h():com.clubhouse.android.channels.pubsub.PubNubClient");
            }

            public final f0 i() {
                Object obj;
                Object obj2 = this.g;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.g;
                        if (obj instanceof j0.b.c) {
                            i0.e.b.a3.a.b a2 = a();
                            m0.n.b.i.e(a2, "releaseCompletable");
                            x z = m0.r.t.a.r.m.a1.a.z((f1) null, 1);
                            d0 d0Var = m0.a;
                            f0 h2 = m0.r.t.a.r.m.a1.a.h(e.a.C0242a.d((JobSupport) z, n0.a.h2.o.c));
                            a2.a.E(new ChannelProviders$provideCoroutineScope$1$1(h2));
                            j0.b.a.a(this.g, h2);
                            this.g = h2;
                            obj = h2;
                        }
                    }
                    obj2 = obj;
                }
                return (f0) obj2;
            }

            public final PubNub j() {
                Object obj;
                Object obj2 = this.f;
                if (obj2 instanceof j0.b.c) {
                    synchronized (obj2) {
                        obj = this.f;
                        if (obj instanceof j0.b.c) {
                            obj = v.v1(this.c.v(), this.d.b);
                            j0.b.a.a(this.f, obj);
                            this.f = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (PubNub) obj2;
            }
        }

        public i(l lVar, i0.e.c.g.c cVar, i0.e.d.a.a aVar, i0.e.e.l.c cVar2, UserSelf userSelf, a aVar2) {
            this.e = lVar;
            this.a = aVar;
            this.b = userSelf;
            this.c = cVar;
            this.d = cVar2;
        }

        public final UserProfileDataSource A() {
            Object obj;
            Object obj2 = this.p;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.p;
                    if (obj instanceof j0.b.c) {
                        obj = new UserProfileDataSource(this.e.J(), this.e.K(), this.e.u());
                        j0.b.a.a(this.p, obj);
                        this.p = obj;
                    }
                }
                obj2 = obj;
            }
            return (UserProfileDataSource) obj2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.pubsub.user.client.UserPubNubClient} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.pubsub.user.client.UserPubNubClient} */
        /* JADX WARNING: type inference failed for: r1v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.clubhouse.pubsub.user.client.UserPubNubClient B() {
            /*
                r10 = this;
                java.lang.Object r0 = r10.n
                boolean r1 = r0 instanceof j0.b.c
                if (r1 == 0) goto L_0x003e
                monitor-enter(r0)
                java.lang.Object r1 = r10.n     // Catch:{ all -> 0x003b }
                boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x003b }
                if (r2 == 0) goto L_0x0038
                com.clubhouse.pubsub.user.client.UserPubNubClient r1 = new com.clubhouse.pubsub.user.client.UserPubNubClient     // Catch:{ all -> 0x003b }
                i0.e.b.l r2 = r10.e     // Catch:{ all -> 0x003b }
                n0.c.l.a r4 = r2.C()     // Catch:{ all -> 0x003b }
                com.pubnub.api.PubNub r5 = r10.E()     // Catch:{ all -> 0x003b }
                n0.a.f0 r6 = r10.D()     // Catch:{ all -> 0x003b }
                i0.e.b.a3.a.b r7 = r10.a()     // Catch:{ all -> 0x003b }
                i0.e.b.l r2 = r10.e     // Catch:{ all -> 0x003b }
                com.clubhouse.android.shared.auth.UserManager r8 = r2.K()     // Catch:{ all -> 0x003b }
                i0.e.b.l r2 = r10.e     // Catch:{ all -> 0x003b }
                i0.e.b.f3.i.a r9 = r2.h()     // Catch:{ all -> 0x003b }
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x003b }
                java.lang.Object r2 = r10.n     // Catch:{ all -> 0x003b }
                j0.b.a.a(r2, r1)     // Catch:{ all -> 0x003b }
                r10.n = r1     // Catch:{ all -> 0x003b }
            L_0x0038:
                monitor-exit(r0)     // Catch:{ all -> 0x003b }
                r0 = r1
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003b }
                throw r1
            L_0x003e:
                com.clubhouse.pubsub.user.client.UserPubNubClient r0 = (com.clubhouse.pubsub.user.client.UserPubNubClient) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.B():com.clubhouse.pubsub.user.client.UserPubNubClient");
        }

        public final i0.e.e.k.a.b C() {
            Object obj;
            l lVar = this.e;
            Object obj2 = lVar.M;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = lVar.M;
                    if (obj instanceof j0.b.c) {
                        i0.e.e.l.b bVar = lVar.f;
                        w.b I2 = lVar.I();
                        Objects.requireNonNull(bVar);
                        m0.n.b.i.e(I2, "retrofitBuilder");
                        obj = (i0.e.e.k.a.a) I2.c().b(i0.e.e.k.a.a.class);
                        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
                        j0.b.a.a(lVar.M, obj);
                        lVar.M = obj;
                    }
                }
                obj2 = obj;
            }
            return new i0.e.e.k.a.b((i0.e.e.k.a.a) obj2, this.e.y(), i0.j.f.p.h.m3(this.e.b));
        }

        public final f0 D() {
            Object obj;
            Object obj2 = this.j;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.j;
                    if (obj instanceof j0.b.c) {
                        i0.e.b.a3.a.b a2 = a();
                        m0.n.b.i.e(a2, "releaseCompletable");
                        f0 h2 = m0.r.t.a.r.m.a1.a.h(e.a.C0242a.d((JobSupport) m0.r.t.a.r.m.a1.a.z((f1) null, 1), m0.c));
                        a2.a.E(new UserModule$provideCoroutineScope$1$1(h2));
                        j0.b.a.a(this.j, h2);
                        this.j = h2;
                        obj = h2;
                    }
                }
                obj2 = obj;
            }
            return (f0) obj2;
        }

        public final PubNub E() {
            Object obj;
            Object obj2 = this.m;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.m;
                    if (obj instanceof j0.b.c) {
                        obj = v.w1(this.a, this.e.v(), this.b);
                        j0.b.a.a(this.m, obj);
                        this.m = obj;
                    }
                }
                obj2 = obj;
            }
            return (PubNub) obj2;
        }

        public i0.e.b.a3.a.b a() {
            Object obj;
            Object obj2 = this.C;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.C;
                    if (obj instanceof j0.b.c) {
                        obj = new i0.e.b.a3.a.b();
                        j0.b.a.a(this.C, obj);
                        this.C = obj;
                    }
                }
                obj2 = obj;
            }
            return (i0.e.b.a3.a.b) obj2;
        }

        public ChannelRepo b() {
            Object obj;
            Object obj2 = this.i;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.i;
                    if (obj instanceof j0.b.c) {
                        obj = new ChannelRepo(new FeedDataSource(this.e.J(), this.e.L(), c(), t()), this.e.J(), this.e.u());
                        j0.b.a.a(this.i, obj);
                        this.i = obj;
                    }
                }
                obj2 = obj;
            }
            return (ChannelRepo) obj2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.clubhouse.android.data.repos.UserRepo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.clubhouse.android.data.repos.UserRepo} */
        /* JADX WARNING: type inference failed for: r0v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.clubhouse.android.data.repos.UserRepo c() {
            /*
                r28 = this;
                r1 = r28
                java.lang.Object r2 = r1.r
                boolean r0 = r2 instanceof j0.b.c
                if (r0 == 0) goto L_0x00e2
                monitor-enter(r2)
                java.lang.Object r0 = r1.r     // Catch:{ all -> 0x00df }
                boolean r3 = r0 instanceof j0.b.c     // Catch:{ all -> 0x00df }
                if (r3 == 0) goto L_0x00dc
                com.clubhouse.android.data.repos.UserRepo r0 = new com.clubhouse.android.data.repos.UserRepo     // Catch:{ all -> 0x00df }
                com.clubhouse.android.core.storage.Store r5 = r28.x()     // Catch:{ all -> 0x00df }
                n0.a.f0 r6 = r28.D()     // Catch:{ all -> 0x00df }
                i0.e.b.l r3 = r1.e     // Catch:{ all -> 0x00df }
                com.clubhouse.android.data.network.ServerDataSource r7 = r3.J()     // Catch:{ all -> 0x00df }
                com.clubhouse.android.data.repos.EventRepo r8 = r28.o()     // Catch:{ all -> 0x00df }
                java.lang.Object r3 = r1.v     // Catch:{ all -> 0x00df }
                boolean r4 = r3 instanceof j0.b.c     // Catch:{ all -> 0x00df }
                if (r4 == 0) goto L_0x0042
                monitor-enter(r3)     // Catch:{ all -> 0x00df }
                java.lang.Object r4 = r1.v     // Catch:{ all -> 0x003f }
                boolean r9 = r4 instanceof j0.b.c     // Catch:{ all -> 0x003f }
                if (r9 == 0) goto L_0x003c
                i0.e.b.b3.c.d r4 = new i0.e.b.b3.c.d     // Catch:{ all -> 0x003f }
                r4.<init>()     // Catch:{ all -> 0x003f }
                java.lang.Object r9 = r1.v     // Catch:{ all -> 0x003f }
                j0.b.a.a(r9, r4)     // Catch:{ all -> 0x003f }
                r1.v = r4     // Catch:{ all -> 0x003f }
            L_0x003c:
                monitor-exit(r3)     // Catch:{ all -> 0x003f }
                r3 = r4
                goto L_0x0042
            L_0x003f:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x003f }
                throw r0     // Catch:{ all -> 0x00df }
            L_0x0042:
                r9 = r3
                i0.e.b.b3.c.d r9 = (i0.e.b.b3.c.d) r9     // Catch:{ all -> 0x00df }
                i0.e.b.b3.c.b r10 = r28.r()     // Catch:{ all -> 0x00df }
                i0.e.b.l r3 = r1.e     // Catch:{ all -> 0x00df }
                com.clubhouse.android.shared.auth.UserManager r11 = r3.K()     // Catch:{ all -> 0x00df }
                com.clubhouse.android.shared.FeatureFlags r12 = r28.e()     // Catch:{ all -> 0x00df }
                i0.e.b.f3.f r13 = r28.p()     // Catch:{ all -> 0x00df }
                i0.e.b.l r3 = r1.e     // Catch:{ all -> 0x00df }
                com.clubhouse.analytics.AmplitudeAnalytics r14 = r3.u()     // Catch:{ all -> 0x00df }
                com.clubhouse.android.data.safetynet.SafetyNetClient r3 = new com.clubhouse.android.data.safetynet.SafetyNetClient     // Catch:{ all -> 0x00df }
                i0.e.b.l r4 = r1.e     // Catch:{ all -> 0x00df }
                n0.a.f0 r16 = r4.N()     // Catch:{ all -> 0x00df }
                i0.e.b.l r4 = r1.e     // Catch:{ all -> 0x00df }
                j0.a.a.c.d.a r4 = r4.b     // Catch:{ all -> 0x00df }
                android.content.Context r17 = i0.j.f.p.h.m3(r4)     // Catch:{ all -> 0x00df }
                i0.e.b.l r4 = r1.e     // Catch:{ all -> 0x00df }
                i0.e.b.f3.c r18 = r4.v()     // Catch:{ all -> 0x00df }
                i0.e.b.l r4 = r1.e     // Catch:{ all -> 0x00df }
                com.clubhouse.analytics.AmplitudeAnalytics r19 = r4.u()     // Catch:{ all -> 0x00df }
                i0.e.b.l r4 = r1.e     // Catch:{ all -> 0x00df }
                i0.h.a.b.c.b r20 = r4.B()     // Catch:{ all -> 0x00df }
                r15 = r3
                r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00df }
                com.clubhouse.pubsub.user.client.UserPubNubClient r16 = r28.B()     // Catch:{ all -> 0x00df }
                com.clubhouse.android.data.network.MeDataSource r17 = r28.u()     // Catch:{ all -> 0x00df }
                com.clubhouse.android.data.network.UserProfileDataSource r18 = r28.A()     // Catch:{ all -> 0x00df }
                com.clubhouse.android.data.network.BuddyListDataSource r19 = r28.q()     // Catch:{ all -> 0x00df }
                i0.e.b.p2 r15 = new i0.e.b.p2     // Catch:{ all -> 0x00df }
                r15.<init>(r1)     // Catch:{ all -> 0x00df }
                i0.e.b.q2 r4 = new i0.e.b.q2     // Catch:{ all -> 0x00df }
                r4.<init>(r1)     // Catch:{ all -> 0x00df }
                r20 = r3
                i0.e.b.r2 r3 = new i0.e.b.r2     // Catch:{ all -> 0x00df }
                r3.<init>(r1)     // Catch:{ all -> 0x00df }
                r22 = r3
                i0.e.b.s2 r3 = new i0.e.b.s2     // Catch:{ all -> 0x00df }
                r3.<init>(r1)     // Catch:{ all -> 0x00df }
                r23 = r3
                i0.e.b.t2 r3 = new i0.e.b.t2     // Catch:{ all -> 0x00df }
                r3.<init>(r1)     // Catch:{ all -> 0x00df }
                r24 = r3
                i0.e.b.u2 r3 = new i0.e.b.u2     // Catch:{ all -> 0x00df }
                r3.<init>(r1)     // Catch:{ all -> 0x00df }
                r25 = r3
                i0.e.b.v2 r3 = new i0.e.b.v2     // Catch:{ all -> 0x00df }
                r3.<init>(r1)     // Catch:{ all -> 0x00df }
                r26 = r3
                i0.e.b.w2 r3 = new i0.e.b.w2     // Catch:{ all -> 0x00df }
                r3.<init>(r1)     // Catch:{ all -> 0x00df }
                r21 = r4
                r4 = r0
                r27 = r15
                r15 = r20
                r20 = r27
                r27 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x00df }
                java.lang.Object r3 = r1.r     // Catch:{ all -> 0x00df }
                j0.b.a.a(r3, r0)     // Catch:{ all -> 0x00df }
                r1.r = r0     // Catch:{ all -> 0x00df }
            L_0x00dc:
                monitor-exit(r2)     // Catch:{ all -> 0x00df }
                r2 = r0
                goto L_0x00e2
            L_0x00df:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00df }
                throw r0
            L_0x00e2:
                com.clubhouse.android.data.repos.UserRepo r2 = (com.clubhouse.android.data.repos.UserRepo) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.c():com.clubhouse.android.data.repos.UserRepo");
        }

        public ChannelComponentHandler d() {
            Object obj;
            Object obj2 = this.g;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.g;
                    if (obj instanceof j0.b.c) {
                        obj = new ChannelComponentHandler(new a(this.e, this.f, (a) null), b(), a());
                        j0.b.a.a(this.g, obj);
                        this.g = obj;
                    }
                }
                obj2 = obj;
            }
            return (ChannelComponentHandler) obj2;
        }

        public FeatureFlags e() {
            Object obj;
            Object obj2 = this.B;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.B;
                    if (obj instanceof j0.b.c) {
                        obj = new FeatureFlags(this.e.L());
                        j0.b.a.a(this.B, obj);
                        this.B = obj;
                    }
                }
                obj2 = obj;
            }
            return (FeatureFlags) obj2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo} */
        /* JADX WARNING: type inference failed for: r1v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i0.e.c.f.d.a f() {
            /*
                r13 = this;
                java.lang.Object r0 = r13.F
                boolean r1 = r0 instanceof j0.b.c
                if (r1 == 0) goto L_0x005d
                monitor-enter(r0)
                java.lang.Object r1 = r13.F     // Catch:{ all -> 0x005a }
                boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x005a }
                if (r2 == 0) goto L_0x0057
                com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo r1 = new com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo     // Catch:{ all -> 0x005a }
                i0.e.c.f.c.b r4 = new i0.e.c.f.c.b     // Catch:{ all -> 0x005a }
                i0.e.b.l r2 = r13.e     // Catch:{ all -> 0x005a }
                i0.e.c.f.c.a r2 = i0.e.b.l.k(r2)     // Catch:{ all -> 0x005a }
                i0.e.b.l r3 = r13.e     // Catch:{ all -> 0x005a }
                t0.h r3 = r3.y()     // Catch:{ all -> 0x005a }
                i0.e.b.l r5 = r13.e     // Catch:{ all -> 0x005a }
                j0.a.a.c.d.a r5 = r5.b     // Catch:{ all -> 0x005a }
                android.content.Context r5 = i0.j.f.p.h.m3(r5)     // Catch:{ all -> 0x005a }
                r4.<init>(r2, r3, r5)     // Catch:{ all -> 0x005a }
                i0.e.b.l r2 = r13.e     // Catch:{ all -> 0x005a }
                com.clubhouse.analytics.AmplitudeAnalytics r5 = r2.u()     // Catch:{ all -> 0x005a }
                i0.e.b.l r2 = r13.e     // Catch:{ all -> 0x005a }
                com.clubhouse.android.shared.auth.UserManager r6 = r2.K()     // Catch:{ all -> 0x005a }
                com.clubhouse.android.data.repos.UserRepo r7 = r13.c()     // Catch:{ all -> 0x005a }
                com.clubhouse.android.core.storage.Store r8 = r13.z()     // Catch:{ all -> 0x005a }
                com.clubhouse.android.core.storage.Store r9 = r13.y()     // Catch:{ all -> 0x005a }
                com.clubhouse.android.core.storage.Store r10 = r13.x()     // Catch:{ all -> 0x005a }
                n0.a.f0 r11 = r13.D()     // Catch:{ all -> 0x005a }
                com.clubhouse.pubsub.user.client.UserPubNubClient r12 = r13.B()     // Catch:{ all -> 0x005a }
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005a }
                java.lang.Object r2 = r13.F     // Catch:{ all -> 0x005a }
                j0.b.a.a(r2, r1)     // Catch:{ all -> 0x005a }
                r13.F = r1     // Catch:{ all -> 0x005a }
            L_0x0057:
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                r0 = r1
                goto L_0x005d
            L_0x005a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                throw r1
            L_0x005d:
                com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo r0 = (com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.f():i0.e.c.f.d.a");
        }

        public PhoneContactsRepo g() {
            Object obj;
            Object obj2 = this.u;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.u;
                    if (obj instanceof j0.b.c) {
                        obj = new PhoneContactsRepo(i0.j.f.p.h.l3(this.e.b));
                        j0.b.a.a(this.u, obj);
                        this.u = obj;
                    }
                }
                obj2 = obj;
            }
            return (PhoneContactsRepo) obj2;
        }

        public i0.e.e.k.b.a h() {
            return s();
        }

        public PaymentsRepo i() {
            Object obj;
            Object obj2 = this.z;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.z;
                    if (obj instanceof j0.b.c) {
                        obj = new PaymentsRepo(this.e.J(), new o2(this), this.e.u());
                        j0.b.a.a(this.z, obj);
                        this.z = obj;
                    }
                }
                obj2 = obj;
            }
            return (PaymentsRepo) obj2;
        }

        public NotificationRepo j() {
            Object obj;
            Object obj2 = this.w;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.w;
                    if (obj instanceof j0.b.c) {
                        obj = new NotificationRepo(this.e.J(), this.e.u());
                        j0.b.a.a(this.w, obj);
                        this.w = obj;
                    }
                }
                obj2 = obj;
            }
            return (NotificationRepo) obj2;
        }

        public i0.e.c.a k() {
            Object obj;
            Object obj2 = this.G;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.G;
                    if (obj instanceof j0.b.c) {
                        obj = new i0.e.c.a();
                        j0.b.a.a(this.G, obj);
                        this.G = obj;
                    }
                }
                obj2 = obj;
            }
            return (i0.e.c.a) obj2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.android.data.repos.ClubRepo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.android.data.repos.ClubRepo} */
        /* JADX WARNING: type inference failed for: r1v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.clubhouse.android.data.repos.ClubRepo l() {
            /*
                r15 = this;
                java.lang.Object r0 = r15.s
                boolean r1 = r0 instanceof j0.b.c
                if (r1 == 0) goto L_0x0059
                monitor-enter(r0)
                java.lang.Object r1 = r15.s     // Catch:{ all -> 0x0056 }
                boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x0056 }
                if (r2 == 0) goto L_0x0053
                com.clubhouse.android.data.repos.ClubRepo r1 = new com.clubhouse.android.data.repos.ClubRepo     // Catch:{ all -> 0x0056 }
                n0.a.f0 r4 = r15.D()     // Catch:{ all -> 0x0056 }
                i0.e.b.l r2 = r15.e     // Catch:{ all -> 0x0056 }
                j0.a.a.c.d.a r2 = r2.b     // Catch:{ all -> 0x0056 }
                android.content.Context r5 = i0.j.f.p.h.m3(r2)     // Catch:{ all -> 0x0056 }
                i0.e.b.l r2 = r15.e     // Catch:{ all -> 0x0056 }
                com.clubhouse.android.data.network.ServerDataSource r6 = r2.J()     // Catch:{ all -> 0x0056 }
                com.clubhouse.android.data.repos.UserRepo r7 = r15.c()     // Catch:{ all -> 0x0056 }
                com.clubhouse.android.data.repos.EventRepo r8 = r15.o()     // Catch:{ all -> 0x0056 }
                i0.e.b.l r2 = r15.e     // Catch:{ all -> 0x0056 }
                com.clubhouse.android.shared.auth.UserManager r9 = r2.K()     // Catch:{ all -> 0x0056 }
                i0.e.b.l r2 = r15.e     // Catch:{ all -> 0x0056 }
                com.clubhouse.analytics.AmplitudeAnalytics r10 = r2.u()     // Catch:{ all -> 0x0056 }
                i0.e.b.b3.c.b r11 = r15.r()     // Catch:{ all -> 0x0056 }
                i0.e.b.x2 r12 = new i0.e.b.x2     // Catch:{ all -> 0x0056 }
                r12.<init>(r15)     // Catch:{ all -> 0x0056 }
                i0.e.b.j2 r13 = new i0.e.b.j2     // Catch:{ all -> 0x0056 }
                r13.<init>(r15)     // Catch:{ all -> 0x0056 }
                i0.e.b.k2 r14 = new i0.e.b.k2     // Catch:{ all -> 0x0056 }
                r14.<init>(r15)     // Catch:{ all -> 0x0056 }
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0056 }
                java.lang.Object r2 = r15.s     // Catch:{ all -> 0x0056 }
                j0.b.a.a(r2, r1)     // Catch:{ all -> 0x0056 }
                r15.s = r1     // Catch:{ all -> 0x0056 }
            L_0x0053:
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                r0 = r1
                goto L_0x0059
            L_0x0056:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                throw r1
            L_0x0059:
                com.clubhouse.android.data.repos.ClubRepo r0 = (com.clubhouse.android.data.repos.ClubRepo) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.l():com.clubhouse.android.data.repos.ClubRepo");
        }

        public ActivityRepo m() {
            Object obj;
            Object obj2;
            Object obj3 = this.x;
            if (obj3 instanceof j0.b.c) {
                synchronized (obj3) {
                    obj = this.x;
                    if (obj instanceof j0.b.c) {
                        ServerDataSource J2 = this.e.J();
                        n2 n2Var = new n2(this);
                        Object obj4 = this.y;
                        if (obj4 instanceof j0.b.c) {
                            synchronized (obj4) {
                                obj2 = this.y;
                                if (obj2 instanceof j0.b.c) {
                                    obj2 = new i0.e.b.b3.c.a();
                                    j0.b.a.a(this.y, obj2);
                                    this.y = obj2;
                                }
                            }
                            obj4 = obj2;
                        }
                        obj = new ActivityRepo(J2, n2Var, (i0.e.b.b3.c.a) obj4, this.e.u());
                        j0.b.a.a(this.x, obj);
                        this.x = obj;
                    }
                }
                obj3 = obj;
            }
            return (ActivityRepo) obj3;
        }

        public InviteRepo n() {
            Object obj;
            l lVar = this.e;
            Object obj2 = lVar.G;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = lVar.G;
                    if (obj instanceof j0.b.c) {
                        obj = new InviteRepo(lVar.J(), lVar.L(), lVar.u());
                        j0.b.a.a(lVar.G, obj);
                        lVar.G = obj;
                    }
                }
                obj2 = obj;
            }
            return (InviteRepo) obj2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.android.data.repos.EventRepo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.android.data.repos.EventRepo} */
        /* JADX WARNING: type inference failed for: r1v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.clubhouse.android.data.repos.EventRepo o() {
            /*
                r9 = this;
                java.lang.Object r0 = r9.t
                boolean r1 = r0 instanceof j0.b.c
                if (r1 == 0) goto L_0x003a
                monitor-enter(r0)
                java.lang.Object r1 = r9.t     // Catch:{ all -> 0x0037 }
                boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x0037 }
                if (r2 == 0) goto L_0x0034
                com.clubhouse.android.data.repos.EventRepo r1 = new com.clubhouse.android.data.repos.EventRepo     // Catch:{ all -> 0x0037 }
                i0.e.b.l r2 = r9.e     // Catch:{ all -> 0x0037 }
                com.clubhouse.android.data.network.ServerDataSource r4 = r2.J()     // Catch:{ all -> 0x0037 }
                i0.e.b.l r2 = r9.e     // Catch:{ all -> 0x0037 }
                com.clubhouse.analytics.AmplitudeAnalytics r5 = r2.u()     // Catch:{ all -> 0x0037 }
                i0.e.b.b3.c.c r6 = r9.t()     // Catch:{ all -> 0x0037 }
                i0.e.b.l2 r7 = new i0.e.b.l2     // Catch:{ all -> 0x0037 }
                r7.<init>(r9)     // Catch:{ all -> 0x0037 }
                i0.e.b.m2 r8 = new i0.e.b.m2     // Catch:{ all -> 0x0037 }
                r8.<init>(r9)     // Catch:{ all -> 0x0037 }
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0037 }
                java.lang.Object r2 = r9.t     // Catch:{ all -> 0x0037 }
                j0.b.a.a(r2, r1)     // Catch:{ all -> 0x0037 }
                r9.t = r1     // Catch:{ all -> 0x0037 }
            L_0x0034:
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                r0 = r1
                goto L_0x003a
            L_0x0037:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                throw r1
            L_0x003a:
                com.clubhouse.android.data.repos.EventRepo r0 = (com.clubhouse.android.data.repos.EventRepo) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.o():com.clubhouse.android.data.repos.EventRepo");
        }

        public i0.e.b.f3.f p() {
            Object obj;
            Object obj2 = this.A;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.A;
                    if (obj instanceof j0.b.c) {
                        obj = new i0.e.b.f3.f(this.e.L(), l.m(this.e));
                        j0.b.a.a(this.A, obj);
                        this.A = obj;
                    }
                }
                obj2 = obj;
            }
            return (i0.e.b.f3.f) obj2;
        }

        public final BuddyListDataSource q() {
            Object obj;
            Object obj2 = this.q;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.q;
                    if (obj instanceof j0.b.c) {
                        obj = new BuddyListDataSource(this.e.J(), this.e.u(), x());
                        j0.b.a.a(this.q, obj);
                        this.q = obj;
                    }
                }
                obj2 = obj;
            }
            return (BuddyListDataSource) obj2;
        }

        public final i0.e.b.b3.c.b r() {
            Object obj;
            Object obj2 = this.l;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.l;
                    if (obj instanceof j0.b.c) {
                        obj = new i0.e.b.b3.c.b();
                        j0.b.a.a(this.l, obj);
                        this.l = obj;
                    }
                }
                obj2 = obj;
            }
            return (i0.e.b.b3.c.b) obj2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.clubhouse.wave.data.repos.DefaultWaveRepo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.clubhouse.wave.data.repos.DefaultWaveRepo} */
        /* JADX WARNING: type inference failed for: r1v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.clubhouse.wave.data.repos.DefaultWaveRepo s() {
            /*
                r11 = this;
                java.lang.Object r0 = r11.J
                boolean r1 = r0 instanceof j0.b.c
                if (r1 == 0) goto L_0x003c
                monitor-enter(r0)
                java.lang.Object r1 = r11.J     // Catch:{ all -> 0x0039 }
                boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x0039 }
                if (r2 == 0) goto L_0x0036
                com.clubhouse.wave.data.repos.DefaultWaveRepo r1 = new com.clubhouse.wave.data.repos.DefaultWaveRepo     // Catch:{ all -> 0x0039 }
                i0.e.e.k.a.b r4 = r11.C()     // Catch:{ all -> 0x0039 }
                com.clubhouse.android.core.storage.Store r5 = r11.w()     // Catch:{ all -> 0x0039 }
                com.clubhouse.android.core.storage.Store r6 = r11.v()     // Catch:{ all -> 0x0039 }
                com.clubhouse.android.core.storage.Store r7 = r11.x()     // Catch:{ all -> 0x0039 }
                n0.a.f0 r8 = r11.D()     // Catch:{ all -> 0x0039 }
                com.clubhouse.android.data.repos.UserRepo r9 = r11.c()     // Catch:{ all -> 0x0039 }
                com.clubhouse.pubsub.user.client.UserPubNubClient r10 = r11.B()     // Catch:{ all -> 0x0039 }
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0039 }
                java.lang.Object r2 = r11.J     // Catch:{ all -> 0x0039 }
                j0.b.a.a(r2, r1)     // Catch:{ all -> 0x0039 }
                r11.J = r1     // Catch:{ all -> 0x0039 }
            L_0x0036:
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                r0 = r1
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                throw r1
            L_0x003c:
                com.clubhouse.wave.data.repos.DefaultWaveRepo r0 = (com.clubhouse.wave.data.repos.DefaultWaveRepo) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.i.s():com.clubhouse.wave.data.repos.DefaultWaveRepo");
        }

        public final i0.e.b.b3.c.c t() {
            Object obj;
            Object obj2 = this.h;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.h;
                    if (obj instanceof j0.b.c) {
                        obj = new i0.e.b.b3.c.c();
                        j0.b.a.a(this.h, obj);
                        this.h = obj;
                    }
                }
                obj2 = obj;
            }
            return (i0.e.b.b3.c.c) obj2;
        }

        public final MeDataSource u() {
            Object obj;
            Object obj2 = this.o;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.o;
                    if (obj instanceof j0.b.c) {
                        obj = new MeDataSource(this.e.J(), this.e.z(), this.e.u());
                        j0.b.a.a(this.o, obj);
                        this.o = obj;
                    }
                }
                obj2 = obj;
            }
            return (MeDataSource) obj2;
        }

        public final Store<Integer, ReceivedWave> v() {
            Object obj;
            Object obj2 = this.I;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.I;
                    if (obj instanceof j0.b.c) {
                        i0.e.e.l.c cVar = this.d;
                        f0 D2 = D();
                        Objects.requireNonNull(cVar);
                        m0.n.b.i.e(D2, "coroutineScope");
                        obj = new Store(D2);
                        j0.b.a.a(this.I, obj);
                        this.I = obj;
                    }
                }
                obj2 = obj;
            }
            return (Store) obj2;
        }

        public final Store<Integer, SentWave> w() {
            Object obj;
            Object obj2 = this.H;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.H;
                    if (obj instanceof j0.b.c) {
                        i0.e.e.l.c cVar = this.d;
                        f0 D2 = D();
                        Objects.requireNonNull(cVar);
                        m0.n.b.i.e(D2, "coroutineScope");
                        obj = new Store(D2);
                        j0.b.a.a(this.H, obj);
                        this.H = obj;
                    }
                }
                obj2 = obj;
            }
            return (Store) obj2;
        }

        public final Store<Integer, i0.e.b.b3.a.a.f.a> x() {
            Object obj;
            Object obj2 = this.k;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.k;
                    if (obj instanceof j0.b.c) {
                        f0 D2 = D();
                        m0.n.b.i.e(D2, "coroutineScope");
                        Store store = new Store(D2);
                        j0.b.a.a(this.k, store);
                        this.k = store;
                        obj = store;
                    }
                }
                obj2 = obj;
            }
            return (Store) obj2;
        }

        public final Store<String, Chat> y() {
            Object obj;
            Object obj2 = this.E;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.E;
                    if (obj instanceof j0.b.c) {
                        i0.e.c.g.c cVar = this.c;
                        f0 D2 = D();
                        Objects.requireNonNull(cVar);
                        m0.n.b.i.e(D2, "coroutineScope");
                        obj = new Store(D2);
                        j0.b.a.a(this.E, obj);
                        this.E = obj;
                    }
                }
                obj2 = obj;
            }
            return (Store) obj2;
        }

        public final Store<String, ChatMessage> z() {
            Object obj;
            Object obj2 = this.D;
            if (obj2 instanceof j0.b.c) {
                synchronized (obj2) {
                    obj = this.D;
                    if (obj instanceof j0.b.c) {
                        i0.e.c.g.c cVar = this.c;
                        f0 D2 = D();
                        Objects.requireNonNull(cVar);
                        m0.n.b.i.e(D2, "coroutineScope");
                        obj = new Store(D2);
                        j0.b.a.a(this.D, obj);
                        this.D = obj;
                    }
                }
                obj2 = obj;
            }
            return (Store) obj2;
        }
    }

    public l(i0.e.b.c3.a aVar, j0.a.a.c.d.a aVar2, i0.e.b.c3.g.c cVar, i0.e.c.g.b bVar, i0.e.b.c3.d dVar, i0.e.e.l.b bVar2, a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = cVar;
        this.d = dVar;
        this.e = bVar;
        this.f = bVar2;
    }

    public static UpdatesRepo j(l lVar) {
        Object obj;
        Object obj2 = lVar.U;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.U;
                if (obj instanceof j0.b.c) {
                    obj = new UpdatesRepo(lVar.J(), lVar.u());
                    j0.b.a.a(lVar.U, obj);
                    lVar.U = obj;
                }
            }
            obj2 = obj;
        }
        return (UpdatesRepo) obj2;
    }

    public static i0.e.c.f.c.a k(l lVar) {
        Object obj;
        Object obj2 = lVar.L;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.L;
                if (obj instanceof j0.b.c) {
                    i0.e.c.g.b bVar = lVar.e;
                    w.b I2 = lVar.I();
                    Objects.requireNonNull(bVar);
                    m0.n.b.i.e(I2, "retrofitBuilder");
                    obj = (i0.e.c.f.c.a) I2.c().b(i0.e.c.f.c.a.class);
                    Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
                    j0.b.a.a(lVar.L, obj);
                    lVar.L = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.e.c.f.c.a) obj2;
    }

    public static TopicRepo l(l lVar) {
        Object obj;
        Object obj2 = lVar.H;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.H;
                if (obj instanceof j0.b.c) {
                    obj = new TopicRepo(lVar.J());
                    j0.b.a.a(lVar.H, obj);
                    lVar.H = obj;
                }
            }
            obj2 = obj;
        }
        return (TopicRepo) obj2;
    }

    public static i0.e.a.b.a m(l lVar) {
        Object obj;
        Object obj2 = lVar.K;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.K;
                if (obj instanceof j0.b.c) {
                    obj = new i0.e.a.b.a(lVar.t(), lVar.z());
                    j0.b.a.a(lVar.K, obj);
                    lVar.K = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.e.a.b.a) obj2;
    }

    public static RtcWrapper n(l lVar) {
        Object obj;
        Object obj2 = lVar.N;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.N;
                if (obj instanceof j0.b.c) {
                    obj = new RtcWrapper(i0.j.f.p.h.m3(lVar.b), lVar.v(), lVar.K(), lVar.u());
                    j0.b.a.a(lVar.N, obj);
                    lVar.N = obj;
                }
            }
            obj2 = obj;
        }
        return (RtcWrapper) obj2;
    }

    public static Resources o(l lVar) {
        Object obj;
        Object obj2 = lVar.O;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.O;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.a aVar = lVar.a;
                    Context m3 = i0.j.f.p.h.m3(lVar.b);
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(m3, "context");
                    obj = m3.getResources();
                    Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
                    j0.b.a.a(lVar.O, obj);
                    lVar.O = obj;
                }
            }
            obj2 = obj;
        }
        return (Resources) obj2;
    }

    public static i0.e.b.z2.d p(l lVar) {
        Object obj;
        Object obj2 = lVar.P;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.P;
                if (obj instanceof j0.b.c) {
                    obj = new i0.e.b.z2.d(i0.j.f.p.h.m3(lVar.b));
                    j0.b.a.a(lVar.P, obj);
                    lVar.P = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.e.b.z2.d) obj2;
    }

    public static OnboardingRepo q(l lVar) {
        Object obj;
        Object obj2 = lVar.Q;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.Q;
                if (obj instanceof j0.b.c) {
                    obj = new OnboardingRepo(lVar.J(), lVar.K(), lVar.u(), new SafetyNetClient(lVar.N(), i0.j.f.p.h.m3(lVar.b), lVar.v(), lVar.u(), lVar.B()));
                    j0.b.a.a(lVar.Q, obj);
                    lVar.Q = obj;
                }
            }
            obj2 = obj;
        }
        return (OnboardingRepo) obj2;
    }

    public static LanguageRepo r(l lVar) {
        Object obj;
        Object obj2 = lVar.S;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.S;
                if (obj instanceof j0.b.c) {
                    obj = new LanguageRepo(lVar.J());
                    j0.b.a.a(lVar.S, obj);
                    lVar.S = obj;
                }
            }
            obj2 = obj;
        }
        return (LanguageRepo) obj2;
    }

    public static OAuthAuthentication s(l lVar) {
        Object obj;
        Object obj2 = lVar.T;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = lVar.T;
                if (obj instanceof j0.b.c) {
                    obj = new OAuthAuthentication(i0.j.f.p.h.m3(lVar.b), lVar.v());
                    j0.b.a.a(lVar.T, obj);
                    lVar.T = obj;
                }
            }
            obj2 = obj;
        }
        return (OAuthAuthentication) obj2;
    }

    public final i0.k.a.a A() {
        Object obj;
        Object obj2 = this.r;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.r;
                if (obj instanceof j0.b.c) {
                    obj = v.t1(this.c, i0.j.f.p.h.m3(this.b));
                    j0.b.a.a(this.r, obj);
                    this.r = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.k.a.a) obj2;
    }

    public final i0.h.a.b.c.b B() {
        Object obj;
        Object obj2 = this.F;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.F;
                if (obj instanceof j0.b.c) {
                    Objects.requireNonNull(this.c);
                    Object obj3 = i0.h.a.b.c.b.b;
                    obj = i0.h.a.b.c.b.c;
                    m0.n.b.i.d(obj, "getInstance()");
                    j0.b.a.a(this.F, obj);
                    this.F = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.h.a.b.c.b) obj2;
    }

    public final n0.c.l.a C() {
        Object obj;
        Object obj2;
        Object obj3 = this.j;
        if (obj3 instanceof j0.b.c) {
            synchronized (obj3) {
                obj = this.j;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.a aVar = this.a;
                    Object obj4 = this.i;
                    if (obj4 instanceof j0.b.c) {
                        synchronized (obj4) {
                            obj2 = this.i;
                            if (obj2 instanceof j0.b.c) {
                                obj2 = v.y1(this.a);
                                j0.b.a.a(this.i, obj2);
                                this.i = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    n0.c.m.b bVar = (n0.c.m.b) obj4;
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(bVar, "serializers");
                    obj = m0.r.t.a.r.m.a1.a.o((n0.c.l.a) null, new ApiModule$provideJson$1(bVar), 1);
                    j0.b.a.a(this.j, obj);
                    this.j = obj;
                }
            }
            obj3 = obj;
        }
        return (n0.c.l.a) obj3;
    }

    public final a0 D() {
        Object obj;
        Object obj2 = this.B;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.B;
                if (obj instanceof j0.b.c) {
                    Objects.requireNonNull(this.d);
                    a0 a0Var = new a0(new a0.a());
                    j0.b.a.a(this.B, a0Var);
                    this.B = a0Var;
                    obj = a0Var;
                }
            }
            obj2 = obj;
        }
        return (a0) obj2;
    }

    public final SharedPreferences E() {
        Object obj;
        Object obj2 = this.h;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.h;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.a aVar = this.a;
                    Context m3 = i0.j.f.p.h.m3(this.b);
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(m3, "context");
                    obj = m3.getSharedPreferences("AUTH_PREF", 0);
                    Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
                    j0.b.a.a(this.h, obj);
                    this.h = obj;
                }
            }
            obj2 = obj;
        }
        return (SharedPreferences) obj2;
    }

    public final SharedPreferences F() {
        Object obj;
        Object obj2 = this.s;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.s;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.a aVar = this.a;
                    Context m3 = i0.j.f.p.h.m3(this.b);
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(m3, "context");
                    obj = m3.getSharedPreferences("DEVICE_PREF", 0);
                    Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
                    j0.b.a.a(this.s, obj);
                    this.s = obj;
                }
            }
            obj2 = obj;
        }
        return (SharedPreferences) obj2;
    }

    public final i0.o.a.q G() {
        Object obj;
        Object obj2 = this.C;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.C;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.d dVar = this.d;
                    a0 D2 = D();
                    Objects.requireNonNull(dVar);
                    m0.n.b.i.e(D2, "okHttpClient");
                    obj = new i0.o.a.q(D2);
                    j0.b.a.a(this.C, obj);
                    this.C = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.o.a.q) obj2;
    }

    public final a0 H() {
        Object obj;
        Object obj2 = this.v;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.v;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.a aVar = this.a;
                    i0.e.b.b3.b.c w2 = w();
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(w2, "interceptor");
                    a0.a aVar2 = new a0.a();
                    aVar2.a(w2);
                    a0 a0Var = new a0(aVar2);
                    j0.b.a.a(this.v, a0Var);
                    this.v = a0Var;
                    obj = a0Var;
                }
            }
            obj2 = obj;
        }
        return (a0) obj2;
    }

    public final w.b I() {
        Object obj;
        Object obj2 = this.x;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.x;
                if (obj instanceof j0.b.c) {
                    obj = v.x1(this.a, v(), H(), x());
                    j0.b.a.a(this.x, obj);
                    this.x = obj;
                }
            }
            obj2 = obj;
        }
        return (w.b) obj2;
    }

    public final ServerDataSource J() {
        Object obj;
        Object obj2 = this.y;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.y;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.a aVar = this.a;
                    w.b I2 = I();
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(I2, "retrofitBuilder");
                    obj = (i0.e.b.b3.b.b) I2.c().b(i0.e.b.b3.b.b.class);
                    Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
                    j0.b.a.a(this.y, obj);
                    this.y = obj;
                }
            }
            obj2 = obj;
        }
        return new ServerDataSource((i0.e.b.b3.b.b) obj2, K(), y(), i0.j.f.p.h.m3(this.b));
    }

    public final UserManager K() {
        Object obj;
        Object obj2 = this.o;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.o;
                if (obj instanceof j0.b.c) {
                    obj = new UserManager(M(), h(), u());
                    j0.b.a.a(this.o, obj);
                    this.o = obj;
                }
            }
            obj2 = obj;
        }
        return (UserManager) obj2;
    }

    public final i0.e.b.f3.k.b L() {
        Object obj;
        Object obj2 = this.k;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.k;
                if (obj instanceof j0.b.c) {
                    obj = new i0.e.b.f3.k.b(E(), C());
                    j0.b.a.a(this.k, obj);
                    this.k = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.e.b.f3.k.b) obj2;
    }

    public final i0.e.b.f3.i.c M() {
        Object obj;
        Object obj2 = this.l;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.l;
                if (obj instanceof j0.b.c) {
                    obj = new i0.e.b.f3.i.c(L());
                    j0.b.a.a(this.l, obj);
                    this.l = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.e.b.f3.i.c) obj2;
    }

    public final f0 N() {
        Object obj;
        Object obj2 = this.p;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.p;
                if (obj instanceof j0.b.c) {
                    Objects.requireNonNull(this.c);
                    x z2 = m0.r.t.a.r.m.a1.a.z((f1) null, 1);
                    d0 d0Var = m0.a;
                    obj = m0.r.t.a.r.m.a1.a.h(e.a.C0242a.d((JobSupport) z2, n0.a.h2.o.c));
                    j0.b.a.a(this.p, obj);
                    this.p = obj;
                }
            }
            obj2 = obj;
        }
        return (f0) obj2;
    }

    public final n O() {
        Object obj;
        Object obj2 = this.I;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.I;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.g.c cVar = this.c;
                    Context m3 = i0.j.f.p.h.m3(this.b);
                    Objects.requireNonNull(cVar);
                    m0.n.b.i.e(m3, "context");
                    obj = h0.g0.r.l.c(m3);
                    m0.n.b.i.d(obj, "getInstance(context)");
                    j0.b.a.a(this.I, obj);
                    this.I = obj;
                }
            }
            obj2 = obj;
        }
        return (n) obj2;
    }

    public j0.a.a.c.a.d a() {
        return new f(this.g, (a) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.clubhouse.android.util.Monitoring} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.clubhouse.android.util.Monitoring} */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.clubhouse.android.ClubhouseApplication r11) {
        /*
            r10 = this;
            com.clubhouse.android.shared.auth.UserManager r0 = r10.K()
            r11.q = r0
            java.lang.Object r0 = r10.q
            boolean r1 = r0 instanceof j0.b.c
            if (r1 == 0) goto L_0x0040
            monitor-enter(r0)
            java.lang.Object r1 = r10.q     // Catch:{ all -> 0x003d }
            boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003a
            com.clubhouse.android.util.Monitoring r1 = new com.clubhouse.android.util.Monitoring     // Catch:{ all -> 0x003d }
            com.clubhouse.android.shared.auth.UserManager r4 = r10.K()     // Catch:{ all -> 0x003d }
            i0.e.b.f3.c r5 = r10.v()     // Catch:{ all -> 0x003d }
            com.clubhouse.analytics.AmplitudeAnalytics r6 = r10.u()     // Catch:{ all -> 0x003d }
            n0.a.f0 r7 = r10.N()     // Catch:{ all -> 0x003d }
            j0.a.a.c.d.a r2 = r10.b     // Catch:{ all -> 0x003d }
            android.app.Application r8 = i0.j.f.p.h.l3(r2)     // Catch:{ all -> 0x003d }
            i0.e.b.f3.i.a r9 = r10.h()     // Catch:{ all -> 0x003d }
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x003d }
            java.lang.Object r2 = r10.q     // Catch:{ all -> 0x003d }
            j0.b.a.a(r2, r1)     // Catch:{ all -> 0x003d }
            r10.q = r1     // Catch:{ all -> 0x003d }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            r0 = r1
            goto L_0x0040
        L_0x003d:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r11
        L_0x0040:
            com.clubhouse.android.util.Monitoring r0 = (com.clubhouse.android.util.Monitoring) r0
            java.lang.Object r0 = r10.A
            boolean r1 = r0 instanceof j0.b.c
            if (r1 == 0) goto L_0x0071
            monitor-enter(r0)
            java.lang.Object r1 = r10.A     // Catch:{ all -> 0x006e }
            boolean r2 = r1 instanceof j0.b.c     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x006b
            i0.e.a.b.b r1 = new i0.e.a.b.b     // Catch:{ all -> 0x006e }
            n0.c.l.a r2 = r10.C()     // Catch:{ all -> 0x006e }
            i0.k.a.a r3 = r10.A()     // Catch:{ all -> 0x006e }
            com.clubhouse.android.data.network.ServerDataSource r4 = r10.J()     // Catch:{ all -> 0x006e }
            com.clubhouse.analytics.AmplitudeAnalytics r5 = r10.u()     // Catch:{ all -> 0x006e }
            r1.<init>(r2, r3, r4, r5)     // Catch:{ all -> 0x006e }
            java.lang.Object r2 = r10.A     // Catch:{ all -> 0x006e }
            j0.b.a.a(r2, r1)     // Catch:{ all -> 0x006e }
            r10.A = r1     // Catch:{ all -> 0x006e }
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            r0 = r1
            goto L_0x0071
        L_0x006e:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r11
        L_0x0071:
            i0.e.a.b.b r0 = (i0.e.a.b.b) r0
            r11.x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.l.b(com.clubhouse.android.ClubhouseApplication):void");
    }

    public i0.e.a.a c() {
        return u();
    }

    public Picasso d() {
        Object obj;
        Object obj2 = this.D;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.D;
                if (obj instanceof j0.b.c) {
                    obj = v.u1(this.d, i0.j.f.p.h.m3(this.b), G());
                    j0.b.a.a(this.D, obj);
                    this.D = obj;
                }
            }
            obj2 = obj;
        }
        return (Picasso) obj2;
    }

    public i0.e.b.f3.i.a e() {
        return h();
    }

    public Map<FragmentName, i0.e.b.c3.b> f() {
        j0.b.b bVar = new j0.b.b(4);
        bVar.a.put(FragmentName.HALF_PROFILE, new i0.e.b.c3.b(m.a(HalfProfileContainerFragment.class)));
        bVar.a.put(FragmentName.BACKCHANNEL_INBOX, new i0.e.b.c3.b(m.a(BackchannelContainerFragment.class)));
        bVar.a.put(FragmentName.BACKCHANNEL_INBOX_MODAL, new i0.e.b.c3.b(m.a(BackchannelModalContainerFragment.class)));
        bVar.a.put(FragmentName.REPORT_INCIDENT_SELECT_CATEGORY, new i0.e.b.c3.b(m.a(ReportIncidentSelectCategoryContainerFragment.class)));
        return bVar.a();
    }

    public i0.e.b.c3.h.d g() {
        return new d(this.g, (a) null);
    }

    public i0.e.b.f3.i.a h() {
        Object obj;
        Object obj2 = this.E;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.E;
                if (obj instanceof j0.b.c) {
                    obj = new i0.e.b.f3.i.a(new h(this.g, (a) null));
                    j0.b.a.a(this.E, obj);
                    this.E = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.e.b.f3.i.a) obj2;
    }

    public j0.a.a.c.a.b i() {
        return new b(this.g, (a) null);
    }

    public final ActionTrailUploader t() {
        Object obj;
        Object obj2 = this.J;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.J;
                if (obj instanceof j0.b.c) {
                    obj = new ActionTrailUploader(O(), C(), A());
                    j0.b.a.a(this.J, obj);
                    this.J = obj;
                }
            }
            obj2 = obj;
        }
        return (ActionTrailUploader) obj2;
    }

    public final AmplitudeAnalytics u() {
        Object obj;
        Object obj2 = this.n;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.n;
                if (obj instanceof j0.b.c) {
                    obj = new AmplitudeAnalytics(i0.j.f.p.h.m3(this.b), v(), h());
                    j0.b.a.a(this.n, obj);
                    this.n = obj;
                }
            }
            obj2 = obj;
        }
        return (AmplitudeAnalytics) obj2;
    }

    public final i0.e.b.f3.c v() {
        Object obj;
        Object obj2 = this.m;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.m;
                if (obj instanceof j0.b.c) {
                    obj = new i0.e.b.f3.c();
                    j0.b.a.a(this.m, obj);
                    this.m = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.e.b.f3.c) obj2;
    }

    public final i0.e.b.b3.b.c w() {
        Object obj;
        Object obj2 = this.u;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.u;
                if (obj instanceof j0.b.c) {
                    Objects.requireNonNull(this.a);
                    obj = new i0.e.b.b3.b.c("clubhouse/android/4734", M(), z(), K());
                    j0.b.a.a(this.u, obj);
                    this.u = obj;
                }
            }
            obj2 = obj;
        }
        return (i0.e.b.b3.b.c) obj2;
    }

    public final h.a x() {
        Object obj;
        Object obj2 = this.w;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.w;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.a aVar = this.a;
                    n0.c.l.a C2 = C();
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(C2, "json");
                    y.a aVar2 = y.c;
                    y a2 = y.a.a(NetworkLog.JSON);
                    m0.n.b.i.e(C2, "$this$asConverterFactory");
                    m0.n.b.i.e(a2, "contentType");
                    i0.k.b.a.a.a.b bVar = new i0.k.b.a.a.a.b(a2, new d.a(C2));
                    j0.b.a.a(this.w, bVar);
                    this.w = bVar;
                    obj = bVar;
                }
            }
            obj2 = obj;
        }
        return (h.a) obj2;
    }

    public final t0.h<q0.f0, ErrorResponse> y() {
        Object obj;
        Object obj2 = this.z;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.z;
                if (obj instanceof j0.b.c) {
                    i0.e.b.c3.a aVar = this.a;
                    w.b I2 = I();
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(I2, "retrofitBuilder");
                    obj = I2.c().e(ErrorResponse.class, new Annotation[0]);
                    m0.n.b.i.d(obj, "retrofitBuilder.build().responseBodyConverter(\n            ErrorResponse::class.java,\n            emptyArray<Annotation>()\n        )");
                    j0.b.a.a(this.z, obj);
                    this.z = obj;
                }
            }
            obj2 = obj;
        }
        return (t0.h) obj2;
    }

    public final DeviceSharedPreferences z() {
        Object obj;
        Object obj2 = this.t;
        if (obj2 instanceof j0.b.c) {
            synchronized (obj2) {
                obj = this.t;
                if (obj instanceof j0.b.c) {
                    obj = new DeviceSharedPreferences(F(), i0.j.f.p.h.m3(this.b));
                    j0.b.a.a(this.t, obj);
                    this.t = obj;
                }
            }
            obj2 = obj;
        }
        return (DeviceSharedPreferences) obj2;
    }
}
