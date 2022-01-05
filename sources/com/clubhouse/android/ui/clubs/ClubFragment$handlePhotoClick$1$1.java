package com.clubhouse.android.ui.clubs;

import android.os.Bundle;
import com.clubhouse.android.core.ui.WrappedBottomSheetArgs;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.android.ui.profile.ProfilePhotoArgs;
import com.clubhouse.android.ui.profile.ProfilePhotoFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.i.c;
import i0.e.b.g3.l.o1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$handlePhotoClick$1$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$handlePhotoClick$1$1(ClubFragment clubFragment, String str) {
        super(1);
        this.c = clubFragment;
        this.d = str;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        final ClubFragment clubFragment = this.c;
        actionSheetBuilder.a(new l<c, i>() {
            public Object invoke(Object obj) {
                c cVar = (c) obj;
                m0.n.b.i.e(cVar, "$this$action");
                String string = ClubFragment.this.getString(R.string.change_photo);
                m0.n.b.i.d(string, "getString(R.string.change_photo)");
                cVar.b(string);
                final ClubFragment clubFragment = ClubFragment.this;
                cVar.a(new a<i>() {
                    public Object invoke() {
                        ClubFragment clubFragment = ClubFragment.this;
                        k<Object>[] kVarArr = ClubFragment.e2;
                        clubFragment.N0();
                        return i.a;
                    }
                });
                return i.a;
            }
        });
        final ClubFragment clubFragment2 = this.c;
        final String str = this.d;
        actionSheetBuilder.a(new l<c, i>() {
            public Object invoke(Object obj) {
                c cVar = (c) obj;
                m0.n.b.i.e(cVar, "$this$action");
                String string = ClubFragment.this.getString(R.string.view_photo);
                m0.n.b.i.d(string, "getString(R.string.view_photo)");
                cVar.b(string);
                final ClubFragment clubFragment = ClubFragment.this;
                final String str = str;
                cVar.a(new a<i>() {
                    public Object invoke() {
                        ClubFragment clubFragment = ClubFragment.this;
                        String str = str;
                        m0.n.b.i.e(clubFragment, "<this>");
                        m0.n.b.i.e(str, "photoUrl");
                        ProfilePhotoArgs profilePhotoArgs = new ProfilePhotoArgs(str, 0.88f);
                        m0.n.b.i.e(profilePhotoArgs, "arg");
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("mavericks:arg", profilePhotoArgs);
                        WrappedBottomSheetArgs wrappedBottomSheetArgs = new WrappedBottomSheetArgs(ProfilePhotoFragment.class, bundle);
                        m0.n.b.i.e(wrappedBottomSheetArgs, "mavericksArg");
                        v.a1(clubFragment, new o1(wrappedBottomSheetArgs), (q) null, 2);
                        return i.a;
                    }
                });
                return i.a;
            }
        });
        return i.a;
    }
}
