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
import restapidoc.annotations.ApiIgnore
import restapidoc.annotations.ApiProperty

/*
 * This domain sample was chosen, because these fields suit perfectly for the embedded use case.
 * Behaviour does not need to be referenced independently of Pet. This class is simply for structuring
 * the Domain Pet.
 *
 * @author Derk Muenchhausen
 */
@ApiIgnore
@ApiDescription(description = "typical behaviour")
class Behaviour {
    static constraints = {
        source          nullable: false
        foodAndFeeding  nullable: true
        reproduction    nullable: true
    }

    static mapping = {
        version false
    }

    @ApiProperty(description = "Food and Feeding")
    String foodAndFeeding

    @ApiProperty(description = "Reproduction")
    String reproduction

    @ApiProperty(description = "source reference")
    String source

}