package com.robotpajamas.dispatcher.mocks

import com.robotpajamas.dispatcher.CompletionBlock
import com.robotpajamas.dispatcher.Dispatchable
import com.robotpajamas.dispatcher.ExecutionBlock
import com.robotpajamas.dispatcher.Result
import java.util.concurrent.TimeoutException

class MockDispatchable : Dispatchable {
    override val id: String
        get() = "MockId"

    override fun run() {

    }

    override var isCancelled: Boolean = false
    override val completions: MutableList<CompletionBlock<*>> = mutableListOf()
    override val execution: ExecutionBlock<*>
        get() = {}

    override var timeout: Int = 42

    override fun timedOut() {
        isTimedOut = true
    }

    // Test checks
    var isTimedOut = false

}