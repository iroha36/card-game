package game.card.card_list.follower

import game.card.{Cost, FollowerCard}

case class Goblin() extends FollowerCard {
  val cost: Cost = Cost(1)
}