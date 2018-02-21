package hello_grails

import grails.converters.JSON

class ApiController {

    def myResponse = ['response': 'hello world']

    def hello() {
        log.debug("printing ${myResponse} as response")
        def json = myResponse as JSON
        json.prettyPrint = true
        render json
        json
    }
}
