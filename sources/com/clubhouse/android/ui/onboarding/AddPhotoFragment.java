package com.clubhouse.android.ui.onboarding;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentAddPhotoBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.b;
import i0.e.b.g3.r.i0;
import i0.e.b.g3.r.j0;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\fR\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/AddPhotoFragment;", "Lcom/clubhouse/android/ui/common/PhotoCreationFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Landroid/net/Uri;", "uri", "M0", "(Landroid/net/Uri;)V", "finish", "Li0/e/b/g3/r/j0;", "g2", "Lm0/c;", "S0", "()Li0/e/b/g3/r/j0;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentAddPhotoBinding;", "f2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "R0", "()Lcom/clubhouse/android/databinding/FragmentAddPhotoBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: AddPhotoFragment.kt */
public final class AddPhotoFragment extends Hilt_AddPhotoFragment {
    public static final /* synthetic */ k<Object>[] e2 = {m.c(new PropertyReference1Impl(m.a(AddPhotoFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentAddPhotoBinding;")), m.c(new PropertyReference1Impl(m.a(AddPhotoFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/AddPhotoViewModel;"))};
    public final FragmentViewBindingDelegate f2 = new FragmentViewBindingDelegate(FragmentAddPhotoBinding.class, this);
    public final c g2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<AddPhotoFragment, j0> {
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
            return g.a.b(fragment, kVar, this.a, new AddPhotoFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.class), false, this.b);
        }
    }

    public AddPhotoFragment() {
        super(R.layout.fragment_add_photo);
        d a2 = m.a(j0.class);
        this.g2 = new a(a2, false, new AddPhotoFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, e2[1]);
    }

    public void J() {
        v.v2(S0(), new AddPhotoFragment$invalidate$1(this));
    }

    public void M0(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        AvatarView avatarView = R0().a;
        i.d(avatarView, "binding.addPhotoButton");
        v.P0(avatarView, uri);
        j0 S0 = S0();
        Objects.requireNonNull(S0);
        i.e(uri, "contentUri");
        S0.m(new AddPhotoViewModel$addPhoto$1(uri));
    }

    public final FragmentAddPhotoBinding R0() {
        return (FragmentAddPhotoBinding) this.f2.getValue(this, e2[0]);
    }

    public final j0 S0() {
        return (j0) this.g2.getValue();
    }

    public final void finish() {
        v.a1(this, (h0.t.l) v.v2(S0(), new AddPhotoFragment$finish$1(this)), (q) null, 2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.V(this);
        v.g1(this, S0(), AddPhotoFragment$onCreate$1.c, v.q2(this, (String) null, 1, (Object) null), new AddPhotoFragment$onCreate$2(this, (m0.l.c<? super AddPhotoFragment$onCreate$2>) null), new AddPhotoFragment$onCreate$3(this, (m0.l.c<? super AddPhotoFragment$onCreate$3>) null));
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        R0().c.setOnClickListener(new b(this));
        R0().a.setOnClickListener(new i0.e.b.g3.r.c(this));
        R0().d.setOnClickListener(new i0.e.b.g3.r.a(this));
    }
}
