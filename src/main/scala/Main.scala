import game.card.card_list.follower.Goblin
import game.card.card_list.spell.AngelicSnipe
import game.card.{Card, FollowerCard, SpellCard}

object Main extends App:
  def f(c: Card) =
    c match
      case f: FollowerCard =>
        println(s"followerCard: ${f}")
      case s: SpellCard =>
        println(s"followerCard: ${s}")

  val goblin = Goblin()
  val angelicSnipe = AngelicSnipe()


  println(s"goblin: ${goblin.cost}")
  println(s"angelicSnipe: ${angelicSnipe.cost}")
  f(goblin)
  f(angelicSnipe)

