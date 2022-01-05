package com.pubnub.api.endpoints.channel_groups;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAddChannelResult;
import com.pubnub.api.models.server.Envelope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class AddChannelChannelGroup extends Endpoint<Envelope, PNChannelGroupsAddChannelResult> {
    private String channelGroup;
    private List<String> channels = new ArrayList();

    public AddChannelChannelGroup(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public AddChannelChannelGroup channelGroup(String str) {
        this.channelGroup = str;
        return this;
    }

    public AddChannelChannelGroup channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public d<Envelope> doWork(Map<String, String> map) {
        if (this.channels.size() > 0) {
            map.put("add", PubNubUtil.joinString(this.channels, InstabugDbContract.COMMA_SEP));
        }
        return getRetrofit().getChannelGroupService().addChannelChannelGroup(getPubnub().getConfiguration().getSubscribeKey(), this.channelGroup, map);
    }

    public List<String> getAffectedChannelGroups() {
        return Collections.singletonList(this.channelGroup);
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNAddChannelsToGroupOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public void validateParams() throws PubNubException {
        String str = this.channelGroup;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_GROUP_MISSING).build();
        } else if (this.channels.size() == 0) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
    }

    public PNChannelGroupsAddChannelResult createResponse(v<Envelope> vVar) throws PubNubException {
        if (vVar.b != null) {
            return PNChannelGroupsAddChannelResult.builder().build();
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
    }
}
