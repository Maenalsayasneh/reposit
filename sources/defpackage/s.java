package defpackage;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.profile.HalfProfileUtil$showBlockConfirmationDialog$1;
import com.clubhouse.android.ui.profile.ProfileFragment;
import com.clubhouse.android.ui.profile.ProfileViewModel;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import i0.e.b.g3.u.c5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: s  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class s extends Lambda implements l<Boolean, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(int i, Object obj, Object obj2) {
        super(1);
        this.c = i;
        this.d = obj;
        this.q = obj2;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            ((Boolean) obj).booleanValue();
            ProfileFragment profileFragment = (ProfileFragment) this.d;
            UserProfile userProfile = ((c5) this.q).l;
            ProfileViewModel P0 = profileFragment.P0();
            m0.n.b.i.e(profileFragment, "<this>");
            m0.n.b.i.e(userProfile, "user");
            m0.n.b.i.e(P0, "viewModel");
            HalfProfileUtil$showBlockConfirmationDialog$1 halfProfileUtil$showBlockConfirmationDialog$1 = new HalfProfileUtil$showBlockConfirmationDialog$1(profileFragment, userProfile, P0);
            m0.n.b.i.e(profileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showBlockConfirmationDialog$1, "f");
            d.a aVar = new d.a(profileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showBlockConfirmationDialog$1.invoke(aVar);
            aVar.g();
            return i.a;
        } else if (i == 1) {
            ((Boolean) obj).booleanValue();
            ProfileFragment profileFragment2 = (ProfileFragment) this.d;
            UserProfile userProfile2 = ((c5) this.q).l;
            ProfileViewModel P02 = profileFragment2.P0();
            m0.n.b.i.e(profileFragment2, "<this>");
            m0.n.b.i.e(userProfile2, "user");
            m0.n.b.i.e(P02, "viewModel");
            HalfProfileUtil$showBlockConfirmationDialog$1 halfProfileUtil$showBlockConfirmationDialog$12 = new HalfProfileUtil$showBlockConfirmationDialog$1(profileFragment2, userProfile2, P02);
            m0.n.b.i.e(profileFragment2, "<this>");
            m0.n.b.i.e(halfProfileUtil$showBlockConfirmationDialog$12, "f");
            d.a aVar2 = new d.a(profileFragment2.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showBlockConfirmationDialog$12.invoke(aVar2);
            aVar2.g();
            return i.a;
        } else {
            throw null;
        }
    }
}
