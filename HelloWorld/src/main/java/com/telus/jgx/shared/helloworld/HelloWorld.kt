package com.telus.jgx.shared.helloworld

interface HelloWorld {
    fun getHelloWorld(): String
}

class HelloWorldImpl : HelloWorld {
    override fun getHelloWorld(): String {
        return "Hello World!"
    }
}