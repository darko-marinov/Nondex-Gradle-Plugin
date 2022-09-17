package edu.illinois.nondex.gradle.internal;

public class RoundResult {
    final TestNames failedTests;
    final boolean lastRound;
    final boolean hasRetryFilteredFailures;

    RoundResult(
            TestNames failedTests,
            TestNames nonRetriedTests,
            boolean lastRound,
            boolean hasRetryFilteredFailures
    ) {
        this.failedTests = failedTests;
        this.lastRound = lastRound;
        this.hasRetryFilteredFailures = hasRetryFilteredFailures;
    }
}
