package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import i0.e.b.g3.l.i2;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModelForStranger$2$1$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModelForStranger$2$1$1(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        super(1);
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        final ClubFragment clubFragment = this.c;
        final ClubWithAdmin clubWithAdmin = this.d;
        actionSheetBuilder.a(new l<c, i>() {
            public Object invoke(Object obj) {
                c cVar = (c) obj;
                m0.n.b.i.e(cVar, "$this$action");
                String string = ClubFragment.this.getString(R.string.take_back_application_to_join);
                m0.n.b.i.d(string, "getString(R.string.take_back_application_to_join)");
                cVar.b(string);
                final ClubFragment clubFragment = ClubFragment.this;
                final ClubWithAdmin clubWithAdmin = clubWithAdmin;
                cVar.a(new a<i>() {
                    public Object invoke() {
                        ClubFragment.this.T0().p(new i2(clubWithAdmin.x));
                        return i.a;
                    }
                });
                return i.a;
            }
        });
        return i.a;
    }
}
