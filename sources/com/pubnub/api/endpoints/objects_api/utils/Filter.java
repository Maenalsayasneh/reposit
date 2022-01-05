package com.pubnub.api.endpoints.objects_api.utils;

import com.pubnub.api.PubNubUtil;
import com.pubnub.api.endpoints.Endpoint;
import java.util.HashMap;
import java.util.Map;

public class Filter implements ParameterEnricher {
    public static final String FILTER_PARAM_NAME = "filter";
    private String filter;

    public interface FilterAware<T extends Endpoint<?, ?>> {
        T filter(String str);
    }

    public interface HavingFilter<T extends Endpoint<?, ?>> extends FilterAware<T>, HavingCompositeParameterEnricher {
        T filter(String str) {
            getCompositeParameterEnricher().getFilter().setFilter(str);
            return (Endpoint) this;
        }
    }

    public Map<String, String> enrichParameters(Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        String str = this.filter;
        if (str != null) {
            hashMap.put(FILTER_PARAM_NAME, PubNubUtil.urlEncode(str));
        }
        return hashMap;
    }

    public void setFilter(String str) {
        this.filter = str;
    }
}
