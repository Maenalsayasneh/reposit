package com.clubhouse.android.data.models.local.channel;

import i0.e.b.b3.a.b.c.f;
import n0.c.e;

@e(with = f.class)
/* compiled from: Message.kt */
public enum MessageType {
    Unknown("unknown", false, 2, (boolean) null),
    JoinChannel("join_channel", true),
    LeaveChannel("leave_channel", true),
    AddSpeaker("add_speaker", true),
    RemoveSpeaker("remove_speaker", true),
    EndChannel("end_channel", false, 2, (boolean) null),
    MakeChannelPublic("make_channel_public", false, 2, (boolean) null),
    MakeChannelSocial("make_channel_social", false, 2, (boolean) null),
    RejectWelcomeChannel("reject_welcome_channel", false, 2, (boolean) null),
    MadeModerator("make_moderator", true),
    ChangeHandraiseSettings("change_handraise_settings", false, 2, (boolean) null),
    RaiseHand("raise_hands", false, 2, (boolean) null),
    UnraiseHand("unraise_hands", false, 2, (boolean) null),
    InviteSpeaker("invite_speaker", false, 2, (boolean) null),
    UninviteSpeaker("uninvite_speaker", false, 2, (boolean) null),
    RejectSpeakerInvite("reject_speaker_invite", false, 2, (boolean) null),
    AcceptSpeakerInvite("accept_speaker_invite", false, 2, (boolean) null),
    RemoveFromChannel("remove_from_channel", false, 2, (boolean) null),
    MuteSpeaker("mute_speaker", false, 2, (boolean) null),
    InviteToNewChannel("invite_to_new_channel", false, 2, (boolean) null),
    AcceptNewChannelInvite("accept_new_channel_invite", false, 2, (boolean) null),
    RejectNewChannelInvite("reject_new_channel_invite", false, 2, (boolean) null),
    CancelNewChannelInvite("cancel_new_channel_invite", false, 2, (boolean) null),
    ClipsSettingsChanged("clips_settings_changed", false, 2, (boolean) null);
    
    private final String action;
    private final boolean shouldBatch;

    private MessageType(String str, boolean z) {
        this.action = str;
        this.shouldBatch = z;
    }

    public final String getAction() {
        return this.action;
    }

    public final boolean getShouldBatch() {
        return this.shouldBatch;
    }
}
