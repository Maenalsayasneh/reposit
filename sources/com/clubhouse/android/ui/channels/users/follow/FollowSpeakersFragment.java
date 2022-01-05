package com.clubhouse.android.ui.channels.users.follow;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.shared.ui.AbstractUserFragment;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.clubhouse.app.R;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.b3.b.e.d;
import i0.e.b.g3.k.w0.a.b;
import i0.e.b.g3.k.w0.a.e;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0014@\u0014X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/channels/users/follow/FollowSpeakersFragment;", "Lcom/clubhouse/android/shared/ui/AbstractUserFragment;", "Li0/e/b/b3/b/e/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "U0", "()V", "J", "Lcom/clubhouse/android/ui/channels/users/follow/FollowSpeakersViewModel;", "s2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/channels/users/follow/FollowSpeakersViewModel;", "viewModel", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "t2", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "T0", "()Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "setPagedController", "(Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;)V", "pagedController", "<init>", "UserController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: FollowSpeakersFragment.kt */
public final class FollowSpeakersFragment extends AbstractUserFragment<d> {
    public static final /* synthetic */ k<Object>[] r2 = {m.c(new PropertyReference1Impl(m.a(FollowSpeakersFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/channels/users/follow/FollowSpeakersViewModel;"))};
    public final c s2;
    public PagingDataEpoxyController<d> t2 = new UserController(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/clubhouse/android/ui/channels/users/follow/FollowSpeakersFragment$UserController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/d;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/b3/b/e/d;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/channels/users/follow/FollowSpeakersFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FollowSpeakersFragment.kt */
    public final class UserController extends PagingDataEpoxyController<d> {
        public final /* synthetic */ FollowSpeakersFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserController(FollowSpeakersFragment followSpeakersFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(followSpeakersFragment, "this$0");
            this.this$0 = followSpeakersFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m21buildItemModel$lambda0(FollowSpeakersFragment followSpeakersFragment, d dVar, View view) {
            i.e(followSpeakersFragment, "this$0");
            UserInChannel userInChannel = dVar.g;
            SourceLocation sourceLocation = SourceLocation.SUGGESTED_SPEAKERS;
            boolean z = true & true;
            boolean z2 = true & true;
            i.e(followSpeakersFragment, "<this>");
            i.e(userInChannel, "user");
            i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
            v.f(followSpeakersFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(userInChannel, sourceLocation, false, false, false, 16));
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-1  reason: not valid java name */
        public static final void m22buildItemModel$lambda1(FollowSpeakersFragment followSpeakersFragment, d dVar, View view) {
            i.e(followSpeakersFragment, "this$0");
            ((FollowSpeakersViewModel) followSpeakersFragment.s2.getValue()).p(new i0.e.b.g3.k.w0.a.f(dVar.g.getId().intValue()));
        }

        public t<?> buildItemModel(int i, d dVar) {
            if (dVar != null) {
                i0.e.b.f3.m.b.c cVar = new i0.e.b.f3.m.b.c();
                cVar.t(dVar.g.getId());
                UserInChannel userInChannel = dVar.g;
                cVar.w();
                cVar.j = userInChannel;
                String k = i.k("@", dVar.g.f2);
                cVar.w();
                cVar.k = k;
                boolean z = dVar.i;
                cVar.w();
                cVar.n = z;
                cVar.w();
                cVar.m = true;
                cVar.w();
                cVar.r = true;
                b bVar = new b(this.this$0, dVar);
                cVar.w();
                cVar.l = bVar;
                i0.e.b.g3.k.w0.a.a aVar = new i0.e.b.g3.k.w0.a.a(this.this$0, dVar);
                cVar.w();
                cVar.o = aVar;
                i.d(cVar, "FollowableListUser_()\n                .id(item.user.id)\n                .user(item.user)\n                .userBio(\"@${item.user.username}\")\n                .following( item.followedBySelf)\n                .showFollowButton(true)\n                .compactMode(true)\n                .clickListener { _ ->\n                    showHalfProfile(item.user, SourceLocation.SUGGESTED_SPEAKERS)\n                }\n                .followClickListener { _ ->\n                    viewModel.processIntent(ToggleFollowUser(item.user.id))\n                }");
                return cVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<FollowSpeakersFragment, FollowSpeakersViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public a(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new FollowSpeakersFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(e.class), false, this.b);
        }
    }

    public FollowSpeakersFragment() {
        m0.r.d a2 = m.a(FollowSpeakersViewModel.class);
        this.s2 = new a(a2, false, new FollowSpeakersFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, r2[0]);
    }

    public void J() {
        v.v2((FollowSpeakersViewModel) this.s2.getValue(), new FollowSpeakersFragment$invalidate$1(this));
    }

    public PagingDataEpoxyController<d> T0() {
        return this.t2;
    }

    public void U0() {
        S0().j.post(new i0.e.b.g3.k.w0.a.c(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.U1(this);
        LinearLayout linearLayout = S0().g;
        i.d(linearLayout, "binding.root");
        linearLayout.setPadding(0, 0, 0, linearLayout.getPaddingBottom());
        FrameLayout frameLayout = S0().e.b;
        i.d(frameLayout, "binding.grabHandle.grabHandleRoot");
        i0.e.b.d3.k.K(frameLayout);
        EditText editText = S0().h;
        i.d(editText, "binding.search");
        i0.e.b.d3.k.p(editText);
        S0().i.setText(getString(R.string.current_speakers));
        TextView textView = S0().i;
        i.d(textView, "binding.title");
        textView.setPadding(getResources().getDimensionPixelSize(R.dimen.user_grid_horizontal_margin), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        S0().j.setItemSpacingRes(R.dimen.list_item_spacing);
        S0().j.setController(this.t2);
    }
}
