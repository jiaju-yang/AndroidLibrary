package io.github.psychesworld.cleanarchitecture.domain.interactor;

import io.github.psychesworld.cleanarchitecture.domain.executor.ExecutionThread;
import io.github.psychesworld.cleanarchitecture.domain.executor.PostExecutionThread;
import rx.Subscription;
import rx.subscriptions.Subscriptions;

abstract class Interactor {
    protected ExecutionThread executionThread;
    protected PostExecutionThread postExecutionThread;
    protected Subscription subscription = Subscriptions.empty();

    public Interactor(ExecutionThread executionThread, PostExecutionThread postExecutionThread) {
        this.executionThread = executionThread;
        this.postExecutionThread = postExecutionThread;
    }

    public void setExecutionThread(ExecutionThread threadExecutor) {
        this.executionThread = threadExecutor;
    }

    public void setPostExecutionThread(PostExecutionThread postExecutionThread) {
        this.postExecutionThread = postExecutionThread;
    }

    public Subscription getSubscription() {
        return subscription;
    }
}
