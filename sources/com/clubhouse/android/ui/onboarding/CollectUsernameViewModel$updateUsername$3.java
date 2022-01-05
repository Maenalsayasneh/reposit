package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.models.remote.response.error.ErrorResponse;
import com.clubhouse.android.data.models.remote.response.error.UpdateUsernameErrorResponse;
import com.clubhouse.android.data.network.ErrorResponseException;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.r.q1;
import i0.e.b.g3.r.r1;
import i0.e.b.g3.r.w0;
import i0.j.f.p.h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;
import m0.q.e;

/* compiled from: CollectUsernameViewModel.kt */
public final class CollectUsernameViewModel$updateUsername$3 extends Lambda implements p<w0, b<? extends EmptySuccessResponse>, w0> {
    public final /* synthetic */ CollectUsernameViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectUsernameViewModel$updateUsername$3(CollectUsernameViewModel collectUsernameViewModel) {
        super(2);
        this.c = collectUsernameViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        List<String> list;
        Iterable iterable;
        w0 w0Var = (w0) obj;
        b bVar = (b) obj2;
        i.e(w0Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            CollectUsernameViewModel collectUsernameViewModel = this.c;
            if (collectUsernameViewModel.n.h) {
                collectUsernameViewModel.o(r1.a);
            } else {
                collectUsernameViewModel.o(q1.a);
            }
            return w0.copy$default(w0Var, (String) null, (String) null, (String) null, (List) null, false, false, (b) null, 95, (Object) null);
        } else if (!(bVar instanceof c)) {
            return bVar instanceof f ? w0.copy$default(w0Var, (String) null, (String) null, (String) null, (List) null, false, true, (b) null, 95, (Object) null) : w0Var;
        } else {
            c cVar = (c) bVar;
            this.c.o(new d(cVar.b.getMessage()));
            Throwable th = cVar.b;
            if (th instanceof ErrorResponseException) {
                ErrorResponse errorResponse = ((ErrorResponseException) th).c;
                if (errorResponse instanceof UpdateUsernameErrorResponse) {
                    String str = ((UpdateUsernameErrorResponse) errorResponse).a;
                    if (str == null) {
                        list = null;
                    } else if (g.y(w0Var.d) >= 1) {
                        List L2 = h.L2(str);
                        List list2 = w0Var.d;
                        e eVar = new e(0, 1);
                        i.e(list2, "$this$slice");
                        i.e(eVar, "indices");
                        if (eVar.isEmpty()) {
                            iterable = EmptyList.c;
                        } else {
                            iterable = g.v0(list2.subList(eVar.c().intValue(), eVar.j().intValue() + 1));
                        }
                        list = g.Z(L2, iterable);
                    } else {
                        list = g.Z(h.L2(str), w0Var.d);
                    }
                    if (list == null) {
                        list = w0Var.d;
                    }
                    return w0.copy$default(w0Var, (String) null, (String) null, (String) null, list, false, false, (b) null, 87, (Object) null);
                }
            }
            return w0.copy$default(w0Var, (String) null, (String) null, (String) null, (List) null, false, false, (b) null, 95, (Object) null);
        }
    }
}
