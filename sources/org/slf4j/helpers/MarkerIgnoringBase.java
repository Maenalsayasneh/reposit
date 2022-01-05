package org.slf4j.helpers;

import s0.c.b;

public abstract class MarkerIgnoringBase extends NamedLoggerBase implements b {
    public String toString() {
        return getClass().getName() + "(" + "NOP" + ")";
    }
}
