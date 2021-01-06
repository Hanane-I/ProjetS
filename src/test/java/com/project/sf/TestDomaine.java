package com.project.sf;

import  static org.mockito.Mockito.when;
import com.project.sf.controller.DomaineController;
import com.project.sf.modele.Domaine;
import com.project.sf.repository.DomaineRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDomaine {
    @MockBean @Autowired private DomaineRepository domaineRepository;
    @Autowired private DomaineController domaineController;

    //get
    public void getDomainesTest(){
        when(domaineController.retrieveAllDomaines()).thenReturn(Stream
        .of(new Domaine(), new Domaine()).collect(Collectors.toList()));
    }


}
