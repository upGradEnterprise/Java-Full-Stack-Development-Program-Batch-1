package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringFormatterController {

    // http://localhost:8080/text

    @RequestMapping(value = "text",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayPlainText() {
        return "<h2>Welcome to Rest API <h2>";
    }

    // http://localhost:8080/html

    @RequestMapping(value = "html",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
    public String sayHtml() {
        return "<h2>Welcome to Rest API </h2>";
    }

    // http://localhost:8080/xml

    @RequestMapping(value = "xml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
    public String sayXml() {
        return "<abc>Welcome to Rest API </abc>";
    }
}
