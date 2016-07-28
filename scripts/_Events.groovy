// def application   // defining application here does not result in dependency injection ... it is just null

eventCompileStart = { kind ->
  println "***** auth254/scripts/_Events.groovy eventCompileStart"

  println "***** kind?.getClass()?.getName() = ${kind?.getClass()?.getName()}"
  println "***** kind = ${kind}"

  //  println "***** application?.getClass()?.getName() = ${application?.getClass()?.getName()}"
  //  println "***** application = ${application}"

  println "\n========== properties =========="
  this.properties.each {println it}

  println "\n========== declared fields =========="
  this.class.declaredFields.each {println it}

  println "\n========== methods =========="
  this.class.methods.each {println it}

  println ""
 
}

