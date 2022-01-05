package com.instabug.library.model.session;

import androidx.annotation.Keep;
import java.util.Collections;
import java.util.Map;

@Keep
public class SessionRemoteEntity {
    private final String id;
    private final Map<String, Object> map;

    public SessionRemoteEntity(String str, Map<String, Object> map2) {
        this.id = str;
        this.map = map2;
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMap() {
        return Collections.unmodifiableMap(this.map);
    }
}
