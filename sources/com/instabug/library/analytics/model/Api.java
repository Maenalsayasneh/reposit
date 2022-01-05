package com.instabug.library.analytics.model;

import android.annotation.SuppressLint;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Api {
    private static final String KEY_COUNT = "count";
    private static final String KEY_IS_DEPRECATED = "is_deprecated";
    private static final String KEY_METHOD = "method";
    private static final String KEY_PARAMETERS = "parameters";
    private static final String KEY_TIME_STAMP = "time_stamp";
    private String apiName;
    private int count = 1;
    private boolean isDeprecated;
    private ArrayList<Parameter> parameters;
    private long timeStamp;

    public Api() {
        setTimeStamp(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
    }

    public String getApiName() {
        return this.apiName;
    }

    public int getCount() {
        return this.count;
    }

    public ArrayList<Parameter> getParameters() {
        ArrayList<Parameter> arrayList = this.parameters;
        return arrayList == null ? new ArrayList<>(0) : arrayList;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void incrementCount() {
        this.count++;
    }

    public boolean isDeprecated() {
        return this.isDeprecated;
    }

    public Api setApiName(String str) {
        this.apiName = str;
        return this;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public Api setDeprecated(boolean z) {
        this.isDeprecated = z;
        return this;
    }

    public Api setParameters(ArrayList<Parameter> arrayList) {
        this.parameters = arrayList;
        return this;
    }

    public Api setTimeStamp(long j) {
        this.timeStamp = j;
        return this;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_stamp", getTimeStamp()).put("method", (Object) getApiName()).put("is_deprecated", isDeprecated()).put("count", getCount()).put("parameters", (Object) Parameter.toJson(getParameters()));
        } catch (JSONException e) {
            InstabugSDKLogger.e(Api.class, e.getMessage(), e);
        }
        return jSONObject;
    }

    public static class Parameter {
        private static final String KEY_NAME = "name";
        private static final String KEY_TYPE = "type";
        private static final String KEY_VALUE = "value";
        private String name;
        private String type;
        private String value;

        public static Parameter fromJson(JSONObject jSONObject) {
            Parameter parameter = new Parameter();
            try {
                if (jSONObject.has("name")) {
                    parameter.name = jSONObject.getString("name");
                }
                if (jSONObject.has("type")) {
                    parameter.type = jSONObject.getString("type");
                }
                if (jSONObject.has("value")) {
                    parameter.value = jSONObject.getString("value");
                }
            } catch (JSONException e) {
                InstabugSDKLogger.e(Parameter.class, e.getMessage(), e);
            }
            return parameter;
        }

        public String getName() {
            return this.name;
        }

        public String getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }

        public Parameter setName(String str) {
            this.name = str;
            return this;
        }

        public Parameter setType(Class<?> cls) {
            this.type = cls.getSimpleName();
            return this;
        }

        public Parameter setValue(Object obj) {
            if (obj == null) {
                this.value = "null";
            } else {
                this.value = obj.toString();
            }
            return this;
        }

        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (getName() != null) {
                    jSONObject.put("name", (Object) getName());
                }
                if (getType() != null) {
                    jSONObject.put("type", (Object) getType());
                }
                if (getValue() != null) {
                    jSONObject.put("value", (Object) getValue());
                }
            } catch (JSONException e) {
                InstabugSDKLogger.e(Parameter.class, e.getMessage(), e);
            }
            return jSONObject;
        }

        public static ArrayList<Parameter> fromJson(JSONArray jSONArray) {
            ArrayList<Parameter> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(fromJson(jSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    InstabugSDKLogger.e(Parameter.class, e.getMessage(), e);
                }
            }
            return arrayList;
        }

        public static JSONArray toJson(ArrayList<Parameter> arrayList) {
            JSONArray jSONArray = new JSONArray();
            Iterator<Parameter> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((Object) it.next().toJson());
            }
            return jSONArray;
        }
    }

    public static JSONArray toJson(ArrayList<Api> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<Api> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((Object) it.next().toJson());
        }
        return jSONArray;
    }
}
