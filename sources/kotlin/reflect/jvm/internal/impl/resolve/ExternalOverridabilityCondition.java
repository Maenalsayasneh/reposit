package kotlin.reflect.jvm.internal.impl.resolve;

import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.d;

public interface ExternalOverridabilityCondition {

    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum Result {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    Contract a();

    Result b(a aVar, a aVar2, d dVar);
}
