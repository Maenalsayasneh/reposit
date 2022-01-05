package i0.e.b.g3.o.w0;

import android.content.DialogInterface;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class n implements DialogInterface.OnClickListener {
    public final /* synthetic */ AddEditEventFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ n(AddEditEventFragment addEditEventFragment, UserInList userInList) {
        this.c = addEditEventFragment;
        this.d = userInList;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AddEditEventFragment addEditEventFragment = this.c;
        UserInList userInList = this.d;
        i.e(addEditEventFragment, "this$0");
        i.e(userInList, "$user");
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        addEditEventFragment.O0().p(new y(userInList));
    }
}
