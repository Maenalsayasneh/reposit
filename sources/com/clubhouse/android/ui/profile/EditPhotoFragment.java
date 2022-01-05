package com.clubhouse.android.ui.profile;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.databinding.FragmentEditPhotoBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.u.f;
import i0.e.b.g3.u.f4;
import i0.e.b.g3.u.t3;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/clubhouse/android/ui/profile/EditPhotoFragment;", "Lcom/clubhouse/android/ui/common/PhotoCreationFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Landroid/net/Uri;", "uri", "M0", "(Landroid/net/Uri;)V", "Lcom/clubhouse/android/ui/profile/EditPhotoArgs;", "h2", "Lm0/o/c;", "getArgs", "()Lcom/clubhouse/android/ui/profile/EditPhotoArgs;", "args", "Lcom/clubhouse/android/ui/profile/EditPhotoViewModel;", "g2", "Lm0/c;", "S0", "()Lcom/clubhouse/android/ui/profile/EditPhotoViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentEditPhotoBinding;", "f2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "R0", "()Lcom/clubhouse/android/databinding/FragmentEditPhotoBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: EditPhotoFragment.kt */
public final class EditPhotoFragment extends Hilt_EditPhotoFragment {
    public static final /* synthetic */ k<Object>[] e2 = {m.c(new PropertyReference1Impl(m.a(EditPhotoFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentEditPhotoBinding;")), m.c(new PropertyReference1Impl(m.a(EditPhotoFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/EditPhotoViewModel;")), m.c(new PropertyReference1Impl(m.a(EditPhotoFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/profile/EditPhotoArgs;"))};
    public final FragmentViewBindingDelegate f2 = new FragmentViewBindingDelegate(FragmentEditPhotoBinding.class, this);
    public final c g2;
    public final m0.o.c h2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<EditPhotoFragment, EditPhotoViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new EditPhotoFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(f4.class), false, this.b);
        }
    }

    public EditPhotoFragment() {
        super(R.layout.fragment_edit_photo);
        d a2 = m.a(EditPhotoViewModel.class);
        this.g2 = new a(a2, false, new EditPhotoFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, e2[1]);
        this.h2 = new i0.b.b.i();
    }

    public void J() {
        v.v2(S0(), new EditPhotoFragment$invalidate$1(this));
    }

    public void M0(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        S0().p(new t3(uri));
    }

    public final FragmentEditPhotoBinding R0() {
        return (FragmentEditPhotoBinding) this.f2.getValue(this, e2[0]);
    }

    public final EditPhotoViewModel S0() {
        return (EditPhotoViewModel) this.g2.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AmplitudeAnalytics) v.l(this)).a("Settings-UpdatePhoto");
        v.g1(this, S0(), EditPhotoFragment$onCreate$1.c, v.q2(this, (String) null, 1, (Object) null), new EditPhotoFragment$onCreate$2(this, (m0.l.c<? super EditPhotoFragment$onCreate$2>) null), new EditPhotoFragment$onCreate$3(this, (m0.l.c<? super EditPhotoFragment$onCreate$3>) null));
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(S0().l, new EditPhotoFragment$onViewCreated$1(this, (m0.l.c<? super EditPhotoFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        String str = ((EditPhotoArgs) this.h2.getValue(this, e2[2])).c;
        if (str != null) {
            AvatarView avatarView = R0().a;
            i.d(avatarView, "binding.addPhotoButton");
            v.Q0(avatarView, str);
        }
        R0().b.setOnClickListener(new f(this));
        R0().a.setOnClickListener(new i0.e.b.g3.u.g(this));
    }
}
