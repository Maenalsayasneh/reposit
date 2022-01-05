package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.r.l0;
import i0.e.b.g3.r.m0;
import i0.e.b.g3.r.o0;
import i0.e.b.g3.r.p1;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CollectNameViewModel.kt */
public final class CollectNameViewModel$updateName$2 extends Lambda implements p<o0, b<? extends EmptySuccessResponse>, o0> {
    public final /* synthetic */ CollectNameViewModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectNameViewModel$updateName$2(CollectNameViewModel collectNameViewModel, String str, String str2) {
        super(2);
        this.c = collectNameViewModel;
        this.d = str;
        this.q = str2;
    }

    public Object invoke(Object obj, Object obj2) {
        o0 o0Var = (o0) obj;
        b bVar = (b) obj2;
        i.e(o0Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            CollectNameViewModel collectNameViewModel = this.c;
            if (collectNameViewModel.n.i) {
                String str = this.d;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj3 = StringsKt__IndentKt.X(str).toString();
                String str2 = this.q;
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                CollectUsernameArgs collectUsernameArgs = new CollectUsernameArgs(obj3, StringsKt__IndentKt.X(str2).toString());
                i.e(collectUsernameArgs, "mavericksArg");
                collectNameViewModel.o(new p1(new m0(collectUsernameArgs)));
            } else {
                String str3 = this.d;
                Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj4 = StringsKt__IndentKt.X(str3).toString();
                String str4 = this.q;
                Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.CharSequence");
                CollectUsernameArgs collectUsernameArgs2 = new CollectUsernameArgs(obj4, StringsKt__IndentKt.X(str4).toString());
                i.e(collectUsernameArgs2, "mavericksArg");
                collectNameViewModel.o(new p1(new l0(collectUsernameArgs2)));
            }
            return o0.copy$default(o0Var, (BasicUser) null, false, 1, (Object) null);
        } else if (!(bVar instanceof c)) {
            return bVar instanceof f ? o0.copy$default(o0Var, (BasicUser) null, true, 1, (Object) null) : o0Var;
        } else {
            this.c.o(new d(((c) bVar).b.getMessage()));
            return o0.copy$default(o0Var, (BasicUser) null, false, 1, (Object) null);
        }
    }
}
