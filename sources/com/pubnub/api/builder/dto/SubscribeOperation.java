package com.pubnub.api.builder.dto;

import i0.d.a.a.a;
import java.util.Collections;
import java.util.List;

public class SubscribeOperation implements PubSubOperation {
    private final List<String> channelGroups;
    private final List<String> channels;
    private final boolean presenceEnabled;
    private final Long timetoken;

    public static class SubscribeOperationBuilder {
        private List<String> channelGroups;
        private boolean channelGroups$set;
        private List<String> channels;
        private boolean channels$set;
        private boolean presenceEnabled;
        private Long timetoken;

        public SubscribeOperation build() {
            List<String> list = this.channels;
            if (!this.channels$set) {
                list = SubscribeOperation.$default$channels();
            }
            List<String> list2 = this.channelGroups;
            if (!this.channelGroups$set) {
                list2 = SubscribeOperation.$default$channelGroups();
            }
            return new SubscribeOperation(list, list2, this.presenceEnabled, this.timetoken);
        }

        public SubscribeOperationBuilder channelGroups(List<String> list) {
            this.channelGroups = list;
            this.channelGroups$set = true;
            return this;
        }

        public SubscribeOperationBuilder channels(List<String> list) {
            this.channels = list;
            this.channels$set = true;
            return this;
        }

        public SubscribeOperationBuilder presenceEnabled(boolean z) {
            this.presenceEnabled = z;
            return this;
        }

        public SubscribeOperationBuilder timetoken(Long l) {
            this.timetoken = l;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("SubscribeOperation.SubscribeOperationBuilder(channels=");
            P0.append(this.channels);
            P0.append(", channelGroups=");
            P0.append(this.channelGroups);
            P0.append(", presenceEnabled=");
            P0.append(this.presenceEnabled);
            P0.append(", timetoken=");
            P0.append(this.timetoken);
            P0.append(")");
            return P0.toString();
        }
    }

    /* access modifiers changed from: private */
    public static List<String> $default$channelGroups() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    public static List<String> $default$channels() {
        return Collections.emptyList();
    }

    public SubscribeOperation(List<String> list, List<String> list2, boolean z, Long l) {
        this.channels = list;
        this.channelGroups = list2;
        this.presenceEnabled = z;
        this.timetoken = l;
    }

    public static SubscribeOperationBuilder builder() {
        return new SubscribeOperationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SubscribeOperation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscribeOperation)) {
            return false;
        }
        SubscribeOperation subscribeOperation = (SubscribeOperation) obj;
        if (!subscribeOperation.canEqual(this)) {
            return false;
        }
        List<String> channels2 = getChannels();
        List<String> channels3 = subscribeOperation.getChannels();
        if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
            return false;
        }
        List<String> channelGroups2 = getChannelGroups();
        List<String> channelGroups3 = subscribeOperation.getChannelGroups();
        if (channelGroups2 != null ? !channelGroups2.equals(channelGroups3) : channelGroups3 != null) {
            return false;
        }
        if (isPresenceEnabled() != subscribeOperation.isPresenceEnabled()) {
            return false;
        }
        Long timetoken2 = getTimetoken();
        Long timetoken3 = subscribeOperation.getTimetoken();
        return timetoken2 != null ? timetoken2.equals(timetoken3) : timetoken3 == null;
    }

    public List<String> getChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public Long getTimetoken() {
        return this.timetoken;
    }

    public int hashCode() {
        List<String> channels2 = getChannels();
        int i = 43;
        int hashCode = channels2 == null ? 43 : channels2.hashCode();
        List<String> channelGroups2 = getChannelGroups();
        int hashCode2 = ((((hashCode + 59) * 59) + (channelGroups2 == null ? 43 : channelGroups2.hashCode())) * 59) + (isPresenceEnabled() ? 79 : 97);
        Long timetoken2 = getTimetoken();
        int i2 = hashCode2 * 59;
        if (timetoken2 != null) {
            i = timetoken2.hashCode();
        }
        return i2 + i;
    }

    public boolean isPresenceEnabled() {
        return this.presenceEnabled;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SubscribeOperation(channels=");
        P0.append(getChannels());
        P0.append(", channelGroups=");
        P0.append(getChannelGroups());
        P0.append(", presenceEnabled=");
        P0.append(isPresenceEnabled());
        P0.append(", timetoken=");
        P0.append(getTimetoken());
        P0.append(")");
        return P0.toString();
    }
}
