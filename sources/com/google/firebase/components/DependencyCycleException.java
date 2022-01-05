package com.google.firebase.components;

import i0.h.c.j.d;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    public final List<d<?>> c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DependencyCycleException(java.util.List<i0.h.c.j.d<?>> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Dependency cycle detected: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.Object[] r1 = r3.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.DependencyCycleException.<init>(java.util.List):void");
    }
}
