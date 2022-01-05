package com.pubnub.api.services;

import com.google.gson.JsonElement;
import com.pubnub.api.models.server.DeleteMessagesEnvelope;
import com.pubnub.api.models.server.FetchMessagesEnvelope;
import java.util.Map;
import t0.c0.b;
import t0.c0.f;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface HistoryService {
    @b("v3/history/sub-key/{subKey}/channel/{channels}")
    d<DeleteMessagesEnvelope> deleteMessages(@s("subKey") String str, @s("channels") String str2, @u Map<String, String> map);

    @f("v3/history/sub-key/{subKey}/message-counts/{channels}")
    d<JsonElement> fetchCount(@s("subKey") String str, @s("channels") String str2, @u Map<String, String> map);

    @f("v2/history/sub-key/{subKey}/channel/{channel}")
    d<JsonElement> fetchHistory(@s("subKey") String str, @s("channel") String str2, @u Map<String, String> map);

    @f("v3/history/sub-key/{subKey}/channel/{channels}")
    d<FetchMessagesEnvelope> fetchMessages(@s("subKey") String str, @s("channels") String str2, @u Map<String, String> map);

    @f("v3/history-with-actions/sub-key/{subKey}/channel/{channel}")
    d<FetchMessagesEnvelope> fetchMessagesWithActions(@s("subKey") String str, @s("channel") String str2, @u Map<String, String> map);
}
