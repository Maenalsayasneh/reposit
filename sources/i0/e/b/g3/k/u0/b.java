package i0.e.b.g3.k.u0;

import android.content.DialogInterface;
import com.clubhouse.android.ui.channels.clip.CreateClipComingSoonDialogFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ CreateClipComingSoonDialogFragment c;

    public /* synthetic */ b(CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment) {
        this.c = createClipComingSoonDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment = this.c;
        k<Object>[] kVarArr = CreateClipComingSoonDialogFragment.j2;
        i.e(createClipComingSoonDialogFragment, "this$0");
        dialogInterface.cancel();
        createClipComingSoonDialogFragment.I0();
    }
}
