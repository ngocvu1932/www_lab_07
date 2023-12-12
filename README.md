"# www_lab_07" 
	//depen
  	

	//Auto insert data
	implementation 'net.datafaker:datafaker:2.0.2'

	//bootstrap
	implementation 'org.webjars:bootstrap:5.3.2'

	annotationProcessor 'org.projectlombok:lombok'

	runtimeOnly 'com.h2database:h2'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	testImplementation 'org.springframework.security:spring-security-test'

  	implementation 'org.springframework.boot:spring-boot-starter-data-jdbc'
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-security'
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity6'
	implementation 'org.projectlombok:lombok:1.18.28'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
