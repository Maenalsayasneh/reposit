package com.pubnub.api.models.consumer.message_actions;

import i0.d.a.a.a;

public class PNAddMessageActionResult extends PNMessageAction {

    public static class PNAddMessageActionResultBuilder {
        private PNMessageAction pnMessageAction;

        public PNAddMessageActionResult build() {
            return new PNAddMessageActionResult(this.pnMessageAction);
        }

        public PNAddMessageActionResultBuilder pnMessageAction(PNMessageAction pNMessageAction) {
            this.pnMessageAction = pNMessageAction;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNAddMessageActionResult.PNAddMessageActionResultBuilder(pnMessageAction=");
            P0.append(this.pnMessageAction);
            P0.append(")");
            return P0.toString();
        }
    }

    public static PNAddMessageActionResultBuilder builder() {
        return new PNAddMessageActionResultBuilder();
    }

    private PNAddMessageActionResult(PNMessageAction pNMessageAction) {
        super(pNMessageAction);
    }
}
