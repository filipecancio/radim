package dev.cancio.radim.ui.components.atom

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.cancio.radim.ui.theme.Pause
import dev.cancio.radim.ui.theme.Play
import dev.cancio.radim.ui.theme.RadimColor
import dev.cancio.radim.ui.theme.Reload
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

@Preview
@Composable
private fun Preview() {
    val scope = rememberCoroutineScope()
    var playerBtnState by remember { mutableStateOf(PlayerBtnState.Paused) }
    PlayerBtn(playerBtnState){
        scope.launch {
            flow {
                val finalState = if(playerBtnState == PlayerBtnState.Running) PlayerBtnState.Paused else PlayerBtnState.Running
                emit(PlayerBtnState.Loading)
                delay(2000)
                emit(finalState)
            }.collect{
                playerBtnState = it
            }
        }
    }
}

@Composable
fun PlayerBtn(
    state: PlayerBtnState,
    size: Dp = 43.dp,
    testTag: String = "playerBtn",
    onClick: () -> Unit = {},
) = Box(
    modifier = Modifier
        .background(
            color = state.bgColor.color,
            shape = RoundedCornerShape(50.dp)
        )
        .size(size = size)
        .clickable { onClick() }
        .testTag(testTag),
    contentAlignment = Alignment.Center
) {
    val infiniteTransition = rememberInfiniteTransition(label = "loading")
    val angle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ), label = "loading"
    )

    Icon(
        imageVector = state.icon,
        tint = state.tintColor.color,
        contentDescription = state.name,
        modifier = Modifier
            .size(size.times(state.ratio))
            .rotate(
                if (state == PlayerBtnState.Loading) angle else 0f
            )
    )
}

enum class PlayerBtnState(
    val bgColor: RadimColor,
    val tintColor: RadimColor,
    val icon: ImageVector,
    val ratio: Float = 0.36F,
) {
    Running(
        RadimColor.Weed01,
        RadimColor.Grape01,
        Pause
    ),
    Loading(
        RadimColor.Orange01,
        RadimColor.Grape01,
        Reload,
        0.45F
    ),
    Paused(
        RadimColor.Carbon03,
        RadimColor.Grape04,
        Play
    )
}