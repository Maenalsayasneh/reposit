package com.clubhouse.android.ui.profile;

import androidx.appcompat.app.AlertController;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.x1;
import i0.e.b.g3.u.y1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$showRemoveConfirmationDialog$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ HalfProfileFragment d;
    public final /* synthetic */ boolean q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$showRemoveConfirmationDialog$1(boolean z, HalfProfileFragment halfProfileFragment, boolean z2) {
        super(1);
        this.c = z;
        this.d = halfProfileFragment;
        this.q = z2;
    }

    public Object invoke(Object obj) {
        String str;
        String str2;
        final q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        if (this.c) {
            str = this.d.getString(R.string.remove_confirmation_title_blocked);
        } else {
            str = this.d.getString(R.string.are_you_sure);
        }
        final String str3 = str;
        m0.n.b.i.d(str3, "if (isAfterBlock) {\n                getString(R.string.remove_confirmation_title_blocked)\n            } else {\n                getString(R.string.are_you_sure)\n            }");
        if (this.c) {
            str2 = this.d.getString(R.string.remove_confirmation_body_blocked, q4Var.a.getName());
        } else {
            str2 = this.d.getString(R.string.remove_confirmation_body, q4Var.a.getName());
        }
        final String str4 = str2;
        m0.n.b.i.d(str4, "if (isAfterBlock) {\n                getString(R.string.remove_confirmation_body_blocked, state.user.name)\n            } else {\n                getString(\n                    R.string.remove_confirmation_body,\n                    state.user.name\n                )\n            }");
        HalfProfileFragment halfProfileFragment = this.d;
        final boolean z = this.q;
        final HalfProfileFragment halfProfileFragment2 = halfProfileFragment;
        AnonymousClass1 r02 = new l<d.a, i>() {
            public Object invoke(Object obj) {
                d.a aVar = (d.a) obj;
                m0.n.b.i.e(aVar, "$this$alertDialog");
                String str = str3;
                AlertController.b bVar = aVar.a;
                bVar.d = str;
                bVar.f = str4;
                aVar.d(R.string.remove, new x1(halfProfileFragment2, q4Var, z));
                aVar.c(R.string.cancel, y1.c);
                return i.a;
            }
        };
        m0.n.b.i.e(halfProfileFragment, "<this>");
        m0.n.b.i.e(r02, "f");
        d.a aVar = new d.a(halfProfileFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        r02.invoke(aVar);
        aVar.g();
        return i.a;
    }
}
