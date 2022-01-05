package kotlinx.coroutines.channels;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import n0.a.m;

/* compiled from: Produce.kt */
public final class ProduceKt$awaitClose$4$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ m<i> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProduceKt$awaitClose$4$1(m<? super i> mVar) {
        super(1);
        this.c = mVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        m<i> mVar = this.c;
        i iVar = i.a;
        mVar.resumeWith(iVar);
        return iVar;
    }
}
