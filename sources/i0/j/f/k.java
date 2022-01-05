package i0.j.f;

import com.instabug.library.user.UserManagerWrapper;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.common.userInteractions.UserInteractionCacheManager;
import com.instabug.survey.f.c.i;
import com.instabug.survey.models.Survey;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: SurveysManager */
public class k implements Runnable {
    public final /* synthetic */ h c;

    public k(h hVar) {
        this.c = hVar;
    }

    public void run() {
        List<Survey> surveys = SurveysCacheManager.getSurveys();
        if (surveys != null && !surveys.isEmpty()) {
            Objects.requireNonNull(this.c);
            String userUUID = UserManagerWrapper.getUserUUID();
            ArrayList arrayList = new ArrayList();
            for (Survey next : surveys) {
                i retrieveUserInteraction = UserInteractionCacheManager.retrieveUserInteraction(next.getId(), userUUID, 0);
                if (retrieveUserInteraction != null) {
                    next.setUserInteraction(retrieveUserInteraction);
                    arrayList.add(next);
                }
            }
            if (!surveys.isEmpty()) {
                SurveysCacheManager.updateBulk(arrayList);
            }
        }
    }
}
