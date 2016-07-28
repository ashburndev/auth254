# auth254
a simple Grails plugin created using Grails 2.5.4

## creating the grails 2.5.4 plugin

    ashburndave@dphnuc:~/g2projects$ grails --version
    Grails version: 2.5.4
    ashburndave@dphnuc:~/g2projects$ javac -version
    javac 1.8.0_66
    ashburndave@dphnuc:~/g2projects$ java -version
    java version "1.8.0_66"
    Java(TM) SE Runtime Environment (build 1.8.0_66-b17)
    Java HotSpot(TM) 64-Bit Server VM (build 25.66-b17, mixed mode)
    ashburndave@dphnuc:~/g2projects$ 
    ashburndave@dphnuc:~/g2projects$ grails --non-interactive --plain-output --stacktrace -verbose create-plugin auth254
    Base Directory: /home/ashburndave/g2projects
    |Loading Grails 2.5.4
    |Configuring classpath
    .
    |Environment set to development
    ......    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/src
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/src/java
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/src/groovy
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/controllers
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/services
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/domain
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/taglib
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/utils
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/views
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/views/layouts
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/i18n
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/conf
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/test
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/test/unit
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/test/integration
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/scripts
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/web-app
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/web-app/js
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/web-app/css
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/web-app/images
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/web-app/META-INF
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/lib
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/conf/spring
    .    [mkdir] Created dir: /home/ashburndave/g2projects/auth254/grails-app/conf/hibernate
    ..     [copy] Copying 1 resource to /home/ashburndave/g2projects/auth254
    .    [unjar] Expanding: /home/ashburndave/g2projects/auth254/grails-shared-files.jar into /home/ashburndave/g2projects/auth254
    .   [delete] Deleting: /home/ashburndave/g2projects/auth254/grails-shared-files.jar
    .     [copy] Copying 1 resource to /home/ashburndave/g2projects/auth254
    .    [unjar] Expanding: /home/ashburndave/g2projects/auth254/grails-plugin-files.jar into /home/ashburndave/g2projects/auth254
    .   [delete] Deleting: /home/ashburndave/g2projects/auth254/grails-plugin-files.jar
    .     [copy] Copying 2 files to /home/ashburndave/g2projects/auth254
    ..
    |Created Eclipse project files.
         [move] Moving 1 file to /home/ashburndave/g2projects/auth254
    ..
    |Created plugin Auth254
    ashburndave@dphnuc:~/g2projects$ 
    ashburndave@dphnuc:~/g2projects$ tree auth254/
    auth254/
    ├── application.properties
    ├── Auth254GrailsPlugin.groovy
    ├── grails-app
    │   ├── conf
    │   │   ├── BuildConfig.groovy
    │   │   ├── Config.groovy
    │   │   ├── DataSource.groovy
    │   │   ├── hibernate
    │   │   ├── spring
    │   │   └── UrlMappings.groovy
    │   ├── controllers
    │   ├── domain
    │   ├── i18n
    │   ├── services
    │   ├── taglib
    │   ├── utils
    │   └── views
    │       ├── error.gsp
    │       └── layouts
    ├── lib
    ├── scripts
    │   ├── _Install.groovy
    │   ├── _Uninstall.groovy
    │   └── _Upgrade.groovy
    ├── src
    │   ├── groovy
    │   └── java
    ├── test
    │   ├── integration
    │   └── unit
    └── web-app
        ├── css
        ├── images
        ├── js
        ├── META-INF
        └── WEB-INF
            ├── applicationContext.xml
            ├── sitemesh.xml
            └── tld
                ├── grails.tld
                ├── spring-form.tld
                └── spring.tld
    
    27 directories, 15 files
    ashburndave@dphnuc:~/g2projects$ 
    
## adding an _Events.groovy script to the plugin

When I create an _Events.groovy and define the eventCompileStart closure I am not able to access the application property.
But reading through the Grails documentation suggests that I should be able to do exactly that.

    ashburndave@dphnuc:~/g2projects/auth254$ cat scripts/_Events.groovy
    
    eventCompileStart = { kind ->
      println "***** auth254/scripts/_Events.groovy eventCompileStart"
   
      println "***** kind?.getClass()?.getName() = ${kind?.getClass()?.getName()}"
      println "***** kind = ${kind}"
    
      println "***** application?.getClass()?.getName() = ${application?.getClass()?.getName()}"
      println "***** application = ${application}"
    }
    
    ashburndave@dphnuc:~/g2projects/auth254$ 
    ashburndave@dphnuc:~/g2projects/auth254$ grails --non-interactive --plain-output compile
    |Loading Grails 2.5.4
    |Configuring classpath
    .
    |Environment set to development
    ......***** auth254/scripts/_Events.groovy eventCompileStart
    ***** kind?.getClass()?.getName() = org.codehaus.gant.GantBinding
    ***** kind = org.codehaus.gant.GantBinding@8d8f754
    Error |
    Error executing script Compile: No such property: application for class: _Events (Use --stacktrace to see the full trace)
    ashburndave@dphnuc:~/g2projects/auth254$ 

## attempting to access the grailsApplication from a closure in _Events.groovy

    ashburndave@dphnuc:~/g2projects/auth254$ cat scripts/_Events.groovy 
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
    
    ashburndave@dphnuc:~/g2projects/auth254$ grails --non-interactive --plain-output compile
    |Loading Grails 2.5.4
    |Configuring classpath
    .
    |Environment set to development
    ......***** auth254/scripts/_Events.groovy eventCompileStart
    ***** kind?.getClass()?.getName() = org.codehaus.gant.GantBinding
    ***** kind = org.codehaus.gant.GantBinding@7b27e8f4
    
    ========== properties ==========
    class=class _Events
    binding=org.codehaus.groovy.grails.cli.support.GrailsBuildEventListener$1@6920b0bc
    
    ========== declared fields ==========
    private static org.codehaus.groovy.reflection.ClassInfo _Events.$staticClassInfo
    public static transient boolean _Events.__$stMC
    private static java.lang.ref.SoftReference _Events.$callSiteArray
    
    ========== methods ==========
    public static void _Events.main(java.lang.String[])
    public java.lang.Object _Events.run()
    public java.lang.Object groovy.lang.Script.invokeMethod(java.lang.String,java.lang.Object)
    public groovy.lang.Binding groovy.lang.Script.getBinding()
    public java.lang.Object groovy.lang.Script.evaluate(java.lang.String) throws org.codehaus.groovy.control.CompilationFailedException
    public java.lang.Object groovy.lang.Script.evaluate(java.io.File) throws org.codehaus.groovy.control.CompilationFailedException,java.io.IOException
    public void groovy.lang.Script.setBinding(groovy.lang.Binding)
    public void groovy.lang.Script.println()
    public void groovy.lang.Script.println(java.lang.Object)
    public void groovy.lang.Script.run(java.io.File,java.lang.String[]) throws org.codehaus.groovy.control.CompilationFailedException,java.io.IOException
    public void groovy.lang.Script.setProperty(java.lang.String,java.lang.Object)
    public java.lang.Object groovy.lang.Script.getProperty(java.lang.String)
    public void groovy.lang.Script.print(java.lang.Object)
    public void groovy.lang.Script.printf(java.lang.String,java.lang.Object)
    public void groovy.lang.Script.printf(java.lang.String,java.lang.Object[])
    public groovy.lang.MetaClass groovy.lang.GroovyObjectSupport.getMetaClass()
    public void groovy.lang.GroovyObjectSupport.setMetaClass(groovy.lang.MetaClass)
    public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
    public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
    public final void java.lang.Object.wait() throws java.lang.InterruptedException
    public boolean java.lang.Object.equals(java.lang.Object)
    public java.lang.String java.lang.Object.toString()
    public native int java.lang.Object.hashCode()
    public final native java.lang.Class java.lang.Object.getClass()
    public final native void java.lang.Object.notify()
    public final native void java.lang.Object.notifyAll()
    
    ........ashburndave@dphnuc:~/g2projects/auth254$ 
    ashburndave@dphnuc:~/g2projects/auth254$ 

