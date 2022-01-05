package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.remote.response.LanguagePreferencesResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.g3.r.n1;
import i0.e.b.g3.u.z5.v0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: LanguagesViewModel.kt */
public final class LanguagesViewModel$loadAllLanguages$2 extends Lambda implements p<v0, b<? extends LanguagePreferencesResponse>, v0> {
    public final /* synthetic */ LanguagesViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagesViewModel$loadAllLanguages$2(LanguagesViewModel languagesViewModel) {
        super(2);
        this.c = languagesViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        final b bVar = (b) obj2;
        i.e(v0Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.m(new l<v0, v0>() {
                public Object invoke(Object obj) {
                    v0 v0Var = (v0) obj;
                    i.e(v0Var, "$this$setState");
                    return v0.copy$default(v0Var, ((LanguagePreferencesResponse) ((f0) bVar).b).a, false, 2, (Object) null);
                }
            });
        } else if (bVar instanceof c) {
            this.c.o(n1.a);
        }
        return v0Var;
    }
}
