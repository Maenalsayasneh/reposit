package com.clubhouse.android.ui.clubs.rules;

import i0.e.b.g3.l.b3.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EditClubRulesViewModel.kt */
public final class EditClubRulesViewModel$saveRules$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ EditClubRulesViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditClubRulesViewModel$saveRules$1(EditClubRulesViewModel editClubRulesViewModel) {
        super(1);
        this.c = editClubRulesViewModel;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "state");
        ArrayList arrayList = new ArrayList();
        if (EditClubRulesViewModel.q(this.c, arrayList, jVar.a) && EditClubRulesViewModel.q(this.c, arrayList, jVar.b) && EditClubRulesViewModel.q(this.c, arrayList, jVar.c)) {
            this.c.o(new i0.e.b.g3.l.b3.l(arrayList));
        }
        return i.a;
    }
}
