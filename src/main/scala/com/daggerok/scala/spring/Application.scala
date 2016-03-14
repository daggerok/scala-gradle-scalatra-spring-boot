package com.daggerok.scala.spring

import com.daggerok.scala.spring.web.AppServlet
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.embedded.ServletRegistrationBean
import org.springframework.context.annotation.Bean

object Application {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[Application], args:_*)
  }
}

@SpringBootApplication
class Application {
  @Bean
  def appServletRegistrationBean(appServlet: AppServlet) = new ServletRegistrationBean(appServlet, "/*")

  @Bean
  def appServlet = new AppServlet()
}
