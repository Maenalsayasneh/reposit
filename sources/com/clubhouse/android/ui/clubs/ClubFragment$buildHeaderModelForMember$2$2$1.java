package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModelForMember$2$2$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ ClubWithAdmin c;
    public final /* synthetic */ ClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModelForMember$2$2$1(ClubWithAdmin clubWithAdmin, ClubFragment clubFragment) {
        super(1);
        this.c = clubWithAdmin;
        this.d = clubFragment;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        List<ClubRule> list = this.c.a2;
        if (!(list == null || list.isEmpty())) {
            actionSheetBuilder.a(new v(0, this.d, this.c));
        }
        actionSheetBuilder.a(new v(1, this.d, this.c));
        return i.a;
    }
}
