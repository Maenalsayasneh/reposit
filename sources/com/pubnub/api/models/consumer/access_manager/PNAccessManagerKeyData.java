package com.pubnub.api.models.consumer.access_manager;

import com.google.gson.annotations.SerializedName;
import i0.d.a.a.a;

public class PNAccessManagerKeyData {
    @SerializedName("d")
    private boolean deleteEnabled;
    @SerializedName("g")
    private boolean getEnabled;
    @SerializedName("j")
    private boolean joinEnabled;
    @SerializedName("m")
    private boolean manageEnabled;
    @SerializedName("r")
    private boolean readEnabled;
    @SerializedName("u")
    private boolean updateEnabled;
    @SerializedName("w")
    private boolean writeEnabled;

    public static class PNAccessManagerKeyDataBuilder {
        private boolean deleteEnabled;
        private boolean getEnabled;
        private boolean joinEnabled;
        private boolean manageEnabled;
        private boolean readEnabled;
        private boolean updateEnabled;
        private boolean writeEnabled;

        public PNAccessManagerKeyData build() {
            return new PNAccessManagerKeyData(this.readEnabled, this.writeEnabled, this.manageEnabled, this.deleteEnabled, this.getEnabled, this.updateEnabled, this.joinEnabled);
        }

        public PNAccessManagerKeyDataBuilder deleteEnabled(boolean z) {
            this.deleteEnabled = z;
            return this;
        }

        public PNAccessManagerKeyDataBuilder getEnabled(boolean z) {
            this.getEnabled = z;
            return this;
        }

        public PNAccessManagerKeyDataBuilder joinEnabled(boolean z) {
            this.joinEnabled = z;
            return this;
        }

        public PNAccessManagerKeyDataBuilder manageEnabled(boolean z) {
            this.manageEnabled = z;
            return this;
        }

        public PNAccessManagerKeyDataBuilder readEnabled(boolean z) {
            this.readEnabled = z;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNAccessManagerKeyData.PNAccessManagerKeyDataBuilder(readEnabled=");
            P0.append(this.readEnabled);
            P0.append(", writeEnabled=");
            P0.append(this.writeEnabled);
            P0.append(", manageEnabled=");
            P0.append(this.manageEnabled);
            P0.append(", deleteEnabled=");
            P0.append(this.deleteEnabled);
            P0.append(", getEnabled=");
            P0.append(this.getEnabled);
            P0.append(", updateEnabled=");
            P0.append(this.updateEnabled);
            P0.append(", joinEnabled=");
            return a.D0(P0, this.joinEnabled, ")");
        }

        public PNAccessManagerKeyDataBuilder updateEnabled(boolean z) {
            this.updateEnabled = z;
            return this;
        }

        public PNAccessManagerKeyDataBuilder writeEnabled(boolean z) {
            this.writeEnabled = z;
            return this;
        }
    }

    public PNAccessManagerKeyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.readEnabled = z;
        this.writeEnabled = z2;
        this.manageEnabled = z3;
        this.deleteEnabled = z4;
        this.getEnabled = z5;
        this.updateEnabled = z6;
        this.joinEnabled = z7;
    }

    public static PNAccessManagerKeyDataBuilder builder() {
        return new PNAccessManagerKeyDataBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNAccessManagerKeyData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNAccessManagerKeyData)) {
            return false;
        }
        PNAccessManagerKeyData pNAccessManagerKeyData = (PNAccessManagerKeyData) obj;
        return pNAccessManagerKeyData.canEqual(this) && isReadEnabled() == pNAccessManagerKeyData.isReadEnabled() && isWriteEnabled() == pNAccessManagerKeyData.isWriteEnabled() && isManageEnabled() == pNAccessManagerKeyData.isManageEnabled() && isDeleteEnabled() == pNAccessManagerKeyData.isDeleteEnabled() && isGetEnabled() == pNAccessManagerKeyData.isGetEnabled() && isUpdateEnabled() == pNAccessManagerKeyData.isUpdateEnabled() && isJoinEnabled() == pNAccessManagerKeyData.isJoinEnabled();
    }

    public int hashCode() {
        int i = 79;
        int i2 = ((((((((((((isReadEnabled() ? 79 : 97) + 59) * 59) + (isWriteEnabled() ? 79 : 97)) * 59) + (isManageEnabled() ? 79 : 97)) * 59) + (isDeleteEnabled() ? 79 : 97)) * 59) + (isGetEnabled() ? 79 : 97)) * 59) + (isUpdateEnabled() ? 79 : 97)) * 59;
        if (!isJoinEnabled()) {
            i = 97;
        }
        return i2 + i;
    }

    public boolean isDeleteEnabled() {
        return this.deleteEnabled;
    }

    public boolean isGetEnabled() {
        return this.getEnabled;
    }

    public boolean isJoinEnabled() {
        return this.joinEnabled;
    }

    public boolean isManageEnabled() {
        return this.manageEnabled;
    }

    public boolean isReadEnabled() {
        return this.readEnabled;
    }

    public boolean isUpdateEnabled() {
        return this.updateEnabled;
    }

    public boolean isWriteEnabled() {
        return this.writeEnabled;
    }

    public void setDeleteEnabled(boolean z) {
        this.deleteEnabled = z;
    }

    public void setGetEnabled(boolean z) {
        this.getEnabled = z;
    }

    public void setJoinEnabled(boolean z) {
        this.joinEnabled = z;
    }

    public void setManageEnabled(boolean z) {
        this.manageEnabled = z;
    }

    public void setReadEnabled(boolean z) {
        this.readEnabled = z;
    }

    public void setUpdateEnabled(boolean z) {
        this.updateEnabled = z;
    }

    public void setWriteEnabled(boolean z) {
        this.writeEnabled = z;
    }

    public PNAccessManagerKeyDataBuilder toBuilder() {
        return new PNAccessManagerKeyDataBuilder().readEnabled(this.readEnabled).writeEnabled(this.writeEnabled).manageEnabled(this.manageEnabled).deleteEnabled(this.deleteEnabled).getEnabled(this.getEnabled).updateEnabled(this.updateEnabled).joinEnabled(this.joinEnabled);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNAccessManagerKeyData(readEnabled=");
        P0.append(isReadEnabled());
        P0.append(", writeEnabled=");
        P0.append(isWriteEnabled());
        P0.append(", manageEnabled=");
        P0.append(isManageEnabled());
        P0.append(", deleteEnabled=");
        P0.append(isDeleteEnabled());
        P0.append(", getEnabled=");
        P0.append(isGetEnabled());
        P0.append(", updateEnabled=");
        P0.append(isUpdateEnabled());
        P0.append(", joinEnabled=");
        P0.append(isJoinEnabled());
        P0.append(")");
        return P0.toString();
    }
}
