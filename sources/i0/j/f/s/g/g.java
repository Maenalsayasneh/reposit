package i0.j.f.s.g;

import android.text.TextUtils;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.survey.models.Survey;

/* compiled from: SurveyFragmentPresenter */
public class g extends BasePresenter<f> implements BaseContract.Presenter {
    public Survey c;

    public g(f fVar, Survey survey) {
        super(fVar);
        this.c = survey;
    }

    public boolean k(Survey survey, int i) {
        if (survey.getType() == 2) {
            i = survey.isGooglePlayAppRating() ? 1 : 2;
        }
        return !TextUtils.isEmpty(survey.getQuestions().get(i).y);
    }
}
