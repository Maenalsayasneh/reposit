package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

public final class Request implements Cloneable, IUnknownPropertiesConsumer {
    private String cookies;
    private Object data;
    private Map<String, String> env;
    private Map<String, String> headers;
    private String method;
    private Map<String, String> other;
    private String queryString;
    private Map<String, Object> unknown;
    private String url;

    @ApiStatus.Internal
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public String getCookies() {
        return this.cookies;
    }

    public Object getData() {
        return this.data;
    }

    public Map<String, String> getEnvs() {
        return this.env;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public Map<String, String> getOthers() {
        return this.other;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUrl() {
        return this.url;
    }

    public void setCookies(String str) {
        this.cookies = str;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setEnvs(Map<String, String> map) {
        this.env = map;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setOthers(Map<String, String> map) {
        this.other = map;
    }

    public void setQueryString(String str) {
        this.queryString = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Request clone() throws CloneNotSupportedException {
        Request request = (Request) super.clone();
        request.headers = CollectionUtils.shallowCopy(this.headers);
        request.env = CollectionUtils.shallowCopy(this.env);
        request.other = CollectionUtils.shallowCopy(this.other);
        request.unknown = CollectionUtils.shallowCopy(this.unknown);
        return request;
    }
}
