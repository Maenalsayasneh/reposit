package i0.j.f;

import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;

/* compiled from: SurveysManager */
public class i implements Runnable {
    public void run() {
        for (Survey next : SurveysCacheManager.getSurveys()) {
            if (next.isCancelled() && next.shouldShowAgain()) {
                next.incrementSessionCount();
                SurveysCacheManager.updateSessions(next);
            }
        }
    }
}
