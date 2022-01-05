package com.instabug.survey.f.c;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Condition */
public class c implements Cacheable, Serializable {
    public String c;
    public String d;
    public String q;

    public static ArrayList<c> a(JSONArray jSONArray) throws JSONException {
        ArrayList<c> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            c cVar = new c();
            cVar.fromJson(jSONArray.getJSONObject(i).toString());
            arrayList.add(cVar);
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
        if (jSONObject.has(InstabugDbContract.UserAttributesEntry.COLUMN_KEY)) {
            this.c = jSONObject.getString(InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        }
        if (jSONObject.has(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE)) {
            this.d = jSONObject.getString(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        }
        if (jSONObject.has("operator")) {
            this.q = jSONObject.getString("operator");
        }
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InstabugDbContract.UserAttributesEntry.COLUMN_KEY, (Object) this.c).put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, (Object) this.d).put("operator", (Object) this.q);
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder P0 = a.P0("(key: ");
        P0.append(this.c);
        P0.append(") ");
        P0.append(this.q);
        P0.append(" (value: ");
        return a.y0(P0, this.d, ")");
    }
}
