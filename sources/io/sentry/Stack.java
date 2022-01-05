package io.sentry;

import io.sentry.util.Objects;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public final class Stack {
    private final Deque<StackItem> items;
    private final ILogger logger;

    public Stack(ILogger iLogger, StackItem stackItem) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.items = linkedBlockingDeque;
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "logger is required");
        linkedBlockingDeque.push((StackItem) Objects.requireNonNull(stackItem, "rootStackItem is required"));
    }

    public StackItem peek() {
        return this.items.peek();
    }

    public void pop() {
        synchronized (this.items) {
            if (this.items.size() != 1) {
                this.items.pop();
            } else {
                this.logger.log(SentryLevel.WARNING, "Attempt to pop the root scope.", new Object[0]);
            }
        }
    }

    public void push(StackItem stackItem) {
        this.items.push(stackItem);
    }

    public int size() {
        return this.items.size();
    }

    public static final class StackItem {
        private volatile ISentryClient client;
        private final SentryOptions options;
        private volatile Scope scope;

        public StackItem(SentryOptions sentryOptions, ISentryClient iSentryClient, Scope scope2) {
            this.client = (ISentryClient) Objects.requireNonNull(iSentryClient, "ISentryClient is required.");
            this.scope = (Scope) Objects.requireNonNull(scope2, "Scope is required.");
            this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "Options is required");
        }

        public ISentryClient getClient() {
            return this.client;
        }

        public SentryOptions getOptions() {
            return this.options;
        }

        public Scope getScope() {
            return this.scope;
        }

        public void setClient(ISentryClient iSentryClient) {
            this.client = iSentryClient;
        }

        public StackItem(StackItem stackItem) {
            this.options = stackItem.options;
            this.client = stackItem.client;
            try {
                this.scope = stackItem.scope.clone();
            } catch (CloneNotSupportedException unused) {
                this.options.getLogger().log(SentryLevel.ERROR, "Clone not supported", new Object[0]);
                this.scope = new Scope(stackItem.options);
            }
        }
    }

    public Stack(Stack stack) {
        this(stack.logger, stack.items.getFirst());
        for (StackItem stackItem : stack.items) {
            push(new StackItem(stackItem));
        }
    }
}
