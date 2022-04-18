/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

}


/*
A Fragment represents a behavior or a portion of user interface (UI) in an Activity.
You can combine multiple fragments in a single activity to build a multi-pane UI, and you can reuse a Fragment in multiple activities.
Think of a Fragment as a modular section of an activity, something like a "sub-activity" that you can also use in other activities:
    - A Fragment has its own lifecycle and receives its own input events.
    - You can add or remove a Fragment while the activity is running.
    - A Fragment is defined in a Kotlin class.
    - A Fragment's UI is defined in an XML layout file.
 */


