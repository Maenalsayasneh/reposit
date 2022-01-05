package com.pubnub.api.managers;

import com.pubnub.api.PNConfiguration;

public class BasePathManager {
    private static final String DEFAULT_BASE_PATH = "pndsn.com";
    private static final String DEFAULT_SUBDOMAIN = "ps";
    private static final int MAX_SUBDOMAIN = 20;
    private PNConfiguration config;
    private int currentSubdomain = 1;

    public BasePathManager(PNConfiguration pNConfiguration) {
        this.config = pNConfiguration;
    }

    public String getBasePath() {
        StringBuilder sb = new StringBuilder("http");
        if (this.config.isSecure()) {
            sb.append("s");
        }
        sb.append("://");
        if (this.config.getOrigin() != null) {
            sb.append(this.config.getOrigin());
        } else if (this.config.isCacheBusting()) {
            sb.append(DEFAULT_SUBDOMAIN);
            sb.append(this.currentSubdomain);
            sb.append(".");
            sb.append(DEFAULT_BASE_PATH);
            int i = this.currentSubdomain;
            if (i == 20) {
                this.currentSubdomain = 1;
            } else {
                this.currentSubdomain = i + 1;
            }
        } else {
            sb.append(DEFAULT_SUBDOMAIN);
            sb.append(".");
            sb.append(DEFAULT_BASE_PATH);
        }
        return sb.toString();
    }
}
