package com.pubnub.api.models.consumer.push;

import i0.d.a.a.a;
import java.util.List;

public class PNPushListProvisionsResult {
    private List<String> channels;

    public static class PNPushListProvisionsResultBuilder {
        private List<String> channels;

        public PNPushListProvisionsResult build() {
            return new PNPushListProvisionsResult(this.channels);
        }

        public PNPushListProvisionsResultBuilder channels(List<String> list) {
            this.channels = list;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNPushListProvisionsResult.PNPushListProvisionsResultBuilder(channels=");
            P0.append(this.channels);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNPushListProvisionsResult(List<String> list) {
        this.channels = list;
    }

    public static PNPushListProvisionsResultBuilder builder() {
        return new PNPushListProvisionsResultBuilder();
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNPushListProvisionsResult(channels=");
        P0.append(getChannels());
        P0.append(")");
        return P0.toString();
    }
}
