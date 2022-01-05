package com.clubhouse.android.ui.creation;

import androidx.fragment.app.Fragment;
import com.clubhouse.android.ui.creation.ChooseUsersFragment;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.n.q;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChooseUsersFragment.kt */
public final class ChooseUsersFragment$onViewCreated$2$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ ChooseUsersFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChooseUsersFragment$onViewCreated$2$1(ChooseUsersFragment chooseUsersFragment) {
        super(1);
        this.c = chooseUsersFragment;
    }

    public Object invoke(Object obj) {
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        Fragment parentFragment = this.c.getParentFragment();
        Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.clubhouse.android.ui.creation.ChooseUsersFragment.OnUsersSelectedListener");
        ChooseUsersFragment.a aVar = (ChooseUsersFragment.a) parentFragment;
        List<m> list = qVar.b;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (m mVar : list) {
            arrayList.add(mVar.g);
        }
        aVar.v(arrayList);
        return i.a;
    }
}
