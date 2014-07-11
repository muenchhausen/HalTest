/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package haltest

import restapidoc.DocumentedRestfulController
import restapidoc.annotations.ApiDescription

import javax.annotation.PostConstruct

import org.grails.datastore.mapping.model.MappingContext
import org.grails.datastore.mapping.keyvalue.mapping.config.KeyValueMappingContext

/*
 * This controller is a simple CRUD controller for the domain Pet - design was started there. This sample
 * demonstrates, that the base documentation can be reused from DocumentedRestfulController for a first start.
 *
 * @author Derk Muenchhausen
 */
@ApiDescription(description="Unrealistic shop for endangered animals")
class PetController extends DocumentedRestfulController  {
    def halPCollectionRenderer
    def halPRenderer

    static responseFormats = ['hal','json']

    PetController() {
        super(Pet)
    }

    /* todo: not working: No signature of method: haltest.Pet.link() is applicable for argument types: (java.util.LinkedHashMap)
    @Override
    def show(Pet pet) {
        pet.link rel:'captiveBehaviour', href: g.link(resource:"captiveBehaviour", params:[id: pet.id])
        respond pet
    }
    */


    /*
     * todo:
     * the following lines of code are required to embed type correctly in hal rendering.
     * This is a workaround, see GRAILS-10954
     */
    /* this workaround was working with Grails 2.3.7:
    @PostConstruct
    void init() {
        halPCollectionRenderer.mappingContext = mappingContext
        halPRenderer.mappingContext = mappingContext
    }
    MappingContext getMappingContext() {
        final context = new KeyValueMappingContext("")
        context.addPersistentEntity(Pet)
        context.addPersistentEntity(Behaviour)
        return context
    }
    */
    /*
     * end workaround for GRAILS-10954
     */
}
