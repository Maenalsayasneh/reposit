package i0.j.f.l;

import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.e.c.a;
import com.instabug.survey.f.c.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: AnnouncementValidator */
public class h {
    @Deprecated
    public String a;
    public String b;

    public h(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public a a() {
        boolean z = d().size() > 0;
        InstabugSDKLogger.i("AnnouncementValidator", "hasValidAnnouncements() ? " + z);
        if (z) {
            a aVar = d().get(0);
            InstabugSDKLogger.i("AnnouncementValidator", "getFirstValidAnnouncement: " + aVar);
            return aVar;
        }
        InstabugSDKLogger.i("AnnouncementValidator", "getFirstValidAnnouncement: no valid announcements. Returning null...");
        return null;
    }

    public String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\d+(\\.\\d+)*").matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public boolean c(c cVar, String str) {
        boolean contains;
        InstabugSDKLogger.i("AnnouncementValidator", "checkStringCondition(condition: " + cVar + ", actualValue: " + str + ")");
        if (cVar == null) {
            return true;
        }
        String str2 = cVar.d;
        if (str2 == null || str == null) {
            return false;
        }
        String str3 = cVar.q;
        str3.hashCode();
        char c = 65535;
        switch (str3.hashCode()) {
            case -630852760:
                if (str3.equals("not_contain")) {
                    c = 0;
                    break;
                }
                break;
            case 96757556:
                if (str3.equals("equal")) {
                    c = 1;
                    break;
                }
                break;
            case 951526612:
                if (str3.equals("contain")) {
                    c = 2;
                    break;
                }
                break;
            case 1614662344:
                if (str3.equals("not_equal")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
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

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x039d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a7, code lost:
        if (r11 != 0) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a9, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b1, code lost:
        if (r8.equals("or") != false) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b3, code lost:
        r1 = r1 & r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03b5, code lost:
        r1 = r1 | r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03b7, code lost:
        r11 = r11 + 1;
        r1 = r16;
        r7 = r17;
        r9 = r20;
        r2 = r24;
        r3 = r25;
     */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x040d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.instabug.survey.e.c.a> d() {
        /*
            r26 = this;
            r0 = r26
            r1 = 101(0x65, float:1.42E-43)
            java.util.List r1 = i0.j.f.b.a.a.c(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            java.lang.String r4 = "app_version_v2"
            java.lang.String r5 = "AnnouncementValidator"
            java.lang.String r6 = ")"
            if (r3 <= 0) goto L_0x03ee
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03ee
            java.lang.Object r3 = r1.next()
            com.instabug.survey.e.c.a r3 = (com.instabug.survey.e.c.a) r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkStringCondition(announcement: "
            r7.append(r8)
            r7.append(r3)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r7)
            com.instabug.survey.f.c.i r7 = r3.a2
            com.instabug.survey.f.c.g r7 = r7.q
            java.util.ArrayList r7 = r7.c()
            com.instabug.survey.f.c.i r8 = r3.a2
            com.instabug.survey.f.c.g r8 = r8.q
            java.lang.String r8 = r8.Z1
            if (r7 != 0) goto L_0x0054
            r9 = 0
            goto L_0x0058
        L_0x0054:
            int r9 = r7.size()
        L_0x0058:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "checkPrimitiveTypes(primitiveTypesConditions: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = ", conditionsOperator: "
            r10.append(r11)
            r10.append(r8)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r10)
            java.lang.String r10 = "and"
            boolean r10 = r8.equals(r10)
            r11 = 0
        L_0x007e:
            if (r11 >= r9) goto L_0x03c5
            java.lang.Object r12 = r7.get(r11)
            com.instabug.survey.f.c.c r12 = (com.instabug.survey.f.c.c) r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "checkPrimitiveType(primitiveTypeCondition: "
            r13.append(r14)
            r13.append(r12)
            r13.append(r6)
            java.lang.String r13 = r13.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r13)
            java.lang.String r13 = r12.c
            r13.hashCode()
            int r14 = r13.hashCode()
            switch(r14) {
                case -901870406: goto L_0x00ea;
                case -12379384: goto L_0x00df;
                case 96619420: goto L_0x00d4;
                case 957831062: goto L_0x00c9;
                case 1694233633: goto L_0x00c0;
                case 1905908461: goto L_0x00b5;
                case 2013274756: goto L_0x00aa;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00f5
        L_0x00aa:
            java.lang.String r14 = "last_seen"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00b3
            goto L_0x00f5
        L_0x00b3:
            r13 = 6
            goto L_0x00f6
        L_0x00b5:
            java.lang.String r14 = "sessions_count"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00be
            goto L_0x00f5
        L_0x00be:
            r13 = 5
            goto L_0x00f6
        L_0x00c0:
            boolean r13 = r13.equals(r4)
            if (r13 != 0) goto L_0x00c7
            goto L_0x00f5
        L_0x00c7:
            r13 = 4
            goto L_0x00f6
        L_0x00c9:
            java.lang.String r14 = "country"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00d2
            goto L_0x00f5
        L_0x00d2:
            r13 = 3
            goto L_0x00f6
        L_0x00d4:
            java.lang.String r14 = "email"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00dd
            goto L_0x00f5
        L_0x00dd:
            r13 = 2
            goto L_0x00f6
        L_0x00df:
            java.lang.String r14 = "android_version"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            r13 = 1
            goto L_0x00f6
        L_0x00ea:
            java.lang.String r14 = "app_version"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r13 = 0
            goto L_0x00f6
        L_0x00f5:
            r13 = -1
        L_0x00f6:
            java.lang.String r14 = "not_equal"
            java.lang.String r15 = "less_than"
            r16 = r1
            java.lang.String r1 = "greater_than"
            r17 = r7
            java.lang.String r7 = "equal"
            switch(r13) {
                case 0: goto L_0x031f;
                case 1: goto L_0x0297;
                case 2: goto L_0x026b;
                case 3: goto L_0x022f;
                case 4: goto L_0x0223;
                case 5: goto L_0x01a0;
                case 6: goto L_0x010d;
                default: goto L_0x0105;
            }
        L_0x0105:
            r24 = r2
            r25 = r3
            r20 = r9
            goto L_0x03a6
        L_0x010d:
            java.lang.String r13 = r12.d
            long r18 = java.lang.Long.parseLong(r13)
            long r20 = com.instabug.library.core.InstabugCore.getLastSeenTimestamp()
            long r22 = com.instabug.library.util.TimeUtils.currentTimeMillis()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.DAYS
            r24 = r2
            r25 = r3
            long r2 = r22 - r20
            r20 = r9
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r13.convert(r2, r9)
            int r2 = (int) r2
            long r2 = (long) r2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "checkLastSeenTimestamp(condition: "
            r9.append(r13)
            r9.append(r12)
            java.lang.String r13 = "). daysSinceLastSeen: "
            r9.append(r13)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r9)
            java.lang.String r9 = r12.q
            r9.hashCode()
            int r12 = r9.hashCode()
            switch(r12) {
                case -1374681402: goto L_0x0171;
                case 96757556: goto L_0x0168;
                case 365984903: goto L_0x015f;
                case 1614662344: goto L_0x0156;
                default: goto L_0x0155;
            }
        L_0x0155:
            goto L_0x017a
        L_0x0156:
            boolean r1 = r9.equals(r14)
            if (r1 != 0) goto L_0x015d
            goto L_0x017a
        L_0x015d:
            r1 = 3
            goto L_0x017b
        L_0x015f:
            boolean r1 = r9.equals(r15)
            if (r1 != 0) goto L_0x0166
            goto L_0x017a
        L_0x0166:
            r1 = 2
            goto L_0x017b
        L_0x0168:
            boolean r1 = r9.equals(r7)
            if (r1 != 0) goto L_0x016f
            goto L_0x017a
        L_0x016f:
            r1 = 1
            goto L_0x017b
        L_0x0171:
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r1 = 0
            goto L_0x017b
        L_0x017a:
            r1 = -1
        L_0x017b:
            if (r1 == 0) goto L_0x019a
            r7 = 1
            if (r1 == r7) goto L_0x0194
            r7 = 2
            if (r1 == r7) goto L_0x018e
            r7 = 3
            if (r1 == r7) goto L_0x0188
            goto L_0x03a6
        L_0x0188:
            int r1 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x03a6
            goto L_0x039d
        L_0x018e:
            int r1 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r1 >= 0) goto L_0x03a6
            goto L_0x039d
        L_0x0194:
            int r1 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x03a6
            goto L_0x039d
        L_0x019a:
            int r1 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r1 <= 0) goto L_0x03a6
            goto L_0x039d
        L_0x01a0:
            r24 = r2
            r25 = r3
            r20 = r9
            com.instabug.library.settings.SettingsManager r2 = com.instabug.library.settings.SettingsManager.getInstance()
            int r2 = r2.getSessionsCount()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "checkSessionCountCondition(condition: "
            r3.append(r9)
            r3.append(r12)
            java.lang.String r9 = "). actualSessionCount: "
            r3.append(r9)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r3)
            java.lang.String r3 = r12.d
            if (r3 != 0) goto L_0x01d0
            goto L_0x03a6
        L_0x01d0:
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r9 = r12.q
            r9.hashCode()
            int r12 = r9.hashCode()
            switch(r12) {
                case -1374681402: goto L_0x01fc;
                case 96757556: goto L_0x01f3;
                case 365984903: goto L_0x01ea;
                case 1614662344: goto L_0x01e1;
                default: goto L_0x01e0;
            }
        L_0x01e0:
            goto L_0x0205
        L_0x01e1:
            boolean r1 = r9.equals(r14)
            if (r1 != 0) goto L_0x01e8
            goto L_0x0205
        L_0x01e8:
            r1 = 3
            goto L_0x0206
        L_0x01ea:
            boolean r1 = r9.equals(r15)
            if (r1 != 0) goto L_0x01f1
            goto L_0x0205
        L_0x01f1:
            r1 = 2
            goto L_0x0206
        L_0x01f3:
            boolean r1 = r9.equals(r7)
            if (r1 != 0) goto L_0x01fa
            goto L_0x0205
        L_0x01fa:
            r1 = 1
            goto L_0x0206
        L_0x01fc:
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r1 = 0
            goto L_0x0206
        L_0x0205:
            r1 = -1
        L_0x0206:
            if (r1 == 0) goto L_0x021f
            r7 = 1
            if (r1 == r7) goto L_0x021b
            r7 = 2
            if (r1 == r7) goto L_0x0217
            r7 = 3
            if (r1 == r7) goto L_0x0213
            goto L_0x03a6
        L_0x0213:
            if (r2 == r3) goto L_0x03a6
            goto L_0x039d
        L_0x0217:
            if (r2 >= r3) goto L_0x03a6
            goto L_0x039d
        L_0x021b:
            if (r2 != r3) goto L_0x03a6
            goto L_0x039d
        L_0x021f:
            if (r2 <= r3) goto L_0x03a6
            goto L_0x039d
        L_0x0223:
            r24 = r2
            r25 = r3
            r20 = r9
            boolean r1 = r0.f(r12)
            goto L_0x03a7
        L_0x022f:
            r24 = r2
            r25 = r3
            r20 = r9
            i0.j.f.l.i.b r1 = i0.j.f.l.i.b.a()
            if (r1 != 0) goto L_0x023d
            r1 = 0
            goto L_0x024a
        L_0x023d:
            i0.j.f.l.i.b r1 = i0.j.f.l.i.b.a()
            android.content.SharedPreferences r1 = r1.b
            java.lang.String r2 = "survey_resolve_country_code"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
        L_0x024a:
            java.lang.Class<i0.j.f.q.a> r2 = i0.j.f.q.a.class
            com.instabug.library.internal.storage.cache.Cacheable r1 = com.instabug.library.util.ObjectMapper.fromJson(r1, r2)
            i0.j.f.q.a r1 = (i0.j.f.q.a) r1
            if (r1 == 0) goto L_0x03a6
            java.lang.String r1 = r1.d
            java.lang.String r2 = r12.q
            r2.hashCode()
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0263
            goto L_0x03a6
        L_0x0263:
            java.lang.String r2 = r12.d
            boolean r1 = r2.equalsIgnoreCase(r1)
            goto L_0x03a7
        L_0x026b:
            r24 = r2
            r25 = r3
            r20 = r9
            java.lang.String r1 = com.instabug.library.core.InstabugCore.getIdentifiedUserEmail()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "validateUserEmail(condition: "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = "). userEmail: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r2)
            boolean r1 = r0.c(r12, r1)
            goto L_0x03a7
        L_0x0297:
            r24 = r2
            r25 = r3
            r20 = r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "validateOSApiLevel(condition: "
            r2.append(r3)
            r2.append(r12)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Build.VERSION.SDK_INT: "
            r2.append(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r2)
            java.lang.String r2 = r12.d
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r9 = r12.q
            r9.hashCode()
            int r12 = r9.hashCode()
            switch(r12) {
                case -1374681402: goto L_0x02f8;
                case 96757556: goto L_0x02ef;
                case 365984903: goto L_0x02e6;
                case 1614662344: goto L_0x02dd;
                default: goto L_0x02dc;
            }
        L_0x02dc:
            goto L_0x0301
        L_0x02dd:
            boolean r1 = r9.equals(r14)
            if (r1 != 0) goto L_0x02e4
            goto L_0x0301
        L_0x02e4:
            r1 = 3
            goto L_0x0302
        L_0x02e6:
            boolean r1 = r9.equals(r15)
            if (r1 != 0) goto L_0x02ed
            goto L_0x0301
        L_0x02ed:
            r1 = 2
            goto L_0x0302
        L_0x02ef:
            boolean r1 = r9.equals(r7)
            if (r1 != 0) goto L_0x02f6
            goto L_0x0301
        L_0x02f6:
            r1 = 1
            goto L_0x0302
        L_0x02f8:
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x02ff
            goto L_0x0301
        L_0x02ff:
            r1 = 0
            goto L_0x0302
        L_0x0301:
            r1 = -1
        L_0x0302:
            if (r1 == 0) goto L_0x031b
            r7 = 1
            if (r1 == r7) goto L_0x0317
            r7 = 2
            if (r1 == r7) goto L_0x0313
            r7 = 3
            if (r1 == r7) goto L_0x030f
            goto L_0x03a6
        L_0x030f:
            if (r3 == r2) goto L_0x03a6
            goto L_0x039d
        L_0x0313:
            if (r3 >= r2) goto L_0x03a6
            goto L_0x039d
        L_0x0317:
            if (r3 != r2) goto L_0x03a6
            goto L_0x039d
        L_0x031b:
            if (r3 <= r2) goto L_0x03a6
            goto L_0x039d
        L_0x031f:
            r24 = r2
            r25 = r3
            r20 = r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "validateAppVersion(condition: "
            r2.append(r3)
            r2.append(r12)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r2)
            java.lang.String r2 = r12.d
            java.lang.String r2 = r0.b(r2)
            java.lang.String r3 = r0.b
            java.lang.String r3 = r0.b(r3)
            if (r2 == 0) goto L_0x039f
            if (r3 != 0) goto L_0x034e
            goto L_0x03a6
        L_0x034e:
            int r2 = com.instabug.library.util.StringUtility.compareVersion(r3, r2)     // Catch:{ NumberFormatException -> 0x03a6 }
            java.lang.String r3 = r12.q
            r3.hashCode()
            int r9 = r3.hashCode()
            switch(r9) {
                case -1374681402: goto L_0x037a;
                case 96757556: goto L_0x0371;
                case 365984903: goto L_0x0368;
                case 1614662344: goto L_0x035f;
                default: goto L_0x035e;
            }
        L_0x035e:
            goto L_0x0383
        L_0x035f:
            boolean r1 = r3.equals(r14)
            if (r1 != 0) goto L_0x0366
            goto L_0x0383
        L_0x0366:
            r1 = 3
            goto L_0x0384
        L_0x0368:
            boolean r1 = r3.equals(r15)
            if (r1 != 0) goto L_0x036f
            goto L_0x0383
        L_0x036f:
            r1 = 2
            goto L_0x0384
        L_0x0371:
            boolean r1 = r3.equals(r7)
            if (r1 != 0) goto L_0x0378
            goto L_0x0383
        L_0x0378:
            r1 = 1
            goto L_0x0384
        L_0x037a:
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0381
            goto L_0x0383
        L_0x0381:
            r1 = 0
            goto L_0x0384
        L_0x0383:
            r1 = -1
        L_0x0384:
            if (r1 == 0) goto L_0x039a
            r3 = 1
            if (r1 == r3) goto L_0x0397
            r3 = 2
            if (r1 == r3) goto L_0x0393
            r3 = 3
            if (r1 == r3) goto L_0x0390
            goto L_0x03a6
        L_0x0390:
            if (r2 == 0) goto L_0x03a6
            goto L_0x039d
        L_0x0393:
            r1 = -1
            if (r2 != r1) goto L_0x03a6
            goto L_0x039d
        L_0x0397:
            if (r2 != 0) goto L_0x03a6
            goto L_0x039d
        L_0x039a:
            r1 = 1
            if (r2 != r1) goto L_0x03a6
        L_0x039d:
            r1 = 1
            goto L_0x03a7
        L_0x039f:
            java.lang.String r1 = r0.a
            boolean r1 = r0.c(r12, r1)
            goto L_0x03a7
        L_0x03a6:
            r1 = 0
        L_0x03a7:
            if (r11 != 0) goto L_0x03ab
        L_0x03a9:
            r10 = r1
            goto L_0x03b7
        L_0x03ab:
            java.lang.String r2 = "or"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x03b5
            r1 = r1 & r10
            goto L_0x03a9
        L_0x03b5:
            r1 = r1 | r10
            goto L_0x03a9
        L_0x03b7:
            int r11 = r11 + 1
            r1 = r16
            r7 = r17
            r9 = r20
            r2 = r24
            r3 = r25
            goto L_0x007e
        L_0x03c5:
            r16 = r1
            r24 = r2
            com.instabug.survey.f.c.i r1 = r3.a2
            com.instabug.survey.f.c.g r1 = r1.q
            java.util.ArrayList r1 = r1.c()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03d8
            goto L_0x03d9
        L_0x03d8:
            r10 = 1
        L_0x03d9:
            if (r10 == 0) goto L_0x03e7
            boolean r1 = r0.e(r3)
            if (r1 == 0) goto L_0x03e7
            r1 = r24
            r1.add(r3)
            goto L_0x03e9
        L_0x03e7:
            r1 = r24
        L_0x03e9:
            r2 = r1
            r1 = r16
            goto L_0x001f
        L_0x03ee:
            r1 = r2
            r2 = 0
            int r3 = r1.size()
            if (r3 != 0) goto L_0x049d
            r1 = 100
            java.util.List r1 = i0.j.f.b.a.a.c(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r7 = r1.size()
            if (r7 <= 0) goto L_0x049b
            java.util.Iterator r1 = r1.iterator()
        L_0x040d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x049b
            java.lang.Object r7 = r1.next()
            com.instabug.survey.e.c.a r7 = (com.instabug.survey.e.c.a) r7
            android.content.Context r8 = com.instabug.library.Instabug.getApplicationContext()
            if (r8 != 0) goto L_0x0420
            goto L_0x0484
        L_0x0420:
            android.content.Context r8 = com.instabug.library.Instabug.getApplicationContext()
            boolean r8 = com.instabug.library.internal.device.InstabugDeviceProperties.isFirstInstall(r8)
            if (r8 != 0) goto L_0x0484
            if (r7 != 0) goto L_0x0432
            java.lang.String r8 = "getTargetVersionCondition(announcement: null)"
            com.instabug.library.util.InstabugSDKLogger.i(r5, r8)
            goto L_0x047c
        L_0x0432:
            java.lang.String r8 = "getTargetVersionCondition(announcementId: "
            java.lang.StringBuilder r8 = i0.d.a.a.a.P0(r8)
            long r9 = r7.c
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r8)
            com.instabug.survey.f.c.i r8 = r7.a2
            com.instabug.survey.f.c.g r8 = r8.q
            java.util.ArrayList r8 = r8.c()
            java.util.Iterator r8 = r8.iterator()
        L_0x0453:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x047c
            java.lang.Object r9 = r8.next()
            com.instabug.survey.f.c.c r9 = (com.instabug.survey.f.c.c) r9
            java.lang.String r10 = r9.c
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x0453
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "condition: "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.instabug.library.util.InstabugSDKLogger.i(r5, r8)
            goto L_0x047d
        L_0x047c:
            r9 = r2
        L_0x047d:
            if (r9 == 0) goto L_0x0484
            boolean r8 = r0.f(r9)
            goto L_0x0485
        L_0x0484:
            r8 = 0
        L_0x0485:
            if (r8 == 0) goto L_0x040d
            boolean r8 = r0.e(r7)
            if (r8 == 0) goto L_0x040d
            int r8 = r7.Y1
            r9 = 1
            if (r8 != r9) goto L_0x0493
            goto L_0x0494
        L_0x0493:
            r9 = 0
        L_0x0494:
            if (r9 == 0) goto L_0x040d
            r3.add(r7)
            goto L_0x040d
        L_0x049b:
            r2 = r3
            goto L_0x049e
        L_0x049d:
            r2 = r1
        L_0x049e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.l.h.d():java.util.List");
    }

    public final boolean e(a aVar) {
        boolean e = aVar.e();
        InstabugSDKLogger.i("AnnouncementValidator", "validateShowingRepetition(announcement: " + aVar + "). ShouldShow ? " + e);
        return e;
    }

    public boolean f(c cVar) {
        InstabugSDKLogger.i("AnnouncementValidator", "validateAppVersion(condition: " + cVar + ")");
        String str = cVar.q;
        if (!str.equals("greater_than") && !str.equals("less_than")) {
            return c(cVar, this.b);
        }
        try {
            long parseLong = Long.parseLong(cVar.d);
            long c = i0.j.f.o.c.c();
            if (parseLong == -1) {
                return false;
            }
            if (c == -1) {
                return false;
            }
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1374681402) {
                if (hashCode == 365984903) {
                    if (str.equals("less_than")) {
                        c2 = 1;
                    }
                }
            } else if (str.equals("greater_than")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 == 1 && c < parseLong) {
                    return true;
                }
                return false;
            } else if (c > parseLong) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
