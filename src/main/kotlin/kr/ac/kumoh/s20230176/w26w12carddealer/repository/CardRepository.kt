package kr.ac.kumoh.s20230176.w26w12carddealer.repository

import kr.ac.kumoh.s20230176.w26w12carddealer.model.Card

interface CardRepository {
    val cards: List<Card>
    fun save(card: Card)
    fun deleteAll()
}