package i0.j.f.s;

import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;

/* compiled from: SurveyPresenter */
public class c implements Runnable {
    public final /* synthetic */ Survey c;

    public c(Survey survey) {
        this.c = survey;
    }

    public void run() {
        SurveysCacheManager.update(this.c);
    }
}
