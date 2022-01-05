package i0.e.b.g3.l.z2;

import android.content.DialogInterface;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ l c;
    public final /* synthetic */ DialogEditTextBinding d;

    public /* synthetic */ c(l lVar, DialogEditTextBinding dialogEditTextBinding) {
        this.c = lVar;
        this.d = dialogEditTextBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        l lVar = this.c;
        DialogEditTextBinding dialogEditTextBinding = this.d;
        i.e(lVar, "$positiveAction");
        i.e(dialogEditTextBinding, "$binding");
        lVar.invoke(dialogEditTextBinding.b.getText().toString());
    }
}
