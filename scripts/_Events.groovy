// def application   // defining application here does not result in dependency injection ... it is just null
def application = grails.util.Holders.getGrailsApplication()

eventConfigureTomcat = { tomcat ->
  println "***** auth254/scripts/_Events.groovy eventConfigureTomcat"
  println "***** tomcat?.getClass()?.getName() = ${tomcat?.getClass()?.getName()}"
  println "***** tomcat = ${tomcat}"
// ***** auth254/scripts/_Events.groovy eventConfigureTomcat
// ***** tomcat?.getClass()?.getName() = org.apache.catalina.startup.Tomcat
// ***** tomcat = org.apache.catalina.startup.Tomcat@1ecee32c

  // Error groovy.lang.MissingPropertyException: No such property: application for class: _Events
  println "***** application?.getClass()?.getName() = ${application?.getClass()?.getName()}"
  println "***** application = ${application}"

  // Error groovy.lang.MissingPropertyException: No such property: grailsApp for class: _Events
  // println "***** grailsApp?.getClass()?.getName() = ${grailsApp?.getClass()?.getName()}"
  // println "***** grailsApp = ${grailsApp}"

  // Error groovy.lang.MissingPropertyException: No such property: serverContextPath for class: _Events
  // println "***** serverContextPath?.getClass()?.getName() = ${serverContextPath?.getClass()?.getName()}"
  // println "***** serverContextPath = ${serverContextPath}"

  // Error groovy.lang.MissingPropertyException: No such property: classLoader for class: _Events
  // println "***** classLoader?.getClass()?.getName() = ${classLoader?.getClass()?.getName()}"
  // println "***** classLoader = ${classLoader}"
}

eventCompileStart = { kind ->
  println "***** auth254/scripts/_Events.groovy eventCompileStart"
  println "***** kind?.getClass()?.getName() = ${kind?.getClass()?.getName()}"
  println "***** kind = ${kind}"
// ***** auth254/scripts/_Events.groovy eventCompileStart
// ***** kind?.getClass()?.getName() = org.codehaus.gant.GantBinding
// ***** kind = org.codehaus.gant.GantBinding@71e7adbb

  //  println "***** application?.getClass()?.getName() = ${application?.getClass()?.getName()}"
  //  println "***** application = ${application}"
  //
  //  println "\n========== properties =========="
  //  this.properties.each {println it}
  //
  //  println "\n========== declared fields =========="
  //  this.class.declaredFields.each {println it}
  //
  //  println "\n========== methods =========="
  //  this.class.methods.each {println it}

  println ""
 
}

