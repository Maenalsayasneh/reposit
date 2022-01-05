package com.pubnub.api.endpoints.channel_groups;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAllChannelsResult;
import com.pubnub.api.models.server.Envelope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class AllChannelsChannelGroup extends Endpoint<Envelope<Object>, PNChannelGroupsAllChannelsResult> {
    private String channelGroup;

    public AllChannelsChannelGroup(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public AllChannelsChannelGroup channelGroup(String str) {
        this.channelGroup = str;
        return this;
    }

    public d<Envelope<Object>> doWork(Map<String, String> map) {
        return getRetrofit().getChannelGroupService().allChannelsChannelGroup(getPubnub().getConfiguration().getSubscribeKey(), this.channelGroup, map);
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return null;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNChannelsForGroupOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public void validateParams() throws PubNubException {
        String str = this.channelGroup;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_GROUP_MISSING).build();
        }
    }

    public PNChannelGroupsAllChannelsResult createResponse(v<Envelope<Object>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t == null || ((Envelope) t).getPayload() == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
        }
        return PNChannelGroupsAllChannelsResult.builder().channels((ArrayList) ((Map) ((Envelope) vVar.b).getPayload()).get("channels")).build();
    }
}
