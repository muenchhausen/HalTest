import haltest.Behaviour
import haltest.Pet
import haltest.Behaviour
import haltest.TaxonSpecies

class BootStrap {
    def apiDocumentationService

    def init = { servletContext ->
        // not required - the correct location for it is in file RestapidocGrailsPlugin.groovy: doWithApplicationContext
        // apiDocumentationService.init()

        def taxon = new TaxonSpecies(name:'Picus viridis', kingdom: ' Animalia', tclass: 'Aves', order: 'Piciformes', family: 'Picidae', genus: 'Picus').save(flush: true)

        new Pet(name: "European Green Woodpecker",
                numberInStock: 10,
                taxonomy: taxon,
                captiveBehaviour: new Behaviour(foodAndFeeding: 'The main food of the European Green Woodpecker is ants of the genera Lasius and Formica for which it spends much of its time foraging on the ground, though insects and small reptiles are also taken occasionally.',
                        reproduction: 'The nesting hole is larger but similar to those of the other woodpeckers. It may be a few feet above the ground or at the top of a tall tree;',
                        source: 'http://en.wikipedia.org/wiki/European_Green_Woodpecker'),
                naturalBehaviour: new Behaviour(foodAndFeeding: 'prefers living insects', source: 'untrusted'),
        ).save(flush: true, validate: false)
    }
    def destroy = {
    }
}
