package com.pubnub.api.builder.dto;

import i0.d.a.a.a;
import java.util.Collections;
import java.util.List;

public class PresenceOperation implements PubSubOperation {
    private final List<String> channelGroups;
    private final List<String> channels;
    private final boolean connected;

    public static class PresenceOperationBuilder {
        private List<String> channelGroups;
        private boolean channelGroups$set;
        private List<String> channels;
        private boolean channels$set;
        private boolean connected;

        public PresenceOperation build() {
            List<String> list = this.channels;
            if (!this.channels$set) {
                list = PresenceOperation.$default$channels();
            }
            List<String> list2 = this.channelGroups;
            if (!this.channelGroups$set) {
                list2 = PresenceOperation.$default$channelGroups();
            }
            return new PresenceOperation(list, list2, this.connected);
        }

        public PresenceOperationBuilder channelGroups(List<String> list) {
            this.channelGroups = list;
            this.channelGroups$set = true;
            return this;
        }

        public PresenceOperationBuilder channels(List<String> list) {
            this.channels = list;
            this.channels$set = true;
            return this;
        }

        public PresenceOperationBuilder connected(boolean z) {
            this.connected = z;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PresenceOperation.PresenceOperationBuilder(channels=");
            P0.append(this.channels);
            P0.append(", channelGroups=");
            P0.append(this.channelGroups);
            P0.append(", connected=");
            return a.D0(P0, this.connected, ")");
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

    public PresenceOperation(List<String> list, List<String> list2, boolean z) {
        this.channels = list;
        this.channelGroups = list2;
        this.connected = z;
    }

    public static PresenceOperationBuilder builder() {
        return new PresenceOperationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PresenceOperation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PresenceOperation)) {
            return false;
        }
        PresenceOperation presenceOperation = (PresenceOperation) obj;
        if (!presenceOperation.canEqual(this)) {
            return false;
        }
        List<String> channels2 = getChannels();
        List<String> channels3 = presenceOperation.getChannels();
        if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
            return false;
        }
        List<String> channelGroups2 = getChannelGroups();
        List<String> channelGroups3 = presenceOperation.getChannelGroups();
        if (channelGroups2 != null ? channelGroups2.equals(channelGroups3) : channelGroups3 == null) {
            return isConnected() == presenceOperation.isConnected();
        }
        return false;
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
        return ((i2 + i) * 59) + (isConnected() ? 79 : 97);
    }

    public boolean isConnected() {
        return this.connected;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PresenceOperation(channels=");
        P0.append(getChannels());
        P0.append(", channelGroups=");
        P0.append(getChannelGroups());
        P0.append(", connected=");
        P0.append(isConnected());
        P0.append(")");
        return P0.toString();
    }
}
