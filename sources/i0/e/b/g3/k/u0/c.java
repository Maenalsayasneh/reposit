package i0.e.b.g3.k.u0;

import android.view.View;
import com.clubhouse.android.ui.channels.clip.CreateClipComingSoonDialogFragment;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.z2.g.l;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ l c;
    public final /* synthetic */ CreateClipComingSoonDialogFragment d;

    public /* synthetic */ c(l lVar, CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment) {
        this.c = lVar;
        this.d = createClipComingSoonDialogFragment;
    }

    public final void onClick(View view) {
        l lVar = this.c;
        CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment = this.d;
        i.e(lVar, "$state");
        i.e(createClipComingSoonDialogFragment, "this$0");
        if (lVar.V) {
            k<Object>[] kVarArr = CreateClipComingSoonDialogFragment.j2;
            d.a aVar = new d.a(createClipComingSoonDialogFragment.requireContext());
            aVar.c(R.string.cancel, new b(createClipComingSoonDialogFragment));
            aVar.e(R.string.create_clip_coming_soon_disable_confirmation_title);
            aVar.b(R.string.create_clip_coming_soon_disable_confirmation_message);
            aVar.d(R.string.create_clip_coming_soon_disable_confirmation_disable, new a(createClipComingSoonDialogFragment));
            aVar.g();
            return;
        }
        createClipComingSoonDialogFragment.I0();
    }
}
