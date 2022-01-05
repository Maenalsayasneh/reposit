package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.node.ContainerNode;
import java.util.Objects;

public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode {
    public final JsonNodeFactory c;

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this.c = jsonNodeFactory;
    }

    public final NullNode v() {
        Objects.requireNonNull(this.c);
        return NullNode.c;
    }
}
