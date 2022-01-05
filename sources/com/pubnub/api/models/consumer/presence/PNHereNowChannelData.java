package com.pubnub.api.models.consumer.presence;

import i0.d.a.a.a;
import java.util.List;

public class PNHereNowChannelData {
    private String channelName;
    private int occupancy;
    private List<PNHereNowOccupantData> occupants;

    public static class PNHereNowChannelDataBuilder {
        private String channelName;
        private int occupancy;
        private List<PNHereNowOccupantData> occupants;

        public PNHereNowChannelData build() {
            return new PNHereNowChannelData(this.channelName, this.occupancy, this.occupants);
        }

        public PNHereNowChannelDataBuilder channelName(String str) {
            this.channelName = str;
            return this;
        }

        public PNHereNowChannelDataBuilder occupancy(int i) {
            this.occupancy = i;
            return this;
        }

        public PNHereNowChannelDataBuilder occupants(List<PNHereNowOccupantData> list) {
            this.occupants = list;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNHereNowChannelData.PNHereNowChannelDataBuilder(channelName=");
            P0.append(this.channelName);
            P0.append(", occupancy=");
            P0.append(this.occupancy);
            P0.append(", occupants=");
            P0.append(this.occupants);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNHereNowChannelData(String str, int i, List<PNHereNowOccupantData> list) {
        this.channelName = str;
        this.occupancy = i;
        this.occupants = list;
    }

    public static PNHereNowChannelDataBuilder builder() {
        return new PNHereNowChannelDataBuilder();
    }

    public String getChannelName() {
        return this.channelName;
    }

    public int getOccupancy() {
        return this.occupancy;
    }

    public List<PNHereNowOccupantData> getOccupants() {
        return this.occupants;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNHereNowChannelData(channelName=");
        P0.append(getChannelName());
        P0.append(", occupancy=");
        P0.append(getOccupancy());
        P0.append(", occupants=");
        P0.append(getOccupants());
        P0.append(")");
        return P0.toString();
    }
}
