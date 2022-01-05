package i0.e.b.g3.k.u0;

import android.content.DialogInterface;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.ui.channels.clip.CreateClipComingSoonDialogFragment;
import i0.e.b.z2.g.r;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ CreateClipComingSoonDialogFragment c;

    public /* synthetic */ a(CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment) {
        this.c = createClipComingSoonDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment = this.c;
        k<Object>[] kVarArr = CreateClipComingSoonDialogFragment.j2;
        i.e(createClipComingSoonDialogFragment, "this$0");
        ((ChannelViewModel) createClipComingSoonDialogFragment.k2.getValue()).p(r.a);
        dialogInterface.cancel();
        createClipComingSoonDialogFragment.I0();
    }
}
