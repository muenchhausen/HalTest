HalTest
=======

A sample application for GRAILS RESTful Webservice in HAL style. This sample should 
* show a running Grails RestfulController 
* presents latest [HAL][HAL] styles that combine the simplicity of JSON with the simple structure of Hypertext documents
* The documentation is done by [restapidoc plugin][restapidoc plugin] 
* The sample coveres a simplified unrealistic shop of endangered animals
* help to understand if everything is put together (one step further than a hello world sample)
* give basis for further discussions for further requirements for service oriented headless Grails applications

[HAL]: http://stateless.co/hal_specification.html
[restapidoc plugin]: https://github.com/siemens/restapidoc

Getting Started
-----------

This sample includes a Pet domain class, some embedded attributes (Domain Behaviour) and a referenced Domain (TaxonSpecies) to show the biological classification. 

To run it, just
* install Grails >= 2.3.7
* do a git clone on this project
* do a git clone of [restapidoc plugin] - e.g. into the same parent directory as this project
* follow the instructions of [restapidoc plugin]


License
-------

This sample is licensed under the terms of the [Apache License, Version 2.0][Apache License, Version 2.0].
[Apache License, Version 2.0]: http://www.apache.org/licenses/LICENSE-2.0.html

