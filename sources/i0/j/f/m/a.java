package i0.j.f.m;

import android.app.Activity;
import android.content.Intent;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.TimeUtils;
import com.instabug.survey.announcements.ui.activity.AnnouncementActivity;
import com.instabug.survey.f.c.a;
import i0.j.f.h;
import i0.j.f.p.i;
import java.util.Objects;

/* compiled from: AutoShowingManager */
public class a implements Runnable {
    public final /* synthetic */ com.instabug.survey.e.c.a c;
    public final /* synthetic */ c d;

    public a(c cVar, com.instabug.survey.e.c.a aVar) {
        this.d = cVar;
        this.c = aVar;
    }

    public void run() {
        if (!this.c.e()) {
            String simpleName = c.class.getSimpleName();
            StringBuilder P0 = i0.d.a.a.a.P0("this announcement ");
            P0.append(this.c.c);
            P0.append(" is answered and outdated");
            InstabugSDKLogger.w(simpleName, P0.toString());
            return;
        }
        Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
        if (targetActivity != null && h.i() != null) {
            h.i().g();
            i.b();
            com.instabug.survey.e.c.a aVar = this.c;
            Objects.requireNonNull(aVar);
            aVar.a2.Z1 = TimeUtils.currentTimeSeconds();
            a.C0111a aVar2 = a.C0111a.SHOW;
            long currentTimeSeconds = TimeUtils.currentTimeSeconds();
            com.instabug.survey.f.c.i iVar = aVar.a2;
            int i = iVar.c2 + 1;
            iVar.c2 = i;
            iVar.q.x.add(new com.instabug.survey.f.c.a(aVar2, currentTimeSeconds, i));
            Objects.requireNonNull(this.d);
            Intent intent = new Intent(targetActivity, AnnouncementActivity.class);
            intent.putExtra(InstabugDbContract.AnnouncementEntry.COLUMN_ANNOUNCEMENT, this.c);
            targetActivity.startActivity(intent);
        }
    }
}
