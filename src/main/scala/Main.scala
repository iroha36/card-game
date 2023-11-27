import game.card.card_list.follower.Goblin
import game.card.card_list.spell.AngelicSnipe
import game.card.{Card, Deck, FollowerCard, SpellCard}

object Main extends App:
  val deck = Deck.initDeck()
  println(s"deck: $deck")