package com.instabug.library.model;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UserAttributes implements Cacheable, Serializable {
    public static final String KEY_TTL = "ttl";
    public static final String KEY_USER_ATTRIBUTES = "user_attributes";
    private static final String TAG = "UserAttributes";
    private long ttl;
    private HashMap<String, String> userAttributesMap;

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.ttl = jSONObject.getLong(KEY_TTL);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user_attributes");
        Iterator<String> keys = jSONObject2.keys();
        this.userAttributesMap = new HashMap<>();
        while (keys.hasNext()) {
            String next = keys.next();
            this.userAttributesMap.put(next, jSONObject2.optString(next));
        }
    }

    public String get(String str) {
        HashMap<String, String> hashMap = this.userAttributesMap;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(str);
    }

    public HashMap<String, String> getMap() {
        return this.userAttributesMap;
    }

    public long getTtl() {
        return this.ttl;
    }

    public String keysAsStringJsonArray() {
        JSONArray jSONArray = new JSONArray();
        HashMap<String, String> hashMap = this.userAttributesMap;
        if (hashMap != null) {
            for (String put : hashMap.keySet()) {
                jSONArray.put((Object) put);
            }
        }
        return jSONArray.toString();
    }

    public UserAttributes put(String str, String str2) {
        if (this.userAttributesMap == null) {
            this.userAttributesMap = new HashMap<>();
        }
        this.userAttributesMap.put(str, str2);
        return this;
    }

    public void putMap(HashMap<String, String> hashMap) {
        this.userAttributesMap = hashMap;
    }

    public void remove(String str) {
        HashMap<String, String> hashMap = this.userAttributesMap;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        HashMap<String, String> hashMap = this.userAttributesMap;
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                jSONObject2.put((String) next.getKey(), next.getValue());
            }
        }
        return jSONObject.put(KEY_TTL, this.ttl).put("user_attributes", (Object) jSONObject2).toString();
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap<String, String> hashMap = this.userAttributesMap;
            if (hashMap != null) {
                for (Map.Entry next : hashMap.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            InstabugSDKLogger.e(TAG, e.getMessage(), e);
            return "{}";
        }
    }
}
