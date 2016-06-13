package io.github.psychesworld.cleanarchitecture.domain.executor;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Scheduler;
import rx.schedulers.Schedulers;

@Singleton
public class IOThread implements ExecutionThread {

    @Inject
    public IOThread() {
    }

    @Override
    public Scheduler getScheduler() {
        return Schedulers.io();
    }
}
