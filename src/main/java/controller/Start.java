package controller;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"controller","model","service","repository"})
//注意 需要用注解扫描实体 和mapper
@EntityScan(basePackages={"model"})
@EnableJpaRepositories(basePackages={"repository"})
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}
