package com.pubnub.api.models.consumer.presence;

import com.google.gson.JsonElement;
import i0.d.a.a.a;

public class PNSetStateResult {
    private JsonElement state;

    public static class PNSetStateResultBuilder {
        private JsonElement state;

        public PNSetStateResult build() {
            return new PNSetStateResult(this.state);
        }

        public PNSetStateResultBuilder state(JsonElement jsonElement) {
            this.state = jsonElement;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNSetStateResult.PNSetStateResultBuilder(state=");
            P0.append(this.state);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNSetStateResult(JsonElement jsonElement) {
        this.state = jsonElement;
    }

    public static PNSetStateResultBuilder builder() {
        return new PNSetStateResultBuilder();
    }

    public JsonElement getState() {
        return this.state;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNSetStateResult(state=");
        P0.append(getState());
        P0.append(")");
        return P0.toString();
    }
}
