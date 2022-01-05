package com.clubhouse.android.ui.channels;

import android.os.Bundle;
import com.clubhouse.android.core.ui.WrappedBottomSheetArgs;
import com.clubhouse.android.core.ui.WrappedBottomSheetFragment;
import com.clubhouse.android.ui.profile.EditPhotoArgs;
import com.clubhouse.android.ui.profile.EditPhotoFragment;
import com.clubhouse.android.user.model.User;
import h0.o.a.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelNavigation.kt */
public final class ChannelNavigation$showEditPhotoFragment$1 extends Lambda implements l<c0, i> {
    public final /* synthetic */ User c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelNavigation$showEditPhotoFragment$1(User user) {
        super(1);
        this.c = user;
    }

    public Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        m0.n.b.i.e(c0Var, "$this$commitSafe");
        EditPhotoArgs editPhotoArgs = new EditPhotoArgs(this.c.b());
        m0.n.b.i.e(editPhotoArgs, "arg");
        Bundle bundle = new Bundle();
        bundle.putParcelable("mavericks:arg", editPhotoArgs);
        WrappedBottomSheetArgs wrappedBottomSheetArgs = new WrappedBottomSheetArgs(EditPhotoFragment.class, bundle);
        m0.n.b.i.e(wrappedBottomSheetArgs, "arg");
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("mavericks:arg", wrappedBottomSheetArgs);
        c0Var.c(c0Var.k(WrappedBottomSheetFragment.class, bundle2), (String) null);
        return i.a;
    }
}
