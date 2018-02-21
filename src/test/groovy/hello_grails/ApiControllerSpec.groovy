package hello_grails

import grails.converters.JSON
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ApiControllerSpec extends Specification implements ControllerUnitTest<ApiController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test hello"() {

        when: "I call hello"
        def result = controller.hello()

        then: "response with hello world"
        result.toString(true) == new JSON(['response': 'hello world']).toString(true)

        and: "it's a JSON"
        result instanceof JSON
    }
}
