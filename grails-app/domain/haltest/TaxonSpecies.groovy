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
 * This domain sample was chosen, because people know biological classification from school. Anyhow, this also
 * requires explanations because for most guys school is some years ago. Additionally taxonomy is well suitable
 * for designing more complex samples.
 *
 * @author Derk Muenchhausen
 */
@ApiDescription(description = "Simplified Taxonomy classification.")
class TaxonSpecies implements Serializable {

    static mapping = {
        version false
        id composite: ['name']
        order column: 'torder'
    }

    @ApiProperty(description = "Linnaeus used kingdom as the top rank, dividing the physical world into the plant, animal and mineral kingdoms.")
    String kingdom

    // todo: name class would be more nice than tclass
    @ApiProperty(description = "taxonomic rank fitting between phylum and order")
    String tclass

    @ApiProperty(description = "Linnaean orders, see http://en.wikipedia.org/wiki/Order_(biology)")
    String order

    @ApiProperty(description = "Families can be used for evolutionary, palaeontological and generic studies.")
    String family

    @ApiProperty(description = "The scientific name of a genus may be called the generic name or generic epithet.")
    String genus

    @ApiProperty(description = "A species is often described as the largest group of organisms capable of interbreeding and producing fertile offspring.")
    String name

    @Override
    String toString() {
        return name
    }

    /*
     * We need these defined for when we're checking if objects are actually written (since we're checking our
     * set 'writtenObjects' if something's there already)
     */
    boolean equals(o) {
        if (this.is(o)) {
            return true
        }
        if (getClass() != o.class) {
            return false
        }

        TaxonSpecies t = (TaxonSpecies) o

        if (name != t.name) {
            return false
        }

        return true
    }

    int hashCode() {
        return name.hashCode()
    }
}
