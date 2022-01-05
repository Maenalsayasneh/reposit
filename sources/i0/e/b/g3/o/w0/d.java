package i0.e.b.g3.o.w0;

import android.view.View;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment$showDeleteEventConfirmation$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ AddEditEventFragment c;

    public /* synthetic */ d(AddEditEventFragment addEditEventFragment) {
        this.c = addEditEventFragment;
    }

    public final void onClick(View view) {
        AddEditEventFragment addEditEventFragment = this.c;
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        i.e(addEditEventFragment, "this$0");
        AddEditEventFragment$showDeleteEventConfirmation$1 addEditEventFragment$showDeleteEventConfirmation$1 = new AddEditEventFragment$showDeleteEventConfirmation$1(addEditEventFragment);
        i.e(addEditEventFragment, "<this>");
        i.e(addEditEventFragment$showDeleteEventConfirmation$1, "f");
        d.a aVar = new d.a(addEditEventFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        addEditEventFragment$showDeleteEventConfirmation$1.invoke(aVar);
        aVar.g();
    }
}
