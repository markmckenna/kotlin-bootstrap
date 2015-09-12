package com.lantopia

import com.lantopia.utils.echo

fun showMessage(msg: String): Boolean {
    println(echo(msg))
    return true
}

/** Main method; drives the rest of the application */
fun main(args: Array<String>) {
    showMessage("Hello World")
}
