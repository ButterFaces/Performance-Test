# Performance-Test

A simple performance test using ui:repeat and 18000 ButterFaces input fields. 

## Hint

If using wildfly standalone.xml must modify **max-parameters**

```xml
<subsystem xmlns="urn:jboss:domain:undertow:2.0">
   <buffer-cache name="default"/>
   <server name="default-server">
      <http-listener name="default" socket-binding="http" redirect-socket="https" max-parameters="20000"/>
      <host name="default-host" alias="localhost">
         <location name="/" handler="welcome-content"/>
         <filter-ref name="server-header"/>
         <filter-ref name="x-powered-by-header"/>
      </host>
   </server>
   ...
</subsystem>
```
