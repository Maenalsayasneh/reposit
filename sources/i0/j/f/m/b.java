package i0.j.f.m;

import android.app.Activity;
import android.content.Intent;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.SurveyActivity;
import i0.j.f.h;
import i0.j.f.p.i;
import java.util.Objects;

/* compiled from: AutoShowingManager */
public class b implements Runnable {
    public final /* synthetic */ Survey c;
    public final /* synthetic */ c d;

    /* compiled from: AutoShowingManager */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b bVar = b.this;
            c cVar = bVar.d;
            long id = bVar.c.getId();
            Objects.requireNonNull(cVar);
            Survey surveyById = SurveysCacheManager.getSurveyById(id);
            if (!(surveyById != null && surveyById.shouldShow())) {
                String simpleName = c.class.getSimpleName();
                StringBuilder P0 = i0.d.a.a.a.P0("this survey ");
                P0.append(b.this.c.getId());
                P0.append(" is answered and outdated");
                InstabugSDKLogger.w(simpleName, P0.toString());
                return;
            }
            Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
            if (targetActivity != null && h.i() != null) {
                h.i().g();
                i.b();
                if (b.this.c.isOptInSurvey() && b.this.c.getSurveyEvents() != null && b.this.c.getSurveyEvents().size() > 0 && !b.this.c.isLastEventDismiss()) {
                    b.this.c.clearAnswers();
                }
                Objects.requireNonNull(b.this.d);
                b.this.c.addShowEvent();
                Intent intent = new Intent(targetActivity, SurveyActivity.class);
                intent.putExtra("survey", b.this.c);
                targetActivity.startActivity(intent);
                targetActivity.overridePendingTransition(0, 0);
            }
        }
    }

    public b(c cVar, Survey survey) {
        this.d = cVar;
        this.c = survey;
    }

    public synchronized void run() {
        PoolProvider.postIOTaskWithCheck(new a());
    }
}
