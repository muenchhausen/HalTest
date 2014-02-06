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

import grails.rest.render.ContainerRenderer
import grails.rest.render.RenderContext
import grails.util.GrailsNameUtils

import org.codehaus.groovy.grails.web.mime.MimeType

import com.google.gson.stream.JsonWriter

/**
 * A HAL JSON renderer for a collection of objects
 *
 * @author Graeme Rocher
 * @since 2.3
 */
class HalJsonCollectionRenderer extends HalJsonRenderer implements ContainerRenderer {

    final Class componentType
    String collectionName

    HalJsonCollectionRenderer(Class componentType) {
        super(Collection)
        this.componentType = componentType
        this.collectionName = GrailsNameUtils.getPropertyName(componentType)
    }

    HalJsonCollectionRenderer(Class componentType, MimeType... mimeTypes) {
        super(Collection, mimeTypes)
        this.componentType = componentType
        this.collectionName = GrailsNameUtils.getPropertyName(componentType)
    }

    @Override
    protected renderEmbeddedAttributes(JsonWriter writer, object, RenderContext context, MimeType mimeType) {
        writer.beginObject()
        writer.name(collectionName)
        super.renderEmbeddedAttributes writer, object, context, mimeType
        writer.endObject()
    }
}

/**
 * Created by z0024p1y on 05.02.14.
 */
