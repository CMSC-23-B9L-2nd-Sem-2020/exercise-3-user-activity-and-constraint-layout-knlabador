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

    private lateinit var headerText: TextView
    private lateinit var nicknameEditText: EditText
    private lateinit var changeNicknameButton: Button
    private lateinit var resetBoardButton: Button
    private lateinit var nicknameTextView: TextView
    private var numOfClicks = 0
    private lateinit var clicksText: TextView
    private lateinit var boxOne: TextView
    private lateinit var boxTwo: TextView
    private lateinit var boxThree: TextView
    private lateinit var boxFour: TextView
    private lateinit var boxFive: TextView
    private lateinit var boxSix: TextView
    private lateinit var boxSeven: TextView
    private lateinit var boxEight: TextView
    private lateinit var boxNine: TextView
    private lateinit var boxTen: TextView
    private lateinit var boxEleven: TextView
    private lateinit var boxTwelve: TextView
    private lateinit var boxThirteen: TextView
    private lateinit var boxFourteen: TextView
    private lateinit var boxFifteen: TextView
    private lateinit var boxSixteen: TextView
    private lateinit var boxSeventeen: TextView
    private lateinit var boxEighteen: TextView
    private lateinit var boxNineteen: TextView
    private lateinit var boxTwenty: TextView
    private lateinit var boxTwentyOne: TextView
    private lateinit var boxTwentyTwo: TextView
    private lateinit var boxTwentyThree: TextView
    private lateinit var boxTwentyFour: TextView
    private lateinit var boxTwentyFive: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        headerText = findViewById(R.id.header_text)
        nicknameEditText = findViewById(R.id.nickname_text)
        nicknameTextView = findViewById(R.id.nickname_user)
        changeNicknameButton = findViewById(R.id.submit_button)
        boxOne = findViewById(R.id.box1)
        boxTwo = findViewById(R.id.box2)
        boxThree = findViewById(R.id.box3)
        boxFour = findViewById(R.id.box4)
        boxFive = findViewById(R.id.box5)
        boxSix = findViewById(R.id.box6)
        boxSeven = findViewById(R.id.box7)
        boxEight = findViewById(R.id.box8)
        boxNine = findViewById(R.id.box9)
        boxTen = findViewById(R.id.box10)
        boxEleven = findViewById(R.id.box11)
        boxTwelve = findViewById(R.id.box12)
        boxThirteen = findViewById(R.id.box13)
        boxFourteen = findViewById(R.id.box14)
        boxFifteen = findViewById(R.id.box15)
        boxSixteen = findViewById(R.id.box16)
        boxSeventeen = findViewById(R.id.box17)
        boxEighteen = findViewById(R.id.box18)
        boxNineteen = findViewById(R.id.box19)
        boxTwenty = findViewById(R.id.box20)
        boxTwentyOne = findViewById(R.id.box21)
        boxTwentyTwo = findViewById(R.id.box22)
        boxTwentyThree = findViewById(R.id.box23)
        boxTwentyFour = findViewById(R.id.box24)
        boxTwentyFive = findViewById(R.id.box25)
        resetBoardButton = findViewById(R.id.reset_button)
        clicksText = findViewById(R.id.clicks_text)

        boxOne.visibility = View.GONE
        boxTwo.visibility = View.GONE
        boxThree.visibility = View.GONE
        boxFour.visibility = View.GONE
        boxFive.visibility = View.GONE
        boxSix.visibility = View.GONE
        boxSeven.visibility = View.GONE
        boxEight.visibility = View.GONE
        boxNine.visibility = View.GONE
        boxTen.visibility = View.GONE
        boxEleven.visibility = View.GONE
        boxTwelve.visibility = View.GONE
        boxThirteen.visibility = View.GONE
        boxFourteen.visibility = View.GONE
        boxFifteen.visibility = View.GONE
        boxSixteen.visibility = View.GONE
        boxSeventeen.visibility = View.GONE
        boxEighteen.visibility = View.GONE
        boxNineteen.visibility = View.GONE
        boxTwenty.visibility = View.GONE
        boxTwentyOne.visibility = View.GONE
        boxTwentyTwo.visibility = View.GONE
        boxTwentyThree.visibility = View.GONE
        boxTwentyFour.visibility = View.GONE
        boxTwentyFive.visibility = View.GONE
        resetBoardButton.visibility = View.GONE
        clicksText.visibility = View.GONE

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
        boxOne.visibility = View.VISIBLE
        boxTwo.visibility = View.VISIBLE
        boxThree.visibility = View.VISIBLE
        boxFour.visibility = View.VISIBLE
        boxFive.visibility = View.VISIBLE
        boxSix.visibility = View.VISIBLE
        boxSeven.visibility = View.VISIBLE
        boxEight.visibility = View.VISIBLE
        boxNine.visibility = View.VISIBLE
        boxTen.visibility = View.VISIBLE
        boxEleven.visibility = View.VISIBLE
        boxTwelve.visibility = View.VISIBLE
        boxThirteen.visibility = View.VISIBLE
        boxFourteen.visibility = View.VISIBLE
        boxFifteen.visibility = View.VISIBLE
        boxSixteen.visibility = View.VISIBLE
        boxSeventeen.visibility = View.VISIBLE
        boxEighteen.visibility = View.VISIBLE
        boxNineteen.visibility = View.VISIBLE
        boxTwenty.visibility = View.VISIBLE
        boxTwentyOne.visibility = View.VISIBLE
        boxTwentyTwo.visibility = View.VISIBLE
        boxTwentyThree.visibility = View.VISIBLE
        boxTwentyFour.visibility = View.VISIBLE
        boxTwentyFive.visibility = View.VISIBLE
        resetBoardButton.visibility = View.VISIBLE
        clicksText.visibility = View.VISIBLE

        val inputMethodManager: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)

    }

    private fun setListeners() {

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

        resetBoardButton.setOnClickListener {
            retry(board,boardlight)
        }
    }

    private fun retry(board: List<List<View>>,light: Array<Array<Int>>) {
        for (i in 0..4) {
            for(j in 0..4) {
                board[i][j].setBackgroundColor(Color.WHITE)
                light[i][j] = 1
                numOfClicks = 0
                var text = "Clicks: " + numOfClicks
                clicksText.text = text
                var header: String = "Play the Lights Out Game!"
                headerText.text = header
                nicknameTextView.visibility = View.VISIBLE
                nicknameEditText.visibility = View.GONE
                changeNicknameButton.visibility = View.GONE
                boxOne.visibility = View.VISIBLE
                boxTwo.visibility = View.VISIBLE
                boxThree.visibility = View.VISIBLE
                boxFour.visibility = View.VISIBLE
                boxFive.visibility = View.VISIBLE
                boxSix.visibility = View.VISIBLE
                boxSeven.visibility = View.VISIBLE
                boxEight.visibility = View.VISIBLE
                boxNine.visibility = View.VISIBLE
                boxTen.visibility = View.VISIBLE
                boxEleven.visibility = View.VISIBLE
                boxTwelve.visibility = View.VISIBLE
                boxThirteen.visibility = View.VISIBLE
                boxFourteen.visibility = View.VISIBLE
                boxFifteen.visibility = View.VISIBLE
                boxSixteen.visibility = View.VISIBLE
                boxSeventeen.visibility = View.VISIBLE
                boxEighteen.visibility = View.VISIBLE
                boxNineteen.visibility = View.VISIBLE
                boxTwenty.visibility = View.VISIBLE
                boxTwentyOne.visibility = View.VISIBLE
                boxTwentyTwo.visibility = View.VISIBLE
                boxTwentyThree.visibility = View.VISIBLE
                boxTwentyFour.visibility = View.VISIBLE
                boxTwentyFive.visibility = View.VISIBLE
                resetBoardButton.visibility = View.VISIBLE
                clicksText.visibility = View.VISIBLE
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
        var winFlag = 0
        numOfClicks++
        var text = "Clicks: " + numOfClicks
        clicksText.text = text
        change(view,i,j,light)

        if(i==0) { //row 1
            if(j==0) { //upper left box
                change(board[i][j+1],i,j+1,light)
            }
            else if(j==4) { //upper right box
                change(board[i][j-1],i,j-1,light)
            }
            else {
                change(board[i][j-1],i,j-1,light)
                change(board[i][j+1],i,j+1,light)
            }
            change(board[i+1][j],i+1,j,light)
        }

        else if(i==4) { //row 5
            if(j==0) { //upper left box
                change(board[i][j+1],i,j+1,light)
            }
            else if(j==4) { //upper right box
                change(board[i][j-1],i,j-1,light)
            }
            else {
                change(board[i][j-1],i,j-1,light)
                change(board[i][j+1],i,j+1,light)
            }
            change(board[i-1][j],i-1,j,light)

        }

        else if(j==0) { //col 1
            change(board[i-1][j],i-1,j,light)
            change(board[i+1][j],i+1,j,light)
            change(board[i][j+1],i,j+1,light)
        }

        else if(j==4) { //col 5
            change(board[i-1][j],i-1,j,light)
            change(board[i+1][j],i+1,j,light)
            change(board[i][j-1],i,j-1,light)
        }

        else {
            change(board[i-1][j],i-1,j,light)
            change(board[i+1][j],i+1,j,light)
            change(board[i][j-1],i,j-1,light)
            change(board[i][j+1],i,j+1,light)
        }

        //checks if the user has already flip all the lights
        for (a in 0..4) {
            for(b in 0..4) {
                if(light[a][b] == 0) {
                    winFlag++
                }
                else {
                    continue
                }
            }
        }

        if(winFlag == 25) {
            var you_won: String = "You won!"
            headerText.setText(you_won)
            boxOne.visibility = View.GONE
            boxTwo.visibility = View.GONE
            boxThree.visibility = View.GONE
            boxFour.visibility = View.GONE
            boxFive.visibility = View.GONE
            boxSix.visibility = View.GONE
            boxSeven.visibility = View.GONE
            boxEight.visibility = View.GONE
            boxNine.visibility = View.GONE
            boxTen.visibility = View.GONE
            boxEleven.visibility = View.GONE
            boxTwelve.visibility = View.GONE
            boxThirteen.visibility = View.GONE
            boxFourteen.visibility = View.GONE
            boxFifteen.visibility = View.GONE
            boxSixteen.visibility = View.GONE
            boxSeventeen.visibility = View.GONE
            boxEighteen.visibility = View.GONE
            boxNineteen.visibility = View.GONE
            boxTwenty.visibility = View.GONE
            boxTwentyOne.visibility = View.GONE
            boxTwentyTwo.visibility = View.GONE
            boxTwentyThree.visibility = View.GONE
            boxTwentyFour.visibility = View.GONE
            boxTwentyFive.visibility = View.GONE
            clicksText.visibility = View.GONE
        }
    }
}
