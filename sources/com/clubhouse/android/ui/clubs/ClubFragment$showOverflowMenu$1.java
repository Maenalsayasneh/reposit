package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import i0.e.b.g3.l.x1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$showOverflowMenu$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ EventInClub c;
    public final /* synthetic */ ClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$showOverflowMenu$1(EventInClub eventInClub, ClubFragment clubFragment) {
        super(1);
        this.c = eventInClub;
        this.d = clubFragment;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        final EventInClub eventInClub = this.c;
        actionSheetBuilder.a = eventInClub.a2;
        final ClubFragment clubFragment = this.d;
        actionSheetBuilder.a(new l<c, i>() {
            public Object invoke(Object obj) {
                c cVar = (c) obj;
                m0.n.b.i.e(cVar, "$this$action");
                String string = ClubFragment.this.getString(R.string.delete_event);
                m0.n.b.i.d(string, "getString(R.string.delete_event)");
                cVar.b(string);
                final ClubFragment clubFragment = ClubFragment.this;
                final EventInClub eventInClub = eventInClub;
                cVar.a(new a<i>() {
                    public Object invoke() {
                        ClubFragment.this.T0().p(new x1(eventInClub));
                        return i.a;
                    }
                });
                return i.a;
            }
        });
        return i.a;
    }
}
