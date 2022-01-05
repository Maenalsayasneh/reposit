package com.instabug.survey.ui.i.l.b;

import com.instabug.survey.models.Survey;
import com.instabug.survey.models.b;
import com.instabug.survey.ui.SurveyActivity;
import i0.j.f.o.c;

/* compiled from: CustomizedTextQuestionFragment */
public class a extends com.instabug.survey.ui.i.l.a {
    public void L0(Survey survey) {
        if (getActivity() != null && (getActivity() instanceof SurveyActivity)) {
            ((SurveyActivity) getActivity()).B(survey);
        }
    }

    public void g() {
        if (this.Z1 != null) {
            if (c.f()) {
                if (getActivity() instanceof i0.j.f.s.a) {
                    b bVar = this.c;
                    if (bVar != null) {
                        bVar.b((String) null);
                    }
                    ((i0.j.f.s.a) getActivity()).B(this.Z1);
                }
            } else if (getActivity() instanceof i0.j.f.s.a) {
                ((i0.j.f.s.a) getActivity()).y(this.Z1);
            }
        }
    }
}
