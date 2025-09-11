package pl.bartek537.forest.core.domain.usecase

import pl.bartek537.forest.core.domain.repository.DayRepository
import pl.bartek537.forest.settings.domain.repository.SettingsRepository

class DayUseCases(
    dayRepository: DayRepository,
    settingsRepository: SettingsRepository
) {

    val getDay: GetDay = GetDayImpl(dayRepository, settingsRepository)
    val incrementStepCount: IncrementStepCount = IncrementStepCountImpl(dayRepository, getDay)
}