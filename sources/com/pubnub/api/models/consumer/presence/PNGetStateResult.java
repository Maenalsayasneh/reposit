package com.pubnub.api.models.consumer.presence;

import com.google.gson.JsonElement;
import i0.d.a.a.a;
import java.util.Map;

public class PNGetStateResult {
    private Map<String, JsonElement> stateByUUID;

    public static class PNGetStateResultBuilder {
        private Map<String, JsonElement> stateByUUID;

        public PNGetStateResult build() {
            return new PNGetStateResult(this.stateByUUID);
        }

        public PNGetStateResultBuilder stateByUUID(Map<String, JsonElement> map) {
            this.stateByUUID = map;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNGetStateResult.PNGetStateResultBuilder(stateByUUID=");
            P0.append(this.stateByUUID);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNGetStateResult(Map<String, JsonElement> map) {
        this.stateByUUID = map;
    }

    public static PNGetStateResultBuilder builder() {
        return new PNGetStateResultBuilder();
    }

    public Map<String, JsonElement> getStateByUUID() {
        return this.stateByUUID;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNGetStateResult(stateByUUID=");
        P0.append(getStateByUUID());
        P0.append(")");
        return P0.toString();
    }
}
