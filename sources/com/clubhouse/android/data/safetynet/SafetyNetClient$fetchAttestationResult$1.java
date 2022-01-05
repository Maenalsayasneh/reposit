package com.clubhouse.android.data.safetynet;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.safetynet.SafetyNetClient", f = "SafetyNetClient.kt", l = {134}, m = "fetchAttestationResult")
/* compiled from: SafetyNetClient.kt */
public final class SafetyNetClient$fetchAttestationResult$1 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ SafetyNetClient x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafetyNetClient$fetchAttestationResult$1(SafetyNetClient safetyNetClient, m0.l.c<? super SafetyNetClient$fetchAttestationResult$1> cVar) {
        super(cVar);
        this.x = safetyNetClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(this);
    }
}
