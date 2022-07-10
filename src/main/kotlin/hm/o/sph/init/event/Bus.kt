package hm.o.sph.init.event

class Bus {
    companion object {
        private val eventList = mutableMapOf<String, MutableMap<String, (Any) -> Unit>>()
        private val registered: MutableSet<String> by lazy { eventList.keys }
        private val listening: MutableSet<String> by lazy { eventList.values.map { it.keys }.flatten().toMutableSet() }

        infix fun listen(direction: Triple<Event, String, (Any) -> Unit>) {
            val (event, fnName, fn) = direction
            if (event.id in eventList) eventList[event.id]?.put(fnName, fn)
        }

        infix fun ignore(direction: Pair<Event, String>) {
            val (event, fnName) = direction
            if (event.id in eventList) eventList[event.id]?.remove(fnName)
        }

        infix fun register(event: Event) {
            eventList += Pair(event.id, mutableMapOf())
        }

        infix fun cancel(event: Event) {
            eventList -= event.id
        }

        infix fun response(directionOfInjection: Pair<Event, Any>) {
            val (event, injection) = directionOfInjection
            if (event.id in eventList) eventList[event.id]?.values?.forEach {
                it(injection)
            }
        }

        override fun toString(): String {
            return "Bus registered: $registered \nBus listening: $listening"
        }

        operator fun plusAssign(event: Event) {
            register(event)
        }

        operator fun plusAssign(fn: Triple<Event, String, (Any) -> Unit>) {
            listen(fn)
        }

        operator fun minusAssign(event: Event) {
            cancel(event)
        }

        operator fun minusAssign(fnKey: Pair<Event, String>) {
            ignore(fnKey)
        }

        operator fun invoke(event: Event, data: Any) {
            response(Pair(event, data))
        }
    }
}