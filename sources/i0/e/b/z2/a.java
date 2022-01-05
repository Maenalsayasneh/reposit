package i0.e.b.z2;

import com.clubhouse.android.data.network.ServerDataSource;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.TickerChannelsKt$ticker$3;
import kotlinx.coroutines.channels.TickerMode;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import n0.a.f0;
import n0.a.f1;
import n0.a.f2.n;
import n0.a.g2.a0;
import n0.a.g2.q;
import n0.a.m0;
import n0.a.y0;

/* compiled from: ChannelPingClient.kt */
public final class a {
    public static final long a = TimeUnit.SECONDS.toMillis(45);
    public final f0 b;
    public final ServerDataSource c;
    public final String d;
    public final q<Boolean> e = a0.a(Boolean.FALSE);
    public final n<i> f;
    public f1 g;

    public a(f0 f0Var, ServerDataSource serverDataSource, String str) {
        f0 f0Var2 = f0Var;
        ServerDataSource serverDataSource2 = serverDataSource;
        String str2 = str;
        m0.n.b.i.e(f0Var2, "coroutineScope");
        m0.n.b.i.e(serverDataSource2, "fetcher");
        m0.n.b.i.e(str2, "channelId");
        this.b = f0Var2;
        this.c = serverDataSource2;
        this.d = str2;
        long j = a;
        e C = f0Var.C();
        TickerMode tickerMode = TickerMode.FIXED_PERIOD;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = true;
        if (i >= 0) {
            if (i < 0 ? false : z) {
                this.f = ProduceKt.b(y0.c, m0.b.plus(C), 0, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, (l<? super Throwable, i>) null, new TickerChannelsKt$ticker$3(tickerMode, j, j, (c<? super TickerChannelsKt$ticker$3>) null));
                return;
            }
            throw new IllegalArgumentException(i0.d.a.a.a.l0("Expected non-negative initial delay, but has ", j, " ms").toString());
        }
        throw new IllegalArgumentException(i0.d.a.a.a.l0("Expected non-negative delay, but has ", j, " ms").toString());
    }
}
