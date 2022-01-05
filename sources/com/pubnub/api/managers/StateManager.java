package com.pubnub.api.managers;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation;
import com.pubnub.api.builder.dto.PresenceOperation;
import com.pubnub.api.builder.dto.PubSubOperation;
import com.pubnub.api.builder.dto.StateOperation;
import com.pubnub.api.builder.dto.SubscribeOperation;
import com.pubnub.api.builder.dto.TimetokenAndRegionOperation;
import com.pubnub.api.builder.dto.UnsubscribeOperation;
import com.pubnub.api.models.SubscriptionItem;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StateManager {
    public static final int MILLIS_IN_SECOND = 1000;
    private final Map<String, SubscriptionItem> channels = new HashMap();
    private final PNConfiguration configuration;
    private final Map<String, SubscriptionItem> groups = new HashMap();
    private final Map<String, SubscriptionItem> heartbeatChannels = new HashMap();
    private final Map<String, SubscriptionItem> heartbeatGroups = new HashMap();
    private final Map<String, SubscriptionItem> presenceChannels = new HashMap();
    private final Map<String, SubscriptionItem> presenceGroups = new HashMap();
    private String region = null;
    private boolean shouldAnnounce = false;
    private Long storedTimetoken = null;
    private final List<TemporaryUnavailableItem> temporaryUnavailableChannelGroups = new ArrayList();
    private final List<TemporaryUnavailableItem> temporaryUnavailableChannels = new ArrayList();
    private Long timetoken = 0L;

    public enum ChannelFilter {
        WITH_TEMPORARY_UNAVAILABLE,
        WITHOUT_TEMPORARY_UNAVAILABLE
    }

    public static class HeartbeatStateData {
        private final List<String> heartbeatChannelGroups;
        private final List<String> heartbeatChannels;
        private final Map<String, Object> statePayload;

        public HeartbeatStateData(Map<String, Object> map, List<String> list, List<String> list2) {
            this.statePayload = map;
            this.heartbeatChannelGroups = list;
            this.heartbeatChannels = list2;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof HeartbeatStateData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeartbeatStateData)) {
                return false;
            }
            HeartbeatStateData heartbeatStateData = (HeartbeatStateData) obj;
            if (!heartbeatStateData.canEqual(this)) {
                return false;
            }
            Map<String, Object> statePayload2 = getStatePayload();
            Map<String, Object> statePayload3 = heartbeatStateData.getStatePayload();
            if (statePayload2 != null ? !statePayload2.equals(statePayload3) : statePayload3 != null) {
                return false;
            }
            List<String> heartbeatChannelGroups2 = getHeartbeatChannelGroups();
            List<String> heartbeatChannelGroups3 = heartbeatStateData.getHeartbeatChannelGroups();
            if (heartbeatChannelGroups2 != null ? !heartbeatChannelGroups2.equals(heartbeatChannelGroups3) : heartbeatChannelGroups3 != null) {
                return false;
            }
            List<String> heartbeatChannels2 = getHeartbeatChannels();
            List<String> heartbeatChannels3 = heartbeatStateData.getHeartbeatChannels();
            return heartbeatChannels2 != null ? heartbeatChannels2.equals(heartbeatChannels3) : heartbeatChannels3 == null;
        }

        public List<String> getHeartbeatChannelGroups() {
            return this.heartbeatChannelGroups;
        }

        public List<String> getHeartbeatChannels() {
            return this.heartbeatChannels;
        }

        public Map<String, Object> getStatePayload() {
            return this.statePayload;
        }

        public int hashCode() {
            Map<String, Object> statePayload2 = getStatePayload();
            int i = 43;
            int hashCode = statePayload2 == null ? 43 : statePayload2.hashCode();
            List<String> heartbeatChannelGroups2 = getHeartbeatChannelGroups();
            int hashCode2 = ((hashCode + 59) * 59) + (heartbeatChannelGroups2 == null ? 43 : heartbeatChannelGroups2.hashCode());
            List<String> heartbeatChannels2 = getHeartbeatChannels();
            int i2 = hashCode2 * 59;
            if (heartbeatChannels2 != null) {
                i = heartbeatChannels2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("StateManager.HeartbeatStateData(statePayload=");
            P0.append(getStatePayload());
            P0.append(", heartbeatChannelGroups=");
            P0.append(getHeartbeatChannelGroups());
            P0.append(", heartbeatChannels=");
            P0.append(getHeartbeatChannels());
            P0.append(")");
            return P0.toString();
        }
    }

    public static class SubscriptionStateData {
        private final boolean anythingToSubscribe;
        private final List<String> channelGroups;
        private final List<String> channels;
        private final String region;
        private final boolean shouldAnnounce;
        private final Map<String, Object> statePayload;
        private final boolean subscribedToOnlyTemporaryUnavailable;
        private final Long timetoken;

        public SubscriptionStateData(Map<String, Object> map, List<String> list, List<String> list2, Long l, String str, boolean z, boolean z2, boolean z3) {
            this.statePayload = map;
            this.channelGroups = list;
            this.channels = list2;
            this.timetoken = l;
            this.region = str;
            this.anythingToSubscribe = z;
            this.subscribedToOnlyTemporaryUnavailable = z2;
            this.shouldAnnounce = z3;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof SubscriptionStateData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubscriptionStateData)) {
                return false;
            }
            SubscriptionStateData subscriptionStateData = (SubscriptionStateData) obj;
            if (!subscriptionStateData.canEqual(this)) {
                return false;
            }
            Map<String, Object> statePayload2 = getStatePayload();
            Map<String, Object> statePayload3 = subscriptionStateData.getStatePayload();
            if (statePayload2 != null ? !statePayload2.equals(statePayload3) : statePayload3 != null) {
                return false;
            }
            List<String> channelGroups2 = getChannelGroups();
            List<String> channelGroups3 = subscriptionStateData.getChannelGroups();
            if (channelGroups2 != null ? !channelGroups2.equals(channelGroups3) : channelGroups3 != null) {
                return false;
            }
            List<String> channels2 = getChannels();
            List<String> channels3 = subscriptionStateData.getChannels();
            if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
                return false;
            }
            Long timetoken2 = getTimetoken();
            Long timetoken3 = subscriptionStateData.getTimetoken();
            if (timetoken2 != null ? !timetoken2.equals(timetoken3) : timetoken3 != null) {
                return false;
            }
            String region2 = getRegion();
            String region3 = subscriptionStateData.getRegion();
            if (region2 != null ? region2.equals(region3) : region3 == null) {
                return isAnythingToSubscribe() == subscriptionStateData.isAnythingToSubscribe() && isSubscribedToOnlyTemporaryUnavailable() == subscriptionStateData.isSubscribedToOnlyTemporaryUnavailable() && isShouldAnnounce() == subscriptionStateData.isShouldAnnounce();
            }
            return false;
        }

        public List<String> getChannelGroups() {
            return this.channelGroups;
        }

        public List<String> getChannels() {
            return this.channels;
        }

        public String getRegion() {
            return this.region;
        }

        public Map<String, Object> getStatePayload() {
            return this.statePayload;
        }

        public Long getTimetoken() {
            return this.timetoken;
        }

        public int hashCode() {
            Map<String, Object> statePayload2 = getStatePayload();
            int i = 43;
            int hashCode = statePayload2 == null ? 43 : statePayload2.hashCode();
            List<String> channelGroups2 = getChannelGroups();
            int hashCode2 = ((hashCode + 59) * 59) + (channelGroups2 == null ? 43 : channelGroups2.hashCode());
            List<String> channels2 = getChannels();
            int hashCode3 = (hashCode2 * 59) + (channels2 == null ? 43 : channels2.hashCode());
            Long timetoken2 = getTimetoken();
            int hashCode4 = (hashCode3 * 59) + (timetoken2 == null ? 43 : timetoken2.hashCode());
            String region2 = getRegion();
            int i2 = hashCode4 * 59;
            if (region2 != null) {
                i = region2.hashCode();
            }
            int i3 = 79;
            int i4 = (((((i2 + i) * 59) + (isAnythingToSubscribe() ? 79 : 97)) * 59) + (isSubscribedToOnlyTemporaryUnavailable() ? 79 : 97)) * 59;
            if (!isShouldAnnounce()) {
                i3 = 97;
            }
            return i4 + i3;
        }

        public boolean isAnythingToSubscribe() {
            return this.anythingToSubscribe;
        }

        public boolean isShouldAnnounce() {
            return this.shouldAnnounce;
        }

        public boolean isSubscribedToOnlyTemporaryUnavailable() {
            return this.subscribedToOnlyTemporaryUnavailable;
        }

        public String toString() {
            StringBuilder P0 = a.P0("StateManager.SubscriptionStateData(statePayload=");
            P0.append(getStatePayload());
            P0.append(", channelGroups=");
            P0.append(getChannelGroups());
            P0.append(", channels=");
            P0.append(getChannels());
            P0.append(", timetoken=");
            P0.append(getTimetoken());
            P0.append(", region=");
            P0.append(getRegion());
            P0.append(", anythingToSubscribe=");
            P0.append(isAnythingToSubscribe());
            P0.append(", subscribedToOnlyTemporaryUnavailable=");
            P0.append(isSubscribedToOnlyTemporaryUnavailable());
            P0.append(", shouldAnnounce=");
            P0.append(isShouldAnnounce());
            P0.append(")");
            return P0.toString();
        }
    }

    public static class TemporaryUnavailableItem {
        private String item;
        private Date timestamp;

        public TemporaryUnavailableItem(String str, Date date) {
            this.item = str;
            this.timestamp = date;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof TemporaryUnavailableItem;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TemporaryUnavailableItem)) {
                return false;
            }
            TemporaryUnavailableItem temporaryUnavailableItem = (TemporaryUnavailableItem) obj;
            if (!temporaryUnavailableItem.canEqual(this)) {
                return false;
            }
            String item2 = getItem();
            String item3 = temporaryUnavailableItem.getItem();
            if (item2 != null ? !item2.equals(item3) : item3 != null) {
                return false;
            }
            Date timestamp2 = getTimestamp();
            Date timestamp3 = temporaryUnavailableItem.getTimestamp();
            return timestamp2 != null ? timestamp2.equals(timestamp3) : timestamp3 == null;
        }

        public String getItem() {
            return this.item;
        }

        public Date getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            String item2 = getItem();
            int i = 43;
            int hashCode = item2 == null ? 43 : item2.hashCode();
            Date timestamp2 = getTimestamp();
            int i2 = (hashCode + 59) * 59;
            if (timestamp2 != null) {
                i = timestamp2.hashCode();
            }
            return i2 + i;
        }

        public void setItem(String str) {
            this.item = str;
        }

        public void setTimestamp(Date date) {
            this.timestamp = date;
        }

        public String toString() {
            StringBuilder P0 = a.P0("StateManager.TemporaryUnavailableItem(item=");
            P0.append(getItem());
            P0.append(", timestamp=");
            P0.append(getTimestamp());
            P0.append(")");
            return P0.toString();
        }
    }

    public StateManager(PNConfiguration pNConfiguration) {
        this.configuration = pNConfiguration;
    }

    private void adaptPresenceBuilder(PresenceOperation presenceOperation) {
        for (String next : presenceOperation.getChannels()) {
            if (!(next == null || next.length() == 0)) {
                if (presenceOperation.isConnected()) {
                    this.heartbeatChannels.put(next, new SubscriptionItem().setName(next));
                } else {
                    this.heartbeatChannels.remove(next);
                }
            }
        }
        for (String next2 : presenceOperation.getChannelGroups()) {
            if (!(next2 == null || next2.length() == 0)) {
                if (presenceOperation.isConnected()) {
                    this.heartbeatGroups.put(next2, new SubscriptionItem().setName(next2));
                } else {
                    this.heartbeatGroups.remove(next2);
                }
            }
        }
    }

    private void adaptStateBuilder(StateOperation stateOperation) {
        for (String next : stateOperation.getChannels()) {
            SubscriptionItem subscriptionItem = this.channels.get(next);
            if (subscriptionItem != null) {
                subscriptionItem.setState(stateOperation.getState());
            }
            SubscriptionItem subscriptionItem2 = this.heartbeatChannels.get(next);
            if (subscriptionItem2 != null) {
                subscriptionItem2.setState(stateOperation.getState());
            }
        }
        for (String next2 : stateOperation.getChannelGroups()) {
            SubscriptionItem subscriptionItem3 = this.groups.get(next2);
            if (subscriptionItem3 != null) {
                subscriptionItem3.setState(stateOperation.getState());
            }
            SubscriptionItem subscriptionItem4 = this.heartbeatGroups.get(next2);
            if (subscriptionItem4 != null) {
                subscriptionItem4.setState(stateOperation.getState());
            }
        }
    }

    private boolean adaptSubscribeBuilder(SubscribeOperation subscribeOperation) {
        Iterator<String> it = subscribeOperation.getChannels().iterator();
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!(next == null || next.length() == 0)) {
                z = putIfDifferent(this.channels, next, new SubscriptionItem().setName(next)) || z;
                if (subscribeOperation.isPresenceEnabled()) {
                    if (!putIfDifferent(this.presenceChannels, next, new SubscriptionItem().setName(next)) && !z) {
                        z2 = false;
                    }
                    z = z2;
                }
            }
        }
        for (String next2 : subscribeOperation.getChannelGroups()) {
            if (!(next2 == null || next2.length() == 0)) {
                z = putIfDifferent(this.groups, next2, new SubscriptionItem().setName(next2)) || z;
                if (subscribeOperation.isPresenceEnabled()) {
                    z = putIfDifferent(this.presenceGroups, next2, new SubscriptionItem().setName(next2)) || z;
                }
            }
        }
        if (z) {
            explicitlySetTimetoken(subscribeOperation.getTimetoken());
        }
        return z;
    }

    private void addPresence(List<String> list, Map<String, SubscriptionItem> map) {
        for (SubscriptionItem name : map.values()) {
            list.add(name.getName().concat("-pnpres"));
        }
    }

    private void changeTemporary(ChangeTemporaryUnavailableOperation changeTemporaryUnavailableOperation) {
        for (String temporaryUnavailableItem : changeTemporaryUnavailableOperation.getUnavailableChannels()) {
            this.temporaryUnavailableChannels.add(new TemporaryUnavailableItem(temporaryUnavailableItem, new Date()));
        }
        for (String temporaryUnavailableItem2 : changeTemporaryUnavailableOperation.getUnavailableChannelGroups()) {
            this.temporaryUnavailableChannelGroups.add(new TemporaryUnavailableItem(temporaryUnavailableItem2, new Date()));
        }
        removeTemporaryUnavailableChannels(changeTemporaryUnavailableOperation.getAvailableChannels());
        removeTemporaryUnavailableChannelGroups(changeTemporaryUnavailableOperation.getAvailableChannelGroups());
    }

    private List<String> channelGroupsToPostponeSubscription(List<TemporaryUnavailableItem> list) {
        ArrayList arrayList = new ArrayList();
        for (TemporaryUnavailableItem next : list) {
            if (next.getTimestamp().after(new Date(System.currentTimeMillis() - ((long) (this.configuration.getConnectTimeout() * 1000))))) {
                arrayList.add(next.getItem());
            }
        }
        return arrayList;
    }

    private List<String> channelsToPostponeSubscription(List<TemporaryUnavailableItem> list) {
        ArrayList arrayList = new ArrayList();
        for (TemporaryUnavailableItem next : list) {
            if (next.getTimestamp().after(new Date(System.currentTimeMillis() - ((long) (this.configuration.getConnectTimeout() * 1000))))) {
                arrayList.add(next.getItem());
            }
        }
        return arrayList;
    }

    private Map<String, Object> createHeartbeatStatePayload() {
        return createStatePayload(this.heartbeatChannels, this.heartbeatGroups);
    }

    private Map<String, Object> createStatePayload() {
        return createStatePayload(this.channels, this.groups);
    }

    private List<String> effectiveChannelGroups() {
        return effectiveChannelGroups(true);
    }

    private List<String> effectiveChannels() {
        return effectiveChannels(true);
    }

    private void explicitlySetTimetoken(Long l) {
        if (l != null) {
            this.timetoken = l;
        }
        if (this.timetoken.longValue() != 0) {
            this.storedTimetoken = this.timetoken;
        }
        this.timetoken = 0L;
    }

    private List<String> getNames(Map<String, SubscriptionItem> map) {
        return new ArrayList(map.keySet());
    }

    private boolean hasAnythingToSubscribe() {
        List<String> prepareMembershipList = prepareMembershipList(this.channels, this.presenceChannels, true);
        List<String> prepareMembershipList2 = prepareMembershipList(this.groups, this.presenceGroups, true);
        if (!prepareMembershipList.isEmpty() || !prepareMembershipList2.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        return this.channels.isEmpty() && this.presenceChannels.isEmpty() && this.groups.isEmpty() && this.presenceGroups.isEmpty();
    }

    private List<String> prepareMembershipList(Map<String, SubscriptionItem> map, Map<String, SubscriptionItem> map2, boolean z) {
        List<String> names = getNames(map);
        if (z) {
            addPresence(names, map2);
        }
        return names;
    }

    private <T> boolean putIfDifferent(Map<String, T> map, String str, T t) {
        T t2 = map.get(str);
        if (t2 == null) {
            map.put(str, t);
            return true;
        } else if (t2.equals(t)) {
            return false;
        } else {
            map.put(str, t);
            return true;
        }
    }

    private void removeTemporaryUnavailable(Collection<String> collection, Collection<TemporaryUnavailableItem> collection2) {
        if (!collection.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (TemporaryUnavailableItem next : collection2) {
                if (collection.contains(next.getItem())) {
                    arrayList.add(next);
                }
            }
            collection2.removeAll(arrayList);
        }
    }

    private void removeTemporaryUnavailableChannelGroups(Collection<String> collection) {
        removeTemporaryUnavailable(collection, this.temporaryUnavailableChannelGroups);
    }

    private void removeTemporaryUnavailableChannels(Collection<String> collection) {
        removeTemporaryUnavailable(collection, this.temporaryUnavailableChannels);
    }

    private void resetTemporaryUnavailableChannelsAndGroups() {
        this.temporaryUnavailableChannels.clear();
        this.temporaryUnavailableChannelGroups.clear();
    }

    private boolean subscribedToOnlyTemporaryUnavailable() {
        return effectiveChannels().isEmpty() && effectiveChannelGroups().isEmpty();
    }

    private void unsubscribe(UnsubscribeOperation unsubscribeOperation) {
        for (String next : unsubscribeOperation.getChannels()) {
            this.channels.remove(next);
            this.presenceChannels.remove(next);
        }
        removeTemporaryUnavailableChannels(unsubscribeOperation.getChannels());
        for (String next2 : unsubscribeOperation.getChannelGroups()) {
            this.groups.remove(next2);
            this.presenceGroups.remove(next2);
        }
        removeTemporaryUnavailableChannelGroups(unsubscribeOperation.getChannelGroups());
        if (isEmpty()) {
            this.region = null;
            this.storedTimetoken = null;
        } else {
            this.storedTimetoken = this.timetoken;
        }
        this.timetoken = 0L;
    }

    private void updateTimetokenAndRegion(Long l, String str) {
        Long l2 = this.storedTimetoken;
        if (l2 != null) {
            this.timetoken = l2;
            this.storedTimetoken = null;
        } else {
            this.timetoken = l;
        }
        this.region = str;
    }

    public synchronized boolean handleOperation(PubSubOperation... pubSubOperationArr) {
        boolean z;
        z = false;
        for (SubscribeOperation subscribeOperation : pubSubOperationArr) {
            if (subscribeOperation instanceof SubscribeOperation) {
                if (adaptSubscribeBuilder(subscribeOperation)) {
                    this.shouldAnnounce = true;
                }
            } else if (subscribeOperation instanceof UnsubscribeOperation) {
                unsubscribe((UnsubscribeOperation) subscribeOperation);
                this.shouldAnnounce = true;
            } else {
                if (subscribeOperation instanceof StateOperation) {
                    adaptStateBuilder((StateOperation) subscribeOperation);
                } else if (subscribeOperation instanceof PresenceOperation) {
                    adaptPresenceBuilder((PresenceOperation) subscribeOperation);
                } else if (subscribeOperation instanceof TimetokenAndRegionOperation) {
                    TimetokenAndRegionOperation timetokenAndRegionOperation = (TimetokenAndRegionOperation) subscribeOperation;
                    updateTimetokenAndRegion(Long.valueOf(timetokenAndRegionOperation.getTimetoken()), timetokenAndRegionOperation.getRegion());
                } else if (subscribeOperation instanceof PubSubOperation.DisconnectOperation) {
                    resetTemporaryUnavailableChannelsAndGroups();
                } else if (subscribeOperation instanceof ChangeTemporaryUnavailableOperation) {
                    changeTemporary((ChangeTemporaryUnavailableOperation) subscribeOperation);
                } else if (subscribeOperation instanceof PubSubOperation.ConnectedStatusAnnouncedOperation) {
                    this.shouldAnnounce = false;
                }
            }
            z = true;
        }
        return z;
    }

    public synchronized HeartbeatStateData heartbeatStateData() {
        if (this.configuration.isManagePresenceListManually()) {
            return new HeartbeatStateData(createHeartbeatStatePayload(), getNames(this.heartbeatGroups), getNames(this.heartbeatChannels));
        }
        List<String> names = getNames(this.heartbeatGroups);
        names.addAll(getNames(this.groups));
        List<String> names2 = getNames(this.heartbeatChannels);
        names2.addAll(getNames(this.channels));
        return new HeartbeatStateData(Collections.emptyMap(), names, names2);
    }

    public synchronized SubscriptionStateData subscriptionStateData(Boolean bool) {
        return subscriptionStateData(bool, ChannelFilter.WITH_TEMPORARY_UNAVAILABLE);
    }

    private Map<String, Object> createStatePayload(Map<String, SubscriptionItem> map, Map<String, SubscriptionItem> map2) {
        HashMap hashMap = new HashMap();
        for (SubscriptionItem next : map.values()) {
            if (next.getState() != null) {
                hashMap.put(next.getName(), next.getState());
            }
        }
        for (SubscriptionItem next2 : map2.values()) {
            if (next2.getState() != null) {
                hashMap.put(next2.getName(), next2.getState());
            }
        }
        return hashMap;
    }

    private List<String> effectiveChannelGroups(boolean z) {
        List<String> prepareMembershipList = prepareMembershipList(this.groups, this.presenceGroups, z);
        prepareMembershipList.removeAll(channelGroupsToPostponeSubscription(this.temporaryUnavailableChannelGroups));
        return prepareMembershipList;
    }

    private List<String> effectiveChannels(boolean z) {
        List<String> prepareMembershipList = prepareMembershipList(this.channels, this.presenceChannels, z);
        prepareMembershipList.removeAll(channelsToPostponeSubscription(this.temporaryUnavailableChannels));
        return prepareMembershipList;
    }

    public synchronized SubscriptionStateData subscriptionStateData(Boolean bool, ChannelFilter channelFilter) {
        List<String> list;
        List<String> list2;
        if (channelFilter == ChannelFilter.WITH_TEMPORARY_UNAVAILABLE) {
            list = prepareMembershipList(this.channels, this.presenceChannels, bool.booleanValue());
            list2 = prepareMembershipList(this.groups, this.presenceGroups, bool.booleanValue());
        } else {
            list = effectiveChannels(bool.booleanValue());
            list2 = effectiveChannelGroups(bool.booleanValue());
        }
        return new SubscriptionStateData(createStatePayload(), list2, list, this.timetoken, this.region, hasAnythingToSubscribe(), subscribedToOnlyTemporaryUnavailable(), this.shouldAnnounce);
    }
}
