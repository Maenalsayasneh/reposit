package i0.e.c.c;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryArgs;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import com.clubhouse.backchannel.chat.BackchannelChatFragment$copyToClipboard$1;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b.f.m0;
import i0.e.c.f.b.a.c;
import java.util.Objects;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class v implements m0.a {
    public final /* synthetic */ BackchannelChatFragment a;
    public final /* synthetic */ c.a b;
    public final /* synthetic */ y c;
    public final /* synthetic */ Uri d;

    public /* synthetic */ v(BackchannelChatFragment backchannelChatFragment, c.a aVar, y yVar, Uri uri) {
        this.a = backchannelChatFragment;
        this.b = aVar;
        this.c = yVar;
        this.d = uri;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        BackchannelChatFragment backchannelChatFragment = this.a;
        c.a aVar = this.b;
        y yVar = this.c;
        Uri uri = this.d;
        i.e(backchannelChatFragment, "this$0");
        i.e(aVar, "$message");
        i.e(yVar, "$state");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.copy) {
            String str = aVar.i;
            k<Object>[] kVarArr = BackchannelChatFragment.Z1;
            Context requireContext = backchannelChatFragment.requireContext();
            i.d(requireContext, "requireContext()");
            i.e(requireContext, "<this>");
            if (str != null) {
                Object systemService = requireContext.getSystemService("clipboard");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(requireContext.getResources().getString(com.clubhouse.android.core.R.string.copied_text), str));
            }
            h0.b0.v.c2(backchannelChatFragment, new BackchannelChatFragment$copyToClipboard$1(backchannelChatFragment));
            return true;
        } else if (itemId != R.id.report) {
            return true;
        } else {
            ChatMember chatMember = aVar.f;
            String str2 = yVar.a;
            Integer num = aVar.b;
            k<Object>[] kVarArr2 = BackchannelChatFragment.Z1;
            i.e(backchannelChatFragment, "<this>");
            i.e(chatMember, "user");
            i.e(str2, "reportedChatId");
            h0.b0.v.f(backchannelChatFragment, FragmentName.REPORT_INCIDENT_SELECT_CATEGORY, new ReportIncidentSelectCategoryArgs(chatMember, (String) null, (Channel) null, str2, num, uri, ReportTarget.CHAT_MESSAGES, 6));
            return true;
        }
    }
}
