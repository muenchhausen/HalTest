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
import restapidoc.annotations.ApiDescription
import restapidoc.annotations.ApiProperty

/*
 * This domain sample was chosen, because a Pet shop has many possibilities for extension and
 * nice similar samples exists, so comparing discussions are simple.
 *
 * @author Derk Muenchhausen
 */
@ApiDescription(description = "Endangered Animals")
class Pet {
    static embedded = ['naturalBehaviour','captiveBehaviour']

    static mapping = {
        version false
    }

    @ApiProperty(description = "Binomial name")
    String name

    @ApiProperty(description = "number in stock")
    Integer numberInStock

    @ApiProperty(description = "typical behaviour in nature")
    Behaviour naturalBehaviour

    @ApiProperty(description = "typical behaviour in zoos")
    Behaviour captiveBehaviour

    @ApiProperty(description = "Biological classification")
    TaxonSpecies taxonomy

}
