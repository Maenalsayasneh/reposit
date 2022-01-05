package com.instabug.survey;

import com.instabug.survey.cache.SurveysCacheManager;
import i0.j.f.h;

public class Survey {
    private long surveyId;
    private String title;

    public Survey(long j, String str) {
        this.title = str;
        this.surveyId = j;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void show() {
        if (h.i() != null) {
            h i = h.i();
            long j = this.surveyId;
            synchronized (i) {
                if (SurveysCacheManager.getSurveyById(j) != null) {
                    i.e(SurveysCacheManager.getSurveyById(j));
                }
            }
        }
    }
}
