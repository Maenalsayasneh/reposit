package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.remote.request.SuggestUsernameResponse;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.e;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.g3.r.w0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CollectUsernameViewModel.kt */
public final class CollectUsernameViewModel$fetchSuggestedUsernames$3 extends Lambda implements p<w0, b<? extends SuggestUsernameResponse>, w0> {
    public static final CollectUsernameViewModel$fetchSuggestedUsernames$3 c = new CollectUsernameViewModel$fetchSuggestedUsernames$3();

    public CollectUsernameViewModel$fetchSuggestedUsernames$3() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        b bVar = (b) obj2;
        i.e(w0Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            List<String> list = ((SuggestUsernameResponse) ((f0) bVar).b).a;
            return w0.copy$default(w0Var, (String) null, (String) null, (String) g.z(list, 0), list, list.isEmpty(), false, new f0(m0.i.a), 3, (Object) null);
        } else if (bVar instanceof c) {
            return w0.copy$default(w0Var, (String) null, (String) null, (String) null, (List) null, true, false, new c(((c) bVar).b, (Object) null, 2), 15, (Object) null);
        } else {
            return w0.copy$default(w0Var, (String) null, (String) null, (String) null, (List) null, false, bVar instanceof e, new f((Object) null, 1), 31, (Object) null);
        }
    }
}
