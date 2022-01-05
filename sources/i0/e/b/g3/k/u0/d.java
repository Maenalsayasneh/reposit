package i0.e.b.g3.k.u0;

import android.view.View;
import com.clubhouse.android.ui.channels.clip.CreateClipComingSoonDialogFragment;
import com.clubhouse.app.R;
import i0.e.b.a3.f.e;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ CreateClipComingSoonDialogFragment c;

    public /* synthetic */ d(CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment) {
        this.c = createClipComingSoonDialogFragment;
    }

    public final void onClick(View view) {
        CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment = this.c;
        i.e(createClipComingSoonDialogFragment, "this$0");
        e.b(createClipComingSoonDialogFragment, createClipComingSoonDialogFragment.getString(R.string.clubhouse_clips_faq));
    }
}
