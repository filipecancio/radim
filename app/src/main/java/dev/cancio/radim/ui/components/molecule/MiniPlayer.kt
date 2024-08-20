package dev.cancio.radim.ui.components.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.cancio.radim.R
import dev.cancio.radim.ui.components.atom.DiscoThumb
import dev.cancio.radim.ui.components.atom.PlayerBtn
import dev.cancio.radim.ui.components.atom.PlayerBtnState
import dev.cancio.radim.ui.theme.RadimColor
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

@Composable
fun MiniPlayer(
    state:PlayerBtnState,
    title: String = "",
    description: String = "",
    onClick: () -> Unit = {},
) = Row(
    modifier = Modifier
        .width(300.dp)
        .background(
            color = RadimColor.Grape03a5.color,
            shape = RoundedCornerShape(50.dp)
        )
        .padding(start = 4.dp, top = 4.dp, end = 8.dp, bottom = 4.dp),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically
) {
    DiscoThumb(resId = R.drawable.cafonada, isRunning = if(state == PlayerBtnState.Running) true else false)
    Column(
        modifier = Modifier
            .weight(1f)
            .padding(horizontal = 8.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = RadimColor.Carbon01.color,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(description,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = RadimColor.Carbon01a5.color
        )
    }
    PlayerBtn(state = state){onClick()}
}

@Preview
@Composable
fun MiniPlayerPreview() {
    val scope = rememberCoroutineScope()
    var playerBtnState by remember { mutableStateOf(PlayerBtnState.Paused) }

    MiniPlayer(
        title = "T05E30 - Dos gregos pra cá?",
        description = "CAFONADA",
        state = playerBtnState
    ){
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