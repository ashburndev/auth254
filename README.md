# auth254
a simple Grails plugin created using Grails 2.5.4


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
    

