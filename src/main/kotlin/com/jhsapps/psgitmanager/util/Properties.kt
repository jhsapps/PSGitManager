package com.jhsapps.psgitmanager.util

import java.io.FileInputStream
import java.lang.Exception
import java.util.Properties

object Properties {

    private var properties: Properties? = null

    fun load(): Unit {
        try {
            properties = Properties()
            properties?.load(FileInputStream("config.properties"))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun get(key: String): String {
        load()
        return properties?.getProperty(key).toString()
    }
}