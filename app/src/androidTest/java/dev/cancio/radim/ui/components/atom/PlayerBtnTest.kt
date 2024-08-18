package dev.cancio.radim.ui.components.atom

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertContentDescriptionContains
import androidx.compose.ui.test.assertContentDescriptionEquals
import androidx.compose.ui.test.captureToImage
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onChild
import androidx.compose.ui.test.onChildAt
import androidx.compose.ui.test.onChildren
import androidx.compose.ui.test.onFirst
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import org.junit.Rule
import org.junit.Test

class PlayerBtnTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun testPlayerChangingStates() {
        composeRule.setContent {
            val scope = rememberCoroutineScope()
            var playerBtnState by remember { mutableStateOf(PlayerBtnState.Paused) }
            PlayerBtn(
                state = playerBtnState,
                testTag = "test01"
            ){
                scope.launch {
                    updateState(playerBtnState).collect{
                        playerBtnState = it
                    }
                }
            }
        }
        composeRule.onNodeWithTag("test01").performClick()
        composeRule.onNodeWithTag("test01").onChildren().onFirst().assertContentDescriptionEquals(PlayerBtnState.Loading.name)
    }

    private suspend fun updateState(startState: PlayerBtnState) = flow {
        val finalState = if(startState == PlayerBtnState.Running) PlayerBtnState.Paused else PlayerBtnState.Running
        emit(PlayerBtnState.Loading)
        delay(2000)
        emit(finalState)
    }
}