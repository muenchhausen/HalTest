import grails.rest.render.hal.HalJsonCollectionRenderer
import grails.rest.render.hal.HalJsonRenderer

// Place your Spring DSL code here
beans = {
    halPCollectionRenderer(HalJsonCollectionRenderer, haltest.Product)
    halCCollectionRenderer(HalJsonCollectionRenderer, haltest.Category)

    halPRenderer(HalJsonRenderer, haltest.Product)
    halCRenderer(HalJsonRenderer, haltest.Category)

}
