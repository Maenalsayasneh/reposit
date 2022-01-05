package com.pubnub.api.models.consumer.pubsub;

import com.google.gson.JsonElement;
import i0.d.a.a.a;
import java.util.List;

public class PNPresenceEventResult {
    @Deprecated
    private String actualChannel;
    private String channel;
    private String event;
    private Boolean hereNowRefresh;
    private List<String> join;
    private List<String> leave;
    private Integer occupancy;
    private JsonElement state;
    @Deprecated
    private String subscribedChannel;
    private String subscription;
    private List<String> timeout;
    private Long timestamp;
    private Long timetoken;
    private Object userMetadata;
    private String uuid;

    public static class PNPresenceEventResultBuilder {
        private String actualChannel;
        private String channel;
        private String event;
        private Boolean hereNowRefresh;
        private List<String> join;
        private List<String> leave;
        private Integer occupancy;
        private JsonElement state;
        private String subscribedChannel;
        private String subscription;
        private List<String> timeout;
        private Long timestamp;
        private Long timetoken;
        private Object userMetadata;
        private String uuid;

        @Deprecated
        public PNPresenceEventResultBuilder actualChannel(String str) {
            this.actualChannel = str;
            return this;
        }

        public PNPresenceEventResult build() {
            return new PNPresenceEventResult(this.event, this.uuid, this.timestamp, this.occupancy, this.state, this.subscribedChannel, this.actualChannel, this.channel, this.subscription, this.timetoken, this.userMetadata, this.join, this.leave, this.timeout, this.hereNowRefresh);
        }

        public PNPresenceEventResultBuilder channel(String str) {
            this.channel = str;
            return this;
        }

        public PNPresenceEventResultBuilder event(String str) {
            this.event = str;
            return this;
        }

        public PNPresenceEventResultBuilder hereNowRefresh(Boolean bool) {
            this.hereNowRefresh = bool;
            return this;
        }

        public PNPresenceEventResultBuilder join(List<String> list) {
            this.join = list;
            return this;
        }

        public PNPresenceEventResultBuilder leave(List<String> list) {
            this.leave = list;
            return this;
        }

        public PNPresenceEventResultBuilder occupancy(Integer num) {
            this.occupancy = num;
            return this;
        }

        public PNPresenceEventResultBuilder state(JsonElement jsonElement) {
            this.state = jsonElement;
            return this;
        }

        @Deprecated
        public PNPresenceEventResultBuilder subscribedChannel(String str) {
            this.subscribedChannel = str;
            return this;
        }

        public PNPresenceEventResultBuilder subscription(String str) {
            this.subscription = str;
            return this;
        }

        public PNPresenceEventResultBuilder timeout(List<String> list) {
            this.timeout = list;
            return this;
        }

        public PNPresenceEventResultBuilder timestamp(Long l) {
            this.timestamp = l;
            return this;
        }

        public PNPresenceEventResultBuilder timetoken(Long l) {
            this.timetoken = l;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNPresenceEventResult.PNPresenceEventResultBuilder(event=");
            P0.append(this.event);
            P0.append(", uuid=");
            P0.append(this.uuid);
            P0.append(", timestamp=");
            P0.append(this.timestamp);
            P0.append(", occupancy=");
            P0.append(this.occupancy);
            P0.append(", state=");
            P0.append(this.state);
            P0.append(", subscribedChannel=");
            P0.append(this.subscribedChannel);
            P0.append(", actualChannel=");
            P0.append(this.actualChannel);
            P0.append(", channel=");
            P0.append(this.channel);
            P0.append(", subscription=");
            P0.append(this.subscription);
            P0.append(", timetoken=");
            P0.append(this.timetoken);
            P0.append(", userMetadata=");
            P0.append(this.userMetadata);
            P0.append(", join=");
            P0.append(this.join);
            P0.append(", leave=");
            P0.append(this.leave);
            P0.append(", timeout=");
            P0.append(this.timeout);
            P0.append(", hereNowRefresh=");
            P0.append(this.hereNowRefresh);
            P0.append(")");
            return P0.toString();
        }

        public PNPresenceEventResultBuilder userMetadata(Object obj) {
            this.userMetadata = obj;
            return this;
        }

        public PNPresenceEventResultBuilder uuid(String str) {
            this.uuid = str;
            return this;
        }
    }

    public PNPresenceEventResult(String str, String str2, Long l, Integer num, JsonElement jsonElement, String str3, String str4, String str5, String str6, Long l2, Object obj, List<String> list, List<String> list2, List<String> list3, Boolean bool) {
        this.event = str;
        this.uuid = str2;
        this.timestamp = l;
        this.occupancy = num;
        this.state = jsonElement;
        this.subscribedChannel = str3;
        this.actualChannel = str4;
        this.channel = str5;
        this.subscription = str6;
        this.timetoken = l2;
        this.userMetadata = obj;
        this.join = list;
        this.leave = list2;
        this.timeout = list3;
        this.hereNowRefresh = bool;
    }

    public static PNPresenceEventResultBuilder builder() {
        return new PNPresenceEventResultBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNPresenceEventResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNPresenceEventResult)) {
            return false;
        }
        PNPresenceEventResult pNPresenceEventResult = (PNPresenceEventResult) obj;
        if (!pNPresenceEventResult.canEqual(this)) {
            return false;
        }
        String event2 = getEvent();
        String event3 = pNPresenceEventResult.getEvent();
        if (event2 != null ? !event2.equals(event3) : event3 != null) {
            return false;
        }
        String uuid2 = getUuid();
        String uuid3 = pNPresenceEventResult.getUuid();
        if (uuid2 != null ? !uuid2.equals(uuid3) : uuid3 != null) {
            return false;
        }
        Long timestamp2 = getTimestamp();
        Long timestamp3 = pNPresenceEventResult.getTimestamp();
        if (timestamp2 != null ? !timestamp2.equals(timestamp3) : timestamp3 != null) {
            return false;
        }
        Integer occupancy2 = getOccupancy();
        Integer occupancy3 = pNPresenceEventResult.getOccupancy();
        if (occupancy2 != null ? !occupancy2.equals(occupancy3) : occupancy3 != null) {
            return false;
        }
        JsonElement state2 = getState();
        JsonElement state3 = pNPresenceEventResult.getState();
        if (state2 != null ? !state2.equals(state3) : state3 != null) {
            return false;
        }
        String subscribedChannel2 = getSubscribedChannel();
        String subscribedChannel3 = pNPresenceEventResult.getSubscribedChannel();
        if (subscribedChannel2 != null ? !subscribedChannel2.equals(subscribedChannel3) : subscribedChannel3 != null) {
            return false;
        }
        String actualChannel2 = getActualChannel();
        String actualChannel3 = pNPresenceEventResult.getActualChannel();
        if (actualChannel2 != null ? !actualChannel2.equals(actualChannel3) : actualChannel3 != null) {
            return false;
        }
        String channel2 = getChannel();
        String channel3 = pNPresenceEventResult.getChannel();
        if (channel2 != null ? !channel2.equals(channel3) : channel3 != null) {
            return false;
        }
        String subscription2 = getSubscription();
        String subscription3 = pNPresenceEventResult.getSubscription();
        if (subscription2 != null ? !subscription2.equals(subscription3) : subscription3 != null) {
            return false;
        }
        Long timetoken2 = getTimetoken();
        Long timetoken3 = pNPresenceEventResult.getTimetoken();
        if (timetoken2 != null ? !timetoken2.equals(timetoken3) : timetoken3 != null) {
            return false;
        }
        Object userMetadata2 = getUserMetadata();
        Object userMetadata3 = pNPresenceEventResult.getUserMetadata();
        if (userMetadata2 != null ? !userMetadata2.equals(userMetadata3) : userMetadata3 != null) {
            return false;
        }
        List<String> join2 = getJoin();
        List<String> join3 = pNPresenceEventResult.getJoin();
        if (join2 != null ? !join2.equals(join3) : join3 != null) {
            return false;
        }
        List<String> leave2 = getLeave();
        List<String> leave3 = pNPresenceEventResult.getLeave();
        if (leave2 != null ? !leave2.equals(leave3) : leave3 != null) {
            return false;
        }
        List<String> timeout2 = getTimeout();
        List<String> timeout3 = pNPresenceEventResult.getTimeout();
        if (timeout2 != null ? !timeout2.equals(timeout3) : timeout3 != null) {
            return false;
        }
        Boolean hereNowRefresh2 = getHereNowRefresh();
        Boolean hereNowRefresh3 = pNPresenceEventResult.getHereNowRefresh();
        return hereNowRefresh2 != null ? hereNowRefresh2.equals(hereNowRefresh3) : hereNowRefresh3 == null;
    }

    @Deprecated
    public String getActualChannel() {
        return this.actualChannel;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getEvent() {
        return this.event;
    }

    public Boolean getHereNowRefresh() {
        return this.hereNowRefresh;
    }

    public List<String> getJoin() {
        return this.join;
    }

    public List<String> getLeave() {
        return this.leave;
    }

    public Integer getOccupancy() {
        return this.occupancy;
    }

    public JsonElement getState() {
        return this.state;
    }

    @Deprecated
    public String getSubscribedChannel() {
        return this.subscribedChannel;
    }

    public String getSubscription() {
        return this.subscription;
    }

    public List<String> getTimeout() {
        return this.timeout;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getTimetoken() {
        return this.timetoken;
    }

    public Object getUserMetadata() {
        return this.userMetadata;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String event2 = getEvent();
        int i = 43;
        int hashCode = event2 == null ? 43 : event2.hashCode();
        String uuid2 = getUuid();
        int hashCode2 = ((hashCode + 59) * 59) + (uuid2 == null ? 43 : uuid2.hashCode());
        Long timestamp2 = getTimestamp();
        int hashCode3 = (hashCode2 * 59) + (timestamp2 == null ? 43 : timestamp2.hashCode());
        Integer occupancy2 = getOccupancy();
        int hashCode4 = (hashCode3 * 59) + (occupancy2 == null ? 43 : occupancy2.hashCode());
        JsonElement state2 = getState();
        int hashCode5 = (hashCode4 * 59) + (state2 == null ? 43 : state2.hashCode());
        String subscribedChannel2 = getSubscribedChannel();
        int hashCode6 = (hashCode5 * 59) + (subscribedChannel2 == null ? 43 : subscribedChannel2.hashCode());
        String actualChannel2 = getActualChannel();
        int hashCode7 = (hashCode6 * 59) + (actualChannel2 == null ? 43 : actualChannel2.hashCode());
        String channel2 = getChannel();
        int hashCode8 = (hashCode7 * 59) + (channel2 == null ? 43 : channel2.hashCode());
        String subscription2 = getSubscription();
        int hashCode9 = (hashCode8 * 59) + (subscription2 == null ? 43 : subscription2.hashCode());
        Long timetoken2 = getTimetoken();
        int hashCode10 = (hashCode9 * 59) + (timetoken2 == null ? 43 : timetoken2.hashCode());
        Object userMetadata2 = getUserMetadata();
        int hashCode11 = (hashCode10 * 59) + (userMetadata2 == null ? 43 : userMetadata2.hashCode());
        List<String> join2 = getJoin();
        int hashCode12 = (hashCode11 * 59) + (join2 == null ? 43 : join2.hashCode());
        List<String> leave2 = getLeave();
        int hashCode13 = (hashCode12 * 59) + (leave2 == null ? 43 : leave2.hashCode());
        List<String> timeout2 = getTimeout();
        int hashCode14 = (hashCode13 * 59) + (timeout2 == null ? 43 : timeout2.hashCode());
        Boolean hereNowRefresh2 = getHereNowRefresh();
        int i2 = hashCode14 * 59;
        if (hereNowRefresh2 != null) {
            i = hereNowRefresh2.hashCode();
        }
        return i2 + i;
    }

    @Deprecated
    public void setActualChannel(String str) {
        this.actualChannel = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setHereNowRefresh(Boolean bool) {
        this.hereNowRefresh = bool;
    }

    public void setJoin(List<String> list) {
        this.join = list;
    }

    public void setLeave(List<String> list) {
        this.leave = list;
    }

    public void setOccupancy(Integer num) {
        this.occupancy = num;
    }

    public void setState(JsonElement jsonElement) {
        this.state = jsonElement;
    }

    @Deprecated
    public void setSubscribedChannel(String str) {
        this.subscribedChannel = str;
    }

    public void setSubscription(String str) {
        this.subscription = str;
    }

    public void setTimeout(List<String> list) {
        this.timeout = list;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public void setTimetoken(Long l) {
        this.timetoken = l;
    }

    public void setUserMetadata(Object obj) {
        this.userMetadata = obj;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNPresenceEventResult(event=");
        P0.append(getEvent());
        P0.append(", uuid=");
        P0.append(getUuid());
        P0.append(", timestamp=");
        P0.append(getTimestamp());
        P0.append(", occupancy=");
        P0.append(getOccupancy());
        P0.append(", state=");
        P0.append(getState());
        P0.append(", subscribedChannel=");
        P0.append(getSubscribedChannel());
        P0.append(", actualChannel=");
        P0.append(getActualChannel());
        P0.append(", channel=");
        P0.append(getChannel());
        P0.append(", subscription=");
        P0.append(getSubscription());
        P0.append(", timetoken=");
        P0.append(getTimetoken());
        P0.append(", userMetadata=");
        P0.append(getUserMetadata());
        P0.append(", join=");
        P0.append(getJoin());
        P0.append(", leave=");
        P0.append(getLeave());
        P0.append(", timeout=");
        P0.append(getTimeout());
        P0.append(", hereNowRefresh=");
        P0.append(getHereNowRefresh());
        P0.append(")");
        return P0.toString();
    }
}
