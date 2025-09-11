package pl.bartek537.forest.settings.domain.usecase

import pl.bartek537.forest.core.domain.model.DaySettings
import pl.bartek537.forest.core.domain.repository.DayRepository

interface UpdateDaySettings {

    suspend operator fun invoke(daySettings: DaySettings)
}

class UpdateDaySettingsImpl(
    private val dayRepository: DayRepository
) : UpdateDaySettings {

    override suspend fun invoke(daySettings: DaySettings) {
        dayRepository.updateDaySettings(daySettings)
    }
}