package pl.bartek537.forest.settings.domain.usecase

import pl.bartek537.forest.core.domain.repository.DayRepository
import pl.bartek537.forest.settings.domain.repository.SettingsRepository

class SettingsUseCases(
    settingsRepository: SettingsRepository,
    dayRepository: DayRepository,
) {

    val getSettings: GetSettings = GetSettingsImpl(settingsRepository)
    val updateDaySettings: UpdateDaySettings = UpdateDaySettingsImpl(dayRepository)
}