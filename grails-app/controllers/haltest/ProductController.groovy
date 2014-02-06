package haltest

import grails.rest.RestfulController

import javax.annotation.PostConstruct

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import org.springframework.context.support.StaticMessageSource
import org.grails.datastore.mapping.model.MappingContext
import org.grails.datastore.mapping.keyvalue.mapping.config.KeyValueMappingContext
import org.codehaus.groovy.grails.web.mapping.DefaultLinkGenerator
import org.codehaus.groovy.grails.web.mapping.LinkGenerator
import org.codehaus.groovy.grails.web.mapping.UrlMapping
import org.codehaus.groovy.grails.web.mapping.UrlMappingsHolder
import org.springframework.mock.web.MockServletContext
import org.codehaus.groovy.grails.web.mapping.DefaultUrlMappingEvaluator
import org.codehaus.groovy.grails.web.mapping.DefaultUrlMappingsHolder
import grails.web.CamelCaseUrlConverter

@Transactional(readOnly = true)
class ProductController extends RestfulController  {
    def halPCollectionRenderer
    def halPRenderer

    static responseFormats = ['hal','json']

    ProductController() {
        super(Product)

    }

    @PostConstruct
    void init() {
        halPCollectionRenderer.mappingContext = mappingContext
        halPRenderer.mappingContext = mappingContext
    }

    MappingContext getMappingContext() {
        final context = new KeyValueMappingContext("")
        context.addPersistentEntity(Product)
        context.addPersistentEntity(Category)
        return context
    }
}
