package com.pubnub.api.models.server;

import com.google.gson.annotations.SerializedName;
import i0.d.a.a.a;
import java.util.List;

public class SubscribeEnvelope {
    @SerializedName("m")
    private final List<SubscribeMessage> messages;
    @SerializedName("t")
    private final SubscribeMetadata metadata;

    public SubscribeEnvelope(List<SubscribeMessage> list, SubscribeMetadata subscribeMetadata) {
        this.messages = list;
        this.metadata = subscribeMetadata;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SubscribeEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscribeEnvelope)) {
            return false;
        }
        SubscribeEnvelope subscribeEnvelope = (SubscribeEnvelope) obj;
        if (!subscribeEnvelope.canEqual(this)) {
            return false;
        }
        List<SubscribeMessage> messages2 = getMessages();
        List<SubscribeMessage> messages3 = subscribeEnvelope.getMessages();
        if (messages2 != null ? !messages2.equals(messages3) : messages3 != null) {
            return false;
        }
        SubscribeMetadata metadata2 = getMetadata();
        SubscribeMetadata metadata3 = subscribeEnvelope.getMetadata();
        return metadata2 != null ? metadata2.equals(metadata3) : metadata3 == null;
    }

    public List<SubscribeMessage> getMessages() {
        return this.messages;
    }

    public SubscribeMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        List<SubscribeMessage> messages2 = getMessages();
        int i = 43;
        int hashCode = messages2 == null ? 43 : messages2.hashCode();
        SubscribeMetadata metadata2 = getMetadata();
        int i2 = (hashCode + 59) * 59;
        if (metadata2 != null) {
            i = metadata2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SubscribeEnvelope(messages=");
        P0.append(getMessages());
        P0.append(", metadata=");
        P0.append(getMetadata());
        P0.append(")");
        return P0.toString();
    }
}
