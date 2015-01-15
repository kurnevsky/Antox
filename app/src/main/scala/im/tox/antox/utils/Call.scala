package im.tox.antox.utils

import rx.lang.scala.Subscription

object Call {
  private val TAG = "im.tox.antox.utils.Call"
}

class Call(val id: Integer, 
  val audioBitRate: Int,
  val videoBitRate: Int,
  val subscription: Subscription) {
    val playAudio = new PlayAudio()
  }
