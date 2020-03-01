package piotrholda.athenademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PopulationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Population> findAll() {
        return jdbcTemplate.query(
                "SELECT * FROM testdatabase.population limit 10",
                (rs, rowNum) ->
                        new Population(rs.getInt("locid"),
                                rs.getString("location"),
                                rs.getInt("time"),
                                rs.getString("agegrp"),
                                rs.getString("agegrpstart"),
                                rs.getString("agegrpspan"),
                                rs.getInt("popmale"),
                                rs.getInt("popfemale"),
                                rs.getInt("poptotal"))
        );

    }
}
