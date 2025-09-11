package pl.bartek537.forest.stats.domain.usecase

import pl.bartek537.forest.core.domain.repository.DayRepository

class StatsDetailsUseCases(
    dayRepository: DayRepository
) {

    val getFirstDate: GetFirstDate = GetFirstDateImpl(dayRepository)
}