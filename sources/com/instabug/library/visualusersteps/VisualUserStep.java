package com.instabug.library.visualusersteps;

import android.annotation.SuppressLint;
import com.instabug.library.model.StepType;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

@SuppressFBWarnings({"NM_METHOD_NAMING_CONVENTION"})
public class VisualUserStep implements Serializable {
    private static final String KEY_BUTTON_ICON = "button_icon";
    private static final String KEY_DATE = "date";
    private static final String KEY_EVENT_TYPE = "event_type";
    private static final String KEY_IS_CONTAIN_ICON = "is_contains";
    private static final String KEY_PARENT_SCREEN_ID = "parent_screen_identifier";
    private static final String KEY_SCREENSHOT_ID = "screenshot_identifier";
    private static final String KEY_SCREEN_ID = "screen_identifier";
    private static final String KEY_SCREEN_NAME = "screen_name";
    private static final String KEY_VIEW = "view";
    private static final String KEY_VIEW_ORIENTATION = "orientation";
    private String buttonIcon;
    private long date;
    private boolean isContainIcon;
    private String orientation;
    private String parentScreenId;
    private String screenId;
    private String screenName;
    private String screenshotId;
    private String stepType;
    private String view;

    public static final class b {
        public long a = System.currentTimeMillis();
        public boolean b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;

        public b(String str, a aVar) {
            this.j = str;
        }

        public VisualUserStep a() {
            return new VisualUserStep(this);
        }
    }

    public static b Builder(String str) {
        return new b(str, (a) null);
    }

    public static ArrayList<VisualUserStep> fromJson(JSONArray jSONArray) throws JSONException {
        ArrayList<VisualUserStep> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(fromJsonObject(jSONArray.getJSONObject(i)));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        if (r15.equals("landscape") == false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instabug.library.visualusersteps.VisualUserStep fromJsonObject(org.json.JSONObject r15) throws org.json.JSONException {
        /*
            java.lang.String r0 = "event_type"
            boolean r1 = r15.has(r0)
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = org.json.JSONObject.NULL
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r15.getString(r0)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0021
            java.lang.String r0 = r15.getString(r0)
            java.lang.String r0 = r0.toUpperCase()
            goto L_0x0023
        L_0x0021:
            java.lang.String r0 = "UNKNOWN"
        L_0x0023:
            java.lang.String r1 = "screen_name"
            boolean r2 = r15.has(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0031
            java.lang.String r1 = r15.getString(r1)
            goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            java.lang.String r2 = "screen_identifier"
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x003f
            java.lang.String r2 = r15.getString(r2)
            goto L_0x0040
        L_0x003f:
            r2 = r3
        L_0x0040:
            java.lang.String r4 = "screenshot_identifier"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x004d
            java.lang.String r4 = r15.getString(r4)
            goto L_0x004e
        L_0x004d:
            r4 = r3
        L_0x004e:
            java.lang.String r5 = "date"
            boolean r6 = r15.has(r5)
            if (r6 == 0) goto L_0x005b
            java.lang.String r5 = r15.getString(r5)
            goto L_0x005c
        L_0x005b:
            r5 = r3
        L_0x005c:
            java.lang.String r6 = "parent_screen_identifier"
            boolean r7 = r15.has(r6)
            if (r7 == 0) goto L_0x0069
            java.lang.String r6 = r15.getString(r6)
            goto L_0x006a
        L_0x0069:
            r6 = r3
        L_0x006a:
            java.lang.String r7 = "is_contains"
            boolean r8 = r15.has(r7)
            r9 = 0
            if (r8 == 0) goto L_0x0078
            boolean r7 = r15.getBoolean(r7)
            goto L_0x0079
        L_0x0078:
            r7 = r9
        L_0x0079:
            java.lang.String r8 = "button_icon"
            boolean r10 = r15.has(r8)
            if (r10 == 0) goto L_0x0086
            java.lang.String r8 = r15.getString(r8)
            goto L_0x0087
        L_0x0086:
            r8 = r3
        L_0x0087:
            java.lang.String r10 = "view"
            boolean r11 = r15.has(r10)
            if (r11 == 0) goto L_0x0094
            java.lang.String r10 = r15.getString(r10)
            goto L_0x0095
        L_0x0094:
            r10 = r3
        L_0x0095:
            java.lang.String r11 = "orientation"
            boolean r12 = r15.has(r11)
            java.lang.String r13 = "landscape"
            java.lang.String r14 = "portrait"
            if (r12 == 0) goto L_0x00ca
            java.lang.String r15 = r15.getString(r11)
            r3 = -1
            int r11 = r15.hashCode()
            r12 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r11 == r12) goto L_0x00bc
            r12 = 1430647483(0x5545f2bb, float:1.36028944E13)
            if (r11 == r12) goto L_0x00b5
            goto L_0x00c4
        L_0x00b5:
            boolean r15 = r15.equals(r13)
            if (r15 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00bc:
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L_0x00c4
            r9 = 2
            goto L_0x00c5
        L_0x00c4:
            r9 = r3
        L_0x00c5:
            if (r9 == 0) goto L_0x00c9
            r3 = r14
            goto L_0x00ca
        L_0x00c9:
            r3 = r13
        L_0x00ca:
            if (r10 != 0) goto L_0x00ce
            java.lang.String r10 = ""
        L_0x00ce:
            com.instabug.library.visualusersteps.VisualUserStep$b r15 = Builder(r0)
            r15.d = r1
            r15.e = r4
            if (r5 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            java.lang.String r5 = "0"
        L_0x00db:
            long r0 = java.lang.Long.parseLong(r5)
            r15.a = r0
            r15.c = r6
            r15.g = r10
            r15.h = r3
            r15.f = r2
            r15.b = r7
            r15.i = r8
            com.instabug.library.visualusersteps.VisualUserStep r15 = r15.a()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.visualusersteps.VisualUserStep.fromJsonObject(org.json.JSONObject):com.instabug.library.visualusersteps.VisualUserStep");
    }

    private String getButtonIcon() {
        return this.buttonIcon;
    }

    private boolean isContainIcon() {
        return this.isContainIcon;
    }

    private void setScreenName(String str) {
        this.screenName = str;
    }

    private void setStepType(String str) {
        this.stepType = str;
    }

    public static String toJsonString(ArrayList<VisualUserStep> arrayList) {
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<VisualUserStep> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((Object) it.next().toJson());
            }
        }
        return jSONArray.toString();
    }

    public long getDate() {
        return this.date;
    }

    public String getParentScreenId() {
        return this.parentScreenId;
    }

    public String getScreenId() {
        return this.screenId;
    }

    public String getScreenName() {
        return this.screenName;
    }

    public String getScreenshotId() {
        return this.screenshotId;
    }

    public String getStepType() {
        return this.stepType;
    }

    public String getView() {
        return this.view;
    }

    public String getViewOrientation() {
        return this.orientation;
    }

    public boolean hasScreenshot() {
        return this.screenshotId != null;
    }

    public void setButtonIcon(String str) {
        this.buttonIcon = str;
    }

    public void setContainIcon(boolean z) {
        this.isContainIcon = z;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setParentScreenId(String str) {
        this.parentScreenId = str;
    }

    public void setScreenId(String str) {
        this.screenId = str;
    }

    public void setScreenshotId(String str) {
        this.screenshotId = str;
    }

    public void setView(String str) {
        this.view = str;
    }

    public void setViewOrientation(String str) {
        this.orientation = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[Catch:{ JSONException -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ JSONException -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066 A[Catch:{ JSONException -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083 A[Catch:{ JSONException -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00af A[Catch:{ JSONException -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cc A[Catch:{ JSONException -> 0x00f4 }] */
    @android.annotation.SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject toJson() {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "parent_screen_identifier"
            java.lang.String r2 = r6.getParentScreenId()     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r3 = "null"
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r6.getParentScreenId()     // Catch:{ JSONException -> 0x00f4 }
            boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            java.lang.String r2 = r6.getParentScreenId()     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x0021
        L_0x001f:
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00f4 }
        L_0x0021:
            r0.put((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "screen_name"
            java.lang.String r2 = r6.getScreenName()     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x003c
            java.lang.String r2 = r6.getScreenName()     // Catch:{ JSONException -> 0x00f4 }
            boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            java.lang.String r2 = r6.getScreenName()     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x003e
        L_0x003c:
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00f4 }
        L_0x003e:
            r0.put((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "screenshot_identifier"
            java.lang.String r2 = r6.getScreenshotId()     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x0059
            java.lang.String r2 = r6.getScreenshotId()     // Catch:{ JSONException -> 0x00f4 }
            boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            java.lang.String r2 = r6.getScreenshotId()     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x005b
        L_0x0059:
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00f4 }
        L_0x005b:
            r0.put((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "screen_identifier"
            java.lang.String r2 = r6.getScreenId()     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = r6.getScreenId()     // Catch:{ JSONException -> 0x00f4 }
            boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            java.lang.String r2 = r6.getScreenId()     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x0078
        L_0x0076:
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00f4 }
        L_0x0078:
            r0.put((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "event_type"
            java.lang.String r2 = r6.getStepType()     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = r6.getStepType()     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r4 = "UNKNOWN"
            boolean r2 = r2.equals(r4)     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x0090
            goto L_0x0099
        L_0x0090:
            java.lang.String r2 = r6.getStepType()     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x009b
        L_0x0099:
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00f4 }
        L_0x009b:
            r0.put((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "date"
            long r4 = r6.getDate()     // Catch:{ JSONException -> 0x00f4 }
            r0.put((java.lang.String) r1, (long) r4)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "view"
            java.lang.String r2 = r6.getView()     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = r6.getView()     // Catch:{ JSONException -> 0x00f4 }
            boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x00ba
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r2 = r6.getView()     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x00c1
        L_0x00bf:
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00f4 }
        L_0x00c1:
            r0.put((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "orientation"
            java.lang.String r2 = r6.getViewOrientation()     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x00dc
            java.lang.String r2 = r6.getViewOrientation()     // Catch:{ JSONException -> 0x00f4 }
            boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x00f4 }
            if (r2 == 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            java.lang.String r2 = r6.getViewOrientation()     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x00de
        L_0x00dc:
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00f4 }
        L_0x00de:
            r0.put((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "is_contains"
            boolean r2 = r6.isContainIcon()     // Catch:{ JSONException -> 0x00f4 }
            r0.put((java.lang.String) r1, (boolean) r2)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r1 = "button_icon"
            java.lang.String r2 = r6.getButtonIcon()     // Catch:{ JSONException -> 0x00f4 }
            r0.put((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x00f8
        L_0x00f4:
            r1 = move-exception
            r1.printStackTrace()
        L_0x00f8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.visualusersteps.VisualUserStep.toJson():org.json.JSONObject");
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("VisualUserStep{parentScreenId='");
        i0.d.a.a.a.r(P0, this.parentScreenId, '\'', ", screenName='");
        i0.d.a.a.a.r(P0, this.screenName, '\'', ", screenshotId='");
        i0.d.a.a.a.r(P0, this.screenshotId, '\'', ", screenId='");
        i0.d.a.a.a.r(P0, this.screenId, '\'', ", eventType='");
        i0.d.a.a.a.r(P0, this.stepType, '\'', ", date=");
        P0.append(this.date);
        P0.append(", view='");
        P0.append(this.view);
        P0.append('\'');
        P0.append('}');
        return P0.toString();
    }

    private VisualUserStep(b bVar) {
        this.stepType = StepType.UNKNOWN;
        setParentScreenId(bVar.c);
        setScreenName(bVar.d);
        setScreenshotId(bVar.e);
        setScreenId(bVar.f);
        setStepType(bVar.j);
        setDate(bVar.a);
        setView(bVar.g);
        setViewOrientation(bVar.h);
        setButtonIcon(bVar.i);
        setContainIcon(bVar.b);
    }
}
