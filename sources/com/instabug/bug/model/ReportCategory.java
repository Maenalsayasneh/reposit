package com.instabug.bug.model;

import com.instabug.library.util.StringUtility;
import i0.j.b.s.a;
import i0.j.b.s.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReportCategory {
    private static final String CATEGORY_ASK_A_QUESTION = "ask-a-question";
    private static final String CATEGORY_REPORT_A_PROBLEM = "report-a-problem";
    private static final String CATEGORY_SUGGEST_AN_IMPROVEMENT = "suggest-an-improvement";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_LABEL = "name";
    private static final String KEY_SLUG = "slug";
    private static final String KEY_SUBS = "subs";
    private static final String TAG = "ReportCategory";
    private String description;
    private int icon;
    private String label;
    private List<ReportCategory> subs;

    private ReportCategory() {
    }

    private static ReportCategory fromJsonObject(JSONObject jSONObject) throws JSONException {
        ReportCategory reportCategory = new ReportCategory();
        if (jSONObject.has("name")) {
            reportCategory.setLabel(jSONObject.getString("name"));
        }
        if (jSONObject.has("description")) {
            reportCategory.setDescription(jSONObject.getString("description"));
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(KEY_SUBS)) {
            JSONArray jSONArray = jSONObject.getJSONArray(KEY_SUBS);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(fromJsonObject(jSONArray.getJSONObject(i)));
            }
        }
        reportCategory.setSubs(arrayList);
        return reportCategory;
    }

    public static ReportCategory getInstance() {
        return new ReportCategory();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.instabug.bug.model.ReportCategory> getRemoteSubReportCategories(java.lang.String r7) {
        /*
            i0.j.b.s.a r0 = i0.j.b.s.a.h()
            java.util.Objects.requireNonNull(r0)
            i0.j.b.s.c r0 = i0.j.b.s.c.a()
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "ib_remote_report_categories"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x008b
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0083 }
            r1.<init>((java.lang.String) r0)     // Catch:{ JSONException -> 0x0083 }
            r0 = -1
            int r3 = r7.hashCode()     // Catch:{ JSONException -> 0x0083 }
            r4 = -191501435(0xfffffffff495eb85, float:-9.502309E31)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L_0x0046
            r4 = 97908(0x17e74, float:1.37198E-40)
            if (r3 == r4) goto L_0x003c
            r4 = 1621082316(0x609fc0cc, float:9.20914E19)
            if (r3 == r4) goto L_0x0032
            goto L_0x004f
        L_0x0032:
            java.lang.String r3 = "ask a question"
            boolean r7 = r7.equals(r3)     // Catch:{ JSONException -> 0x0083 }
            if (r7 == 0) goto L_0x004f
            r0 = r5
            goto L_0x004f
        L_0x003c:
            java.lang.String r3 = "bug"
            boolean r7 = r7.equals(r3)     // Catch:{ JSONException -> 0x0083 }
            if (r7 == 0) goto L_0x004f
            r0 = 0
            goto L_0x004f
        L_0x0046:
            java.lang.String r3 = "feedback"
            boolean r7 = r7.equals(r3)     // Catch:{ JSONException -> 0x0083 }
            if (r7 == 0) goto L_0x004f
            r0 = r6
        L_0x004f:
            if (r0 == 0) goto L_0x0074
            if (r0 == r6) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            goto L_0x008b
        L_0x0056:
            java.lang.String r7 = "ask-a-question"
            java.util.List r7 = getSubCategories(r1, r7)     // Catch:{ JSONException -> 0x0083 }
            if (r7 == 0) goto L_0x008b
            int r0 = r7.size()     // Catch:{ JSONException -> 0x0083 }
            if (r0 <= 0) goto L_0x008b
            return r7
        L_0x0065:
            java.lang.String r7 = "suggest-an-improvement"
            java.util.List r7 = getSubCategories(r1, r7)     // Catch:{ JSONException -> 0x0083 }
            if (r7 == 0) goto L_0x008b
            int r0 = r7.size()     // Catch:{ JSONException -> 0x0083 }
            if (r0 <= 0) goto L_0x008b
            return r7
        L_0x0074:
            java.lang.String r7 = "report-a-problem"
            java.util.List r7 = getSubCategories(r1, r7)     // Catch:{ JSONException -> 0x0083 }
            if (r7 == 0) goto L_0x008b
            int r0 = r7.size()     // Catch:{ JSONException -> 0x0083 }
            if (r0 <= 0) goto L_0x008b
            return r7
        L_0x0083:
            r7 = move-exception
            java.lang.String r0 = "ReportCategory"
            java.lang.String r1 = "error while getRemoteSubReportCategories"
            com.instabug.library.util.InstabugSDKLogger.e(r0, r1, r7)
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.model.ReportCategory.getRemoteSubReportCategories(java.lang.String):java.util.List");
    }

    private static List<ReportCategory> getSubCategories(JSONArray jSONArray, String str) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (str.equals(jSONArray.getJSONObject(i).getString(KEY_SLUG))) {
                return fromJsonObject(jSONArray.getJSONObject(i)).getSubs();
            }
        }
        return null;
    }

    public static List<ReportCategory> getSubReportCategories(String str) {
        List<ReportCategory> remoteSubReportCategories = getRemoteSubReportCategories(str);
        if (remoteSubReportCategories != null) {
            return remoteSubReportCategories;
        }
        Objects.requireNonNull(a.h());
        Objects.requireNonNull(b.a());
        return null;
    }

    public static boolean hasSubCategories(String str) {
        List<ReportCategory> remoteSubReportCategories = getRemoteSubReportCategories("bug");
        List<ReportCategory> remoteSubReportCategories2 = getRemoteSubReportCategories("feedback");
        List<ReportCategory> remoteSubReportCategories3 = getRemoteSubReportCategories("ask a question");
        if (remoteSubReportCategories != null && !remoteSubReportCategories.isEmpty() && str.equals("bug")) {
            return true;
        }
        if (remoteSubReportCategories2 != null && !remoteSubReportCategories2.isEmpty() && str.equals("feedback")) {
            return true;
        }
        if (remoteSubReportCategories3 != null && !remoteSubReportCategories3.isEmpty() && str.equals("ask a question")) {
            return true;
        }
        Objects.requireNonNull(a.h());
        Objects.requireNonNull(b.a());
        return false;
    }

    private void setSubs(List<ReportCategory> list) {
        this.subs = list;
    }

    public String getDescription() {
        return this.description;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getLabel() {
        return this.label;
    }

    public List<ReportCategory> getSubs() {
        return this.subs;
    }

    public void setDescription(String str) {
        this.description = StringUtility.ellipsize(str, 75);
    }

    public void setIcon(int i) {
        this.icon = i;
    }

    public void setLabel(String str) {
        this.label = StringUtility.ellipsize(str, 35);
    }

    public ReportCategory withIcon(int i) {
        this.icon = i;
        return this;
    }

    public ReportCategory withLabel(String str) {
        this.label = str;
        return this;
    }
}
