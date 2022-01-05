package com.pubnub.api.models.consumer.history;

import i0.d.a.a.a;
import java.util.List;

public class PNHistoryResult {
    private Long endTimetoken;
    private List<PNHistoryItemResult> messages;
    private Long startTimetoken;

    public static class PNHistoryResultBuilder {
        private Long endTimetoken;
        private List<PNHistoryItemResult> messages;
        private Long startTimetoken;

        public PNHistoryResult build() {
            return new PNHistoryResult(this.messages, this.startTimetoken, this.endTimetoken);
        }

        public PNHistoryResultBuilder endTimetoken(Long l) {
            this.endTimetoken = l;
            return this;
        }

        public PNHistoryResultBuilder messages(List<PNHistoryItemResult> list) {
            this.messages = list;
            return this;
        }

        public PNHistoryResultBuilder startTimetoken(Long l) {
            this.startTimetoken = l;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNHistoryResult.PNHistoryResultBuilder(messages=");
            P0.append(this.messages);
            P0.append(", startTimetoken=");
            P0.append(this.startTimetoken);
            P0.append(", endTimetoken=");
            P0.append(this.endTimetoken);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNHistoryResult(List<PNHistoryItemResult> list, Long l, Long l2) {
        this.messages = list;
        this.startTimetoken = l;
        this.endTimetoken = l2;
    }

    public static PNHistoryResultBuilder builder() {
        return new PNHistoryResultBuilder();
    }

    public Long getEndTimetoken() {
        return this.endTimetoken;
    }

    public List<PNHistoryItemResult> getMessages() {
        return this.messages;
    }

    public Long getStartTimetoken() {
        return this.startTimetoken;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNHistoryResult(messages=");
        P0.append(getMessages());
        P0.append(", startTimetoken=");
        P0.append(getStartTimetoken());
        P0.append(", endTimetoken=");
        P0.append(getEndTimetoken());
        P0.append(")");
        return P0.toString();
    }
}
