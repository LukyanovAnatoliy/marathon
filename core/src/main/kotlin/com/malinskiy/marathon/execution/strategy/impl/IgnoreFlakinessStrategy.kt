package com.malinskiy.marathon.execution.strategy.impl

import com.malinskiy.marathon.execution.TestShard
import com.malinskiy.marathon.execution.strategy.FlakinessStrategy

class IgnoreFlakinessStrategy : FlakinessStrategy {
    override fun process(testShard: TestShard): TestShard = testShard
}