package com.islandparadise14.bitcoinfeature

import io.kotest.core.config.AbstractProjectConfig

class ProjectConfig : AbstractProjectConfig() {
    override var testCoroutineDispatcher = true
}