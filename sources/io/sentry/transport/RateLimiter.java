package io.sentry.transport;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import io.sentry.ILogger;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryLevel;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class RateLimiter {
    private static final int HTTP_RETRY_AFTER_DEFAULT_DELAY_MILLIS = 60000;
    private final ICurrentDateProvider currentDateProvider;
    private final ILogger logger;
    private final Map<DataCategory, Date> sentryRetryAfterLimit;

    public enum DataCategory {
        All("__all__"),
        Default("default"),
        Error("error"),
        Session("session"),
        Attachment("attachment"),
        Transaction("transaction"),
        Security("security"),
        Unknown("unknown");
        
        private final String category;

        private DataCategory(String str) {
            this.category = str;
        }

        public String getCategory() {
            return this.category;
        }
    }

    public RateLimiter(ICurrentDateProvider iCurrentDateProvider, ILogger iLogger) {
        this.sentryRetryAfterLimit = new ConcurrentHashMap();
        this.currentDateProvider = iCurrentDateProvider;
        this.logger = iLogger;
    }

    private void applyRetryAfterOnlyIfLonger(DataCategory dataCategory, Date date) {
        Date date2 = this.sentryRetryAfterLimit.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            this.sentryRetryAfterLimit.put(dataCategory, date);
        }
    }

    private DataCategory getCategoryFromItemType(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1963501277:
                if (str.equals("attachment")) {
                    c = 0;
                    break;
                }
                break;
            case 96891546:
                if (str.equals("event")) {
                    c = 1;
                    break;
                }
                break;
            case 1984987798:
                if (str.equals("session")) {
                    c = 2;
                    break;
                }
                break;
            case 2141246174:
                if (str.equals("transaction")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return DataCategory.Attachment;
            case 1:
                return DataCategory.Error;
            case 2:
                return DataCategory.Session;
            case 3:
                return DataCategory.Transaction;
            default:
                return DataCategory.Unknown;
        }
    }

    private boolean isRetryAfter(String str) {
        Date date;
        DataCategory categoryFromItemType = getCategoryFromItemType(str);
        Date date2 = new Date(this.currentDateProvider.getCurrentTimeMillis());
        Date date3 = this.sentryRetryAfterLimit.get(DataCategory.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (!DataCategory.Unknown.equals(categoryFromItemType) && (date = this.sentryRetryAfterLimit.get(categoryFromItemType)) != null) {
            return !date2.after(date);
        }
        return false;
    }

    private static void markHintWhenSendingFailed(Object obj, boolean z) {
        if (obj instanceof SubmissionResult) {
            ((SubmissionResult) obj).setResult(false);
        }
        if (obj instanceof Retryable) {
            ((Retryable) obj).setRetry(z);
        }
    }

    private long parseRetryAfterOrDefault(String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000;
    }

    public SentryEnvelope filter(SentryEnvelope sentryEnvelope, Object obj) {
        ArrayList arrayList = null;
        for (SentryEnvelopeItem next : sentryEnvelope.getItems()) {
            if (isRetryAfter(next.getHeader().getType().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
            if (arrayList != null) {
                this.logger.log(SentryLevel.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            }
        }
        if (arrayList == null) {
            return sentryEnvelope;
        }
        ArrayList arrayList2 = new ArrayList();
        for (SentryEnvelopeItem next2 : sentryEnvelope.getItems()) {
            if (!arrayList.contains(next2)) {
                arrayList2.add(next2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new SentryEnvelope(sentryEnvelope.getHeader(), arrayList2);
        }
        this.logger.log(SentryLevel.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
        markHintWhenSendingFailed(obj, false);
        return null;
    }

    public void updateRetryAfterLimits(String str, String str2, int i) {
        String str3 = str;
        if (str3 != null) {
            int i2 = -1;
            String[] split = str3.split(InstabugDbContract.COMMA_SEP, -1);
            int length = split.length;
            int i3 = 0;
            while (i3 < length) {
                String[] split2 = split[i3].replace(" ", "").split(":", i2);
                if (split2.length > 0) {
                    long parseRetryAfterOrDefault = parseRetryAfterOrDefault(split2[0]);
                    if (split2.length > 1) {
                        String str4 = split2[1];
                        Date date = new Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault);
                        if (str4 == null || str4.isEmpty()) {
                            applyRetryAfterOnlyIfLonger(DataCategory.All, date);
                        } else {
                            for (String str5 : str4.split(";", i2)) {
                                DataCategory dataCategory = DataCategory.Unknown;
                                try {
                                    dataCategory = DataCategory.valueOf(StringUtils.capitalize(str5));
                                } catch (IllegalArgumentException e) {
                                    this.logger.log(SentryLevel.INFO, e, "Unknown category: %s", str5);
                                }
                                if (!DataCategory.Unknown.equals(dataCategory)) {
                                    applyRetryAfterOnlyIfLonger(dataCategory, date);
                                }
                            }
                        }
                    }
                }
                i3++;
                i2 = -1;
            }
        } else if (i == 429) {
            applyRetryAfterOnlyIfLonger(DataCategory.All, new Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault(str2)));
        }
    }

    public RateLimiter(ILogger iLogger) {
        this(CurrentDateProvider.getInstance(), iLogger);
    }
}
