package kr.ac.kumoh.s20230176.w26w12carddealer.repository

import kr.ac.kumoh.s20230176.w26w12carddealer.model.Card
import org.springframework.stereotype.Repository

@Repository
class InMemoryCardRepository : CardRepository {

    private val _cards: MutableList<Card> = mutableListOf()

    override val cards: List<Card>
        get() = _cards.toList()

    override fun save(card: Card) {
        if (!_cards.contains(card)) {
            _cards.add(card)
        }
    }

    override fun deleteAll() {
        _cards.clear()
    }

}