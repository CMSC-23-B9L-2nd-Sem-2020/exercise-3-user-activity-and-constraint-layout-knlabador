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

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * The colorMyViews app demonstrates how to use a ConstraintLayout using
 * the Layout Editor.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var nicknameEditText: EditText
    private lateinit var changeNicknameButton: Button
    private lateinit var nicknameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nicknameEditText = findViewById(R.id.nickname_text)
        nicknameTextView = findViewById(R.id.nickname_user)
        changeNicknameButton = findViewById(R.id.submit_button)

        changeNicknameButton.setOnClickListener {
            changeNickname(it)
        }

        nicknameTextView.setOnClickListener {
            updateNickname()
        }
        setListeners()
    }

    private fun updateNickname() {
        nicknameTextView.visibility = View.GONE
        nicknameEditText.visibility = View.VISIBLE
        changeNicknameButton.visibility = View.VISIBLE

        nicknameEditText.requestFocus()
    }

    private fun changeNickname(view: View) {
        nicknameTextView.text = nicknameEditText.text

        nicknameTextView.visibility = View.VISIBLE
        nicknameEditText.visibility = View.GONE
        changeNicknameButton.visibility = View.GONE

        val inputMethodManager: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)

    }

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
        val resetButton = findViewById<TextView>(R.id.reset_button)

        val board : List<List<View>> = listOf(
            listOf(boxOne,boxTwo,boxThree,boxFour,boxFive),
            listOf(boxSix,boxSeven,boxEight,boxNine,boxTen),
            listOf(boxEleven,boxTwelve,boxThirteen,boxFourteen,boxFifteen),
            listOf(boxSixteen,boxSeventeen,boxEighteen,boxNineteen,boxTwenty),
            listOf(boxTwentyOne,boxTwentyTwo,boxTwentyThree,boxTwentyFour,boxTwentyFive)
        )

        val boardlight : Array<Array<Int>> = arrayOf(
            arrayOf(1,1,1,1,1),
            arrayOf(1,1,1,1,1),
            arrayOf(1,1,1,1,1),
            arrayOf(1,1,1,1,1),
            arrayOf(1,1,1,1,1)
        )

        for (i in 0..4) {
            for(j in 0..4) {
                board[i][j].setOnClickListener { flipLights(it,board,i,j,boardlight) }
            }
        }
    }

        private fun change(view: View,i: Int,j: Int, light: Array<Array<Int>>) {
            if(light[i][j] == 1) {
                light[i][j] = 0
                view.setBackgroundColor(Color.BLACK)
            }
            else {
                light[i][j] = 1
                view.setBackgroundColor(Color.WHITE)
            }
        }

        private fun flipLights(view: View,board: List<List<View>>,i: Int,j: Int, light: Array<Array<Int>>) {

            change(view,i,j,light)

            if(i==0) {
                if(j==0) {
                    change(board[i][j+1],i,j+1,light)
                }
                else if(j==4) {
                    change(board[i][j-1],i,j-1,light)
                }
                else {
                    change(board[i][j-1],i,j-1,light)
                    change(board[i][j+1],i,j+1,light)
                }
                change(board[i+1][j],i+1,j,light)
            }

            else if(i==4) {
                if(j==0) {
                    change(board[i][j+1],i,j+1,light)
                }
                else if(j==4) {
                    change(board[i][j-1],i,j-1,light)
                }
                else {
                    change(board[i][j-1],i,j-1,light)
                    change(board[i][j+1],i,j+1,light)
                }
                change(board[i-1][j],i-1,j,light)
            }

            else {
                change(board[i-1][j],i-1,j,light)
                change(board[i+1][j],i+1,j,light)
                change(board[i][j-1],i,j-1,light)
                change(board[i][j+1],i,j+1,light)
            }



//        if (i == 0) {
//            if(j==0 || j==4)
//            //adj with box2,box6
//            R.id.box1 -> view.setBackgroundColor(Color.BLACK)
//
//            //ad
//            R.id.box2 -> view.setBackgroundColor(Color.BLACK)
//
//            R.id.box25 -> view.setBackgroundColor(Color.BLACK)
//        }
    }
}
