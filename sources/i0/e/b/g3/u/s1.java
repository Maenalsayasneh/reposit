package i0.e.b.g3.u;

import android.content.DialogInterface;
import com.clubhouse.android.user.model.User;
import i0.e.b.a3.b.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class s1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ a c;
    public final /* synthetic */ User d;

    public /* synthetic */ s1(a aVar, User user) {
        this.c = aVar;
        this.d = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        a aVar = this.c;
        User user = this.d;
        i.e(aVar, "$viewModel");
        i.e(user, "$user");
        aVar.p(new u3(user));
        dialogInterface.dismiss();
    }
}
