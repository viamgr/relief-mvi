package app.vahid.android.releife

import app.vahid.android.releife.pattern.Pattern
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

fun asPattern(extra: () -> Unit = {}) = emptyFlow<Pattern>().also {
    extra()
}

fun <Pattern> Pattern.asPattern() = flowOf(this)

fun asPattern(block: suspend () -> Flow<Pattern>) = flow {
    block().collect {
        emit(it)
    }
}
