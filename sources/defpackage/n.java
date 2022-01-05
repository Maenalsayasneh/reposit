package defpackage;

import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.HalfProfileUtil$showBlockConfirmationDialog$1;
import com.clubhouse.android.ui.profile.HalfProfileViewModel;
import com.clubhouse.android.user.model.User;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: n  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class n extends Lambda implements l<Boolean, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(int i, Object obj, Object obj2) {
        super(1);
        this.c = i;
        this.d = obj;
        this.q = obj2;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            ((Boolean) obj).booleanValue();
            HalfProfileFragment halfProfileFragment = (HalfProfileFragment) this.d;
            User user = ((q4) this.q).a;
            HalfProfileViewModel U0 = halfProfileFragment.U0();
            m0.n.b.i.e(halfProfileFragment, "<this>");
            m0.n.b.i.e(user, "user");
            m0.n.b.i.e(U0, "viewModel");
            HalfProfileUtil$showBlockConfirmationDialog$1 halfProfileUtil$showBlockConfirmationDialog$1 = new HalfProfileUtil$showBlockConfirmationDialog$1(halfProfileFragment, user, U0);
            m0.n.b.i.e(halfProfileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showBlockConfirmationDialog$1, "f");
            d.a aVar = new d.a(halfProfileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showBlockConfirmationDialog$1.invoke(aVar);
            aVar.g();
            return i.a;
        } else if (i == 1) {
            ((Boolean) obj).booleanValue();
            HalfProfileFragment halfProfileFragment2 = (HalfProfileFragment) this.d;
            User user2 = ((q4) this.q).a;
            HalfProfileViewModel U02 = halfProfileFragment2.U0();
            m0.n.b.i.e(halfProfileFragment2, "<this>");
            m0.n.b.i.e(user2, "user");
            m0.n.b.i.e(U02, "viewModel");
            HalfProfileUtil$showBlockConfirmationDialog$1 halfProfileUtil$showBlockConfirmationDialog$12 = new HalfProfileUtil$showBlockConfirmationDialog$1(halfProfileFragment2, user2, U02);
            m0.n.b.i.e(halfProfileFragment2, "<this>");
            m0.n.b.i.e(halfProfileUtil$showBlockConfirmationDialog$12, "f");
            d.a aVar2 = new d.a(halfProfileFragment2.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showBlockConfirmationDialog$12.invoke(aVar2);
            aVar2.g();
            return i.a;
        } else {
            throw null;
        }
    }
}
