package com.instabug.survey.cache;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.models.Survey;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class SurveysCacheManager {
    @Deprecated
    public static final String SURVEYS_DISK_CACHE_FILE_NAME = "/surveys.cache";
    @Deprecated
    public static final String SURVEYS_DISK_CACHE_KEY = "surveys_disk_cache";

    public static class a implements Runnable {
        public final /* synthetic */ Survey c;

        public a(Survey survey) {
            this.c = survey;
        }

        public void run() {
            i0.j.f.e.a.d(this.c);
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ Survey c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean q;

        public b(Survey survey, boolean z, boolean z2) {
            this.c = survey;
            this.d = z;
            this.q = z2;
        }

        public void run() {
            Survey survey = this.c;
            boolean z = this.d;
            boolean z2 = this.q;
            Class<i0.j.f.e.a> cls = i0.j.f.e.a.class;
            synchronized (cls) {
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                try {
                    openDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("survey_id", Long.valueOf(survey.getId()));
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_TYPE, Integer.valueOf(survey.getType()));
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_GOOGLE_PLAY_RATING, Boolean.valueOf(survey.isGooglePlayAppRating()));
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_TITLE, survey.getTitle());
                    if (survey.getToken() != null) {
                        contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_TOKEN, survey.getToken());
                    }
                    contentValues.put("conditions_operator", survey.getConditionsOperator());
                    contentValues.put("answered", Integer.valueOf(survey.isAnswered() ? 1 : 0));
                    contentValues.put("dismissed_at", Long.valueOf(survey.getDismissedAt()));
                    contentValues.put("shown_at", Long.valueOf(survey.getShownAt()));
                    contentValues.put("isCancelled", Integer.valueOf(survey.isCancelled() ? 1 : 0));
                    contentValues.put("attemptCount", Integer.valueOf(survey.getAttemptCount()));
                    contentValues.put("eventIndex", Integer.valueOf(survey.getEventIndex()));
                    contentValues.put("shouldShowAgain", Integer.valueOf(survey.shouldShowAgain() ? 1 : 0));
                    contentValues.put("paused", Integer.valueOf(survey.isPaused() ? 1 : 0));
                    contentValues.put("sessionCounter", Integer.valueOf(survey.getSessionCounter()));
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_QUESTIONS, com.instabug.survey.models.b.c(survey.getQuestions()).toString());
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_THANKS_LIST, com.instabug.survey.models.c.b(survey.getThankYouItems()).toString());
                    contentValues.put("targetAudiences", com.instabug.survey.f.c.c.b(survey.getTargetAudiences()).toString());
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_CUSTOM_ATTRIBUTES, com.instabug.survey.f.c.c.b(survey.getCustomAttributes()).toString());
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_USER_EVENTS, com.instabug.survey.f.c.c.b(survey.getUserEvents()).toString());
                    contentValues.put("surveyState", survey.getSurveyState().toString());
                    contentValues.put("surveyTargeting", survey.getTarget().toJson());
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_SURVEY_TRIGGER_EVENT, survey.getTarget().y.a());
                    contentValues.put("isLocalized", Boolean.valueOf(survey.getLocalization().c));
                    contentValues.put("supportedLocales", new JSONArray((Collection<?>) survey.getLocalization().c()).toString());
                    if (!(survey.getLocalization() == null || survey.getLocalization().q == null)) {
                        contentValues.put("currentLocale", survey.getLocalization().q);
                    }
                    if (openDatabase.insertWithOnConflict(InstabugDbContract.SurveyEntry.TABLE_NAME, (String) null, contentValues) == -1) {
                        if (z) {
                            i0.j.f.e.a.f(openDatabase, survey);
                        }
                        if (z2) {
                            i0.j.f.e.a.b(openDatabase, survey);
                        }
                    }
                    openDatabase.setTransactionSuccessful();
                    InstabugSDKLogger.d(cls, "survey id: " + survey.getId() + " has been updated in " + InstabugDbContract.SurveyEntry.TABLE_NAME);
                    openDatabase.endTransaction();
                    openDatabase.close();
                } catch (Exception e) {
                    try {
                        InstabugSDKLogger.e(cls, "survey insertion failed due to " + e.getMessage());
                    } finally {
                        openDatabase.endTransaction();
                        openDatabase.close();
                    }
                }
            }
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ long c;

        public c(long j) {
            this.c = j;
        }

        public void run() {
            long j = this.c;
            synchronized (i0.j.f.e.a.class) {
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                String[] strArr = {String.valueOf(j)};
                openDatabase.beginTransaction();
                try {
                    openDatabase.delete(InstabugDbContract.SurveyEntry.TABLE_NAME, "survey_id=? ", strArr);
                    openDatabase.setTransactionSuccessful();
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
    }

    public static void addSurvey(Survey survey) {
        Class<i0.j.f.e.a> cls = i0.j.f.e.a.class;
        synchronized (cls) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("survey_id", Long.valueOf(survey.getId()));
                contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_TYPE, Integer.valueOf(survey.getType()));
                contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_GOOGLE_PLAY_RATING, Boolean.valueOf(survey.isGooglePlayAppRating()));
                contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_TITLE, survey.getTitle());
                if (survey.getToken() != null) {
                    contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_TOKEN, survey.getToken());
                }
                contentValues.put("conditions_operator", survey.getConditionsOperator());
                contentValues.put("answered", Integer.valueOf(survey.isAnswered() ? 1 : 0));
                contentValues.put("dismissed_at", Long.valueOf(survey.getDismissedAt()));
                contentValues.put("shown_at", Long.valueOf(survey.getShownAt()));
                contentValues.put("isCancelled", Integer.valueOf(survey.isCancelled() ? 1 : 0));
                contentValues.put("attemptCount", Integer.valueOf(survey.getAttemptCount()));
                contentValues.put("eventIndex", Integer.valueOf(survey.getEventIndex()));
                contentValues.put("shouldShowAgain", Integer.valueOf(survey.shouldShowAgain() ? 1 : 0));
                contentValues.put("paused", Integer.valueOf(survey.isPaused() ? 1 : 0));
                contentValues.put("sessionCounter", Integer.valueOf(survey.getSessionCounter()));
                contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_QUESTIONS, com.instabug.survey.models.b.c(survey.getQuestions()).toString());
                contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_THANKS_LIST, com.instabug.survey.models.c.b(survey.getThankYouItems()).toString());
                contentValues.put("targetAudiences", com.instabug.survey.f.c.c.b(survey.getTargetAudiences()).toString());
                contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_CUSTOM_ATTRIBUTES, com.instabug.survey.f.c.c.b(survey.getCustomAttributes()).toString());
                contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_USER_EVENTS, com.instabug.survey.f.c.c.b(survey.getUserEvents()).toString());
                contentValues.put("surveyState", survey.getSurveyState().toString());
                contentValues.put("surveyTargeting", survey.getTarget().toJson());
                contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_SURVEY_TRIGGER_EVENT, survey.getTarget().y.a());
                contentValues.put("isLocalized", Boolean.valueOf(survey.getLocalization().c));
                contentValues.put("supportedLocales", new JSONArray((Collection<?>) survey.getLocalization().c()).toString());
                if (!(survey.getLocalization() == null || survey.getLocalization().q == null)) {
                    contentValues.put("currentLocale", survey.getLocalization().q);
                }
                if (openDatabase.insertWithOnConflict(InstabugDbContract.SurveyEntry.TABLE_NAME, (String) null, contentValues) == -1) {
                    i0.j.f.e.a.d(survey);
                }
                openDatabase.setTransactionSuccessful();
                InstabugSDKLogger.d(cls, "survey id: " + survey.getId() + " has been added to " + InstabugDbContract.SurveyEntry.TABLE_NAME);
                openDatabase.endTransaction();
                openDatabase.close();
            } catch (JSONException e) {
                try {
                    InstabugSDKLogger.e(cls, "survey insertion failed due to " + e.getMessage());
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
    }

    public static void addSurveys(List<Survey> list) {
        for (Survey addSurvey : list) {
            addSurvey(addSurvey);
        }
    }

    public static void delete(long j) {
        PoolProvider.postIOTask(new c(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x033c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.instabug.survey.models.Survey> getEventTriggeredSurveys() {
        /*
            java.lang.Class<i0.j.f.e.a> r1 = i0.j.f.e.a.class
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r10 = r0.openDatabase()
            java.lang.String r0 = ""
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = "surveys_table"
            java.lang.String r5 = "surveyTriggerEvent != ?"
            r2 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != 0) goto L_0x0026
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x0335
        L_0x0026:
            java.lang.String r0 = "survey_id"
            int r0 = r2.getColumnIndex(r0)
            java.lang.String r3 = "survey_type"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r4 = "in_app_rating"
            int r4 = r2.getColumnIndex(r4)
            java.lang.String r5 = "survey_title"
            int r5 = r2.getColumnIndex(r5)
            java.lang.String r6 = "survey_token"
            int r6 = r2.getColumnIndex(r6)
            java.lang.String r7 = "conditions_operator"
            int r7 = r2.getColumnIndex(r7)
            java.lang.String r8 = "answered"
            int r8 = r2.getColumnIndex(r8)
            java.lang.String r9 = "dismissed_at"
            int r9 = r2.getColumnIndex(r9)
            java.lang.String r11 = "shown_at"
            int r11 = r2.getColumnIndex(r11)
            java.lang.String r12 = "isCancelled"
            int r12 = r2.getColumnIndex(r12)
            java.lang.String r13 = "attemptCount"
            int r13 = r2.getColumnIndex(r13)
            java.lang.String r14 = "eventIndex"
            int r14 = r2.getColumnIndex(r14)
            java.lang.String r15 = "shouldShowAgain"
            int r15 = r2.getColumnIndex(r15)
            r16 = r1
            java.lang.String r1 = "paused"
            int r1 = r2.getColumnIndex(r1)
            r17 = r1
            java.lang.String r1 = "sessionCounter"
            int r1 = r2.getColumnIndex(r1)
            r18 = r1
            java.lang.String r1 = "questions"
            int r1 = r2.getColumnIndex(r1)
            r19 = r1
            java.lang.String r1 = "thanks_list"
            int r1 = r2.getColumnIndex(r1)
            r20 = r1
            java.lang.String r1 = "targetAudiences"
            int r1 = r2.getColumnIndex(r1)
            r21 = r1
            java.lang.String r1 = "customAttributes"
            int r1 = r2.getColumnIndex(r1)
            r22 = r1
            java.lang.String r1 = "userEvents"
            int r1 = r2.getColumnIndex(r1)
            r23 = r1
            java.lang.String r1 = "surveyState"
            int r1 = r2.getColumnIndex(r1)
            r24 = r1
            java.lang.String r1 = "surveyTargeting"
            int r1 = r2.getColumnIndex(r1)
            r25 = r1
            java.lang.String r1 = "supportedLocales"
            int r1 = r2.getColumnIndex(r1)
            r26 = r1
            java.lang.String r1 = "isLocalized"
            int r1 = r2.getColumnIndex(r1)
            r27 = r1
            java.lang.String r1 = "currentLocale"
            int r1 = r2.getColumnIndex(r1)
            boolean r28 = r2.moveToFirst()     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            if (r28 != 0) goto L_0x00f6
            boolean r28 = r2.isClosed()     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            if (r28 != 0) goto L_0x00f6
            r2.close()     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            r0.<init>()     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x00f1
            r2.close()
        L_0x00f1:
            r10.close()
            goto L_0x0335
        L_0x00f6:
            r28 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0300 }
            r10.<init>()     // Catch:{ JSONException -> 0x0300 }
        L_0x00fd:
            long r29 = r2.getLong(r0)     // Catch:{ JSONException -> 0x0300 }
            java.lang.Long r29 = java.lang.Long.valueOf(r29)     // Catch:{ JSONException -> 0x0300 }
            r30 = r0
            int r0 = r2.getInt(r3)     // Catch:{ JSONException -> 0x0300 }
            r31 = r3
            int r3 = r2.getInt(r4)     // Catch:{ JSONException -> 0x0300 }
            r32 = r4
            java.lang.String r4 = r2.getString(r5)     // Catch:{ JSONException -> 0x0300 }
            r33 = r5
            java.lang.String r5 = r2.getString(r6)     // Catch:{ JSONException -> 0x0300 }
            r34 = r6
            java.lang.String r6 = r2.getString(r7)     // Catch:{ JSONException -> 0x0300 }
            r35 = r7
            int r7 = r2.getInt(r8)     // Catch:{ JSONException -> 0x0300 }
            r36 = r8
            int r8 = r2.getInt(r9)     // Catch:{ JSONException -> 0x0300 }
            r37 = r9
            int r9 = r2.getInt(r11)     // Catch:{ JSONException -> 0x0300 }
            r38 = r11
            int r11 = r2.getInt(r12)     // Catch:{ JSONException -> 0x0300 }
            r39 = r12
            int r12 = r2.getInt(r13)     // Catch:{ JSONException -> 0x0300 }
            r40 = r13
            int r13 = r2.getInt(r14)     // Catch:{ JSONException -> 0x0300 }
            r41 = r14
            int r14 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0300 }
            r42 = r15
            r15 = r17
            r17 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0300 }
            r43 = r15
            r15 = r18
            r18 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0300 }
            r44 = r15
            r15 = r19
            r19 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r45 = r15
            r15 = r20
            r20 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r46 = r15
            r15 = r21
            r21 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r47 = r15
            r15 = r22
            r22 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r48 = r15
            r15 = r23
            r23 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r49 = r15
            r15 = r24
            java.lang.String r24 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r50 = r15
            r15 = r25
            java.lang.String r25 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r51 = r15
            r15 = r26
            r26 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r52 = r15
            r15 = r27
            r27 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0300 }
            r53 = r15
            java.lang.String r15 = r2.getString(r1)     // Catch:{ JSONException -> 0x0300 }
            r54 = r1
            com.instabug.survey.models.Survey r1 = new com.instabug.survey.models.Survey     // Catch:{ JSONException -> 0x0300 }
            r1.<init>()     // Catch:{ JSONException -> 0x0300 }
            r55 = r14
            r56 = r15
            long r14 = r29.longValue()     // Catch:{ JSONException -> 0x0300 }
            r1.setId(r14)     // Catch:{ JSONException -> 0x0300 }
            r1.setType(r0)     // Catch:{ JSONException -> 0x0300 }
            r0 = 0
            r14 = 1
            if (r3 != r14) goto L_0x01d8
            r3 = r14
            goto L_0x01d9
        L_0x01d8:
            r3 = r0
        L_0x01d9:
            r1.setGooglePlayAppRating(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setTitle(r4)     // Catch:{ JSONException -> 0x0300 }
            r1.setToken(r5)     // Catch:{ JSONException -> 0x0300 }
            r1.setConditionsOperator(r6)     // Catch:{ JSONException -> 0x0300 }
            if (r7 != r14) goto L_0x01e9
            r3 = r14
            goto L_0x01ea
        L_0x01e9:
            r3 = r0
        L_0x01ea:
            r1.setAnswered(r3)     // Catch:{ JSONException -> 0x0300 }
            long r3 = (long) r8     // Catch:{ JSONException -> 0x0300 }
            r1.setDismissedAt(r3)     // Catch:{ JSONException -> 0x0300 }
            long r3 = (long) r9     // Catch:{ JSONException -> 0x0300 }
            r1.setShowAt(r3)     // Catch:{ JSONException -> 0x0300 }
            if (r11 != r14) goto L_0x01f9
            r3 = r14
            goto L_0x01fa
        L_0x01f9:
            r3 = r0
        L_0x01fa:
            r1.setCancelled(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setAttemptCount(r12)     // Catch:{ JSONException -> 0x0300 }
            r1.setEventIndex(r13)     // Catch:{ JSONException -> 0x0300 }
            r3 = r55
            if (r3 != r14) goto L_0x0209
            r3 = r14
            goto L_0x020a
        L_0x0209:
            r3 = r0
        L_0x020a:
            r1.setShouldShowAgain(r3)     // Catch:{ JSONException -> 0x0300 }
            r3 = r18
            if (r3 != r14) goto L_0x0213
            r3 = r14
            goto L_0x0214
        L_0x0213:
            r3 = r0
        L_0x0214:
            r1.setPaused(r3)     // Catch:{ JSONException -> 0x0300 }
            r3 = r19
            r1.setSessionCount(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r20
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.models.b.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setQuestions(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r21
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.models.c.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setThankYouItems(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r22
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setTargetAudiences(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r23
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setCustomAttributes(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r26
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setUserEvents(r3)     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.f r3 = com.instabug.survey.f.c.f.valueOf(r24)     // Catch:{ JSONException -> 0x0300 }
            r1.setSurveyState(r3)     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.g r3 = com.instabug.survey.f.c.g.b(r25)     // Catch:{ JSONException -> 0x0300 }
            r1.setTarget(r3)     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r5 = r27
            r4.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x0300 }
            r3.a(r4)     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x0300 }
            r4 = r56
            r3.q = r4     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x0300 }
            if (r10 != r14) goto L_0x028d
            r0 = r14
        L_0x028d:
            r3.c = r0     // Catch:{ JSONException -> 0x0300 }
            r0 = r17
            r0.add(r1)     // Catch:{ JSONException -> 0x0300 }
            boolean r1 = r2.moveToNext()     // Catch:{ JSONException -> 0x0300 }
            if (r1 != 0) goto L_0x02c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0300 }
            r1.<init>()     // Catch:{ JSONException -> 0x0300 }
            int r3 = r0.size()     // Catch:{ JSONException -> 0x0300 }
            r1.append(r3)     // Catch:{ JSONException -> 0x0300 }
            java.lang.String r3 = " surveys are not answered, have been retrieved from "
            r1.append(r3)     // Catch:{ JSONException -> 0x0300 }
            java.lang.String r3 = "surveys_table"
            r1.append(r3)     // Catch:{ JSONException -> 0x0300 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0300 }
            r3 = r16
            com.instabug.library.util.InstabugSDKLogger.d(r3, r1)     // Catch:{ JSONException -> 0x02c7 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x02c2
            r2.close()
        L_0x02c2:
            r28.close()
            goto L_0x0335
        L_0x02c7:
            r0 = move-exception
            goto L_0x030c
        L_0x02c9:
            r10 = r0
            r0 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r21 = r47
            r22 = r48
            r23 = r49
            r24 = r50
            r25 = r51
            r26 = r52
            r27 = r53
            r1 = r54
            goto L_0x00fd
        L_0x02fe:
            r0 = move-exception
            goto L_0x0336
        L_0x0300:
            r0 = move-exception
        L_0x0301:
            r3 = r16
            goto L_0x030c
        L_0x0304:
            r0 = move-exception
            r28 = r10
            goto L_0x0336
        L_0x0308:
            r0 = move-exception
            r28 = r10
            goto L_0x0301
        L_0x030c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fe }
            r1.<init>()     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = "survey conversion failed due to "
            r1.append(r4)     // Catch:{ all -> 0x02fe }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02fe }
            r1.append(r0)     // Catch:{ all -> 0x02fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02fe }
            com.instabug.library.util.InstabugSDKLogger.e(r3, r0)     // Catch:{ all -> 0x02fe }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02fe }
            r0.<init>()     // Catch:{ all -> 0x02fe }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x0332
            r2.close()
        L_0x0332:
            r28.close()
        L_0x0335:
            return r0
        L_0x0336:
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x033f
            r2.close()
        L_0x033f:
            r28.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.cache.SurveysCacheManager.getEventTriggeredSurveys():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0343  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.instabug.survey.models.Survey> getNotAnsweredSurveys() {
        /*
            java.lang.Class<i0.j.f.e.a> r1 = i0.j.f.e.a.class
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r10 = r0.openDatabase()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r11 = 0
            java.lang.String r2 = java.lang.String.valueOf(r11)
            r6[r11] = r2
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = "surveys_table"
            java.lang.String r5 = "answered=?"
            r2 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != 0) goto L_0x002a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x033c
        L_0x002a:
            java.lang.String r3 = "survey_id"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r4 = "survey_type"
            int r4 = r2.getColumnIndex(r4)
            java.lang.String r5 = "in_app_rating"
            int r5 = r2.getColumnIndex(r5)
            java.lang.String r6 = "survey_title"
            int r6 = r2.getColumnIndex(r6)
            java.lang.String r7 = "survey_token"
            int r7 = r2.getColumnIndex(r7)
            java.lang.String r8 = "conditions_operator"
            int r8 = r2.getColumnIndex(r8)
            java.lang.String r9 = "answered"
            int r9 = r2.getColumnIndex(r9)
            java.lang.String r12 = "dismissed_at"
            int r12 = r2.getColumnIndex(r12)
            java.lang.String r13 = "shown_at"
            int r13 = r2.getColumnIndex(r13)
            java.lang.String r14 = "isCancelled"
            int r14 = r2.getColumnIndex(r14)
            java.lang.String r15 = "attemptCount"
            int r15 = r2.getColumnIndex(r15)
            java.lang.String r11 = "eventIndex"
            int r11 = r2.getColumnIndex(r11)
            java.lang.String r0 = "shouldShowAgain"
            int r0 = r2.getColumnIndex(r0)
            r16 = r1
            java.lang.String r1 = "paused"
            int r1 = r2.getColumnIndex(r1)
            r17 = r1
            java.lang.String r1 = "sessionCounter"
            int r1 = r2.getColumnIndex(r1)
            r18 = r1
            java.lang.String r1 = "questions"
            int r1 = r2.getColumnIndex(r1)
            r19 = r1
            java.lang.String r1 = "thanks_list"
            int r1 = r2.getColumnIndex(r1)
            r20 = r1
            java.lang.String r1 = "targetAudiences"
            int r1 = r2.getColumnIndex(r1)
            r21 = r1
            java.lang.String r1 = "customAttributes"
            int r1 = r2.getColumnIndex(r1)
            r22 = r1
            java.lang.String r1 = "userEvents"
            int r1 = r2.getColumnIndex(r1)
            r23 = r1
            java.lang.String r1 = "surveyState"
            int r1 = r2.getColumnIndex(r1)
            r24 = r1
            java.lang.String r1 = "surveyTargeting"
            int r1 = r2.getColumnIndex(r1)
            r25 = r1
            java.lang.String r1 = "supportedLocales"
            int r1 = r2.getColumnIndex(r1)
            r26 = r1
            java.lang.String r1 = "isLocalized"
            int r1 = r2.getColumnIndex(r1)
            r27 = r1
            java.lang.String r1 = "currentLocale"
            int r1 = r2.getColumnIndex(r1)
            boolean r28 = r2.moveToFirst()     // Catch:{ JSONException -> 0x030f, all -> 0x030b }
            if (r28 != 0) goto L_0x00fa
            boolean r28 = r2.isClosed()     // Catch:{ JSONException -> 0x030f, all -> 0x030b }
            if (r28 != 0) goto L_0x00fa
            r2.close()     // Catch:{ JSONException -> 0x030f, all -> 0x030b }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x030f, all -> 0x030b }
            r0.<init>()     // Catch:{ JSONException -> 0x030f, all -> 0x030b }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x00f5
            r2.close()
        L_0x00f5:
            r10.close()
            goto L_0x033c
        L_0x00fa:
            r28 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0307 }
            r10.<init>()     // Catch:{ JSONException -> 0x0307 }
        L_0x0101:
            long r29 = r2.getLong(r3)     // Catch:{ JSONException -> 0x0307 }
            java.lang.Long r29 = java.lang.Long.valueOf(r29)     // Catch:{ JSONException -> 0x0307 }
            r30 = r3
            int r3 = r2.getInt(r4)     // Catch:{ JSONException -> 0x0307 }
            r31 = r4
            int r4 = r2.getInt(r5)     // Catch:{ JSONException -> 0x0307 }
            r32 = r5
            java.lang.String r5 = r2.getString(r6)     // Catch:{ JSONException -> 0x0307 }
            r33 = r6
            java.lang.String r6 = r2.getString(r7)     // Catch:{ JSONException -> 0x0307 }
            r34 = r7
            java.lang.String r7 = r2.getString(r8)     // Catch:{ JSONException -> 0x0307 }
            r35 = r8
            int r8 = r2.getInt(r9)     // Catch:{ JSONException -> 0x0307 }
            r36 = r9
            int r9 = r2.getInt(r12)     // Catch:{ JSONException -> 0x0307 }
            r37 = r12
            int r12 = r2.getInt(r13)     // Catch:{ JSONException -> 0x0307 }
            r38 = r13
            int r13 = r2.getInt(r14)     // Catch:{ JSONException -> 0x0307 }
            r39 = r14
            int r14 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0307 }
            r40 = r15
            int r15 = r2.getInt(r11)     // Catch:{ JSONException -> 0x0307 }
            r41 = r11
            int r11 = r2.getInt(r0)     // Catch:{ JSONException -> 0x0307 }
            r42 = r0
            r0 = r17
            r17 = r10
            int r10 = r2.getInt(r0)     // Catch:{ JSONException -> 0x0307 }
            r43 = r0
            r0 = r18
            r18 = r10
            int r10 = r2.getInt(r0)     // Catch:{ JSONException -> 0x0307 }
            r44 = r0
            r0 = r19
            r19 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x0307 }
            r45 = r0
            r0 = r20
            r20 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x0307 }
            r46 = r0
            r0 = r21
            r21 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x0307 }
            r47 = r0
            r0 = r22
            r22 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x0307 }
            r48 = r0
            r0 = r23
            r23 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x0307 }
            r49 = r0
            r0 = r24
            java.lang.String r24 = r2.getString(r0)     // Catch:{ JSONException -> 0x0307 }
            r50 = r0
            r0 = r25
            java.lang.String r25 = r2.getString(r0)     // Catch:{ JSONException -> 0x0307 }
            r51 = r0
            r0 = r26
            r26 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x0307 }
            r52 = r0
            r0 = r27
            r27 = r10
            int r10 = r2.getInt(r0)     // Catch:{ JSONException -> 0x0307 }
            r53 = r0
            java.lang.String r0 = r2.getString(r1)     // Catch:{ JSONException -> 0x0307 }
            r54 = r1
            com.instabug.survey.models.Survey r1 = new com.instabug.survey.models.Survey     // Catch:{ JSONException -> 0x0307 }
            r1.<init>()     // Catch:{ JSONException -> 0x0307 }
            r56 = r10
            r55 = r11
            long r10 = r29.longValue()     // Catch:{ JSONException -> 0x0307 }
            r1.setId(r10)     // Catch:{ JSONException -> 0x0307 }
            r1.setTitle(r5)     // Catch:{ JSONException -> 0x0307 }
            r1.setType(r3)     // Catch:{ JSONException -> 0x0307 }
            r3 = 1
            if (r4 != r3) goto L_0x01de
            r4 = r3
            goto L_0x01df
        L_0x01de:
            r4 = 0
        L_0x01df:
            r1.setGooglePlayAppRating(r4)     // Catch:{ JSONException -> 0x0307 }
            r1.setToken(r6)     // Catch:{ JSONException -> 0x0307 }
            r1.setConditionsOperator(r7)     // Catch:{ JSONException -> 0x0307 }
            if (r8 != r3) goto L_0x01ec
            r3 = 1
            goto L_0x01ed
        L_0x01ec:
            r3 = 0
        L_0x01ed:
            r1.setAnswered(r3)     // Catch:{ JSONException -> 0x0307 }
            long r3 = (long) r9     // Catch:{ JSONException -> 0x0307 }
            r1.setDismissedAt(r3)     // Catch:{ JSONException -> 0x0307 }
            long r3 = (long) r12     // Catch:{ JSONException -> 0x0307 }
            r1.setShowAt(r3)     // Catch:{ JSONException -> 0x0307 }
            r3 = 1
            if (r13 != r3) goto L_0x01fd
            r4 = r3
            goto L_0x01fe
        L_0x01fd:
            r4 = 0
        L_0x01fe:
            r1.setCancelled(r4)     // Catch:{ JSONException -> 0x0307 }
            r1.setAttemptCount(r14)     // Catch:{ JSONException -> 0x0307 }
            r1.setEventIndex(r15)     // Catch:{ JSONException -> 0x0307 }
            r4 = r55
            if (r4 != r3) goto L_0x020d
            r4 = r3
            goto L_0x020e
        L_0x020d:
            r4 = 0
        L_0x020e:
            r1.setShouldShowAgain(r4)     // Catch:{ JSONException -> 0x0307 }
            r4 = r18
            if (r4 != r3) goto L_0x0217
            r3 = 1
            goto L_0x0218
        L_0x0217:
            r3 = 0
        L_0x0218:
            r1.setPaused(r3)     // Catch:{ JSONException -> 0x0307 }
            r3 = r19
            r1.setSessionCount(r3)     // Catch:{ JSONException -> 0x0307 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0307 }
            r4 = r20
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0307 }
            java.util.ArrayList r3 = com.instabug.survey.models.b.a(r3)     // Catch:{ JSONException -> 0x0307 }
            r1.setQuestions(r3)     // Catch:{ JSONException -> 0x0307 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0307 }
            r4 = r21
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0307 }
            java.util.ArrayList r3 = com.instabug.survey.models.c.a(r3)     // Catch:{ JSONException -> 0x0307 }
            r1.setThankYouItems(r3)     // Catch:{ JSONException -> 0x0307 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0307 }
            r4 = r22
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0307 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0307 }
            r1.setTargetAudiences(r3)     // Catch:{ JSONException -> 0x0307 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0307 }
            r4 = r23
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0307 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0307 }
            r1.setCustomAttributes(r3)     // Catch:{ JSONException -> 0x0307 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0307 }
            r4 = r26
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0307 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0307 }
            r1.setUserEvents(r3)     // Catch:{ JSONException -> 0x0307 }
            com.instabug.survey.f.c.f r3 = com.instabug.survey.f.c.f.valueOf(r24)     // Catch:{ JSONException -> 0x0307 }
            r1.setSurveyState(r3)     // Catch:{ JSONException -> 0x0307 }
            com.instabug.survey.f.c.g r3 = com.instabug.survey.f.c.g.b(r25)     // Catch:{ JSONException -> 0x0307 }
            r1.setTarget(r3)     // Catch:{ JSONException -> 0x0307 }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x0307 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0307 }
            r5 = r27
            r4.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x0307 }
            r3.a(r4)     // Catch:{ JSONException -> 0x0307 }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x0307 }
            r3.q = r0     // Catch:{ JSONException -> 0x0307 }
            com.instabug.survey.f.c.b r0 = r1.getLocalization()     // Catch:{ JSONException -> 0x0307 }
            r4 = r56
            r3 = 1
            if (r4 != r3) goto L_0x0293
            r4 = r3
            goto L_0x0294
        L_0x0293:
            r4 = 0
        L_0x0294:
            r0.c = r4     // Catch:{ JSONException -> 0x0307 }
            r0 = r17
            r0.add(r1)     // Catch:{ JSONException -> 0x0307 }
            boolean r1 = r2.moveToNext()     // Catch:{ JSONException -> 0x0307 }
            if (r1 != 0) goto L_0x02d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0307 }
            r1.<init>()     // Catch:{ JSONException -> 0x0307 }
            int r3 = r0.size()     // Catch:{ JSONException -> 0x0307 }
            r1.append(r3)     // Catch:{ JSONException -> 0x0307 }
            java.lang.String r3 = " surveys are not answered, have been retrieved from "
            r1.append(r3)     // Catch:{ JSONException -> 0x0307 }
            java.lang.String r3 = "surveys_table"
            r1.append(r3)     // Catch:{ JSONException -> 0x0307 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0307 }
            r4 = r16
            com.instabug.library.util.InstabugSDKLogger.d(r4, r1)     // Catch:{ JSONException -> 0x02ce }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x02c9
            r2.close()
        L_0x02c9:
            r28.close()
            goto L_0x033c
        L_0x02ce:
            r0 = move-exception
            goto L_0x0313
        L_0x02d0:
            r10 = r0
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r11 = r41
            r0 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r21 = r47
            r22 = r48
            r23 = r49
            r24 = r50
            r25 = r51
            r26 = r52
            r27 = r53
            r1 = r54
            goto L_0x0101
        L_0x0305:
            r0 = move-exception
            goto L_0x033d
        L_0x0307:
            r0 = move-exception
        L_0x0308:
            r4 = r16
            goto L_0x0313
        L_0x030b:
            r0 = move-exception
            r28 = r10
            goto L_0x033d
        L_0x030f:
            r0 = move-exception
            r28 = r10
            goto L_0x0308
        L_0x0313:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0305 }
            r1.<init>()     // Catch:{ all -> 0x0305 }
            java.lang.String r3 = "survey conversion failed due to "
            r1.append(r3)     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0305 }
            r1.append(r0)     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0305 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r0)     // Catch:{ all -> 0x0305 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0305 }
            r0.<init>()     // Catch:{ all -> 0x0305 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x0339
            r2.close()
        L_0x0339:
            r28.close()
        L_0x033c:
            return r0
        L_0x033d:
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x0346
            r2.close()
        L_0x0346:
            r28.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.cache.SurveysCacheManager.getNotAnsweredSurveys():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0346  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.instabug.survey.models.Survey> getReadyToSendSurveys() {
        /*
            java.lang.Class<i0.j.f.e.a> r1 = i0.j.f.e.a.class
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r10 = r0.openDatabase()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            com.instabug.survey.f.c.f r2 = com.instabug.survey.f.c.f.READY_TO_SEND
            java.lang.String r2 = r2.toString()
            r11 = 0
            r6[r11] = r2
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = "surveys_table"
            java.lang.String r5 = "surveyState=? "
            r2 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != 0) goto L_0x002c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x033f
        L_0x002c:
            java.lang.String r3 = "survey_id"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r4 = "survey_type"
            int r4 = r2.getColumnIndex(r4)
            java.lang.String r5 = "in_app_rating"
            int r5 = r2.getColumnIndex(r5)
            java.lang.String r6 = "survey_title"
            int r6 = r2.getColumnIndex(r6)
            java.lang.String r7 = "survey_token"
            int r7 = r2.getColumnIndex(r7)
            java.lang.String r8 = "conditions_operator"
            int r8 = r2.getColumnIndex(r8)
            java.lang.String r9 = "answered"
            int r9 = r2.getColumnIndex(r9)
            java.lang.String r12 = "dismissed_at"
            int r12 = r2.getColumnIndex(r12)
            java.lang.String r13 = "shown_at"
            int r13 = r2.getColumnIndex(r13)
            java.lang.String r14 = "isCancelled"
            int r14 = r2.getColumnIndex(r14)
            java.lang.String r15 = "attemptCount"
            int r15 = r2.getColumnIndex(r15)
            java.lang.String r11 = "eventIndex"
            int r11 = r2.getColumnIndex(r11)
            java.lang.String r0 = "shouldShowAgain"
            int r0 = r2.getColumnIndex(r0)
            r16 = r1
            java.lang.String r1 = "paused"
            int r1 = r2.getColumnIndex(r1)
            r17 = r1
            java.lang.String r1 = "sessionCounter"
            int r1 = r2.getColumnIndex(r1)
            r18 = r1
            java.lang.String r1 = "questions"
            int r1 = r2.getColumnIndex(r1)
            r19 = r1
            java.lang.String r1 = "thanks_list"
            int r1 = r2.getColumnIndex(r1)
            r20 = r1
            java.lang.String r1 = "targetAudiences"
            int r1 = r2.getColumnIndex(r1)
            r21 = r1
            java.lang.String r1 = "customAttributes"
            int r1 = r2.getColumnIndex(r1)
            r22 = r1
            java.lang.String r1 = "userEvents"
            int r1 = r2.getColumnIndex(r1)
            r23 = r1
            java.lang.String r1 = "surveyState"
            int r1 = r2.getColumnIndex(r1)
            r24 = r1
            java.lang.String r1 = "surveyTargeting"
            int r1 = r2.getColumnIndex(r1)
            r25 = r1
            java.lang.String r1 = "supportedLocales"
            int r1 = r2.getColumnIndex(r1)
            r26 = r1
            java.lang.String r1 = "isLocalized"
            int r1 = r2.getColumnIndex(r1)
            r27 = r1
            java.lang.String r1 = "currentLocale"
            int r1 = r2.getColumnIndex(r1)
            boolean r28 = r2.moveToFirst()     // Catch:{ JSONException -> 0x0312, all -> 0x030e }
            if (r28 != 0) goto L_0x00fc
            boolean r28 = r2.isClosed()     // Catch:{ JSONException -> 0x0312, all -> 0x030e }
            if (r28 != 0) goto L_0x00fc
            r2.close()     // Catch:{ JSONException -> 0x0312, all -> 0x030e }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0312, all -> 0x030e }
            r0.<init>()     // Catch:{ JSONException -> 0x0312, all -> 0x030e }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x00f7
            r2.close()
        L_0x00f7:
            r10.close()
            goto L_0x033f
        L_0x00fc:
            r28 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x030a }
            r10.<init>()     // Catch:{ JSONException -> 0x030a }
        L_0x0103:
            long r29 = r2.getLong(r3)     // Catch:{ JSONException -> 0x030a }
            java.lang.Long r29 = java.lang.Long.valueOf(r29)     // Catch:{ JSONException -> 0x030a }
            r30 = r3
            int r3 = r2.getInt(r4)     // Catch:{ JSONException -> 0x030a }
            r31 = r4
            int r4 = r2.getInt(r5)     // Catch:{ JSONException -> 0x030a }
            r32 = r5
            java.lang.String r5 = r2.getString(r6)     // Catch:{ JSONException -> 0x030a }
            r33 = r6
            java.lang.String r6 = r2.getString(r7)     // Catch:{ JSONException -> 0x030a }
            r34 = r7
            java.lang.String r7 = r2.getString(r8)     // Catch:{ JSONException -> 0x030a }
            r35 = r8
            int r8 = r2.getInt(r9)     // Catch:{ JSONException -> 0x030a }
            r36 = r9
            int r9 = r2.getInt(r12)     // Catch:{ JSONException -> 0x030a }
            r37 = r12
            int r12 = r2.getInt(r13)     // Catch:{ JSONException -> 0x030a }
            r38 = r13
            int r13 = r2.getInt(r14)     // Catch:{ JSONException -> 0x030a }
            r39 = r14
            int r14 = r2.getInt(r15)     // Catch:{ JSONException -> 0x030a }
            r40 = r15
            int r15 = r2.getInt(r11)     // Catch:{ JSONException -> 0x030a }
            r41 = r11
            int r11 = r2.getInt(r0)     // Catch:{ JSONException -> 0x030a }
            r42 = r0
            r0 = r17
            r17 = r10
            int r10 = r2.getInt(r0)     // Catch:{ JSONException -> 0x030a }
            r43 = r0
            r0 = r18
            r18 = r10
            int r10 = r2.getInt(r0)     // Catch:{ JSONException -> 0x030a }
            r44 = r0
            r0 = r19
            r19 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x030a }
            r45 = r0
            r0 = r20
            r20 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x030a }
            r46 = r0
            r0 = r21
            r21 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x030a }
            r47 = r0
            r0 = r22
            r22 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x030a }
            r48 = r0
            r0 = r23
            r23 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x030a }
            r49 = r0
            r0 = r24
            java.lang.String r24 = r2.getString(r0)     // Catch:{ JSONException -> 0x030a }
            r50 = r0
            r0 = r25
            java.lang.String r25 = r2.getString(r0)     // Catch:{ JSONException -> 0x030a }
            r51 = r0
            r0 = r26
            r26 = r10
            java.lang.String r10 = r2.getString(r0)     // Catch:{ JSONException -> 0x030a }
            r52 = r0
            r0 = r27
            r27 = r10
            int r10 = r2.getInt(r0)     // Catch:{ JSONException -> 0x030a }
            r53 = r0
            java.lang.String r0 = r2.getString(r1)     // Catch:{ JSONException -> 0x030a }
            r54 = r1
            com.instabug.survey.models.Survey r1 = new com.instabug.survey.models.Survey     // Catch:{ JSONException -> 0x030a }
            r1.<init>()     // Catch:{ JSONException -> 0x030a }
            r56 = r10
            r55 = r11
            long r10 = r29.longValue()     // Catch:{ JSONException -> 0x030a }
            r1.setId(r10)     // Catch:{ JSONException -> 0x030a }
            r1.setType(r3)     // Catch:{ JSONException -> 0x030a }
            r3 = 1
            if (r4 != r3) goto L_0x01dd
            r3 = 1
            goto L_0x01de
        L_0x01dd:
            r3 = 0
        L_0x01de:
            r1.setGooglePlayAppRating(r3)     // Catch:{ JSONException -> 0x030a }
            r1.setTitle(r5)     // Catch:{ JSONException -> 0x030a }
            r1.setToken(r6)     // Catch:{ JSONException -> 0x030a }
            r1.setConditionsOperator(r7)     // Catch:{ JSONException -> 0x030a }
            r3 = 1
            if (r8 != r3) goto L_0x01ef
            r3 = 1
            goto L_0x01f0
        L_0x01ef:
            r3 = 0
        L_0x01f0:
            r1.setAnswered(r3)     // Catch:{ JSONException -> 0x030a }
            long r3 = (long) r9     // Catch:{ JSONException -> 0x030a }
            r1.setDismissedAt(r3)     // Catch:{ JSONException -> 0x030a }
            long r3 = (long) r12     // Catch:{ JSONException -> 0x030a }
            r1.setShowAt(r3)     // Catch:{ JSONException -> 0x030a }
            r3 = 1
            if (r13 != r3) goto L_0x0200
            r4 = r3
            goto L_0x0201
        L_0x0200:
            r4 = 0
        L_0x0201:
            r1.setCancelled(r4)     // Catch:{ JSONException -> 0x030a }
            r1.setAttemptCount(r14)     // Catch:{ JSONException -> 0x030a }
            r1.setEventIndex(r15)     // Catch:{ JSONException -> 0x030a }
            r4 = r55
            if (r4 != r3) goto L_0x0210
            r4 = r3
            goto L_0x0211
        L_0x0210:
            r4 = 0
        L_0x0211:
            r1.setShouldShowAgain(r4)     // Catch:{ JSONException -> 0x030a }
            r4 = r18
            if (r4 != r3) goto L_0x021a
            r3 = 1
            goto L_0x021b
        L_0x021a:
            r3 = 0
        L_0x021b:
            r1.setPaused(r3)     // Catch:{ JSONException -> 0x030a }
            r3 = r19
            r1.setSessionCount(r3)     // Catch:{ JSONException -> 0x030a }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030a }
            r4 = r20
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x030a }
            java.util.ArrayList r3 = com.instabug.survey.models.b.a(r3)     // Catch:{ JSONException -> 0x030a }
            r1.setQuestions(r3)     // Catch:{ JSONException -> 0x030a }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030a }
            r4 = r21
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x030a }
            java.util.ArrayList r3 = com.instabug.survey.models.c.a(r3)     // Catch:{ JSONException -> 0x030a }
            r1.setThankYouItems(r3)     // Catch:{ JSONException -> 0x030a }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030a }
            r4 = r22
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x030a }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x030a }
            r1.setTargetAudiences(r3)     // Catch:{ JSONException -> 0x030a }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030a }
            r4 = r23
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x030a }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x030a }
            r1.setCustomAttributes(r3)     // Catch:{ JSONException -> 0x030a }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030a }
            r4 = r26
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x030a }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x030a }
            r1.setUserEvents(r3)     // Catch:{ JSONException -> 0x030a }
            com.instabug.survey.f.c.f r3 = com.instabug.survey.f.c.f.valueOf(r24)     // Catch:{ JSONException -> 0x030a }
            r1.setSurveyState(r3)     // Catch:{ JSONException -> 0x030a }
            com.instabug.survey.f.c.g r3 = com.instabug.survey.f.c.g.b(r25)     // Catch:{ JSONException -> 0x030a }
            r1.setTarget(r3)     // Catch:{ JSONException -> 0x030a }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x030a }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030a }
            r5 = r27
            r4.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x030a }
            r3.a(r4)     // Catch:{ JSONException -> 0x030a }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x030a }
            r3.q = r0     // Catch:{ JSONException -> 0x030a }
            com.instabug.survey.f.c.b r0 = r1.getLocalization()     // Catch:{ JSONException -> 0x030a }
            r4 = r56
            r3 = 1
            if (r4 != r3) goto L_0x0296
            r4 = r3
            goto L_0x0297
        L_0x0296:
            r4 = 0
        L_0x0297:
            r0.c = r4     // Catch:{ JSONException -> 0x030a }
            r0 = r17
            r0.add(r1)     // Catch:{ JSONException -> 0x030a }
            boolean r1 = r2.moveToNext()     // Catch:{ JSONException -> 0x030a }
            if (r1 != 0) goto L_0x02d3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x030a }
            r1.<init>()     // Catch:{ JSONException -> 0x030a }
            int r3 = r0.size()     // Catch:{ JSONException -> 0x030a }
            r1.append(r3)     // Catch:{ JSONException -> 0x030a }
            java.lang.String r3 = " surveys are ready to be send, have been retrieved from "
            r1.append(r3)     // Catch:{ JSONException -> 0x030a }
            java.lang.String r3 = "surveys_table"
            r1.append(r3)     // Catch:{ JSONException -> 0x030a }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x030a }
            r4 = r16
            com.instabug.library.util.InstabugSDKLogger.d(r4, r1)     // Catch:{ JSONException -> 0x02d1 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x02cc
            r2.close()
        L_0x02cc:
            r28.close()
            goto L_0x033f
        L_0x02d1:
            r0 = move-exception
            goto L_0x0316
        L_0x02d3:
            r10 = r0
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r11 = r41
            r0 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r21 = r47
            r22 = r48
            r23 = r49
            r24 = r50
            r25 = r51
            r26 = r52
            r27 = r53
            r1 = r54
            goto L_0x0103
        L_0x0308:
            r0 = move-exception
            goto L_0x0340
        L_0x030a:
            r0 = move-exception
        L_0x030b:
            r4 = r16
            goto L_0x0316
        L_0x030e:
            r0 = move-exception
            r28 = r10
            goto L_0x0340
        L_0x0312:
            r0 = move-exception
            r28 = r10
            goto L_0x030b
        L_0x0316:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0308 }
            r1.<init>()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = "survey conversion failed due to "
            r1.append(r3)     // Catch:{ all -> 0x0308 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0308 }
            r1.append(r0)     // Catch:{ all -> 0x0308 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0308 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r0)     // Catch:{ all -> 0x0308 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0308 }
            r0.<init>()     // Catch:{ all -> 0x0308 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x033c
            r2.close()
        L_0x033c:
            r28.close()
        L_0x033f:
            return r0
        L_0x0340:
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x0349
            r2.close()
        L_0x0349:
            r28.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.cache.SurveysCacheManager.getReadyToSendSurveys():java.util.List");
    }

    public static Survey getSurveyById(long j) {
        return i0.j.f.e.a.e(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0336  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.instabug.survey.models.Survey> getSurveys() {
        /*
            java.lang.Class<i0.j.f.e.a> r1 = i0.j.f.e.a.class
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r10 = r0.openDatabase()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = "surveys_table"
            r2 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != 0) goto L_0x0020
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x032f
        L_0x0020:
            java.lang.String r0 = "survey_id"
            int r0 = r2.getColumnIndex(r0)
            java.lang.String r3 = "survey_type"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r4 = "in_app_rating"
            int r4 = r2.getColumnIndex(r4)
            java.lang.String r5 = "survey_title"
            int r5 = r2.getColumnIndex(r5)
            java.lang.String r6 = "survey_token"
            int r6 = r2.getColumnIndex(r6)
            java.lang.String r7 = "conditions_operator"
            int r7 = r2.getColumnIndex(r7)
            java.lang.String r8 = "answered"
            int r8 = r2.getColumnIndex(r8)
            java.lang.String r9 = "dismissed_at"
            int r9 = r2.getColumnIndex(r9)
            java.lang.String r11 = "shown_at"
            int r11 = r2.getColumnIndex(r11)
            java.lang.String r12 = "isCancelled"
            int r12 = r2.getColumnIndex(r12)
            java.lang.String r13 = "attemptCount"
            int r13 = r2.getColumnIndex(r13)
            java.lang.String r14 = "eventIndex"
            int r14 = r2.getColumnIndex(r14)
            java.lang.String r15 = "shouldShowAgain"
            int r15 = r2.getColumnIndex(r15)
            r16 = r1
            java.lang.String r1 = "paused"
            int r1 = r2.getColumnIndex(r1)
            r17 = r1
            java.lang.String r1 = "sessionCounter"
            int r1 = r2.getColumnIndex(r1)
            r18 = r1
            java.lang.String r1 = "questions"
            int r1 = r2.getColumnIndex(r1)
            r19 = r1
            java.lang.String r1 = "thanks_list"
            int r1 = r2.getColumnIndex(r1)
            r20 = r1
            java.lang.String r1 = "targetAudiences"
            int r1 = r2.getColumnIndex(r1)
            r21 = r1
            java.lang.String r1 = "customAttributes"
            int r1 = r2.getColumnIndex(r1)
            r22 = r1
            java.lang.String r1 = "userEvents"
            int r1 = r2.getColumnIndex(r1)
            r23 = r1
            java.lang.String r1 = "surveyState"
            int r1 = r2.getColumnIndex(r1)
            r24 = r1
            java.lang.String r1 = "surveyTargeting"
            int r1 = r2.getColumnIndex(r1)
            r25 = r1
            java.lang.String r1 = "supportedLocales"
            int r1 = r2.getColumnIndex(r1)
            r26 = r1
            java.lang.String r1 = "isLocalized"
            int r1 = r2.getColumnIndex(r1)
            r27 = r1
            java.lang.String r1 = "currentLocale"
            int r1 = r2.getColumnIndex(r1)
            boolean r28 = r2.moveToFirst()     // Catch:{ JSONException -> 0x0302, all -> 0x02fe }
            if (r28 != 0) goto L_0x00f0
            boolean r28 = r2.isClosed()     // Catch:{ JSONException -> 0x0302, all -> 0x02fe }
            if (r28 != 0) goto L_0x00f0
            r2.close()     // Catch:{ JSONException -> 0x0302, all -> 0x02fe }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0302, all -> 0x02fe }
            r0.<init>()     // Catch:{ JSONException -> 0x0302, all -> 0x02fe }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x00eb
            r2.close()
        L_0x00eb:
            r10.close()
            goto L_0x032f
        L_0x00f0:
            r28 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x02fa }
            r10.<init>()     // Catch:{ JSONException -> 0x02fa }
        L_0x00f7:
            long r29 = r2.getLong(r0)     // Catch:{ JSONException -> 0x02fa }
            java.lang.Long r29 = java.lang.Long.valueOf(r29)     // Catch:{ JSONException -> 0x02fa }
            r30 = r0
            int r0 = r2.getInt(r3)     // Catch:{ JSONException -> 0x02fa }
            r31 = r3
            int r3 = r2.getInt(r4)     // Catch:{ JSONException -> 0x02fa }
            r32 = r4
            java.lang.String r4 = r2.getString(r5)     // Catch:{ JSONException -> 0x02fa }
            r33 = r5
            java.lang.String r5 = r2.getString(r6)     // Catch:{ JSONException -> 0x02fa }
            r34 = r6
            java.lang.String r6 = r2.getString(r7)     // Catch:{ JSONException -> 0x02fa }
            r35 = r7
            int r7 = r2.getInt(r8)     // Catch:{ JSONException -> 0x02fa }
            r36 = r8
            int r8 = r2.getInt(r9)     // Catch:{ JSONException -> 0x02fa }
            r37 = r9
            int r9 = r2.getInt(r11)     // Catch:{ JSONException -> 0x02fa }
            r38 = r11
            int r11 = r2.getInt(r12)     // Catch:{ JSONException -> 0x02fa }
            r39 = r12
            int r12 = r2.getInt(r13)     // Catch:{ JSONException -> 0x02fa }
            r40 = r13
            int r13 = r2.getInt(r14)     // Catch:{ JSONException -> 0x02fa }
            r41 = r14
            int r14 = r2.getInt(r15)     // Catch:{ JSONException -> 0x02fa }
            r42 = r15
            r15 = r17
            r17 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x02fa }
            r43 = r15
            r15 = r18
            r18 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x02fa }
            r44 = r15
            r15 = r19
            r19 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x02fa }
            r45 = r15
            r15 = r20
            r20 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x02fa }
            r46 = r15
            r15 = r21
            r21 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x02fa }
            r47 = r15
            r15 = r22
            r22 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x02fa }
            r48 = r15
            r15 = r23
            r23 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x02fa }
            r49 = r15
            r15 = r24
            java.lang.String r24 = r2.getString(r15)     // Catch:{ JSONException -> 0x02fa }
            r50 = r15
            r15 = r25
            java.lang.String r25 = r2.getString(r15)     // Catch:{ JSONException -> 0x02fa }
            r51 = r15
            r15 = r26
            r26 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x02fa }
            r52 = r15
            r15 = r27
            r27 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x02fa }
            r53 = r15
            java.lang.String r15 = r2.getString(r1)     // Catch:{ JSONException -> 0x02fa }
            r54 = r1
            com.instabug.survey.models.Survey r1 = new com.instabug.survey.models.Survey     // Catch:{ JSONException -> 0x02fa }
            r1.<init>()     // Catch:{ JSONException -> 0x02fa }
            r55 = r14
            r56 = r15
            long r14 = r29.longValue()     // Catch:{ JSONException -> 0x02fa }
            r1.setId(r14)     // Catch:{ JSONException -> 0x02fa }
            r1.setType(r0)     // Catch:{ JSONException -> 0x02fa }
            r0 = 0
            r14 = 1
            if (r3 != r14) goto L_0x01d2
            r3 = r14
            goto L_0x01d3
        L_0x01d2:
            r3 = r0
        L_0x01d3:
            r1.setGooglePlayAppRating(r3)     // Catch:{ JSONException -> 0x02fa }
            r1.setTitle(r4)     // Catch:{ JSONException -> 0x02fa }
            r1.setToken(r5)     // Catch:{ JSONException -> 0x02fa }
            r1.setConditionsOperator(r6)     // Catch:{ JSONException -> 0x02fa }
            if (r7 != r14) goto L_0x01e3
            r3 = r14
            goto L_0x01e4
        L_0x01e3:
            r3 = r0
        L_0x01e4:
            r1.setAnswered(r3)     // Catch:{ JSONException -> 0x02fa }
            long r3 = (long) r8     // Catch:{ JSONException -> 0x02fa }
            r1.setDismissedAt(r3)     // Catch:{ JSONException -> 0x02fa }
            long r3 = (long) r9     // Catch:{ JSONException -> 0x02fa }
            r1.setShowAt(r3)     // Catch:{ JSONException -> 0x02fa }
            if (r11 != r14) goto L_0x01f3
            r3 = r14
            goto L_0x01f4
        L_0x01f3:
            r3 = r0
        L_0x01f4:
            r1.setCancelled(r3)     // Catch:{ JSONException -> 0x02fa }
            r1.setAttemptCount(r12)     // Catch:{ JSONException -> 0x02fa }
            r1.setEventIndex(r13)     // Catch:{ JSONException -> 0x02fa }
            r3 = r55
            if (r3 != r14) goto L_0x0203
            r3 = r14
            goto L_0x0204
        L_0x0203:
            r3 = r0
        L_0x0204:
            r1.setShouldShowAgain(r3)     // Catch:{ JSONException -> 0x02fa }
            r3 = r18
            if (r3 != r14) goto L_0x020d
            r3 = r14
            goto L_0x020e
        L_0x020d:
            r3 = r0
        L_0x020e:
            r1.setPaused(r3)     // Catch:{ JSONException -> 0x02fa }
            r3 = r19
            r1.setSessionCount(r3)     // Catch:{ JSONException -> 0x02fa }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02fa }
            r4 = r20
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x02fa }
            java.util.ArrayList r3 = com.instabug.survey.models.b.a(r3)     // Catch:{ JSONException -> 0x02fa }
            r1.setQuestions(r3)     // Catch:{ JSONException -> 0x02fa }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02fa }
            r4 = r21
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x02fa }
            java.util.ArrayList r3 = com.instabug.survey.models.c.a(r3)     // Catch:{ JSONException -> 0x02fa }
            r1.setThankYouItems(r3)     // Catch:{ JSONException -> 0x02fa }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02fa }
            r4 = r22
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x02fa }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x02fa }
            r1.setTargetAudiences(r3)     // Catch:{ JSONException -> 0x02fa }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02fa }
            r4 = r23
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x02fa }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x02fa }
            r1.setCustomAttributes(r3)     // Catch:{ JSONException -> 0x02fa }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02fa }
            r4 = r26
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x02fa }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x02fa }
            r1.setUserEvents(r3)     // Catch:{ JSONException -> 0x02fa }
            com.instabug.survey.f.c.f r3 = com.instabug.survey.f.c.f.valueOf(r24)     // Catch:{ JSONException -> 0x02fa }
            r1.setSurveyState(r3)     // Catch:{ JSONException -> 0x02fa }
            com.instabug.survey.f.c.g r3 = com.instabug.survey.f.c.g.b(r25)     // Catch:{ JSONException -> 0x02fa }
            r1.setTarget(r3)     // Catch:{ JSONException -> 0x02fa }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x02fa }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02fa }
            r5 = r27
            r4.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x02fa }
            r3.a(r4)     // Catch:{ JSONException -> 0x02fa }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x02fa }
            r4 = r56
            r3.q = r4     // Catch:{ JSONException -> 0x02fa }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x02fa }
            if (r10 != r14) goto L_0x0287
            r0 = r14
        L_0x0287:
            r3.c = r0     // Catch:{ JSONException -> 0x02fa }
            r0 = r17
            r0.add(r1)     // Catch:{ JSONException -> 0x02fa }
            boolean r1 = r2.moveToNext()     // Catch:{ JSONException -> 0x02fa }
            if (r1 != 0) goto L_0x02c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x02fa }
            r1.<init>()     // Catch:{ JSONException -> 0x02fa }
            int r3 = r0.size()     // Catch:{ JSONException -> 0x02fa }
            r1.append(r3)     // Catch:{ JSONException -> 0x02fa }
            java.lang.String r3 = " surveys have been retrieved from "
            r1.append(r3)     // Catch:{ JSONException -> 0x02fa }
            java.lang.String r3 = "surveys_table"
            r1.append(r3)     // Catch:{ JSONException -> 0x02fa }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x02fa }
            r3 = r16
            com.instabug.library.util.InstabugSDKLogger.d(r3, r1)     // Catch:{ JSONException -> 0x02c1 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x02bc
            r2.close()
        L_0x02bc:
            r28.close()
            goto L_0x032f
        L_0x02c1:
            r0 = move-exception
            goto L_0x0306
        L_0x02c3:
            r10 = r0
            r0 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r21 = r47
            r22 = r48
            r23 = r49
            r24 = r50
            r25 = r51
            r26 = r52
            r27 = r53
            r1 = r54
            goto L_0x00f7
        L_0x02f8:
            r0 = move-exception
            goto L_0x0330
        L_0x02fa:
            r0 = move-exception
        L_0x02fb:
            r3 = r16
            goto L_0x0306
        L_0x02fe:
            r0 = move-exception
            r28 = r10
            goto L_0x0330
        L_0x0302:
            r0 = move-exception
            r28 = r10
            goto L_0x02fb
        L_0x0306:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f8 }
            r1.<init>()     // Catch:{ all -> 0x02f8 }
            java.lang.String r4 = "survey conversion failed due to "
            r1.append(r4)     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02f8 }
            r1.append(r0)     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02f8 }
            com.instabug.library.util.InstabugSDKLogger.e(r3, r0)     // Catch:{ all -> 0x02f8 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02f8 }
            r0.<init>()     // Catch:{ all -> 0x02f8 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x032c
            r2.close()
        L_0x032c:
            r28.close()
        L_0x032f:
            return r0
        L_0x0330:
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x0339
            r2.close()
        L_0x0339:
            r28.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.cache.SurveysCacheManager.getSurveys():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x033c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.instabug.survey.models.Survey> getTimeTriggeredSurveys() {
        /*
            java.lang.Class<i0.j.f.e.a> r1 = i0.j.f.e.a.class
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r10 = r0.openDatabase()
            java.lang.String r0 = ""
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = "surveys_table"
            java.lang.String r5 = "surveyTriggerEvent=?"
            r2 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != 0) goto L_0x0026
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x0335
        L_0x0026:
            java.lang.String r0 = "survey_id"
            int r0 = r2.getColumnIndex(r0)
            java.lang.String r3 = "survey_type"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r4 = "in_app_rating"
            int r4 = r2.getColumnIndex(r4)
            java.lang.String r5 = "survey_title"
            int r5 = r2.getColumnIndex(r5)
            java.lang.String r6 = "survey_token"
            int r6 = r2.getColumnIndex(r6)
            java.lang.String r7 = "conditions_operator"
            int r7 = r2.getColumnIndex(r7)
            java.lang.String r8 = "answered"
            int r8 = r2.getColumnIndex(r8)
            java.lang.String r9 = "dismissed_at"
            int r9 = r2.getColumnIndex(r9)
            java.lang.String r11 = "shown_at"
            int r11 = r2.getColumnIndex(r11)
            java.lang.String r12 = "isCancelled"
            int r12 = r2.getColumnIndex(r12)
            java.lang.String r13 = "attemptCount"
            int r13 = r2.getColumnIndex(r13)
            java.lang.String r14 = "eventIndex"
            int r14 = r2.getColumnIndex(r14)
            java.lang.String r15 = "shouldShowAgain"
            int r15 = r2.getColumnIndex(r15)
            r16 = r1
            java.lang.String r1 = "paused"
            int r1 = r2.getColumnIndex(r1)
            r17 = r1
            java.lang.String r1 = "sessionCounter"
            int r1 = r2.getColumnIndex(r1)
            r18 = r1
            java.lang.String r1 = "questions"
            int r1 = r2.getColumnIndex(r1)
            r19 = r1
            java.lang.String r1 = "thanks_list"
            int r1 = r2.getColumnIndex(r1)
            r20 = r1
            java.lang.String r1 = "targetAudiences"
            int r1 = r2.getColumnIndex(r1)
            r21 = r1
            java.lang.String r1 = "customAttributes"
            int r1 = r2.getColumnIndex(r1)
            r22 = r1
            java.lang.String r1 = "userEvents"
            int r1 = r2.getColumnIndex(r1)
            r23 = r1
            java.lang.String r1 = "surveyState"
            int r1 = r2.getColumnIndex(r1)
            r24 = r1
            java.lang.String r1 = "surveyTargeting"
            int r1 = r2.getColumnIndex(r1)
            r25 = r1
            java.lang.String r1 = "supportedLocales"
            int r1 = r2.getColumnIndex(r1)
            r26 = r1
            java.lang.String r1 = "isLocalized"
            int r1 = r2.getColumnIndex(r1)
            r27 = r1
            java.lang.String r1 = "currentLocale"
            int r1 = r2.getColumnIndex(r1)
            boolean r28 = r2.moveToFirst()     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            if (r28 != 0) goto L_0x00f6
            boolean r28 = r2.isClosed()     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            if (r28 != 0) goto L_0x00f6
            r2.close()     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            r0.<init>()     // Catch:{ JSONException -> 0x0308, all -> 0x0304 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x00f1
            r2.close()
        L_0x00f1:
            r10.close()
            goto L_0x0335
        L_0x00f6:
            r28 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0300 }
            r10.<init>()     // Catch:{ JSONException -> 0x0300 }
        L_0x00fd:
            long r29 = r2.getLong(r0)     // Catch:{ JSONException -> 0x0300 }
            java.lang.Long r29 = java.lang.Long.valueOf(r29)     // Catch:{ JSONException -> 0x0300 }
            r30 = r0
            int r0 = r2.getInt(r3)     // Catch:{ JSONException -> 0x0300 }
            r31 = r3
            int r3 = r2.getInt(r4)     // Catch:{ JSONException -> 0x0300 }
            r32 = r4
            java.lang.String r4 = r2.getString(r5)     // Catch:{ JSONException -> 0x0300 }
            r33 = r5
            java.lang.String r5 = r2.getString(r6)     // Catch:{ JSONException -> 0x0300 }
            r34 = r6
            java.lang.String r6 = r2.getString(r7)     // Catch:{ JSONException -> 0x0300 }
            r35 = r7
            int r7 = r2.getInt(r8)     // Catch:{ JSONException -> 0x0300 }
            r36 = r8
            int r8 = r2.getInt(r9)     // Catch:{ JSONException -> 0x0300 }
            r37 = r9
            int r9 = r2.getInt(r11)     // Catch:{ JSONException -> 0x0300 }
            r38 = r11
            int r11 = r2.getInt(r12)     // Catch:{ JSONException -> 0x0300 }
            r39 = r12
            int r12 = r2.getInt(r13)     // Catch:{ JSONException -> 0x0300 }
            r40 = r13
            int r13 = r2.getInt(r14)     // Catch:{ JSONException -> 0x0300 }
            r41 = r14
            int r14 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0300 }
            r42 = r15
            r15 = r17
            r17 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0300 }
            r43 = r15
            r15 = r18
            r18 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0300 }
            r44 = r15
            r15 = r19
            r19 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r45 = r15
            r15 = r20
            r20 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r46 = r15
            r15 = r21
            r21 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r47 = r15
            r15 = r22
            r22 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r48 = r15
            r15 = r23
            r23 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r49 = r15
            r15 = r24
            java.lang.String r24 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r50 = r15
            r15 = r25
            java.lang.String r25 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r51 = r15
            r15 = r26
            r26 = r10
            java.lang.String r10 = r2.getString(r15)     // Catch:{ JSONException -> 0x0300 }
            r52 = r15
            r15 = r27
            r27 = r10
            int r10 = r2.getInt(r15)     // Catch:{ JSONException -> 0x0300 }
            r53 = r15
            java.lang.String r15 = r2.getString(r1)     // Catch:{ JSONException -> 0x0300 }
            r54 = r1
            com.instabug.survey.models.Survey r1 = new com.instabug.survey.models.Survey     // Catch:{ JSONException -> 0x0300 }
            r1.<init>()     // Catch:{ JSONException -> 0x0300 }
            r55 = r14
            r56 = r15
            long r14 = r29.longValue()     // Catch:{ JSONException -> 0x0300 }
            r1.setId(r14)     // Catch:{ JSONException -> 0x0300 }
            r1.setType(r0)     // Catch:{ JSONException -> 0x0300 }
            r0 = 0
            r14 = 1
            if (r3 != r14) goto L_0x01d8
            r3 = r14
            goto L_0x01d9
        L_0x01d8:
            r3 = r0
        L_0x01d9:
            r1.setGooglePlayAppRating(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setTitle(r4)     // Catch:{ JSONException -> 0x0300 }
            r1.setToken(r5)     // Catch:{ JSONException -> 0x0300 }
            r1.setConditionsOperator(r6)     // Catch:{ JSONException -> 0x0300 }
            if (r7 != r14) goto L_0x01e9
            r3 = r14
            goto L_0x01ea
        L_0x01e9:
            r3 = r0
        L_0x01ea:
            r1.setAnswered(r3)     // Catch:{ JSONException -> 0x0300 }
            long r3 = (long) r8     // Catch:{ JSONException -> 0x0300 }
            r1.setDismissedAt(r3)     // Catch:{ JSONException -> 0x0300 }
            long r3 = (long) r9     // Catch:{ JSONException -> 0x0300 }
            r1.setShowAt(r3)     // Catch:{ JSONException -> 0x0300 }
            if (r11 != r14) goto L_0x01f9
            r3 = r14
            goto L_0x01fa
        L_0x01f9:
            r3 = r0
        L_0x01fa:
            r1.setCancelled(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setAttemptCount(r12)     // Catch:{ JSONException -> 0x0300 }
            r1.setEventIndex(r13)     // Catch:{ JSONException -> 0x0300 }
            r3 = r55
            if (r3 != r14) goto L_0x0209
            r3 = r14
            goto L_0x020a
        L_0x0209:
            r3 = r0
        L_0x020a:
            r1.setShouldShowAgain(r3)     // Catch:{ JSONException -> 0x0300 }
            r3 = r18
            if (r3 != r14) goto L_0x0213
            r3 = r14
            goto L_0x0214
        L_0x0213:
            r3 = r0
        L_0x0214:
            r1.setPaused(r3)     // Catch:{ JSONException -> 0x0300 }
            r3 = r19
            r1.setSessionCount(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r20
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.models.b.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setQuestions(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r21
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.models.c.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setThankYouItems(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r22
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setTargetAudiences(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r23
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setCustomAttributes(r3)     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r4 = r26
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0300 }
            java.util.ArrayList r3 = com.instabug.survey.f.c.c.a(r3)     // Catch:{ JSONException -> 0x0300 }
            r1.setUserEvents(r3)     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.f r3 = com.instabug.survey.f.c.f.valueOf(r24)     // Catch:{ JSONException -> 0x0300 }
            r1.setSurveyState(r3)     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.g r3 = com.instabug.survey.f.c.g.b(r25)     // Catch:{ JSONException -> 0x0300 }
            r1.setTarget(r3)     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x0300 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0300 }
            r5 = r27
            r4.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x0300 }
            r3.a(r4)     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x0300 }
            r4 = r56
            r3.q = r4     // Catch:{ JSONException -> 0x0300 }
            com.instabug.survey.f.c.b r3 = r1.getLocalization()     // Catch:{ JSONException -> 0x0300 }
            if (r10 != r14) goto L_0x028d
            r0 = r14
        L_0x028d:
            r3.c = r0     // Catch:{ JSONException -> 0x0300 }
            r0 = r17
            r0.add(r1)     // Catch:{ JSONException -> 0x0300 }
            boolean r1 = r2.moveToNext()     // Catch:{ JSONException -> 0x0300 }
            if (r1 != 0) goto L_0x02c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0300 }
            r1.<init>()     // Catch:{ JSONException -> 0x0300 }
            int r3 = r0.size()     // Catch:{ JSONException -> 0x0300 }
            r1.append(r3)     // Catch:{ JSONException -> 0x0300 }
            java.lang.String r3 = " surveys are not answered, have been retrieved from "
            r1.append(r3)     // Catch:{ JSONException -> 0x0300 }
            java.lang.String r3 = "surveys_table"
            r1.append(r3)     // Catch:{ JSONException -> 0x0300 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0300 }
            r3 = r16
            com.instabug.library.util.InstabugSDKLogger.d(r3, r1)     // Catch:{ JSONException -> 0x02c7 }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x02c2
            r2.close()
        L_0x02c2:
            r28.close()
            goto L_0x0335
        L_0x02c7:
            r0 = move-exception
            goto L_0x030c
        L_0x02c9:
            r10 = r0
            r0 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r21 = r47
            r22 = r48
            r23 = r49
            r24 = r50
            r25 = r51
            r26 = r52
            r27 = r53
            r1 = r54
            goto L_0x00fd
        L_0x02fe:
            r0 = move-exception
            goto L_0x0336
        L_0x0300:
            r0 = move-exception
        L_0x0301:
            r3 = r16
            goto L_0x030c
        L_0x0304:
            r0 = move-exception
            r28 = r10
            goto L_0x0336
        L_0x0308:
            r0 = move-exception
            r28 = r10
            goto L_0x0301
        L_0x030c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fe }
            r1.<init>()     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = "survey conversion failed due to "
            r1.append(r4)     // Catch:{ all -> 0x02fe }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02fe }
            r1.append(r0)     // Catch:{ all -> 0x02fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02fe }
            com.instabug.library.util.InstabugSDKLogger.e(r3, r0)     // Catch:{ all -> 0x02fe }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02fe }
            r0.<init>()     // Catch:{ all -> 0x02fe }
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x0332
            r2.close()
        L_0x0332:
            r28.close()
        L_0x0335:
            return r0
        L_0x0336:
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L_0x033f
            r2.close()
        L_0x033f:
            r28.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.cache.SurveysCacheManager.getTimeTriggeredSurveys():java.util.List");
    }

    public static void insertOrUpdatePausedOrLocale(Survey survey, boolean z, boolean z2) {
        PoolProvider.postIOTask(new b(survey, z, z2));
    }

    public static boolean isSurveyExisting(long j) {
        return i0.j.f.e.a.e(j) != null;
    }

    public static void resetSurveyUserInteraction(List<Survey> list) {
        for (Survey next : list) {
            next.resetUserInteractions();
            next.resetUserAnswers();
        }
        updateBulk(list);
    }

    public static void update(Survey survey) {
        PoolProvider.postIOTask(new a(survey));
    }

    public static void updateBulk(List<Survey> list) {
        synchronized (i0.j.f.e.a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                for (Survey c2 : list) {
                    i0.j.f.e.a.c(openDatabase, c2);
                }
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static void updateSessions(Survey survey) {
        Class<i0.j.f.e.a> cls = i0.j.f.e.a.class;
        synchronized (cls) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {String.valueOf(survey.getId())};
            try {
                openDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("sessionCounter", Integer.valueOf(survey.getSessionCounter()));
                openDatabase.update(InstabugDbContract.SurveyEntry.TABLE_NAME, contentValues, "survey_id=? ", strArr);
                openDatabase.setTransactionSuccessful();
                InstabugSDKLogger.d(cls, "survey id: " + survey.getId() + " sessions count has been updated to " + survey.getSessionCounter() + " in  " + InstabugDbContract.SurveyEntry.TABLE_NAME);
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }
}
