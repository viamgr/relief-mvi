package app.vahid.android.releife.pattern

interface Reducer<STATE : State> : Pattern {
    operator fun invoke(state: STATE): STATE
}
