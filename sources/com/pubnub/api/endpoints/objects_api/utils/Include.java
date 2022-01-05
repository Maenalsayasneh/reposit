package com.pubnub.api.endpoints.objects_api.utils;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.Endpoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Include implements ParameterEnricher {
    public static final String INCLUDE_CHANNEL_CUSTOM_PARAM_VALUE = "channel.custom";
    public static final String INCLUDE_CHANNEL_PARAM_VALUE = "channel";
    public static final String INCLUDE_CUSTOM_PARAM_VALUE = "custom";
    public static final String INCLUDE_PARAM_NAME = "include";
    public static final String INCLUDE_UUID_CUSTOM_PARAM_VALUE = "uuid.custom";
    public static final String INCLUDE_UUID_PARAM_VALUE = "uuid";
    private final List<String> inclusionFlags = new ArrayList();

    public interface ChannelIncludeAware<T extends Endpoint<?, ?>> {
        T includeChannel(PNChannelDetailsLevel pNChannelDetailsLevel);
    }

    public interface CustomIncludeAware<T extends Endpoint<?, ?>> {
        T includeCustom(boolean z);
    }

    public interface HavingChannelInclude<T extends Endpoint<?, ?>> extends ChannelIncludeAware<T>, HavingCompositeParameterEnricher {
        T includeChannel(PNChannelDetailsLevel pNChannelDetailsLevel) {
            getCompositeParameterEnricher().getInclude().addInclusionFlag(pNChannelDetailsLevel.paramValue);
            return (Endpoint) this;
        }
    }

    public interface HavingCustomInclude<T extends Endpoint<?, ?>> extends CustomIncludeAware<T>, HavingCompositeParameterEnricher {
        T includeCustom(boolean z) {
            if (z) {
                getCompositeParameterEnricher().getInclude().addInclusionFlag(Include.INCLUDE_CUSTOM_PARAM_VALUE);
            }
            return (Endpoint) this;
        }
    }

    public interface HavingUUIDInclude<T extends Endpoint<?, ?>> extends UUIDIncludeAware<T>, HavingCompositeParameterEnricher {
        T includeUUID(PNUUIDDetailsLevel pNUUIDDetailsLevel) {
            getCompositeParameterEnricher().getInclude().addInclusionFlag(pNUUIDDetailsLevel.paramValue);
            return (Endpoint) this;
        }
    }

    public enum PNChannelDetailsLevel {
        CHANNEL(Include.INCLUDE_CHANNEL_PARAM_VALUE),
        CHANNEL_WITH_CUSTOM(Include.INCLUDE_CHANNEL_CUSTOM_PARAM_VALUE);
        
        /* access modifiers changed from: private */
        public final String paramValue;

        private PNChannelDetailsLevel(String str) {
            this.paramValue = str;
        }
    }

    public enum PNUUIDDetailsLevel {
        UUID("uuid"),
        UUID_WITH_CUSTOM(Include.INCLUDE_UUID_CUSTOM_PARAM_VALUE);
        
        /* access modifiers changed from: private */
        public final String paramValue;

        private PNUUIDDetailsLevel(String str) {
            this.paramValue = str;
        }
    }

    public interface UUIDIncludeAware<T extends Endpoint<?, ?>> {
        T includeUUID(PNUUIDDetailsLevel pNUUIDDetailsLevel);
    }

    private String join(Collection<String> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(InstabugDbContract.COMMA_SEP);
            }
        }
        return sb.toString();
    }

    public void addInclusionFlag(String str) {
        this.inclusionFlags.add(str);
    }

    public Map<String, String> enrichParameters(Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        if (!this.inclusionFlags.isEmpty()) {
            hashMap.put(INCLUDE_PARAM_NAME, join(this.inclusionFlags));
        }
        return hashMap;
    }
}
