package com.lucassartori.prova_01_parte.model

import java.io.Serializable

data class Product(
        var name: String = "",
        var description: String = "",
        var unity: String = "",
        var perishable: Boolean = false,
        var canPromotion: Boolean = false,
        var limitStock: Int = 0,
        var canRefrigerateLocale: Boolean = false
) : Serializable