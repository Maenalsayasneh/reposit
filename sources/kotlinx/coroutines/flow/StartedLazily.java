package kotlinx.coroutines.flow;

import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.s;
import n0.a.g2.x;
import n0.a.g2.z;

/* compiled from: SharingStarted.kt */
public final class StartedLazily implements x {
    public d<SharingCommand> a(z<Integer> zVar) {
        return new s(new StartedLazily$command$1(zVar, (c<? super StartedLazily$command$1>) null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
