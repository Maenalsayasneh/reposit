package com.instabug.featuresrequest.ui.d.f;

import com.instabug.featuresrequest.ui.b.c.e;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.d.h.e.f.a;

@SuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
/* compiled from: MainAllFeaturesFragment */
public class b extends e {
    public i0.j.d.h.b.c.e I0() {
        if (a.b == null) {
            synchronized (a.class) {
                if (a.b == null) {
                    a.b = new a();
                }
            }
        }
        return new i0.j.d.h.e.f.b(this, new i0.j.d.h.b.b(a.b));
    }
}
