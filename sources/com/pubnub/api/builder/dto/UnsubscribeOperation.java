package com.pubnub.api.builder.dto;

import i0.d.a.a.a;
import java.util.List;

public class UnsubscribeOperation implements PubSubOperation {
    private final List<String> channelGroups;
    private final List<String> channels;

    public static class UnsubscribeOperationBuilder {
        private List<String> channelGroups;
        private List<String> channels;

        public UnsubscribeOperation build() {
            return new UnsubscribeOperation(this.channels, this.channelGroups);
        }

        public UnsubscribeOperationBuilder channelGroups(List<String> list) {
            this.channelGroups = list;
            return this;
        }

        public UnsubscribeOperationBuilder channels(List<String> list) {
            this.channels = list;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("UnsubscribeOperation.UnsubscribeOperationBuilder(channels=");
            P0.append(this.channels);
            P0.append(", channelGroups=");
            P0.append(this.channelGroups);
            P0.append(")");
            return P0.toString();
        }
    }

    public UnsubscribeOperation(List<String> list, List<String> list2) {
        this.channels = list;
        this.channelGroups = list2;
    }

    public static UnsubscribeOperationBuilder builder() {
        return new UnsubscribeOperationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof UnsubscribeOperation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnsubscribeOperation)) {
            return false;
        }
        UnsubscribeOperation unsubscribeOperation = (UnsubscribeOperation) obj;
        if (!unsubscribeOperation.canEqual(this)) {
            return false;
        }
        List<String> channels2 = getChannels();
        List<String> channels3 = unsubscribeOperation.getChannels();
        if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
            return false;
        }
        List<String> channelGroups2 = getChannelGroups();
        List<String> channelGroups3 = unsubscribeOperation.getChannelGroups();
        return channelGroups2 != null ? channelGroups2.equals(channelGroups3) : channelGroups3 == null;
    }

    public List<String> getChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public int hashCode() {
        List<String> channels2 = getChannels();
        int i = 43;
        int hashCode = channels2 == null ? 43 : channels2.hashCode();
        List<String> channelGroups2 = getChannelGroups();
        int i2 = (hashCode + 59) * 59;
        if (channelGroups2 != null) {
            i = channelGroups2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("UnsubscribeOperation(channels=");
        P0.append(getChannels());
        P0.append(", channelGroups=");
        P0.append(getChannelGroups());
        P0.append(")");
        return P0.toString();
    }
}
