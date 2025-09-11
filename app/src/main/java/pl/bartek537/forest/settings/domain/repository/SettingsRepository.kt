package pl.bartek537.forest.settings.domain.repository

import kotlinx.coroutines.flow.Flow
import pl.bartek537.forest.settings.domain.model.Settings

interface SettingsRepository {

    fun getSettings(): Flow<Settings>
}