package app.vahid.android.releife.viewmodel

import app.vahid.android.releife.pattern.Intent
import app.vahid.android.releife.pattern.Pattern
import app.vahid.android.releife.pattern.Reducer
import app.vahid.android.releife.pattern.SideEffect
import app.vahid.android.releife.pattern.State
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce

@Suppress("UNCHECKED_CAST")
fun <INTENT : Intent, STATE : State, SIDE_EFFECT : SideEffect>
    ReducerContainerHost<INTENT, STATE, SIDE_EFFECT>.dispatchIntent(
        intent: INTENT,
    ) {
    intent {
        onNewIntent(intent)
            .onEach { event: Pattern ->
                when (event) {
                    is Reducer<*> -> reduce {
                        (event as Reducer<STATE>).invoke(state)
                    }
                    is Intent -> dispatchIntent(event as INTENT)
                    is SideEffect -> postSideEffect(event as SIDE_EFFECT)
                }
            }.collect()
    }
}
