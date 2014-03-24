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

import grails.transaction.Transactional
import restapidoc.DocumentedRestfulController
import restapidoc.annotations.ApiDescription
import restapidoc.annotations.ApiOperation
import restapidoc.annotations.ApiParam
import restapidoc.annotations.ApiResponse
import restapidoc.annotations.ApiResponses
import restapidoc.annotations.DeleteMethod
import restapidoc.annotations.GetMethod
import restapidoc.annotations.PostMethod
import restapidoc.annotations.PutMethod

/*
 * This controller is a simple CRUD controller for the domain TaxonSpecies - design was started there. This sample
 * demonstrates, that the base documentation of DocumentedRestfulController can be simply overwritten which is required
 * if the key column is not a simple id but a Name.
 *
 * @author Derk Muenchhausen
 */
@ApiDescription(description="The composition of ranks is determined by a taxonomist. The standards for the classification are not strictly codified.")
class TaxonSpeciesController extends DocumentedRestfulController  {
    static responseFormats = ['hal','json']

    TaxonSpeciesController() {
        super(TaxonSpecies)
    }

    @Override
    @GetMethod
    @ApiOperation(value = "Retrieve #{domainClass.name}", notes = "returns a species")
    @ApiResponses(value = [ @ApiResponse(code = 404, message = "#{domainClass.name} not found") ])
    def show(@ApiParam(name = "name", value = "species name", allowableValues = "String", required = true) String name) {
        super.show()
    }

    @Override
    @Transactional
    @DeleteMethod
    @ApiOperation(value = "Delete #{domainClass.name}", notes = "deletes a species")
    @ApiResponses(value = [ @ApiResponse(code = 404, message = "#{domainClass.name} not found") ])
    def delete(@ApiParam(name = "name", value = "species to be deleted", allowableValues = "String", required = true) String name) {
        super.delete()
    }

    @Override
    @Transactional
    @PutMethod
    @ApiResponses(value = [ @ApiResponse(code = 404, message = "#{domainClass.name} not found") ])
    @ApiOperation(value = "Update #{domainClass.name}", notes = "changes a species", sample = '''{
        "family": "",
        "genus": "",
        "kingdom": "",
        "name": "",
        "order": "",
        "tclass": ""
}''')
    def update(@ApiParam(name = "name", value = "species to be updated", allowableValues = "String", required = true) String name) {
        super.update()
    }

    @Override
    @Transactional
    @PostMethod
    @ApiOperation(value = "Update #{domainClass.name}", notes = "creates a species", sample = '''{
        "family": "",
        "genus": "",
        "kingdom": "",
        "name": "",
        "order": "",
        "tclass": ""
}''')
    def save() {
        super.save()
    }

    @Override
    protected TaxonSpecies queryForResource(Serializable id) {
        resource.findByName(id)
    }
}
