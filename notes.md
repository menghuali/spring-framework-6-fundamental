Bean Scopes:
* Singleton (default)
* Prototype: new and unique bean per request.
* Only in web-aware Spring projects:
  * Request: bean per each HTTP request.
  * Session: bean per each HTTP session.
  * Global: bean per application

Singleton
* One instance per Spring container

Autowired
* @ComponentScan
* @Bean
* Autowired by name or instance type
* Stereotypes
  * @Component
  * @Repository
  * @Service