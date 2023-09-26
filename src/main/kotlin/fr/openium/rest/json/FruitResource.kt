package fr.openium.rest.json

import jakarta.ws.rs.*
import java.util.*


@Path("/fruits")
class FruitResource {
    private val fruits = Collections.newSetFromMap(Collections.synchronizedMap(LinkedHashMap<Fruit, Boolean>()))

    init {
        this.fruits.add(Fruit("Apple", "Winter fruit"))
        this.fruits.add(Fruit("Pineapple", "Tropical fruit"))
    }

    @GET
    fun list(): Set<Fruit> {
        return fruits
    }

    @POST
    fun add(fruit: Fruit?): Set<Fruit> {
        fruits.add(fruit)
        return fruits
    }

    @DELETE
    fun delete(fruit: Fruit): Set<Fruit> {
        fruits.removeIf { existingFruit: Fruit -> existingFruit.name.contentEquals(fruit.name) }
        return fruits
    }
}
