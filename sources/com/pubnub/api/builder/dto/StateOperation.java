package com.pubnub.api.builder.dto;

import i0.d.a.a.a;
import java.util.Collections;
import java.util.List;

public class StateOperation implements PubSubOperation {
    private final List<String> channelGroups;
    private final List<String> channels;
    private final Object state;

    public static class StateOperationBuilder {
        private List<String> channelGroups;
        private boolean channelGroups$set;
        private List<String> channels;
        private boolean channels$set;
        private Object state;

        public StateOperation build() {
            List<String> list = this.channels;
            if (!this.channels$set) {
                list = StateOperation.$default$channels();
            }
            List<String> list2 = this.channelGroups;
            if (!this.channelGroups$set) {
                list2 = StateOperation.$default$channelGroups();
            }
            return new StateOperation(list, list2, this.state);
        }

        public StateOperationBuilder channelGroups(List<String> list) {
            this.channelGroups = list;
            this.channelGroups$set = true;
            return this;
        }

        public StateOperationBuilder channels(List<String> list) {
            this.channels = list;
            this.channels$set = true;
            return this;
        }

        public StateOperationBuilder state(Object obj) {
            this.state = obj;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("StateOperation.StateOperationBuilder(channels=");
            P0.append(this.channels);
            P0.append(", channelGroups=");
            P0.append(this.channelGroups);
            P0.append(", state=");
            P0.append(this.state);
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

    public StateOperation(List<String> list, List<String> list2, Object obj) {
        this.channels = list;
        this.channelGroups = list2;
        this.state = obj;
    }

    public static StateOperationBuilder builder() {
        return new StateOperationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof StateOperation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateOperation)) {
            return false;
        }
        StateOperation stateOperation = (StateOperation) obj;
        if (!stateOperation.canEqual(this)) {
            return false;
        }
        List<String> channels2 = getChannels();
        List<String> channels3 = stateOperation.getChannels();
        if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
            return false;
        }
        List<String> channelGroups2 = getChannelGroups();
        List<String> channelGroups3 = stateOperation.getChannelGroups();
        if (channelGroups2 != null ? !channelGroups2.equals(channelGroups3) : channelGroups3 != null) {
            return false;
        }
        Object state2 = getState();
        Object state3 = stateOperation.getState();
        return state2 != null ? state2.equals(state3) : state3 == null;
    }

    public List<String> getChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public Object getState() {
        return this.state;
    }

    public int hashCode() {
        List<String> channels2 = getChannels();
        int i = 43;
        int hashCode = channels2 == null ? 43 : channels2.hashCode();
        List<String> channelGroups2 = getChannelGroups();
        int hashCode2 = ((hashCode + 59) * 59) + (channelGroups2 == null ? 43 : channelGroups2.hashCode());
        Object state2 = getState();
        int i2 = hashCode2 * 59;
        if (state2 != null) {
            i = state2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("StateOperation(channels=");
        P0.append(getChannels());
        P0.append(", channelGroups=");
        P0.append(getChannelGroups());
        P0.append(", state=");
        P0.append(getState());
        P0.append(")");
        return P0.toString();
    }
}
