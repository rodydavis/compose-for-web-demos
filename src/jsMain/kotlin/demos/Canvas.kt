/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package demos.tictactoe

import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import html.Button
import html.Canvas
import html.Text

@Composable
fun CanvasExample() {
    Canvas(400.0, 400.0) { ctx ->
        // Create gradient
        val grd = ctx.createRadialGradient(7.0, 50.0, 5.0, 90.0, 60.0, 100.0)
        grd.addColorStop(0.0, "red")
        grd.addColorStop(1.0, "white")

        // Fill with gradient
        ctx.fillStyle = grd
        ctx.fillRect(10.0, 10.0, 150.0, 80.0)
    }
}