package app.vahid.android.releife.viewmodel

import app.vahid.android.releife.pattern.Pattern
import app.vahid.android.releife.pattern.SideEffect
import app.vahid.android.releife.pattern.State
import kotlinx.coroutines.flow.Flow
import org.orbitmvi.orbit.ContainerHost

interface ReducerContainerHost<
    INTENT : Pattern,
    STATE : State,
    SIDE_EFFECT : SideEffect,
    > : ContainerHost<STATE, SIDE_EFFECT> {
    suspend fun onNewIntent(intent: INTENT): Flow<Pattern>
}
