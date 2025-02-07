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

# Adcanced Bean Configuration
Bean lifecycle
1. Instantiation
2. Populate properties
3. BeanNameAware
4. BeanFactoryAware
5. Pre initialization - BeanPostProcessors
6. InitializeBean
7. initMethod
8. Post initialization - BeanPostProcessors

## BeanPostProcessor
@PostConstruct

## FactoryBean


SpEL

Proxies

Profiles<br>
* Adapt environments
* Runtime configuration
