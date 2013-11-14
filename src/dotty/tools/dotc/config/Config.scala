package dotty.tools.dotc.config

object Config {

  final val cacheMemberNames = true
  final val cacheAsSeenFrom = true

  /** When set, use new signature-based matching.
   *  Advantantage of doing so: It's supposed to be faster
   *  Disadvantage: It might hide inconsistencies, so while debugging it's better to turn it off
   */
  final val newMatch = false
}