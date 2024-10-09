package com.example.myapplication

import ...

class MainActivity : AppCompactActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setConstantView(R.layout.activity_main)
    }
}