package com.pubnub.api.models.consumer.access_manager;

import i0.d.a.a.a;
import java.util.Map;

public class PNAccessManagerGrantResult {
    private Map<String, Map<String, PNAccessManagerKeyData>> channelGroups;
    private Map<String, Map<String, PNAccessManagerKeyData>> channels;
    private String level;
    private String subscribeKey;
    private int ttl;
    private Map<String, Map<String, PNAccessManagerKeyData>> uuids;

    public static class PNAccessManagerGrantResultBuilder {
        private Map<String, Map<String, PNAccessManagerKeyData>> channelGroups;
        private Map<String, Map<String, PNAccessManagerKeyData>> channels;
        private String level;
        private String subscribeKey;
        private int ttl;
        private Map<String, Map<String, PNAccessManagerKeyData>> uuids;

        public PNAccessManagerGrantResult build() {
            return new PNAccessManagerGrantResult(this.level, this.ttl, this.subscribeKey, this.channels, this.channelGroups, this.uuids);
        }

        public PNAccessManagerGrantResultBuilder channelGroups(Map<String, Map<String, PNAccessManagerKeyData>> map) {
            this.channelGroups = map;
            return this;
        }

        public PNAccessManagerGrantResultBuilder channels(Map<String, Map<String, PNAccessManagerKeyData>> map) {
            this.channels = map;
            return this;
        }

        public PNAccessManagerGrantResultBuilder level(String str) {
            this.level = str;
            return this;
        }

        public PNAccessManagerGrantResultBuilder subscribeKey(String str) {
            this.subscribeKey = str;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNAccessManagerGrantResult.PNAccessManagerGrantResultBuilder(level=");
            P0.append(this.level);
            P0.append(", ttl=");
            P0.append(this.ttl);
            P0.append(", subscribeKey=");
            P0.append(this.subscribeKey);
            P0.append(", channels=");
            P0.append(this.channels);
            P0.append(", channelGroups=");
            P0.append(this.channelGroups);
            P0.append(", uuids=");
            P0.append(this.uuids);
            P0.append(")");
            return P0.toString();
        }

        public PNAccessManagerGrantResultBuilder ttl(int i) {
            this.ttl = i;
            return this;
        }

        public PNAccessManagerGrantResultBuilder uuids(Map<String, Map<String, PNAccessManagerKeyData>> map) {
            this.uuids = map;
            return this;
        }
    }

    public PNAccessManagerGrantResult(String str, int i, String str2, Map<String, Map<String, PNAccessManagerKeyData>> map, Map<String, Map<String, PNAccessManagerKeyData>> map2, Map<String, Map<String, PNAccessManagerKeyData>> map3) {
        this.level = str;
        this.ttl = i;
        this.subscribeKey = str2;
        this.channels = map;
        this.channelGroups = map2;
        this.uuids = map3;
    }

    public static PNAccessManagerGrantResultBuilder builder() {
        return new PNAccessManagerGrantResultBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNAccessManagerGrantResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNAccessManagerGrantResult)) {
            return false;
        }
        PNAccessManagerGrantResult pNAccessManagerGrantResult = (PNAccessManagerGrantResult) obj;
        if (!pNAccessManagerGrantResult.canEqual(this)) {
            return false;
        }
        String level2 = getLevel();
        String level3 = pNAccessManagerGrantResult.getLevel();
        if (level2 != null ? !level2.equals(level3) : level3 != null) {
            return false;
        }
        if (getTtl() != pNAccessManagerGrantResult.getTtl()) {
            return false;
        }
        String subscribeKey2 = getSubscribeKey();
        String subscribeKey3 = pNAccessManagerGrantResult.getSubscribeKey();
        if (subscribeKey2 != null ? !subscribeKey2.equals(subscribeKey3) : subscribeKey3 != null) {
            return false;
        }
        Map<String, Map<String, PNAccessManagerKeyData>> channels2 = getChannels();
        Map<String, Map<String, PNAccessManagerKeyData>> channels3 = pNAccessManagerGrantResult.getChannels();
        if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
            return false;
        }
        Map<String, Map<String, PNAccessManagerKeyData>> channelGroups2 = getChannelGroups();
        Map<String, Map<String, PNAccessManagerKeyData>> channelGroups3 = pNAccessManagerGrantResult.getChannelGroups();
        if (channelGroups2 != null ? !channelGroups2.equals(channelGroups3) : channelGroups3 != null) {
            return false;
        }
        Map<String, Map<String, PNAccessManagerKeyData>> uuids2 = getUuids();
        Map<String, Map<String, PNAccessManagerKeyData>> uuids3 = pNAccessManagerGrantResult.getUuids();
        return uuids2 != null ? uuids2.equals(uuids3) : uuids3 == null;
    }

    public Map<String, Map<String, PNAccessManagerKeyData>> getChannelGroups() {
        return this.channelGroups;
    }

    public Map<String, Map<String, PNAccessManagerKeyData>> getChannels() {
        return this.channels;
    }

    public String getLevel() {
        return this.level;
    }

    public String getSubscribeKey() {
        return this.subscribeKey;
    }

    public int getTtl() {
        return this.ttl;
    }

    public Map<String, Map<String, PNAccessManagerKeyData>> getUuids() {
        return this.uuids;
    }

    public int hashCode() {
        String level2 = getLevel();
        int i = 43;
        int ttl2 = getTtl() + (((level2 == null ? 43 : level2.hashCode()) + 59) * 59);
        String subscribeKey2 = getSubscribeKey();
        int hashCode = (ttl2 * 59) + (subscribeKey2 == null ? 43 : subscribeKey2.hashCode());
        Map<String, Map<String, PNAccessManagerKeyData>> channels2 = getChannels();
        int hashCode2 = (hashCode * 59) + (channels2 == null ? 43 : channels2.hashCode());
        Map<String, Map<String, PNAccessManagerKeyData>> channelGroups2 = getChannelGroups();
        int hashCode3 = (hashCode2 * 59) + (channelGroups2 == null ? 43 : channelGroups2.hashCode());
        Map<String, Map<String, PNAccessManagerKeyData>> uuids2 = getUuids();
        int i2 = hashCode3 * 59;
        if (uuids2 != null) {
            i = uuids2.hashCode();
        }
        return i2 + i;
    }

    public void setChannelGroups(Map<String, Map<String, PNAccessManagerKeyData>> map) {
        this.channelGroups = map;
    }

    public void setChannels(Map<String, Map<String, PNAccessManagerKeyData>> map) {
        this.channels = map;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setSubscribeKey(String str) {
        this.subscribeKey = str;
    }

    public void setTtl(int i) {
        this.ttl = i;
    }

    public void setUuids(Map<String, Map<String, PNAccessManagerKeyData>> map) {
        this.uuids = map;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNAccessManagerGrantResult(level=");
        P0.append(getLevel());
        P0.append(", ttl=");
        P0.append(getTtl());
        P0.append(", subscribeKey=");
        P0.append(getSubscribeKey());
        P0.append(", channels=");
        P0.append(getChannels());
        P0.append(", channelGroups=");
        P0.append(getChannelGroups());
        P0.append(", uuids=");
        P0.append(getUuids());
        P0.append(")");
        return P0.toString();
    }
}
