package i0.e.b.g3.u;

import android.content.DialogInterface;
import com.clubhouse.android.ui.profile.EditUsernameFragment;

/* compiled from: lambda */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditUsernameFragment c;
    public final /* synthetic */ String d;

    public /* synthetic */ i(EditUsernameFragment editUsernameFragment, String str) {
        this.c = editUsernameFragment;
        this.d = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditUsernameFragment editUsernameFragment = this.c;
        String str = this.d;
        m0.n.b.i.e(editUsernameFragment, "this$0");
        m0.n.b.i.e(str, "$username");
        editUsernameFragment.O0().b(str);
    }
}
