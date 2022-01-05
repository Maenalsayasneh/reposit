package com.pubnub.api.models.consumer.pubsub.message_actions;

import com.pubnub.api.models.consumer.message_actions.PNMessageAction;
import com.pubnub.api.models.consumer.pubsub.BasePubSubResult;
import com.pubnub.api.models.consumer.pubsub.objects.ObjectResult;
import i0.d.a.a.a;

public class PNMessageActionResult extends ObjectResult<PNMessageAction> {

    public static class PNMessageActionResultBuilder {
        private PNMessageAction data;
        private String event;
        private BasePubSubResult result;

        public PNMessageActionResult build() {
            return new PNMessageActionResult(this.result, this.event, this.data);
        }

        public PNMessageActionResultBuilder data(PNMessageAction pNMessageAction) {
            this.data = pNMessageAction;
            return this;
        }

        public PNMessageActionResultBuilder event(String str) {
            this.event = str;
            return this;
        }

        public PNMessageActionResultBuilder result(BasePubSubResult basePubSubResult) {
            this.result = basePubSubResult;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNMessageActionResult.PNMessageActionResultBuilder(result=");
            P0.append(this.result);
            P0.append(", event=");
            P0.append(this.event);
            P0.append(", data=");
            P0.append(this.data);
            P0.append(")");
            return P0.toString();
        }
    }

    public static PNMessageActionResultBuilder actionBuilder() {
        return new PNMessageActionResultBuilder();
    }

    public PNMessageAction getMessageAction() {
        return (PNMessageAction) this.data;
    }

    public String toString() {
        return a.y0(a.P0("PNMessageActionResult(super="), super.toString(), ")");
    }

    private PNMessageActionResult(BasePubSubResult basePubSubResult, String str, PNMessageAction pNMessageAction) {
        super(basePubSubResult, str, pNMessageAction);
    }
}
