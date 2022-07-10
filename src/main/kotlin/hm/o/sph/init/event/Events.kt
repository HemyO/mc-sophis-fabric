package hm.o.sph.init.event

object Events {

    private infix fun register(event: Array<Event>) { event.forEach { Bus += it } }
    private infix fun cancel(event: Array<Event>) { event.forEach { Bus -= it } }
    private infix fun play(eventAndData: Array<Pair<Event, Any>>) { eventAndData.forEach { Bus(it.first, it.second) }}
}