package com.instabug.library.util;

import com.instabug.library.internal.storage.cache.Cacheable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ObjectMapper {
    private static final String TAG = "ObjectMapper";

    public static <T extends Cacheable> T fromJson(String str, Class<T> cls) {
        Class<ObjectMapper> cls2 = ObjectMapper.class;
        if (str == null) {
            return null;
        }
        try {
            T t = (Cacheable) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            t.fromJson(str);
            return t;
        } catch (JSONException e) {
            InstabugSDKLogger.e(cls2, e.getMessage(), e);
            return null;
        } catch (NoSuchMethodException e2) {
            InstabugSDKLogger.e(cls2, "The object must have a public default constructor", e2);
            return null;
        } catch (IllegalAccessException e3) {
            InstabugSDKLogger.e(cls2, "The object must have a public default constructor", e3);
            return null;
        } catch (InstantiationException e4) {
            InstabugSDKLogger.e(cls2, "The object must have a public default constructor", e4);
            return null;
        } catch (InvocationTargetException e5) {
            InstabugSDKLogger.e(cls2, "The object must have a public default constructor", e5);
            return null;
        }
    }

    public static String toJson(Cacheable cacheable) {
        try {
            return cacheable.toJson();
        } catch (JSONException e) {
            InstabugSDKLogger.e(ObjectMapper.class, e.getMessage(), e);
            return null;
        }
    }

    public static JSONObject toJson(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException e) {
                InstabugSDKLogger.e(TAG, "JSONException", e);
            }
        }
        return jSONObject;
    }
}
