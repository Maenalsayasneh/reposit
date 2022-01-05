package i0.e.b.g3.o.w0;

import android.view.View;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment$showRemoveCoHostConfirmation$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ AddEditEventFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ h(AddEditEventFragment addEditEventFragment, UserInList userInList) {
        this.c = addEditEventFragment;
        this.d = userInList;
    }

    public final void onClick(View view) {
        AddEditEventFragment addEditEventFragment = this.c;
        UserInList userInList = this.d;
        i.e(addEditEventFragment, "this$0");
        i.e(userInList, "$it");
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        AddEditEventFragment$showRemoveCoHostConfirmation$1 addEditEventFragment$showRemoveCoHostConfirmation$1 = new AddEditEventFragment$showRemoveCoHostConfirmation$1(addEditEventFragment, userInList);
        i.e(addEditEventFragment, "<this>");
        i.e(addEditEventFragment$showRemoveCoHostConfirmation$1, "f");
        d.a aVar = new d.a(addEditEventFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        addEditEventFragment$showRemoveCoHostConfirmation$1.invoke(aVar);
        aVar.g();
    }
}
