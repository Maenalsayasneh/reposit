package i0.e.b.g3.k.y0;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.views.NoticeBarKt$bindNoticeBar$1$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import i0.e.b.z2.g.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ l d;

    public /* synthetic */ h(ChannelFragment channelFragment, l lVar) {
        this.c = channelFragment;
        this.d = lVar;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        l lVar = this.d;
        i.e(channelFragment, "$this_bindNoticeBar");
        i.e(lVar, "$state");
        NoticeBarKt$bindNoticeBar$1$1 noticeBarKt$bindNoticeBar$1$1 = new NoticeBarKt$bindNoticeBar$1$1(lVar, channelFragment);
        i.e(channelFragment, "<this>");
        i.e(noticeBarKt$bindNoticeBar$1$1, "f");
        d.a aVar = new d.a(channelFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        noticeBarKt$bindNoticeBar$1$1.invoke(aVar);
        aVar.g();
    }
}
