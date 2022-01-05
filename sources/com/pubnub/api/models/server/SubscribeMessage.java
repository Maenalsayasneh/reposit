package com.pubnub.api.models.server;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import i0.d.a.a.a;

public class SubscribeMessage {
    @SerializedName("c")
    private String channel;
    @SerializedName("f")
    private String flags;
    @SerializedName("i")
    private String issuingClientId;
    @SerializedName("o")
    private OriginationMetaData originationMetadata;
    @SerializedName("d")
    private JsonElement payload;
    @SerializedName("p")
    private PublishMetaData publishMetaData;
    @SerializedName("a")
    private String shard;
    @SerializedName("k")
    private String subscribeKey;
    @SerializedName("b")
    private String subscriptionMatch;
    @SerializedName("e")
    private Integer type;
    @SerializedName("u")
    private JsonElement userMetadata;

    public static class SubscribeMessageBuilder {
        private String channel;
        private String flags;
        private String issuingClientId;
        private OriginationMetaData originationMetadata;
        private JsonElement payload;
        private PublishMetaData publishMetaData;
        private String shard;
        private String subscribeKey;
        private String subscriptionMatch;
        private Integer type;
        private JsonElement userMetadata;

        public SubscribeMessage build() {
            return new SubscribeMessage(this.shard, this.subscriptionMatch, this.channel, this.payload, this.flags, this.issuingClientId, this.subscribeKey, this.originationMetadata, this.publishMetaData, this.userMetadata, this.type);
        }

        public SubscribeMessageBuilder channel(String str) {
            this.channel = str;
            return this;
        }

        public SubscribeMessageBuilder flags(String str) {
            this.flags = str;
            return this;
        }

        public SubscribeMessageBuilder issuingClientId(String str) {
            this.issuingClientId = str;
            return this;
        }

        public SubscribeMessageBuilder originationMetadata(OriginationMetaData originationMetaData) {
            this.originationMetadata = originationMetaData;
            return this;
        }

        public SubscribeMessageBuilder payload(JsonElement jsonElement) {
            this.payload = jsonElement;
            return this;
        }

        public SubscribeMessageBuilder publishMetaData(PublishMetaData publishMetaData2) {
            this.publishMetaData = publishMetaData2;
            return this;
        }

        public SubscribeMessageBuilder shard(String str) {
            this.shard = str;
            return this;
        }

        public SubscribeMessageBuilder subscribeKey(String str) {
            this.subscribeKey = str;
            return this;
        }

        public SubscribeMessageBuilder subscriptionMatch(String str) {
            this.subscriptionMatch = str;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("SubscribeMessage.SubscribeMessageBuilder(shard=");
            P0.append(this.shard);
            P0.append(", subscriptionMatch=");
            P0.append(this.subscriptionMatch);
            P0.append(", channel=");
            P0.append(this.channel);
            P0.append(", payload=");
            P0.append(this.payload);
            P0.append(", flags=");
            P0.append(this.flags);
            P0.append(", issuingClientId=");
            P0.append(this.issuingClientId);
            P0.append(", subscribeKey=");
            P0.append(this.subscribeKey);
            P0.append(", originationMetadata=");
            P0.append(this.originationMetadata);
            P0.append(", publishMetaData=");
            P0.append(this.publishMetaData);
            P0.append(", userMetadata=");
            P0.append(this.userMetadata);
            P0.append(", type=");
            P0.append(this.type);
            P0.append(")");
            return P0.toString();
        }

        public SubscribeMessageBuilder type(Integer num) {
            this.type = num;
            return this;
        }

        public SubscribeMessageBuilder userMetadata(JsonElement jsonElement) {
            this.userMetadata = jsonElement;
            return this;
        }
    }

    public SubscribeMessage(String str, String str2, String str3, JsonElement jsonElement, String str4, String str5, String str6, OriginationMetaData originationMetaData, PublishMetaData publishMetaData2, JsonElement jsonElement2, Integer num) {
        this.shard = str;
        this.subscriptionMatch = str2;
        this.channel = str3;
        this.payload = jsonElement;
        this.flags = str4;
        this.issuingClientId = str5;
        this.subscribeKey = str6;
        this.originationMetadata = originationMetaData;
        this.publishMetaData = publishMetaData2;
        this.userMetadata = jsonElement2;
        this.type = num;
    }

    public static SubscribeMessageBuilder builder() {
        return new SubscribeMessageBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SubscribeMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscribeMessage)) {
            return false;
        }
        SubscribeMessage subscribeMessage = (SubscribeMessage) obj;
        if (!subscribeMessage.canEqual(this)) {
            return false;
        }
        String shard2 = getShard();
        String shard3 = subscribeMessage.getShard();
        if (shard2 != null ? !shard2.equals(shard3) : shard3 != null) {
            return false;
        }
        String subscriptionMatch2 = getSubscriptionMatch();
        String subscriptionMatch3 = subscribeMessage.getSubscriptionMatch();
        if (subscriptionMatch2 != null ? !subscriptionMatch2.equals(subscriptionMatch3) : subscriptionMatch3 != null) {
            return false;
        }
        String channel2 = getChannel();
        String channel3 = subscribeMessage.getChannel();
        if (channel2 != null ? !channel2.equals(channel3) : channel3 != null) {
            return false;
        }
        JsonElement payload2 = getPayload();
        JsonElement payload3 = subscribeMessage.getPayload();
        if (payload2 != null ? !payload2.equals(payload3) : payload3 != null) {
            return false;
        }
        String flags2 = getFlags();
        String flags3 = subscribeMessage.getFlags();
        if (flags2 != null ? !flags2.equals(flags3) : flags3 != null) {
            return false;
        }
        String issuingClientId2 = getIssuingClientId();
        String issuingClientId3 = subscribeMessage.getIssuingClientId();
        if (issuingClientId2 != null ? !issuingClientId2.equals(issuingClientId3) : issuingClientId3 != null) {
            return false;
        }
        String subscribeKey2 = getSubscribeKey();
        String subscribeKey3 = subscribeMessage.getSubscribeKey();
        if (subscribeKey2 != null ? !subscribeKey2.equals(subscribeKey3) : subscribeKey3 != null) {
            return false;
        }
        OriginationMetaData originationMetadata2 = getOriginationMetadata();
        OriginationMetaData originationMetadata3 = subscribeMessage.getOriginationMetadata();
        if (originationMetadata2 != null ? !originationMetadata2.equals(originationMetadata3) : originationMetadata3 != null) {
            return false;
        }
        PublishMetaData publishMetaData2 = getPublishMetaData();
        PublishMetaData publishMetaData3 = subscribeMessage.getPublishMetaData();
        if (publishMetaData2 != null ? !publishMetaData2.equals(publishMetaData3) : publishMetaData3 != null) {
            return false;
        }
        JsonElement userMetadata2 = getUserMetadata();
        JsonElement userMetadata3 = subscribeMessage.getUserMetadata();
        if (userMetadata2 != null ? !userMetadata2.equals(userMetadata3) : userMetadata3 != null) {
            return false;
        }
        Integer type2 = getType();
        Integer type3 = subscribeMessage.getType();
        return type2 != null ? type2.equals(type3) : type3 == null;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getFlags() {
        return this.flags;
    }

    public String getIssuingClientId() {
        return this.issuingClientId;
    }

    public OriginationMetaData getOriginationMetadata() {
        return this.originationMetadata;
    }

    public JsonElement getPayload() {
        return this.payload;
    }

    public PublishMetaData getPublishMetaData() {
        return this.publishMetaData;
    }

    public String getShard() {
        return this.shard;
    }

    public String getSubscribeKey() {
        return this.subscribeKey;
    }

    public String getSubscriptionMatch() {
        return this.subscriptionMatch;
    }

    public Integer getType() {
        return this.type;
    }

    public JsonElement getUserMetadata() {
        return this.userMetadata;
    }

    public int hashCode() {
        String shard2 = getShard();
        int i = 43;
        int hashCode = shard2 == null ? 43 : shard2.hashCode();
        String subscriptionMatch2 = getSubscriptionMatch();
        int hashCode2 = ((hashCode + 59) * 59) + (subscriptionMatch2 == null ? 43 : subscriptionMatch2.hashCode());
        String channel2 = getChannel();
        int hashCode3 = (hashCode2 * 59) + (channel2 == null ? 43 : channel2.hashCode());
        JsonElement payload2 = getPayload();
        int hashCode4 = (hashCode3 * 59) + (payload2 == null ? 43 : payload2.hashCode());
        String flags2 = getFlags();
        int hashCode5 = (hashCode4 * 59) + (flags2 == null ? 43 : flags2.hashCode());
        String issuingClientId2 = getIssuingClientId();
        int hashCode6 = (hashCode5 * 59) + (issuingClientId2 == null ? 43 : issuingClientId2.hashCode());
        String subscribeKey2 = getSubscribeKey();
        int hashCode7 = (hashCode6 * 59) + (subscribeKey2 == null ? 43 : subscribeKey2.hashCode());
        OriginationMetaData originationMetadata2 = getOriginationMetadata();
        int hashCode8 = (hashCode7 * 59) + (originationMetadata2 == null ? 43 : originationMetadata2.hashCode());
        PublishMetaData publishMetaData2 = getPublishMetaData();
        int hashCode9 = (hashCode8 * 59) + (publishMetaData2 == null ? 43 : publishMetaData2.hashCode());
        JsonElement userMetadata2 = getUserMetadata();
        int hashCode10 = (hashCode9 * 59) + (userMetadata2 == null ? 43 : userMetadata2.hashCode());
        Integer type2 = getType();
        int i2 = hashCode10 * 59;
        if (type2 != null) {
            i = type2.hashCode();
        }
        return i2 + i;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setFlags(String str) {
        this.flags = str;
    }

    public void setIssuingClientId(String str) {
        this.issuingClientId = str;
    }

    public void setOriginationMetadata(OriginationMetaData originationMetaData) {
        this.originationMetadata = originationMetaData;
    }

    public void setPayload(JsonElement jsonElement) {
        this.payload = jsonElement;
    }

    public void setPublishMetaData(PublishMetaData publishMetaData2) {
        this.publishMetaData = publishMetaData2;
    }

    public void setShard(String str) {
        this.shard = str;
    }

    public void setSubscribeKey(String str) {
        this.subscribeKey = str;
    }

    public void setSubscriptionMatch(String str) {
        this.subscriptionMatch = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUserMetadata(JsonElement jsonElement) {
        this.userMetadata = jsonElement;
    }

    public boolean supportsEncryption() {
        Integer num = this.type;
        return num == null || num.intValue() == 0 || this.type.intValue() == 4;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SubscribeMessage(shard=");
        P0.append(getShard());
        P0.append(", subscriptionMatch=");
        P0.append(getSubscriptionMatch());
        P0.append(", channel=");
        P0.append(getChannel());
        P0.append(", payload=");
        P0.append(getPayload());
        P0.append(", flags=");
        P0.append(getFlags());
        P0.append(", issuingClientId=");
        P0.append(getIssuingClientId());
        P0.append(", subscribeKey=");
        P0.append(getSubscribeKey());
        P0.append(", originationMetadata=");
        P0.append(getOriginationMetadata());
        P0.append(", publishMetaData=");
        P0.append(getPublishMetaData());
        P0.append(", userMetadata=");
        P0.append(getUserMetadata());
        P0.append(", type=");
        P0.append(getType());
        P0.append(")");
        return P0.toString();
    }
}
