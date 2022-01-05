package i0.j.f.p;

import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.f.c.c;
import com.instabug.survey.models.Survey;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressFBWarnings({"DM_BOXED_PRIMITIVE_FOR_COMPARE"})
/* compiled from: SurveysValidator */
public class j {
    public b a;
    @Deprecated
    public String b;
    public String c;

    /* compiled from: SurveysValidator */
    public class a implements Comparator<Survey> {
        public int compare(Object obj, Object obj2) {
            return Long.valueOf(((Survey) obj).getDismissedAt()).compareTo(Long.valueOf(((Survey) obj2).getDismissedAt()));
        }
    }

    /* compiled from: SurveysValidator */
    public interface b {
    }

    public j(b bVar, String str, String str2) {
        this.a = bVar;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r5 == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        if (r4.shouldShowAgain() != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ec, code lost:
        if (r4.isLastEventDismiss() == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        if (r6 >= r9) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.instabug.survey.models.Survey> a(java.util.List<com.instabug.survey.models.Survey> r14) throws java.text.ParseException {
        /*
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0009
        L_0x0005:
            int r1 = r14.size()
        L_0x0009:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getAllValidSurveys(availableSurveys: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "SurveysValidator"
            com.instabug.library.util.InstabugSDKLogger.i(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r14 == 0) goto L_0x0136
            java.util.Iterator r3 = r14.iterator()
        L_0x002f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x011a
            java.lang.Object r4 = r3.next()
            com.instabug.survey.models.Survey r4 = (com.instabug.survey.models.Survey) r4
            boolean r5 = r4.isOptInSurvey()
            if (r5 != 0) goto L_0x002f
            boolean r5 = r4.isPaused()
            if (r5 != 0) goto L_0x002f
            boolean r5 = r13.d(r4)
            if (r5 == 0) goto L_0x002f
            i0.j.f.o.b r5 = i0.j.f.o.b.b()
            r6 = 1000(0x3e8, double:4.94E-321)
            r8 = 1
            if (r5 == 0) goto L_0x00cc
            i0.j.f.o.b r5 = i0.j.f.o.b.b()
            android.content.SharedPreferences r5 = r5.b
            java.lang.String r9 = "survey_reshow_set_by_local_api"
            boolean r5 = r5.getBoolean(r9, r0)
            if (r5 == 0) goto L_0x00cc
            long r9 = r4.getDismissedAt()
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x00bf
            int r5 = r4.getSessionCounter()
            i0.j.f.o.b r9 = i0.j.f.o.b.b()
            r10 = 4
            if (r9 != 0) goto L_0x007a
            goto L_0x008a
        L_0x007a:
            i0.j.f.o.b r9 = i0.j.f.o.b.b()
            android.content.SharedPreferences r9 = r9.b
            java.lang.String r11 = "survey_reshow_after_session_count"
            int r9 = r9.getInt(r11, r10)
            if (r5 < r9) goto L_0x008a
            r5 = r8
            goto L_0x008b
        L_0x008a:
            r5 = r0
        L_0x008b:
            if (r5 == 0) goto L_0x00bc
            long r11 = r4.getDismissedAt()
            long r11 = r11 * r6
            long r5 = com.instabug.library.util.TimeUtils.currentTimeMillis()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.DAYS
            long r5 = r5 - r11
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r7.convert(r5, r9)
            int r5 = (int) r5
            i0.j.f.o.b r6 = i0.j.f.o.b.b()
            if (r6 != 0) goto L_0x00a7
            goto L_0x00b7
        L_0x00a7:
            i0.j.f.o.b r6 = i0.j.f.o.b.b()
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r7 = "survey_reshow_after_days_count"
            int r6 = r6.getInt(r7, r10)
            if (r5 < r6) goto L_0x00b7
            r5 = r8
            goto L_0x00b8
        L_0x00b7:
            r5 = r0
        L_0x00b8:
            if (r5 == 0) goto L_0x00bc
            r5 = r8
            goto L_0x00bd
        L_0x00bc:
            r5 = r0
        L_0x00bd:
            if (r5 == 0) goto L_0x0112
        L_0x00bf:
            boolean r5 = r4.isAnswered()
            if (r5 != 0) goto L_0x0112
            boolean r5 = r4.shouldShowAgain()
            if (r5 == 0) goto L_0x0112
            goto L_0x0113
        L_0x00cc:
            com.instabug.survey.f.c.g r5 = r4.getTarget()
            com.instabug.survey.f.c.d r5 = r5.Y1
            int r9 = r5.c
            if (r9 != r8) goto L_0x00ef
            boolean r5 = r4.isPaused()
            if (r5 != 0) goto L_0x0112
            boolean r5 = r4.isAnswered()
            if (r5 != 0) goto L_0x0112
            boolean r5 = r4.isCancelled()
            if (r5 != 0) goto L_0x0112
            boolean r5 = r4.isLastEventDismiss()
            if (r5 != 0) goto L_0x0112
            goto L_0x0113
        L_0x00ef:
            int r9 = r5.a()
            long r10 = r4.getShownAt()
            long r10 = r10 * r6
            long r6 = com.instabug.library.util.TimeUtils.currentTimeMillis()
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.DAYS
            long r6 = r6 - r10
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r6 = r12.convert(r6, r10)
            int r6 = (int) r6
            int r5 = r5.c
            if (r5 != 0) goto L_0x010c
            r5 = r8
            goto L_0x010d
        L_0x010c:
            r5 = r0
        L_0x010d:
            if (r5 == 0) goto L_0x0112
            if (r6 < r9) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r8 = r0
        L_0x0113:
            if (r8 == 0) goto L_0x002f
            r1.add(r4)
            goto L_0x002f
        L_0x011a:
            java.lang.String r0 = "validSurveys: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            int r3 = r1.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r2, r0)
            i0.j.f.p.j$a r0 = new i0.j.f.p.j$a
            r0.<init>()
            java.util.Collections.sort(r14, r0)
        L_0x0136:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.j.a(java.util.List):java.util.List");
    }

    public boolean b(c cVar, String str) {
        boolean contains;
        InstabugSDKLogger.i("SurveysValidator", "checkStringCondition(condition: " + cVar + ", actualValue: " + str + ")");
        String str2 = cVar.d;
        if (str2 == null || str == null) {
            return false;
        }
        String str3 = cVar.q;
        str3.hashCode();
        char c2 = 65535;
        switch (str3.hashCode()) {
            case -630852760:
                if (str3.equals("not_contain")) {
                    c2 = 0;
                    break;
                }
                break;
            case 96757556:
                if (str3.equals("equal")) {
                    c2 = 1;
                    break;
                }
                break;
            case 951526612:
                if (str3.equals("contain")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1614662344:
                if (str3.equals("not_equal")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                contains = str.contains(str2);
                break;
            case 1:
                return str.equals(str2);
            case 2:
                return str.contains(str2);
            case 3:
                contains = str.equals(str2);
                break;
            default:
                return false;
        }
        return !contains;
    }

    public final boolean c(c cVar, Throwable th) {
        InstabugSDKLogger.e(this, "Failed to resolve condition: " + cVar, th);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: char} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x046d, code lost:
        if (r0.getDate() == r7.getDate()) goto L_0x067c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x047f, code lost:
        if (r0.getDate() == r7.getDate()) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05bf, code lost:
        if (r5 == 1) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05c3, code lost:
        if (r5 != 0) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05c7, code lost:
        if (r5 == 0) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x066f, code lost:
        r0 = true;
        r1 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x067d, code lost:
        if (r14 != 0) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x067f, code lost:
        r6 = r0;
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0683, code lost:
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0689, code lost:
        if (r5.equals(r9) != false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x068b, code lost:
        r0 = r18 & r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x068e, code lost:
        r0 = r18 | r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0690, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x08c4, code lost:
        if (r7.equals(r8) != false) goto L_0x08c9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x038f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0514 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x082b A[SYNTHETIC, Splitter:B:409:0x082b] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x088d  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0894  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x08cb  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x08ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(com.instabug.survey.models.Survey r32) throws java.text.ParseException {
        /*
            r31 = this;
            r1 = r31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "checkSurveyValidity(survey: "
            r0.append(r2)
            r2 = r32
            r0.append(r2)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "SurveysValidator"
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            int r0 = r32.getType()
            r5 = 2
            r6 = 0
            if (r0 != r5) goto L_0x0036
            boolean r0 = r32.isGooglePlayAppRating()
            if (r0 != 0) goto L_0x0036
            i0.j.f.o.a r0 = i0.j.f.o.a.a()
            boolean r0 = r0.k
            if (r0 != 0) goto L_0x0036
            return r6
        L_0x0036:
            int r0 = r32.getType()
            r5 = 1
            if (r0 != r5) goto L_0x0046
            i0.j.f.o.a r0 = i0.j.f.o.a.a()
            boolean r0 = r0.k
            if (r0 != 0) goto L_0x0046
            return r6
        L_0x0046:
            java.util.ArrayList r5 = r32.getTargetAudiences()
            java.lang.String r7 = r32.getConditionsOperator()
            long r8 = r32.getDismissedAt()
            if (r5 != 0) goto L_0x0056
            r10 = r6
            goto L_0x005b
        L_0x0056:
            int r0 = r5.size()
            r10 = r0
        L_0x005b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "checkPrimitiveTypes(primitiveTypesConditions: "
            r0.append(r11)
            r0.append(r10)
            java.lang.String r11 = ", conditionsOperator: "
            r0.append(r11)
            r0.append(r7)
            java.lang.String r12 = ", dismissedAt: "
            r0.append(r12)
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.lang.String r13 = "and"
            boolean r0 = r7.equals(r13)
            r14 = r6
            r6 = r0
        L_0x008a:
            java.lang.String r15 = "checkUserEvent(condition: "
            java.lang.String r2 = "equal"
            r16 = r13
            java.lang.String r13 = "greater_than"
            r17 = r11
            java.lang.String r11 = "less_than"
            r18 = r6
            java.lang.String r6 = "not_equal"
            r19 = r7
            java.lang.String r7 = "or"
            if (r14 >= r10) goto L_0x06a4
            java.lang.Object r0 = r5.get(r14)
            r20 = r5
            r5 = r0
            com.instabug.survey.f.c.c r5 = (com.instabug.survey.f.c.c) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r21 = r10
            java.lang.String r10 = "checkPrimitiveType(primitiveTypeCondition: "
            r0.append(r10)
            r0.append(r5)
            r0.append(r12)
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.lang.String r0 = r5.c
            r0.hashCode()
            int r10 = r0.hashCode()
            switch(r10) {
                case -1464712027: goto L_0x013f;
                case -901870406: goto L_0x0134;
                case -12379384: goto L_0x0129;
                case 3076014: goto L_0x011e;
                case 96619420: goto L_0x0113;
                case 957831062: goto L_0x0108;
                case 1421955229: goto L_0x00fd;
                case 1694233633: goto L_0x00f2;
                case 1905908461: goto L_0x00e4;
                case 2013274756: goto L_0x00d6;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            goto L_0x014a
        L_0x00d6:
            java.lang.String r10 = "last_seen"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00e0
            goto L_0x014a
        L_0x00e0:
            r0 = 9
            goto L_0x014b
        L_0x00e4:
            java.lang.String r10 = "sessions_count"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00ee
            goto L_0x014a
        L_0x00ee:
            r0 = 8
            goto L_0x014b
        L_0x00f2:
            java.lang.String r10 = "app_version_v2"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00fb
            goto L_0x014a
        L_0x00fb:
            r0 = 7
            goto L_0x014b
        L_0x00fd:
            java.lang.String r10 = "days_since_dismiss"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0106
            goto L_0x014a
        L_0x0106:
            r0 = 6
            goto L_0x014b
        L_0x0108:
            java.lang.String r10 = "country"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0111
            goto L_0x014a
        L_0x0111:
            r0 = 5
            goto L_0x014b
        L_0x0113:
            java.lang.String r10 = "email"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x011c
            goto L_0x014a
        L_0x011c:
            r0 = 4
            goto L_0x014b
        L_0x011e:
            java.lang.String r10 = "date"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0127
            goto L_0x014a
        L_0x0127:
            r0 = 3
            goto L_0x014b
        L_0x0129:
            java.lang.String r10 = "android_version"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0132
            goto L_0x014a
        L_0x0132:
            r0 = 2
            goto L_0x014b
        L_0x0134:
            java.lang.String r10 = "app_version"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x013d
            goto L_0x014a
        L_0x013d:
            r0 = 1
            goto L_0x014b
        L_0x013f:
            java.lang.String r10 = "days_since_signup"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r0 = 0
            goto L_0x014b
        L_0x014a:
            r0 = -1
        L_0x014b:
            java.lang.String r10 = "checkDaysSinceDismissCondition(condition: "
            r22 = r12
            java.lang.String r12 = "validateAppVersion(condition: "
            switch(r0) {
                case 0: goto L_0x05d3;
                case 1: goto L_0x051e;
                case 2: goto L_0x0489;
                case 3: goto L_0x03ed;
                case 4: goto L_0x03e0;
                case 5: goto L_0x0399;
                case 6: goto L_0x02f3;
                case 7: goto L_0x027b;
                case 8: goto L_0x01ea;
                case 9: goto L_0x0159;
                default: goto L_0x0154;
            }
        L_0x0154:
            r29 = r8
            r9 = r7
            goto L_0x067c
        L_0x0159:
            java.lang.String r0 = r5.d
            long r23 = java.lang.Long.parseLong(r0)
            long r25 = com.instabug.library.core.InstabugCore.getLastSeenTimestamp()
            long r27 = com.instabug.library.util.TimeUtils.currentTimeMillis()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r29 = r8
            r9 = r7
            long r7 = r27 - r25
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = r0.convert(r7, r10)
            int r0 = (int) r7
            long r7 = (long) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r5)
            java.lang.String r10 = ", daysSinceLastSeen: "
            r0.append(r10)
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.lang.String r0 = r5.q
            r0.hashCode()
            int r5 = r0.hashCode()
            switch(r5) {
                case -1374681402: goto L_0x01bb;
                case 96757556: goto L_0x01b2;
                case 365984903: goto L_0x01a9;
                case 1614662344: goto L_0x01a0;
                default: goto L_0x019f;
            }
        L_0x019f:
            goto L_0x01c4
        L_0x01a0:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01a7
            goto L_0x01c4
        L_0x01a7:
            r0 = 3
            goto L_0x01c5
        L_0x01a9:
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x01b0
            goto L_0x01c4
        L_0x01b0:
            r0 = 2
            goto L_0x01c5
        L_0x01b2:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01b9
            goto L_0x01c4
        L_0x01b9:
            r0 = 1
            goto L_0x01c5
        L_0x01bb:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x01c2
            goto L_0x01c4
        L_0x01c2:
            r0 = 0
            goto L_0x01c5
        L_0x01c4:
            r0 = -1
        L_0x01c5:
            if (r0 == 0) goto L_0x01e4
            r2 = 1
            if (r0 == r2) goto L_0x01de
            r2 = 2
            if (r0 == r2) goto L_0x01d8
            r2 = 3
            if (r0 == r2) goto L_0x01d2
            goto L_0x067c
        L_0x01d2:
            int r0 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x067c
            goto L_0x066f
        L_0x01d8:
            int r0 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x067c
            goto L_0x066f
        L_0x01de:
            int r0 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x067c
            goto L_0x066f
        L_0x01e4:
            int r0 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x067c
            goto L_0x066f
        L_0x01ea:
            r29 = r8
            r9 = r7
            com.instabug.library.settings.SettingsManager r0 = com.instabug.library.settings.SettingsManager.getInstance()
            int r0 = r0.getSessionsCount()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            r7.append(r5)
            java.lang.String r8 = ", actualSessionCount: "
            r7.append(r8)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r7)
            java.lang.String r7 = r5.d
            if (r7 != 0) goto L_0x0218
            goto L_0x067c
        L_0x0218:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0275 }
            java.lang.String r8 = r5.q     // Catch:{ NumberFormatException -> 0x0275 }
            int r10 = r8.hashCode()     // Catch:{ NumberFormatException -> 0x0275 }
            r12 = -1374681402(0xffffffffae1006c6, float:-3.2747825E-11)
            if (r10 == r12) goto L_0x024f
            r12 = 96757556(0x5c46734, float:1.8469662E-35)
            if (r10 == r12) goto L_0x0247
            r2 = 365984903(0x15d07c87, float:8.4207E-26)
            if (r10 == r2) goto L_0x023f
            r2 = 1614662344(0x603dcac8, float:5.4703852E19)
            if (r10 == r2) goto L_0x0237
            goto L_0x0257
        L_0x0237:
            boolean r2 = r8.equals(r6)     // Catch:{ NumberFormatException -> 0x0275 }
            if (r2 == 0) goto L_0x0257
            r2 = 1
            goto L_0x0258
        L_0x023f:
            boolean r2 = r8.equals(r11)     // Catch:{ NumberFormatException -> 0x0275 }
            if (r2 == 0) goto L_0x0257
            r2 = 3
            goto L_0x0258
        L_0x0247:
            boolean r2 = r8.equals(r2)     // Catch:{ NumberFormatException -> 0x0275 }
            if (r2 == 0) goto L_0x0257
            r2 = 0
            goto L_0x0258
        L_0x024f:
            boolean r2 = r8.equals(r13)     // Catch:{ NumberFormatException -> 0x0275 }
            if (r2 == 0) goto L_0x0257
            r2 = 2
            goto L_0x0258
        L_0x0257:
            r2 = -1
        L_0x0258:
            if (r2 == 0) goto L_0x0271
            r5 = 1
            if (r2 == r5) goto L_0x026d
            r5 = 2
            if (r2 == r5) goto L_0x0269
            r5 = 3
            if (r2 == r5) goto L_0x0265
            goto L_0x067c
        L_0x0265:
            if (r0 >= r7) goto L_0x067c
            goto L_0x066f
        L_0x0269:
            if (r0 <= r7) goto L_0x067c
            goto L_0x066f
        L_0x026d:
            if (r0 == r7) goto L_0x067c
            goto L_0x066f
        L_0x0271:
            if (r0 != r7) goto L_0x067c
            goto L_0x066f
        L_0x0275:
            r0 = move-exception
            r1.c(r5, r0)
            goto L_0x067c
        L_0x027b:
            r29 = r8
            r9 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.lang.String r0 = r5.q
            boolean r2 = r0.equals(r13)
            if (r2 != 0) goto L_0x02aa
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x02a2
            goto L_0x02aa
        L_0x02a2:
            java.lang.String r0 = r1.c
            boolean r0 = r1.b(r5, r0)
            goto L_0x067d
        L_0x02aa:
            java.lang.String r2 = r5.d     // Catch:{ NumberFormatException -> 0x067c }
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x067c }
            long r7 = i0.j.f.o.c.c()     // Catch:{ NumberFormatException -> 0x067c }
            r23 = -1
            int r2 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x067c
            int r2 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x02c0
            goto L_0x067c
        L_0x02c0:
            int r2 = r0.hashCode()     // Catch:{ NumberFormatException -> 0x067c }
            r10 = -1374681402(0xffffffffae1006c6, float:-3.2747825E-11)
            if (r2 == r10) goto L_0x02d7
            r10 = 365984903(0x15d07c87, float:8.4207E-26)
            if (r2 == r10) goto L_0x02cf
            goto L_0x02df
        L_0x02cf:
            boolean r0 = r0.equals(r11)     // Catch:{ NumberFormatException -> 0x067c }
            if (r0 == 0) goto L_0x02df
            r0 = 1
            goto L_0x02e0
        L_0x02d7:
            boolean r0 = r0.equals(r13)     // Catch:{ NumberFormatException -> 0x067c }
            if (r0 == 0) goto L_0x02df
            r0 = 0
            goto L_0x02e0
        L_0x02df:
            r0 = -1
        L_0x02e0:
            if (r0 == 0) goto L_0x02ed
            r2 = 1
            if (r0 == r2) goto L_0x02e7
            goto L_0x067c
        L_0x02e7:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x067c
            goto L_0x066f
        L_0x02ed:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x067c
            goto L_0x066f
        L_0x02f3:
            r29 = r8
            r9 = r7
            java.lang.Long r0 = java.lang.Long.valueOf(r29)
            long r7 = r0.longValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r5)
            java.lang.String r10 = ", lastDismissDate: "
            r0.append(r10)
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.lang.String r0 = r5.d
            if (r0 != 0) goto L_0x0321
            goto L_0x067c
        L_0x0321:
            r23 = 0
            int r10 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r10 != 0) goto L_0x0329
            goto L_0x066f
        L_0x0329:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0393 }
            long r23 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0393 }
            long r7 = r23 - r7
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NumberFormatException -> 0x0393 }
            long r7 = r10.toDays(r7)     // Catch:{ NumberFormatException -> 0x0393 }
            int r7 = (int) r7     // Catch:{ NumberFormatException -> 0x0393 }
            java.lang.String r8 = r5.q     // Catch:{ NumberFormatException -> 0x0393 }
            int r10 = r8.hashCode()     // Catch:{ NumberFormatException -> 0x0393 }
            r12 = -1374681402(0xffffffffae1006c6, float:-3.2747825E-11)
            if (r10 == r12) goto L_0x036d
            r12 = 96757556(0x5c46734, float:1.8469662E-35)
            if (r10 == r12) goto L_0x0365
            r2 = 365984903(0x15d07c87, float:8.4207E-26)
            if (r10 == r2) goto L_0x035d
            r2 = 1614662344(0x603dcac8, float:5.4703852E19)
            if (r10 == r2) goto L_0x0355
            goto L_0x0375
        L_0x0355:
            boolean r2 = r8.equals(r6)     // Catch:{ NumberFormatException -> 0x0393 }
            if (r2 == 0) goto L_0x0375
            r2 = 1
            goto L_0x0376
        L_0x035d:
            boolean r2 = r8.equals(r11)     // Catch:{ NumberFormatException -> 0x0393 }
            if (r2 == 0) goto L_0x0375
            r2 = 3
            goto L_0x0376
        L_0x0365:
            boolean r2 = r8.equals(r2)     // Catch:{ NumberFormatException -> 0x0393 }
            if (r2 == 0) goto L_0x0375
            r2 = 0
            goto L_0x0376
        L_0x036d:
            boolean r2 = r8.equals(r13)     // Catch:{ NumberFormatException -> 0x0393 }
            if (r2 == 0) goto L_0x0375
            r2 = 2
            goto L_0x0376
        L_0x0375:
            r2 = -1
        L_0x0376:
            if (r2 == 0) goto L_0x038f
            r5 = 1
            if (r2 == r5) goto L_0x038b
            r5 = 2
            if (r2 == r5) goto L_0x0387
            r5 = 3
            if (r2 == r5) goto L_0x0383
            goto L_0x067c
        L_0x0383:
            if (r7 >= r0) goto L_0x067c
            goto L_0x066f
        L_0x0387:
            if (r7 <= r0) goto L_0x067c
            goto L_0x066f
        L_0x038b:
            if (r7 == r0) goto L_0x067c
            goto L_0x066f
        L_0x038f:
            if (r7 != r0) goto L_0x067c
            goto L_0x066f
        L_0x0393:
            r0 = move-exception
            r1.c(r5, r0)
            goto L_0x067c
        L_0x0399:
            r29 = r8
            r9 = r7
            java.lang.String r0 = i0.j.f.o.c.a()
            java.lang.Class<i0.j.f.q.a> r6 = i0.j.f.q.a.class
            com.instabug.library.internal.storage.cache.Cacheable r0 = com.instabug.library.util.ObjectMapper.fromJson(r0, r6)
            i0.j.f.q.a r0 = (i0.j.f.q.a) r0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "validateOSApiLevel(primitiveTypeCondition: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", countryInfo: "
            r6.append(r7)
            r6.append(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r6)
            if (r0 == 0) goto L_0x067c
            java.lang.String r0 = r0.d
            java.lang.String r6 = r5.q
            r6.hashCode()
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x03d8
            goto L_0x067c
        L_0x03d8:
            java.lang.String r2 = r5.d
            boolean r0 = r2.equalsIgnoreCase(r0)
            goto L_0x067d
        L_0x03e0:
            r29 = r8
            r9 = r7
            java.lang.String r0 = com.instabug.library.core.InstabugCore.getIdentifiedUserEmail()
            boolean r0 = r1.b(r5, r0)
            goto L_0x067d
        L_0x03ed:
            r29 = r8
            r9 = r7
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkDateCondition(condition: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = ", actualDate: "
            r7.append(r8)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r7)
            java.lang.String r7 = r5.d
            if (r7 == 0) goto L_0x067c
            java.util.Date r7 = com.instabug.library.util.InstabugDateFormatter.getDate(r7)
            if (r7 == 0) goto L_0x067c
            java.util.Date r7 = com.instabug.library.util.InstabugDateFormatter.getStandardizedDate(r7)
            java.util.Date r0 = com.instabug.library.util.InstabugDateFormatter.getStandardizedDate(r0)
            java.lang.String r5 = r5.q
            r5.hashCode()
            int r8 = r5.hashCode()
            switch(r8) {
                case -1374681402: goto L_0x044e;
                case 96757556: goto L_0x0445;
                case 365984903: goto L_0x043c;
                case 1614662344: goto L_0x0433;
                default: goto L_0x0432;
            }
        L_0x0432:
            goto L_0x0457
        L_0x0433:
            boolean r2 = r5.equals(r6)
            if (r2 != 0) goto L_0x043a
            goto L_0x0457
        L_0x043a:
            r2 = 3
            goto L_0x0458
        L_0x043c:
            boolean r2 = r5.equals(r11)
            if (r2 != 0) goto L_0x0443
            goto L_0x0457
        L_0x0443:
            r2 = 2
            goto L_0x0458
        L_0x0445:
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x044c
            goto L_0x0457
        L_0x044c:
            r2 = 1
            goto L_0x0458
        L_0x044e:
            boolean r2 = r5.equals(r13)
            if (r2 != 0) goto L_0x0455
            goto L_0x0457
        L_0x0455:
            r2 = 0
            goto L_0x0458
        L_0x0457:
            r2 = -1
        L_0x0458:
            if (r2 == 0) goto L_0x0483
            r5 = 1
            if (r2 == r5) goto L_0x0477
            r5 = 2
            if (r2 == r5) goto L_0x0471
            r5 = 3
            if (r2 == r5) goto L_0x0465
            goto L_0x067c
        L_0x0465:
            int r0 = r0.getDate()
            int r2 = r7.getDate()
            if (r0 == r2) goto L_0x067c
            goto L_0x066f
        L_0x0471:
            boolean r0 = r0.before(r7)
            goto L_0x067d
        L_0x0477:
            int r0 = r0.getDate()
            int r2 = r7.getDate()
            if (r0 != r2) goto L_0x067c
            goto L_0x066f
        L_0x0483:
            boolean r0 = r0.after(r7)
            goto L_0x067d
        L_0x0489:
            r29 = r8
            r9 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "validateOSApiLevel(condition: "
            r0.append(r7)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "Build.VERSION.SDK_INT: "
            r0.append(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.lang.String r0 = r5.d     // Catch:{ NumberFormatException -> 0x0518 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0518 }
            java.lang.String r8 = r5.q     // Catch:{ NumberFormatException -> 0x0518 }
            int r10 = r8.hashCode()     // Catch:{ NumberFormatException -> 0x0518 }
            r12 = -1374681402(0xffffffffae1006c6, float:-3.2747825E-11)
            if (r10 == r12) goto L_0x04f2
            r12 = 96757556(0x5c46734, float:1.8469662E-35)
            if (r10 == r12) goto L_0x04ea
            r2 = 365984903(0x15d07c87, float:8.4207E-26)
            if (r10 == r2) goto L_0x04e2
            r2 = 1614662344(0x603dcac8, float:5.4703852E19)
            if (r10 == r2) goto L_0x04da
            goto L_0x04fa
        L_0x04da:
            boolean r2 = r8.equals(r6)     // Catch:{ NumberFormatException -> 0x0518 }
            if (r2 == 0) goto L_0x04fa
            r2 = 1
            goto L_0x04fb
        L_0x04e2:
            boolean r2 = r8.equals(r11)     // Catch:{ NumberFormatException -> 0x0518 }
            if (r2 == 0) goto L_0x04fa
            r2 = 3
            goto L_0x04fb
        L_0x04ea:
            boolean r2 = r8.equals(r2)     // Catch:{ NumberFormatException -> 0x0518 }
            if (r2 == 0) goto L_0x04fa
            r2 = 0
            goto L_0x04fb
        L_0x04f2:
            boolean r2 = r8.equals(r13)     // Catch:{ NumberFormatException -> 0x0518 }
            if (r2 == 0) goto L_0x04fa
            r2 = 2
            goto L_0x04fb
        L_0x04fa:
            r2 = -1
        L_0x04fb:
            if (r2 == 0) goto L_0x0514
            r5 = 1
            if (r2 == r5) goto L_0x0510
            r5 = 2
            if (r2 == r5) goto L_0x050c
            r5 = 3
            if (r2 == r5) goto L_0x0508
            goto L_0x067c
        L_0x0508:
            if (r7 >= r0) goto L_0x067c
            goto L_0x066f
        L_0x050c:
            if (r7 <= r0) goto L_0x067c
            goto L_0x066f
        L_0x0510:
            if (r7 == r0) goto L_0x067c
            goto L_0x066f
        L_0x0514:
            if (r7 != r0) goto L_0x067c
            goto L_0x066f
        L_0x0518:
            r0 = move-exception
            r1.c(r5, r0)
            goto L_0x067c
        L_0x051e:
            r29 = r8
            r9 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.lang.String r0 = r5.q
            boolean r7 = r0.equals(r2)
            if (r7 != 0) goto L_0x05cb
            boolean r7 = r0.equals(r6)
            if (r7 != 0) goto L_0x05cb
            java.lang.String r7 = r5.d
            java.lang.String r7 = r1.e(r7)
            java.lang.String r8 = r1.b
            java.lang.String r8 = r1.e(r8)
            java.lang.String r10 = "appVersionName: "
            java.lang.StringBuilder r10 = i0.d.a.a.a.P0(r10)
            java.lang.String r12 = r1.b
            r10.append(r12)
            java.lang.String r12 = ", currentVersionName: "
            r10.append(r12)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r10)
            if (r7 == 0) goto L_0x05cb
            if (r8 == 0) goto L_0x05cb
            int r5 = com.instabug.library.util.StringUtility.compareVersion(r8, r7)     // Catch:{ NumberFormatException -> 0x067c }
            int r7 = r0.hashCode()     // Catch:{ NumberFormatException -> 0x067c }
            r8 = -1374681402(0xffffffffae1006c6, float:-3.2747825E-11)
            if (r7 == r8) goto L_0x05a3
            r8 = 96757556(0x5c46734, float:1.8469662E-35)
            if (r7 == r8) goto L_0x059b
            r2 = 365984903(0x15d07c87, float:8.4207E-26)
            if (r7 == r2) goto L_0x0593
            r2 = 1614662344(0x603dcac8, float:5.4703852E19)
            if (r7 == r2) goto L_0x058b
            goto L_0x05ab
        L_0x058b:
            boolean r0 = r0.equals(r6)     // Catch:{ NumberFormatException -> 0x067c }
            if (r0 == 0) goto L_0x05ab
            r0 = 1
            goto L_0x05ac
        L_0x0593:
            boolean r0 = r0.equals(r11)     // Catch:{ NumberFormatException -> 0x067c }
            if (r0 == 0) goto L_0x05ab
            r0 = 3
            goto L_0x05ac
        L_0x059b:
            boolean r0 = r0.equals(r2)     // Catch:{ NumberFormatException -> 0x067c }
            if (r0 == 0) goto L_0x05ab
            r0 = 0
            goto L_0x05ac
        L_0x05a3:
            boolean r0 = r0.equals(r13)     // Catch:{ NumberFormatException -> 0x067c }
            if (r0 == 0) goto L_0x05ab
            r0 = 2
            goto L_0x05ac
        L_0x05ab:
            r0 = -1
        L_0x05ac:
            if (r0 == 0) goto L_0x05c7
            r2 = 1
            if (r0 == r2) goto L_0x05c3
            r6 = 2
            if (r0 == r6) goto L_0x05bf
            r6 = 3
            if (r0 == r6) goto L_0x05b9
            goto L_0x067c
        L_0x05b9:
            r0 = -1
            if (r5 != r0) goto L_0x067c
            r0 = r2
            goto L_0x067d
        L_0x05bf:
            if (r5 != r2) goto L_0x067c
            goto L_0x066f
        L_0x05c3:
            if (r5 == 0) goto L_0x067c
            goto L_0x066f
        L_0x05c7:
            if (r5 != 0) goto L_0x067c
            goto L_0x066f
        L_0x05cb:
            java.lang.String r0 = r1.b
            boolean r0 = r1.b(r5, r0)
            goto L_0x067d
        L_0x05d3:
            r29 = r8
            r9 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkDaysSinceSignUpCondition(condition: "
            r7.append(r8)
            r7.append(r5)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r7)
            java.lang.String r7 = r5.d
            if (r7 != 0) goto L_0x05f3
            goto L_0x067c
        L_0x05f3:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0676 }
            long r23 = com.instabug.library.core.InstabugCore.getFirstRunAt()     // Catch:{ NumberFormatException -> 0x0676 }
            long r25 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0676 }
            long r0 = r25 - r23
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NumberFormatException -> 0x0676 }
            long r0 = r10.toDays(r0)     // Catch:{ NumberFormatException -> 0x0676 }
            int r0 = (int) r0     // Catch:{ NumberFormatException -> 0x0676 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0676 }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x0676 }
            java.lang.String r10 = "actualDifferenceInDays: "
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x0676 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0676 }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x0676 }
            com.instabug.library.util.InstabugSDKLogger.i(r4, r1)     // Catch:{ NumberFormatException -> 0x0676 }
            java.lang.String r1 = r5.q     // Catch:{ NumberFormatException -> 0x0676 }
            int r10 = r1.hashCode()     // Catch:{ NumberFormatException -> 0x0676 }
            r12 = -1374681402(0xffffffffae1006c6, float:-3.2747825E-11)
            if (r10 == r12) goto L_0x064f
            r12 = 96757556(0x5c46734, float:1.8469662E-35)
            if (r10 == r12) goto L_0x0647
            r2 = 365984903(0x15d07c87, float:8.4207E-26)
            if (r10 == r2) goto L_0x063f
            r2 = 1614662344(0x603dcac8, float:5.4703852E19)
            if (r10 == r2) goto L_0x0637
            goto L_0x0657
        L_0x0637:
            boolean r1 = r1.equals(r6)     // Catch:{ NumberFormatException -> 0x0676 }
            if (r1 == 0) goto L_0x0657
            r1 = 1
            goto L_0x0658
        L_0x063f:
            boolean r1 = r1.equals(r11)     // Catch:{ NumberFormatException -> 0x0676 }
            if (r1 == 0) goto L_0x0657
            r1 = 3
            goto L_0x0658
        L_0x0647:
            boolean r1 = r1.equals(r2)     // Catch:{ NumberFormatException -> 0x0676 }
            if (r1 == 0) goto L_0x0657
            r1 = 0
            goto L_0x0658
        L_0x064f:
            boolean r1 = r1.equals(r13)     // Catch:{ NumberFormatException -> 0x0676 }
            if (r1 == 0) goto L_0x0657
            r1 = 2
            goto L_0x0658
        L_0x0657:
            r1 = -1
        L_0x0658:
            if (r1 == 0) goto L_0x066d
            r2 = 1
            if (r1 == r2) goto L_0x066a
            r2 = 2
            if (r1 == r2) goto L_0x0667
            r2 = 3
            if (r1 == r2) goto L_0x0664
            goto L_0x0673
        L_0x0664:
            if (r0 >= r7) goto L_0x0673
            goto L_0x066f
        L_0x0667:
            if (r0 <= r7) goto L_0x0673
            goto L_0x066f
        L_0x066a:
            if (r0 == r7) goto L_0x0673
            goto L_0x066f
        L_0x066d:
            if (r0 != r7) goto L_0x0673
        L_0x066f:
            r0 = 1
            r1 = r31
            goto L_0x067d
        L_0x0673:
            r1 = r31
            goto L_0x067c
        L_0x0676:
            r0 = move-exception
            r1 = r31
            r1.c(r5, r0)
        L_0x067c:
            r0 = 0
        L_0x067d:
            if (r14 != 0) goto L_0x0683
            r6 = r0
            r5 = r19
            goto L_0x0691
        L_0x0683:
            r5 = r19
            boolean r2 = r5.equals(r9)
            if (r2 != 0) goto L_0x068e
            r0 = r18 & r0
            goto L_0x0690
        L_0x068e:
            r0 = r18 | r0
        L_0x0690:
            r6 = r0
        L_0x0691:
            int r14 = r14 + 1
            r2 = r32
            r7 = r5
            r13 = r16
            r11 = r17
            r5 = r20
            r10 = r21
            r12 = r22
            r8 = r29
            goto L_0x008a
        L_0x06a4:
            r9 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "primitiveTypesValidity: "
            r0.append(r5)
            r5 = r18
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.util.ArrayList r0 = r32.getCustomAttributes()
            java.lang.String r7 = r32.getConditionsOperator()
            if (r0 != 0) goto L_0x06c7
            r8 = 0
            goto L_0x06cb
        L_0x06c7:
            int r8 = r0.size()
        L_0x06cb:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "checkCustomAttributesConditions(customAttributesConditions: "
            r10.append(r12)
            r10.append(r8)
            r12 = r17
            r10.append(r12)
            r10.append(r7)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r10)
            r10 = r16
            boolean r12 = r7.equals(r10)
            r14 = 0
        L_0x06f1:
            if (r14 >= r8) goto L_0x0738
            java.lang.Object r16 = r0.get(r14)
            r17 = r0
            r0 = r16
            com.instabug.survey.f.c.c r0 = (com.instabug.survey.f.c.c) r0
            r16 = r8
            java.util.HashMap r8 = com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper.getAll()
            r18 = r5
            java.lang.String r5 = r0.c
            boolean r5 = r8.containsKey(r5)
            if (r5 == 0) goto L_0x071d
            java.lang.String r5 = r0.c
            java.lang.Object r5 = r8.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = r1.b(r0, r5)
            if (r0 == 0) goto L_0x071d
            r0 = 1
            goto L_0x071e
        L_0x071d:
            r0 = 0
        L_0x071e:
            if (r14 != 0) goto L_0x0722
        L_0x0720:
            r12 = r0
            goto L_0x072f
        L_0x0722:
            boolean r5 = r7.equals(r9)
            if (r5 != 0) goto L_0x072b
            r5 = r12 & r0
            goto L_0x072d
        L_0x072b:
            r5 = r12 | r0
        L_0x072d:
            r0 = r0 & r5
            goto L_0x0720
        L_0x072f:
            int r14 = r14 + 1
            r8 = r16
            r0 = r17
            r5 = r18
            goto L_0x06f1
        L_0x0738:
            r18 = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "customAttributesValidity: "
            r0.append(r5)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r0)
            java.util.ArrayList r5 = r32.getUserEvents()
            java.lang.String r7 = r32.getConditionsOperator()
            boolean r0 = r7.equals(r10)
            if (r5 != 0) goto L_0x0763
            r2 = 0
            r8 = r9
            r5 = r10
            r17 = r12
            goto L_0x08e3
        L_0x0763:
            r8 = 0
            r14 = r8
        L_0x0765:
            r8 = r0
            int r0 = r5.size()
            if (r14 >= r0) goto L_0x08da
            java.lang.Object r0 = r5.get(r14)
            r16 = r5
            r5 = r0
            com.instabug.survey.f.c.c r5 = (com.instabug.survey.f.c.c) r5
            java.lang.String r0 = r5.c
            r17 = r12
            java.lang.String r12 = "METHOD NOT FOUND !"
            r19 = r8
            java.lang.Class<i0.j.f.p.j> r8 = i0.j.f.p.j.class
            r20 = r9
            java.lang.Class<com.instabug.library.logging.InstabugUserEventLogger> r9 = com.instabug.library.logging.InstabugUserEventLogger.class
            r21 = r10
            java.lang.String r10 = "getLoggingEventCount"
            r22 = r7
            r7 = 1
            r23 = r14
            java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x07b8, IllegalAccessException -> 0x07b6, InvocationTargetException -> 0x07b4 }
            java.lang.Class<java.lang.String> r24 = java.lang.String.class
            r25 = 0
            r14[r25] = r24     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r14)     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            r9.setAccessible(r7)     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            com.instabug.library.logging.InstabugUserEventLogger r10 = com.instabug.library.logging.InstabugUserEventLogger.getInstance()     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            r7[r25] = r0     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            java.lang.Object r0 = r9.invoke(r10, r7)     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            int r0 = r0.intValue()     // Catch:{ NoSuchMethodException -> 0x07b2, IllegalAccessException -> 0x07b0, InvocationTargetException -> 0x07ae }
            goto L_0x07eb
        L_0x07ae:
            r0 = move-exception
            goto L_0x07c3
        L_0x07b0:
            r0 = move-exception
            goto L_0x07d3
        L_0x07b2:
            r0 = move-exception
            goto L_0x07e3
        L_0x07b4:
            r0 = move-exception
            goto L_0x07c1
        L_0x07b6:
            r0 = move-exception
            goto L_0x07d1
        L_0x07b8:
            r0 = move-exception
            goto L_0x07e1
        L_0x07ba:
            r0 = move-exception
            r22 = r7
            r21 = r10
            r23 = r14
        L_0x07c1:
            r25 = 0
        L_0x07c3:
            com.instabug.library.util.InstabugSDKLogger.e(r8, r12)
            r0.printStackTrace()
            goto L_0x07e9
        L_0x07ca:
            r0 = move-exception
            r22 = r7
            r21 = r10
            r23 = r14
        L_0x07d1:
            r25 = 0
        L_0x07d3:
            com.instabug.library.util.InstabugSDKLogger.e(r8, r12)
            r0.printStackTrace()
            goto L_0x07e9
        L_0x07da:
            r0 = move-exception
            r22 = r7
            r21 = r10
            r23 = r14
        L_0x07e1:
            r25 = 0
        L_0x07e3:
            com.instabug.library.util.InstabugSDKLogger.e(r8, r12)
            r0.printStackTrace()
        L_0x07e9:
            r0 = r25
        L_0x07eb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r15)
            r7.append(r5)
            java.lang.String r8 = ", actualEventLoggingCount: "
            r7.append(r8)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r15)
            r7.append(r5)
            java.lang.String r8 = ", actualValue: "
            r7.append(r8)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r7)
            java.lang.String r7 = r5.d
            if (r7 != 0) goto L_0x082b
            goto L_0x0889
        L_0x082b:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0885 }
            java.lang.String r8 = r5.q     // Catch:{ NumberFormatException -> 0x0885 }
            int r9 = r8.hashCode()     // Catch:{ NumberFormatException -> 0x0885 }
            r10 = -1374681402(0xffffffffae1006c6, float:-3.2747825E-11)
            if (r9 == r10) goto L_0x0863
            r10 = 96757556(0x5c46734, float:1.8469662E-35)
            if (r9 == r10) goto L_0x085a
            r10 = 365984903(0x15d07c87, float:8.4207E-26)
            r12 = 1614662344(0x603dcac8, float:5.4703852E19)
            if (r9 == r10) goto L_0x0852
            if (r9 == r12) goto L_0x084a
            goto L_0x086b
        L_0x084a:
            boolean r5 = r8.equals(r6)     // Catch:{ NumberFormatException -> 0x0885 }
            if (r5 == 0) goto L_0x086b
            r5 = 1
            goto L_0x086c
        L_0x0852:
            boolean r5 = r8.equals(r11)     // Catch:{ NumberFormatException -> 0x0885 }
            if (r5 == 0) goto L_0x086b
            r5 = 3
            goto L_0x086c
        L_0x085a:
            boolean r5 = r8.equals(r2)     // Catch:{ NumberFormatException -> 0x0885 }
            if (r5 == 0) goto L_0x086b
            r5 = r25
            goto L_0x086c
        L_0x0863:
            boolean r5 = r8.equals(r13)     // Catch:{ NumberFormatException -> 0x0885 }
            if (r5 == 0) goto L_0x086b
            r5 = 2
            goto L_0x086c
        L_0x086b:
            r5 = -1
        L_0x086c:
            if (r5 == 0) goto L_0x0881
            r8 = 1
            if (r5 == r8) goto L_0x087e
            r8 = 2
            r9 = 3
            if (r5 == r8) goto L_0x087b
            if (r5 == r9) goto L_0x0878
            goto L_0x0889
        L_0x0878:
            if (r0 >= r7) goto L_0x0889
            goto L_0x0883
        L_0x087b:
            if (r0 <= r7) goto L_0x0889
            goto L_0x0883
        L_0x087e:
            if (r0 == r7) goto L_0x0889
            goto L_0x0883
        L_0x0881:
            if (r0 != r7) goto L_0x0889
        L_0x0883:
            r0 = 1
            goto L_0x088b
        L_0x0885:
            r0 = move-exception
            r1.c(r5, r0)
        L_0x0889:
            r0 = r25
        L_0x088b:
            if (r23 != 0) goto L_0x0894
            r8 = r20
            r5 = r21
            r7 = r22
            goto L_0x08d0
        L_0x0894:
            int r5 = r22.hashCode()
            r7 = 3555(0xde3, float:4.982E-42)
            if (r5 == r7) goto L_0x08ba
            r7 = 96727(0x179d7, float:1.35543E-40)
            if (r5 == r7) goto L_0x08a8
            r8 = r20
            r5 = r21
            r7 = r22
            goto L_0x08c7
        L_0x08a8:
            r5 = r21
            r7 = r22
            boolean r8 = r7.equals(r5)
            if (r8 == 0) goto L_0x08b7
            r25 = 1
            r8 = r20
            goto L_0x08c9
        L_0x08b7:
            r8 = r20
            goto L_0x08c7
        L_0x08ba:
            r8 = r20
            r5 = r21
            r7 = r22
            boolean r9 = r7.equals(r8)
            if (r9 == 0) goto L_0x08c7
            goto L_0x08c9
        L_0x08c7:
            r25 = -1
        L_0x08c9:
            if (r25 == 0) goto L_0x08ce
            r0 = r0 & r19
            goto L_0x08d0
        L_0x08ce:
            r0 = r0 | r19
        L_0x08d0:
            int r14 = r23 + 1
            r10 = r5
            r9 = r8
            r5 = r16
            r12 = r17
            goto L_0x0765
        L_0x08da:
            r19 = r8
            r8 = r9
            r5 = r10
            r17 = r12
            r2 = 0
            r0 = r19
        L_0x08e3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "userEventsValidity: "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r4, r3)
            java.util.ArrayList r3 = r32.getUserEvents()
            if (r3 == 0) goto L_0x0907
            java.util.ArrayList r3 = r32.getUserEvents()
            int r3 = r3.size()
            if (r3 > 0) goto L_0x091e
        L_0x0907:
            java.util.ArrayList r3 = r32.getCustomAttributes()
            int r3 = r3.size()
            if (r3 > 0) goto L_0x091e
            java.util.ArrayList r3 = r32.getTargetAudiences()
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x091c
            goto L_0x091e
        L_0x091c:
            r0 = 1
            return r0
        L_0x091e:
            r3 = 1
            java.lang.String r4 = r32.getConditionsOperator()
            r4.hashCode()
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0942
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x093a
            if (r18 == 0) goto L_0x0939
            if (r17 == 0) goto L_0x0939
            if (r0 == 0) goto L_0x0939
            r2 = r3
        L_0x0939:
            return r2
        L_0x093a:
            if (r18 != 0) goto L_0x0940
            if (r17 != 0) goto L_0x0940
            if (r0 == 0) goto L_0x0941
        L_0x0940:
            r2 = r3
        L_0x0941:
            return r2
        L_0x0942:
            if (r18 == 0) goto L_0x0949
            if (r17 == 0) goto L_0x0949
            if (r0 == 0) goto L_0x0949
            r2 = r3
        L_0x0949:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.j.d(com.instabug.survey.models.Survey):boolean");
    }

    public final String e(String str) {
        Matcher matcher = Pattern.compile("\\d+(\\.\\d+)*").matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }
}
