package com.jhsapps.psgitmanager

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

fun main(args: Array<String>) {
    val options = ChromeOptions()
    options.setHeadless(true)

    val driver = ChromeDriver(options)

    driver.close()
}