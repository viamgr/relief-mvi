package app.vahid.android.releife.strategy

import app.vahid.android.releife.pattern.Pattern
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.merge

infix fun Flow<Pattern>.series(
    other: Flow<Pattern>,
): Flow<Pattern> = seriesEffects(this, other)

private fun seriesEffects(
    vararg flows: Flow<Pattern>,
): Flow<Pattern> = merge(*flows)

