import haltest.HalJsonCollectionRenderer
import haltest.HalJsonRenderer

// Place your Spring DSL code here
beans = {
    halPCollectionRenderer(HalJsonCollectionRenderer, haltest.Product)
    halCCollectionRenderer(HalJsonCollectionRenderer, haltest.Category)

    halPRenderer(HalJsonRenderer, haltest.Product)
    halCRenderer(HalJsonRenderer, haltest.Category)

}
