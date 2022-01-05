package i0.e.b.f3.j;

import com.clubhouse.android.channels.ChannelComponentHandler;
import com.clubhouse.android.channels.mvi.ChannelControlModel;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.shared.data.ChannelUsersDataSource$filterChannelUsers$1$1;
import h0.b0.v;
import h0.u.w;
import i0.e.b.h3.a.b;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.n.b.i;
import n0.a.g2.d;
import n0.a.g2.p;
import n0.a.g2.u;

/* compiled from: ChannelUsersDataSource.kt */
public final class a {
    public final ChannelControlModel a;
    public String b;
    public d<w<UserInChannel>> c;

    public a(i0.e.b.f3.i.a aVar) {
        ChannelComponentHandler s;
        i0.e.b.z2.e.a aVar2;
        i.e(aVar, "userComponentHandler");
        b bVar = aVar.d;
        ChannelControlModel channelControlModel = null;
        if (!(bVar == null || (s = v.s(bVar)) == null || (aVar2 = s.c) == null)) {
            channelControlModel = v.b0(aVar2).d();
        }
        this.a = channelControlModel;
        this.c = u.b(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }

    public void a(String str) {
        List list;
        if (!i.a(this.b, str)) {
            p pVar = (p) this.c;
            w.b bVar = w.c;
            ChannelControlModel channelControlModel = this.a;
            if (channelControlModel == null) {
                list = null;
            } else {
                list = (List) v.v2(channelControlModel, new ChannelUsersDataSource$filterChannelUsers$1$1(str));
            }
            if (list == null) {
                list = EmptyList.c;
            }
            pVar.d(bVar.b(list));
        }
        this.b = str;
    }
}
