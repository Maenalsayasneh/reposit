package io.sentry;

import io.sentry.util.CollectionUtils;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

public final class Breadcrumb implements Cloneable, IUnknownPropertiesConsumer {
    private String category;
    private Map<String, Object> data;
    private SentryLevel level;
    private String message;
    private final Date timestamp;
    private String type;
    private Map<String, Object> unknown;

    public Breadcrumb(Date date) {
        this.data = new ConcurrentHashMap();
        this.timestamp = date;
    }

    public static Breadcrumb http(String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("http");
        breadcrumb.setCategory("http");
        breadcrumb.setData("url", str);
        breadcrumb.setData("method", str2.toUpperCase(Locale.ROOT));
        return breadcrumb;
    }

    @ApiStatus.Internal
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String getCategory() {
        return this.category;
    }

    @ApiStatus.Internal
    public Map<String, Object> getData() {
        return this.data;
    }

    public SentryLevel getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getTimestamp() {
        return (Date) this.timestamp.clone();
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public void removeData(String str) {
        this.data.remove(str);
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setData(String str, Object obj) {
        this.data.put(str, obj);
    }

    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Breadcrumb clone() throws CloneNotSupportedException {
        Breadcrumb breadcrumb = (Breadcrumb) super.clone();
        breadcrumb.data = CollectionUtils.shallowCopy(this.data);
        breadcrumb.unknown = CollectionUtils.shallowCopy(this.unknown);
        SentryLevel sentryLevel = this.level;
        breadcrumb.level = sentryLevel != null ? SentryLevel.valueOf(sentryLevel.name().toUpperCase(Locale.ROOT)) : null;
        return breadcrumb;
    }

    public Object getData(String str) {
        return this.data.get(str);
    }

    public Breadcrumb() {
        this(DateUtils.getCurrentDateTime());
    }

    public Breadcrumb(String str) {
        this();
        this.message = str;
    }
}
