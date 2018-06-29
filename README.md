# springmvcdemo
## Spring MVC Training


> Continuation from previous basic Spring to MVC APP


[Spring Basic](https://github.com/VinayagamD/springtest.git)

### MVC TUTORIAL

* MVC FLOW:

![MVC ARFCHIETECTURE](https://betterexplained.com/wp-content/uploads/rails/mvc-rails.png)

* Spring MVC FLOW1:

![Spring MVC ARCHIETECTURE](https://i.ytimg.com/vi/qHllF5pl1PA/maxresdefault.jpg)

* Spring MVC FLOW2:

![Spring MVC ARCHIETECTURE](http://3.bp.blogspot.com/-FeuNvZ3F84U/UuTtgkl7dNI/AAAAAAAACIg/gdkn6UqUteM/s1600/rest_web_services_spring_mvc_1.JPG)

> Two More Extra Depenmdency Added
```
<!-- https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/jstl -->
    <dependency>
      <groupId>javax.servlet.jsp.jstl</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
    </dependency>
<!-- https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/jstl-api -->
    <dependency>
      <groupId>javax.servlet.jsp.jstl</groupId>
      <artifactId>jstl-api</artifactId>
      <version>1.2</version>
    </dependency>

```

Spring MVC Setup

* web.xml
```
<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
  <display-name>spring-mvc-demo</display-name>

  <!-- Spring MVC Configs -->

  <!-- Step1: Configure Spring MVC Dispatcher Servlet-->
  <servlet>
    <servlet-name>dispatcher</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>/WEB-INF/spring-mvc-demo-servlet.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>

  <!-- Step2: Set up URL mapping for Spring MVC Dispatcher Servlet-->
  <servlet-mapping>
    <servlet-name>dispatcher</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
</web-app>

```

* Spring Config file **spring-mvc-demo-servlet.xml**

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd">

    <!--  Step3: Add support for component scanning-->
    <context:component-scan base-package="com.vinay.springmvcdemo"/>
    <!-- Step4: Add support for conversion, formatting and  validation support -->
    <mvc:annotation-driven/>

    <!--  Step5: Define Spring MVC view resolver -->
    <bean
        class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
</beans>
```
