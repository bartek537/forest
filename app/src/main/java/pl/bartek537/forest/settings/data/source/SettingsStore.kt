package pl.bartek537.forest.settings.data.source

import kotlinx.coroutines.flow.Flow
import pl.bartek537.forest.settings.domain.model.Settings

interface SettingsStore {

    fun getSettings(): Flow<Settings>
}