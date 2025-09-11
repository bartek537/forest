package pl.bartek537.forest.settings.data.repository

import kotlinx.coroutines.flow.Flow
import pl.bartek537.forest.settings.data.source.SettingsStore
import pl.bartek537.forest.settings.domain.model.Settings
import pl.bartek537.forest.settings.domain.repository.SettingsRepository

class SettingsRepositoryImpl(
    private val settingsStore: SettingsStore
) : SettingsRepository {

    override fun getSettings(): Flow<Settings> {
        return settingsStore.getSettings()
    }
}