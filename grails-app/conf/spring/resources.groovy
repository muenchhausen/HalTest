import grails.rest.render.hal.HalJsonCollectionRenderer
import grails.rest.render.hal.HalJsonRenderer
import haltest.Pet
import haltest.Behaviour
import haltest.TaxonSpecies

// Place your Spring DSL code here
beans = {
    halPCollectionRenderer(HalJsonCollectionRenderer, Pet)
    halBCollectionRenderer(HalJsonCollectionRenderer, Behaviour)
    halTCollectionRenderer(HalJsonCollectionRenderer, TaxonSpecies)

    halPRenderer(HalJsonRenderer, Pet)
    halBRenderer(HalJsonRenderer, Behaviour)
    halTRenderer(HalJsonRenderer, TaxonSpecies)
}
