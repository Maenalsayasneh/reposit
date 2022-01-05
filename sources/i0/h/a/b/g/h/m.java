package i0.h.a.b.g.h;

import i0.h.a.b.g.h.l;
import i0.h.a.b.g.h.m;
import i0.h.a.b.g.h.z;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public abstract class m<MessageType extends l<MessageType, BuilderType>, BuilderType extends m<MessageType, BuilderType>> implements x0 {
    public final /* synthetic */ x0 e(y0 y0Var) {
        z.b bVar = (z.b) this;
        if (bVar.c.getClass().isInstance(y0Var)) {
            bVar.f((z) ((l) y0Var));
            return bVar;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
