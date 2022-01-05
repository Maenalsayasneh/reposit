package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.FeedInvitePromptBinding;
import com.clubhouse.app.R;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: InvitePrompt.kt */
public abstract class n0 extends BaseEpoxyModelWithHolder<a> {
    public View.OnClickListener j;

    /* compiled from: InvitePrompt.kt */
    public static final class a extends d {
        public FeedInvitePromptBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            FeedInvitePromptBinding bind = FeedInvitePromptBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        FeedInvitePromptBinding feedInvitePromptBinding = aVar.b;
        if (feedInvitePromptBinding != null) {
            feedInvitePromptBinding.a.setOnClickListener(this.j);
        } else {
            i.m("binding");
            throw null;
        }
    }

    public int o() {
        return R.layout.feed_invite_prompt;
    }
}
