package i0.e.b.g3.u;

import android.content.DialogInterface;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import i0.e.b.a3.b.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ a c;
    public final /* synthetic */ DialogEditTextBinding d;

    public /* synthetic */ e2(a aVar, DialogEditTextBinding dialogEditTextBinding) {
        this.c = aVar;
        this.d = dialogEditTextBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        a aVar = this.c;
        DialogEditTextBinding dialogEditTextBinding = this.d;
        i.e(aVar, "$viewModel");
        i.e(dialogEditTextBinding, "$binding");
        aVar.p(new x5(dialogEditTextBinding.b.getText().toString()));
        dialogInterface.dismiss();
    }
}
