package com.pubnub.api;

import com.pubnub.api.builder.PresenceBuilder;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.builder.SubscribeBuilder;
import com.pubnub.api.builder.UnsubscribeBuilder;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.endpoints.DeleteMessages;
import com.pubnub.api.endpoints.FetchMessages;
import com.pubnub.api.endpoints.History;
import com.pubnub.api.endpoints.MessageCounts;
import com.pubnub.api.endpoints.Time;
import com.pubnub.api.endpoints.access.Grant;
import com.pubnub.api.endpoints.access.GrantToken;
import com.pubnub.api.endpoints.channel_groups.AddChannelChannelGroup;
import com.pubnub.api.endpoints.channel_groups.AllChannelsChannelGroup;
import com.pubnub.api.endpoints.channel_groups.DeleteChannelGroup;
import com.pubnub.api.endpoints.channel_groups.ListAllChannelGroup;
import com.pubnub.api.endpoints.channel_groups.RemoveChannelChannelGroup;
import com.pubnub.api.endpoints.files.DeleteFile;
import com.pubnub.api.endpoints.files.DownloadFile;
import com.pubnub.api.endpoints.files.GetFileUrl;
import com.pubnub.api.endpoints.files.ListFiles;
import com.pubnub.api.endpoints.files.PublishFileMessage;
import com.pubnub.api.endpoints.files.SendFile;
import com.pubnub.api.endpoints.message_actions.AddMessageAction;
import com.pubnub.api.endpoints.message_actions.GetMessageActions;
import com.pubnub.api.endpoints.message_actions.RemoveMessageAction;
import com.pubnub.api.endpoints.objects_api.channel.GetAllChannelsMetadata;
import com.pubnub.api.endpoints.objects_api.channel.GetChannelMetadata;
import com.pubnub.api.endpoints.objects_api.channel.RemoveChannelMetadata;
import com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata;
import com.pubnub.api.endpoints.objects_api.members.GetChannelMembers;
import com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers;
import com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers;
import com.pubnub.api.endpoints.objects_api.members.SetChannelMembers;
import com.pubnub.api.endpoints.objects_api.memberships.GetMemberships;
import com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships;
import com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships;
import com.pubnub.api.endpoints.objects_api.memberships.SetMemberships;
import com.pubnub.api.endpoints.objects_api.uuid.GetAllUUIDMetadata;
import com.pubnub.api.endpoints.objects_api.uuid.GetUUIDMetadata;
import com.pubnub.api.endpoints.objects_api.uuid.RemoveUUIDMetadata;
import com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata;
import com.pubnub.api.endpoints.presence.GetState;
import com.pubnub.api.endpoints.presence.HereNow;
import com.pubnub.api.endpoints.presence.SetState;
import com.pubnub.api.endpoints.presence.WhereNow;
import com.pubnub.api.endpoints.pubsub.Publish;
import com.pubnub.api.endpoints.pubsub.Signal;
import com.pubnub.api.endpoints.push.AddChannelsToPush;
import com.pubnub.api.endpoints.push.ListPushProvisions;
import com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice;
import com.pubnub.api.endpoints.push.RemoveChannelsFromPush;
import com.pubnub.api.managers.BasePathManager;
import com.pubnub.api.managers.DelayedReconnectionManager;
import com.pubnub.api.managers.DuplicationManager;
import com.pubnub.api.managers.ListenerManager;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.PublishSequenceManager;
import com.pubnub.api.managers.ReconnectionManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.StateManager;
import com.pubnub.api.managers.SubscriptionManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.managers.token_manager.TokenParser;
import com.pubnub.api.models.consumer.access_manager.v3.PNToken;
import com.pubnub.api.vendor.Crypto;
import com.pubnub.api.vendor.FileEncryptionUtil;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class PubNub {
    private static final int MAX_SEQUENCE = 65535;
    private static final String SDK_VERSION = "5.2.0";
    private static final int TIMESTAMP_DIVIDER = 1000;
    private BasePathManager basePathManager;
    private PNConfiguration configuration;
    private String instanceId;
    private final ListenerManager listenerManager;
    private MapperManager mapper = new MapperManager();
    private PublishSequenceManager publishSequenceManager;
    private RetrofitManager retrofitManager;
    private final StateManager stateManager;
    private SubscriptionManager subscriptionManager;
    private TelemetryManager telemetryManager = new TelemetryManager();
    private final TokenManager tokenManager;
    private final TokenParser tokenParser;

    public PubNub(PNConfiguration pNConfiguration) {
        this.configuration = pNConfiguration;
        this.basePathManager = new BasePathManager(pNConfiguration);
        this.retrofitManager = new RetrofitManager(this);
        ListenerManager listenerManager2 = new ListenerManager(this);
        this.listenerManager = listenerManager2;
        StateManager stateManager2 = new StateManager(this.configuration);
        this.stateManager = stateManager2;
        TokenManager tokenManager2 = new TokenManager();
        this.tokenManager = tokenManager2;
        this.subscriptionManager = new SubscriptionManager(this, this.retrofitManager, this.telemetryManager, stateManager2, listenerManager2, new ReconnectionManager(this), new DelayedReconnectionManager(this), new DuplicationManager(this.configuration), tokenManager2);
        this.publishSequenceManager = new PublishSequenceManager(MAX_SEQUENCE);
        this.tokenParser = new TokenParser();
        this.instanceId = UUID.randomUUID().toString();
    }

    public AddChannelChannelGroup addChannelsToChannelGroup() {
        return new AddChannelChannelGroup(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public void addListener(SubscribeCallback subscribeCallback) {
        this.listenerManager.addListener(subscribeCallback);
    }

    public AddMessageAction addMessageAction() {
        return new AddMessageAction(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public AddChannelsToPush addPushNotificationsOnChannels() {
        return new AddChannelsToPush(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public ListPushProvisions auditPushChannelProvisions() {
        return new ListPushProvisions(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public String decrypt(String str) throws PubNubException {
        if (str != null) {
            return decrypt(str, getConfiguration().getCipherKey());
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).build();
    }

    public InputStream decryptInputStream(InputStream inputStream) throws PubNubException {
        return decryptInputStream(inputStream, getConfiguration().getCipherKey());
    }

    public DeleteChannelGroup deleteChannelGroup() {
        return new DeleteChannelGroup(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public DeleteFile.Builder deleteFile() {
        return DeleteFile.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public DeleteMessages deleteMessages() {
        return new DeleteMessages(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public void destroy() {
        try {
            this.subscriptionManager.destroy(false);
            this.retrofitManager.destroy(false);
        } catch (Exception unused) {
        }
    }

    public void disconnect() {
        this.subscriptionManager.disconnect();
    }

    public DownloadFile.Builder downloadFile() {
        return DownloadFile.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public String encrypt(String str) throws PubNubException {
        if (str != null) {
            return encrypt(str, getConfiguration().getCipherKey());
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).build();
    }

    public InputStream encryptInputStream(InputStream inputStream) throws PubNubException {
        return encryptInputStream(inputStream, getConfiguration().getCipherKey());
    }

    public FetchMessages fetchMessages() {
        return new FetchMessages(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public Publish fire() {
        Publish publish = publish();
        Boolean bool = Boolean.FALSE;
        return publish.shouldStore(bool).replicate(bool);
    }

    public void forceDestroy() {
        try {
            this.subscriptionManager.destroy(true);
            this.retrofitManager.destroy(true);
            this.telemetryManager.stopCleanUpTimer();
        } catch (Exception unused) {
        }
    }

    public GetAllChannelsMetadata getAllChannelsMetadata() {
        return GetAllChannelsMetadata.create(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public GetAllUUIDMetadata getAllUUIDMetadata() {
        return GetAllUUIDMetadata.create(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public String getBaseUrl() {
        return this.basePathManager.getBasePath();
    }

    public GetChannelMembers.Builder getChannelMembers() {
        return GetChannelMembers.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public GetChannelMetadata.Builder getChannelMetadata() {
        return GetChannelMetadata.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public PNConfiguration getConfiguration() {
        return this.configuration;
    }

    public GetFileUrl.Builder getFileUrl() {
        return GetFileUrl.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public MapperManager getMapper() {
        return this.mapper;
    }

    public GetMemberships getMemberships() {
        return GetMemberships.create(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public GetMessageActions getMessageActions() {
        return new GetMessageActions(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public GetState getPresenceState() {
        return new GetState(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public String getRequestId() {
        return UUID.randomUUID().toString();
    }

    public List<String> getSubscribedChannelGroups() {
        return this.stateManager.subscriptionStateData(Boolean.FALSE).getChannelGroups();
    }

    public List<String> getSubscribedChannels() {
        return this.stateManager.subscriptionStateData(Boolean.FALSE).getChannels();
    }

    public int getTimestamp() {
        return (int) (new Date().getTime() / 1000);
    }

    public GetUUIDMetadata getUUIDMetadata() {
        return GetUUIDMetadata.create(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public String getVersion() {
        return SDK_VERSION;
    }

    public Grant grant() {
        return new Grant(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public GrantToken grantToken() {
        return new GrantToken(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public HereNow hereNow() {
        return new HereNow(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public History history() {
        return new History(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public ListAllChannelGroup listAllChannelGroups() {
        return new ListAllChannelGroup(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public AllChannelsChannelGroup listChannelsForChannelGroup() {
        return new AllChannelsChannelGroup(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public ListFiles.Builder listFiles() {
        return new ListFiles.Builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public ManageChannelMembers.Builder manageChannelMembers() {
        return ManageChannelMembers.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public ManageMemberships.Builder manageMemberships() {
        return ManageMemberships.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public MessageCounts messageCounts() {
        return new MessageCounts(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public PNToken parseToken(String str) throws PubNubException {
        return this.tokenParser.unwrapToken(str);
    }

    public PresenceBuilder presence() {
        return new PresenceBuilder(this.subscriptionManager);
    }

    public Publish publish() {
        return new Publish(this, this.publishSequenceManager, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public PublishFileMessage.Builder publishFileMessage() {
        return PublishFileMessage.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public void reconnect() {
        this.subscriptionManager.reconnect();
    }

    public RemoveAllPushChannelsForDevice removeAllPushNotificationsFromDeviceWithPushToken() {
        return new RemoveAllPushChannelsForDevice(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public RemoveChannelMembers.Builder removeChannelMembers() {
        return RemoveChannelMembers.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public RemoveChannelMetadata.Builder removeChannelMetadata() {
        return RemoveChannelMetadata.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public RemoveChannelChannelGroup removeChannelsFromChannelGroup() {
        return new RemoveChannelChannelGroup(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public void removeListener(SubscribeCallback subscribeCallback) {
        this.listenerManager.removeListener(subscribeCallback);
    }

    public RemoveMemberships.Builder removeMemberships() {
        return RemoveMemberships.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public RemoveMessageAction removeMessageAction() {
        return new RemoveMessageAction(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public RemoveChannelsFromPush removePushNotificationsFromChannels() {
        return new RemoveChannelsFromPush(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public RemoveUUIDMetadata removeUUIDMetadata() {
        return new RemoveUUIDMetadata(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public SendFile.Builder sendFile() {
        return SendFile.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public SetChannelMembers.Builder setChannelMembers() {
        return SetChannelMembers.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public SetChannelMetadata.Builder setChannelMetadata() {
        return SetChannelMetadata.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public SetMemberships.Builder setMemberships() {
        return SetMemberships.builder(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public SetState setPresenceState() {
        return new SetState(this, this.subscriptionManager, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public void setToken(String str) {
        this.tokenManager.setToken(str);
    }

    public SetUUIDMetadata setUUIDMetadata() {
        return SetUUIDMetadata.create(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public Signal signal() {
        return new Signal(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    @Deprecated
    public void stop() {
        this.subscriptionManager.stop();
    }

    public SubscribeBuilder subscribe() {
        return new SubscribeBuilder(this.subscriptionManager);
    }

    public Time time() {
        return new Time(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public UnsubscribeBuilder unsubscribe() {
        return new UnsubscribeBuilder(this.subscriptionManager);
    }

    public void unsubscribeAll() {
        this.subscriptionManager.unsubscribeAll();
    }

    public WhereNow whereNow() {
        return new WhereNow(this, this.telemetryManager, this.retrofitManager, this.tokenManager);
    }

    public InputStream decryptInputStream(InputStream inputStream, String str) throws PubNubException {
        return FileEncryptionUtil.decrypt(str, inputStream);
    }

    public InputStream encryptInputStream(InputStream inputStream, String str) throws PubNubException {
        return FileEncryptionUtil.encrypt(str, inputStream);
    }

    public String decrypt(String str, String str2) throws PubNubException {
        if (str != null) {
            return new Crypto(str2, getConfiguration().isUseRandomInitializationVector()).decrypt(str);
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).build();
    }

    public String encrypt(String str, String str2) throws PubNubException {
        if (str != null) {
            return new Crypto(str2, getConfiguration().isUseRandomInitializationVector()).encrypt(str);
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).build();
    }
}
