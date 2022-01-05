package com.pubnub.api.models.consumer.history;

import i0.d.a.a.a;
import java.util.Map;

public class PNMessageCountResult {
    private Map<String, Long> channels;

    public static class PNMessageCountResultBuilder {
        private Map<String, Long> channels;

        public PNMessageCountResult build() {
            return new PNMessageCountResult(this.channels);
        }

        public PNMessageCountResultBuilder channels(Map<String, Long> map) {
            this.channels = map;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNMessageCountResult.PNMessageCountResultBuilder(channels=");
            P0.append(this.channels);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNMessageCountResult(Map<String, Long> map) {
        this.channels = map;
    }

    public static PNMessageCountResultBuilder builder() {
        return new PNMessageCountResultBuilder();
    }

    public Map<String, Long> getChannels() {
        return this.channels;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNMessageCountResult(channels=");
        P0.append(getChannels());
        P0.append(")");
        return P0.toString();
    }
}
