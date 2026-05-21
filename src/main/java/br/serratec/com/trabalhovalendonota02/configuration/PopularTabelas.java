package br.serratec.com.trabalhovalendonota02.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class PopularTabelas implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    public PopularTabelas(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        
        String caminhoVendedores = new ClassPathResource("csv/vendedores.csv").getFile().getAbsolutePath();
        String sqlVendedores = "INSERT INTO vendedor (dtype, nome, email, salario, comissao, cnpj) SELECT dtype, nome, email, salario, NULLIF(comissao, 'NULL'), NULLIF(TRIM(cnpj), 'NULL') FROM CSVREAD('" + caminhoVendedores + "')";
        jdbcTemplate.execute(sqlVendedores);

        String caminhoVendas = new ClassPathResource("csv/vendas.csv").getFile().getAbsolutePath();
        String sqlVendas = "INSERT INTO lancamento_vendas (data, valor, id_vendedor) SELECT data, valor, id_vendedor FROM CSVREAD('" + caminhoVendas + "')";
        jdbcTemplate.execute(sqlVendas);
    }
}
