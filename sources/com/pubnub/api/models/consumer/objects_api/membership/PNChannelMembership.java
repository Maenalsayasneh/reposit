package com.pubnub.api.models.consumer.objects_api.membership;

import com.google.gson.annotations.JsonAdapter;
import com.pubnub.api.models.consumer.objects_api.util.CustomPayloadJsonInterceptor;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lombok.NonNull;

public abstract class PNChannelMembership {
    private final ChannelId channel;

    public static class ChannelId {
        private String id;

        public ChannelId(String str) {
            this.id = str;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof ChannelId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChannelId)) {
                return false;
            }
            ChannelId channelId = (ChannelId) obj;
            if (!channelId.canEqual(this)) {
                return false;
            }
            String id2 = getId();
            String id3 = channelId.getId();
            return id2 != null ? id2.equals(id3) : id3 == null;
        }

        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String id2 = getId();
            return 59 + (id2 == null ? 43 : id2.hashCode());
        }
    }

    public static class ChannelWithCustom extends PNChannelMembership {
        @JsonAdapter(CustomPayloadJsonInterceptor.class)
        private final Object custom;

        public ChannelWithCustom(@NonNull ChannelId channelId, @NonNull Object obj) {
            super(channelId);
            Objects.requireNonNull(channelId, "channelId is marked @NonNull but is null");
            Objects.requireNonNull(obj, "custom is marked @NonNull but is null");
            this.custom = obj;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof ChannelWithCustom;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChannelWithCustom)) {
                return false;
            }
            ChannelWithCustom channelWithCustom = (ChannelWithCustom) obj;
            if (!channelWithCustom.canEqual(this) || !super.equals(obj)) {
                return false;
            }
            Object custom2 = getCustom();
            Object custom3 = channelWithCustom.getCustom();
            return custom2 != null ? custom2.equals(custom3) : custom3 == null;
        }

        public Object getCustom() {
            return this.custom;
        }

        public int hashCode() {
            int hashCode = super.hashCode();
            Object custom2 = getCustom();
            return (hashCode * 59) + (custom2 == null ? 43 : custom2.hashCode());
        }
    }

    public static class JustChannel extends PNChannelMembership {
        public JustChannel(@NonNull ChannelId channelId) {
            super(channelId);
            Objects.requireNonNull(channelId, "channelId is marked @NonNull but is null");
        }

        public boolean canEqual(Object obj) {
            return obj instanceof JustChannel;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof JustChannel) && ((JustChannel) obj).canEqual(this) && super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    public PNChannelMembership(ChannelId channelId) {
        this.channel = channelId;
    }

    public static PNChannelMembership channel(String str) {
        return new JustChannel(new ChannelId(str));
    }

    public static PNChannelMembership channelWithCustom(String str, Map<String, Object> map) {
        return new ChannelWithCustom(new ChannelId(str), new HashMap(map));
    }

    public ChannelId getChannel() {
        return this.channel;
    }
}
