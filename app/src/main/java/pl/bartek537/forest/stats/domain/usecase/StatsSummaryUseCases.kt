package pl.bartek537.forest.stats.domain.usecase

import pl.bartek537.forest.core.domain.repository.DayRepository

class StatsSummaryUseCases(
    dayRepository: DayRepository
) {

    val getSummary: GetSummary = GetSummaryImpl(dayRepository)
}