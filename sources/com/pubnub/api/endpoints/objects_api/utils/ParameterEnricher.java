package com.pubnub.api.endpoints.objects_api.utils;

import com.pubnub.api.PubNubException;
import java.util.Map;

public interface ParameterEnricher {
    Map<String, String> enrichParameters(Map<String, String> map);

    void validateParameters() throws PubNubException {
    }
}
