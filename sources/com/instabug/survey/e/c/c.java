package com.instabug.survey.e.c;

import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AnnouncementItem */
public class c implements Serializable, Cacheable {
    public ArrayList<String> Y1;
    public int Z1;
    public boolean a2;
    public b b2;
    public String c;
    public String d;
    public String q;
    public long x;
    public ArrayList<e> y;

    public static ArrayList<c> a(JSONArray jSONArray) throws JSONException {
        ArrayList<c> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                c cVar = new c();
                cVar.fromJson(jSONObject.toString());
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static JSONArray b(ArrayList<c> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            Iterator<c> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((Object) new JSONObject(it.next().toJson()));
            }
        }
        return jSONArray;
    }

    public String c() {
        int i = this.Z1;
        if (i != 100) {
            return i != 101 ? "" : "UpdateMessage";
        }
        return "WhatsNew";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.instabug.survey.e.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.instabug.survey.e.c.d} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fromJson(java.lang.String r6) throws org.json.JSONException {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>((java.lang.String) r6)
            java.lang.String r6 = "id"
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x0013
            long r1 = r0.getLong(r6)
            r5.x = r1
        L_0x0013:
            java.lang.String r6 = "title"
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x0021
            java.lang.String r6 = r0.getString(r6)
            r5.c = r6
        L_0x0021:
            java.lang.String r6 = "description"
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x002f
            java.lang.String r6 = r0.getString(r6)
            r5.d = r6
        L_0x002f:
            java.lang.String r6 = "options"
            boolean r1 = r0.has(r6)
            r2 = 0
            if (r1 == 0) goto L_0x0054
            org.json.JSONArray r6 = r0.getJSONArray(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = r2
        L_0x0042:
            int r4 = r6.length()
            if (r3 >= r4) goto L_0x0052
            java.lang.String r4 = r6.getString(r3)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x0042
        L_0x0052:
            r5.Y1 = r1
        L_0x0054:
            java.lang.String r6 = "features"
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x0083
            org.json.JSONArray r6 = r0.getJSONArray(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0065:
            int r3 = r6.length()
            if (r2 >= r3) goto L_0x0081
            org.json.JSONObject r3 = r6.getJSONObject(r2)
            com.instabug.survey.e.c.e r4 = new com.instabug.survey.e.c.e
            r4.<init>()
            java.lang.String r3 = r3.toString()
            r4.fromJson(r3)
            r1.add(r4)
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0081:
            r5.y = r1
        L_0x0083:
            java.lang.String r6 = "type"
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x0091
            int r6 = r0.getInt(r6)
            r5.Z1 = r6
        L_0x0091:
            java.lang.String r6 = "answer"
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x009f
            java.lang.String r6 = r0.getString(r6)
            r5.q = r6
        L_0x009f:
            java.lang.String r6 = "config"
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x00cf
            org.json.JSONObject r6 = r0.getJSONObject(r6)
            r0 = 0
            if (r6 != 0) goto L_0x00af
            goto L_0x00cd
        L_0x00af:
            com.instabug.survey.e.c.b r1 = new com.instabug.survey.e.c.b
            r1.<init>()
            java.lang.String r2 = "download_links"
            org.json.JSONObject r6 = r6.getJSONObject(r2)     // Catch:{ JSONException -> 0x00cc }
            if (r6 != 0) goto L_0x00bd
            goto L_0x00ca
        L_0x00bd:
            com.instabug.survey.e.c.d r0 = new com.instabug.survey.e.c.d     // Catch:{ JSONException -> 0x00cc }
            r0.<init>()     // Catch:{ JSONException -> 0x00cc }
            java.lang.String r2 = "android"
            java.lang.String r6 = r6.optString(r2)     // Catch:{ JSONException -> 0x00cc }
            r0.c = r6     // Catch:{ JSONException -> 0x00cc }
        L_0x00ca:
            r1.c = r0     // Catch:{ JSONException -> 0x00cc }
        L_0x00cc:
            r0 = r1
        L_0x00cd:
            r5.b2 = r0
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.e.c.c.fromJson(java.lang.String):void");
    }

    public String toJson() throws JSONException {
        JSONArray jSONArray;
        d dVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("id", this.x);
        String str = this.c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        JSONObject put2 = put.put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) str);
        ArrayList<String> arrayList = this.Y1;
        if (arrayList == null) {
            jSONArray = new JSONArray();
        }
        JSONObject put3 = put2.put("options", (Object) jSONArray);
        ArrayList<e> arrayList2 = this.y;
        JSONArray jSONArray2 = new JSONArray();
        if (arrayList2 != null) {
            Iterator<e> it = arrayList2.iterator();
            while (it.hasNext()) {
                jSONArray2.put((Object) new JSONObject(it.next().toJson()));
            }
        }
        JSONObject put4 = put3.put(SDKCoreEvent.Feature.TYPE_FEATURES, (Object) jSONArray2).put("type", this.Z1);
        String str3 = this.q;
        if (str3 == null) {
            str3 = str2;
        }
        JSONObject put5 = put4.put("answer", (Object) str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        JSONObject put6 = put5.put(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, (Object) str2).put("type", this.Z1);
        b bVar = this.b2;
        JSONObject jSONObject2 = new JSONObject();
        if (!(bVar == null || (dVar = bVar.c) == null)) {
            JSONObject jSONObject3 = new JSONObject();
            String str5 = dVar.c;
            if (str5 != null) {
                jSONObject3.put("android", (Object) str5);
            }
            jSONObject2.put("download_links", (Object) jSONObject3);
        }
        put6.put("config", (Object) jSONObject2);
        return jSONObject.toString();
    }
}
