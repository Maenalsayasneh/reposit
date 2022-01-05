package com.pubnub.api.models.consumer.pubsub.objects;

import com.google.gson.JsonElement;
import i0.d.a.a.a;

public class ObjectPayload {
    private JsonElement data;
    private String event;
    private String source;
    private String type;
    private String version;

    public boolean canEqual(Object obj) {
        return obj instanceof ObjectPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectPayload)) {
            return false;
        }
        ObjectPayload objectPayload = (ObjectPayload) obj;
        if (!objectPayload.canEqual(this)) {
            return false;
        }
        String source2 = getSource();
        String source3 = objectPayload.getSource();
        if (source2 != null ? !source2.equals(source3) : source3 != null) {
            return false;
        }
        String version2 = getVersion();
        String version3 = objectPayload.getVersion();
        if (version2 != null ? !version2.equals(version3) : version3 != null) {
            return false;
        }
        String event2 = getEvent();
        String event3 = objectPayload.getEvent();
        if (event2 != null ? !event2.equals(event3) : event3 != null) {
            return false;
        }
        String type2 = getType();
        String type3 = objectPayload.getType();
        if (type2 != null ? !type2.equals(type3) : type3 != null) {
            return false;
        }
        JsonElement data2 = getData();
        JsonElement data3 = objectPayload.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    public JsonElement getData() {
        return this.data;
    }

    public String getEvent() {
        return this.event;
    }

    public String getSource() {
        return this.source;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String source2 = getSource();
        int i = 43;
        int hashCode = source2 == null ? 43 : source2.hashCode();
        String version2 = getVersion();
        int hashCode2 = ((hashCode + 59) * 59) + (version2 == null ? 43 : version2.hashCode());
        String event2 = getEvent();
        int hashCode3 = (hashCode2 * 59) + (event2 == null ? 43 : event2.hashCode());
        String type2 = getType();
        int hashCode4 = (hashCode3 * 59) + (type2 == null ? 43 : type2.hashCode());
        JsonElement data2 = getData();
        int i2 = hashCode4 * 59;
        if (data2 != null) {
            i = data2.hashCode();
        }
        return i2 + i;
    }

    public void setData(JsonElement jsonElement) {
        this.data = jsonElement;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ObjectPayload(source=");
        P0.append(getSource());
        P0.append(", version=");
        P0.append(getVersion());
        P0.append(", event=");
        P0.append(getEvent());
        P0.append(", type=");
        P0.append(getType());
        P0.append(", data=");
        P0.append(getData());
        P0.append(")");
        return P0.toString();
    }
}
