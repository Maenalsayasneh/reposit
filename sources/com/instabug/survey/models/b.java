package com.instabug.survey.models;

import android.text.TextUtils;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.TimeUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Question */
public class b implements Cacheable, Serializable {
    public long Y1;
    public long c = -1;
    public String d;
    public int q = -1;
    public ArrayList<String> x;
    public String y;

    public static ArrayList<b> a(JSONArray jSONArray) throws JSONException {
        ArrayList<b> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                b bVar = new b();
                bVar.fromJson(jSONArray.getJSONObject(i).toString());
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static JSONArray c(ArrayList<b> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                jSONArray.put((Object) new JSONObject(arrayList.get(i).toJson()));
            }
        }
        return jSONArray;
    }

    public void b(String str) {
        this.y = str;
        if (str != null && !TextUtils.isEmpty(str)) {
            this.Y1 = TimeUtils.currentTimeSeconds();
        }
    }

    public void fromJson(String str) throws JSONException {
        InstabugSDKLogger.d(this, str);
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("id")) {
            this.c = jSONObject.getLong("id");
        }
        if (jSONObject.has(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE)) {
            this.d = jSONObject.getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        }
        if (jSONObject.has("type")) {
            this.q = jSONObject.getInt("type");
        }
        if (jSONObject.has("options")) {
            JSONArray jSONArray = jSONObject.getJSONArray("options");
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(String.valueOf(jSONArray.get(i)));
            }
            this.x = arrayList;
        }
        if (jSONObject.has("answer")) {
            b(jSONObject.getString("answer"));
        }
        if (jSONObject.has("answered_at")) {
            this.Y1 = jSONObject.getLong("answered_at");
        }
    }

    public String toJson() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("id", this.c).put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) this.d).put("type", this.q);
        ArrayList<String> arrayList = this.x;
        if (arrayList == null) {
            jSONArray = new JSONArray();
        }
        JSONObject put2 = put.put("options", (Object) jSONArray);
        String str = this.y;
        if (str == null) {
            str = "";
        }
        put2.put("answer", (Object) str).put("answered_at", this.Y1);
        return jSONObject.toString();
    }
}
