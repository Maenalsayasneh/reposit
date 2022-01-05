package i0.j.f.e;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.models.Survey;
import com.instabug.survey.models.b;
import com.instabug.survey.models.c;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: SurveysDbHelper */
public class a {
    public static synchronized long a(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, long j, ContentValues contentValues) {
        long update;
        Class<a> cls = a.class;
        synchronized (cls) {
            update = (long) sQLiteDatabaseWrapper.update(InstabugDbContract.SurveyEntry.TABLE_NAME, contentValues, "survey_id=? ", new String[]{String.valueOf(j)});
            InstabugSDKLogger.d(cls, "survey id: " + j + " paused state has been updated in " + InstabugDbContract.SurveyEntry.TABLE_NAME);
        }
        return update;
    }

    public static void b(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, Survey survey) throws JSONException {
        ContentValues contentValues = new ContentValues();
        contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_QUESTIONS, b.c(survey.getQuestions()).toString());
        contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_THANKS_LIST, c.b(survey.getThankYouItems()).toString());
        if (!(survey.getLocalization() == null || survey.getLocalization().q == null)) {
            contentValues.put("currentLocale", survey.getLocalization().q);
        }
        a(sQLiteDatabaseWrapper, survey.getId(), contentValues);
    }

    public static long c(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, Survey survey) {
        Class<a> cls = a.class;
        String[] strArr = {String.valueOf(survey.getId())};
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("survey_id", Long.valueOf(survey.getId()));
            contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_TITLE, survey.getTitle());
            contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_TYPE, Integer.valueOf(survey.getType()));
            contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_GOOGLE_PLAY_RATING, Boolean.valueOf(survey.isGooglePlayAppRating()));
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
            contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_QUESTIONS, b.c(survey.getQuestions()).toString());
            contentValues.put(InstabugDbContract.SurveyEntry.COLUMN_THANKS_LIST, c.b(survey.getThankYouItems()).toString());
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
            long update = (long) sQLiteDatabaseWrapper.update(InstabugDbContract.SurveyEntry.TABLE_NAME, contentValues, "survey_id=? ", strArr);
            if (update > 0) {
                InstabugSDKLogger.d(cls, "survey id: " + survey.getId() + " has been updated in " + InstabugDbContract.SurveyEntry.TABLE_NAME);
            }
            return update;
        } catch (JSONException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("survey updating failed due to ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(cls, P0.toString());
            return -1;
        }
    }

    public static synchronized long d(Survey survey) {
        long c;
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                c = c(openDatabase, survey);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instabug.survey.models.Survey e(long r30) {
        /*
            java.lang.Class<i0.j.f.e.a> r1 = i0.j.f.e.a.class
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r10 = r0.openDatabase()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r2 = java.lang.String.valueOf(r30)
            r11 = 0
            r6[r11] = r2
            java.lang.String r3 = "surveys_table"
            r4 = 0
            java.lang.String r5 = "survey_id=? "
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)
            r3 = 0
            if (r2 != 0) goto L_0x0025
            return r3
        L_0x0025:
            java.lang.String r4 = "survey_id"
            int r4 = r2.getColumnIndex(r4)
            java.lang.String r5 = "survey_type"
            int r5 = r2.getColumnIndex(r5)
            java.lang.String r6 = "in_app_rating"
            int r6 = r2.getColumnIndex(r6)
            java.lang.String r7 = "survey_title"
            int r7 = r2.getColumnIndex(r7)
            java.lang.String r8 = "survey_token"
            int r8 = r2.getColumnIndex(r8)
            java.lang.String r9 = "conditions_operator"
            int r9 = r2.getColumnIndex(r9)
            java.lang.String r12 = "answered"
            int r12 = r2.getColumnIndex(r12)
            java.lang.String r13 = "dismissed_at"
            int r13 = r2.getColumnIndex(r13)
            java.lang.String r14 = "shown_at"
            int r14 = r2.getColumnIndex(r14)
            java.lang.String r15 = "isCancelled"
            int r15 = r2.getColumnIndex(r15)
            java.lang.String r11 = "attemptCount"
            int r11 = r2.getColumnIndex(r11)
            java.lang.String r0 = "eventIndex"
            int r0 = r2.getColumnIndex(r0)
            java.lang.String r3 = "shouldShowAgain"
            int r3 = r2.getColumnIndex(r3)
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
            boolean r28 = r2.moveToFirst()     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            if (r28 != 0) goto L_0x00f0
            boolean r28 = r2.isClosed()     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            if (r28 != 0) goto L_0x00f0
            r2.close()     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x00eb
            r2.close()
        L_0x00eb:
            r10.close()
        L_0x00ee:
            r1 = 0
            return r1
        L_0x00f0:
            long r28 = r2.getLong(r4)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            java.lang.Long r4 = java.lang.Long.valueOf(r28)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r5 = r2.getInt(r5)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r6 = r2.getInt(r6)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            java.lang.String r9 = r2.getString(r9)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r12 = r2.getInt(r12)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r13 = r2.getInt(r13)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r14 = r2.getInt(r14)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r15 = r2.getInt(r15)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r11 = r2.getInt(r11)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r0 = r2.getInt(r0)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            int r3 = r2.getInt(r3)     // Catch:{ JSONException -> 0x029b, all -> 0x0295 }
            r28 = r10
            r10 = r17
            int r10 = r2.getInt(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r17 = r10
            r10 = r18
            int r10 = r2.getInt(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r18 = r10
            r10 = r19
            java.lang.String r10 = r2.getString(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r19 = r10
            r10 = r20
            java.lang.String r10 = r2.getString(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r20 = r10
            r10 = r21
            java.lang.String r10 = r2.getString(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r21 = r10
            r10 = r22
            java.lang.String r10 = r2.getString(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r22 = r10
            r10 = r23
            java.lang.String r10 = r2.getString(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r23 = r10
            r10 = r24
            java.lang.String r10 = r2.getString(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r24 = r10
            r10 = r25
            java.lang.String r10 = r2.getString(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r25 = r10
            r10 = r26
            java.lang.String r10 = r2.getString(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r26 = r10
            r10 = r27
            int r10 = r2.getInt(r10)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ JSONException -> 0x0291, all -> 0x028d }
            r27 = r2
            com.instabug.survey.models.Survey r2 = new com.instabug.survey.models.Survey     // Catch:{ JSONException -> 0x0289 }
            r2.<init>()     // Catch:{ JSONException -> 0x0289 }
            r29 = r3
            long r3 = r4.longValue()     // Catch:{ JSONException -> 0x0289 }
            r2.setId(r3)     // Catch:{ JSONException -> 0x0289 }
            r2.setType(r5)     // Catch:{ JSONException -> 0x0289 }
            r3 = 1
            if (r6 != r3) goto L_0x019c
            r4 = r3
            goto L_0x019d
        L_0x019c:
            r4 = 0
        L_0x019d:
            r2.setGooglePlayAppRating(r4)     // Catch:{ JSONException -> 0x0289 }
            r2.setTitle(r7)     // Catch:{ JSONException -> 0x0289 }
            r2.setToken(r8)     // Catch:{ JSONException -> 0x0289 }
            r2.setConditionsOperator(r9)     // Catch:{ JSONException -> 0x0289 }
            if (r12 != r3) goto L_0x01ad
            r3 = 1
            goto L_0x01ae
        L_0x01ad:
            r3 = 0
        L_0x01ae:
            r2.setAnswered(r3)     // Catch:{ JSONException -> 0x0289 }
            long r3 = (long) r13     // Catch:{ JSONException -> 0x0289 }
            r2.setDismissedAt(r3)     // Catch:{ JSONException -> 0x0289 }
            long r3 = (long) r14     // Catch:{ JSONException -> 0x0289 }
            r2.setShowAt(r3)     // Catch:{ JSONException -> 0x0289 }
            r3 = 1
            if (r15 != r3) goto L_0x01be
            r4 = r3
            goto L_0x01bf
        L_0x01be:
            r4 = 0
        L_0x01bf:
            r2.setCancelled(r4)     // Catch:{ JSONException -> 0x0289 }
            r2.setAttemptCount(r11)     // Catch:{ JSONException -> 0x0289 }
            r2.setEventIndex(r0)     // Catch:{ JSONException -> 0x0289 }
            r0 = r29
            if (r0 != r3) goto L_0x01ce
            r0 = r3
            goto L_0x01cf
        L_0x01ce:
            r0 = 0
        L_0x01cf:
            r2.setShouldShowAgain(r0)     // Catch:{ JSONException -> 0x0289 }
            r0 = r17
            if (r0 != r3) goto L_0x01d8
            r3 = 1
            goto L_0x01d9
        L_0x01d8:
            r3 = 0
        L_0x01d9:
            r2.setPaused(r3)     // Catch:{ JSONException -> 0x0289 }
            r0 = r18
            r2.setSessionCount(r0)     // Catch:{ JSONException -> 0x0289 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0289 }
            r3 = r19
            r0.<init>((java.lang.String) r3)     // Catch:{ JSONException -> 0x0289 }
            java.util.ArrayList r0 = com.instabug.survey.models.b.a(r0)     // Catch:{ JSONException -> 0x0289 }
            r2.setQuestions(r0)     // Catch:{ JSONException -> 0x0289 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0289 }
            r3 = r20
            r0.<init>((java.lang.String) r3)     // Catch:{ JSONException -> 0x0289 }
            java.util.ArrayList r0 = com.instabug.survey.models.c.a(r0)     // Catch:{ JSONException -> 0x0289 }
            r2.setThankYouItems(r0)     // Catch:{ JSONException -> 0x0289 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0289 }
            r3 = r21
            r0.<init>((java.lang.String) r3)     // Catch:{ JSONException -> 0x0289 }
            java.util.ArrayList r0 = com.instabug.survey.f.c.c.a(r0)     // Catch:{ JSONException -> 0x0289 }
            r2.setTargetAudiences(r0)     // Catch:{ JSONException -> 0x0289 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0289 }
            r3 = r22
            r0.<init>((java.lang.String) r3)     // Catch:{ JSONException -> 0x0289 }
            java.util.ArrayList r0 = com.instabug.survey.f.c.c.a(r0)     // Catch:{ JSONException -> 0x0289 }
            r2.setCustomAttributes(r0)     // Catch:{ JSONException -> 0x0289 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0289 }
            r3 = r23
            r0.<init>((java.lang.String) r3)     // Catch:{ JSONException -> 0x0289 }
            java.util.ArrayList r0 = com.instabug.survey.f.c.c.a(r0)     // Catch:{ JSONException -> 0x0289 }
            r2.setUserEvents(r0)     // Catch:{ JSONException -> 0x0289 }
            com.instabug.survey.f.c.f r0 = com.instabug.survey.f.c.f.valueOf(r24)     // Catch:{ JSONException -> 0x0289 }
            r2.setSurveyState(r0)     // Catch:{ JSONException -> 0x0289 }
            com.instabug.survey.f.c.g r0 = com.instabug.survey.f.c.g.b(r25)     // Catch:{ JSONException -> 0x0289 }
            r2.setTarget(r0)     // Catch:{ JSONException -> 0x0289 }
            com.instabug.survey.f.c.b r0 = r2.getLocalization()     // Catch:{ JSONException -> 0x0289 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0289 }
            r4 = r26
            r3.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0289 }
            r0.a(r3)     // Catch:{ JSONException -> 0x0289 }
            com.instabug.survey.f.c.b r0 = r2.getLocalization()     // Catch:{ JSONException -> 0x0289 }
            r0.q = r1     // Catch:{ JSONException -> 0x0289 }
            com.instabug.survey.f.c.b r0 = r2.getLocalization()     // Catch:{ JSONException -> 0x0289 }
            r1 = 1
            if (r10 != r1) goto L_0x0251
            goto L_0x0252
        L_0x0251:
            r1 = 0
        L_0x0252:
            r0.c = r1     // Catch:{ JSONException -> 0x0289 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0289 }
            r0.<init>()     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r1 = "survey id: "
            r0.append(r1)     // Catch:{ JSONException -> 0x0289 }
            long r3 = r2.getId()     // Catch:{ JSONException -> 0x0289 }
            r0.append(r3)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r1 = " has been retrieved from "
            r0.append(r1)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r1 = "surveys_table"
            r0.append(r1)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0289 }
            r1 = r16
            com.instabug.library.util.InstabugSDKLogger.d(r1, r0)     // Catch:{ JSONException -> 0x0285 }
            boolean r0 = r27.isClosed()
            if (r0 != 0) goto L_0x0281
            r27.close()
        L_0x0281:
            r28.close()
            return r2
        L_0x0285:
            r0 = move-exception
            goto L_0x02a1
        L_0x0287:
            r0 = move-exception
            goto L_0x02c7
        L_0x0289:
            r0 = move-exception
        L_0x028a:
            r1 = r16
            goto L_0x02a1
        L_0x028d:
            r0 = move-exception
            r27 = r2
            goto L_0x02c7
        L_0x0291:
            r0 = move-exception
            r27 = r2
            goto L_0x028a
        L_0x0295:
            r0 = move-exception
            r27 = r2
            r28 = r10
            goto L_0x02c7
        L_0x029b:
            r0 = move-exception
            r27 = r2
            r28 = r10
            goto L_0x028a
        L_0x02a1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0287 }
            r2.<init>()     // Catch:{ all -> 0x0287 }
            java.lang.String r3 = "survey conversion failed due to "
            r2.append(r3)     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0287 }
            r2.append(r0)     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0287 }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r0)     // Catch:{ all -> 0x0287 }
            boolean r0 = r27.isClosed()
            if (r0 != 0) goto L_0x02c2
            r27.close()
        L_0x02c2:
            r28.close()
            goto L_0x00ee
        L_0x02c7:
            boolean r1 = r27.isClosed()
            if (r1 != 0) goto L_0x02d0
            r27.close()
        L_0x02d0:
            r28.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.e.a.e(long):com.instabug.survey.models.Survey");
    }

    public static void f(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, Survey survey) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("paused", Boolean.valueOf(survey.isPaused()));
        a(sQLiteDatabaseWrapper, survey.getId(), contentValues);
    }
}
