# maven-dummy-template-archetype
Maven Archetype template with some examples libraries in pom.xml file. JUnit, Joda-Time, log4j...


1.- Clone proyect
```sh
git clone https://github.com/josemanuelCRV/maven-dummy-template-archetype.git
```

2.- Install dummy-template-archetype to local repository (.m2):
```sh
 mvn install
```

3.- Use the intalled archetype and generate a sample proyect.
``mvn archetype:generate -DarchetypeArtifactId=maven-dummy-template-archetype -DarchetypeGroupId=com.jmc.labs.archetype -DarchetypeVersion=1.0-SNAPSHOT``

Specify the full information about the new project you want to create (its groupId, its artifactId, its version)
```sh
[INFO] Generating project in Interactive mode
Downloading: http://repo.maven.apache.org/maven2/com/jmc/labs/archetype/maven-dummy-template-archetype/1.0-SNAPSHOT/maven-metadata.xml

Define value for property 'groupId': : com.company.name
Define value for property 'artifactId': : dummyProyect
Define value for property 'version':  1.0-SNAPSHOT: :
Define value for property 'package':  com.company.name: :com.company.name.examplepackage
[INFO] Using property: junit-version = 4.10
Define value for property 'library-name': : SampleClassProyect
[INFO] Using property: resource-name = Resource-default
Confirm properties configuration:
groupId: com.company.name
artifactId: dummyProyect
version: 1.0-SNAPSHOT
package: com.company.name.examplepackage
junit-version: 4.10
library-name: SampleClassProyect
resource-name: Resource-default
 Y: : Y
```

 
 
 
