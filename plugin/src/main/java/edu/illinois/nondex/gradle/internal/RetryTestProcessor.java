package edu.illinois.nondex.gradle.internal;

import org.gradle.api.internal.tasks.testing.TestCompleteEvent;
import org.gradle.api.internal.tasks.testing.TestDescriptorInternal;
import org.gradle.api.internal.tasks.testing.TestResultProcessor;
import org.gradle.api.internal.tasks.testing.TestStartEvent;
import org.gradle.api.tasks.testing.TestOutputEvent;
import org.gradle.api.tasks.testing.TestFailure;

import java.util.LinkedHashSet;
import java.util.Set;

public class RetryTestProcessor implements TestResultProcessor {
    private final TestResultProcessor delegate;
    private Set<String> failingTests = new LinkedHashSet<>();

    RetryTestProcessor(TestResultProcessor delegate) {
        this.delegate = delegate;
    }

    @Override
    public void started(TestDescriptorInternal descriptor, TestStartEvent testStartEvent) {
    }

    @Override
    public void completed(Object testId, TestCompleteEvent testCompleteEvent) {
    }

    @Override
    public void output(Object testId, TestOutputEvent testOutputEvent) {
        delegate.output(testId, testOutputEvent);
    }

    @Override
    public void failure(Object o, TestFailure result) {

    }

    public Set<String> getFailingTests() {
        return this.failingTests;
    }

}
