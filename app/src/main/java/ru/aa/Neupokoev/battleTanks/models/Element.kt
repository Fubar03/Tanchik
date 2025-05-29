package ru.aa.Neupokoev.battleTanks.models

import android.view.View
import ru.aa.Neupokoev.battleTanks.enums.Material

data class Element(
    val viewId: Int = View.generateViewId(),
    val material: Material,
    val coordinate: Coordinate,
    val width: Int,
    val height: Int
)
