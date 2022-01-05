package n0.a.g2;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import m0.l.e;
import m0.n.b.i;
import n0.a.g2.d0.f;
import n0.a.h2.t;

/* compiled from: SharedFlow.kt */
public final class u {
    public static final t a = new t("NO_VALUE");

    public static final <T> p<T> a(int i, int i2, BufferOverflow bufferOverflow) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
                    z = false;
                }
                if (z) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new SharedFlowImpl(i, i3, bufferOverflow);
                }
                throw new IllegalArgumentException(i.k("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", bufferOverflow).toString());
            }
            throw new IllegalArgumentException(i.k("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i2)).toString());
        }
        throw new IllegalArgumentException(i.k("replay cannot be negative, but was ", Integer.valueOf(i)).toString());
    }

    public static /* synthetic */ p b(int i, int i2, BufferOverflow bufferOverflow, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i, i2, bufferOverflow);
    }

    public static final <T> d<T> c(t<? extends T> tVar, e eVar, int i, BufferOverflow bufferOverflow) {
        if ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return tVar;
        }
        return new f(tVar, eVar, i, bufferOverflow);
    }
}
