package prat.springbootjenkinsrestapi;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsRestApiApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsRestApiApplication.class);

	// init() runs before main()
	@PostConstruct
	public void init() {
		logger.info("SpringBootJenkinsRestApiApplication is starting ...");
	}

	public static void main(String[] args) {
		logger.info("SpringBootJenkinsRestApiApplication is running ...");
		SpringApplication.run(SpringBootJenkinsRestApiApplication.class, args);

	}

}
