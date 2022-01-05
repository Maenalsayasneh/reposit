package m0.r.t.a.r.f.c;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import m0.j.g;
import m0.n.b.i;

/* compiled from: TypeTable.kt */
public final class e {
    public final List<ProtoBuf$Type> a;

    public e(ProtoBuf$TypeTable protoBuf$TypeTable) {
        i.e(protoBuf$TypeTable, "typeTable");
        List<ProtoBuf$Type> list = protoBuf$TypeTable.y;
        int i = 0;
        if ((protoBuf$TypeTable.x & 1) == 1) {
            int i2 = protoBuf$TypeTable.Y1;
            i.d(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(h.K(list, 10));
            for (T next : list) {
                int i3 = i + 1;
                if (i >= 0) {
                    ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) next;
                    if (i >= i2) {
                        Objects.requireNonNull(protoBuf$Type);
                        ProtoBuf$Type.b F = ProtoBuf$Type.F(protoBuf$Type);
                        F.x |= 2;
                        F.Y1 = true;
                        protoBuf$Type = F.m();
                        if (!protoBuf$Type.g()) {
                            throw new UninitializedMessageException();
                        }
                    }
                    arrayList.add(protoBuf$Type);
                    i = i3;
                } else {
                    g.r0();
                    throw null;
                }
            }
            list = arrayList;
        }
        i.d(list, "run {\n        val originalTypes = typeTable.typeList\n        if (typeTable.hasFirstNullable()) {\n            val firstNullable = typeTable.firstNullable\n            typeTable.typeList.mapIndexed { i, type ->\n                if (i >= firstNullable) {\n                    type.toBuilder().setNullable(true).build()\n                } else type\n            }\n        } else originalTypes\n    }");
        this.a = list;
    }

    public final ProtoBuf$Type a(int i) {
        return this.a.get(i);
    }
}
