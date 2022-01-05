package com.clubhouse.android.ui.channels.users.search;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.shared.ui.AbstractUserFragment;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.g3.k.w0.d.b;
import i0.e.b.g3.k.x0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0014@\u0014X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/channels/users/search/SearchInRoomFragment;", "Lcom/clubhouse/android/shared/ui/AbstractUserFragment;", "Lcom/clubhouse/android/data/models/local/channel/UserInChannel;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "U0", "()V", "J", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "t2", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "T0", "()Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "setPagedController", "(Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;)V", "pagedController", "Lcom/clubhouse/android/ui/channels/users/search/SearchInRoomViewModel;", "s2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/channels/users/search/SearchInRoomViewModel;", "viewModel", "<init>", "UserController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: SearchInRoomFragment.kt */
public final class SearchInRoomFragment extends AbstractUserFragment<UserInChannel> {
    public static final /* synthetic */ k<Object>[] r2 = {m.c(new PropertyReference1Impl(m.a(SearchInRoomFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/channels/users/search/SearchInRoomViewModel;"))};
    public final c s2;
    public PagingDataEpoxyController<UserInChannel> t2 = new UserController(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/clubhouse/android/ui/channels/users/search/SearchInRoomFragment$UserController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Lcom/clubhouse/android/data/models/local/channel/UserInChannel;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILcom/clubhouse/android/data/models/local/channel/UserInChannel;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/channels/users/search/SearchInRoomFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: SearchInRoomFragment.kt */
    public final class UserController extends PagingDataEpoxyController<UserInChannel> {
        public final /* synthetic */ SearchInRoomFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserController(SearchInRoomFragment searchInRoomFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(searchInRoomFragment, "this$0");
            this.this$0 = searchInRoomFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m25buildItemModel$lambda0(SearchInRoomFragment searchInRoomFragment, UserInChannel userInChannel, View view) {
            i.e(searchInRoomFragment, "this$0");
            SourceLocation sourceLocation = SourceLocation.CHANNEL;
            boolean z = true & true;
            boolean z2 = true & true;
            i.e(searchInRoomFragment, "<this>");
            i.e(userInChannel, "user");
            i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
            v.f(searchInRoomFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(userInChannel, sourceLocation, false, false, false, 16));
        }

        public t<?> buildItemModel(int i, UserInChannel userInChannel) {
            if (userInChannel != null) {
                l lVar = new l();
                lVar.t(userInChannel.getId());
                lVar.w();
                lVar.j = userInChannel;
                i0.e.b.g3.k.w0.d.a aVar = new i0.e.b.g3.k.w0.d.a(this.this$0, userInChannel);
                lVar.w();
                lVar.l = aVar;
                i.d(lVar, "ChannelUser_()\n                .id(item.id)\n                .user(item)\n                .clickListener { _ -> showHalfProfile(item, SourceLocation.CHANNEL) }");
                return lVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<SearchInRoomFragment, SearchInRoomViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ m0.n.a.l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, m0.n.a.l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new SearchInRoomFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.b.g3.k.w0.d.d.class), false, this.b);
        }
    }

    public SearchInRoomFragment() {
        d a2 = m.a(SearchInRoomViewModel.class);
        this.s2 = new a(a2, false, new SearchInRoomFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, r2[0]);
    }

    public void J() {
        v.v2((SearchInRoomViewModel) this.s2.getValue(), new SearchInRoomFragment$invalidate$1(this));
    }

    public PagingDataEpoxyController<UserInChannel> T0() {
        return this.t2;
    }

    public void U0() {
        S0().j.post(new b(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = S0().h;
        i.d(editText, "binding.search");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(i0.e.b.d3.k.f(editText), new SearchInRoomFragment$onViewCreated$1(this, (m0.l.c<? super SearchInRoomFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
    }
}
