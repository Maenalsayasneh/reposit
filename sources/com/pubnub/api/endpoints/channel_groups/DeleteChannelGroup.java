package com.pubnub.api.endpoints.channel_groups;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.channel_group.PNChannelGroupsDeleteGroupResult;
import com.pubnub.api.models.server.Envelope;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class DeleteChannelGroup extends Endpoint<Envelope, PNChannelGroupsDeleteGroupResult> {
    private String channelGroup;

    public DeleteChannelGroup(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public DeleteChannelGroup channelGroup(String str) {
        this.channelGroup = str;
        return this;
    }

    public d<Envelope> doWork(Map<String, String> map) {
        return getRetrofit().getChannelGroupService().deleteChannelGroup(getPubnub().getConfiguration().getSubscribeKey(), this.channelGroup, map);
    }

    public List<String> getAffectedChannelGroups() {
        return Collections.singletonList(this.channelGroup);
    }

    public List<String> getAffectedChannels() {
        return null;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNRemoveGroupOperation;
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

    public PNChannelGroupsDeleteGroupResult createResponse(v<Envelope> vVar) throws PubNubException {
        if (vVar.b != null) {
            return PNChannelGroupsDeleteGroupResult.builder().build();
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
    }
}
