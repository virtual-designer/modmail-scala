package org.onesoftnet.mailbot.core

import io.github.cdimascio.dotenv.Dotenv

object Env {
    private val dotenv = Dotenv.configure().load()
    
    def get(name: String) = dotenv.get(name)
}
