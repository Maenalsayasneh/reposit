package i0.e.b.g3.k.w0.b;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.clubhouse.android.core.R;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.channels.users.ping.PingUserFragment;
import com.clubhouse.android.ui.channels.users.ping.PingUserFragment$handleAction$1;
import com.clubhouse.android.ui.events.EventActionType;
import com.instabug.library.model.NetworkLog;
import h0.b0.v;
import i0.e.a.b.a;
import java.util.Objects;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ PingUserFragment c;
    public final /* synthetic */ EventActionType d;
    public final /* synthetic */ f q;

    public /* synthetic */ b(PingUserFragment pingUserFragment, EventActionType eventActionType, f fVar) {
        this.c = pingUserFragment;
        this.d = eventActionType;
        this.q = fVar;
    }

    public final void onClick(View view) {
        PingUserFragment pingUserFragment = this.c;
        EventActionType eventActionType = this.d;
        f fVar = this.q;
        i.e(pingUserFragment, "this$0");
        i.e(eventActionType, "$eventActionType");
        i.e(fVar, "$state");
        String url = fVar.a.getUrl();
        k<Object>[] kVarArr = PingUserFragment.r2;
        int ordinal = eventActionType.ordinal();
        if (ordinal == 0) {
            a aVar = pingUserFragment.s2;
            if (aVar != null) {
                aVar.e("Share-Type-Channel", SourceLocation.CHANNEL);
                Context requireContext = pingUserFragment.requireContext();
                i.d(requireContext, "requireContext()");
                i.e(requireContext, "<this>");
                if (url != null) {
                    i0.d.a.a.a.e(requireContext, R.string.share_prompt, i0.d.a.a.a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", url));
                    return;
                }
                return;
            }
            i.m("actionTrailRecorder");
            throw null;
        } else if (ordinal == 1) {
            Context requireContext2 = pingUserFragment.requireContext();
            i.d(requireContext2, "requireContext()");
            String string = pingUserFragment.getString(com.clubhouse.app.R.string.happening_now_in, url);
            i.d(string, "getString(R.string.happening_now_in, url)");
            v.m1(requireContext2, string);
        } else if (ordinal == 2) {
            Context requireContext3 = pingUserFragment.requireContext();
            i.d(requireContext3, "requireContext()");
            i.e(requireContext3, "<this>");
            if (url != null) {
                Object systemService = requireContext3.getSystemService("clipboard");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(requireContext3.getResources().getString(R.string.copied_text), url));
            }
            v.b2(pingUserFragment, new PingUserFragment$handleAction$1(pingUserFragment));
        }
    }
}
