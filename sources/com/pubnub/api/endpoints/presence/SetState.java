package com.pubnub.api.endpoints.presence;

import com.google.gson.JsonElement;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.builder.dto.StateOperation;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.SubscriptionManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.presence.PNSetStateResult;
import com.pubnub.api.models.server.Envelope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class SetState extends Endpoint<Envelope<JsonElement>, PNSetStateResult> {
    private List<String> channelGroups = new ArrayList();
    private List<String> channels = new ArrayList();
    private Object state;
    private SubscriptionManager subscriptionManager;
    private String uuid;

    public SetState(PubNub pubNub, SubscriptionManager subscriptionManager2, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
        this.subscriptionManager = subscriptionManager2;
    }

    public SetState channelGroups(List<String> list) {
        this.channelGroups = list;
        return this;
    }

    public SetState channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public d<Envelope<JsonElement>> doWork(Map<String, String> map) throws PubNubException {
        String str = this.uuid;
        if (str == null) {
            str = getPubnub().getConfiguration().getUuid();
        }
        if (str.equals(getPubnub().getConfiguration().getUuid())) {
            this.subscriptionManager.adaptStateBuilder(StateOperation.builder().state(this.state).channels(this.channels).channelGroups(this.channelGroups).build());
        }
        int size = this.channelGroups.size();
        String str2 = InstabugDbContract.COMMA_SEP;
        if (size > 0) {
            map.put("channel-group", PubNubUtil.joinString(this.channelGroups, str2));
        }
        map.put("state", PubNubUtil.urlEncode(getPubnub().getMapper().toJson(this.state)));
        map.putAll(encodeParams(map));
        if (this.channels.size() > 0) {
            str2 = PubNubUtil.joinString(this.channels, str2);
        }
        return getRetrofit().getPresenceService().setState(getPubnub().getConfiguration().getSubscribeKey(), str2, str, map);
    }

    public List<String> getAffectedChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNSetStateOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public SetState state(Object obj) {
        this.state = obj;
        return this;
    }

    public SetState uuid(String str) {
        this.uuid = str;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (this.state == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_STATE_MISSING).build();
        } else if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        } else if (this.channels.size() == 0 && this.channelGroups.size() == 0) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_AND_GROUP_MISSING).build();
        }
    }

    public PNSetStateResult createResponse(v<Envelope<JsonElement>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null && ((Envelope) t).getPayload() != null) {
            return PNSetStateResult.builder().state((JsonElement) ((Envelope) vVar.b).getPayload()).build();
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
    }
}
