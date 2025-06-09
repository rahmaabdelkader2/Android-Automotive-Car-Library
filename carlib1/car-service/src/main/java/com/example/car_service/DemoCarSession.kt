package com.example.car_service

import android.content.Intent
import android.util.Log
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class DemoCarSession : Session() , DefaultLifecycleObserver {

    init {
        lifecycle.addObserver(this)
    }
    private val TAG = "DemoCarSession"

    override fun onCreateScreen(intent: Intent): Screen {
        Log.i(TAG, "onCreateScreen: ")
        val carContext = carContext
    return DemoCarScreen(carContext)
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.i(TAG, "onStart: ")
        super.onStart(owner)
    }
    override fun onResume(owner: LifecycleOwner) {
        Log.i(TAG, "onResume: ")
        super.onResume(owner)
    }
    override fun onPause(owner: LifecycleOwner) {
        Log.i(TAG, "onPause: ")
        super.onPause(owner)
    }
    override fun onStop(owner: LifecycleOwner) {
        Log.i(TAG, "onStop: ")
        super.onStop(owner)
    }
    override fun onDestroy(owner: LifecycleOwner) {
        Log.i(TAG, "onDestroy: ")
        super.onDestroy(owner)
    }





}