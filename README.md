# maven-dummy-template-archetype
Maven Archetype template with some examples libraries in pom.xml file. JUnit, Joda-Time, log4j...


1.- Clone proyect

``git clone https://github.com/josemanuelCRV/maven-dummy-template-archetype.git``

2.- Install dummy-template-archetype to local repository (.m2):

``mvn install``

3.- Use the intalled archetype and generate a sample proyect.


``mvn archetype:generate -DarchetypeArtifactId=maven-dummy-template-archetype -DarchetypeGroupId=com.jmc.labs.archetype -DarchetypeVersion=1.0-SNAPSHOT``
