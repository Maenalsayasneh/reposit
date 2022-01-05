package com.instabug.survey.e.c;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.f.c.b;
import com.instabug.survey.f.c.f;
import com.instabug.survey.f.c.g;
import com.instabug.survey.f.c.i;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Announcement */
public class a implements Cacheable, Serializable, i0.j.f.m.e.a {
    public int Y1 = 0;
    public b Z1 = new b();
    public i a2 = new i(1);
    public long c;
    public String d;
    public int q;
    public ArrayList<c> x;
    public boolean y = false;

    public void a(String str) {
        this.a2.q.Z1 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b() {
        /*
            r4 = this;
            com.instabug.survey.f.c.i r0 = r4.a2
            com.instabug.survey.f.c.g r0 = r0.q
            java.util.ArrayList<com.instabug.survey.f.c.a> r1 = r0.x
            if (r1 == 0) goto L_0x002d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x002d
            java.util.ArrayList<com.instabug.survey.f.c.a> r0 = r0.x
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.next()
            com.instabug.survey.f.c.a r1 = (com.instabug.survey.f.c.a) r1
            com.instabug.survey.f.c.a$a r2 = r1.c
            com.instabug.survey.f.c.a$a r3 = com.instabug.survey.f.c.a.C0111a.SUBMIT
            if (r2 == r3) goto L_0x002a
            com.instabug.survey.f.c.a$a r3 = com.instabug.survey.f.c.a.C0111a.DISMISS
            if (r2 != r3) goto L_0x0014
        L_0x002a:
            long r0 = r1.d
            return r0
        L_0x002d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.e.c.a.b():long");
    }

    public long c() {
        i iVar = this.a2;
        if (iVar.Z1 == 0) {
            long j = iVar.Y1;
            if (j != 0) {
                iVar.Z1 = j;
            }
        }
        return iVar.Z1;
    }

    public String d() {
        int i = this.q;
        if (i != 100) {
            return i != 101 ? "" : "UpdateMessage";
        }
        return "WhatsNew";
    }

    public boolean e() {
        i iVar = this.a2;
        g gVar = iVar.q;
        int i = gVar.Y1.c;
        boolean z = i == 2;
        boolean z2 = !iVar.d2;
        boolean z3 = !(i == 1);
        boolean z4 = ((int) TimeUnit.SECONDS.toDays((System.currentTimeMillis() / 1000) - c())) >= gVar.Y1.a();
        if (z || z2 || (z3 && z4)) {
            return true;
        }
        return false;
    }

    @SuppressFBWarnings({"NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION"})
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof a) && ((a) obj).c == this.c) {
            return true;
        }
        return false;
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("id")) {
            this.c = jSONObject.getLong("id");
        }
        if (jSONObject.has("type")) {
            this.q = jSONObject.getInt("type");
        }
        if (jSONObject.has(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE)) {
            this.d = jSONObject.getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        }
        if (jSONObject.has("events")) {
            this.a2.q.x = com.instabug.survey.f.c.a.a(jSONObject.getJSONArray("events"));
        }
        if (jSONObject.has("announcement_items")) {
            this.x = c.a(jSONObject.getJSONArray("announcement_items"));
        } else {
            this.x = new ArrayList<>();
        }
        if (jSONObject.has("target")) {
            this.a2.q.fromJson(jSONObject.getJSONObject("target").toString().replace("\\", ""));
        }
        if (jSONObject.has("answered")) {
            this.a2.y = jSONObject.getBoolean("answered");
        }
        if (jSONObject.has("is_cancelled")) {
            this.a2.a2 = jSONObject.getBoolean("is_cancelled");
        }
        if (jSONObject.has("announcement_state")) {
            this.a2.g2 = f.valueOf(jSONObject.getString("announcement_state"));
        }
        if (jSONObject.has("session_counter")) {
            this.a2.e2 = jSONObject.getInt("session_counter");
        }
        if (jSONObject.has("dismissed_at")) {
            this.a2.Y1 = (long) jSONObject.getInt("dismissed_at");
        }
        this.Z1.b(jSONObject);
    }

    public long getSurveyId() {
        return this.c;
    }

    public i getUserInteraction() {
        return this.a2;
    }

    public int hashCode() {
        return String.valueOf(this.c).hashCode();
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.c).put("type", this.q).put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) this.d).put("announcement_items", (Object) c.b(this.x)).put("target", (Object) g.a(this.a2.q)).put("events", (Object) com.instabug.survey.f.c.a.b(this.a2.q.x)).put("answered", this.a2.y).put("dismissed_at", this.a2.Y1).put("is_cancelled", this.a2.a2).put("announcement_state", (Object) this.a2.g2.toString()).put("should_show_again", e()).put("session_counter", this.a2.e2);
        this.Z1.d(jSONObject);
        return jSONObject.toString();
    }

    public String toString() {
        try {
            return toJson();
        } catch (JSONException e) {
            InstabugSDKLogger.e("Announcement", e.getMessage(), e);
            return super.toString();
        }
    }
}
