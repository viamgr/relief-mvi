package app.vahid.android.releife.viewmodel

import androidx.lifecycle.ViewModel
import app.vahid.android.releife.pattern.Pattern
import app.vahid.android.releife.pattern.SideEffect
import app.vahid.android.releife.pattern.State
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.viewmodel.container

abstract class BaseViewModel<
    INTENT : Pattern,
    STATE : State,
    SIDE_EFFECT : SideEffect,
    >
(initialState: STATE) : ViewModel(), ReducerContainerHost<INTENT, STATE, SIDE_EFFECT> {

    override val container: Container<STATE, SIDE_EFFECT> = container(initialState)
}
