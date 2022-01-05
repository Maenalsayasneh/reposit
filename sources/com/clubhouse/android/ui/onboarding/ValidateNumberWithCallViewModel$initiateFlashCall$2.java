package com.clubhouse.android.ui.onboarding;

import android.content.Context;
import com.sinch.verification.core.initiation.InitiationApiCallback;
import com.sinch.verification.core.internal.VerificationStateStatus;
import com.sinch.verification.core.internal.error.VerificationException;
import com.sinch.verification.flashcall.FlashCallVerificationMethod$onInitiate$1;
import com.sinch.verification.utils.permission.Permission;
import i0.e.b.g3.r.o2;
import i0.j.f.p.h;
import i0.n.a.c;
import i0.n.c.a.e.a;
import i0.n.c.b.a;
import i0.n.c.b.b;
import i0.n.c.b.c.a;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;

/* compiled from: ValidateNumberWithCallViewModel.kt */
public final class ValidateNumberWithCallViewModel$initiateFlashCall$2 extends Lambda implements l<o2, i> {
    public final /* synthetic */ ValidateNumberWithCallViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberWithCallViewModel$initiateFlashCall$2(ValidateNumberWithCallViewModel validateNumberWithCallViewModel) {
        super(1);
        this.c = validateNumberWithCallViewModel;
    }

    public Object invoke(Object obj) {
        o2 o2Var = (o2) obj;
        m0.n.b.i.e(o2Var, "state");
        Objects.requireNonNull(a.C0085a.Companion);
        a.C0085a aVar = new a.C0085a((f) null);
        Objects.requireNonNull(a.C0087a.Companion);
        a.C0087a aVar2 = new a.C0087a((f) null);
        i0.n.c.a.c.b.a aVar3 = this.c.n;
        m0.n.b.i.e(aVar3, "globalConfig");
        aVar2.e = aVar3;
        String str = o2Var.a;
        m0.n.b.i.e(str, "number");
        m0.n.b.i.e(str, "<set-?>");
        aVar2.b = str;
        aVar2.a(o2Var.b);
        i0.n.c.b.c.a aVar4 = (i0.n.c.b.c.a) aVar2.build();
        m0.n.b.i.e(aVar4, "config");
        aVar.d = aVar4;
        ValidateNumberWithCallViewModel validateNumberWithCallViewModel = this.c;
        m0.n.b.i.e(validateNumberWithCallViewModel, "initializationListener");
        aVar.b = validateNumberWithCallViewModel;
        ValidateNumberWithCallViewModel validateNumberWithCallViewModel2 = this.c;
        m0.n.b.i.e(validateNumberWithCallViewModel2, "verificationListener");
        aVar.c = validateNumberWithCallViewModel2;
        i0.n.c.b.c.a aVar5 = aVar.d;
        if (aVar5 != null) {
            i0.n.c.b.a aVar6 = new i0.n.c.b.a(aVar5, aVar.b, validateNumberWithCallViewModel2, (f) null);
            c cVar = aVar.a;
            StringBuilder P0 = i0.d.a.a.a.P0("Created FlashCallVerificationMethod with config: ");
            i0.n.c.b.c.a aVar7 = aVar.d;
            if (aVar7 != null) {
                P0.append(aVar7);
                h.s0(cVar, P0.toString(), (Throwable) null, 2, (Object) null);
                Context context = aVar6.c.getContext();
                Permission permission = Permission.READ_CALL_LOG;
                m0.n.b.i.e(context, "context");
                m0.n.b.i.e(permission, "permission");
                boolean z = false;
                if (!(g0.a.b.b.a.n(context, permission.getAndroidValue()) == 0)) {
                    aVar6.j.d(new VerificationException("Missing " + permission));
                }
                aVar6.h = new Date();
                i0.n.c.a.e.a aVar8 = aVar6.e;
                Objects.requireNonNull(aVar8);
                if (m0.n.b.i.a(aVar8, a.C0083a.a)) {
                    z = true;
                } else if (aVar8 instanceof a.b) {
                    z = ((a.b) aVar8).a.isFinished();
                }
                if (z) {
                    h.s0(aVar6.b, "Initiating verification", (Throwable) null, 2, (Object) null);
                    aVar6.d(new a.b(VerificationStateStatus.ONGOING, (i0.n.c.a.d.a.c) null));
                    c cVar2 = aVar6.b;
                    StringBuilder P02 = i0.d.a.a.a.P0("onInitiate called with requestData: ");
                    P02.append(aVar6.g());
                    h.Z1(cVar2, P02.toString(), (Throwable) null, 2, (Object) null);
                    h.z0(((b) aVar6.d).b(aVar6.g()), aVar6.f(), new InitiationApiCallback(aVar6.j, aVar6, (p) null, new FlashCallVerificationMethod$onInitiate$1(aVar6), 4));
                } else {
                    h.D4(aVar6.b, "Initiate called however onPreInitiate or verificationState.canInitiate returned false", (Throwable) null, 2, (Object) null);
                }
                return i.a;
            }
            m0.n.b.i.m("config");
            throw null;
        }
        m0.n.b.i.m("config");
        throw null;
    }
}
