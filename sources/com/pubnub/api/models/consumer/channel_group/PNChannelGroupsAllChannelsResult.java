package com.pubnub.api.models.consumer.channel_group;

import i0.d.a.a.a;
import java.util.List;

public class PNChannelGroupsAllChannelsResult {
    private List<String> channels;

    public static class PNChannelGroupsAllChannelsResultBuilder {
        private List<String> channels;

        public PNChannelGroupsAllChannelsResult build() {
            return new PNChannelGroupsAllChannelsResult(this.channels);
        }

        public PNChannelGroupsAllChannelsResultBuilder channels(List<String> list) {
            this.channels = list;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNChannelGroupsAllChannelsResult.PNChannelGroupsAllChannelsResultBuilder(channels=");
            P0.append(this.channels);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNChannelGroupsAllChannelsResult(List<String> list) {
        this.channels = list;
    }

    public static PNChannelGroupsAllChannelsResultBuilder builder() {
        return new PNChannelGroupsAllChannelsResultBuilder();
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNChannelGroupsAllChannelsResult(channels=");
        P0.append(getChannels());
        P0.append(")");
        return P0.toString();
    }
}
