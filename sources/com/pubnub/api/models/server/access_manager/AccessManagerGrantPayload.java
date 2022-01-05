package com.pubnub.api.models.server.access_manager;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData;
import com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeysData;
import java.util.Map;

public class AccessManagerGrantPayload {
    @SerializedName("auths")
    private Map<String, PNAccessManagerKeyData> authKeys;
    @SerializedName("channel")
    private String channel;
    @SerializedName("channel-groups")
    private JsonElement channelGroups;
    @SerializedName("channels")
    private Map<String, PNAccessManagerKeysData> channels;
    @SerializedName("level")
    private String level;
    @SerializedName("subscribe_key")
    private String subscribeKey;
    private int ttl;
    @SerializedName("uuids")
    private Map<String, PNAccessManagerKeysData> uuids;

    public Map<String, PNAccessManagerKeyData> getAuthKeys() {
        return this.authKeys;
    }

    public String getChannel() {
        return this.channel;
    }

    public JsonElement getChannelGroups() {
        return this.channelGroups;
    }

    public Map<String, PNAccessManagerKeysData> getChannels() {
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

    public Map<String, PNAccessManagerKeysData> getUuids() {
        return this.uuids;
    }
}
