package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.r.p0;
import i0.e.b.g3.r.s0;
import i0.e.b.g3.r.s1;
import i0.e.b.g3.r.t0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CollectPhoneNumberViewModel.kt */
public final class CollectPhoneNumberViewModel$validatePhoneNumber$3 extends Lambda implements p<p0, b<? extends StartPhoneNumberAuthResponse>, p0> {
    public final /* synthetic */ CollectPhoneNumberViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectPhoneNumberViewModel$validatePhoneNumber$3(CollectPhoneNumberViewModel collectPhoneNumberViewModel) {
        super(2);
        this.c = collectPhoneNumberViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        p0 p0Var = (p0) obj;
        final b bVar = (b) obj2;
        i.e(p0Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            f0 f0Var = (f0) bVar;
            if (((StartPhoneNumberAuthResponse) f0Var.b).a) {
                this.c.o(new d((String) null, 1));
            } else {
                final CollectPhoneNumberViewModel collectPhoneNumberViewModel = this.c;
                collectPhoneNumberViewModel.n(new l<p0, m0.i>() {
                    public Object invoke(Object obj) {
                        p0 p0Var = (p0) obj;
                        i.e(p0Var, "state");
                        ValidateNumberArgs validateNumberArgs = new ValidateNumberArgs(p0Var.b, p0Var.c);
                        if (i.a(((StartPhoneNumberAuthResponse) ((f0) bVar).b).d, Boolean.TRUE)) {
                            CollectPhoneNumberViewModel collectPhoneNumberViewModel = collectPhoneNumberViewModel;
                            i.e(validateNumberArgs, "mavericksArg");
                            s1 s1Var = new s1(new t0(validateNumberArgs));
                            int i = CollectPhoneNumberViewModel.m;
                            collectPhoneNumberViewModel.o(s1Var);
                        } else {
                            CollectPhoneNumberViewModel collectPhoneNumberViewModel2 = collectPhoneNumberViewModel;
                            i.e(validateNumberArgs, "mavericksArg");
                            s1 s1Var2 = new s1(new s0(validateNumberArgs));
                            int i2 = CollectPhoneNumberViewModel.m;
                            collectPhoneNumberViewModel2.o(s1Var2);
                        }
                        return m0.i.a;
                    }
                });
            }
            return p0.copy$default(p0Var, false, (String) null, ((StartPhoneNumberAuthResponse) f0Var.b).c, 2, (Object) null);
        } else if (!(bVar instanceof c)) {
            return bVar instanceof f ? p0.copy$default(p0Var, true, (String) null, (Integer) null, 6, (Object) null) : p0Var;
        } else {
            this.c.o(new d(((c) bVar).b.getMessage()));
            return p0.copy$default(p0Var, false, (String) null, (Integer) null, 6, (Object) null);
        }
    }
}
