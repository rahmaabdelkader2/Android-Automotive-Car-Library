package com.example.carlib2

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.ItemList
import androidx.car.app.model.ListTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template

class DemoCarScreen(context: CarContext) : Screen(context) {
    private val items = listOf(
        CarItem("Tesla Model S", "Electric Sedan", "Speed: 200 mph"),
        CarItem("Ford Mustang", "Sports Car", "V8 Engine"),
        CarItem("Toyota Prius", "Hybrid", "58 MPG"),
        CarItem("Jeep Wrangler", "SUV", "4WD Off-road"),
        CarItem("Volkswagen Golf", "Hatchback", "Compact and efficient")
    )

    override fun onGetTemplate(): Template {
        val itemList = ItemList.Builder()
        items.forEach { item ->
            itemList.addItem(
                Row.Builder()
                    .setTitle(item.name)
                    .addText(item.type)
                    .setOnClickListener {
                        screenManager.push(
                            CarDetailsScreen(carContext, item)
                        )
                    }
                    .build()
            )
        }

        return ListTemplate.Builder()
            .setSingleList(itemList.build())
            .setTitle("Car Models")
            .setHeaderAction(Action.BACK)
            .build()
    }
}

data class CarItem(
    val name: String,
    val type: String,
    val details: String
)