package com.chengin.web

import org.scalatra._
import scalate.ScalateSupport

class HelloWorld extends ScalatraServlet with ScalateSupport {
    before {
        contentType = "text/html"
    }

    get("/") {
        templateEngine.layout("/WEB-INF/index.scaml", Map("content" -> "Hello World"))
    }

    protected def contextPath = request.getContextPath
}
