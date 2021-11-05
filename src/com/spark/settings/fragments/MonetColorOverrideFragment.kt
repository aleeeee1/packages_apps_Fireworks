/*
 * Copyright (C) 2021 AOSP-Krypton Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.spark.settings.fragments

import android.annotation.ColorInt

import androidx.preference.PreferenceDataStore

import com.spark.settings.fragments.ColorPickerFragment

class MonetColorOverrideFragment(
    private val settingKey: String?,
    private val preferenceDataStore: PreferenceDataStore?,
    @ColorInt defaultColor: Int
): ColorPickerFragment(defaultColor) {
    override fun persistValue(hexColor: String) {
        settingKey?.let { preferenceDataStore?.putString(settingKey, hexColor) }
    }
}
