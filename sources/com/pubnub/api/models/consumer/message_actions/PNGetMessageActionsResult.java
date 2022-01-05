package com.pubnub.api.models.consumer.message_actions;

import com.google.gson.annotations.SerializedName;
import com.pubnub.api.models.consumer.PNBoundedPage;
import i0.d.a.a.a;
import java.util.List;

public class PNGetMessageActionsResult {
    @SerializedName("data")
    private final List<PNMessageAction> actions;
    @SerializedName("more")
    private final PNBoundedPage page;

    public static class PNGetMessageActionsResultBuilder {
        private List<PNMessageAction> actions;
        private PNBoundedPage page;

        public PNGetMessageActionsResultBuilder actions(List<PNMessageAction> list) {
            this.actions = list;
            return this;
        }

        public PNGetMessageActionsResult build() {
            return new PNGetMessageActionsResult(this.actions, this.page);
        }

        public PNGetMessageActionsResultBuilder page(PNBoundedPage pNBoundedPage) {
            this.page = pNBoundedPage;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNGetMessageActionsResult.PNGetMessageActionsResultBuilder(actions=");
            P0.append(this.actions);
            P0.append(", page=");
            P0.append(this.page);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNGetMessageActionsResult(List<PNMessageAction> list, PNBoundedPage pNBoundedPage) {
        this.actions = list;
        this.page = pNBoundedPage;
    }

    public static PNGetMessageActionsResultBuilder builder() {
        return new PNGetMessageActionsResultBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNGetMessageActionsResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNGetMessageActionsResult)) {
            return false;
        }
        PNGetMessageActionsResult pNGetMessageActionsResult = (PNGetMessageActionsResult) obj;
        if (!pNGetMessageActionsResult.canEqual(this)) {
            return false;
        }
        List<PNMessageAction> actions2 = getActions();
        List<PNMessageAction> actions3 = pNGetMessageActionsResult.getActions();
        if (actions2 != null ? !actions2.equals(actions3) : actions3 != null) {
            return false;
        }
        PNBoundedPage page2 = getPage();
        PNBoundedPage page3 = pNGetMessageActionsResult.getPage();
        return page2 != null ? page2.equals(page3) : page3 == null;
    }

    public List<PNMessageAction> getActions() {
        return this.actions;
    }

    public PNBoundedPage getPage() {
        return this.page;
    }

    public int hashCode() {
        List<PNMessageAction> actions2 = getActions();
        int i = 43;
        int hashCode = actions2 == null ? 43 : actions2.hashCode();
        PNBoundedPage page2 = getPage();
        int i2 = (hashCode + 59) * 59;
        if (page2 != null) {
            i = page2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNGetMessageActionsResult(actions=");
        P0.append(getActions());
        P0.append(", page=");
        P0.append(getPage());
        P0.append(")");
        return P0.toString();
    }
}
