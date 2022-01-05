package com.instabug.survey.models;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ThankYouItem */
public class c implements Cacheable, Serializable {
    public String c;
    public String d;
    public String q;
    public String x;
    public boolean y;

    public static ArrayList<c> a(JSONArray jSONArray) throws JSONException {
        ArrayList<c> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                c cVar = new c();
                cVar.fromJson(jSONArray.getJSONObject(i).toString());
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static JSONArray b(ArrayList<c> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                jSONArray.put((Object) new JSONObject(arrayList.get(i).toJson()));
            }
        }
        return jSONArray;
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.d = jSONObject.optString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        this.q = jSONObject.optString(InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        this.x = jSONObject.optString("call_to_action");
        this.c = jSONObject.optString("user_class");
        this.y = jSONObject.optBoolean("appstore_enabled", false);
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        jSONObject.put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) str);
        String str3 = this.q;
        if (str3 == null) {
            str3 = str2;
        }
        jSONObject.put(InstabugDbContract.BugEntry.COLUMN_MESSAGE, (Object) str3);
        String str4 = this.c;
        if (str4 == null) {
            str4 = str2;
        }
        jSONObject.put("user_class", (Object) str4);
        String str5 = this.x;
        if (str5 != null) {
            str2 = str5;
        }
        jSONObject.put("call_to_action", (Object) str2);
        jSONObject.put("appstore_enabled", this.y);
        return jSONObject.toString();
    }
}
