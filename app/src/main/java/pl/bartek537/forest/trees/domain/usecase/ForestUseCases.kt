package pl.bartek537.forest.trees.domain.usecase

import pl.bartek537.forest.core.domain.repository.DayRepository

class ForestUseCases(
    dayRepository: DayRepository
) {

    val getTreeCount: GetTreeCount = GetTreeCountImpl(dayRepository)
}