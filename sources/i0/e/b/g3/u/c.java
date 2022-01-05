package i0.e.b.g3.u;

import android.content.DialogInterface;
import com.clubhouse.android.ui.profile.EditNameFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditNameFragment c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;

    public /* synthetic */ c(EditNameFragment editNameFragment, String str, String str2) {
        this.c = editNameFragment;
        this.d = str;
        this.q = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditNameFragment editNameFragment = this.c;
        String str = this.d;
        String str2 = this.q;
        i.e(editNameFragment, "this$0");
        i.e(str, "$firstName");
        i.e(str2, "$lastName");
        editNameFragment.O0().c(str, str2);
    }
}
