package kotlinx.serialization;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0010\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "", "fieldNames", "serialName", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 4, 2})
/* compiled from: SerializationException.kt */
public final class MissingFieldException extends SerializationException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MissingFieldException(java.util.List<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fieldNames"
            m0.n.b.i.e(r3, r0)
            java.lang.String r0 = "serialName"
            m0.n.b.i.e(r4, r0)
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L_0x002c
            java.lang.String r0 = "Field '"
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            r1 = 0
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = "' is required for type with serial name '"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "', but it was missing"
            goto L_0x0043
        L_0x002c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fields "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " are required for type with serial name '"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "', but they were missing"
        L_0x0043:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4 = 0
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.MissingFieldException.<init>(java.util.List, java.lang.String):void");
    }
}
