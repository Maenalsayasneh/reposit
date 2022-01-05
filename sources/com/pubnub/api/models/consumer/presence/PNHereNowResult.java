package com.pubnub.api.models.consumer.presence;

import i0.d.a.a.a;
import java.util.Map;

public class PNHereNowResult {
    private Map<String, PNHereNowChannelData> channels;
    private int totalChannels;
    private int totalOccupancy;

    public static class PNHereNowResultBuilder {
        private Map<String, PNHereNowChannelData> channels;
        private int totalChannels;
        private int totalOccupancy;

        public PNHereNowResult build() {
            return new PNHereNowResult(this.totalChannels, this.totalOccupancy, this.channels);
        }

        public PNHereNowResultBuilder channels(Map<String, PNHereNowChannelData> map) {
            this.channels = map;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNHereNowResult.PNHereNowResultBuilder(totalChannels=");
            P0.append(this.totalChannels);
            P0.append(", totalOccupancy=");
            P0.append(this.totalOccupancy);
            P0.append(", channels=");
            P0.append(this.channels);
            P0.append(")");
            return P0.toString();
        }

        public PNHereNowResultBuilder totalChannels(int i) {
            this.totalChannels = i;
            return this;
        }

        public PNHereNowResultBuilder totalOccupancy(int i) {
            this.totalOccupancy = i;
            return this;
        }
    }

    public PNHereNowResult(int i, int i2, Map<String, PNHereNowChannelData> map) {
        this.totalChannels = i;
        this.totalOccupancy = i2;
        this.channels = map;
    }

    public static PNHereNowResultBuilder builder() {
        return new PNHereNowResultBuilder();
    }

    public Map<String, PNHereNowChannelData> getChannels() {
        return this.channels;
    }

    public int getTotalChannels() {
        return this.totalChannels;
    }

    public int getTotalOccupancy() {
        return this.totalOccupancy;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNHereNowResult(totalChannels=");
        P0.append(getTotalChannels());
        P0.append(", totalOccupancy=");
        P0.append(getTotalOccupancy());
        P0.append(", channels=");
        P0.append(getChannels());
        P0.append(")");
        return P0.toString();
    }
}
