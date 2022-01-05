package com.afollestad.assent.rationale;

import android.app.Activity;
import com.afollestad.assent.ActivitiesKt$askForPermissions$1;
import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import h0.b0.v;
import i0.a.a.a;
import i0.a.a.d;
import i0.a.a.f.c;
import kotlin.jvm.internal.FunctionReference;
import m0.i;
import m0.n.a.l;
import m0.n.a.r;
import m0.n.b.m;
import m0.r.f;

/* compiled from: AlertDialogRationaleHandler.kt */
public final /* synthetic */ class AlertDialogRationaleHandlerKt$createDialogRationale$2 extends FunctionReference implements r<Permission[], Integer, RationaleHandler, l<? super AssentResult, ? extends i>, i> {
    public AlertDialogRationaleHandlerKt$createDialogRationale$2(Activity activity) {
        super(4, activity);
    }

    public final String getName() {
        return "askForPermissions";
    }

    public final f getOwner() {
        return m.a.c(a.class, "rationales");
    }

    public final String getSignature() {
        return "askForPermissions(Landroid/app/Activity;[Lcom/afollestad/assent/Permission;ILcom/afollestad/assent/rationale/RationaleHandler;Lkotlin/jvm/functions/Function1;)V";
    }

    public Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        Permission[] permissionArr = (Permission[]) obj;
        l lVar = (l) obj4;
        m0.n.b.i.f(permissionArr, "p1");
        m0.n.b.i.f(lVar, "p4");
        Activity activity = (Activity) this.receiver;
        m0.n.b.i.f(activity, "$this$askForPermissions");
        m0.n.b.i.f(permissionArr, "permissions");
        m0.n.b.i.f(lVar, "callback");
        c cVar = new c(activity, new d(activity));
        v.k2(activity, ActivitiesKt$askForPermissions$1.c, permissionArr, ((Number) obj2).intValue(), cVar, (RationaleHandler) obj3, lVar);
        return i.a;
    }
}
