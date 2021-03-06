package io.zeebe.bpmnspec.actions

import io.zeebe.bpmnspec.api.Action
import io.zeebe.bpmnspec.api.TestContext
import io.zeebe.bpmnspec.api.runner.TestRunner

class CancelInstanceAction(
    val processInstance: String?
) : Action {

    override fun execute(runner: TestRunner, testContext: TestContext) {
        val context = testContext.getContext(processInstance)

        runner.cancelProcessInstance(context)
    }
}