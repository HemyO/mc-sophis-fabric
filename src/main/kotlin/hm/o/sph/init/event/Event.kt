package hm.o.sph.init.event

data class Event(val id: String, private val fn: (Any) -> Unit) {
    operator fun invoke(data: Any) {
        fn(data)
    }
}