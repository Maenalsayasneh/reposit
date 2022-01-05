package i0.j.f.r.a;

import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.f.c.f;
import com.instabug.survey.models.Survey;

/* compiled from: InstabugSurveysSubmitterService */
public class a implements Request.Callbacks<Boolean, Throwable> {
    public final /* synthetic */ Survey a;

    public a(Survey survey) {
        this.a = survey;
    }

    public void onFailed(Object obj) {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.e(this, th.getMessage(), th);
    }

    public void onSucceeded(Object obj) {
        Boolean bool = (Boolean) obj;
        this.a.setSurveyState(f.SYNCED);
        if (this.a.isLastEventSubmit()) {
            this.a.clearAnswers();
        }
        if (this.a.getSurveyEvents() != null) {
            this.a.getSurveyEvents().clear();
        }
        SurveysCacheManager.update(this.a);
    }
}
