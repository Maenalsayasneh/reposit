package com.pubnub.api.models.consumer.presence;

import com.google.gson.JsonElement;
import i0.d.a.a.a;

public class PNHereNowOccupantData {
    private JsonElement state;
    private String uuid;

    public static class PNHereNowOccupantDataBuilder {
        private JsonElement state;
        private String uuid;

        public PNHereNowOccupantData build() {
            return new PNHereNowOccupantData(this.uuid, this.state);
        }

        public PNHereNowOccupantDataBuilder state(JsonElement jsonElement) {
            this.state = jsonElement;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNHereNowOccupantData.PNHereNowOccupantDataBuilder(uuid=");
            P0.append(this.uuid);
            P0.append(", state=");
            P0.append(this.state);
            P0.append(")");
            return P0.toString();
        }

        public PNHereNowOccupantDataBuilder uuid(String str) {
            this.uuid = str;
            return this;
        }
    }

    public PNHereNowOccupantData(String str, JsonElement jsonElement) {
        this.uuid = str;
        this.state = jsonElement;
    }

    public static PNHereNowOccupantDataBuilder builder() {
        return new PNHereNowOccupantDataBuilder();
    }

    public JsonElement getState() {
        return this.state;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNHereNowOccupantData(uuid=");
        P0.append(getUuid());
        P0.append(", state=");
        P0.append(getState());
        P0.append(")");
        return P0.toString();
    }
}
