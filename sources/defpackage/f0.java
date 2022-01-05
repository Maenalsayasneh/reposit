package defpackage;

import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: f0  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class f0 extends Lambda implements l<j, i> {
    public static final f0 Y1 = new f0(5);
    public static final f0 Z1 = new f0(6);
    public static final f0 c = new f0(0);
    public static final f0 d = new f0(1);
    public static final f0 q = new f0(2);
    public static final f0 x = new f0(3);
    public static final f0 y = new f0(4);
    public final /* synthetic */ int a2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(int i) {
        super(1);
        this.a2 = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a2) {
            case 0:
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                jVar.d(AudienceType.Social.getAlert());
                return i.a;
            case 1:
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showBanner");
                jVar2.d(AudienceType.Open.getAlert());
                return i.a;
            case 2:
                j jVar3 = (j) obj;
                m0.n.b.i.e(jVar3, "$this$showBanner");
                jVar3.d(R.string.room_alert_made_moderator);
                return i.a;
            case 3:
                j jVar4 = (j) obj;
                m0.n.b.i.e(jVar4, "$this$showBanner");
                jVar4.d(R.string.moved_to_audience);
                return i.a;
            case 4:
                j jVar5 = (j) obj;
                m0.n.b.i.e(jVar5, "$this$showBanner");
                jVar5.d(R.string.room_ended_alert);
                jVar5.h(Banner.Style.Negative);
                return i.a;
            case 5:
                j jVar6 = (j) obj;
                m0.n.b.i.e(jVar6, "$this$showBanner");
                jVar6.d(R.string.muted_by_moderator);
                return i.a;
            case 6:
                j jVar7 = (j) obj;
                m0.n.b.i.e(jVar7, "$this$showBanner");
                jVar7.d(R.string.removed_from_room);
                jVar7.h(Banner.Style.Negative);
                return i.a;
            default:
                throw null;
        }
    }
}
