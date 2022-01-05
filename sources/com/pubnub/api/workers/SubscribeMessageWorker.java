package com.pubnub.api.workers;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.managers.DuplicationManager;
import com.pubnub.api.managers.ListenerManager;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.models.consumer.PNErrorData;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.objects.ObjectPayload;
import com.pubnub.api.models.server.SubscribeMessage;
import com.pubnub.api.services.FilesService;
import com.pubnub.api.vendor.Crypto;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import s0.c.b;
import s0.c.c;

public class SubscribeMessageWorker implements Runnable {
    public static final int TYPE_FILES = 4;
    public static final int TYPE_MESSAGE = 0;
    private static final b log = c.e(SubscribeMessageWorker.class);
    private DuplicationManager duplicationManager;
    private final String formatFriendlyGetFileUrl;
    private ListenerManager listenerManager;
    private PubNub pubnub;
    private LinkedBlockingQueue<SubscribeMessage> queue;
    private final int typeMessageAction = 3;
    private final int typeObject = 2;
    private final int typeSignal = 1;

    public SubscribeMessageWorker(PubNub pubNub, ListenerManager listenerManager2, LinkedBlockingQueue<SubscribeMessage> linkedBlockingQueue, DuplicationManager duplicationManager2) {
        StringBuilder P0 = a.P0("%s");
        P0.append(FilesService.GET_FILE_URL.replaceAll("\\{.*?\\}", "%s"));
        this.formatFriendlyGetFileUrl = P0.toString();
        this.pubnub = pubNub;
        this.listenerManager = listenerManager2;
        this.queue = linkedBlockingQueue;
        this.duplicationManager = duplicationManager2;
    }

    private String buildFileUrl(String str, String str2, String str3) {
        String format = String.format(this.formatFriendlyGetFileUrl, new Object[]{this.pubnub.getBaseUrl(), this.pubnub.getConfiguration().getSubscribeKey(), str, str2, str3});
        ArrayList arrayList = new ArrayList();
        String authKey = this.pubnub.getConfiguration().getAuthKey();
        if (PubNubUtil.shouldSignRequest(this.pubnub.getConfiguration())) {
            int timestamp = this.pubnub.getTimestamp();
            String generateSignature = generateSignature(this.pubnub.getConfiguration(), format, authKey, timestamp);
            arrayList.add("timestamp=" + timestamp);
            arrayList.add("signature=" + generateSignature);
        }
        if (authKey != null) {
            arrayList.add("auth=" + authKey);
        }
        if (arrayList.isEmpty()) {
            return format;
        }
        StringBuilder S0 = a.S0(format, "?");
        S0.append(PubNubUtil.joinString(arrayList, "&"));
        return S0.toString();
    }

    private boolean canHandleObjectCallback(ObjectPayload objectPayload) {
        return objectPayload.getVersion().equals("2.0");
    }

    private String generateSignature(PNConfiguration pNConfiguration, String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put(PubNubUtil.AUTH_QUERY_PARAM_NAME, str2);
        }
        return PubNubUtil.generateSignature(pNConfiguration, str, hashMap, "get", (String) null, i);
    }

    private List<String> getDelta(JsonElement jsonElement) {
        ArrayList arrayList = new ArrayList();
        if (jsonElement != null) {
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            for (int i = 0; i < asJsonArray.size(); i++) {
                arrayList.add(asJsonArray.get(i).getAsString());
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e1, code lost:
        if (r0.equals("membership") == false) goto L_0x01c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void processIncomingPayload(com.pubnub.api.models.server.SubscribeMessage r13) {
        /*
            r12 = this;
            java.lang.Class<com.pubnub.api.models.consumer.pubsub.objects.ObjectPayload> r0 = com.pubnub.api.models.consumer.pubsub.objects.ObjectPayload.class
            com.pubnub.api.PubNub r1 = r12.pubnub
            com.pubnub.api.managers.MapperManager r1 = r1.getMapper()
            java.lang.String r2 = r13.getChannel()
            java.lang.String r3 = r13.getSubscriptionMatch()
            com.pubnub.api.models.server.PublishMetaData r4 = r13.getPublishMetaData()
            r5 = 0
            if (r2 == 0) goto L_0x001e
            boolean r6 = r2.equals(r3)
            if (r6 == 0) goto L_0x001e
            r3 = r5
        L_0x001e:
            com.pubnub.api.PubNub r6 = r12.pubnub
            com.pubnub.api.PNConfiguration r6 = r6.getConfiguration()
            boolean r6 = r6.isDedupOnSubscribe()
            if (r6 == 0) goto L_0x0038
            com.pubnub.api.managers.DuplicationManager r6 = r12.duplicationManager
            boolean r6 = r6.isDuplicate(r13)
            if (r6 == 0) goto L_0x0033
            return
        L_0x0033:
            com.pubnub.api.managers.DuplicationManager r6 = r12.duplicationManager
            r6.addEntry(r13)
        L_0x0038:
            java.lang.String r6 = r13.getChannel()
            java.lang.String r7 = "-pnpres"
            boolean r6 = r6.endsWith(r7)
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x011a
            com.google.gson.JsonElement r0 = r13.getPayload()
            java.lang.Class<com.pubnub.api.models.server.PresenceEnvelope> r6 = com.pubnub.api.models.server.PresenceEnvelope.class
            java.lang.Object r0 = r1.convertValue((com.google.gson.JsonElement) r0, (java.lang.Class) r6)
            com.pubnub.api.models.server.PresenceEnvelope r0 = (com.pubnub.api.models.server.PresenceEnvelope) r0
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x005b
            java.lang.String r6 = com.pubnub.api.PubNubUtil.replaceLast(r2, r7, r1)
            goto L_0x005c
        L_0x005b:
            r6 = r5
        L_0x005c:
            if (r3 == 0) goto L_0x0063
            java.lang.String r1 = com.pubnub.api.PubNubUtil.replaceLast(r3, r7, r1)
            goto L_0x0064
        L_0x0063:
            r1 = r5
        L_0x0064:
            com.google.gson.JsonElement r7 = r13.getPayload()
            com.google.gson.JsonObject r7 = r7.getAsJsonObject()
            java.lang.String r10 = "here_now_refresh"
            com.google.gson.JsonElement r7 = r7.get(r10)
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r10 = com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult.builder()
            java.lang.String r11 = r0.getAction()
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r10 = r10.event(r11)
            if (r3 == 0) goto L_0x0081
            r5 = r2
        L_0x0081:
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r5 = r10.actualChannel(r5)
            if (r3 == 0) goto L_0x0088
            r2 = r3
        L_0x0088:
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r2 = r5.subscribedChannel(r2)
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r2 = r2.channel(r6)
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r1 = r2.subscription(r1)
            com.google.gson.JsonElement r2 = r0.getData()
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r1 = r1.state(r2)
            java.lang.Long r2 = r4.getPublishTimetoken()
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r1 = r1.timetoken(r2)
            java.lang.Integer r2 = r0.getOccupancy()
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r1 = r1.occupancy(r2)
            java.lang.String r2 = r0.getUuid()
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r1 = r1.uuid(r2)
            java.lang.Long r0 = r0.getTimestamp()
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r0 = r1.timestamp(r0)
            com.google.gson.JsonElement r1 = r13.getPayload()
            com.google.gson.JsonObject r1 = r1.getAsJsonObject()
            java.lang.String r2 = "join"
            com.google.gson.JsonElement r1 = r1.get(r2)
            java.util.List r1 = r12.getDelta(r1)
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r0 = r0.join(r1)
            com.google.gson.JsonElement r1 = r13.getPayload()
            com.google.gson.JsonObject r1 = r1.getAsJsonObject()
            java.lang.String r2 = "leave"
            com.google.gson.JsonElement r1 = r1.get(r2)
            java.util.List r1 = r12.getDelta(r1)
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r0 = r0.leave(r1)
            com.google.gson.JsonElement r13 = r13.getPayload()
            com.google.gson.JsonObject r13 = r13.getAsJsonObject()
            java.lang.String r1 = "timeout"
            com.google.gson.JsonElement r13 = r13.get(r1)
            java.util.List r13 = r12.getDelta(r13)
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r13 = r0.timeout(r13)
            if (r7 == 0) goto L_0x0107
            boolean r0 = r7.getAsBoolean()
            if (r0 == 0) goto L_0x0107
            r8 = r9
        L_0x0107:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder r13 = r13.hereNowRefresh(r0)
            com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult r13 = r13.build()
            com.pubnub.api.managers.ListenerManager r0 = r12.listenerManager
            r0.announce((com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult) r13)
            goto L_0x02fa
        L_0x011a:
            com.google.gson.JsonElement r6 = r12.processMessage(r13)
            if (r6 != 0) goto L_0x0127
            s0.c.b r7 = log
            java.lang.String r10 = "unable to parse payload on #processIncomingMessages"
            r7.debug(r10)
        L_0x0127:
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder r7 = com.pubnub.api.models.consumer.pubsub.BasePubSubResult.builder()
            if (r3 == 0) goto L_0x012e
            r5 = r2
        L_0x012e:
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder r5 = r7.actualChannel(r5)
            if (r3 == 0) goto L_0x0136
            r7 = r3
            goto L_0x0137
        L_0x0136:
            r7 = r2
        L_0x0137:
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder r5 = r5.subscribedChannel(r7)
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder r2 = r5.channel(r2)
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder r2 = r2.subscription(r3)
            java.lang.Long r3 = r4.getPublishTimetoken()
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder r2 = r2.timetoken(r3)
            java.lang.String r3 = r13.getIssuingClientId()
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder r2 = r2.publisher(r3)
            com.google.gson.JsonElement r3 = r13.getUserMetadata()
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder r2 = r2.userMetadata(r3)
            com.pubnub.api.models.consumer.pubsub.BasePubSubResult r2 = r2.build()
            java.lang.Integer r3 = r13.getType()
            if (r3 != 0) goto L_0x0171
            com.pubnub.api.managers.ListenerManager r13 = r12.listenerManager
            com.pubnub.api.models.consumer.pubsub.PNMessageResult r0 = new com.pubnub.api.models.consumer.pubsub.PNMessageResult
            r0.<init>(r2, r6)
            r13.announce((com.pubnub.api.models.consumer.pubsub.PNMessageResult) r0)
            goto L_0x02fa
        L_0x0171:
            java.lang.Integer r3 = r13.getType()
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x0187
            com.pubnub.api.managers.ListenerManager r13 = r12.listenerManager
            com.pubnub.api.models.consumer.pubsub.PNMessageResult r0 = new com.pubnub.api.models.consumer.pubsub.PNMessageResult
            r0.<init>(r2, r6)
            r13.announce((com.pubnub.api.models.consumer.pubsub.PNMessageResult) r0)
            goto L_0x02fa
        L_0x0187:
            java.lang.Integer r3 = r13.getType()
            int r3 = r3.intValue()
            if (r3 != r9) goto L_0x019d
            com.pubnub.api.managers.ListenerManager r13 = r12.listenerManager
            com.pubnub.api.models.consumer.pubsub.PNSignalResult r0 = new com.pubnub.api.models.consumer.pubsub.PNSignalResult
            r0.<init>(r2, r6)
            r13.announce((com.pubnub.api.models.consumer.pubsub.PNSignalResult) r0)
            goto L_0x02fa
        L_0x019d:
            java.lang.Integer r3 = r13.getType()
            int r3 = r3.intValue()
            r5 = 2
            java.lang.String r7 = "uuid"
            if (r3 != r5) goto L_0x023d
            java.lang.Object r13 = r1.convertValue((com.google.gson.JsonElement) r6, (java.lang.Class) r0)
            com.pubnub.api.models.consumer.pubsub.objects.ObjectPayload r13 = (com.pubnub.api.models.consumer.pubsub.objects.ObjectPayload) r13
            java.lang.String r0 = r13.getType()
            boolean r3 = r12.canHandleObjectCallback(r13)
            if (r3 == 0) goto L_0x02fa
            r0.hashCode()
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1340241962: goto L_0x01db;
                case 3601339: goto L_0x01d2;
                case 738950403: goto L_0x01c7;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            r8 = r3
            goto L_0x01e4
        L_0x01c7:
            java.lang.String r4 = "channel"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01d0
            goto L_0x01c5
        L_0x01d0:
            r8 = r5
            goto L_0x01e4
        L_0x01d2:
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x01d9
            goto L_0x01c5
        L_0x01d9:
            r8 = r9
            goto L_0x01e4
        L_0x01db:
            java.lang.String r4 = "membership"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01e4
            goto L_0x01c5
        L_0x01e4:
            switch(r8) {
                case 0: goto L_0x0221;
                case 1: goto L_0x0205;
                case 2: goto L_0x01e9;
                default: goto L_0x01e7;
            }
        L_0x01e7:
            goto L_0x02fa
        L_0x01e9:
            com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult r0 = new com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult
            java.lang.String r3 = r13.getEvent()
            com.google.gson.JsonElement r13 = r13.getData()
            java.lang.Class<com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata> r4 = com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata.class
            java.lang.Object r13 = r1.convertValue((com.google.gson.JsonElement) r13, (java.lang.Class) r4)
            com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata r13 = (com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata) r13
            r0.<init>(r2, r3, r13)
            com.pubnub.api.managers.ListenerManager r13 = r12.listenerManager
            r13.announce((com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult) r0)
            goto L_0x02fa
        L_0x0205:
            com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult r0 = new com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult
            java.lang.String r3 = r13.getEvent()
            com.google.gson.JsonElement r13 = r13.getData()
            java.lang.Class<com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata> r4 = com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata.class
            java.lang.Object r13 = r1.convertValue((com.google.gson.JsonElement) r13, (java.lang.Class) r4)
            com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata r13 = (com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata) r13
            r0.<init>(r2, r3, r13)
            com.pubnub.api.managers.ListenerManager r13 = r12.listenerManager
            r13.announce((com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult) r0)
            goto L_0x02fa
        L_0x0221:
            com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult r0 = new com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult
            java.lang.String r3 = r13.getEvent()
            com.google.gson.JsonElement r13 = r13.getData()
            java.lang.Class<com.pubnub.api.models.consumer.objects_api.membership.PNMembership> r4 = com.pubnub.api.models.consumer.objects_api.membership.PNMembership.class
            java.lang.Object r13 = r1.convertValue((com.google.gson.JsonElement) r13, (java.lang.Class) r4)
            com.pubnub.api.models.consumer.objects_api.membership.PNMembership r13 = (com.pubnub.api.models.consumer.objects_api.membership.PNMembership) r13
            r0.<init>(r2, r3, r13)
            com.pubnub.api.managers.ListenerManager r13 = r12.listenerManager
            r13.announce((com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult) r0)
            goto L_0x02fa
        L_0x023d:
            java.lang.Integer r3 = r13.getType()
            int r3 = r3.intValue()
            r5 = 3
            if (r3 != r5) goto L_0x0289
            java.lang.Object r13 = r1.convertValue((com.google.gson.JsonElement) r6, (java.lang.Class) r0)
            com.pubnub.api.models.consumer.pubsub.objects.ObjectPayload r13 = (com.pubnub.api.models.consumer.pubsub.objects.ObjectPayload) r13
            com.google.gson.JsonElement r0 = r13.getData()
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()
            boolean r3 = r0.has(r7)
            if (r3 != 0) goto L_0x0263
            java.lang.String r3 = r2.getPublisher()
            r0.addProperty((java.lang.String) r7, (java.lang.String) r3)
        L_0x0263:
            com.pubnub.api.managers.ListenerManager r3 = r12.listenerManager
            com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder r4 = com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult.actionBuilder()
            com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder r2 = r4.result(r2)
            java.lang.String r13 = r13.getEvent()
            com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder r13 = r2.event(r13)
            java.lang.Class<com.pubnub.api.models.consumer.message_actions.PNMessageAction> r2 = com.pubnub.api.models.consumer.message_actions.PNMessageAction.class
            java.lang.Object r0 = r1.convertValue((com.google.gson.JsonElement) r0, (java.lang.Class) r2)
            com.pubnub.api.models.consumer.message_actions.PNMessageAction r0 = (com.pubnub.api.models.consumer.message_actions.PNMessageAction) r0
            com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder r13 = r13.data(r0)
            com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult r13 = r13.build()
            r3.announce((com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult) r13)
            goto L_0x02fa
        L_0x0289:
            java.lang.Integer r0 = r13.getType()
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L_0x02fa
            java.lang.Class<com.pubnub.api.models.server.files.FileUploadNotification> r0 = com.pubnub.api.models.server.files.FileUploadNotification.class
            java.lang.Object r0 = r1.convertValue((com.google.gson.JsonElement) r6, (java.lang.Class) r0)
            com.pubnub.api.models.server.files.FileUploadNotification r0 = (com.pubnub.api.models.server.files.FileUploadNotification) r0
            com.pubnub.api.managers.ListenerManager r1 = r12.listenerManager
            com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder r2 = com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult.builder()
            com.pubnub.api.models.consumer.files.PNDownloadableFile r3 = new com.pubnub.api.models.consumer.files.PNDownloadableFile
            com.pubnub.api.models.consumer.files.PNBaseFile r5 = r0.getFile()
            java.lang.String r5 = r5.getId()
            com.pubnub.api.models.consumer.files.PNBaseFile r6 = r0.getFile()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = r13.getChannel()
            com.pubnub.api.models.consumer.files.PNBaseFile r8 = r0.getFile()
            java.lang.String r8 = r8.getId()
            com.pubnub.api.models.consumer.files.PNBaseFile r9 = r0.getFile()
            java.lang.String r9 = r9.getName()
            java.lang.String r7 = r12.buildFileUrl(r7, r8, r9)
            r3.<init>(r5, r6, r7)
            com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder r2 = r2.file(r3)
            java.lang.Object r0 = r0.getMessage()
            com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder r0 = r2.message(r0)
            java.lang.String r2 = r13.getChannel()
            com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder r0 = r0.channel(r2)
            java.lang.String r13 = r13.getIssuingClientId()
            com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder r13 = r0.publisher(r13)
            java.lang.Long r0 = r4.getPublishTimetoken()
            com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder r13 = r13.timetoken(r0)
            com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult r13 = r13.build()
            r1.announce((com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult) r13)
        L_0x02fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubnub.api.workers.SubscribeMessageWorker.processIncomingPayload(com.pubnub.api.models.server.SubscribeMessage):void");
    }

    private JsonElement processMessage(SubscribeMessage subscribeMessage) {
        String str;
        JsonElement payload = subscribeMessage.getPayload();
        if (this.pubnub.getConfiguration().getCipherKey() == null || !subscribeMessage.supportsEncryption()) {
            return payload;
        }
        Crypto crypto = new Crypto(this.pubnub.getConfiguration().getCipherKey(), this.pubnub.getConfiguration().isUseRandomInitializationVector());
        MapperManager mapper = this.pubnub.getMapper();
        if (!mapper.isJsonObject(payload) || !mapper.hasField(payload, "pn_other")) {
            str = mapper.elementToString(payload);
        } else {
            str = mapper.elementToString(payload, "pn_other");
        }
        try {
            try {
                JsonElement jsonElement = (JsonElement) mapper.fromJson(crypto.decrypt(str), JsonElement.class);
                if (!mapper.isJsonObject(payload) || !mapper.hasField(payload, "pn_other")) {
                    return jsonElement;
                }
                JsonObject asObject = mapper.getAsObject(payload);
                mapper.putOnObject(asObject, "pn_other", jsonElement);
                return asObject;
            } catch (PubNubException e) {
                this.listenerManager.announce(PNStatus.builder().error(true).errorData(new PNErrorData(e.getMessage(), e)).operation(PNOperationType.PNSubscribeOperation).category(PNStatusCategory.PNMalformedResponseCategory).build());
                return null;
            }
        } catch (PubNubException e2) {
            this.listenerManager.announce(PNStatus.builder().error(true).errorData(new PNErrorData(e2.getMessage(), e2)).operation(PNOperationType.PNSubscribeOperation).category(PNStatusCategory.PNDecryptionErrorCategory).build());
            return null;
        }
    }

    private void takeMessage() {
        while (!Thread.interrupted()) {
            try {
                processIncomingPayload(this.queue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                log.b("take message interrupted", e);
            }
        }
    }

    public void run() {
        takeMessage();
    }
}
