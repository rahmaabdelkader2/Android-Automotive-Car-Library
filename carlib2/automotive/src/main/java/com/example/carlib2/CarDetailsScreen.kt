package com.example.carlib2

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.Pane
import androidx.car.app.model.PaneTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template

class CarDetailsScreen(
    context: CarContext,
    private val carItem: CarItem
) : Screen(context) {

    override fun onGetTemplate(): Template {

        val pane = Pane.Builder()
            .addRow(
                Row.Builder()
                    .setTitle("Type")
                    .addText(carItem.type)
                    .build()
            )
            .addRow(
                Row.Builder()
                    .setTitle("Details")
                    .addText(carItem.details)
                    .build()
            )
            .build()

        return PaneTemplate.Builder(pane)
            .setTitle(carItem.name)
            .setHeaderAction(Action.BACK)
            .build()
    }
}