package pl.bartek537.forest.stats.domain.usecase

import pl.bartek537.forest.core.domain.repository.DayRepository

class StatsChartPageUseCases(
    dayRepository: DayRepository
) {

    val getWeek: GetWeek = GetWeekImpl(dayRepository)
}