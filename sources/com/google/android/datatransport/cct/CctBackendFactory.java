package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import i0.h.a.a.i.p.d;
import i0.h.a.a.i.p.g;
import i0.h.a.a.i.p.l;

@Keep
public class CctBackendFactory implements d {
    public l create(g gVar) {
        return new i0.h.a.a.h.d(gVar.a(), gVar.d(), gVar.c());
    }
}
