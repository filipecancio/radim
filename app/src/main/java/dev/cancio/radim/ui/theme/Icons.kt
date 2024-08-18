package dev.cancio.radim.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


val Pause: ImageVector
    get() = ImageVector.Builder(
        name = "Pause",
        defaultWidth = 12.0.dp,
        defaultHeight = 15.0.dp,
        viewportWidth = 12.0F,
        viewportHeight = 15.0F,
    ).path(
        fill = SolidColor(Color(0xFFD9D9D9)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(2.0F, 0.0F)
        lineTo(2.0F, 0.0F)
        arcTo(2.0F, 2.0F, 0.0F, false, true, 4.0F, 2.0F)
        lineTo(4.0F, 13.0F)
        arcTo(2.0F, 2.0F, 0.0F, false, true, 2.0F, 15.0F)
        lineTo(2.0F, 15.0F)
        arcTo(2.0F, 2.0F, 0.0F, false, true, 0.0F, 13.0F)
        lineTo(0.0F, 2.0F)
        arcTo(2.0F, 2.0F, 0.0F, false, true, 2.0F, 0.0F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFD9D9D9)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(10.0F, 0.0F)
        lineTo(10.0F, 0.0F)
        arcTo(2.0F, 2.0F, 0.0F, false, true, 12.0F, 2.0F)
        lineTo(12.0F, 13.0F)
        arcTo(2.0F, 2.0F, 0.0F, false, true, 10.0F, 15.0F)
        lineTo(10.0F, 15.0F)
        arcTo(2.0F, 2.0F, 0.0F, false, true, 8.0F, 13.0F)
        lineTo(8.0F, 2.0F)
        arcTo(2.0F, 2.0F, 0.0F, false, true, 10.0F, 0.0F)
        close()
    }.build()

val Play: ImageVector
    get() = ImageVector.Builder(
            name = "Play",
            defaultWidth = 12.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 12.0F,
            viewportHeight = 14.0F,
        ).path(
            fill = SolidColor(Color(0xFF311845)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(11.182F, 5.514F)
            curveTo(12.273F, 6.175F, 12.273F, 7.825F, 11.182F, 8.486F)
            lineTo(2.455F, 13.768F)
            curveTo(1.364F, 14.428F, -0.0F, 13.603F, 0.0F, 12.282F)
            lineTo(0.0F, 1.718F)
            curveTo(0.0F, 0.397F, 1.364F, -0.428F, 2.455F, 0.232F)
            lineTo(11.182F, 5.514F)
            close()
        }.build()


val Reload: ImageVector
    get() = ImageVector.Builder(
        name = "Reload",
        defaultWidth = 112.0.dp,
        defaultHeight = 112.0.dp,
        viewportWidth = 112.0F,
        viewportHeight = 112.0F,
    ).path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(87.25F, 5.19F)
        curveTo(86.25F, 1.46F, 82.41F, -0.76F, 78.68F, 0.24F)
        curveTo(74.94F, 1.24F, 72.73F, 5.08F, 73.73F, 8.81F)
        lineTo(73.86F, 9.3F)
        curveTo(67.75F, 6.97F, 61.22F, 5.84F, 54.6F, 6.02F)
        curveTo(43.84F, 6.32F, 33.46F, 10.09F, 25.0F, 16.77F)
        curveTo(16.55F, 23.45F, 10.48F, 32.68F, 7.7F, 43.08F)
        curveTo(4.91F, 53.49F, 5.57F, 64.51F, 9.56F, 74.52F)
        curveTo(13.54F, 84.52F, 20.66F, 92.97F, 29.84F, 98.61F)
        curveTo(39.02F, 104.25F, 49.77F, 106.77F, 60.5F, 105.8F)
        curveTo(71.23F, 104.83F, 81.35F, 100.42F, 89.37F, 93.23F)
        curveTo(95.87F, 87.41F, 100.7F, 80.02F, 103.43F, 71.81F)
        curveTo(104.5F, 68.6F, 102.32F, 65.35F, 99.01F, 64.68F)
        curveTo(95.69F, 64.01F, 92.51F, 66.19F, 91.31F, 69.35F)
        curveTo(89.18F, 74.98F, 85.72F, 80.05F, 81.2F, 84.11F)
        curveTo(75.14F, 89.54F, 67.5F, 92.87F, 59.4F, 93.6F)
        curveTo(51.3F, 94.33F, 43.18F, 92.43F, 36.25F, 88.17F)
        curveTo(29.32F, 83.91F, 23.95F, 77.54F, 20.94F, 69.98F)
        curveTo(17.92F, 62.43F, 17.43F, 54.1F, 19.53F, 46.25F)
        curveTo(21.64F, 38.39F, 26.22F, 31.42F, 32.6F, 26.38F)
        curveTo(38.98F, 21.34F, 46.82F, 18.49F, 54.95F, 18.27F)
        curveTo(58.68F, 18.16F, 62.38F, 18.61F, 65.94F, 19.59F)
        curveTo(63.55F, 21.21F, 62.33F, 24.23F, 63.12F, 27.18F)
        curveTo(64.12F, 30.92F, 67.96F, 33.13F, 71.69F, 32.13F)
        lineTo(86.18F, 28.25F)
        curveTo(89.92F, 27.25F, 92.13F, 23.41F, 91.13F, 19.68F)
        lineTo(87.25F, 5.19F)
        close()
    }.build()