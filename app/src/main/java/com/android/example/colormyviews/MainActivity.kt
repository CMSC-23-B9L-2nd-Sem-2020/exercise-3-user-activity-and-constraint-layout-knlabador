/*
 * Copyright (C) 2018 Google Inc.
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

package com.android.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * The colorMyViews app demonstrates how to use a ConstraintLayout using
 * the Layout Editor.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    /**
     * Attaches listeners to all the views.
     */
    private fun setListeners() {

        val boxOne = findViewById<TextView>(R.id.box1)
        val boxTwo = findViewById<TextView>(R.id.box2)
        val boxThree = findViewById<TextView>(R.id.box3)
        val boxFour = findViewById<TextView>(R.id.box4)
        val boxFive = findViewById<TextView>(R.id.box5)
        val boxSix = findViewById<TextView>(R.id.box6)
        val boxSeven = findViewById<TextView>(R.id.box7)
        val boxEight = findViewById<TextView>(R.id.box8)
        val boxNine = findViewById<TextView>(R.id.box9)
        val boxTen = findViewById<TextView>(R.id.box10)
        val boxEleven = findViewById<TextView>(R.id.box11)
        val boxTwelve = findViewById<TextView>(R.id.box12)
        val boxThirteen = findViewById<TextView>(R.id.box13)
        val boxFourteen = findViewById<TextView>(R.id.box14)
        val boxFifteen = findViewById<TextView>(R.id.box15)
        val boxSixteen = findViewById<TextView>(R.id.box16)
        val boxSeventeen = findViewById<TextView>(R.id.box17)
        val boxEighteen = findViewById<TextView>(R.id.box18)
        val boxNineteen = findViewById<TextView>(R.id.box19)
        val boxTwenty = findViewById<TextView>(R.id.box20)
        val boxTwentyOne = findViewById<TextView>(R.id.box21)
        val boxTwentyTwo = findViewById<TextView>(R.id.box22)
        val boxTwentyThree = findViewById<TextView>(R.id.box23)
        val boxTwentyFour = findViewById<TextView>(R.id.box24)
        val boxTwentyFive = findViewById<TextView>(R.id.box25)


        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val resetButton = findViewById<TextView>(R.id.reset_button)

        val clickableViews: List<View> =
            listOf(
                boxOne, boxTwo, boxTwentyFive, rootConstraintLayout, resetButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    /**
     * Sets the background color of a view depending on it's resource id.
     * This is a way of using one click handler to do similar operations on a
     * group of views.
     */

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box1 -> view.setBackgroundColor(Color.BLACK)
            R.id.box2 -> view.setBackgroundColor(Color.GRAY)

            R.id.box25 -> view.setBackgroundColor(Color.BLUE)


            else -> view.setBackgroundColor(Color.TRANSPARENT)
        }
    }
}
