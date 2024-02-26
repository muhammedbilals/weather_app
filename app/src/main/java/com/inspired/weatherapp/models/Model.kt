package com.inspired.weatherapp

data class Hobby (var title:String)

object  Supplier {
    val hobbies = listOf<Hobby>(Hobby("Swimming"),Hobby("reading"))
}