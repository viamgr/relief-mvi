package app.vahid.android.releife.strategy

import app.vahid.android.releife.pattern.Pattern
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flatMapMerge

infix fun Flow<Pattern>.parallel(
    other: Flow<Pattern>,
): Flow<Pattern> = parallelEffects(this, other)

private fun parallelEffects(
    vararg flows: Flow<Pattern>,
): Flow<Pattern> = flows
    .asFlow()
    .flatMapMerge { it }
