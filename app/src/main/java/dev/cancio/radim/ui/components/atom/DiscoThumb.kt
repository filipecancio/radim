package dev.cancio.radim.ui.components.atom

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import dev.cancio.radim.R
import dev.cancio.radim.ui.theme.RadimColor


@Composable
fun DiscoThumb(
    size: Dp = 53.dp,
    isRunning: Boolean = false,
    @DrawableRes resId: Int
) {
    val infiniteTransition = rememberInfiniteTransition(label = "loading")
    val angle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 719f,
        animationSpec = infiniteRepeatable(
            animation = tween(20000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ), label = "loading"
    )
    Box(
        modifier = Modifier
            .rotate(
                if (isRunning) angle else 0f
            )
    ) {
        Box(
            modifier = Modifier
                .size(size)
                .background(
                    brush = Brush.linearGradient(
                        listOf(
                            RadimColor.Grape01.color,
                            RadimColor.Grape02.color,
                            RadimColor.Grape01.color
                        )
                    ),
                    shape = RoundedCornerShape(size.div(2))
                )
        ) {
            Image(
                painter = painterResource(id = resId),
                contentDescription = null,
                modifier = Modifier
                    .size(size)
                    .clip(
                        shape = RoundedCornerShape(size.div(2))
                    )
            )
            Box(
                modifier = Modifier
                    .size(size)
                    .clip(
                        shape = RoundedCornerShape(size.div(2))
                    )
                    .padding(size.times(0.3F))
                    .background(
                        color = RadimColor.Grape03a5.color,
                        shape = RoundedCornerShape(size.div(2)),
                    )
                    .padding(size.times(0.1F))
                    .background(
                        color = RadimColor.Grape03.color,
                        shape = RoundedCornerShape(size.div(2)),
                    )
            )
        }
    }
}

@Preview
@Composable
fun DiscoThumbPreview() = DiscoThumb(200.dp, true, R.drawable.cafonada)