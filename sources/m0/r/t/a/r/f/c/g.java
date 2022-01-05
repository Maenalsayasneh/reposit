package m0.r.t.a.r.f.c;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: VersionRequirement.kt */
public final class g {
    public static final a a = new a((f) null);
    public static final g b = new g(EmptyList.c);
    public final List<ProtoBuf$VersionRequirement> c;

    /* compiled from: VersionRequirement.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final g a(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            i.e(protoBuf$VersionRequirementTable, "table");
            if (protoBuf$VersionRequirementTable.x.size() == 0) {
                return g.b;
            }
            List<ProtoBuf$VersionRequirement> list = protoBuf$VersionRequirementTable.x;
            i.d(list, "table.requirementList");
            return new g(list, (f) null);
        }
    }

    public g(List<ProtoBuf$VersionRequirement> list) {
        this.c = list;
    }

    public g(List list, f fVar) {
        this.c = list;
    }
}
