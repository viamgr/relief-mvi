package app.vahid.android.releife.viewmodel

import app.vahid.android.releife.pattern.State

val ReducerContainerHost<*, *, *>.state: State
    get() = container.stateFlow.value