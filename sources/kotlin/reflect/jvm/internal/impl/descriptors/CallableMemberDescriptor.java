package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.s;

public interface CallableMemberDescriptor extends a, s {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    CallableMemberDescriptor a();

    Collection<? extends CallableMemberDescriptor> e();

    Kind f();

    CallableMemberDescriptor j0(i iVar, Modality modality, p pVar, Kind kind, boolean z);

    void v0(Collection<? extends CallableMemberDescriptor> collection);
}
