package com.example.tomjerry.screens.jerry_store.components.tom_item

import com.example.tomjerry.R

data class TomItem(
    val image: Int,
    val title: String,
    val  description: String,
    val oldValue: Int? = null,
    val newValue: Int
)

val toms : List<TomItem> = listOf(
    TomItem(
        image = R.drawable.sport_tom,
        title = "Sport Tom",
        description = "He runs 1 meter... trips over his boot.",
        oldValue = 5 ,
        newValue = 3
    ),
    TomItem(
        image = R.drawable.tom_the_lover,
        title = "Tom the lover",
        description = "He loves one-sidedly... and is beaten by the other side.",
        newValue = 5
    ),
    TomItem(
        image = R.drawable.tom_the_bomb,
        title = "Tom the bomb",
        description = "He blows himself up before Jerry can catch him.",
        newValue = 10
    ),
    TomItem(
        image = R.drawable.spy_tom,
        title = "Spy Tom",
        description = "Disguises itself as a table.",
        newValue = 12
    ),
    TomItem(
        image = R.drawable.frozen_tom,
        title = "Frozen Tom",
        description = "He was chasing Jerry, he froze after the first look",
        newValue = 10
    ),
    TomItem(
        image = R.drawable.sleeping_tom,
        title = "Sleeping Tom",
        description = "He doesn't chase anyone, he just snores in stereo.",
        newValue = 10
    )

)