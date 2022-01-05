package com.clubhouse.android.ui.clubs.create;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentCreateClubBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.l.v2.b;
import i0.e.b.g3.l.v2.e;
import i0.e.b.g3.l.v2.f;
import i0.e.b.g3.l.v2.q;
import i0.e.b.g3.l.v2.x;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u000eJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/clubhouse/android/ui/clubs/create/CreateClubFragment;", "Lcom/clubhouse/android/ui/common/PhotoCreationFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/net/Uri;", "uri", "M0", "(Landroid/net/Uri;)V", "J", "()V", "Lcom/clubhouse/android/ui/clubs/create/CreateClubViewModel;", "g2", "Lm0/c;", "S0", "()Lcom/clubhouse/android/ui/clubs/create/CreateClubViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentCreateClubBinding;", "f2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "R0", "()Lcom/clubhouse/android/databinding/FragmentCreateClubBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment extends Hilt_CreateClubFragment {
    public static final /* synthetic */ k<Object>[] e2 = {m.c(new PropertyReference1Impl(m.a(CreateClubFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentCreateClubBinding;")), m.c(new PropertyReference1Impl(m.a(CreateClubFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/clubs/create/CreateClubViewModel;"))};
    public final FragmentViewBindingDelegate f2 = new FragmentViewBindingDelegate(FragmentCreateClubBinding.class, this);
    public final c g2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<CreateClubFragment, CreateClubViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new CreateClubFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(q.class), false, this.b);
        }
    }

    public CreateClubFragment() {
        super(R.layout.fragment_create_club);
        d a2 = m.a(CreateClubViewModel.class);
        this.g2 = new a(a2, false, new CreateClubFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, e2[1]);
    }

    public void J() {
        v.v2(S0(), new CreateClubFragment$invalidate$1(this));
    }

    public void M0(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        S0().p(new x(uri));
    }

    public final FragmentCreateClubBinding R0() {
        return (FragmentCreateClubBinding) this.f2.getValue(this, e2[0]);
    }

    public final CreateClubViewModel S0() {
        return (CreateClubViewModel) this.g2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.g1(this, S0(), CreateClubFragment$onViewCreated$1.c, v.q2(this, (String) null, 1, (Object) null), new CreateClubFragment$onViewCreated$2(this, (m0.l.c<? super CreateClubFragment$onViewCreated$2>) null), new CreateClubFragment$onViewCreated$3(this, (m0.l.c<? super CreateClubFragment$onViewCreated$3>) null));
        R0().e.setOnClickListener(new b(this));
        TextView textView = R0().h;
        i.d(textView, "binding.create");
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView, h0.q.q.a(viewLifecycleOwner), new i0.e.b.g3.l.v2.i(this));
        v.p0(this, "selected_item_result", new CreateClubFragment$onViewCreated$6(this));
        ConstraintLayout constraintLayout = R0().k;
        i.d(constraintLayout, "binding.membership");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(constraintLayout, h0.q.q.a(viewLifecycleOwner2), new i0.e.b.g3.l.v2.h(this));
        ConstraintLayout constraintLayout2 = R0().q;
        i.d(constraintLayout2, "binding.whoCanStart");
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(constraintLayout2, h0.q.q.a(viewLifecycleOwner3), new i0.e.b.g3.l.v2.d(this));
        v.p0(this, "selected_topics_result", new CreateClubFragment$onViewCreated$9(this));
        ConstraintLayout constraintLayout3 = R0().o;
        i.d(constraintLayout3, "binding.topics");
        p viewLifecycleOwner4 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner4, "viewLifecycleOwner");
        i0.e.b.d3.k.H(constraintLayout3, h0.q.q.a(viewLifecycleOwner4), new i0.e.b.g3.l.v2.a(this));
        R0().a.setSquareness(0.88f);
        AvatarView avatarView = R0().a;
        i.d(avatarView, "binding.addPhotoButton");
        p viewLifecycleOwner5 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner5, "viewLifecycleOwner");
        i0.e.b.d3.k.H(avatarView, h0.q.q.a(viewLifecycleOwner5), new i0.e.b.g3.l.v2.c(this));
        EditText editText = R0().g;
        i.d(editText, "binding.clubName");
        editText.addTextChangedListener(new i0.e.b.g3.l.v2.l(this));
        R0().c.setOnCheckedChangeListener(new i0.e.b.g3.l.v2.g(this));
        R0().j.setOnCheckedChangeListener(new e(this));
        EditText editText2 = R0().f;
        i.d(editText2, "binding.clubDescription");
        editText2.addTextChangedListener(new i0.e.b.g3.l.v2.k(this));
        R0().f.setOnFocusChangeListener(new f(this));
        v.v2(S0(), new CreateClubFragment$initDescription$3(this));
    }
}
