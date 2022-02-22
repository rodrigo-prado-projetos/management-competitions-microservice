package br.com.management.competitions.microservice;

import br.com.management.competitions.microservice.util.ConstantsUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = ConstantsUtil.PACKAGE)
@ComponentScan(value = ConstantsUtil.PACKAGE)
public class ManagementCompetitionApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagementCompetitionApplication.class, args);
    }
}