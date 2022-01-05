package com.pubnub.api.managers;

import androidx.core.app.NotificationCompat;
import com.pubnub.api.enums.PNOperationType;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class TelemetryManager {
    private static final int CLEAN_UP_INTERVAL = 1;
    private static final int CLEAN_UP_INTERVAL_MULTIPLIER = 1000;
    private static final double MAXIMUM_LATENCY_DATA_AGE = 60.0d;
    private static final int MAX_FRACTION_DIGITS = 3;
    private static final int TIMESTAMP_DIVIDER = 1000;
    private Map<String, List<Map<String, Double>>> latencies = new HashMap();
    private NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
    private Timer timer;

    /* renamed from: com.pubnub.api.managers.TelemetryManager$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$pubnub$api$enums$PNOperationType;

        /* JADX WARNING: Can't wrap try/catch for region: R(88:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(90:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0204 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.pubnub.api.enums.PNOperationType.values()
                r0 = 46
                int[] r0 = new int[r0]
                $SwitchMap$com$pubnub$api$enums$PNOperationType = r0
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNPublishOperation     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNHistoryOperation     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNFetchMessagesOperation     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNDeleteMessagesOperation     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNUnsubscribeOperation     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNWhereNowOperation     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNHereNowOperation     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNHeartbeatOperation     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x006c }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNSetStateOperation     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNGetState     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNAddChannelsToGroupOperation     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNRemoveChannelsFromGroupOperation     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x009c }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNChannelGroupsOperation     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNRemoveGroupOperation     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNChannelsForGroupOperation     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNPushNotificationEnabledChannelsOperation     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNAddPushNotificationsOnChannelsOperation     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNRemovePushNotificationsFromChannelsOperation     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNRemoveAllPushNotificationsOperation     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNAccessManagerAudit     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNAccessManagerGrant     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNMessageCountOperation     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNSignalOperation     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNSetUuidMetadataOperation     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x012c }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNGetUuidMetadataOperation     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNGetAllUuidMetadataOperation     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0144 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNRemoveUuidMetadataOperation     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0150 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNSetChannelMetadataOperation     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x015c }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNGetChannelMetadataOperation     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0168 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNGetAllChannelsMetadataOperation     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0174 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNRemoveChannelMetadataOperation     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0180 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNSetMembershipsOperation     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x018c }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNGetMembershipsOperation     // Catch:{ NoSuchFieldError -> 0x018c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018c }
            L_0x018c:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0198 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNRemoveMembershipsOperation     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x01a4 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNManageMembershipsOperation     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x01b0 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNSetChannelMembersOperation     // Catch:{ NoSuchFieldError -> 0x01b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b0 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b0 }
            L_0x01b0:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x01bc }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNGetChannelMembersOperation     // Catch:{ NoSuchFieldError -> 0x01bc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bc }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bc }
            L_0x01bc:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x01c8 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNRemoveChannelMembersOperation     // Catch:{ NoSuchFieldError -> 0x01c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c8 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c8 }
            L_0x01c8:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x01d4 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNManageChannelMembersOperation     // Catch:{ NoSuchFieldError -> 0x01d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d4 }
            L_0x01d4:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x01e0 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNAccessManagerGrantToken     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x01ec }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNAddMessageAction     // Catch:{ NoSuchFieldError -> 0x01ec }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ec }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ec }
            L_0x01ec:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x01f8 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNGetMessageActions     // Catch:{ NoSuchFieldError -> 0x01f8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f8 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f8 }
            L_0x01f8:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0204 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNDeleteMessageAction     // Catch:{ NoSuchFieldError -> 0x0204 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0204 }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0204 }
            L_0x0204:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNOperationType     // Catch:{ NoSuchFieldError -> 0x0210 }
                com.pubnub.api.enums.PNOperationType r1 = com.pubnub.api.enums.PNOperationType.PNFileAction     // Catch:{ NoSuchFieldError -> 0x0210 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0210 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0210 }
            L_0x0210:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pubnub.api.managers.TelemetryManager.AnonymousClass2.<clinit>():void");
        }
    }

    public TelemetryManager() {
        this.numberFormat.setMaximumFractionDigits(3);
        this.numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.numberFormat.setGroupingUsed(false);
        startCleanUpTimer();
    }

    private static double averageLatencyFromData(List<Map<String, Double>> list) {
        double d = 0.0d;
        for (Map<String, Double> map : list) {
            d += ((Double) map.get("l")).doubleValue();
        }
        return d / ((double) list.size());
    }

    /* access modifiers changed from: private */
    public synchronized void cleanUpTelemetryData() {
        double time = ((double) new Date().getTime()) / 1000.0d;
        Iterator it = new ArrayList(this.latencies.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList = new ArrayList();
            List<Map> list = this.latencies.get(str);
            for (Map map : list) {
                if (time - ((Double) map.get("d")).doubleValue() > MAXIMUM_LATENCY_DATA_AGE) {
                    arrayList.add(map);
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
            if (list.size() == 0) {
                this.latencies.remove(str);
            }
        }
    }

    private static String endpointNameForOperation(PNOperationType pNOperationType) {
        switch (pNOperationType.ordinal()) {
            case 1:
            case 8:
            case 9:
            case 10:
            case 21:
            case 22:
                return "pres";
            case 2:
                return "pub";
            case 3:
                return "sig";
            case 4:
            case 5:
            case 6:
                return "hist";
            case 7:
                return "mc";
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return "cg";
            case 16:
            case 17:
            case 18:
            case 19:
                return "push";
            case 23:
            case 24:
                return "pam";
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                return "obj";
            case 41:
                return "pamv3";
            case 42:
            case 43:
            case 44:
                return "msga";
            case 45:
                return "file";
            default:
                return NotificationCompat.MessagingStyle.Message.KEY_TIMESTAMP;
        }
    }

    private void startCleanUpTimer() {
        stopCleanUpTimer();
        Timer timer2 = new Timer("Telemetry Manager timer", true);
        this.timer = timer2;
        timer2.schedule(new TimerTask() {
            public void run() {
                TelemetryManager.this.cleanUpTelemetryData();
            }
        }, 1000, 1000);
    }

    public synchronized Map<String, String> operationsLatency() {
        HashMap hashMap;
        hashMap = new HashMap();
        for (Map.Entry next : this.latencies.entrySet()) {
            String concat = "l_".concat((String) next.getKey());
            double averageLatencyFromData = averageLatencyFromData((List) next.getValue());
            if (averageLatencyFromData > 0.0d) {
                hashMap.put(concat, this.numberFormat.format(averageLatencyFromData));
            }
        }
        return hashMap;
    }

    public void stopCleanUpTimer() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
            this.timer = null;
        }
    }

    public synchronized void storeLatency(long j, PNOperationType pNOperationType) {
        String endpointNameForOperation;
        if (!(pNOperationType == PNOperationType.PNSubscribeOperation || j <= 0 || (endpointNameForOperation = endpointNameForOperation(pNOperationType)) == null)) {
            double time = ((double) new Date().getTime()) / 1000.0d;
            List list = this.latencies.get(endpointNameForOperation);
            if (list == null) {
                list = new ArrayList();
                this.latencies.put(endpointNameForOperation, list);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("d", Double.valueOf(time));
            hashMap.put("l", Double.valueOf(((double) j) / 1000.0d));
            list.add(hashMap);
        }
    }
}
