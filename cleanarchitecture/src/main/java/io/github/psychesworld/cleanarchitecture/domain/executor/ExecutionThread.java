package io.github.psychesworld.cleanarchitecture.domain.executor;

import rx.Scheduler;

public interface ExecutionThread {
    Scheduler getScheduler();
}
