package com.daggerok.scala.spring.web

import com.daggerok.scala.spring.domain.Model
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport

class AppServlet extends ScalatraServlet with JacksonJsonSupport {
  import org.json4s.{DefaultFormats, Formats}

  protected implicit val jsonFormats: Formats = DefaultFormats.withBigDecimal

  get("/api/model") {
    contentType = formats("json")
    List(
      new Model(1, "some content"),
      new Model(2, "another content")
    )
  }

  get("/") {
    contentType = formats("html5")
    <html lang="en">
      <head>
        <meta charset="UTF-8"/>
        <title>Scala web application using Scalatra, Spring Boot and Gradle</title>
      </head>
      <body>
        <div class="container">hello, scalatra (:</div>
      </body>
    </html>
  }
}
