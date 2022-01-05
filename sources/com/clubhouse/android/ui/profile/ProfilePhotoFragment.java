package com.clubhouse.android.ui.profile;

import android.os.Bundle;
import android.view.View;
import com.clubhouse.android.databinding.FragmentProfilePhotoBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.i;
import i0.e.b.g3.u.r3;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.b.m;
import m0.o.c;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/profile/ProfilePhotoFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/profile/ProfilePhotoArgs;", "b2", "Lm0/o/c;", "getArgs", "()Lcom/clubhouse/android/ui/profile/ProfilePhotoArgs;", "args", "Lcom/clubhouse/android/databinding/FragmentProfilePhotoBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentProfilePhotoBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ProfilePhotoFragment.kt */
public final class ProfilePhotoFragment extends Hilt_ProfilePhotoFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ProfilePhotoFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentProfilePhotoBinding;")), m.c(new PropertyReference1Impl(m.a(ProfilePhotoFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/profile/ProfilePhotoArgs;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentProfilePhotoBinding.class, this);
    public final c b2 = new i();

    public ProfilePhotoFragment() {
        super(R.layout.fragment_profile_photo);
    }

    public void J() {
    }

    public final FragmentProfilePhotoBinding N0() {
        return (FragmentProfilePhotoBinding) this.a2.getValue(this, Z1[0]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().b.setOnClickListener(new r3(this));
        c cVar = this.b2;
        k<Object>[] kVarArr = Z1;
        String str = ((ProfilePhotoArgs) cVar.getValue(this, kVarArr[1])).c;
        N0().a.setSquareness(((ProfilePhotoArgs) this.b2.getValue(this, kVarArr[1])).d);
        AvatarView avatarView = N0().a;
        m0.n.b.i.d(avatarView, "binding.avatar");
        v.Q0(avatarView, str);
    }
}
