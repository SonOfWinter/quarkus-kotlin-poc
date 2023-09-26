package fr.openium.rest.json

import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
class Legume(val name: String?, val description: String?)