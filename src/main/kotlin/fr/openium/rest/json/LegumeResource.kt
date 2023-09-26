package fr.openium.rest.json

import jakarta.ws.rs.*
import jakarta.ws.rs.core.Response
import java.util.*


@Path("/legumes")
class LegumeResource {
    private val legumes = Collections.newSetFromMap(Collections.synchronizedMap(LinkedHashMap<Legume, Boolean>()))

    init {
        legumes.add(Legume("Carrot", "Root vegetable, usually orange"))
        legumes.add(Legume("Zucchini", "Summer squash"))
    }

    @GET
    fun list(): Response {
        return Response.ok(legumes).build()
    }
}
