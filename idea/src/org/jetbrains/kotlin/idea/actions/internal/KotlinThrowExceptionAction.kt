/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.actions.internal

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class KotlinThrowExceptionAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        throw IllegalStateException("Kotlin Test Exception")
    }
}
