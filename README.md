## conclusion

> clean code and easily reuseable

## bootstrapping using interfaces 

## dependencies

```xml
<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.inject</groupId>
			<artifactId>jersey-hk2</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.containers</groupId>
			<artifactId>jersey-container-servlet</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-server</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-common</artifactId>
			<version>3.0.8</version>
		</dependency>
	</dependencies>
```

## interface 

```java
package com.lavesh.inte;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.ext.Provider;

public interface Schoolx {

	@GET
	@Path("/{schoolname}/{location}/type")
	@Produces("text/plain")
	public String getdata(@QueryParam("division") String divison, @PathParam("schoolname") String schoolname,
			@PathParam("location") String location);
}

```

## implementation ==> oldschool

```java

package com.lavesh.inte;

import java.security.SecureRandom;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/oldschool")
public class OldSchool implements Schoolx {

	@Override
	public String getdata(String divison, String schoolname, String location) {

		return "id : " + new SecureRandom().nextDouble() * 100 + "division : " + divison + " schoolname : " + schoolname
				+ " location : " + location;
	}

}

```

## implementation  => new school

```java
package com.lavesh.inte;

import java.security.SecureRandom;

import jakarta.ws.rs.Path;

@Path("/newschool")
public class Newschool implements Schoolx {

	@Override
	public String getdata(String divison, String schoolname, String location) {
		return "id : " + new SecureRandom().nextDouble() * 100 + "division : " + divison + " schoolname : " + schoolname
				+ " location : " + location;
	}

}

```



## url
```xml
http://localhost:8080/2_workingwithinterface_jaxrs-jersey/api/newschool/xyzschool/mumbai/type?division=c
```
