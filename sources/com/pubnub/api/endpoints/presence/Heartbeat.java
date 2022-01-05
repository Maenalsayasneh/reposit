package com.pubnub.api.endpoints.presence;

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
import com.pubnub.api.models.server.Envelope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class Heartbeat extends Endpoint<Envelope, Boolean> {
    private List<String> channelGroups = new ArrayList();
    private List<String> channels = new ArrayList();
    private Object state;

    public Heartbeat(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public Heartbeat channelGroups(List<String> list) {
        this.channelGroups = list;
        return this;
    }

    public Heartbeat channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public d<Envelope> doWork(Map<String, String> map) throws PubNubException {
        map.put("heartbeat", String.valueOf(getPubnub().getConfiguration().getPresenceTimeout()));
        int size = this.channelGroups.size();
        String str = InstabugDbContract.COMMA_SEP;
        if (size > 0) {
            map.put("channel-group", PubNubUtil.joinString(this.channelGroups, str));
        }
        if (this.channels.size() > 0) {
            str = PubNubUtil.joinString(this.channels, str);
        }
        if (this.state != null) {
            map.put("state", PubNubUtil.urlEncode(getPubnub().getMapper().toJson(this.state)));
        }
        map.putAll(encodeParams(map));
        return getRetrofit().getPresenceService().heartbeat(getPubnub().getConfiguration().getSubscribeKey(), str, map);
    }

    public List<String> getAffectedChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNHeartbeatOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public Heartbeat state(Object obj) {
        this.state = obj;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        } else if (this.channels.size() == 0 && this.channelGroups.size() == 0) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_AND_GROUP_MISSING).build();
        }
    }

    public Boolean createResponse(v<Envelope> vVar) throws PubNubException {
        return Boolean.TRUE;
    }
}
