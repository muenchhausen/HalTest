class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
	"/api/pets"(resources:"pet")
        "500"(view:'/error')
    }
}
