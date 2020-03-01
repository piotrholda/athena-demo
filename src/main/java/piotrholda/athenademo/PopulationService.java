package piotrholda.athenademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class PopulationService {

    @Autowired
    private PopulationRepository populationRepository;

    @PostConstruct
    public void test() {
        List<Population> list = populationRepository.findAll();
        list.forEach(System.out::println);
    }
}
