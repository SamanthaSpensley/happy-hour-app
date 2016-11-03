# Notes to self


##Java
##### [@RequestBody](http://www.techzoo.org/spring-framework/spring-mvc-requestbody-json-example.html) can be used to convert incoming Json request to Model object.

You just need to add @RequestBody annotation with your controller method and Spring will automatically convert all incoming Json request [application/json) into Model object defined in controller method. Optionally we can use @Valid or @Validate annotation to invoke automatic validation

* create a class which implements an interface > Controller configuration class > Request and Response Body Class



## Angular
* [How/When to use ng-click to call a route](http://stackoverflow.com/questions/14201753/angular-js-how-when-to-use-ng-click-to-call-a-route)

``$routeProvider.when['/home', {
        templateUrl: 'partials/home.html',
        controller: 'HomeCtrl'
    });`

##### [$routeProvider](https://docs.angularjs.org/api/ngRoute/provider/$routeProvider) configures routes, requires the ngRoute module to be installed. Methods: when[path, route); Adds a new route definition to $route service

##### Routes monitor the $location service and respond to changes in URL

#####  The [ngResource](https://docs.angularjs.org/api/ngResource) module provides interaction support with RESTful services via the [$resource](https://docs.angularjs.org/api/ngResource/service/$resource) service. 

The $resource service is a factory which creates a resource object that lets you interact with RESTful server-side data sources. The returned resource object has action methods which provide high-level behaviors without the need to interact with the low level $http service.

#####  Use [$resourceProvider](https://docs.angularjs.org/api/ngResource/provider/$resourceProvider) to change the default behavior of the $resource service. 

* you can specify a new update action that uses the PUT HTTP verb. 

* you can even overwrite the whole actions list and specify your own


##### [Deploying Springs Apps w Cloud Foundry](https://docs.cloudfoundry.org/buildpacks/java/gsg-spring.html)
   
* add some dependencies to pom.xml
* [Installing Cloud Foundry CLI](https://docs.cloudfoundry.org/cf-cli/install-go-cli.html#mac)
* [Cloud Foundry CLI Getting Started](https://github.com/cloudfoundry/cli#downloads)
* `brew tap cloudfoundry/tap`
* `brew install cf-cli`
* Sign up for Pivotal Web Services
* [Log in to Cloud Foundry CLI](http://docs.run.pivotal.io/cf-cli/getting-started.html) `cf login [-a API_URL] [-u USERNAME] [-p PASSWORD] [-o ORG] [-s SPACE]`
* `cf push HappyHour  -m 128M`
* "ERR npm ERR! argv "/home/vcap/app/.heroku/node/bin/node" "/home/vcap/app/.heroku/node/bin/npm" "start"" missing script: start
* added `"start": "node"` to package.json `cf push HappyHour  -m 128M` "Build Succeeded"

                                                                                                                                                               





