package haltest

import grails.rest.RestfulController

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProductController extends RestfulController  {

    static responseFormats = ['hal','json']

    ProductController() {
        super(Product)
    }
}
