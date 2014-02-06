import haltest.Product
import haltest.Category

class BootStrap {

    def init = { servletContext ->
        new Product(name: "MacBook", numberInStock: 10, category:  new Category(name: 'Laptops')).save(flush: true, validate: false)
        new Product(name: "iMac", numberInStock: 42, category:  new Category(name: 'Desktops')).save(flush: true, validate: false)
        new Product(name: "MacBook", numberInStock: 10, category:  new Category(name: 'Laptops')).save(flush: true, validate: false)
    }
    def destroy = {
    }
}
