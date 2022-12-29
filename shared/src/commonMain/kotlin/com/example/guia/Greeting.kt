package com.example.guia

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}