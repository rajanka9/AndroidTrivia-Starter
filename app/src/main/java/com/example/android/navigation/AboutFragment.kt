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
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }
}

/* Summary 6
    A Fragment is a modular section of an activity.
    A Fragment has its own lifecycle and receives its own input events.
    Use the <fragment> tag to define the layout for the Fragment in the XML layout file.
    Inflate the layout for a Fragment in onCreateView().
    You can add or remove a Fragment while the activity is running.
*/

/*
The Navigation component is a library that can manage complex navigation, transition animation, deep linking, and compile-time checked argument passing between the screens in your app.
To use the navigation library, you need to add the navigation dependencies to your Gradle files
*/