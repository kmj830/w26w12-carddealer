package kr.ac.kumoh.s20230176.w26w12carddealer.model

class Card(
    val rank: String,
    val suit: String,
) {
    val imageName: String
        get() = when (rank) {
            "jack", "queen", "king" -> "${rank}_of_${suit}2.png"
            else -> "${rank}_of_${suit}.png"
        }
}