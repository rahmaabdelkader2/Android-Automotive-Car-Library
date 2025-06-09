package com.example.car_service

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class DemoCarScreen(context: CarContext) : Screen(context) {
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("Hello from Car Service!")
            .setTitle("Demo Car Screen")
            .build()
    }
}