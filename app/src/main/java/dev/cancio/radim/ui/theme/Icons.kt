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
        defaultWidth = 408.0.dp,
        defaultHeight = 379.0.dp,
        viewportWidth = 408.0F,
        viewportHeight = 379.0F,
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
        moveTo(299.5F, 15.78F)
        curveTo(291.48F, 1.1F, 273.08F, -4.31F, 258.4F, 3.71F)
        curveTo(246.72F, 10.09F, 240.91F, 23.03F, 243.06F, 35.44F)
        curveTo(227.21F, 31.3F, 210.73F, 29.6F, 194.16F, 30.49F)
        curveTo(160.14F, 32.33F, 127.59F, 45.02F, 101.31F, 66.7F)
        curveTo(75.02F, 88.38F, 56.37F, 117.92F, 48.1F, 150.98F)
        curveTo(39.82F, 184.03F, 42.36F, 218.87F, 55.33F, 250.38F)
        curveTo(68.3F, 281.89F, 91.03F, 308.41F, 120.18F, 326.06F)
        curveTo(149.33F, 343.71F, 183.37F, 351.55F, 217.3F, 348.44F)
        curveTo(251.24F, 345.33F, 283.28F, 331.43F, 308.73F, 308.77F)
        curveTo(325.83F, 293.56F, 339.34F, 274.94F, 348.51F, 254.26F)
        curveTo(355.97F, 237.41F, 344.12F, 219.48F, 326.09F, 215.68F)
        curveTo(308.05F, 211.88F, 290.79F, 223.99F, 280.88F, 239.52F)
        curveTo(276.32F, 246.67F, 270.77F, 253.21F, 264.36F, 258.91F)
        curveTo(249.56F, 272.08F, 230.93F, 280.17F, 211.21F, 281.97F)
        curveTo(191.48F, 283.78F, 171.7F, 279.22F, 154.75F, 268.96F)
        curveTo(137.8F, 258.7F, 124.59F, 243.29F, 117.05F, 224.97F)
        curveTo(109.51F, 206.65F, 108.03F, 186.4F, 112.84F, 167.18F)
        curveTo(117.65F, 147.96F, 128.49F, 130.8F, 143.78F, 118.19F)
        curveTo(159.06F, 105.59F, 177.98F, 98.21F, 197.76F, 97.14F)
        curveTo(206.33F, 96.68F, 214.87F, 97.42F, 223.14F, 99.28F)
        curveTo(223.47F, 99.36F, 223.8F, 99.43F, 224.13F, 99.5F)
        curveTo(215.77F, 108.79F, 213.74F, 122.69F, 220.07F, 134.28F)
        curveTo(228.09F, 148.96F, 246.49F, 154.36F, 261.17F, 146.34F)
        lineTo(319.04F, 114.74F)
        curveTo(333.72F, 106.72F, 339.12F, 88.32F, 331.1F, 73.64F)
        lineTo(299.5F, 15.78F)
        close()
    }.build()