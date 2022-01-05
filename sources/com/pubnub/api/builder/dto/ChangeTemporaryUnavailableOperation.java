package com.pubnub.api.builder.dto;

import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ChangeTemporaryUnavailableOperation implements PubSubOperation {
    private final List<String> availableChannelGroups;
    private final List<String> availableChannels;
    private final List<String> unavailableChannelGroups;
    private final List<String> unavailableChannels;

    public static class ChangeTemporaryUnavailableOperationBuilder {
        private ArrayList<String> availableChannelGroups;
        private ArrayList<String> availableChannels;
        private ArrayList<String> unavailableChannelGroups;
        private ArrayList<String> unavailableChannels;

        public ChangeTemporaryUnavailableOperationBuilder availableChannel(String str) {
            if (this.availableChannels == null) {
                this.availableChannels = new ArrayList<>();
            }
            this.availableChannels.add(str);
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder availableChannelGroup(String str) {
            if (this.availableChannelGroups == null) {
                this.availableChannelGroups = new ArrayList<>();
            }
            this.availableChannelGroups.add(str);
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder availableChannelGroups(Collection<? extends String> collection) {
            if (this.availableChannelGroups == null) {
                this.availableChannelGroups = new ArrayList<>();
            }
            this.availableChannelGroups.addAll(collection);
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder availableChannels(Collection<? extends String> collection) {
            if (this.availableChannels == null) {
                this.availableChannels = new ArrayList<>();
            }
            this.availableChannels.addAll(collection);
            return this;
        }

        public ChangeTemporaryUnavailableOperation build() {
            ArrayList<String> arrayList = this.unavailableChannels;
            int size = arrayList == null ? 0 : arrayList.size();
            List unmodifiableList = size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(this.unavailableChannels)) : Collections.singletonList(this.unavailableChannels.get(0)) : Collections.emptyList();
            ArrayList<String> arrayList2 = this.unavailableChannelGroups;
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            List unmodifiableList2 = size2 != 0 ? size2 != 1 ? Collections.unmodifiableList(new ArrayList(this.unavailableChannelGroups)) : Collections.singletonList(this.unavailableChannelGroups.get(0)) : Collections.emptyList();
            ArrayList<String> arrayList3 = this.availableChannels;
            int size3 = arrayList3 == null ? 0 : arrayList3.size();
            List unmodifiableList3 = size3 != 0 ? size3 != 1 ? Collections.unmodifiableList(new ArrayList(this.availableChannels)) : Collections.singletonList(this.availableChannels.get(0)) : Collections.emptyList();
            ArrayList<String> arrayList4 = this.availableChannelGroups;
            int size4 = arrayList4 == null ? 0 : arrayList4.size();
            return new ChangeTemporaryUnavailableOperation(unmodifiableList, unmodifiableList2, unmodifiableList3, size4 != 0 ? size4 != 1 ? Collections.unmodifiableList(new ArrayList(this.availableChannelGroups)) : Collections.singletonList(this.availableChannelGroups.get(0)) : Collections.emptyList());
        }

        public ChangeTemporaryUnavailableOperationBuilder clearAvailableChannelGroups() {
            ArrayList<String> arrayList = this.availableChannelGroups;
            if (arrayList != null) {
                arrayList.clear();
            }
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder clearAvailableChannels() {
            ArrayList<String> arrayList = this.availableChannels;
            if (arrayList != null) {
                arrayList.clear();
            }
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder clearUnavailableChannelGroups() {
            ArrayList<String> arrayList = this.unavailableChannelGroups;
            if (arrayList != null) {
                arrayList.clear();
            }
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder clearUnavailableChannels() {
            ArrayList<String> arrayList = this.unavailableChannels;
            if (arrayList != null) {
                arrayList.clear();
            }
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("ChangeTemporaryUnavailableOperation.ChangeTemporaryUnavailableOperationBuilder(unavailableChannels=");
            P0.append(this.unavailableChannels);
            P0.append(", unavailableChannelGroups=");
            P0.append(this.unavailableChannelGroups);
            P0.append(", availableChannels=");
            P0.append(this.availableChannels);
            P0.append(", availableChannelGroups=");
            P0.append(this.availableChannelGroups);
            P0.append(")");
            return P0.toString();
        }

        public ChangeTemporaryUnavailableOperationBuilder unavailableChannel(String str) {
            if (this.unavailableChannels == null) {
                this.unavailableChannels = new ArrayList<>();
            }
            this.unavailableChannels.add(str);
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder unavailableChannelGroup(String str) {
            if (this.unavailableChannelGroups == null) {
                this.unavailableChannelGroups = new ArrayList<>();
            }
            this.unavailableChannelGroups.add(str);
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder unavailableChannelGroups(Collection<? extends String> collection) {
            if (this.unavailableChannelGroups == null) {
                this.unavailableChannelGroups = new ArrayList<>();
            }
            this.unavailableChannelGroups.addAll(collection);
            return this;
        }

        public ChangeTemporaryUnavailableOperationBuilder unavailableChannels(Collection<? extends String> collection) {
            if (this.unavailableChannels == null) {
                this.unavailableChannels = new ArrayList<>();
            }
            this.unavailableChannels.addAll(collection);
            return this;
        }
    }

    public ChangeTemporaryUnavailableOperation(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.unavailableChannels = list;
        this.unavailableChannelGroups = list2;
        this.availableChannels = list3;
        this.availableChannelGroups = list4;
    }

    public static ChangeTemporaryUnavailableOperationBuilder builder() {
        return new ChangeTemporaryUnavailableOperationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ChangeTemporaryUnavailableOperation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeTemporaryUnavailableOperation)) {
            return false;
        }
        ChangeTemporaryUnavailableOperation changeTemporaryUnavailableOperation = (ChangeTemporaryUnavailableOperation) obj;
        if (!changeTemporaryUnavailableOperation.canEqual(this)) {
            return false;
        }
        List<String> unavailableChannels2 = getUnavailableChannels();
        List<String> unavailableChannels3 = changeTemporaryUnavailableOperation.getUnavailableChannels();
        if (unavailableChannels2 != null ? !unavailableChannels2.equals(unavailableChannels3) : unavailableChannels3 != null) {
            return false;
        }
        List<String> unavailableChannelGroups2 = getUnavailableChannelGroups();
        List<String> unavailableChannelGroups3 = changeTemporaryUnavailableOperation.getUnavailableChannelGroups();
        if (unavailableChannelGroups2 != null ? !unavailableChannelGroups2.equals(unavailableChannelGroups3) : unavailableChannelGroups3 != null) {
            return false;
        }
        List<String> availableChannels2 = getAvailableChannels();
        List<String> availableChannels3 = changeTemporaryUnavailableOperation.getAvailableChannels();
        if (availableChannels2 != null ? !availableChannels2.equals(availableChannels3) : availableChannels3 != null) {
            return false;
        }
        List<String> availableChannelGroups2 = getAvailableChannelGroups();
        List<String> availableChannelGroups3 = changeTemporaryUnavailableOperation.getAvailableChannelGroups();
        return availableChannelGroups2 != null ? availableChannelGroups2.equals(availableChannelGroups3) : availableChannelGroups3 == null;
    }

    public List<String> getAvailableChannelGroups() {
        return this.availableChannelGroups;
    }

    public List<String> getAvailableChannels() {
        return this.availableChannels;
    }

    public List<String> getUnavailableChannelGroups() {
        return this.unavailableChannelGroups;
    }

    public List<String> getUnavailableChannels() {
        return this.unavailableChannels;
    }

    public int hashCode() {
        List<String> unavailableChannels2 = getUnavailableChannels();
        int i = 43;
        int hashCode = unavailableChannels2 == null ? 43 : unavailableChannels2.hashCode();
        List<String> unavailableChannelGroups2 = getUnavailableChannelGroups();
        int hashCode2 = ((hashCode + 59) * 59) + (unavailableChannelGroups2 == null ? 43 : unavailableChannelGroups2.hashCode());
        List<String> availableChannels2 = getAvailableChannels();
        int hashCode3 = (hashCode2 * 59) + (availableChannels2 == null ? 43 : availableChannels2.hashCode());
        List<String> availableChannelGroups2 = getAvailableChannelGroups();
        int i2 = hashCode3 * 59;
        if (availableChannelGroups2 != null) {
            i = availableChannelGroups2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChangeTemporaryUnavailableOperation(unavailableChannels=");
        P0.append(getUnavailableChannels());
        P0.append(", unavailableChannelGroups=");
        P0.append(getUnavailableChannelGroups());
        P0.append(", availableChannels=");
        P0.append(getAvailableChannels());
        P0.append(", availableChannelGroups=");
        P0.append(getAvailableChannelGroups());
        P0.append(")");
        return P0.toString();
    }
}
