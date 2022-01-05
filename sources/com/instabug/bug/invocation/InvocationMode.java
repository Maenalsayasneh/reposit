package com.instabug.bug.invocation;

import java.io.Serializable;

@Deprecated
public enum InvocationMode implements Serializable {
    PROMPT_OPTION,
    NEW_BUG,
    NEW_FEEDBACK,
    NEW_CHAT,
    CHATS_LIST
}
