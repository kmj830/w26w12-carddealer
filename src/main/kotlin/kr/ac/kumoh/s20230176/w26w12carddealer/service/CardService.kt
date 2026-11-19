package kr.ac.kumoh.s20230176.w26w12carddealer.service

import kr.ac.kumoh.s20230176.w26w12carddealer.model.Card
import kr.ac.kumoh.s20230176.w26w12carddealer.repository.CardRepository
import org.springframework.stereotype.Service

@Service
class CardService(
    private val repository: CardRepository
) {
    fun getCards(): List<Card> = repository.cards
    fun dealCards(count: Int = 5){
        val suits = arrayOf("spades", "diamonds", "hearts", "clubs")
        val ranks = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace")
        repository.deleteAll()
        val cards = (0 until 52)
            .shuffled()
            .take(count)
            .sorted()

        cards.forEach { number ->
            val suit = suits[number / ranks.size]
            val rank = ranks[number % ranks.size]

            repository.save(Card(rank, suit))

        }
    }
}