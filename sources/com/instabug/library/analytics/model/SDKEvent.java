package com.instabug.library.analytics.model;

import android.annotation.SuppressLint;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SDKEvent {
    private static final String KEY_EVENT_NAME = "event_name";
    private static final String KEY_EXTRA_ATTRIBUTES = "extra_attributes";
    private static final String KEY_TIME_STAMP = "time_stamp";
    private String eventName;
    private ArrayList<ExtraAttribute> extraAttributes;
    private long timeStamp;

    public String getEventName() {
        return this.eventName;
    }

    public ArrayList<ExtraAttribute> getExtraAttributes() {
        return this.extraAttributes;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public SDKEvent setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public SDKEvent setExtraAttributes(ArrayList<ExtraAttribute> arrayList) {
        this.extraAttributes = arrayList;
        return this;
    }

    public SDKEvent setTimeStamp(long j) {
        this.timeStamp = j;
        return this;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public JSONObject toJson() {
        ArrayList<ExtraAttribute> arrayList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (getExtraAttributes() == null) {
                arrayList = new ArrayList<>(0);
            } else {
                arrayList = getExtraAttributes();
            }
            jSONObject.put("time_stamp", getTimeStamp()).put(KEY_EVENT_NAME, (Object) getEventName()).put("extra_attributes", (Object) ExtraAttribute.toJson(arrayList));
        } catch (JSONException e) {
            InstabugSDKLogger.e(SDKEvent.class, e.getMessage(), e);
        }
        return jSONObject;
    }

    public static class ExtraAttribute {
        private static final String KEY_KEY = "key";
        private static final String KEY_VALUE = "value";
        private String key;
        private String value;

        public static ExtraAttribute fromJson(JSONObject jSONObject) {
            ExtraAttribute extraAttribute = new ExtraAttribute();
            try {
                if (jSONObject.has("key")) {
                    extraAttribute.setKey(jSONObject.getString("key"));
                }
                if (jSONObject.has("value")) {
                    extraAttribute.setValue(jSONObject.getString("value"));
                }
            } catch (JSONException e) {
                InstabugSDKLogger.e(SDKEvent.class, e.getMessage(), e);
            }
            return extraAttribute;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public ExtraAttribute setKey(String str) {
            this.key = str;
            return this;
        }

        public ExtraAttribute setValue(String str) {
            this.value = str;
            return this;
        }

        @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", (Object) getKey()).put("value", (Object) getValue());
            } catch (JSONException e) {
                InstabugSDKLogger.e(SDKEvent.class, e.getMessage(), e);
            }
            return jSONObject;
        }

        public static JSONArray toJson(ArrayList<ExtraAttribute> arrayList) {
            JSONArray jSONArray = new JSONArray();
            Iterator<ExtraAttribute> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((Object) it.next().toJson());
            }
            return jSONArray;
        }

        public static ArrayList<ExtraAttribute> fromJson(JSONArray jSONArray) {
            ArrayList<ExtraAttribute> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(fromJson(jSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    InstabugSDKLogger.e(SDKEvent.class, e.getMessage(), e);
                }
            }
            return arrayList;
        }
    }

    public static JSONArray toJson(ArrayList<SDKEvent> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<SDKEvent> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((Object) it.next().toJson());
        }
        return jSONArray;
    }
}
