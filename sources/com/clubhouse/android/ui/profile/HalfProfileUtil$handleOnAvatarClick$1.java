package com.clubhouse.android.ui.profile;

import android.os.Bundle;
import com.clubhouse.android.core.ui.WrappedBottomSheetArgs;
import com.clubhouse.android.data.models.local.user.UserProfile;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.o4;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$handleOnAvatarClick$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$handleOnAvatarClick$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        String str;
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        UserProfile userProfile = q4Var.k;
        if (userProfile == null) {
            str = null;
        } else {
            str = userProfile.w2;
        }
        if (q4Var.o) {
            HalfProfileFragment halfProfileFragment = this.c;
            EditPhotoArgs editPhotoArgs = new EditPhotoArgs(str);
            m0.n.b.i.e(editPhotoArgs, "arg");
            Bundle bundle = new Bundle();
            bundle.putParcelable("mavericks:arg", editPhotoArgs);
            WrappedBottomSheetArgs wrappedBottomSheetArgs = new WrappedBottomSheetArgs(EditPhotoFragment.class, bundle);
            m0.n.b.i.e(wrappedBottomSheetArgs, "mavericksArg");
            v.a1(halfProfileFragment, new o4.d(wrappedBottomSheetArgs), (q) null, 2);
        } else {
            if (!(str == null || str.length() == 0)) {
                HalfProfileFragment halfProfileFragment2 = this.c;
                ProfilePhotoArgs profilePhotoArgs = new ProfilePhotoArgs(str, 0.0f, 2);
                m0.n.b.i.e(profilePhotoArgs, "arg");
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("mavericks:arg", profilePhotoArgs);
                WrappedBottomSheetArgs wrappedBottomSheetArgs2 = new WrappedBottomSheetArgs(ProfilePhotoFragment.class, bundle2);
                m0.n.b.i.e(wrappedBottomSheetArgs2, "mavericksArg");
                v.a1(halfProfileFragment2, new o4.i(wrappedBottomSheetArgs2), (q) null, 2);
            }
        }
        return i.a;
    }
}
