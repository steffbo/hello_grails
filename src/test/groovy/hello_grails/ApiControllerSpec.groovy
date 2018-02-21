package hello_grails

import grails.testing.web.controllers.ControllerUnitTest
import hello_grails.ApiController
import spock.lang.Specification

class ApiControllerSpec extends Specification implements ControllerUnitTest<ApiController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true
    }
}
