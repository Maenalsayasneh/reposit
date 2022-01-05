package com.instabug.featuresrequest.d;

import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.user.UserManagerWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeatureRequestResponse */
public class c implements Cacheable, Serializable {
    public int c;
    public boolean d;
    public List<b> q = new ArrayList();

    public void fromJson(String str) throws JSONException {
        InstabugSDKLogger.addVerboseLog("FeatureRequestResponse", str);
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("completed_features_count")) {
            this.c = jSONObject.getInt("completed_features_count");
        }
        if (jSONObject.has("has_next_page")) {
            this.d = jSONObject.getBoolean("has_next_page");
        }
        if (jSONObject.has("feature_reqs")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("feature_reqs");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i));
                b bVar = new b(UserManagerWrapper.getUserName(), UserManagerWrapper.getUserEmail(), InstabugCore.getPushNotificationToken());
                bVar.fromJson(jSONObject2.toString());
                arrayList.add(bVar);
            }
            this.q = arrayList;
        }
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (b json : this.q) {
            jSONArray.put((Object) json.toJson());
        }
        jSONObject.put("has_next_page", this.d).put("completed_features_count", this.c).put("feature_reqs", (Object) jSONArray);
        return jSONObject.toString();
    }
}
