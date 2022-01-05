package com.clubhouse.android.ui.profile;

import android.os.Bundle;
import com.clubhouse.android.core.ui.WrappedBottomSheetArgs;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.UserProfile;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.y4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$navigateToEditPhoto$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$navigateToEditPhoto$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        String str;
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        UserProfile userProfile = c5Var.l;
        if (userProfile == null) {
            str = null;
        } else {
            str = userProfile.w2;
        }
        if (str == null) {
            BasicUser basicUser = c5Var.e;
            if (basicUser == null) {
                str = null;
            } else {
                str = basicUser.x;
            }
        }
        if (c5Var.p) {
            ProfileFragment profileFragment = this.c;
            EditPhotoArgs editPhotoArgs = new EditPhotoArgs(str);
            m0.n.b.i.e(editPhotoArgs, "arg");
            Bundle bundle = new Bundle();
            bundle.putParcelable("mavericks:arg", editPhotoArgs);
            WrappedBottomSheetArgs wrappedBottomSheetArgs = new WrappedBottomSheetArgs(EditPhotoFragment.class, bundle);
            m0.n.b.i.e(wrappedBottomSheetArgs, "mavericksArg");
            v.a1(profileFragment, new y4.d(wrappedBottomSheetArgs), (q) null, 2);
        } else {
            if (!(str == null || str.length() == 0)) {
                ProfileFragment profileFragment2 = this.c;
                ProfilePhotoArgs profilePhotoArgs = new ProfilePhotoArgs(str, 0.0f, 2);
                m0.n.b.i.e(profilePhotoArgs, "arg");
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("mavericks:arg", profilePhotoArgs);
                WrappedBottomSheetArgs wrappedBottomSheetArgs2 = new WrappedBottomSheetArgs(ProfilePhotoFragment.class, bundle2);
                m0.n.b.i.e(wrappedBottomSheetArgs2, "mavericksArg");
                v.a1(profileFragment2, new y4.i(wrappedBottomSheetArgs2), (q) null, 2);
            }
        }
        return i.a;
    }
}
