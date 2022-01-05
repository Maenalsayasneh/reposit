package i0.j.f;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.eventbus.UserEventsEventBus;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.user.UserEvent;
import com.instabug.library.user.UserManagerWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.TaskDebouncer;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.common.userInteractions.UserInteractionCacheManager;
import com.instabug.survey.f.c.i;
import com.instabug.survey.models.Survey;
import i0.j.f.n.a;
import i0.j.f.n.b;
import i0.j.f.o.c;
import i0.j.f.p.j;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.b.y.d;
import org.json.JSONException;

/* compiled from: SurveysManager */
public class h implements b.c, j.b, a.b {
    public static h a;
    public WeakReference<Context> b;
    public b c = new b(this);
    public j d;
    public k0.b.w.a e;
    public i0.j.f.n.a f;
    public final TaskDebouncer g;

    /* compiled from: SurveysManager */
    public class a implements d<UserEvent> {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:113:0x04d1  */
        /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x042d  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x044f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(java.lang.Object r59) throws java.lang.Exception {
            /*
                r58 = this;
                r1 = r58
                r0 = r59
                com.instabug.library.user.UserEvent r0 = (com.instabug.library.user.UserEvent) r0
                boolean r2 = r0 instanceof i0.j.f.d
                r3 = 0
                if (r2 == 0) goto L_0x0098
                java.lang.String r0 = "Surveys auto showing is triggered"
                com.instabug.library.util.InstabugSDKLogger.d(r1, r0)
                i0.j.f.h r0 = i0.j.f.h.this
                i0.j.f.p.j r0 = r0.d
                java.util.Objects.requireNonNull(r0)
                java.lang.String r2 = "showSurveysByTimeTriggerIfAvailable()"
                java.lang.String r4 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r4, r2)
                java.util.List r2 = com.instabug.survey.cache.SurveysCacheManager.getTimeTriggeredSurveys()
                java.lang.String r4 = "timeTriggeredSurveys: "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                int r5 = r2.size()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r5, r4)
                java.util.List r2 = r0.a(r2)
                java.lang.String r4 = "validSurveys: "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r5 = r2.size()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r5, r4)
                int r4 = r2.size()
                if (r4 <= 0) goto L_0x0061
                java.lang.Object r2 = r2.get(r3)
                com.instabug.survey.models.Survey r2 = (com.instabug.survey.models.Survey) r2
                goto L_0x0062
            L_0x0061:
                r2 = 0
            L_0x0062:
                if (r2 != 0) goto L_0x006d
                java.lang.String r0 = "no valid time-triggered surveys. Returning null..."
                java.lang.String r2 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r2, r0)
                goto L_0x04d8
            L_0x006d:
                java.lang.String r3 = "Survey with id:{ "
                java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
                long r4 = r2.getId()
                r3.append(r4)
                java.lang.String r4 = "}  is first valid survey for time-triggered surveys"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r4, r3)
                i0.j.f.p.j$b r0 = r0.a
                r3 = r0
                i0.j.f.h r3 = (i0.j.f.h) r3
                monitor-enter(r3)
                r3.e(r2)     // Catch:{ all -> 0x0094 }
                monitor-exit(r3)
                goto L_0x04d8
            L_0x0094:
                r0 = move-exception
                r2 = r0
                monitor-exit(r3)
                throw r2
            L_0x0098:
                int r2 = i0.j.f.o.c.b
                i0.j.f.o.a r2 = i0.j.f.o.a.a()
                boolean r2 = r2.b
                if (r2 == 0) goto L_0x04d8
                java.lang.String r2 = r0.getEventIdentifier()
                if (r2 == 0) goto L_0x04d8
                java.lang.String r2 = "Survey with event: {"
                java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
                java.lang.String r4 = r0.getEventIdentifier()
                r2.append(r4)
                java.lang.String r4 = "} is triggered"
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.instabug.library.util.InstabugSDKLogger.d(r1, r2)
                i0.j.f.h r2 = i0.j.f.h.this
                i0.j.f.p.j r2 = r2.d
                java.lang.String r4 = r0.getEventIdentifier()
                java.util.Objects.requireNonNull(r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "showSurveysByEventTriggerIfAvailable(triggerEvent: "
                r0.append(r5)
                r0.append(r4)
                java.lang.String r5 = ")"
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r5 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r5, r0)
                java.lang.Class<i0.j.f.e.a> r5 = i0.j.f.e.a.class
                com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r14 = r0.openDatabase()
                r0 = 1
                java.lang.String[] r10 = new java.lang.String[r0]
                r10[r3] = r4
                java.lang.String r7 = "surveys_table"
                r8 = 0
                java.lang.String r9 = "surveyTriggerEvent=?"
                r11 = 0
                r12 = 0
                r13 = 0
                r6 = r14
                android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11, r12, r13)
                if (r3 != 0) goto L_0x0110
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r16 = r2
                r59 = r4
                goto L_0x0433
            L_0x0110:
                java.lang.String r0 = "survey_id"
                int r0 = r3.getColumnIndex(r0)
                java.lang.String r6 = "survey_type"
                int r6 = r3.getColumnIndex(r6)
                java.lang.String r7 = "in_app_rating"
                int r7 = r3.getColumnIndex(r7)
                java.lang.String r8 = "survey_title"
                int r8 = r3.getColumnIndex(r8)
                java.lang.String r9 = "survey_token"
                int r9 = r3.getColumnIndex(r9)
                java.lang.String r10 = "conditions_operator"
                int r10 = r3.getColumnIndex(r10)
                java.lang.String r11 = "answered"
                int r11 = r3.getColumnIndex(r11)
                java.lang.String r12 = "dismissed_at"
                int r12 = r3.getColumnIndex(r12)
                java.lang.String r13 = "shown_at"
                int r13 = r3.getColumnIndex(r13)
                java.lang.String r15 = "isCancelled"
                int r15 = r3.getColumnIndex(r15)
                java.lang.String r1 = "attemptCount"
                int r1 = r3.getColumnIndex(r1)
                r59 = r4
                java.lang.String r4 = "eventIndex"
                int r4 = r3.getColumnIndex(r4)
                r16 = r2
                java.lang.String r2 = "shouldShowAgain"
                int r2 = r3.getColumnIndex(r2)
                r17 = r5
                java.lang.String r5 = "paused"
                int r5 = r3.getColumnIndex(r5)
                r18 = r5
                java.lang.String r5 = "sessionCounter"
                int r5 = r3.getColumnIndex(r5)
                r19 = r5
                java.lang.String r5 = "questions"
                int r5 = r3.getColumnIndex(r5)
                r20 = r5
                java.lang.String r5 = "thanks_list"
                int r5 = r3.getColumnIndex(r5)
                r21 = r5
                java.lang.String r5 = "targetAudiences"
                int r5 = r3.getColumnIndex(r5)
                r22 = r5
                java.lang.String r5 = "customAttributes"
                int r5 = r3.getColumnIndex(r5)
                r23 = r5
                java.lang.String r5 = "userEvents"
                int r5 = r3.getColumnIndex(r5)
                r24 = r5
                java.lang.String r5 = "surveyState"
                int r5 = r3.getColumnIndex(r5)
                r25 = r5
                java.lang.String r5 = "surveyTargeting"
                int r5 = r3.getColumnIndex(r5)
                r26 = r5
                java.lang.String r5 = "supportedLocales"
                int r5 = r3.getColumnIndex(r5)
                r27 = r5
                java.lang.String r5 = "isLocalized"
                int r5 = r3.getColumnIndex(r5)
                r28 = r5
                java.lang.String r5 = "currentLocale"
                int r5 = r3.getColumnIndex(r5)
                boolean r29 = r3.moveToFirst()     // Catch:{ JSONException -> 0x0404, all -> 0x03fd }
                if (r29 != 0) goto L_0x01e4
                boolean r29 = r3.isClosed()     // Catch:{ JSONException -> 0x0404, all -> 0x03fd }
                if (r29 != 0) goto L_0x01e4
                r3.close()     // Catch:{ JSONException -> 0x0404, all -> 0x03fd }
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0404, all -> 0x03fd }
                r0.<init>()     // Catch:{ JSONException -> 0x0404, all -> 0x03fd }
                boolean r1 = r3.isClosed()
                if (r1 != 0) goto L_0x01df
                r3.close()
            L_0x01df:
                r14.close()
                goto L_0x0433
            L_0x01e4:
                r29 = r14
                java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r14.<init>()     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
            L_0x01eb:
                long r30 = r3.getLong(r0)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                java.lang.Long r30 = java.lang.Long.valueOf(r30)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r31 = r0
                int r0 = r3.getInt(r6)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r32 = r6
                int r6 = r3.getInt(r7)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r33 = r7
                java.lang.String r7 = r3.getString(r8)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r34 = r8
                java.lang.String r8 = r3.getString(r9)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r35 = r9
                java.lang.String r9 = r3.getString(r10)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r36 = r10
                int r10 = r3.getInt(r11)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r37 = r11
                int r11 = r3.getInt(r12)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r38 = r12
                int r12 = r3.getInt(r13)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r39 = r13
                int r13 = r3.getInt(r15)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r40 = r15
                int r15 = r3.getInt(r1)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r41 = r1
                int r1 = r3.getInt(r4)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r42 = r4
                int r4 = r3.getInt(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r43 = r2
                r2 = r18
                r18 = r14
                int r14 = r3.getInt(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r44 = r2
                r2 = r19
                r19 = r14
                int r14 = r3.getInt(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r45 = r2
                r2 = r20
                r20 = r14
                java.lang.String r14 = r3.getString(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r46 = r2
                r2 = r21
                r21 = r14
                java.lang.String r14 = r3.getString(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r47 = r2
                r2 = r22
                r22 = r14
                java.lang.String r14 = r3.getString(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r48 = r2
                r2 = r23
                r23 = r14
                java.lang.String r14 = r3.getString(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r49 = r2
                r2 = r24
                r24 = r14
                java.lang.String r14 = r3.getString(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r50 = r2
                r2 = r25
                java.lang.String r25 = r3.getString(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r51 = r2
                r2 = r26
                java.lang.String r26 = r3.getString(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r52 = r2
                r2 = r27
                r27 = r14
                java.lang.String r14 = r3.getString(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r53 = r2
                r2 = r28
                r28 = r14
                int r14 = r3.getInt(r2)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r54 = r2
                java.lang.String r2 = r3.getString(r5)     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r55 = r5
                com.instabug.survey.models.Survey r5 = new com.instabug.survey.models.Survey     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r5.<init>()     // Catch:{ JSONException -> 0x03f7, all -> 0x03f2 }
                r57 = r2
                r56 = r3
                long r2 = r30.longValue()     // Catch:{ JSONException -> 0x03f0 }
                r5.setId(r2)     // Catch:{ JSONException -> 0x03f0 }
                r5.setType(r0)     // Catch:{ JSONException -> 0x03f0 }
                r0 = 1
                if (r6 != r0) goto L_0x02c5
                r0 = 1
                goto L_0x02c6
            L_0x02c5:
                r0 = 0
            L_0x02c6:
                r5.setGooglePlayAppRating(r0)     // Catch:{ JSONException -> 0x03f0 }
                r5.setTitle(r7)     // Catch:{ JSONException -> 0x03f0 }
                r5.setToken(r8)     // Catch:{ JSONException -> 0x03f0 }
                r5.setConditionsOperator(r9)     // Catch:{ JSONException -> 0x03f0 }
                r0 = 1
                if (r10 != r0) goto L_0x02d7
                r0 = 1
                goto L_0x02d8
            L_0x02d7:
                r0 = 0
            L_0x02d8:
                r5.setAnswered(r0)     // Catch:{ JSONException -> 0x03f0 }
                long r2 = (long) r11     // Catch:{ JSONException -> 0x03f0 }
                r5.setDismissedAt(r2)     // Catch:{ JSONException -> 0x03f0 }
                long r2 = (long) r12     // Catch:{ JSONException -> 0x03f0 }
                r5.setShowAt(r2)     // Catch:{ JSONException -> 0x03f0 }
                r0 = 1
                if (r13 != r0) goto L_0x02e8
                r2 = r0
                goto L_0x02e9
            L_0x02e8:
                r2 = 0
            L_0x02e9:
                r5.setCancelled(r2)     // Catch:{ JSONException -> 0x03f0 }
                r5.setAttemptCount(r15)     // Catch:{ JSONException -> 0x03f0 }
                r5.setEventIndex(r1)     // Catch:{ JSONException -> 0x03f0 }
                if (r4 != r0) goto L_0x02f6
                r1 = r0
                goto L_0x02f7
            L_0x02f6:
                r1 = 0
            L_0x02f7:
                r5.setShouldShowAgain(r1)     // Catch:{ JSONException -> 0x03f0 }
                r1 = r19
                if (r1 != r0) goto L_0x0300
                r0 = 1
                goto L_0x0301
            L_0x0300:
                r0 = 0
            L_0x0301:
                r5.setPaused(r0)     // Catch:{ JSONException -> 0x03f0 }
                r0 = r20
                r5.setSessionCount(r0)     // Catch:{ JSONException -> 0x03f0 }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03f0 }
                r1 = r21
                r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x03f0 }
                java.util.ArrayList r0 = com.instabug.survey.models.b.a(r0)     // Catch:{ JSONException -> 0x03f0 }
                r5.setQuestions(r0)     // Catch:{ JSONException -> 0x03f0 }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03f0 }
                r1 = r22
                r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x03f0 }
                java.util.ArrayList r0 = com.instabug.survey.models.c.a(r0)     // Catch:{ JSONException -> 0x03f0 }
                r5.setThankYouItems(r0)     // Catch:{ JSONException -> 0x03f0 }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03f0 }
                r1 = r23
                r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x03f0 }
                java.util.ArrayList r0 = com.instabug.survey.f.c.c.a(r0)     // Catch:{ JSONException -> 0x03f0 }
                r5.setTargetAudiences(r0)     // Catch:{ JSONException -> 0x03f0 }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03f0 }
                r1 = r24
                r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x03f0 }
                java.util.ArrayList r0 = com.instabug.survey.f.c.c.a(r0)     // Catch:{ JSONException -> 0x03f0 }
                r5.setCustomAttributes(r0)     // Catch:{ JSONException -> 0x03f0 }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03f0 }
                r1 = r27
                r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x03f0 }
                java.util.ArrayList r0 = com.instabug.survey.f.c.c.a(r0)     // Catch:{ JSONException -> 0x03f0 }
                r5.setUserEvents(r0)     // Catch:{ JSONException -> 0x03f0 }
                com.instabug.survey.f.c.f r0 = com.instabug.survey.f.c.f.valueOf(r25)     // Catch:{ JSONException -> 0x03f0 }
                r5.setSurveyState(r0)     // Catch:{ JSONException -> 0x03f0 }
                com.instabug.survey.f.c.g r0 = com.instabug.survey.f.c.g.b(r26)     // Catch:{ JSONException -> 0x03f0 }
                r5.setTarget(r0)     // Catch:{ JSONException -> 0x03f0 }
                com.instabug.survey.f.c.b r0 = r5.getLocalization()     // Catch:{ JSONException -> 0x03f0 }
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03f0 }
                r2 = r28
                r1.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x03f0 }
                r0.a(r1)     // Catch:{ JSONException -> 0x03f0 }
                com.instabug.survey.f.c.b r0 = r5.getLocalization()     // Catch:{ JSONException -> 0x03f0 }
                r1 = r57
                r0.q = r1     // Catch:{ JSONException -> 0x03f0 }
                com.instabug.survey.f.c.b r0 = r5.getLocalization()     // Catch:{ JSONException -> 0x03f0 }
                r1 = 1
                if (r14 != r1) goto L_0x037b
                goto L_0x037c
            L_0x037b:
                r1 = 0
            L_0x037c:
                r0.c = r1     // Catch:{ JSONException -> 0x03f0 }
                r0 = r18
                r0.add(r5)     // Catch:{ JSONException -> 0x03f0 }
                boolean r1 = r56.moveToNext()     // Catch:{ JSONException -> 0x03f0 }
                if (r1 != 0) goto L_0x03b9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x03f0 }
                r1.<init>()     // Catch:{ JSONException -> 0x03f0 }
                int r2 = r0.size()     // Catch:{ JSONException -> 0x03f0 }
                r1.append(r2)     // Catch:{ JSONException -> 0x03f0 }
                java.lang.String r2 = " surveys are not answered, have been retrieved from "
                r1.append(r2)     // Catch:{ JSONException -> 0x03f0 }
                java.lang.String r2 = "surveys_table"
                r1.append(r2)     // Catch:{ JSONException -> 0x03f0 }
                java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x03f0 }
                r2 = r17
                com.instabug.library.util.InstabugSDKLogger.d(r2, r1)     // Catch:{ JSONException -> 0x03b6 }
                boolean r1 = r56.isClosed()
                if (r1 != 0) goto L_0x03b1
                r56.close()
            L_0x03b1:
                r29.close()
                goto L_0x0433
            L_0x03b6:
                r0 = move-exception
                goto L_0x040a
            L_0x03b9:
                r14 = r0
                r0 = r31
                r6 = r32
                r7 = r33
                r8 = r34
                r9 = r35
                r10 = r36
                r11 = r37
                r12 = r38
                r13 = r39
                r15 = r40
                r1 = r41
                r4 = r42
                r2 = r43
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
                r28 = r54
                r5 = r55
                r3 = r56
                goto L_0x01eb
            L_0x03f0:
                r0 = move-exception
                goto L_0x03fa
            L_0x03f2:
                r0 = move-exception
                r56 = r3
                goto L_0x04cb
            L_0x03f7:
                r0 = move-exception
                r56 = r3
            L_0x03fa:
                r2 = r17
                goto L_0x040a
            L_0x03fd:
                r0 = move-exception
                r56 = r3
                r29 = r14
                goto L_0x04cb
            L_0x0404:
                r0 = move-exception
                r56 = r3
                r29 = r14
                goto L_0x03fa
            L_0x040a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ca }
                r1.<init>()     // Catch:{ all -> 0x04ca }
                java.lang.String r3 = "survey conversion failed due to "
                r1.append(r3)     // Catch:{ all -> 0x04ca }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04ca }
                r1.append(r0)     // Catch:{ all -> 0x04ca }
                java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04ca }
                com.instabug.library.util.InstabugSDKLogger.e(r2, r0)     // Catch:{ all -> 0x04ca }
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04ca }
                r0.<init>()     // Catch:{ all -> 0x04ca }
                boolean r1 = r56.isClosed()
                if (r1 != 0) goto L_0x0430
                r56.close()
            L_0x0430:
                r29.close()
            L_0x0433:
                java.lang.String r1 = "eventTriggeredSurveys: "
                java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
                int r2 = r0.size()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r2, r1)
                int r1 = r0.size()
                if (r1 <= 0) goto L_0x04d8
                r1 = r16
                java.util.List r0 = r1.a(r0)
                java.lang.String r2 = "validSurveys: "
                java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r3 = r0.size()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r3, r2)
                int r2 = r0.size()
                if (r2 <= 0) goto L_0x047b
                r2 = 0
                java.lang.Object r0 = r0.get(r2)
                com.instabug.survey.models.Survey r0 = (com.instabug.survey.models.Survey) r0
                goto L_0x047c
            L_0x047b:
                r0 = 0
            L_0x047c:
                if (r0 != 0) goto L_0x049c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "no valid surveys for the event"
                r0.append(r1)
                r2 = r59
                r0.append(r2)
                java.lang.String r1 = ". Returning null"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r1, r0)
                goto L_0x04d8
            L_0x049c:
                r2 = r59
                java.lang.String r3 = "Survey with id:{ "
                java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
                long r4 = r0.getId()
                r3.append(r4)
                java.lang.String r4 = "} is first valid survey for the event"
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "SurveysValidator"
                com.instabug.library.util.InstabugSDKLogger.i(r3, r2)
                i0.j.f.p.j$b r1 = r1.a
                i0.j.f.h r1 = (i0.j.f.h) r1
                monitor-enter(r1)
                r1.e(r0)     // Catch:{ all -> 0x04c6 }
                monitor-exit(r1)
                goto L_0x04d8
            L_0x04c6:
                r0 = move-exception
                r2 = r0
                monitor-exit(r1)
                throw r2
            L_0x04ca:
                r0 = move-exception
            L_0x04cb:
                boolean r1 = r56.isClosed()
                if (r1 != 0) goto L_0x04d4
                r56.close()
            L_0x04d4:
                r29.close()
                throw r0
            L_0x04d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.f.h.a.b(java.lang.Object):void");
        }
    }

    public h(Context context) {
        this.b = new WeakReference<>(context);
        this.d = new j(this, InstabugDeviceProperties.getAppVersionName(context), InstabugDeviceProperties.getAppVersion(context));
        this.f = new i0.j.f.n.a(this);
        this.g = new TaskDebouncer(TimeUnit.MINUTES.toMillis(1));
        f();
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public static synchronized h i() {
        h hVar;
        synchronized (h.class) {
            if (a == null) {
                j();
            }
            hVar = a;
        }
        return hVar;
    }

    public static synchronized void j() {
        synchronized (h.class) {
            if (Instabug.getApplicationContext() != null) {
                a = new h(Instabug.getApplicationContext());
            }
        }
    }

    public Survey a(String str) {
        for (Survey next : SurveysCacheManager.getSurveys()) {
            if (next.getToken() != null && next.getToken().equals(str)) {
                InstabugSDKLogger.i(this, "Showing survey With token " + str);
                return next;
            }
        }
        InstabugSDKLogger.i(this, "No Survey With token " + str);
        return null;
    }

    public void b(i0.j.f.q.a aVar) {
        try {
            String json = aVar.toJson();
            int i = c.b;
            if (i0.j.f.o.b.b() != null) {
                i0.j.f.o.b b2 = i0.j.f.o.b.b();
                b2.c.putString("survey_resolve_country_code", json);
                b2.c.apply();
            }
            String json2 = aVar.toJson();
            if (i0.j.f.l.i.b.a() != null) {
                i0.j.f.l.i.b a2 = i0.j.f.l.i.b.a();
                a2.c.putString("survey_resolve_country_code", json2);
                a2.c.apply();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            InstabugSDKLogger.e(this, "Can't update country info due to: " + e2.getMessage());
        }
    }

    public void c(Throwable th) {
        InstabugSDKLogger.e(b.class.getAnnotations(), th.getMessage(), th);
        k();
    }

    public void d(List<Survey> list) {
        i retrieveUserInteraction;
        if (this.b.get() != null) {
            String currentLocaleResolved = LocaleUtils.getCurrentLocaleResolved((Context) this.b.get());
            int i = c.b;
            if (i0.j.f.o.b.b() != null) {
                i0.j.f.o.a.a().h = currentLocaleResolved;
            }
        }
        List<Survey> surveys = SurveysCacheManager.getSurveys();
        String userUUID = UserManagerWrapper.getUserUUID();
        ArrayList arrayList = new ArrayList();
        for (Survey next : surveys) {
            if (!list.contains(next) && (retrieveUserInteraction = UserInteractionCacheManager.retrieveUserInteraction(next.getId(), userUUID, 0)) != null) {
                arrayList.add(retrieveUserInteraction);
            }
        }
        if (!arrayList.isEmpty()) {
            UserInteractionCacheManager.deleteBulkOfUserInteractions(arrayList);
        }
        for (Survey next2 : SurveysCacheManager.getSurveys()) {
            if (!list.contains(next2)) {
                SurveysCacheManager.delete(next2.getId());
            }
        }
        for (Survey next3 : list) {
            if (SurveysCacheManager.isSurveyExisting(next3.getId())) {
                Survey surveyById = SurveysCacheManager.getSurveyById(next3.getId());
                if (surveyById != null) {
                    boolean z = true;
                    boolean z2 = surveyById.isPaused() != next3.isPaused();
                    if (next3.isPaused() || next3.getLocalization().q == null || next3.getLocalization().q.equals(surveyById.getLocalization().q)) {
                        z = false;
                    }
                    if (z2 || z) {
                        SurveysCacheManager.insertOrUpdatePausedOrLocale(next3, z2, z);
                    }
                }
            } else if (!next3.isPaused()) {
                SurveysCacheManager.addSurvey(next3);
            }
        }
        if (!Instabug.isEnabled()) {
            InstabugSDKLogger.d(h.class, "Instabug SDK is disabled.");
        } else {
            k();
        }
    }

    public final void e(Survey survey) {
        if (Instabug.isEnabled()) {
            i0.j.f.m.c a2 = i0.j.f.m.c.a();
            a2.c = new i0.j.f.m.b(a2, survey);
            PresentationManager.getInstance().show(a2.c);
        }
    }

    public void f() {
        k0.b.w.a aVar = this.e;
        if (aVar == null || aVar.isDisposed()) {
            this.e = UserEventsEventBus.getInstance().subscribe(new a());
        }
    }

    public void g() {
        k0.b.w.a aVar = this.e;
        if (aVar != null && !aVar.isDisposed()) {
            this.e.dispose();
        }
    }

    public final Survey h() throws ParseException {
        j jVar = this.d;
        Objects.requireNonNull(jVar);
        InstabugSDKLogger.i("SurveysValidator", "getFirstValidSurvey()");
        List<Survey> timeTriggeredSurveys = SurveysCacheManager.getTimeTriggeredSurveys();
        StringBuilder P0 = i0.d.a.a.a.P0("timeTriggeredSurveys: ");
        P0.append(timeTriggeredSurveys.size());
        InstabugSDKLogger.i("SurveysValidator", P0.toString());
        List<Survey> a2 = jVar.a(timeTriggeredSurveys);
        StringBuilder P02 = i0.d.a.a.a.P0("timeTriggeredSurveys: ");
        P02.append(timeTriggeredSurveys.size());
        InstabugSDKLogger.i("SurveysValidator", P02.toString());
        ArrayList arrayList = (ArrayList) a2;
        Survey survey = arrayList.size() > 0 ? (Survey) arrayList.get(0) : null;
        if (survey == null) {
            InstabugSDKLogger.i("SurveysValidator", "no valid surveys. Returning null...");
        } else {
            StringBuilder P03 = i0.d.a.a.a.P0("Survey with id:{ ");
            P03.append(survey.getId());
            P03.append("}  is first valid survey");
            InstabugSDKLogger.i("SurveysValidator", P03.toString());
        }
        return survey;
    }

    public final void k() {
        try {
            Thread.sleep(10000);
            int i = c.b;
            if (i0.j.f.o.a.a().b && Instabug.isAppOnForeground()) {
                UserEventsEventBus.getInstance().post(new d());
            }
        } catch (InterruptedException e2) {
            InstabugSDKLogger.e(b.class.getAnnotations(), e2.getMessage(), e2);
        }
    }

    public void l(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("Can't resolve country info due to: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e(this, P0.toString());
    }
}
