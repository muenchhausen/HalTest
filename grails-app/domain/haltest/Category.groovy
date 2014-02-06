/*
 * Copyright 2012 the original author or authors.
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

class Category {
    static transients = ['attached']

    String name

    @Override
    String toString() {
        name
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

        Category category = (Category) o

        if (name != category.name) {
            return false
        }

        return true
    }

    int hashCode() {
        return name.hashCode()
    }
}
