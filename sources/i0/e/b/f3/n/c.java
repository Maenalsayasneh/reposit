package i0.e.b.f3.n;

import android.app.Activity;
import android.content.DialogInterface;
import i0.e.b.a3.f.e;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ String d;

    public /* synthetic */ c(Activity activity, String str) {
        this.c = activity;
        this.d = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.c;
        String str = this.d;
        i.e(activity, "$this_showUpdateDialog");
        e.a(activity, str);
    }
}
