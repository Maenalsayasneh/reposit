package i0.j.f;

import com.instabug.library.internal.storage.cache.db.InstabugDBInsertionListener;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.common.userInteractions.UserInteractionCacheManager;
import com.instabug.survey.models.Survey;
import java.util.List;

/* compiled from: SurveysManager */
public class j implements InstabugDBInsertionListener<String> {
    public void onDataInserted(Object obj) {
        String str = (String) obj;
        List<Survey> surveys = SurveysCacheManager.getSurveys();
        if (surveys != null && !surveys.isEmpty()) {
            UserInteractionCacheManager.insertUserInteractions(surveys, str);
            SurveysCacheManager.resetSurveyUserInteraction(surveys);
        }
    }
}
