package com.clubhouse.android.ui.channels.views;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.app.R;
import h0.b.a.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: NoticeBar.kt */
public final class NoticeBarKt$bindNoticeBar$1$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ i0.e.b.z2.g.l c;
    public final /* synthetic */ ChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeBarKt$bindNoticeBar$1$1(i0.e.b.z2.g.l lVar, ChannelFragment channelFragment) {
        super(1);
        this.c = lVar;
        this.d = channelFragment;
    }

    public Object invoke(Object obj) {
        String str;
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        if (this.c.p.h()) {
            str = this.d.getResources().getString(R.string.notice_bar_users_blocked);
        } else {
            str = this.d.getResources().getString(R.string.notice_bar_speakers_blocked);
        }
        aVar.a.d = str;
        i0.e.b.z2.g.l lVar = this.c;
        List<Integer> list = lVar.K;
        ArrayList arrayList = new ArrayList();
        for (Number intValue : list) {
            UserInChannel k = lVar.p.k(intValue.intValue());
            if (k != null) {
                arrayList.add(k);
            }
        }
        aVar.a.f = g.E(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, AnonymousClass2.c, 30);
        aVar.d(R.string.done, i0.e.b.g3.k.y0.i.c);
        return i.a;
    }
}
