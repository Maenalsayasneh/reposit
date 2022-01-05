package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import m0.n.a.a;

/* compiled from: AbstractTypeConstructor.kt */
public final class AbstractTypeConstructor$supertypes$1 extends Lambda implements a<AbstractTypeConstructor.a> {
    public final /* synthetic */ AbstractTypeConstructor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$1(AbstractTypeConstructor abstractTypeConstructor) {
        super(0);
        this.c = abstractTypeConstructor;
    }

    public Object invoke() {
        return new AbstractTypeConstructor.a(this.c.g());
    }
}
