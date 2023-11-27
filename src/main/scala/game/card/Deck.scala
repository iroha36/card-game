package game.card

import game.card.card_list.follower.Goblin
import game.card.card_list.spell.AngelicSnipe

import scala.util.Random

case class Deck(cards: List[Card]):
  def shuffle(): Deck = Deck(Random.shuffle(cards))
object Deck:
  def initDeck(): Deck =
    Deck(List.fill(15)(Goblin()) ++ List.fill(15)(AngelicSnipe())).shuffle()


