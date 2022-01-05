package com.afollestad.assent.rationale;

import com.afollestad.assent.AssentResult;
import com.afollestad.assent.GrantResult;
import com.afollestad.assent.Permission;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RationaleHandler.kt */
public final class RationaleHandler$requestRationalePermissions$2 extends Lambda implements l<Boolean, i> {
    public final /* synthetic */ RationaleHandler c;
    public final /* synthetic */ Permission d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RationaleHandler$requestRationalePermissions$2(RationaleHandler rationaleHandler, Permission permission) {
        super(1);
        this.c = rationaleHandler;
        this.d = permission;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            RationaleHandler rationaleHandler = this.c;
            Permission permission = this.d;
            Objects.requireNonNull(rationaleHandler);
            m0.n.b.i.f(rationaleHandler, "$this$log");
            m0.n.b.i.f("Got rationale confirm signal for permission %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            m0.n.b.i.f(new Object[]{permission}, "args");
            rationaleHandler.l.h(new Permission[]{permission}, Integer.valueOf(((Number) rationaleHandler.c.getValue(rationaleHandler, RationaleHandler.a[0])).intValue()), null, new RationaleHandler$onUserConfirmedRationale$1(rationaleHandler, permission));
        } else {
            RationaleHandler rationaleHandler2 = this.c;
            Permission permission2 = this.d;
            Objects.requireNonNull(rationaleHandler2);
            m0.n.b.i.f(rationaleHandler2, "$this$log");
            m0.n.b.i.f("Got rationale deny signal for permission %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            m0.n.b.i.f(new Object[]{permission2}, "args");
            rationaleHandler2.i = v.p1(rationaleHandler2.i, new AssentResult(h.S2(new Pair(permission2, GrantResult.DENIED))));
            rationaleHandler2.b().remove(permission2);
            rationaleHandler2.d();
        }
        return i.a;
    }
}
