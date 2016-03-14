package com.daggerok.scala.spring.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = false)
case class Model(id: Int, content: String)
