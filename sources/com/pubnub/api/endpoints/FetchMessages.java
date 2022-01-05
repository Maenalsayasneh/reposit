package com.pubnub.api.endpoints;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.objects_api.utils.Pager;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNBoundedPage;
import com.pubnub.api.models.consumer.history.PNFetchMessageItem;
import com.pubnub.api.models.consumer.history.PNFetchMessagesResult;
import com.pubnub.api.models.server.FetchMessagesEnvelope;
import com.pubnub.api.vendor.Crypto;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s0.c.b;
import s0.c.c;
import t0.d;
import t0.v;

public class FetchMessages extends Endpoint<FetchMessagesEnvelope, PNFetchMessagesResult> {
    private static final int DEFAULT_MESSAGES_WITH_ACTIONS = 25;
    private static final int MAX_MESSAGES_WITH_ACTIONS = 25;
    private static final int MULTIPLE_CHANNEL_DEFAULT_MESSAGES = 25;
    private static final int MULTIPLE_CHANNEL_MAX_MESSAGES = 25;
    private static final int SINGLE_CHANNEL_DEFAULT_MESSAGES = 100;
    private static final int SINGLE_CHANNEL_MAX_MESSAGES = 100;
    private static final b log = c.e(FetchMessages.class);
    private List<String> channels = new ArrayList();
    private Long end;
    private Boolean includeMessageActions;
    private boolean includeMessageType = true;
    private Boolean includeMeta;
    private boolean includeUUID = true;
    private Integer maximumPerChannel;
    private Long start;

    public FetchMessages(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    private JsonElement processMessage(JsonElement jsonElement) throws PubNubException {
        String str;
        if (getPubnub().getConfiguration().getCipherKey() == null) {
            return jsonElement;
        }
        Crypto crypto = new Crypto(getPubnub().getConfiguration().getCipherKey(), getPubnub().getConfiguration().isUseRandomInitializationVector());
        MapperManager mapper = getPubnub().getMapper();
        if (!mapper.isJsonObject(jsonElement) || !mapper.hasField(jsonElement, "pn_other")) {
            str = mapper.elementToString(jsonElement);
        } else {
            str = mapper.elementToString(jsonElement, "pn_other");
        }
        JsonElement jsonElement2 = (JsonElement) mapper.fromJson(crypto.decrypt(str), JsonElement.class);
        if (!mapper.isJsonObject(jsonElement) || !mapper.hasField(jsonElement, "pn_other")) {
            return jsonElement2;
        }
        JsonObject asObject = mapper.getAsObject(jsonElement);
        mapper.putOnObject(asObject, "pn_other", jsonElement2);
        return asObject;
    }

    public FetchMessages channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public d<FetchMessagesEnvelope> doWork(Map<String, String> map) throws PubNubException {
        map.put("max", String.valueOf(this.maximumPerChannel));
        Long l = this.start;
        if (l != null) {
            map.put(Pager.START_PARAM_NAME, Long.toString(l.longValue()).toLowerCase());
        }
        Long l2 = this.end;
        if (l2 != null) {
            map.put(Pager.END_PARAM_NAME, Long.toString(l2.longValue()).toLowerCase());
        }
        if (this.includeMeta.booleanValue()) {
            map.put("include_meta", String.valueOf(this.includeMeta));
        }
        map.put("include_uuid", Boolean.toString(this.includeUUID));
        map.put("include_message_type", Boolean.toString(this.includeMessageType));
        if (!this.includeMessageActions.booleanValue()) {
            return getRetrofit().getHistoryService().fetchMessages(getPubnub().getConfiguration().getSubscribeKey(), PubNubUtil.joinString(this.channels, InstabugDbContract.COMMA_SEP), map);
        }
        if (this.channels.size() <= 1) {
            return getRetrofit().getHistoryService().fetchMessagesWithActions(getPubnub().getConfiguration().getSubscribeKey(), this.channels.get(0), map);
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS).build();
    }

    public FetchMessages end(Long l) {
        this.end = l;
        return this;
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNFetchMessagesOperation;
    }

    public FetchMessages includeMessageActions(Boolean bool) {
        this.includeMessageActions = bool;
        return this;
    }

    public FetchMessages includeMessageType(boolean z) {
        this.includeMessageType = z;
        return this;
    }

    public FetchMessages includeMeta(Boolean bool) {
        this.includeMeta = bool;
        return this;
    }

    public FetchMessages includeUUID(boolean z) {
        this.includeUUID = z;
        return this;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public FetchMessages maximumPerChannel(Integer num) {
        this.maximumPerChannel = num;
        return this;
    }

    public FetchMessages start(Long l) {
        this.start = l;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
        List<String> list = this.channels;
        if (list == null || list.size() == 0) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
        if (this.includeMeta == null) {
            this.includeMeta = Boolean.FALSE;
        }
        if (this.includeMessageActions == null) {
            this.includeMessageActions = Boolean.FALSE;
        }
        if (this.includeMessageActions.booleanValue()) {
            Integer num = this.maximumPerChannel;
            if (num == null || num.intValue() < 1 || this.maximumPerChannel.intValue() > 25) {
                this.maximumPerChannel = 25;
                b bVar = log;
                StringBuilder P0 = a.P0("maximumPerChannel param defaulting to ");
                P0.append(this.maximumPerChannel);
                bVar.info(P0.toString());
            }
        } else if (this.channels.size() == 1) {
            Integer num2 = this.maximumPerChannel;
            if (num2 == null || num2.intValue() < 1) {
                this.maximumPerChannel = 100;
                b bVar2 = log;
                StringBuilder P02 = a.P0("maximumPerChannel param defaulting to ");
                P02.append(this.maximumPerChannel);
                bVar2.info(P02.toString());
            } else if (this.maximumPerChannel.intValue() > 100) {
                this.maximumPerChannel = 100;
                b bVar3 = log;
                StringBuilder P03 = a.P0("maximumPerChannel param defaulting to ");
                P03.append(this.maximumPerChannel);
                bVar3.info(P03.toString());
            }
        } else {
            Integer num3 = this.maximumPerChannel;
            if (num3 == null || num3.intValue() < 1) {
                this.maximumPerChannel = 25;
                b bVar4 = log;
                StringBuilder P04 = a.P0("maximumPerChannel param defaulting to ");
                P04.append(this.maximumPerChannel);
                bVar4.info(P04.toString());
            } else if (this.maximumPerChannel.intValue() > 25) {
                this.maximumPerChannel = 25;
                b bVar5 = log;
                StringBuilder P05 = a.P0("maximumPerChannel param defaulting to ");
                P05.append(this.maximumPerChannel);
                bVar5.info(P05.toString());
            }
        }
    }

    public PNFetchMessagesResult createResponse(v<FetchMessagesEnvelope> vVar) throws PubNubException {
        PNBoundedPage pNBoundedPage;
        if (vVar.b != null) {
            HashMap hashMap = new HashMap();
            Iterator<Map.Entry<String, List<PNFetchMessageItem>>> it = ((FetchMessagesEnvelope) vVar.b).getChannels().entrySet().iterator();
            while (true) {
                pNBoundedPage = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                ArrayList arrayList = new ArrayList();
                for (PNFetchMessageItem pNFetchMessageItem : (List) next.getValue()) {
                    PNFetchMessageItem.PNFetchMessageItemBuilder builder = pNFetchMessageItem.toBuilder();
                    builder.message(processMessage(pNFetchMessageItem.getMessage()));
                    if (!this.includeMessageActions.booleanValue()) {
                        builder.actions((HashMap<String, HashMap<String, List<PNFetchMessageItem.Action>>>) null);
                    } else if (pNFetchMessageItem.getActions() != null) {
                        builder.actions(pNFetchMessageItem.getActions());
                    } else {
                        builder.actions(new HashMap());
                    }
                    arrayList.add(builder.build());
                }
                hashMap.put(next.getKey(), arrayList);
            }
            FetchMessagesEnvelope.FetchMessagesPage more = ((FetchMessagesEnvelope) vVar.b).getMore();
            if (more != null) {
                pNBoundedPage = new PNBoundedPage(more.getStart(), more.getEnd(), more.getMax());
            }
            return PNFetchMessagesResult.builder().channels(hashMap).page(pNBoundedPage).build();
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
    }
}
